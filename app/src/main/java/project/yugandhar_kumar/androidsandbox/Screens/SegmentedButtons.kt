package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
fun SegmentedButtonsScreen(navController: NavHostController) {
    var selectedOption by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Segmented Buttons")
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row {
                Button(
                    onClick = { selectedOption = 0 },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (selectedOption == 0) Color.Gray else Color.White
                    )
                ) {
                    Text("Option 1")
                }

                Spacer(modifier = Modifier.width(16.dp))
                Button(
                    onClick = { selectedOption = 1 },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (selectedOption == 0) Color.Gray else Color.White
                    )                ) {
                    Text("Option 2")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text("Selected: Option ${selectedOption + 1}")
        }
    }
}
