package com.example.app_learn_together_codelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app_learn_together_codelab.ui.theme.App_learn_together_codelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App_learn_together_codelabTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ArticlePage(
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun ArticlePage(modifier: Modifier = Modifier){

    Column(
        modifier = modifier
    ){
        ImageOpen()
            Tittle()
            FirstText()
            SecondText()

        }
}

@Composable
fun ImageOpen(modifier: Modifier = Modifier){

    val image = painterResource(R.drawable.bg_compose_background)

    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillWidth,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun Tittle(modifier: Modifier = Modifier){

    val tittle = stringResource(R.string.tittle)

    Text(
        text = tittle,
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
}
@Composable
fun FirstText(modifier:Modifier = Modifier){

    val firstText = stringResource(R.string.first_text)

    Text(
        text = firstText,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
    )
}

@Composable
fun SecondText(modifier: Modifier = Modifier){

    val secondText = stringResource(R.string.second_text)

    Text(
        text = secondText,
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ArticlePagePreview() {
    App_learn_together_codelabTheme {
        ArticlePage(Modifier.fillMaxSize())
    }
}