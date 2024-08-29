package com.ryannm.opino.core.ui.design_system

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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

@Composable
fun RowScope.BigYesButton(text: String = "No", onClick: () -> Unit) {
    BigButton(color = Color(0xFF2962FF), text = text, onClick)
}

@Composable
fun RowScope.BigNoButton(text: String = "No", onClick: () -> Unit) {
    BigButton(color = Color(0xFF00C853), text = text, onClick)
}

@Composable
private fun RowScope.BigButton(color:Color, text: String, onClick: () -> Unit) {
    Button(
        shape = RoundedCornerShape(8.dp),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = color),
        modifier = Modifier
            .weight(1f)
            .padding(start = 8.dp)
    ) {
        Text(text = text, color = Color.White)
    }
}