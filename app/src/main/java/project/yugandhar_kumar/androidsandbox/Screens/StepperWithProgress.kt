package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
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

@Composable
fun StepperWithProgress(navController: NavHostController) {
    var currentStep by remember { mutableStateOf(0) }
    val steps = listOf("Step 1", "Step 2", "Step 3", "Step 4")

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Stepper with Progress")
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Current Step: ${steps[currentStep]}")
            Spacer(modifier = Modifier.height(16.dp))
            LinearProgressIndicator(
                progress = (currentStep + 1) / steps.size.toFloat(),
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Button(
                    onClick = { if (currentStep > 0) currentStep-- },
                    enabled = currentStep > 0
                ) {
                    Text("Previous")
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(
                    onClick = { if (currentStep < steps.size - 1) currentStep++ },
                    enabled = currentStep < steps.size - 1
                ) {
                    Text("Next")
                }
            }
        }
    }
}
