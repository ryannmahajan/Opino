package com.ryannm.opino

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ryannm.opino.core.ui.theme.OpinoTheme
import com.ryannm.opino.home.ui.Home

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OpinoTheme {
                Home.Screen()
            }
        }
    }
}