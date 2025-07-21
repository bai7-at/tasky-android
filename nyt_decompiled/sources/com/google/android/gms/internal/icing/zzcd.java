package com.google.android.gms.internal.icing;

import defpackage.u6b;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
class zzcd extends zzcc {
    protected final byte[] zza;

    zzcd(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    public byte a(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    byte c(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    public int e() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcf) || e() != ((zzcf) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof zzcd)) {
            return obj.equals(this);
        }
        zzcd zzcdVar = (zzcd) obj;
        int q = q();
        int q2 = zzcdVar.q();
        if (q != 0 && q2 != 0 && q != q2) {
            return false;
        }
        int e = e();
        if (e > zzcdVar.e()) {
            int e2 = e();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(e);
            sb.append(e2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (e > zzcdVar.e()) {
            int e3 = zzcdVar.e();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(e);
            sb2.append(", ");
            sb2.append(e3);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzcdVar.zza;
        zzcdVar.u();
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

    @Override // com.google.android.gms.internal.icing.zzcf
    public final zzcf f(int i, int i2) {
        zzcf.t(0, i2, e());
        return i2 == 0 ? zzcf.a : new zzca(this.zza, 0, i2);
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    final void g(u6b u6bVar) {
        ((q) u6bVar).D(this.zza, 0, e());
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    protected final String j(Charset charset) {
        return new String(this.zza, 0, e(), charset);
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    public final boolean k() {
        return n1.b(this.zza, 0, e());
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    protected final int n(int i, int i2, int i3) {
        return b0.g(i, this.zza, 0, i3);
    }

    protected int u() {
        return 0;
    }
}
