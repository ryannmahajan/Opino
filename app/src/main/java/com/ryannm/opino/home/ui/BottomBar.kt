package com.ryannm.opino.home.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ryannm.opino.core.ui.design_system.IconButton

@Composable
fun BottomBar() {
    BottomAppBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = Color.Black,
        contentColor = Color.White
    ) {
        Row (
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(imageVector = Icons.Default.Home, text = "Home") {

            }
            IconButton(imageVector = Icons.Default.Face, text = "Portfolio") {

            }
            IconButton(imageVector = Icons.Default.Build, text = "Wallet") {

            }
            IconButton(imageVector = Icons.Default.AccountCircle, text = "Profile") {

            }
        }
    }
}