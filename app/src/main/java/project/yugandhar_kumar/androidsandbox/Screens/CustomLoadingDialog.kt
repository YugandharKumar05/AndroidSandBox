package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar

@Composable
fun CustomLoadingDialogScreen(navController: NavHostController) {
    var isLoading by remember { mutableStateOf(true) }

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Custom Loading Dialog")
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
        ) {
            if (isLoading) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.5f)),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(modifier = Modifier.size(60.dp))
                }
            }
            Button(onClick = { isLoading = !isLoading }, modifier = Modifier.align(Alignment.Center)) {
                Text(if (isLoading) "Hide Loading" else "Show Loading")
            }
        }
    }
}
