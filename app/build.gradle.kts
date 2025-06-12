import com.severo.themoviedatabase.build.Versions

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("androidx.navigation.safeargs")
    id("kotlin-parcelize")
    id("io.gitlab.arturbosch.detekt")
}

apply {
    from("../config/detekt/detekt.gradle")
}

android {
    namespace = Versions.Project.demoApplicationNamespace
    compileSdk = 36

    defaultConfig {
        applicationId = Versions.Project.applicationId
        minSdk = 21
        targetSdk = 36
        versionCode = Versions.Project.versionCode
        versionName = Versions.Project.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
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
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {
    implementation(Versions.Android.coreKtx)
    implementation(Versions.Android.appCompat)
    implementation(Versions.Android.constraintLayout)
    implementation(Versions.Android.material)
    implementation(Versions.Android.legacySupport)

    implementation(Versions.Android.Navigation.fragment)
    implementation(Versions.Android.Navigation.ui)

    implementation(Versions.Android.Lifecycle.viewModel)
    implementation(Versions.Android.Lifecycle.liveData)
    implementation(Versions.Android.Lifecycle.runtime)

    implementation(Versions.Coroutines.core)
    implementation(Versions.Coroutines.android)

    implementation(Versions.Android.Room.ktx)
    implementation(Versions.Android.Room.runtime)
    implementation(Versions.Android.Room.paging)
    implementation(Versions.Android.Paging.runtime)

    implementation(Versions.Glide.implementation)
    implementation(Versions.Android.shimmer)
    implementation(Versions.Android.dataStore)

    implementation("io.insert-koin:koin-core:4.1.0")
    testImplementation("io.insert-koin:koin-test:4.1.0")
    testImplementation("io.insert-koin:koin-test-junit4:4.1.0")
    testImplementation("io.insert-koin:koin-test-junit5:4.1.0")

    testImplementation(Versions.Android.Room.testing)
    testImplementation(Versions.TestLibs.JUnit.implementation)

    androidTestImplementation(Versions.Android.Test.junitExt)
    androidTestImplementation(Versions.Android.Test.runner)
    androidTestImplementation(Versions.Android.Espresso.core)
    androidTestImplementation(Versions.Android.Espresso.contrib)
    androidTestImplementation(Versions.OkHttp.mockWebServer)
    androidTestImplementation(Versions.Hilt.androidTesting)
    androidTestImplementation(Versions.Coroutines.test)
    androidTestImplementation(Versions.Android.Navigation.testing)

    debugImplementation(Versions.Android.Fragment.testing)
    androidTestUtil(Versions.Android.Test.orchestrator)
}
