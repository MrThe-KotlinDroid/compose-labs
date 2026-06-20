package com.abrar.labsapp.ui.codelabs

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abrar.labsapp.ui.theme.LabsAppTheme

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.White) {
        Text(
            text = "Hi, my name is $name!",
            modifier = modifier.padding(24.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LabsAppTheme {
        Greeting("Abrar")
    }
}