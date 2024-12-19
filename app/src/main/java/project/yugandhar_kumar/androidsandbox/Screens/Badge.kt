package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import project.yugandhar_kumar.androidsandbox.Screens.Comps.BadgeBox
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar

@Composable
fun BadgeScreen(navController: NavHostController) {
    var count by remember { mutableIntStateOf(5) }

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Badge Component")
        }
    ) { paddingValues ->
        Box(modifier = Modifier.fillMaxSize().padding(paddingValues)) {
            Button(onClick = { count++ }) {
                Text("Increment Count")
            }
            if (count > 0) {
                BadgeBox(badgeContent = { Text(count.toString()) }) {
                    Icon(Icons.Default.Notifications, contentDescription = null)
                }
            }
        }
    }
}
