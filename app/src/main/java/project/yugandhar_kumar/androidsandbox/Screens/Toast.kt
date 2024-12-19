package project.yugandhar_kumar.androidsandbox.Screens

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import kotlinx.coroutines.launch
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar
import project.yugandhar_kumar.androidsandbox.Screens.Comps.GitHubLoginButton
import project.yugandhar_kumar.androidsandbox.Screens.Comps.ReusableButton

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ToastMessageScreen(navController: NavHostController) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Toast Message")
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ReusableButton(
                buttonText = "Show Toast",
                onClick = {
                    coroutineScope.launch {
                        Toast.makeText(context, "Toast clicked", Toast.LENGTH_SHORT).show()
                    }
                }
            )
            Spacer(Modifier.height(10.dp))
            GitHubLoginButton(onClick = { /* Handle Click */ })
        }
    }
}