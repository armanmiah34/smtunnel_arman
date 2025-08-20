package com.smtunnel.arman.internal.shape

import android.graphics.Canvas
import android.graphics.Path
import android.graphics.Rect
import com.smtunnel.arman.NeumorphShapeDrawable.NeumorphShapeDrawableState

internal interface Shape {
    fun setDrawableState(newDrawableState: NeumorphShapeDrawableState)
    fun draw(canvas: Canvas, outlinePath: Path)
    fun updateShadowBitmap(bounds: Rect)
}
