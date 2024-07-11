package ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ui.home.HomeViewModel
import ui.home.MainScreen

@Composable
fun DetailScreen(navController: NavHostController) {

}

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: String = Screen.Home.route,
) {
   NavHost(navController = navController, startDestination = startDestination){
       composable(Screen.Home.route){
           MainScreen(viewModel = HomeViewModel(),navController = navController)
       }
       composable(Screen.Detail.route){
           DetailScreen(navController = navController)
   }
}
}