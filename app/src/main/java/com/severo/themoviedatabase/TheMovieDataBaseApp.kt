package com.severo.themoviedatabase

import android.app.Application
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

class TheMovieDataBase : Application() {
    override fun onCreate() {
        super.onCreate()

        loadNavigationModules()
    }

    fun loadNavigationModules() =
        loadKoinModules(
            listOf(
                navigationModule,
            ),
        )

    internal val navigationModule =
        module {

        }
}
