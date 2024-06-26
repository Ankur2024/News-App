package com.loc.newsapp

import NavGraph
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.loc.newsapp.ui.theme.NewsAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    val viewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition{
                viewModel.SplashCondition
            }
        }
        setContent {
            NewsAppTheme {
                val isSystemInDarkTheme  = isSystemInDarkTheme()
                val systemController = rememberSystemUiController()
                SideEffect {
                    systemController.setSystemBarsColor(
                        color = Color.Transparent,
                        darkIcons = !isSystemInDarkTheme
                        )
                    systemController.setNavigationBarColor(
                        color = Color.Transparent
                    )
                }
                Box(modifier = Modifier.background(color =  MaterialTheme.colorScheme.background)){
                    val startDestination = viewModel.StartDestinaion
                    NavGraph(startDestination = startDestination)
                }
            }
        }
    }
}
