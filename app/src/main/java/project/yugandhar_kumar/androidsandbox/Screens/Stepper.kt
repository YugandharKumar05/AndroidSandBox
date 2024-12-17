package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar

@Composable
fun StepperScreen(navController: NavHostController) {
    var currentStep by remember { mutableIntStateOf(0) }
    val steps = listOf("Step 0", "Step 1", "Step 2", "Step 3", "Step 4")

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Stepper")
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Current Step: ${steps[currentStep]}")
            Row {
                Button(onClick = { if (currentStep > 0) currentStep-- }) {
                    Text("Previous")
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(onClick = { if (currentStep < steps.size - 1) currentStep++ }) {
                    Text("Next")
                }
            }
        }
    }
}
