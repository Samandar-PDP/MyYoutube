package com.sdk.myyoutubeapp.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBar(
    val route: String,
    val icon: ImageVector,
    val label: String?
) {
    object Home: BottomBar(
        route = "home",
        icon = Icons.Default.Home,
        label = "Home"
    )
    object Shorts: BottomBar(
        route = "shorts",
        icon = Icons.Default.ShoppingCart,
        label = "Shorts"
    )
    object Add: BottomBar(
        route = "add",
        icon = Icons.Default.AddCircle,
        label = null
    )
    object Subs: BottomBar(
        route = "subs",
        icon = Icons.Default.Share,
        label = "Subscription"
    )
    object Library: BottomBar(
        route = "lib",
        icon = Icons.Default.AccountBox,
        label = "Library"
    )
}