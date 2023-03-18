package com.example.common.widget

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

expect val MARGIN_SCROLLBAR: Dp

expect interface ScrollbarAdapter

@Composable
expect fun rememberScrollbarAdapter(
    scrollState: LazyListState
): ScrollbarAdapter

@Composable
expect fun VerticalScrollbar(
    modifier: Modifier,
    adapter: ScrollbarAdapter
)
