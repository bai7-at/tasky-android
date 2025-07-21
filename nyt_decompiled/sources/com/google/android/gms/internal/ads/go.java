package com.google.android.gms.internal.ads;

import defpackage.pdf;
import defpackage.wad;

/* loaded from: classes3.dex */
public final class go {
    private long a;
    private float b;
    private long c;

    public go() {
        this.a = -9223372036854775807L;
        this.b = -3.4028235E38f;
        this.c = -9223372036854775807L;
    }

    public final go d(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        wad.d(z);
        this.c = j;
        return this;
    }

    public final go e(long j) {
        this.a = j;
        return this;
    }

    public final go f(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        wad.d(z);
        this.b = f;
        return this;
    }

    public final ho g() {
        return new ho(this, null);
    }

    /* synthetic */ go(ho hoVar, pdf pdfVar) {
        this.a = hoVar.a;
        this.b = hoVar.b;
        this.c = hoVar.c;
    }
}
