package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
fun AccordionListScreen(navController: NavHostController) {
    var expanded by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Accordion List")
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Text("Accordion Header", modifier = Modifier.clickable { expanded = !expanded })
            if (expanded) {
                Text("Accordion Content")
            }
        }
    }
}
