package com.severo.marvel.framework.di

import com.severo.marvel.presentation.characters.CharactersViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        CharactersViewModel(
            getCharactersUseCase = get(),
            coroutinesDispatchers = get()
        )
    }
}