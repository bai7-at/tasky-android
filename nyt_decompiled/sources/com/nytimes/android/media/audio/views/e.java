package com.nytimes.android.media.audio.views;

import android.app.Activity;
import defpackage.ld1;
import defpackage.op4;
import defpackage.uq7;

/* loaded from: classes4.dex */
public abstract class e implements op4 {
    public static void a(AudioLayoutFooter audioLayoutFooter, Activity activity) {
        audioLayoutFooter.activity = activity;
    }

    public static void b(AudioLayoutFooter audioLayoutFooter, ld1 ld1Var) {
        audioLayoutFooter.deepLinkUtils = ld1Var;
    }

    public static void c(AudioLayoutFooter audioLayoutFooter, uq7 uq7Var) {
        audioLayoutFooter.sharingManager = uq7Var;
    }
}
