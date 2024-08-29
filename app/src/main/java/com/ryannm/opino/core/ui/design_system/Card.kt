package com.ryannm.opino.core.ui.design_system

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Card(modifier: Modifier, content: @Composable() (ColumnScope.() -> Unit)) {
    androidx.compose.material3.Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = Color.DarkGray
        ),
      //  backgroundColor = Color(0xFF1F1F1F), // Dark background color maybe?
        shape = RoundedCornerShape(8.dp),    // Rounded corners
        elevation =  CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ), content = content
    )
}