package com.severo.marvel.framework.di

import com.severo.core.usecase.GetCharactersUseCase
import com.severo.core.usecase.GetCharactersUseCaseImpl
import org.koin.dsl.module

val useCaseModule = module {

    single<GetCharactersUseCase> {
        GetCharactersUseCaseImpl(
            charactersRepository = get(),
            storageRepository = get()
        )
    }
}