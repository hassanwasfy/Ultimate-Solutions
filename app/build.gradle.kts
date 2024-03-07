import java.util.Properties
import org.gradle.api.JavaVersion

@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.hiltAndroid)
    alias(libs.plugins.safeArgs)
}

android {
    namespace = "com.hassanwasfy.ultimatesolutions"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.hassanwasfy.ultimatesolutions"
        minSdk = 21
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures{
        dataBinding = true
        buildConfig = true
    }


    val properties = Properties()
    properties.load(project.rootProject.file("local.properties").inputStream())
    defaultConfig {
        buildConfigField("String" , "BASE_URL", "\"${properties.getProperty("BASE_URL")}\"")
    }


}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation(libs.savedstate)
    implementation(libs.lifecycleViewmodel)
    implementation(libs.livedata)
    implementation(libs.lifecycleService)
    implementation(libs.lifeDataTesters)
    implementation(libs.appLifecycle)
    implementation(libs.lifecycleRuntime)
    annotationProcessor(libs.lifecycleAnnotation)

    implementation(libs.hiltAndroid)
    annotationProcessor(libs.hiltCompiler)

    implementation(libs.rxJava)
    implementation(libs.rxAndroid)

    implementation(libs.retrofit)
    implementation(libs.retrofitAdapter)
    implementation(libs.retrofitConverter)
    implementation(libs.gson)
    implementation(platform(libs.okHttp))
    implementation(libs.interceptor)

    implementation(libs.navigationFragment)
    implementation(libs.navigationUi)
    androidTestImplementation(libs.navigationTest)
    implementation(libs.navigatinoFeatures)



}