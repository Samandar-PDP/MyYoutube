package com.sdk.myyoutubeapp.ui.home

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.sdk.myyoutubeapp.R
import com.sdk.myyoutubeapp.ui.component.Loading
import com.sdk.myyoutubeapp.ui.component.TopSelection
import com.sdk.myyoutubeapp.ui.component.VideoItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScree(
    navHostController: NavHostController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "image"
                    )
                },
                title = {

                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Done,
                            contentDescription = "",
                            tint = Color.Black
                        )
                    }
//                    Spacer(modifier = Modifier.width(3.dp))
//                    Icon(
//                        imageVector = Icons.Default.Notifications,
//                        contentDescription = "",
//                        tint = Color.Black
//                    )
//                    Spacer(modifier = Modifier.width(3.dp))
//                    Icon(
//                        imageVector = Icons.Default.Search,
//                        contentDescription = "",
//                        tint = Color.Black
//                    )
//                    Spacer(modifier = Modifier.width(3.dp))
//                    Box(
//                        modifier = Modifier
//                            .size(35.dp)
//                            .clip(CircleShape)
//                            .border(0.dp, Color.Black, CircleShape)
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.img_1),
//                            contentDescription = "img",
//                            contentScale = ContentScale.Crop,
//                            modifier = Modifier.fillMaxSize()
//                        )
//                    }
                }
            )
        }
    ) { p ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(p)
        ) {
            Divider()
            TopSelection(onClick = { })
            if (state.isLoading) {
                Loading()
            } else {
                LazyColumn {
                    items(
                        items = state.success,
                        key = { it.id }
                    ) {
                        VideoItem(
                            video = it,
                            onClick = {

                            }
                        )
                        Divider(
                            modifier = Modifier.fillMaxWidth(),
                            thickness = 5.dp,
                            color = Color.Gray
                        )
                    }
                }
            }
        }
    }
}