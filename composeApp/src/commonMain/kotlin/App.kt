import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.HomeViewModel
import ui.MainScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        MainScreen(viewModel = HomeViewModel())
    }
}

