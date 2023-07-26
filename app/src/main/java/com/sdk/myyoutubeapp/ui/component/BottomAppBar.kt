package com.sdk.myyoutubeapp.ui.component

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.sdk.myyoutubeapp.ui.navigation.BottomBar

@Composable
fun BottomAppBar(
    navHostController: NavHostController
) {
    val screens = listOf(
        BottomBar.Home,
        BottomBar.Shorts,
        BottomBar.Add,
        BottomBar.Subs,
        BottomBar.Library,
    )
    val current by navHostController.currentBackStackEntryAsState()
    val isBottomBarVisible = screens.any { it.route == current?.destination?.route }
    if (isBottomBarVisible) {
        NavigationBar {
            screens.forEach { screen ->
                NavigationBarItem(
                    selected = screen.route == current?.destination?.route,
                    onClick = {
                        navHostController.navigate(screen.route) {
                            popUpTo("home") {
                                inclusive = true
                            }
                        }
                    },
                    label = {
                        Text(text = screen.label ?: "", maxLines = 1, overflow = TextOverflow.Ellipsis)
                    },
                    icon = {
                        Icon(imageVector = screen.icon, contentDescription = "icon")
                    }
                )
            }
        }
    }
}