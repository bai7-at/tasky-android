package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import defpackage.rda;

/* loaded from: classes2.dex */
final class d extends RelativeLayout {
    final rda a;
    boolean b;

    public d(Context context, String str, String str2, String str3) {
        super(context);
        rda rdaVar = new rda(context, str);
        this.a = rdaVar;
        rdaVar.o(str2);
        rdaVar.n(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            return false;
        }
        this.a.m(motionEvent);
        return false;
    }
}
