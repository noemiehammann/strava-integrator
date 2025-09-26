# Run2Strava

Run2Strava is a minimal Android application scaffolded in Java that displays a centered "Hello World" message. It is built with the Android Gradle Plugin using the Kotlin DSL and targets modern Android devices as the foundation for future Strava integration work.

## Prerequisites
- Android Studio Iguana or newer
- Temurin JDK 17 (set `JAVA_HOME` accordingly)

## Build & Run
1. Sync the project in Android Studio or from the command line run:
   ```bash
   ./gradlew assembleDebug
   ```
2. Install the resulting APK on an emulator or physical device running Android 8.0 (API 26) or higher.

<!--
## Roadmap
- [ ] Strava OAuth using Chrome Custom Tabs, deep link handling, and token exchange with OkHttp
- [ ] Read Health Connect ExerciseSession (Running) data from Java
- [ ] Create manual activities via Strava POST /activities
- [ ] Optional: generate GPX files and upload with Strava POST /uploads
-->

<!--
Authorize:
https://www.strava.com/oauth/authorize?client_id=STRAVA_CLIENT_ID&redirect_uri=com.noemie.run2strava://auth/callback&response_type=code&scope=activity:write
Token exchange:
POST https://www.strava.com/oauth/token
  client_id=STRAVA_CLIENT_ID
  client_secret=STRAVA_CLIENT_SECRET
  code=AUTH_CODE
  grant_type=authorization_code
-->

## Security
Do not hardcode the Strava client secret in source control. Store secrets in `gradle.properties`, environment variables, or encrypted storage such as `EncryptedSharedPreferences` before implementing OAuth flows.
