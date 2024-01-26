package com.example.examseven.presentation.base

import android.view.View
import androidx.customview.widget.ViewDragHelper
import androidx.drawerlayout.widget.DrawerLayout

class DrawerViewDragHelper(drawerLayout: DrawerLayout) {
    private val viewDragHelper: ViewDragHelper

    init {
        viewDragHelper = ViewDragHelper.create(drawerLayout, 1.0f, object : ViewDragHelper.Callback() {
            override fun tryCaptureView(child: View, pointerId: Int): Boolean {
                return child == drawerLayout.getChildAt(1)
            }

            override fun getViewHorizontalDragRange(child: View): Int {
                return child.width
            }

            override fun clampViewPositionHorizontal(child: View, left: Int, dx: Int): Int {
                return left.coerceIn(0, child.width)
            }
        })
    }

    fun setEdgeSize(size: Int) {
        viewDragHelper.setEdgeTrackingEnabled(ViewDragHelper.EDGE_LEFT)
        viewDragHelper.setEdgeSize(size)
    }
}
