package com.sdk.myyoutubeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.sdk.myyoutubeapp.ui.navigation.RootNavigation
import com.sdk.myyoutubeapp.ui.theme.MyYoutubeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyYoutubeAppTheme {
                val navHostController = rememberNavController()
                RootNavigation(navHostController = navHostController)
            }
        }
    }
}
