package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar

@Composable
fun FabMenuScreen(navController: NavHostController) {
    var expanded by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "FAB with Menu")
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                content = { Text("Menu") },
                onClick = { expanded = !expanded }
            )
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            if (expanded) {
                Column {
                    Button(onClick = { /* Action 1 */ }) { Text("Action 1") }
                    Button(onClick = { /* Action 2 */ }) { Text("Action 2") }
                }
            }
        }
    }
}
