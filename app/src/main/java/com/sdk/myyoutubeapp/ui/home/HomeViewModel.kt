package com.sdk.myyoutubeapp.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdk.domain.use_case.GetVideosUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getVideosUseCase: GetVideosUseCase
) : ViewModel() {
    private val _state = MutableStateFlow(HomeState())
    val state get() = _state.asStateFlow()

    init {
        viewModelScope.launch {
            getVideosUseCase("popular")
                .onStart {
                    _state.update {
                        it.copy(isLoading = true)
                    }
                }
                .catch { t ->
                    _state.update {
                        it.copy(isLoading = false, error = t.message.toString())
                    }
                }
                .collectLatest { r ->
                    _state.update {
                        it.copy(isLoading = false, success = r)
                    }
                }
        }
    }
    fun onEvent(event: HomeEvent) {
        if(event is HomeEvent.OnSearch) {
            viewModelScope.launch {

            }
        }
    }
}