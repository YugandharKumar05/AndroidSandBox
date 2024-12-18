package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar

@Composable
fun FullScreenLoadingIndicator(navController: NavHostController) {
    var loading by remember { mutableStateOf(true) }

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Loading Indicator")
        }
    ) { paddingValues ->
        Box(modifier = Modifier.fillMaxSize().padding(paddingValues)) {
            if (loading) {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            } else {
                Text("Content Loaded", modifier = Modifier.align(Alignment.Center))
            }
            Button(onClick = { loading = !loading }, modifier = Modifier.align(Alignment.BottomCenter)) {
                Text("Toggle Loading")
            }
        }
    }
}
