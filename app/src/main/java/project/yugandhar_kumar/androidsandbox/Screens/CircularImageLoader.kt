package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Error
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.SubcomposeAsyncImage
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar

@Composable
fun CircularImageLoaderScreen(navController: NavHostController) {
    val imageUrl = "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png"

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Circular Image Loader")
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            SubcomposeAsyncImage(
                model = imageUrl,
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(Color.Gray),
                loading = {
                    CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                },
                error = {
                    Icon(
                        imageVector = Icons.Default.Error,
                        contentDescription = "Error loading image",
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            )
        }
    }
}
