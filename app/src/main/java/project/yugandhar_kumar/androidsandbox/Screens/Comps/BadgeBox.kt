package project.yugandhar_kumar.androidsandbox.Screens.Comps

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BadgeBox(badgeContent: @Composable () -> Unit, content: @Composable () -> Unit) {
    Box {
        content()
        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(4.dp)
        ) {
            badgeContent()
        }
    }
}
