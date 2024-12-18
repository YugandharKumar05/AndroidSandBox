package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import kotlin.math.roundToInt
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar

@Composable
fun SwipeToDeleteScreen(navController: NavHostController) {
    val items = remember { mutableStateListOf("Item 1", "Item 2", "Item 3") }

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Swipe to Delete")
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier.padding(paddingValues)
        ) {
            items(items) { item ->
                SwipeToDeleteItem(
                    item = item,
                    onDismissed = { items.remove(item) }
                )
            }
        }
    }
}

@Composable
fun SwipeToDeleteItem(
    item: String,
    onDismissed: () -> Unit
) {
    var offsetX by remember { mutableFloatStateOf(0f) }
    var isSwiping by remember { mutableStateOf(false) }

    val backgroundColor = when {
        offsetX < 0 -> Color.Gray
        else -> Color.White
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(backgroundColor)
            .pointerInput(Unit) {
                detectDragGestures(
                    onDragStart = {
                        isSwiping = true
                    },
                    onDragEnd = {
                         if (offsetX < -200) {
                            onDismissed()
                        }
                         offsetX = 0f
                        isSwiping = false
                    },
                    onDrag = { change, dragAmount ->
                        change.consume()
                        if (isSwiping) {
                            offsetX += dragAmount.x
                             offsetX = offsetX.coerceIn(-300f, 300f)
                        }
                    }
                )
            }
    ) {
        Text(
            text = item,
            modifier = Modifier
                .offset { IntOffset(offsetX.roundToInt(), 0) }
                .padding(16.dp)
        )
    }
}
