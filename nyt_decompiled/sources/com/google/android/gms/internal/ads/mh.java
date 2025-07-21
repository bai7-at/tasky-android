package com.google.android.gms.internal.ads;

import defpackage.o1f;
import defpackage.w1f;
import java.util.List;

/* loaded from: classes3.dex */
final class mh {
    private final lh a;

    private mh(lh lhVar) {
        byte[] bArr = ai.d;
        this.a = lhVar;
        lhVar.a = this;
    }

    public static mh l(lh lhVar) {
        mh mhVar = lhVar.a;
        return mhVar != null ? mhVar : new mh(lhVar);
    }

    public final void A(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.a.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        this.a.v(i3);
        while (i2 < list.size()) {
            this.a.m(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public final void B(int i, Object obj, bj bjVar) {
        lh lhVar = this.a;
        lhVar.t(i, 3);
        bjVar.e((w1f) obj, lhVar.a);
        lhVar.t(i, 4);
    }

    public final void C(int i, int i2) {
        this.a.p(i, i2);
    }

    public final void D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += lh.b(((Integer) list.get(i4)).intValue());
        }
        this.a.v(i3);
        while (i2 < list.size()) {
            this.a.q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void E(int i, long j) {
        this.a.w(i, j);
    }

    public final void F(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.w(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += lh.b(((Long) list.get(i4)).longValue());
        }
        this.a.v(i3);
        while (i2 < list.size()) {
            this.a.x(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void G(int i, Object obj, bj bjVar) {
        this.a.r(i, (w1f) obj, bjVar);
    }

    public final void H(int i, int i2) {
        this.a.l(i, i2);
    }

    public final void I(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.a.v(i3);
        while (i2 < list.size()) {
            this.a.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void J(int i, long j) {
        this.a.n(i, j);
    }

    public final void K(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.a.v(i3);
        while (i2 < list.size()) {
            this.a.o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void a(int i, int i2) {
        lh lhVar = this.a;
        lhVar.u(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void b(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                lh lhVar = this.a;
                int intValue = ((Integer) list.get(i2)).intValue();
                lhVar.u(i, (intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
            return;
        }
        this.a.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += lh.B((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.a.v(i3);
        while (i2 < list.size()) {
            lh lhVar2 = this.a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            lhVar2.v((intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    public final void c(int i, long j) {
        lh lhVar = this.a;
        lhVar.w(i, (j >> 63) ^ (j + j));
    }

    public final void d(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                lh lhVar = this.a;
                long longValue = ((Long) list.get(i2)).longValue();
                lhVar.w(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        this.a.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += lh.b((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.a.v(i3);
        while (i2 < list.size()) {
            lh lhVar2 = this.a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            lhVar2.x((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    public final void e(int i) {
        this.a.t(i, 3);
    }

    public final void f(int i, String str) {
        this.a.s(i, str);
    }

    public final void g(int i, List list) {
        int i2 = 0;
        if (!(list instanceof o1f)) {
            while (i2 < list.size()) {
                this.a.s(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        o1f o1fVar = (o1f) list;
        while (i2 < list.size()) {
            Object zzf = o1fVar.zzf(i2);
            if (zzf instanceof String) {
                this.a.s(i, (String) zzf);
            } else {
                this.a.j(i, (zzgyl) zzf);
            }
            i2++;
        }
    }

    public final void h(int i, int i2) {
        this.a.u(i, i2);
    }

    public final void i(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.u(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += lh.B(((Integer) list.get(i4)).intValue());
        }
        this.a.v(i3);
        while (i2 < list.size()) {
            this.a.v(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void j(int i, long j) {
        this.a.w(i, j);
    }

    public final void k(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.w(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += lh.b(((Long) list.get(i4)).longValue());
        }
        this.a.v(i3);
        while (i2 < list.size()) {
            this.a.x(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void m(int i, boolean z) {
        this.a.i(i, z);
    }

    public final void n(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.i(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        this.a.v(i3);
        while (i2 < list.size()) {
            this.a.h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public final void o(int i, zzgyl zzgylVar) {
        this.a.j(i, zzgylVar);
    }

    public final void p(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.j(i, (zzgyl) list.get(i2));
        }
    }

    public final void q(int i, double d) {
        this.a.n(i, Double.doubleToRawLongBits(d));
    }

    public final void r(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.n(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.a.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        this.a.v(i3);
        while (i2 < list.size()) {
            this.a.o(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public final void s(int i) {
        this.a.t(i, 4);
    }

    public final void t(int i, int i2) {
        this.a.p(i, i2);
    }

    public final void u(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += lh.b(((Integer) list.get(i4)).intValue());
        }
        this.a.v(i3);
        while (i2 < list.size()) {
            this.a.q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void v(int i, int i2) {
        this.a.l(i, i2);
    }

    public final void w(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.a.v(i3);
        while (i2 < list.size()) {
            this.a.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void x(int i, long j) {
        this.a.n(i, j);
    }

    public final void y(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.a.v(i3);
        while (i2 < list.size()) {
            this.a.o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void z(int i, float f) {
        this.a.l(i, Float.floatToRawIntBits(f));
    }
}
