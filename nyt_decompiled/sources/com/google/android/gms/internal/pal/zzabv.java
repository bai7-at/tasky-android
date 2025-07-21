package com.google.android.gms.internal.pal;

import defpackage.st9;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
class zzabv extends zzabu {
    protected final byte[] zza;

    zzabv(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    protected int B() {
        return 0;
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public byte a(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    byte c(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public int e() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaby) || e() != ((zzaby) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof zzabv)) {
            return obj.equals(this);
        }
        zzabv zzabvVar = (zzabv) obj;
        int t = t();
        int t2 = zzabvVar.t();
        if (t != 0 && t2 != 0 && t != t2) {
            return false;
        }
        int e = e();
        if (e > zzabvVar.e()) {
            throw new IllegalArgumentException("Length too large: " + e + e());
        }
        if (e > zzabvVar.e()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + e + ", " + zzabvVar.e());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzabvVar.zza;
        zzabvVar.B();
        int i = 0;
        int i2 = 0;
        while (i < e) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    protected void f(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    protected final int g(int i, int i2, int i3) {
        return f0.d(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final zzaby j(int i, int i2) {
        int q = zzaby.q(0, i2, e());
        return q == 0 ? zzaby.a : new zzabs(this.zza, 0, q);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final p k() {
        return p.n(this.zza, 0, e(), true);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    protected final String n(Charset charset) {
        return new String(this.zza, 0, e(), charset);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    final void o(st9 st9Var) {
        ((r) st9Var).D(this.zza, 0, e());
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final boolean p() {
        return t1.f(this.zza, 0, e());
    }
}
