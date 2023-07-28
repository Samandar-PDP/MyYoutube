object AppDependencies {
    const val KotlinCore = "androidx.core:core-ktx:${Versions.kotlinVersion}"
    const val AndroidLifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeVer}"
    const val RuntimeCompose = "androidx.lifecycle:lifecycle-runtime-compose:${Versions.runtime_comp}"
    const val AndroidComp = "androidx.activity:activity-compose:${Versions.composeVersion}"
    const val ComposeNavigation = "androidx.navigation:navigation-compose:${Versions.navigation}"
    const val ComposeBom = "androidx.compose:compose-bom:2022.10.00"
    const val CompUI = "androidx.compose.ui:ui"
    const val CompUIGraph = "androidx.compose.ui:ui-graphics"
    const val CompUITool = "androidx.compose.ui:ui-tooling-preview"
    const val M3 = "androidx.compose.material3:material3"
    const val DaggerHilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
    const val AppCompat = "androidx.appcompat:appcompat:${Versions.compat}"

    const val Coil = "io.coil-kt:coil:${Versions.coil}"
    const val AccCoil = "io.coil-kt:coil-compose:${Versions.accCoil}"

    const val Hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val KaptHilt = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val HiltVM = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltVm}"
    const val CompHilt = "androidx.hilt:hilt-compiler:${Versions.compHilt}"
    const val HiltNavigation = "androidx.hilt:hilt-navigation-compose:${Versions.compHilt}"
    const val RoomRun = "androidx.room:room-runtime:${Versions.room}"
    const val RoomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val RoomAn = "androidx.room:room-compiler:${Versions.room}"
    const val RoomComp = "androidx.room:room-compiler:${Versions.room}"
    const val DataStore = "androidx.datastore:datastore-preferences:${Versions.compHilt}"

    const val Coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
    const val AndroidCoroutine =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"
    const val LifecycleScope = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.scope}"
    const val RuntimeScope = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.scope}"

    const val Retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val RetroGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val Okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val Interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"

    const val Lottie = "com.airbnb.android:lottie-compose:${Versions.lottie}"

    const val Pager = "com.google.accompanist:accompanist-pager:${Versions.pager}"
    const val Indicator = "com.google.accompanist:accompanist-pager-indicators:${Versions.pager}"
    const val CompUtil = "androidx.compose.ui:ui-util:${Versions.composeVersion}"

    const val ExoPlayer = "com.google.android.exoplayer:exoplayer:${Versions.exoPlayer}"

    const val Paging = "androidx.paging:paging-runtime:${Versions.paging}"
    const val PagingCompose = "androidx.paging:paging-compose:${Versions.pg}"
}
object Versions {
    const val kotlinVersion = "1.7.0"
    const val lifeVer = "2.3.1"
    const val hilt = "2.40.5"
    const val navigation = "2.6.0-alpha04"
    const val composeVersion = "1.1.1"
    const val coroutine = "1.6.4"
    const val scope = "2.5.1"
    const val hiltVm = "1.0.0-alpha03"
    const val compHilt = "1.0.0"
    const val room = "2.4.3"
    const val coil = "1.4.0"
    const val accCoil = "2.2.2"
    const val retrofit = "2.9.0"
    const val okhttp = "5.0.0-alpha.2"
    const val lottie = "6.0.0"
    const val compat = "1.6.1"
    const val pager = "0.13.0"
    const val exoPlayer = "2.15.0"
    const val runtime_comp = "2.6.1"
    const val paging = "3.1.1"
    const val pg = "1.0.0-alpha15"
}