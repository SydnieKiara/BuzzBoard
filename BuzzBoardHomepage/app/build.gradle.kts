plugins {


    id("com.google.gms.google-services")
     alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" // this version matches your Kotlin version

}

android {
    namespace = "com.example.buzzboard_homepage"
    compileSdk = 35

    composeCompiler {
        reportsDestination = layout.buildDirectory.dir("compose_compiler")
        stabilityConfigurationFile = rootProject.layout.projectDirectory.file("stability_config.conf")
    }


    defaultConfig {
        applicationId = "com.example.buzzboard_homepage"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures{
        compose = true
        viewBinding=true
    }
}

dependencies {
// Import the Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:33.12.0"))
    implementation("com.google.firebase:firebase-auth-ktx")

    implementation ("com.google.firebase:firebase-auth:23.2.0")
    // When using the BoM, don't specify versions in Firebase dependencies
    implementation("com.google.firebase:firebase-analytics")



    // Declare the dependencies for the desired Firebase products without specifying versions
    // For example, declare the dependencies for Firebase Authentication and Cloud Firestore
    implementation ("com.google.firebase:firebase-auth")
    implementation ("com.google.firebase:firebase-firestore")




    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(platform("com.google.firebase:firebase-bom:33.12.0"))
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.activity:activity:1.10.1")
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.0.21")
    implementation("org.jetbrains.kotlin:kotlin-reflect:2.0.20")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
    implementation("androidx.activity:activity-compose:1.10.1")
    implementation(platform("androidx.compose:compose-bom:2024.09.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("com.google.firebase:firebase-firestore-ktx:25.1.3")
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform("androidx.compose:compose-bom:2024.09.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}