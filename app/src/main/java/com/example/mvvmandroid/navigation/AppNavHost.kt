package com.example.mvvmandroid.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvmandroid.ui.theme.screens.about.AboutScreen
import com.example.mvvmandroid.ui.theme.screens.home.HomeScreen
import com.example.mvvmandroid.ui.theme.screens.home.IntentScreen
import com.example.mvvmandroid.ui.theme.screens.splash.SplashScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_HOME
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }
        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }
        composable(ROUT_CONTACT) {
            HomeScreen(navController = navController)
        }
        composable(ROUT_DETAILS) {
            HomeScreen(navController = navController)
        }
        composable(ROUT_DASHBOARD) {
            HomeScreen(navController = navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController = navController)
        }
    }
}