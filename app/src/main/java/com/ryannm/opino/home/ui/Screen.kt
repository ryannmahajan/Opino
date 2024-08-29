package com.ryannm.opino.home.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

object Home {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Screen() {
        Scaffold (
            topBar = { TopBar() },
            bottomBar = { BottomBar()},
            containerColor = Color.Black
        ) { p ->
            LazyColumn (
                modifier = Modifier.fillMaxSize()
                    .padding(p),
                horizontalAlignment = Alignment.Start
            ) {
                item {
                    PricesSection()
                    HeroSection()
                }
                matchPredictionSection()
            }
        }

    }
}

@Composable
@Preview
private fun preview() {
    Home.Screen()
}