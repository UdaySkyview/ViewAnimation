package com.uday.viewanimation

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.graphics.Color
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.uday.viewanimation.R.anim

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
    fun fadeInAnim(view: View){
        val animation = AnimationUtils.loadAnimation(view.context.applicationContext,
            androidx.appcompat.R.anim.abc_fade_in)
        view.startAnimation(animation)
    }
    fun  fadeOutAnim(view: View){
        val animation = AnimationUtils.loadAnimation(view.context.applicationContext,
            androidx.appcompat.R.anim.abc_fade_out)
        view.startAnimation(animation)
    }
    fun popUpEnter(view: View){
        val animation = AnimationUtils.loadAnimation(view.context.applicationContext,
            androidx.appcompat.R.anim.abc_popup_enter)
        view.startAnimation(animation)
    }
}