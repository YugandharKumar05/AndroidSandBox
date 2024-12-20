package project.yugandhar_kumar.androidsandbox.Screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetScreen(navController: NavHostController) {
    val bottomSheetState = rememberModalBottomSheetState()
    var showBottomSheet by remember { mutableStateOf(false) }

    val context = LocalContext.current
    val url = "https://github.com/YugandharKumar05/AndroidSandBox/blob/master/app/src/main/java/project/yugandhar_kumar/androidsandbox/Screens/BottomSheet.kt"
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Bottom Sheet")
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
                buttonText = "Show Bottom Sheet",
                onClick = { showBottomSheet = true }
            )
            Spacer(Modifier.height(10.dp))
            GitHubLoginButton(onClick = {
                context.startActivity(intent)
            })
        }
    }

    if (showBottomSheet) {
        ModalBottomSheet(
            onDismissRequest = { showBottomSheet = false },
            sheetState = bottomSheetState
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("This is a Bottom Sheet!", fontSize = 18.sp)
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = { showBottomSheet = false }) {
                    Text("Dismiss")
                }
            }
        }
    }
}
