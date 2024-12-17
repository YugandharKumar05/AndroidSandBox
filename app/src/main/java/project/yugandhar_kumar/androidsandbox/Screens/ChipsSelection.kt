package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.wear.compose.material.Chip
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar

@Composable
fun ChipsSelectionScreen(navController: NavHostController) {
    val selectedItems = remember { mutableStateListOf<String>() }
    val chips = listOf("Chip 1", "Chip 2", "Chip 3")

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Chips Selection")
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                itemsIndexed(chips) { _, chip ->
                    Chip(
                        label = { Text(chip) },
                        onClick = {
                            if (selectedItems.contains(chip)) {
                                selectedItems.remove(chip)
                            } else {
                                selectedItems.add(chip)
                            }
                        }
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text("Selected: ${selectedItems.joinToString()}")
        }
    }
}

