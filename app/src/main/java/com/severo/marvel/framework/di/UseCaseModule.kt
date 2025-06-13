package com.severo.marvel.framework.di

import com.severo.core.usecase.GetCharactersSortingUseCase
import com.severo.core.usecase.GetCharactersSortingUseCaseImpl
import com.severo.core.usecase.GetCharactersUseCase
import com.severo.core.usecase.GetCharactersUseCaseImpl
import com.severo.core.usecase.SaveCharactersSortingUseCase
import com.severo.core.usecase.SaveCharactersSortingUseCaseImpl
import org.koin.dsl.module

val useCaseModule = module {

    single<GetCharactersUseCase> {
        GetCharactersUseCaseImpl(
            charactersRepository = get(),
            storageRepository = get()
        )
    }

    single<GetCharactersSortingUseCase> {
        GetCharactersSortingUseCaseImpl(
            storageRepository = get(),
            sortingMapper = get(),
            dispatchers = get()
        )
    }

    single<SaveCharactersSortingUseCase> {
        SaveCharactersSortingUseCaseImpl(
            storageRepository = get(),
            sortingMapper = get(),
            dispatchers = get()
        )
    }
}