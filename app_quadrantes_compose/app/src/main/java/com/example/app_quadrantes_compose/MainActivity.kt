package com.example.app_quadrantes_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app_quadrantes_compose.ui.theme.App_quadrantes_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App_quadrantes_composeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    CompleteBoxWindow(
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
fun CompleteBoxWindow(modifier: Modifier = Modifier) {

    val colorBox1 = colorResource(R.color.lilas)
    val titleBox1 = stringResource(R.string.box_1_title)
    val textBox1 = stringResource(R.string.box_1_text)

    val colorBox2 = colorResource(R.color.roxo_claro)
    val titleBox2 = stringResource(R.string.box_2_title)
    val textBox2 = stringResource(R.string.box_2_text)

    val colorBox3 = colorResource(R.color.roxo)
    val titleBox3 = stringResource(R.string.box_3_title)
    val textBox3 = stringResource(R.string.box_3_text)

    val colorBox4 = colorResource(R.color.lilas_claro)
    val titleBox4 = stringResource(R.string.box_4_title)
    val textBox4 = stringResource(R.string.box_4_text)

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
    ){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.weight(1f)
        ) {
            BoxText(titleBox1, textBox1, colorBox1, Modifier.weight(1f))
            BoxText(titleBox2, textBox2, colorBox2, Modifier.weight(1f))
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.weight(1f)
        ) {
            BoxText(titleBox3, textBox3, colorBox3, Modifier.weight(1f))
            BoxText(titleBox4, textBox4, colorBox4, Modifier.weight(1f))
        }
    }
}

@Composable
fun BoxText(title: String, text: String, color: Color, modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(color)
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = text,
            textAlign = TextAlign.Justify,
            modifier = Modifier
        )
    }
}

@Preview
@Composable
fun Box1Preview(){
    App_quadrantes_composeTheme() {
        CompleteBoxWindow(modifier = Modifier.fillMaxSize())
    }
}
