package com.sdk.myyoutubeapp.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sdk.myyoutubeapp.constants.Graph
import com.sdk.myyoutubeapp.ui.MainScreen
import com.sdk.myyoutubeapp.ui.SplashScreen
import com.sdk.myyoutubeapp.ui.detail.DetailScreen
import com.sdk.myyoutubeapp.ui.home.HomeScree

@Composable
fun RootNavigation(navHostController: NavHostController) {
    NavHost(
        route = Graph.ROOT,
        navController = navHostController,
        startDestination = Graph.SPLASH,
    ) {
        splashGraph(navHostController)
        composable(route = Graph.MAIN) {
            MainScreen()
        }
    }
}

fun NavGraphBuilder.splashGraph(navHostController: NavHostController) {
    navigation(
        route = Graph.SPLASH,
        startDestination = "splash"
    ) {
        composable(route = "splash") {
            SplashScreen(navHostController = navHostController)
        }
    }
}

@Composable
fun MainGraph(navHostController: NavHostController, modifier: Modifier) {
    NavHost(
        route = Graph.MAIN,
        navController = navHostController,
        startDestination = BottomBar.Home.route,
        modifier = modifier
    ) {
        composable(route = BottomBar.Home.route) {
            HomeScree(navHostController = navHostController)
        }
        composable(route = BottomBar.Shorts.route) {
            Text(text = "Shorts")
        }
        composable(route = BottomBar.Add.route) {
            Text(text = "Add")
        }
        composable(route = BottomBar.Subs.route) {
            Text(text = "Subs")
        }
        composable(route = BottomBar.Library.route) {
            Text(text = "Library")
        }
        detailNavGraph(navHostController)
    }
}

fun NavGraphBuilder.detailNavGraph(navHostController: NavHostController) {
    navigation(
        route = Graph.FULL_VID,
        startDestination = "detail"
    ) {
        composable(route = "detail") {
            DetailScreen(navHostController = navHostController)
        }
    }
}