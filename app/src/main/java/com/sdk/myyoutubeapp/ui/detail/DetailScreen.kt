package com.sdk.myyoutubeapp.ui.detail

import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.MediaMetadata
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.ui.StyledPlayerView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    navHostController: NavHostController
) {
    val height = LocalConfiguration.current.screenHeightDp / 3
    val context = LocalContext.current

    val currentVideo = remember {
        MediaItem.Builder()
            .setUri("https://vod-progressive.akamaized.net/exp=1690993603~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F3994%2F10%2F269971860%2F1002284854.mp4~hmac=8f9a245ca4a7bca90f2355757cd50eebee10e2ae15932ba3fa22daf04d61bc20/vimeo-prod-skyfire-std-us/01/3994/10/269971860/1002284854.mp4")
            .setMediaId("id")
            .setTag("tag")
            .setMediaMetadata(
                MediaMetadata.Builder()
                    .setTitle("Video Title")
                    .build()
            )
            .build()
    }

    val exoPlayer = remember {
        SimpleExoPlayer.Builder(context).build().apply {
                this.setMediaItem(currentVideo)
                this.prepare()
                this.playWhenReady = true
            }
    }


    Scaffold { padding ->
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height.dp)
            ) {
                DisposableEffect(
                    AndroidView(
                        factory = { context ->
                            StyledPlayerView(context).apply {
                                player = exoPlayer
                                keepScreenOn = true
                                setShowNextButton(false)
                                setShowPreviousButton(false)
                                layoutParams = FrameLayout.LayoutParams(
                                    ViewGroup.LayoutParams.MATCH_PARENT,
                                    ViewGroup.LayoutParams.MATCH_PARENT
                                )
                                this.resizeMode = AspectRatioFrameLayout.RESIZE_MODE_FIT
                            }
                        }
                    )

                ) {
                    onDispose {
                        exoPlayer.release()
                    }
                }
            }
        }
    }
}