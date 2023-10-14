import com.android.build.api.dsl.Packaging

plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.androidtestng"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.androidtestng"
        minSdk = 24
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
    buildFeatures {
        viewBinding = true
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "META-INF/DEPENDENCIES"
            excludes += "META-INF/dependencies"
        }
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment:2.7.4")
    implementation("androidx.navigation:navigation-ui:2.7.4")
    implementation("androidx.navigation:navigation-common:2.7.4")
    implementation(files("libs\\java-client-8.5.1.jar"))
    implementation(files("libs\\selenium-java-4.13.0.jar"))
    implementation(files("libs\\java-client-8.5.1.jar"))
    implementation(files("libs\\selenium-api-4.14.0.jar"))
    implementation(files("libs\\selenium-api-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-chrome-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-chrome-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-chromium-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-chromium-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v85-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v85-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v116-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v116-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v117-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v117-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v118-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v118-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-edge-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-edge-driver-4.14.0-sources.jar"))
    //implementation(files("libs\\selenium-firefox-driver-4.14.0.jar"))
    //implementation(files("libs\\selenium-firefox-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-http-4.14.0.jar"))
    implementation(files("libs\\selenium-http-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-ie-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-ie-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-java-4.13.0.jar"))
    implementation(files("libs\\selenium-java-4.14.0.jar"))
    implementation(files("libs\\selenium-json-4.14.0.jar"))
    implementation(files("libs\\selenium-json-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-manager-4.14.0.jar"))
    implementation(files("libs\\selenium-manager-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-os-4.14.0.jar"))
    implementation(files("libs\\selenium-os-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-remote-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-remote-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-safari-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-safari-driver-4.14.0-sources.jar"))
    implementation(files("libs\\auto-service-annotations-1.1.1.jar"))
    implementation(files("libs\\byte-buddy-1.14.5.jar"))
    implementation(files("libs\\checker-qual-3.33.0.jar"))
    implementation(files("libs\\commons-exec-1.3.jar"))
    implementation(files("libs\\error_prone_annotations-2.18.0.jar"))
    implementation(files("libs\\failsafe-3.3.2.jar"))
    implementation(files("libs\\failureaccess-1.0.1.jar"))
    implementation(files("libs\\guava-32.1.2-jre.jar"))
    implementation(files("libs\\j2objc-annotations-2.8.jar"))
    implementation(files("libs\\java-client-8.5.1.jar"))
    implementation(files("libs\\jsr305-3.0.2.jar"))
    implementation(files("libs\\opentelemetry-api-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-api-events-1.28.0-alpha.jar"))
    implementation(files("libs\\opentelemetry-context-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-exporter-logging-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-extension-incubator-1.28.0-alpha.jar"))
    implementation(files("libs\\opentelemetry-sdk-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-common-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-extension-autoconfigure-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-extension-autoconfigure-spi-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-logs-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-metrics-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-trace-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-semconv-1.28.0-alpha.jar"))
    implementation(files("libs\\selenium-api-4.14.0.jar"))
    implementation(files("libs\\selenium-api-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-api-4.14.1.jar"))
    implementation(files("libs\\selenium-chrome-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-chrome-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-chromium-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-chromium-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v85-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v85-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v116-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v116-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v117-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v117-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v118-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v118-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-edge-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-edge-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-firefox-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-firefox-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-http-4.14.0.jar"))
    implementation(files("libs\\selenium-http-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-http-4.14.1.jar"))
    implementation(files("libs\\selenium-ie-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-ie-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-java-4.13.0.jar"))
    implementation(files("libs\\selenium-java-4.14.0.jar"))
    implementation(files("libs\\selenium-json-4.14.0.jar"))
    implementation(files("libs\\selenium-json-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-json-4.14.1.jar"))
    implementation(files("libs\\selenium-manager-4.14.0.jar"))
    implementation(files("libs\\selenium-manager-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-manager-4.14.1.jar"))
    implementation(files("libs\\selenium-os-4.14.0.jar"))
    implementation(files("libs\\selenium-os-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-os-4.14.1.jar"))
    implementation(files("libs\\selenium-remote-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-remote-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-remote-driver-4.14.1.jar"))
    implementation(files("libs\\selenium-safari-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-safari-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-support-4.14.0.jar"))
    implementation(files("libs\\selenium-support-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-support-4.14.1.jar"))
    implementation(files("libs\\auto-service-annotations-1.1.1.jar"))
    implementation(files("libs\\byte-buddy-1.14.5.jar"))
    implementation(files("libs\\checker-qual-3.33.0.jar"))
    implementation(files("libs\\commons-exec-1.3.jar"))
    implementation(files("libs\\error_prone_annotations-2.18.0.jar"))
    implementation(files("libs\\failsafe-3.3.2.jar"))
    implementation(files("libs\\failureaccess-1.0.1.jar"))
    implementation(files("libs\\guava-32.1.2-jre.jar"))
    implementation(files("libs\\j2objc-annotations-2.8.jar"))
    implementation(files("libs\\java-client-8.5.1.jar"))
    implementation(files("libs\\jsr305-3.0.2.jar"))
    implementation(files("libs\\opentelemetry-api-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-api-events-1.28.0-alpha.jar"))
    implementation(files("libs\\opentelemetry-context-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-exporter-logging-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-extension-incubator-1.28.0-alpha.jar"))
    implementation(files("libs\\opentelemetry-sdk-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-common-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-extension-autoconfigure-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-extension-autoconfigure-spi-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-logs-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-metrics-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-trace-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-semconv-1.28.0-alpha.jar"))
    implementation(files("libs\\selenium-api-4.14.0.jar"))
    implementation(files("libs\\selenium-api-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-api-4.14.1.jar"))
    implementation(files("libs\\selenium-chrome-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-chrome-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-chromium-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-chromium-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v85-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v85-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v116-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v116-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v117-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v117-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v118-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v118-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-edge-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-edge-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-firefox-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-firefox-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-http-4.14.0.jar"))
    implementation(files("libs\\selenium-http-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-http-4.14.1.jar"))
    implementation(files("libs\\selenium-ie-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-ie-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-java-4.13.0.jar"))
    implementation(files("libs\\selenium-java-4.14.0.jar"))
    implementation(files("libs\\selenium-json-4.14.0.jar"))
    implementation(files("libs\\selenium-json-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-json-4.14.1.jar"))
    implementation(files("libs\\selenium-manager-4.14.0.jar"))
    implementation(files("libs\\selenium-manager-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-manager-4.14.1.jar"))
    implementation(files("libs\\selenium-os-4.14.0.jar"))
    implementation(files("libs\\selenium-os-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-os-4.14.1.jar"))
    implementation(files("libs\\selenium-remote-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-remote-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-remote-driver-4.14.1.jar"))
    implementation(files("libs\\selenium-safari-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-safari-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-support-4.14.0.jar"))
    implementation(files("libs\\selenium-support-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-support-4.14.1.jar"))
    implementation(files("libs\\async-http-client-2.12.3.jar"))
    implementation(files("libs\\async-http-client-netty-utils-2.12.3.jar"))
    implementation(files("libs\\auto-service-annotations-1.1.1.jar"))
    implementation(files("libs\\byte-buddy-1.14.5.jar"))
    implementation(files("libs\\checker-qual-3.33.0.jar"))
    implementation(files("libs\\commons-exec-1.3.jar"))
    implementation(files("libs\\commons-io-2.14.0.jar"))
    implementation(files("libs\\commons-lang3-3.13.0.jar"))
    implementation(files("libs\\error_prone_annotations-2.18.0.jar"))
    implementation(files("libs\\failsafe-3.3.2.jar"))
    implementation(files("libs\\failureaccess-1.0.1.jar"))
    implementation(files("libs\\gson-2.10.1.jar"))
    implementation(files("libs\\guava-32.1.2-jre.jar"))
    implementation(files("libs\\j2objc-annotations-2.8.jar"))
    implementation(files("libs\\jakarta.activation-1.2.2.jar"))
    implementation(files("libs\\java-client-8.5.1.jar"))
    implementation(files("libs\\java-client-8.6.0.jar"))
    implementation(files("libs\\jsr305-3.0.2.jar"))
    implementation(files("libs\\netty-buffer-4.1.96.Final.jar"))
    implementation(files("libs\\netty-codec-4.1.96.Final.jar"))
    implementation(files("libs\\netty-codec-http-4.1.96.Final.jar"))
    implementation(files("libs\\netty-codec-socks-4.1.60.Final.jar"))
    implementation(files("libs\\netty-common-4.1.96.Final.jar"))
    implementation(files("libs\\netty-handler-4.1.96.Final.jar"))
    implementation(files("libs\\netty-handler-proxy-4.1.60.Final.jar"))
    implementation(files("libs\\netty-reactive-streams-2.0.4.jar"))
    implementation(files("libs\\netty-resolver-4.1.96.Final.jar"))
    implementation(files("libs\\netty-transport-4.1.96.Final.jar"))
    implementation(files("libs\\netty-transport-classes-epoll-4.1.96.Final.jar"))
    implementation(files("libs\\netty-transport-classes-kqueue-4.1.96.Final.jar"))
    implementation(files("libs\\netty-transport-native-epoll-4.1.60.Final-linux-x86_64.jar"))
    implementation(files("libs\\netty-transport-native-kqueue-4.1.60.Final-osx-x86_64.jar"))
    implementation(files("libs\\netty-transport-native-unix-common-4.1.96.Final.jar"))
    implementation(files("libs\\opentelemetry-api-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-api-events-1.28.0-alpha.jar"))
    implementation(files("libs\\opentelemetry-context-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-exporter-logging-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-extension-incubator-1.28.0-alpha.jar"))
    implementation(files("libs\\opentelemetry-sdk-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-common-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-extension-autoconfigure-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-extension-autoconfigure-spi-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-logs-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-metrics-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-trace-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-semconv-1.28.0-alpha.jar"))
    implementation(files("libs\\reactive-streams-1.0.3.jar"))
    implementation(files("libs\\selenium-api-4.13.0.jar"))
    implementation(files("libs\\selenium-api-4.14.0.jar"))
    implementation(files("libs\\selenium-api-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-api-4.14.1.jar"))
    implementation(files("libs\\selenium-chrome-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-chrome-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-chromium-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-chromium-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v85-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v85-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v116-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v116-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v117-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v117-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v118-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v118-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-edge-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-edge-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-firefox-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-firefox-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-http-4.13.0.jar"))
    implementation(files("libs\\selenium-http-4.14.0.jar"))
    implementation(files("libs\\selenium-http-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-http-4.14.1.jar"))
    implementation(files("libs\\selenium-ie-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-ie-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-java-4.13.0.jar"))
    implementation(files("libs\\selenium-java-4.14.0.jar"))
    implementation(files("libs\\selenium-json-4.13.0.jar"))
    implementation(files("libs\\selenium-json-4.14.0.jar"))
    implementation(files("libs\\selenium-json-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-json-4.14.1.jar"))
    implementation(files("libs\\selenium-manager-4.13.0.jar"))
    implementation(files("libs\\selenium-manager-4.14.0.jar"))
    implementation(files("libs\\selenium-manager-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-manager-4.14.1.jar"))
    implementation(files("libs\\selenium-os-4.13.0.jar"))
    implementation(files("libs\\selenium-os-4.14.0.jar"))
    implementation(files("libs\\selenium-os-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-os-4.14.1.jar"))
    implementation(files("libs\\selenium-remote-driver-4.13.0.jar"))
    implementation(files("libs\\selenium-remote-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-remote-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-remote-driver-4.14.1.jar"))
    implementation(files("libs\\selenium-safari-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-safari-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-support-4.13.0.jar"))
    implementation(files("libs\\selenium-support-4.14.0.jar"))
    implementation(files("libs\\selenium-support-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-support-4.14.1.jar"))
    implementation(files("libs\\slf4j-api-2.0.9.jar"))
    implementation(files("libs\\async-http-client-2.12.3.jar"))
    implementation(files("libs\\async-http-client-netty-utils-2.12.3.jar"))
    implementation(files("libs\\auto-service-annotations-1.1.1.jar"))
    implementation(files("libs\\byte-buddy-1.14.5.jar"))
    implementation(files("libs\\checker-qual-3.33.0.jar"))
    implementation(files("libs\\commons-exec-1.3.jar"))
    implementation(files("libs\\commons-io-2.14.0.jar"))
    implementation(files("libs\\commons-lang3-3.13.0.jar"))
    implementation(files("libs\\error_prone_annotations-2.18.0.jar"))
    implementation(files("libs\\failsafe-3.3.2.jar"))
    implementation(files("libs\\failureaccess-1.0.1.jar"))
    implementation(files("libs\\gson-2.10.1.jar"))
    implementation(files("libs\\guava-32.1.2-jre.jar"))
    implementation(files("libs\\j2objc-annotations-2.8.jar"))
    implementation(files("libs\\jakarta.activation-1.2.2.jar"))
    implementation(files("libs\\java-client-8.5.1.jar"))
    implementation(files("libs\\java-client-8.6.0.jar"))
    implementation(files("libs\\jsr305-3.0.2.jar"))
    implementation(files("libs\\netty-buffer-4.1.96.Final.jar"))
    implementation(files("libs\\netty-codec-4.1.96.Final.jar"))
    implementation(files("libs\\netty-codec-http-4.1.96.Final.jar"))
    implementation(files("libs\\netty-codec-socks-4.1.60.Final.jar"))
    implementation(files("libs\\netty-common-4.1.96.Final.jar"))
    implementation(files("libs\\netty-handler-4.1.96.Final.jar"))
    implementation(files("libs\\netty-handler-proxy-4.1.60.Final.jar"))
    implementation(files("libs\\netty-reactive-streams-2.0.4.jar"))
    implementation(files("libs\\netty-resolver-4.1.96.Final.jar"))
    implementation(files("libs\\netty-transport-4.1.96.Final.jar"))
    implementation(files("libs\\netty-transport-classes-epoll-4.1.96.Final.jar"))
    implementation(files("libs\\netty-transport-classes-kqueue-4.1.96.Final.jar"))
    implementation(files("libs\\netty-transport-native-epoll-4.1.60.Final-linux-x86_64.jar"))
    implementation(files("libs\\netty-transport-native-kqueue-4.1.60.Final-osx-x86_64.jar"))
    implementation(files("libs\\netty-transport-native-unix-common-4.1.96.Final.jar"))
    implementation(files("libs\\opentelemetry-api-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-api-events-1.28.0-alpha.jar"))
    implementation(files("libs\\opentelemetry-context-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-exporter-logging-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-extension-incubator-1.28.0-alpha.jar"))
    implementation(files("libs\\opentelemetry-sdk-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-common-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-extension-autoconfigure-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-extension-autoconfigure-spi-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-logs-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-metrics-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-sdk-trace-1.28.0.jar"))
    implementation(files("libs\\opentelemetry-semconv-1.28.0-alpha.jar"))
    implementation(files("libs\\reactive-streams-1.0.3.jar"))
    implementation(files("libs\\selenium-api-4.13.0.jar"))
    implementation(files("libs\\selenium-api-4.14.0.jar"))
    implementation(files("libs\\selenium-api-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-api-4.14.1.jar"))
    implementation(files("libs\\selenium-chrome-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-chrome-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-chromium-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-chromium-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v85-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v85-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v116-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v116-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v117-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v117-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-devtools-v118-4.14.0.jar"))
    implementation(files("libs\\selenium-devtools-v118-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-edge-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-edge-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-firefox-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-firefox-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-http-4.13.0.jar"))
    implementation(files("libs\\selenium-http-4.14.0.jar"))
    implementation(files("libs\\selenium-http-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-http-4.14.1.jar"))
    implementation(files("libs\\selenium-ie-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-ie-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-java-4.13.0.jar"))
    implementation(files("libs\\selenium-java-4.14.0.jar"))
    implementation(files("libs\\selenium-json-4.13.0.jar"))
    implementation(files("libs\\selenium-json-4.14.0.jar"))
    implementation(files("libs\\selenium-json-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-json-4.14.1.jar"))
    implementation(files("libs\\selenium-manager-4.13.0.jar"))
    implementation(files("libs\\selenium-manager-4.14.0.jar"))
    implementation(files("libs\\selenium-manager-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-manager-4.14.1.jar"))
    implementation(files("libs\\selenium-os-4.13.0.jar"))
    implementation(files("libs\\selenium-os-4.14.0.jar"))
    implementation(files("libs\\selenium-os-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-os-4.14.1.jar"))
    implementation(files("libs\\selenium-remote-driver-4.13.0.jar"))
    implementation(files("libs\\selenium-remote-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-remote-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-remote-driver-4.14.1.jar"))
    implementation(files("libs\\selenium-safari-driver-4.14.0.jar"))
    implementation(files("libs\\selenium-safari-driver-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-support-4.13.0.jar"))
    implementation(files("libs\\selenium-support-4.14.0.jar"))
    implementation(files("libs\\selenium-support-4.14.0-sources.jar"))
    implementation(files("libs\\selenium-support-4.14.1.jar"))
    implementation(files("libs\\slf4j-api-2.0.9.jar"))
    //implementation(files("libs\\selenium-support-4.14.0.jar"))
    //implementation(files("libs\\selenium-support-4.14.0-sources.jar"))
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}