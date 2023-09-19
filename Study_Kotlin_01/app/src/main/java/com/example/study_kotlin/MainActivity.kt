
package com.example.study_kotlin

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.study_kotlin.ui.theme.Study_KotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Study_KotlinTheme {
                // A surface container using the 'background' color from the theme
                var clickCount : MutableState<Int> = remember { mutableStateOf(0) }

                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android",clickCount.value,
                        onClicked = {
                            Log.d("TAG", "onCreate:클릭됨")
                            clickCount.value = clickCount.value+1
                        }
                    )
                }
            }
        }
    }
}

//뷰
@Composable
fun Greeting(name: String,clickCount:Int ,onClicked:()->Unit) {
    Column {
        Text(text = "Hello $name!")
        Text(text = "클릭 카운트 :$clickCount")
        Button(onClicked) {
            Text(text = "클릭해주세요")
        }
    }
}



//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Study_KotlinTheme {
//        Greeting("Android")
//    }
//}