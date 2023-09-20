package com.example.study_kotlin_03

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.study_kotlin_03.ui.theme.Study_Kotlin_03Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // setContent {} 안에만 컴포즈 작성 가능

//        setContent {
//            val scrollState = rememberScrollState()
//            Column(
//                modifier = Modifier
//                    .background(color = Color.Blue)
//                    .fillMaxWidth()
//                    .verticalScroll(scrollState)
//            ) {
//                for (i in 1..50)
//                    Text("텍스트 $i")
//            }
//        }

        setContent {
            LazyColumn(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .fillMaxWidth(),
                contentPadding = PaddingValues(16.dp),  // 패딩
                verticalArrangement = Arrangement.spacedBy(4.dp) //아이템간의 간격 조절
            ) {
                item {
                    Text("Header")
                }
                items(50){index ->
                    Text("글씨 ${index+1}")
                }
                item {
                    Text("Footer")
                }
            }
            //LazyColumn 자주 씀
            //scrollState 필요 x
        }
    }
}