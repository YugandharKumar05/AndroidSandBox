package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar
import project.yugandhar_kumar.androidsandbox.Screens.Comps.ReusableButton

@Composable
fun DropdownMenuScreen(navController: NavHostController) {
    var expanded by remember { mutableStateOf(false) }
    val items = listOf("Option 1", "Option 2", "Option 3")
    var selectedOption by remember { mutableStateOf<String?>(null) }

    Scaffold(
        topBar = {
            CustomTopAppBar(
                navController, "Dropdown Menu"
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Selected: ${selectedOption ?: "None"}",
                    fontSize = 16.sp
                )
                ReusableButton(
                    buttonText = "Show Dropdown Menu",
                    onClick = { expanded = true }
                )

                Box(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false },
                        modifier = Modifier.offset(y = 8.dp)
                    ) {
                        items.forEach { item ->
                            DropdownMenuItem(
                                text = {
                                    Text(
                                        text = item,
                                        color = if (selectedOption == item) Color(0xFFFFA500) else Color.Unspecified
                                    )
                                },
                                onClick = {
                                    selectedOption = item
                                    expanded = false
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}

