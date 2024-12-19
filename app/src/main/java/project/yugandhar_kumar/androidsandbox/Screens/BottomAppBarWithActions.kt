package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar

@Composable
fun BottomAppBarWithActionsScreen(navController: NavHostController) {
    Scaffold(topBar = {
        CustomTopAppBar(navController, "Bottom App Bar")
    }, bottomBar = {
        BottomAppBar {
            IconButton(
                onClick = { /* Handle action 1 */ }
            ) {
                Icon(Icons.Default.Home, contentDescription = null)
            }
            Spacer(modifier = Modifier.weight(1f))
            IconButton(
                onClick = { /* Handle action 2 */ }
            ) {
                Icon(Icons.Default.Search, contentDescription = null)
            }
        }
    }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Bottom App Bar with Actions")
        }
    }
}
