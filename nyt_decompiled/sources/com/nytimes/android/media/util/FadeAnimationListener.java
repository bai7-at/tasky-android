package com.nytimes.android.media.util;

import android.view.animation.Animation;
import defpackage.oz4;

/* loaded from: classes4.dex */
public class FadeAnimationListener implements Animation.AnimationListener {
    private final oz4 onEnd;

    public FadeAnimationListener(oz4 oz4Var) {
        this.onEnd = oz4Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.onEnd.call();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
