package com.example.laboratory7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratory7.ui.theme.Laboratory7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratory7Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background){
                    Home(name = "", cornerRadius = 5.dp)
                }
            }
        }
    }

@Composable
fun Home(name: String, modifier: Modifier = Modifier, cornerRadius: Dp) {
    Column{
        Text(
            text = "Bienvenida",
            style = TextStyle(fontSize = 13.sp),
            modifier = modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.TopStart)
                .padding(60.dp)
        )
    }

    Box(
        modifier = modifier
            .size(35.dp)
            .offset(x = 20.dp, y = 58.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.usuario),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape)
        )
    }
    Text(
        text = "Paula Hong",
        fontWeight = FontWeight.Bold,
        style = TextStyle(fontSize = 17.sp),
        modifier = modifier
            .offset(x = 13.dp, y = 28.dp)
            .padding(50.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    Laboratory7Theme {
        Home("home", cornerRadius = 16.dp)

    }
}}

