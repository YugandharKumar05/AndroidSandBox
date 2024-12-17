package project.yugandhar_kumar.androidsandbox.Screens.Comps

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ReusableButton(
    modifier: Modifier = Modifier,
    buttonText: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        onClick = onClick,
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(text = buttonText, fontSize = 16.sp, textAlign = TextAlign.Center)
    }
}
