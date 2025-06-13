package com.severo.marvel.framework.di

import com.severo.marvel.presentation.characters.CharactersViewModel
import com.severo.marvel.presentation.sort.SortViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        CharactersViewModel(
            getCharactersUseCase = get(),
            coroutinesDispatchers = get()
        )
    }

    viewModel {
        SortViewModel(
            getCharactersSortingUseCase = get(),
            saveCharactersSortingUseCase = get(),
            coroutinesDispatchers = get()
        )
    }
}