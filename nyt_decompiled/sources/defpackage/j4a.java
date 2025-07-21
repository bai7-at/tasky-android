package defpackage;

import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class j4a extends h4a {
    private i4a n;
    private int o;
    private boolean p;
    private ay9 q;
    private wx9 r;

    j4a() {
    }

    @Override // defpackage.h4a
    protected final long a(b9e b9eVar) {
        if ((b9eVar.m()[0] & 1) == 1) {
            return -1L;
        }
        byte b = b9eVar.m()[0];
        i4a i4aVar = this.n;
        wad.b(i4aVar);
        int i = !i4aVar.d[(b >> 1) & (255 >>> (8 - i4aVar.e))].a ? i4aVar.a.e : i4aVar.a.f;
        int i2 = this.p ? (this.o + i) / 4 : 0;
        if (b9eVar.r() < b9eVar.t() + 4) {
            byte[] copyOf = Arrays.copyOf(b9eVar.m(), b9eVar.t() + 4);
            b9eVar.i(copyOf, copyOf.length);
        } else {
            b9eVar.j(b9eVar.t() + 4);
        }
        long j = i2;
        byte[] m = b9eVar.m();
        m[b9eVar.t() - 4] = (byte) (j & 255);
        m[b9eVar.t() - 3] = (byte) ((j >>> 8) & 255);
        m[b9eVar.t() - 2] = (byte) ((j >>> 16) & 255);
        m[b9eVar.t() - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // defpackage.h4a
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    @Override // defpackage.h4a
    protected final boolean c(b9e b9eVar, long j, e4a e4aVar) {
        i4a i4aVar;
        int i;
        int i2;
        int i3;
        int i4;
        ay9 ay9Var;
        long j2;
        if (this.n != null) {
            e4aVar.a.getClass();
            return false;
        }
        ay9 ay9Var2 = this.q;
        int i5 = 4;
        if (ay9Var2 == null) {
            cy9.d(1, b9eVar, false);
            int y = b9eVar.y();
            int B = b9eVar.B();
            int y2 = b9eVar.y();
            int x = b9eVar.x();
            int i6 = x <= 0 ? -1 : x;
            int x2 = b9eVar.x();
            int i7 = x2 <= 0 ? -1 : x2;
            int x3 = b9eVar.x();
            int i8 = x3 <= 0 ? -1 : x3;
            int B2 = b9eVar.B();
            this.q = new ay9(y, B, y2, i6, i7, i8, (int) Math.pow(2.0d, B2 & 15), (int) Math.pow(2.0d, (B2 & 240) >> 4), 1 == (b9eVar.B() & 1), Arrays.copyOf(b9eVar.m(), b9eVar.t()));
        } else {
            wx9 wx9Var = this.r;
            if (wx9Var == null) {
                this.r = cy9.c(b9eVar, true, true);
            } else {
                byte[] bArr = new byte[b9eVar.t()];
                System.arraycopy(b9eVar.m(), 0, bArr, 0, b9eVar.t());
                int i9 = ay9Var2.a;
                int i10 = 5;
                cy9.d(5, b9eVar, false);
                int B3 = b9eVar.B() + 1;
                vx9 vx9Var = new vx9(b9eVar.m());
                vx9Var.c(b9eVar.s() * 8);
                int i11 = 0;
                while (true) {
                    int i12 = 2;
                    int i13 = 16;
                    if (i11 >= B3) {
                        ay9 ay9Var3 = ay9Var2;
                        int i14 = 6;
                        int b = vx9Var.b(6) + 1;
                        for (int i15 = 0; i15 < b; i15++) {
                            if (vx9Var.b(16) != 0) {
                                throw zzcc.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i16 = 1;
                        int b2 = vx9Var.b(6) + 1;
                        int i17 = 0;
                        while (true) {
                            int i18 = 3;
                            if (i17 < b2) {
                                int b3 = vx9Var.b(i13);
                                if (b3 == 0) {
                                    i3 = b2;
                                    int i19 = 8;
                                    vx9Var.c(8);
                                    vx9Var.c(16);
                                    vx9Var.c(16);
                                    vx9Var.c(6);
                                    vx9Var.c(8);
                                    int b4 = vx9Var.b(4) + 1;
                                    int i20 = 0;
                                    while (i20 < b4) {
                                        vx9Var.c(i19);
                                        i20++;
                                        i19 = 8;
                                    }
                                } else {
                                    if (b3 != i16) {
                                        throw zzcc.a("floor type greater than 1 not decodable: " + b3, null);
                                    }
                                    int b5 = vx9Var.b(i10);
                                    int[] iArr = new int[b5];
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < b5; i22++) {
                                        int b6 = vx9Var.b(4);
                                        iArr[i22] = b6;
                                        if (b6 > i21) {
                                            i21 = b6;
                                        }
                                    }
                                    int i23 = i21 + 1;
                                    int[] iArr2 = new int[i23];
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        iArr2[i24] = vx9Var.b(i18) + 1;
                                        int b7 = vx9Var.b(i12);
                                        if (b7 > 0) {
                                            i4 = 8;
                                            vx9Var.c(8);
                                        } else {
                                            i4 = 8;
                                        }
                                        int i25 = b2;
                                        int i26 = 0;
                                        for (int i27 = 1; i26 < (i27 << b7); i27 = 1) {
                                            vx9Var.c(i4);
                                            i26++;
                                            i4 = 8;
                                        }
                                        i24++;
                                        b2 = i25;
                                        i12 = 2;
                                        i18 = 3;
                                    }
                                    i3 = b2;
                                    vx9Var.c(i12);
                                    int b8 = vx9Var.b(4);
                                    int i28 = 0;
                                    int i29 = 0;
                                    for (int i30 = 0; i30 < b5; i30++) {
                                        i28 += iArr2[iArr[i30]];
                                        while (i29 < i28) {
                                            vx9Var.c(b8);
                                            i29++;
                                        }
                                    }
                                }
                                i17++;
                                b2 = i3;
                                i14 = 6;
                                i12 = 2;
                                i13 = 16;
                                i16 = 1;
                                i10 = 5;
                            } else {
                                int i31 = 1;
                                int b9 = vx9Var.b(i14) + 1;
                                int i32 = 0;
                                while (i32 < b9) {
                                    if (vx9Var.b(16) > 2) {
                                        throw zzcc.a("residueType greater than 2 is not decodable", null);
                                    }
                                    vx9Var.c(24);
                                    vx9Var.c(24);
                                    vx9Var.c(24);
                                    int b10 = vx9Var.b(i14) + i31;
                                    int i33 = 8;
                                    vx9Var.c(8);
                                    int[] iArr3 = new int[b10];
                                    for (int i34 = 0; i34 < b10; i34++) {
                                        iArr3[i34] = ((vx9Var.d() ? vx9Var.b(5) : 0) * 8) + vx9Var.b(3);
                                    }
                                    int i35 = 0;
                                    while (i35 < b10) {
                                        int i36 = 0;
                                        while (i36 < i33) {
                                            if ((iArr3[i35] & (1 << i36)) != 0) {
                                                vx9Var.c(i33);
                                            }
                                            i36++;
                                            i33 = 8;
                                        }
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i14 = 6;
                                    i31 = 1;
                                }
                                int b11 = vx9Var.b(i14) + 1;
                                for (int i37 = 0; i37 < b11; i37++) {
                                    int b12 = vx9Var.b(16);
                                    if (b12 != 0) {
                                        ezd.c("VorbisUtil", "mapping type other than 0 not supported: " + b12);
                                    } else {
                                        if (vx9Var.d()) {
                                            i = 1;
                                            i2 = vx9Var.b(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (vx9Var.d()) {
                                            int b13 = vx9Var.b(8) + i;
                                            for (int i38 = 0; i38 < b13; i38++) {
                                                int i39 = i9 - 1;
                                                vx9Var.c(cy9.a(i39));
                                                vx9Var.c(cy9.a(i39));
                                            }
                                        }
                                        if (vx9Var.b(2) != 0) {
                                            throw zzcc.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i2 > 1) {
                                            for (int i40 = 0; i40 < i9; i40++) {
                                                vx9Var.c(4);
                                            }
                                        }
                                        for (int i41 = 0; i41 < i2; i41++) {
                                            vx9Var.c(8);
                                            vx9Var.c(8);
                                            vx9Var.c(8);
                                        }
                                    }
                                }
                                int b14 = vx9Var.b(6);
                                int i42 = b14 + 1;
                                yx9[] yx9VarArr = new yx9[i42];
                                for (int i43 = 0; i43 < i42; i43++) {
                                    yx9VarArr[i43] = new yx9(vx9Var.d(), vx9Var.b(16), vx9Var.b(16), vx9Var.b(8));
                                }
                                if (!vx9Var.d()) {
                                    throw zzcc.a("framing bit after modes not set as expected", null);
                                }
                                i4aVar = new i4a(ay9Var3, wx9Var, bArr, yx9VarArr, cy9.a(b14));
                            }
                        }
                    } else {
                        if (vx9Var.b(24) != 5653314) {
                            throw zzcc.a("expected code book to start with [0x56, 0x43, 0x42] at " + vx9Var.a(), null);
                        }
                        int b15 = vx9Var.b(16);
                        int b16 = vx9Var.b(24);
                        if (vx9Var.d()) {
                            vx9Var.c(5);
                            for (int i44 = 0; i44 < b16; i44 += vx9Var.b(cy9.a(b16 - i44))) {
                            }
                        } else {
                            boolean d = vx9Var.d();
                            for (int i45 = 0; i45 < b16; i45++) {
                                if (!d) {
                                    vx9Var.c(5);
                                } else if (vx9Var.d()) {
                                    vx9Var.c(5);
                                }
                            }
                        }
                        int b17 = vx9Var.b(i5);
                        if (b17 > 2) {
                            throw zzcc.a("lookup type greater than 2 not decodable: " + b17, null);
                        }
                        if (b17 == 1) {
                            i12 = b17;
                        } else if (b17 != 2) {
                            ay9Var = ay9Var2;
                            i11++;
                            ay9Var2 = ay9Var;
                            i5 = 4;
                        }
                        vx9Var.c(32);
                        vx9Var.c(32);
                        int b18 = vx9Var.b(i5) + 1;
                        vx9Var.c(1);
                        if (i12 != 1) {
                            ay9Var = ay9Var2;
                            j2 = b15 * b16;
                        } else if (b15 != 0) {
                            ay9Var = ay9Var2;
                            j2 = (long) Math.floor(Math.pow(b16, 1.0d / b15));
                        } else {
                            ay9Var = ay9Var2;
                            j2 = 0;
                        }
                        vx9Var.c((int) (j2 * b18));
                        i11++;
                        ay9Var2 = ay9Var;
                        i5 = 4;
                    }
                }
            }
        }
        i4aVar = null;
        this.n = i4aVar;
        if (i4aVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        ay9 ay9Var4 = i4aVar.a;
        arrayList.add(ay9Var4.g);
        arrayList.add(i4aVar.c);
        zzby b19 = cy9.b(zzgaa.q(i4aVar.b.b));
        x3a x3aVar = new x3a();
        x3aVar.w("audio/vorbis");
        x3aVar.j0(ay9Var4.d);
        x3aVar.r(ay9Var4.c);
        x3aVar.k0(ay9Var4.a);
        x3aVar.x(ay9Var4.b);
        x3aVar.l(arrayList);
        x3aVar.p(b19);
        e4aVar.a = x3aVar.D();
        return true;
    }

    @Override // defpackage.h4a
    protected final void h(long j) {
        super.h(j);
        this.p = j != 0;
        ay9 ay9Var = this.q;
        this.o = ay9Var != null ? ay9Var.e : 0;
    }
}
