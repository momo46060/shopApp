import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import shopapp.composeapp.generated.resources.Res
import shopapp.composeapp.generated.resources.compose_multiplatform
import ui.HomeViewModel

@Composable
@Preview
fun App() {
    MaterialTheme {
        Content(viewmodel = HomeViewModel())
    }
}

@Composable
fun Content(viewmodel :HomeViewModel) {

    val prodrctus by viewmodel.users.collectAsState()
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        prodrctus.forEach {
            Text(it.title.toString())
        }
    }
}