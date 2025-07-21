package com.google.android.gms.internal.icing;

/* loaded from: classes3.dex */
final class n extends o {
    private final byte[] a;
    private int b;
    private int c;
    private int d;

    /* synthetic */ n(byte[] bArr, int i, int i2, boolean z, m mVar) {
        super(null);
        this.d = Integer.MAX_VALUE;
        this.a = bArr;
        this.b = 0;
    }

    public final int a(int i) {
        int i2 = this.d;
        this.d = 0;
        int i3 = this.b + this.c;
        this.b = i3;
        if (i3 > 0) {
            this.c = i3;
            this.b = 0;
        } else {
            this.c = 0;
        }
        return i2;
    }
}
