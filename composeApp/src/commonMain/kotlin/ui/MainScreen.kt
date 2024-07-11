package ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.seiko.imageloader.rememberImagePainter

@Composable
fun MainScreen(modifier: Modifier = Modifier,
               viewModel: HomeViewModel) {
   val prodcutList = viewModel.users.collectAsState()
    BoxWithConstraints {
        val scope = this
        val maxWidth = scope.maxWidth
        var col = 2
        var modifier = Modifier.fillMaxWidth()
        if (maxWidth> 840.dp){
            col = 3
            modifier = Modifier.widthIn(maxWidth)

        }
        val scrollStat2e = rememberLazyGridState()
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
            ){
            LazyVerticalGrid(columns = GridCells.Fixed(col),
                state = scrollStat2e, contentPadding = PaddingValues(16.dp)
            ){

                items(items = prodcutList.value, key = {p-> p.id.toString()}){
                    Card(shape = RoundedCornerShape(16.dp),
                        modifier = Modifier.padding(8.dp).fillMaxWidth(),
                        elevation = 2.dp) {
                        Column {
                            Image(painter = rememberImagePainter(it.image!!)
                                , modifier = Modifier.height(130.dp).padding(8.dp), contentDescription = null)
                            Text(text = it.title.toString(), modifier = Modifier.padding(8.dp), maxLines = 2, overflow = TextOverflow.Ellipsis)

                        }
                        }
                }

            }
        }
    }

}