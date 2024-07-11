import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.home.HomeViewModel
import ui.home.MainScreen
import ui.navigation.AppNavHost

@Composable
@Preview
fun App() {
    MaterialTheme {
        AppNavHost(navController = rememberNavController())

    }
}

