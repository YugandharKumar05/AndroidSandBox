package project.yugandhar_kumar.androidsandbox.Screens.Comps

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RatingBar(rating: Float, onRatingChanged: (Float) -> Unit) {
    val maxRating = 5
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        for (i in 1..maxRating) {
            if (i <= rating) {
                 Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = null,
                    modifier = Modifier
                        .size(32.dp)
                        .clickable { onRatingChanged(i.toFloat()) },
                    tint = Color(0xFFFF9800)
                )
            } else {
                 Box(
                    modifier = Modifier
                        .size(32.dp)
                        .wrapContentSize()
                        .clickable { onRatingChanged(i.toFloat()) }
                ) {
                    Icon(
                        imageVector = Icons.Outlined.StarOutline,
                        contentDescription = null,
                        modifier = Modifier.size(32.dp),
                        tint = Color.Black
                    )
                }
            }
        }
    }
}
