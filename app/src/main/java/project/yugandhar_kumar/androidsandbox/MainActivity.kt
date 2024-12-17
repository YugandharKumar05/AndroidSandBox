package project.yugandhar_kumar.androidsandbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import project.yugandhar_kumar.androidsandbox.ui.theme.AndroidSandBoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidSandBoxTheme {
                val navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}