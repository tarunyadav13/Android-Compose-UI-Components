package com.example.mytestapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape


@Composable
fun LazyListContent(paddingValues: PaddingValues) {
    LazyColumn(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(16.dp)
    ) {

        item {
            ColumnExample()
        }

        item {
            RowExample()
        }

        item {
            BoxExample()
        }

        items(5) { index ->
            ListItemExample(index)
        }

        // Divider
        item {
            Divider(modifier = Modifier.padding(vertical = 8.dp))
        }

        // Footer
        item {
            Text(
                "End of List",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
    }
}


@Composable
fun ListItemExample(index: Int) {
    Card(
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                // click handling
            }
    ) {
        Text(
            text = "LazyColumn Item #$index",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .clickable {
                    // handle click
                }
        )
    }
}


