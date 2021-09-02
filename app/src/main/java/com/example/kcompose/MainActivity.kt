package com.example.kcompose

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.kcompose.network.RecipeService
import com.google.gson.GsonBuilder
import com.google.gson.internal.GsonBuildConfig
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    @ExperimentalUnitApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = Retrofit
            .Builder()
            .baseUrl("https://food2fork.ca/api/recipe/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(RecipeService::class.java)



            CoroutineScope(IO).launch {
                val response=service.get(token="Token 9c8b06d329136da358c2d00e76946b0111ce2c48",

                    id=583)

                Log.d("respnse","${response.title}")
            }






//        supportFragmentManager.beginTransaction()
//            .replace(R.id.fragment,RecipeListFragment())
//            .commit()
//        setContent {
//            DefaultPreview()
//
//        }
    }
}

//
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@ExperimentalUnitApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .background(color = Color.Yellow)
    ) {
        Image(
            painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "asd",
            Modifier
                .height(100.dp)
                .width(100.dp)
                .padding(5.dp)
                .background(color = Color.Red),
            contentScale = ContentScale.Fit

        )
        Text(
            text = "text",

            style = TextStyle(
                fontSize = TextUnit(
                    20f, type = TextUnitType.Sp
                ),
                color = Color.Green
            )

        )


    }
}