package com.skydoves.balloon;

import android.view.View;
import defpackage.ie5;
import defpackage.lt2;
import defpackage.ss2;
import defpackage.st2;
import defpackage.zq3;

/* loaded from: classes4.dex */
final /* synthetic */ class c implements ie5, st2 {
    private final /* synthetic */ ss2 a;

    c(ss2 ss2Var) {
        zq3.h(ss2Var, "function");
        this.a = ss2Var;
    }

    @Override // defpackage.ie5
    public final /* synthetic */ void a(View view) {
        this.a.invoke(view);
    }

    @Override // defpackage.st2
    public final lt2 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ie5) && (obj instanceof st2)) {
            return zq3.c(b(), ((st2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
