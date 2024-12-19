package project.yugandhar_kumar.androidsandbox.Screens

import android.widget.RatingBar
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar
import project.yugandhar_kumar.androidsandbox.Screens.Comps.RatingBar

@Composable
fun RatingReviewScreen(navController: NavHostController) {
    var rating by remember { mutableFloatStateOf(0f) }
    var review by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Rating & Review")
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            RatingBar(rating = rating, onRatingChanged = { rating = it })
            Spacer(modifier = Modifier.height(16.dp))
            TextField(
                value = review,
                onValueChange = { review = it },
                label = { Text("Write a Review") }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { /* Submit review */ }) {
                Text("Submit Review")
            }
        }
    }
}
