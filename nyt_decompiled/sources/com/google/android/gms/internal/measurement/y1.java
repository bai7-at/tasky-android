package com.google.android.gms.internal.measurement;

import defpackage.f9f;

/* loaded from: classes3.dex */
final class y1 extends z1 {
    private final byte[] b;
    private int c;
    private int d;
    private int e;

    /* synthetic */ y1(byte[] bArr, int i, int i2, boolean z, f9f f9fVar) {
        super(null);
        this.e = Integer.MAX_VALUE;
        this.b = bArr;
        this.c = 0;
    }

    public final int c(int i) {
        int i2 = this.e;
        this.e = 0;
        int i3 = this.c + this.d;
        this.c = i3;
        if (i3 > 0) {
            this.d = i3;
            this.c = 0;
        } else {
            this.d = 0;
        }
        return i2;
    }
}
