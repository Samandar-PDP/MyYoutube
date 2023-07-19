package com.sdk.myyoutubeapp.ui

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.sdk.myyoutubeapp.R
import com.sdk.myyoutubeapp.constants.Graph
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navHostController: NavHostController
) {
    var isLaunched by remember { mutableStateOf(false) }
    LaunchedEffect(key1 = Unit) {
        isLaunched = true
        delay(4000)
        navHostController.navigate(Graph.MAIN)
    }
    val animation by animateFloatAsState(
        targetValue = if (isLaunched) 1f else 0f,
        animationSpec = tween(3000)
    )
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "image",
            modifier = Modifier
                .size(250.dp)
                .alpha(animation)
        )
    }
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.img),
//            contentDescription = "image",
//            modifier = Modifier
//                .size(120.dp)
//                .alpha(animation)
//        )
//        Spacer(modifier = Modifier.height(20.dp))
//        Text(text = "Youtube", fontSize = 24.sp)
//    }
}