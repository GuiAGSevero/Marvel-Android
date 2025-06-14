import com.severo.marvel.build.Versions

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs")
    id("kotlin-parcelize")
    id("io.gitlab.arturbosch.detekt")
}

apply {
    from("../config/detekt/detekt.gradle")
}

android {
    namespace = Versions.Project.demoApplicationNamespace
    compileSdk = Versions.Android.compileSdk

    defaultConfig {
        applicationId = Versions.Project.applicationId
        minSdk = Versions.Android.minSdk
        targetSdk = Versions.Android.targetSdk
        versionCode = Versions.Project.versionCode
        versionName = Versions.Project.versionName

        testInstrumentationRunner = "com.severo.marvel.CustomTestRunner"
        testInstrumentationRunnerArguments["clearPackageData"] = "true"

        buildFeatures.buildConfig = true

        buildConfigField("String", "PUBLIC_KEY", "\"50f821f2abd2884534d41ad6dbc9b46d\"")
        buildConfigField("String", "PRIVATE_KEY", "\"072dc1ec8fb0dbdb051a94649d41c8f30f0d8121\"")
        buildConfigField("String", "BASE_URL", "\"https://gateway.marvel.com/v1/public/\"")
    }

    testOptions {
        execution = "ANDROIDX_TEST_ORCHESTRATOR"
        animationsDisabled = true
    }

    buildTypes {
        getByName("debug") {
            applicationIdSuffix = ".debug"
            isDebuggable = true
        }
        create("staging") {
            initWith(getByName("debug"))
            isMinifyEnabled = true
            applicationIdSuffix = ".staging"
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
                "proguard-rules-staging.pro"
            )
        }
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
        freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(project(":core"))

    // AndroidX
    implementation(Versions.Android.coreKtx)
    implementation(Versions.Android.appCompat)
    implementation(Versions.Android.constraintLayout)

    // Material
    implementation(Versions.Android.material)
    implementation(Versions.Android.legacySupport)

    // Navigation
    implementation(Versions.Android.Navigation.fragment)
    implementation(Versions.Android.Navigation.ui)

    // Lifecycle
    implementation(Versions.Android.Lifecycle.viewModel)
    implementation(Versions.Android.Lifecycle.liveData)
    implementation(Versions.Android.Lifecycle.runtime)

    // Coroutines
    implementation(Versions.Coroutines.core)
    implementation(Versions.Coroutines.android)

    // Koin
    implementation("io.insert-koin:koin-android:3.2.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")

    // Room
    implementation(Versions.Android.Room.ktx)
    implementation(Versions.Android.Room.runtime)
    implementation(Versions.Android.Room.paging)
    implementation(Versions.Android.Paging.runtime)
    kapt("androidx.room:room-compiler:2.7.1")

    // Glide
    implementation(Versions.Glide.implementation)

    // Outros
    implementation(Versions.Android.shimmer)
    implementation(Versions.Android.dataStore)

    // Testes unitários
    testImplementation(Versions.Android.Room.testing)
    testImplementation(Versions.TestLibs.JUnit.implementation)

    // Instrumentation tests
    androidTestImplementation(Versions.Android.Test.junitExt)
    androidTestImplementation(Versions.Android.Test.runner)
    androidTestUtil(Versions.Android.Test.orchestrator)

    androidTestImplementation(Versions.Android.Espresso.core)
    androidTestImplementation(Versions.Android.Espresso.contrib)

    debugImplementation(Versions.Android.Fragment.testing)

    androidTestImplementation(Versions.OkHttp.mockWebServer)
    androidTestImplementation(Versions.Coroutines.test)
    androidTestImplementation(Versions.Android.Navigation.testing)
}
