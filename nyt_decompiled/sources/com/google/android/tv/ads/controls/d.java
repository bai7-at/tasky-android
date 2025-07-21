package com.google.android.tv.ads.controls;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
final class d extends AnimatorListenerAdapter {
    final /* synthetic */ WhyThisAdFragment a;

    d(WhyThisAdFragment whyThisAdFragment) {
        this.a = whyThisAdFragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.requireActivity().finish();
    }
}
