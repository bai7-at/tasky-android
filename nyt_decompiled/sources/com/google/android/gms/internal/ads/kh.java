package com.google.android.gms.internal.ads;

import defpackage.w1f;
import java.io.OutputStream;

/* loaded from: classes3.dex */
final class kh extends ih {
    private final OutputStream i;

    kh(OutputStream outputStream, int i) {
        super(i);
        this.i = outputStream;
    }

    private final void H() {
        this.i.write(this.e, 0, this.g);
        this.g = 0;
    }

    private final void I(int i) {
        if (this.f - this.g < i) {
            H();
        }
    }

    public final void J(byte[] bArr, int i, int i2) {
        int i3 = this.f;
        int i4 = this.g;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.e, i4, i2);
            this.g += i2;
            this.h += i2;
            return;
        }
        System.arraycopy(bArr, i, this.e, i4, i5);
        int i6 = i + i5;
        this.g = this.f;
        this.h += i5;
        H();
        int i7 = i2 - i5;
        if (i7 <= this.f) {
            System.arraycopy(bArr, i6, this.e, 0, i7);
            this.g = i7;
        } else {
            this.i.write(bArr, i6, i7);
        }
        this.h += i7;
    }

    public final void K(String str) {
        int e;
        try {
            int length = str.length() * 3;
            int B = lh.B(length);
            int i = B + length;
            int i2 = this.f;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int d = qj.d(str, bArr, 0, length);
                v(d);
                J(bArr, 0, d);
                return;
            }
            if (i > i2 - this.g) {
                H();
            }
            int B2 = lh.B(str.length());
            int i3 = this.g;
            try {
                if (B2 == B) {
                    int i4 = i3 + B2;
                    this.g = i4;
                    int d2 = qj.d(str, this.e, i4, this.f - i4);
                    this.g = i3;
                    e = (d2 - i3) - B2;
                    F(e);
                    this.g = d2;
                } else {
                    e = qj.e(str);
                    F(e);
                    this.g = qj.d(str, this.e, this.g, e);
                }
                this.h += e;
            } catch (zzhdd e2) {
                this.h -= this.g - i3;
                this.g = i3;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e3) {
                throw new zzgyx(e3);
            }
        } catch (zzhdd e4) {
            e(str, e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.lh, defpackage.yze
    public final void a(byte[] bArr, int i, int i2) {
        J(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void g() {
        if (this.g > 0) {
            H();
        }
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void h(byte b) {
        if (this.g == this.f) {
            H();
        }
        C(b);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void i(int i, boolean z) {
        I(11);
        F(i << 3);
        C(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void j(int i, zzgyl zzgylVar) {
        v((i << 3) | 2);
        v(zzgylVar.g());
        zzgylVar.w(this);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void l(int i, int i2) {
        I(14);
        F((i << 3) | 5);
        D(i2);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void m(int i) {
        I(4);
        D(i);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void n(int i, long j) {
        I(18);
        F((i << 3) | 1);
        E(j);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void o(long j) {
        I(8);
        E(j);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void p(int i, int i2) {
        I(20);
        F(i << 3);
        if (i2 >= 0) {
            F(i2);
        } else {
            G(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void q(int i) {
        if (i >= 0) {
            v(i);
        } else {
            x(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.lh
    final void r(int i, w1f w1fVar, bj bjVar) {
        v((i << 3) | 2);
        v(((rg) w1fVar).d(bjVar));
        bjVar.e(w1fVar, this.a);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void s(int i, String str) {
        v((i << 3) | 2);
        K(str);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void t(int i, int i2) {
        v((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void u(int i, int i2) {
        I(20);
        F(i << 3);
        F(i2);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void v(int i) {
        I(5);
        F(i);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void w(int i, long j) {
        I(20);
        F(i << 3);
        G(j);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void x(long j) {
        I(10);
        G(j);
    }
}
