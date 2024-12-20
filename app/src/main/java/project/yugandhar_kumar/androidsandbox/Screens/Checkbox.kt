package project.yugandhar_kumar.androidsandbox.Screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar
import project.yugandhar_kumar.androidsandbox.Screens.Comps.GitHubLoginButton

@Composable
fun CheckboxScreen(navController: NavHostController) {
    val checkboxItems = listOf("Item 1", "Item 2", "Item 3")
    val checkboxStates = remember { checkboxItems.map { mutableStateOf(false) } }

    val context = LocalContext.current
    val url = "https://github.com/YugandharKumar05/AndroidSandBox/blob/master/app/src/main/java/project/yugandhar_kumar/androidsandbox/Screens/Checkbox.kt"
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Checkbox Screen")
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Select items:",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            checkboxItems.forEachIndexed { index, item ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { checkboxStates[index].value = !checkboxStates[index].value }
                ) {
                    Checkbox(
                        checked = checkboxStates[index].value,
                        onCheckedChange = { isChecked ->
                            checkboxStates[index].value = isChecked
                        }
                    )
                    Text(
                        text = item,
                        fontSize = 16.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Selected Items: ${
                    checkboxItems.filterIndexed { index, _ -> checkboxStates[index].value }
                        .joinToString(", ")
                }",
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(10.dp))
            GitHubLoginButton(onClick = {
                context.startActivity(intent)
            })
        }
    }
}
