package com.google.android.gms.internal.measurement;

import defpackage.eef;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class u extends i2 implements eef {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* synthetic */ u(com.google.android.gms.internal.measurement.p r1) {
        /*
            r0 = this;
            com.google.android.gms.internal.measurement.v r1 = com.google.android.gms.internal.measurement.v.w()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.u.<init>(com.google.android.gms.internal.measurement.p):void");
    }

    public final int m() {
        return ((v) this.b).s();
    }

    public final t n(int i) {
        return ((v) this.b).u(i);
    }

    public final u o() {
        if (this.c) {
            l();
            this.c = false;
        }
        ((v) this.b).zzk = j2.l();
        return this;
    }

    public final u p(int i, s sVar) {
        if (this.c) {
            l();
            this.c = false;
        }
        v.E((v) this.b, i, (t) sVar.i());
        return this;
    }

    public final String q() {
        return ((v) this.b).z();
    }

    public final List r() {
        return Collections.unmodifiableList(((v) this.b).A());
    }

    public final List s() {
        return Collections.unmodifiableList(((v) this.b).B());
    }
}
