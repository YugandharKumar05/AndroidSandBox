package project.yugandhar_kumar.androidsandbox.Screens.Comps

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.MaterialTheme
import project.yugandhar_kumar.androidsandbox.R

@Composable
fun GitHubLoginButton(onClick: () -> Unit) {
    val buttonColors = ButtonDefaults.buttonColors(
        containerColor = Color.Black,
        contentColor = Color.White
    )


    Button(
        onClick = onClick,
        colors = buttonColors,
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.github),
            contentDescription = null,
            modifier = Modifier.wrapContentSize()
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "Click here for source code", style = MaterialTheme.typography.button)
    }
}


@Preview(showBackground = true)
@Composable
fun GitHubLoginButtonPreview() {
    GitHubLoginButton(onClick = { /* Handle Click */ })
}
