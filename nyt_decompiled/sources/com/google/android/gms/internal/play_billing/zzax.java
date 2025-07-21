package com.google.android.gms.internal.play_billing;

import defpackage.xaa;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
class zzax extends zzaw {
    protected final byte[] zza;

    zzax(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public byte a(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    byte c(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public int e() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzba) || e() != ((zzba) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof zzax)) {
            return obj.equals(this);
        }
        zzax zzaxVar = (zzax) obj;
        int p = p();
        int p2 = zzaxVar.p();
        if (p != 0 && p2 != 0 && p != p2) {
            return false;
        }
        int e = e();
        if (e > zzaxVar.e()) {
            throw new IllegalArgumentException("Length too large: " + e + e());
        }
        if (e > zzaxVar.e()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + e + ", " + zzaxVar.e());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzaxVar.zza;
        zzaxVar.u();
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

    @Override // com.google.android.gms.internal.play_billing.zzba
    protected final int f(int i, int i2, int i3) {
        return b0.b(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public final zzba g(int i, int i2) {
        int o = zzba.o(0, i2, e());
        return o == 0 ? zzba.a : new zzau(this.zza, 0, o);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    protected final String j(Charset charset) {
        return new String(this.zza, 0, e(), charset);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    final void k(xaa xaaVar) {
        ((n) xaaVar).B(this.zza, 0, e());
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public final boolean n() {
        return l1.e(this.zza, 0, e());
    }

    protected int u() {
        return 0;
    }
}
