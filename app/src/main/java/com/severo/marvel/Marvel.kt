package com.severo.marvel

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class TheMovieDataBase : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@TheMovieDataBase)
            modules(appModule)
        }
    }

    val appModule = module {

    }
}
