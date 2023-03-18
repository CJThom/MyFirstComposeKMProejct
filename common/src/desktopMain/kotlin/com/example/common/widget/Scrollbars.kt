package com.example.common.widget

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

actual val MARGIN_SCROLLBAR: Dp = 8.dp

actual typealias ScrollbarAdapter = androidx.compose.foundation.ScrollbarAdapter

@Composable
actual fun rememberScrollbarAdapter(
    scrollState: LazyListState
): ScrollbarAdapter =
    androidx.compose.foundation.rememberScrollbarAdapter(
        scrollState = scrollState
    )

@Composable
actual fun VerticalScrollbar(
    modifier: Modifier,
    adapter: ScrollbarAdapter
) {
    androidx.compose.foundation.VerticalScrollbar(
        modifier = modifier,
        adapter = adapter
    )
}
