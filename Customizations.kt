package com.example.mytestapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Customizations() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        RowAndColumnExample()
        CustomBoxWithNestedBox()
        CustomStyledText()
        TextOverflowExample()
        TextSelectionExample()
        SuperSubScriptText()
    }
}


@Composable
fun RowAndColumnExample() {

    // COLUMN
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Red)
        )
    }

    Spacer(modifier = Modifier.height(16.dp))

    // ROW
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Yellow)
        )
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Cyan)
        )
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Magenta)
        )
    }
}


@Composable
fun CustomBoxWithNestedBox() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(220.dp)
            .background(Color(0xFF6200EE)),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(150.dp)
                .background(Color(0xFFFF5722)),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(70.dp)
                    .background(Color(0xFF4CAF50))
            )
        }
    }
}


@Composable
fun CustomStyledText() {
    Text(
        buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold
                )
            ) {
                append("A")
            }

            withStyle(
                style = SpanStyle(
                    color = MaterialTheme.colorScheme.tertiary,
                    fontSize = 25.sp
                )
            ) {
                append("B")
            }

            append("C")
            append("D")
        }
    )
}


@Composable
fun TextOverflowExample() {
    Text(
        text = "Hello World ".repeat(20),
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
    )
}


@Composable
fun TextSelectionExample() {
    SelectionContainer {
        Column {
            Text(text = "Hello ")
            DisableSelection {
                Text(text = "Tarun")
            }
        }
    }
}


@Composable
fun SuperSubScriptText() {
    Text(
        buildAnnotatedString {
            append("A")

            withStyle(
                style = SpanStyle(
                    baselineShift = BaselineShift.Subscript
                )
            ) {
                append("B")
            }

            withStyle(
                style = SpanStyle(
                    baselineShift = BaselineShift.Superscript
                )
            ) {
                append("C")
            }
        }
    )
}
