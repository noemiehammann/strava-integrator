# Strava Integrator Android App

This repository contains a minimal Android application skeleton that displays a simple "Hello World" message. It is intended as a starting point for further development.

## Project structure

- `app/src/main/java/com/example/helloworld/MainActivity.kt` – entry point activity that renders the layout.
- `app/src/main/res/layout/activity_main.xml` – layout with a centered **Hello World** text label.
- `app/src/main/res/values/` – resources for strings, colors, and theming.
- `app/build.gradle.kts` – module-level Gradle configuration.
- `build.gradle.kts` & `settings.gradle.kts` – top-level Gradle configuration files.

## Requirements

- Android Studio Giraffe (or newer) or a compatible Gradle installation.
- Android SDK 24 or higher.
- JDK 17.

## Getting started

1. Open the project in Android Studio.
2. Let Android Studio sync the Gradle files (or run `gradle assembleDebug` if you have Gradle installed).
3. Deploy the `app` module to an emulator or device to see the "Hello World" screen.

The default application ID is `com.example.helloworld`. Update package names, resources, and theming as needed for your project.
