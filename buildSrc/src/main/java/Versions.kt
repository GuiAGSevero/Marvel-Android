package com.severo.marvel.build

object Versions {

    object Project {
        const val applicationId = "com.severo.marvel"
        const val demoApplicationNamespace = "com.severo.marvel"

        const val versionCode = 1
        const val versionName = "1.0.0"
    }

    object Android {
        const val compileSdk = 36
        const val minSdk = 21
        const val targetSdk = 36

        const val coreKtx = "androidx.core:core-ktx:1.16.0"
        const val appCompat = "androidx.appcompat:appcompat:1.7.1"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.2.1"
        const val material = "com.google.android.material:material:1.12.0"
        const val legacySupport = "androidx.legacy:legacy-support-v4:1.0.0"
        const val shimmer = "com.facebook.shimmer:shimmer:0.5.0"
        const val dataStore = "androidx.datastore:datastore-preferences:1.1.7"

        object Navigation {
            private const val version = "2.9.0"
            private const val group = "androidx.navigation"
            const val classpath = "$group:navigation-safe-args-gradle-plugin:$version"
            const val fragment = "$group:navigation-fragment-ktx:$version"
            const val ui = "$group:navigation-ui-ktx:$version"
            const val testing = "$group:navigation-testing:$version"
        }

        object Lifecycle {
            private const val version = "2.9.1"
            private const val group = "androidx.lifecycle"
            const val viewModel = "$group:lifecycle-viewmodel-ktx:$version"
            const val liveData = "$group:lifecycle-livedata-ktx:$version"
            const val runtime = "$group:lifecycle-runtime-ktx:$version"
        }

        object Room {
            private const val version = "2.7.1"
            private const val group = "androidx.room"
            const val ktx = "$group:room-ktx:$version"
            const val runtime = "$group:room-runtime:$version"
            const val paging = "$group:room-paging:$version"
            const val testing = "$group:room-testing:$version"
        }

        object Paging {
            private const val version = "3.3.6"
            const val runtime = "androidx.paging:paging-runtime-ktx:$version"
        }

        object Fragment {
            private const val version = "1.8.8"
            const val testing = "androidx.fragment:fragment-testing:$version"
        }

        object Espresso {
            private const val version = "3.6.1"
            const val core = "androidx.test.espresso:espresso-core:$version"
            const val contrib = "androidx.test.espresso:espresso-contrib:$version"
        }

        object Test {
            const val junitExt = "androidx.test.ext:junit:1.2.1"
            const val runner = "androidx.test:runner:1.6.2"
            const val orchestrator = "androidx.test:orchestrator:1.5.1"
        }

        object Arch {
            object Core {
                private const val version = "2.1.0"
                const val testing = "androidx.arch.core:core-testing:$version"
            }
        }
    }

    object Glide {
        const val version = "4.16.0"
        const val implementation = "com.github.bumptech.glide:glide:$version"
    }

    object Coroutines {
        private const val version = "1.10.2"
        private const val base = "org.jetbrains.kotlinx:kotlinx-coroutines"
        const val core = "$base-core:$version"
        const val android = "$base-android:$version"
        const val test = "$base-test:$version"
    }

    object OkHttp {
        private const val version = "4.12.0"
        const val mockWebServer = "com.squareup.okhttp3:mockwebserver:$version"
    }

    object Hilt {
        private const val version = "2.56.2"
        const val androidTesting = "com.google.dagger:hilt-android-testing:$version"
    }

    object Kotlin {
        private const val version = "1.9.24"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object Gradle {
        private const val version = "8.5.0"
        const val classpath = "com.android.tools.build:gradle:$version"
    }

    object Firebase {
        object Crashlytics {
            private const val version = "2.6.1"
            const val classpath = "com.google.firebase:firebase-crashlytics-gradle:$version"
        }

        object Analytics {
            private const val version = "17.2.2"
            const val classpath = "com.google.firebase:firebase-analytics:$version"
        }
    }

    object PlayServices {
        object GoogleServices {
            private const val version = "4.3.5"
            const val classpath = "com.google.gms:google-services:$version"
        }
    }

    object TestLibs {
        object JUnit {
            private const val version = "4.13.1"
            const val implementation = "junit:junit:$version"
        }

        object Mockk {
            private const val version = "1.10.2"
            const val implementation = "io.mockk:mockk:$version"
        }

        object Robolectric {
            private const val version = "4.3.1"
            const val implementation = "org.robolectric:robolectric:$version"
        }

        object Mockito {
            private const val version = "2.2.0"
            const val implementation = "com.nhaarman.mockitokotlin2:mockito-kotlin:$version"
        }
    }

    object Timber {
        private const val version = "5.0.1"
        const val implementation = "com.jakewharton.timber:timber:$version"
    }

    object Plugin {
        private const val version = "2.7.2"
        const val classpath = "io.sicredi.android.plugin:gradle-plugin:$version"
    }

    object Dynatrace {
        private const val version = "8.197.1.1004"
        const val implementation = "com.dynatrace.agent:agent-android:$version"
    }

    object Jacoco {
        private const val version = "0.8.6"
        const val classpath = "org.jacoco:org.jacoco.core:$version"
    }
}