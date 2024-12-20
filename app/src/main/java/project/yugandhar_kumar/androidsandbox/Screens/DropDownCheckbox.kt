package project.yugandhar_kumar.androidsandbox.Screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar
import project.yugandhar_kumar.androidsandbox.Screens.Comps.GitHubLoginButton
import project.yugandhar_kumar.androidsandbox.Screens.Comps.ReusableButton

@Composable
fun DropDownCheckboxScreen(navController: NavHostController) {
    val items = listOf("Option 1", "Option 2", "Option 3", "Option 4")
    val selectedItems = remember { mutableStateListOf<String>() }
    var expanded by remember { mutableStateOf(false) }

    val context = LocalContext.current
    val url = "https://github.com/YugandharKumar05/AndroidSandBox/blob/master/app/src/main/java/project/yugandhar_kumar/androidsandbox/Screens/DropDownCheckbox.kt"
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Dropdown with Checkboxes")
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                Spacer(modifier = Modifier.height(10.dp))

                GitHubLoginButton(onClick = {
                    context.startActivity(intent)
                })
                Text(
                    text = "Selected: ${selectedItems.joinToString(", ").ifEmpty { "None" }}",
                    fontSize = 16.sp
                )

                ReusableButton(
                    buttonText = "Show Dropdown",
                    onClick = { expanded = true }
                )

                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false },
                    modifier = Modifier.width(200.dp)
                ) {
                    items.forEach { item ->
                        DropdownMenuItem(
                            text = {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Checkbox(
                                        checked = selectedItems.contains(item),
                                        onCheckedChange = { isChecked ->
                                            if (isChecked) selectedItems.add(item)
                                            else selectedItems.remove(item)
                                        }
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(text = item)
                                }
                            },
                            onClick = {
                                val isChecked = selectedItems.contains(item)
                                if (isChecked) selectedItems.remove(item)
                                else selectedItems.add(item)
                            }
                        )
                    }
                }
            }
        }
    }
}
