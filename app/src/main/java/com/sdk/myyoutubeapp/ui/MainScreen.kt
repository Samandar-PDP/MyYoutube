package com.sdk.myyoutubeapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.sdk.myyoutubeapp.ui.component.BottomAppBar
import com.sdk.myyoutubeapp.ui.navigation.MainGraph

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navHostController: NavHostController = rememberNavController()) {
    Scaffold(
        bottomBar = {
            BottomAppBar(navHostController = navHostController)
        }
    ) { p ->
        MainGraph(navHostController = navHostController, modifier = Modifier.padding(p))
    }
}