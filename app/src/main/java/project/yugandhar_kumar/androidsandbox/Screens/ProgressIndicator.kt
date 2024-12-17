package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar
import project.yugandhar_kumar.androidsandbox.Screens.Comps.ReusableButton

@Composable
fun ProgressIndicatorScreen(navController: NavHostController) {
    var isLoading by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Progress Indicator")
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ReusableButton(
                buttonText = if (isLoading) "Stop Loading" else "Start Loading",
                onClick = { isLoading = !isLoading }
            )

            Spacer(modifier = Modifier.height(16.dp))

            if (isLoading) {
                CircularProgressIndicator() // Circular Progress
                Spacer(modifier = Modifier.height(16.dp))
                LinearProgressIndicator() // Linear Progress
            }
        }
    }
}
