plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.fixonce.ai"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.fixonce.ai"
        minSdk = 23
        targetSdk = 35
        versionCode = 6
        versionName = "0.6.0"
    }
}
