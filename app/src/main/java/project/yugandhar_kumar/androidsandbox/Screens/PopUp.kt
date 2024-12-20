package project.yugandhar_kumar.androidsandbox.Screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Popup
import androidx.navigation.NavHostController
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar
import project.yugandhar_kumar.androidsandbox.Screens.Comps.GitHubLoginButton
import project.yugandhar_kumar.androidsandbox.Screens.Comps.ReusableButton

@Composable
fun PopupScreen(navController: NavHostController) {
    var showPopup by remember { mutableStateOf(false) }

    val context = LocalContext.current
    val url = "https://github.com/YugandharKumar05/AndroidSandBox/blob/master/app/src/main/java/project/yugandhar_kumar/androidsandbox/Screens/PopUp.kt"
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Popup Message")
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
                verticalArrangement = Arrangement.Center
            ) {
                ReusableButton(
                    buttonText = "Show Popup",
                    onClick = { showPopup = true }
                )
                Spacer(Modifier.height(10.dp))

                GitHubLoginButton(onClick = {
                    context.startActivity(intent)
                })
            }

            if (showPopup) {
                Popup(
                    onDismissRequest = { showPopup = false }
                ) {
                    Box(
                        modifier = Modifier
                            .size(200.dp)
                            .background(Color.White, shape = RoundedCornerShape(8.dp))
                            .border(1.dp, Color.Gray, RoundedCornerShape(8.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("This is a Popup!", fontSize = 18.sp)
                            Spacer(modifier = Modifier.height(8.dp))
                            Button(onClick = { showPopup = false }) {
                                Text("Dismiss")
                            }
                        }
                    }
                }
            }
        }
    }
}
