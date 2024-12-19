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
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar

@Composable
fun OnboardingScreen(navController: NavHostController) {
    val currentPage = remember { mutableStateOf(0) }
    val onboardingScreens = listOf("Welcome", "Feature 1", "Feature 2")

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Onboarding")
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(onboardingScreens[currentPage.value])
            Row {
                Button(onClick = { if (currentPage.value > 0) currentPage.value-- }) {
                    Text("Previous")
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(onClick = { if (currentPage.value < onboardingScreens.size - 1) currentPage.value++ }) {
                    Text("Next")
                }
            }
        }
    }
}
