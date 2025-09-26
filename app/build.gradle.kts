plugins {
    id("com.android.application")
}

android {
    namespace = "com.noemie.run2strava"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.noemie.run2strava"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
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

    buildFeatures {
        buildConfig = true
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Health Connect (Kotlin-first but callable from Java)
    // implementation("androidx.health.connect:connect-client:<latest>")
    // Networking
    // implementation("com.squareup.okhttp3:okhttp:<latest>")
    // JSON (choose one)
    // implementation("org.json:json:<latest>") OR
    // implementation("com.google.code.gson:gson:<latest>")
}
