package com.skydoves.balloon;

import android.view.MotionEvent;
import android.view.View;
import defpackage.gt2;
import defpackage.je5;
import defpackage.lt2;
import defpackage.st2;
import defpackage.zq3;

/* loaded from: classes4.dex */
final /* synthetic */ class d implements je5, st2 {
    private final /* synthetic */ gt2 a;

    d(gt2 gt2Var) {
        zq3.h(gt2Var, "function");
        this.a = gt2Var;
    }

    @Override // defpackage.je5
    public final /* synthetic */ void a(View view, MotionEvent motionEvent) {
        this.a.invoke(view, motionEvent);
    }

    @Override // defpackage.st2
    public final lt2 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof je5) && (obj instanceof st2)) {
            return zq3.c(b(), ((st2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
