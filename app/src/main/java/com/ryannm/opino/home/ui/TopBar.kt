package com.ryannm.opino.home.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ryannm.opino.core.ui.design_system.IconButton

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // todo: make this an exposedDropdownMenuBox
        Text(
            text = "Category",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Row(verticalAlignment = Alignment.CenterVertically) {
            var isLive by remember { mutableStateOf(false) }
            val green = Color(71,194,111)
            val trackGray = Color(40, 42, 44)

            Switch(
                checked = isLive,
                onCheckedChange = { isLive = it },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = green,
                    uncheckedThumbColor = Color.Black,
                    checkedTrackColor = trackGray,
                    uncheckedTrackColor = trackGray
                )
            )
            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = "LIVE",
                color = if (isLive) green else Color.White,
                fontSize = 18.sp,
            )

            Spacer(modifier = Modifier.width(16.dp))

            // Notification Icon

            IconButton(
                imageVector = Icons.Default.Notifications,
            ) {}
        }
    }
}


@Composable
@Preview
private fun preview() {
    Column (modifier = Modifier.fillMaxSize().background(Color.Black)) {
        TopBar()
    }
}