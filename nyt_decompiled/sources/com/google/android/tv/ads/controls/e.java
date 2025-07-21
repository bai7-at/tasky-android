package com.google.android.tv.ads.controls;

import android.animation.AnimatorSet;
import defpackage.ce5;

/* loaded from: classes3.dex */
final class e extends ce5 {
    final /* synthetic */ AnimatorSet a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(WhyThisAdFragment whyThisAdFragment, boolean z, AnimatorSet animatorSet) {
        super(true);
        this.a = animatorSet;
    }

    @Override // defpackage.ce5
    public final void handleOnBackPressed() {
        this.a.start();
    }
}
