package com.google.android.gms.internal.measurement;

import defpackage.c8f;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
class zziy extends zzix {
    protected final byte[] zza;

    zziy(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public byte a(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    byte c(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public int e() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjb) || e() != ((zzjb) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof zziy)) {
            return obj.equals(this);
        }
        zziy zziyVar = (zziy) obj;
        int p = p();
        int p2 = zziyVar.p();
        if (p != 0 && p2 != 0 && p != p2) {
            return false;
        }
        int e = e();
        if (e > zziyVar.e()) {
            throw new IllegalArgumentException("Length too large: " + e + e());
        }
        if (e > zziyVar.e()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + e + ", " + zziyVar.e());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zziyVar.zza;
        zziyVar.v();
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

    @Override // com.google.android.gms.internal.measurement.zzjb
    protected final int f(int i, int i2, int i3) {
        return l2.d(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final zzjb g(int i, int i2) {
        int o = zzjb.o(0, i2, e());
        return o == 0 ? zzjb.a : new zziv(this.zza, 0, o);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    protected final String j(Charset charset) {
        return new String(this.zza, 0, e(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    final void k(c8f c8fVar) {
        ((a2) c8fVar).D(this.zza, 0, e());
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final boolean n() {
        return w3.f(this.zza, 0, e());
    }

    protected int v() {
        return 0;
    }
}
