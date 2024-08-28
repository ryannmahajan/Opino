package com.ryannm.opino.core.ui.design_system

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun IconButton(
    imageVector: ImageVector,
    text: String? = null,
    modifier: Modifier = Modifier,
    onClick:()->Unit
) {
    Column (
        modifier = modifier
    ) {
        OutlinedIconButton(onClick = onClick,
//            border = IconButtonDefaults.outlinedIconButtonBorder(true)
//                .copy(brush = SolidColor(Color.White), width = 2.dp)
                )
        {
            Icon(imageVector = imageVector,
                contentDescription = text,
                tint = Color.White,
                modifier = Modifier.size(24.dp))
        }
        text?.let { Text(it) }
    }
}