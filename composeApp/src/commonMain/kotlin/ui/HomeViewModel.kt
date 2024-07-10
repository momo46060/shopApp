package ui

import data.Product
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import repository.HomeRepository

class HomeViewModel : ViewModel() {

    private val _users = MutableStateFlow<List<Product>>(emptyList())
    val users = _users.asStateFlow()
    val repo= HomeRepository()
    init {
        viewModelScope.launch {
             repo.getProducts2().collect{pr->
                 _users.update { it+pr }
             }
        }
    }
}