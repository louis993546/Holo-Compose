package com.louis993546.holo.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.louis993546.holo.HoloTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HoloTheme {
                Device {
                    Launcher()
                }
            }
        }
    }
}

@Composable
fun HoloText(
    modifier: Modifier = Modifier,
    text: String,
) {
    BasicText(
        text = text,
        style = TextStyle.Default.copy(color = Color.LightGray),
        modifier = modifier,
    )
}

@Composable
fun Device(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit,
) {
    Column(modifier = modifier) {
        StatusBar()
        Box(modifier = Modifier.weight(1f), content = content)
        NavigationBar()
    }
}

@Composable
fun StatusBar(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color.Black),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        HoloText(text = "5:17")
    }
}

@Composable
fun NavigationBar(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color.Black),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        HoloText(text = "Back")
        HoloText(text = "Home")
        HoloText(text = "Tasks")
    }
}

@Composable
fun Launcher(
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HoloTheme {

    }
}