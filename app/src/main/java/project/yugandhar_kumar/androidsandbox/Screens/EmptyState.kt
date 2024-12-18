package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar

@Composable
fun EmptyStateScreen(navController: NavHostController) {
    val items = remember { mutableStateListOf<String>() }

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Empty State View")
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            if (items.isEmpty()) {
                Text("No items to display", style = MaterialTheme.typography.displayMedium)
                Button(onClick = { items.add("New Item") }) {
                    Text("Add Item")
                }
            } else {
                LazyColumn {
                    items(items) { item ->
                        Text(item)
                    }
                }
            }
        }
    }
}
