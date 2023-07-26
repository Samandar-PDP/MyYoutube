package com.sdk.myyoutubeapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdk.myyoutubeapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VideoItem(
    onClick: () -> Unit,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(280.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "video_image",
            modifier = Modifier
                .fillMaxSize()
                .weight(3f),
            contentScale = ContentScale.Crop
        )
        ListItem(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            leadingContent = {
                Box(
                    modifier = Modifier
                        .size(35.dp)
                        .clip(CircleShape)
                        .border(0.dp, Color.Black, CircleShape)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "img",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            },
            headlineText = {
                Text(text = "Video Title")
            },
            supportingText = {
                Text(text = "34 234 234 views, Jul 1 2023")
            },
            trailingContent = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = "more")
                }
            }
        )
    }
}