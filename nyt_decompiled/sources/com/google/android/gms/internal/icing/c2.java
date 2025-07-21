package com.google.android.gms.internal.icing;

/* loaded from: classes3.dex */
public final class c2 {
    private zzi a;
    private zzg d;
    private long b = -1;
    private int c = -1;
    private boolean e = false;
    private int f = 0;

    public final c2 a(zzi zziVar) {
        this.a = zziVar;
        return this;
    }

    public final c2 b(long j) {
        this.b = j;
        return this;
    }

    public final c2 c(int i) {
        this.c = i;
        return this;
    }

    public final c2 d(zzg zzgVar) {
        this.d = zzgVar;
        return this;
    }

    public final c2 e(boolean z) {
        this.e = z;
        return this;
    }

    public final c2 f(int i) {
        this.f = i;
        return this;
    }

    public final zzx g() {
        return new zzx(this.a, this.b, this.c, null, this.d, this.e, -1, this.f, null);
    }
}
