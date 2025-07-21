package com.nytimes.android.media.audio.views;

import defpackage.fw;
import defpackage.hb5;
import defpackage.op4;

/* loaded from: classes4.dex */
public abstract class a implements op4 {
    public static void a(AudioControlView audioControlView, hb5 hb5Var) {
        audioControlView.mediaController = hb5Var;
    }

    public static void b(AudioControlView audioControlView, fw fwVar) {
        audioControlView.presenter = fwVar;
    }
}
