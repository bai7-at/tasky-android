package com.google.android.tv.ads.controls;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
final class a extends AnimatorListenerAdapter {
    final /* synthetic */ ErrorMessageFragment a;

    a(ErrorMessageFragment errorMessageFragment) {
        this.a = errorMessageFragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.requireActivity().finish();
    }
}
