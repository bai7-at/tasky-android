package com.google.android.gms.internal.measurement;

import defpackage.eef;

/* loaded from: classes3.dex */
public final class d extends i2 implements eef {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* synthetic */ d(com.google.android.gms.internal.measurement.a r1) {
        /*
            r0 = this;
            com.google.android.gms.internal.measurement.e r1 = com.google.android.gms.internal.measurement.e.u()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d.<init>(com.google.android.gms.internal.measurement.a):void");
    }

    public final int m() {
        return ((e) this.b).r();
    }

    public final d n(String str) {
        if (this.c) {
            l();
            this.c = false;
        }
        e.z((e) this.b, str);
        return this;
    }

    public final d o(int i, g gVar) {
        if (this.c) {
            l();
            this.c = false;
        }
        e.A((e) this.b, i, gVar);
        return this;
    }

    public final g p(int i) {
        return ((e) this.b).v(i);
    }

    public final String q() {
        return ((e) this.b).x();
    }
}
