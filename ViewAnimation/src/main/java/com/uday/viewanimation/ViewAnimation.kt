package com.uday.viewanimation

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.graphics.Color
import android.view.View
import android.view.animation.Animation

object ViewAnimation {
    fun fadeAnimView(view: View) {
        val animator: ObjectAnimator = ObjectAnimator.ofInt(
            view,
            "backgroundColor",
            Color.DKGRAY,
            Color.MAGENTA,
            Color.BLUE
        )
        animator.duration = 5000
        animator.setEvaluator(ArgbEvaluator())
        animator.repeatCount = Animation.REVERSE
        animator.start()
    }
}