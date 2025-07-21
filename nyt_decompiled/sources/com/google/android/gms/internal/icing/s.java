package com.google.android.gms.internal.icing;

import defpackage.i4d;
import defpackage.rlc;
import java.util.List;

/* loaded from: classes3.dex */
final class s {
    private final r a;

    private s(r rVar) {
        b0.b(rVar, "output");
        this.a = rVar;
        rVar.a = this;
    }

    public static s j(r rVar) {
        s sVar = rVar.a;
        return sVar != null ? sVar : new s(rVar);
    }

    public final void A(int i, Object obj, y0 y0Var) {
        Object obj2 = (i4d) obj;
        q qVar = (q) this.a;
        qVar.r((i << 3) | 2);
        f fVar = (f) obj2;
        int c = fVar.c();
        if (c == -1) {
            c = y0Var.b(fVar);
            fVar.d(c);
        }
        qVar.r(c);
        y0Var.c(obj2, qVar.a);
    }

    public final void B(int i, Object obj, y0 y0Var) {
        r rVar = this.a;
        rVar.g(i, 3);
        y0Var.c((i4d) obj, rVar.a);
        rVar.g(i, 4);
    }

    public final void C(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.h(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += r.z(((Integer) list.get(i4)).intValue());
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.j(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void E(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.k(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += r.B(((Long) list.get(i4)).longValue());
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.t(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void F(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.k(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += r.B(((Long) list.get(i4)).longValue());
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.t(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void G(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void H(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.j(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.a.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public final void I(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.a.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public final void a(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.h(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += r.z(((Integer) list.get(i4)).intValue());
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void b(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.m(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.p(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public final void c(int i, List list) {
        int i2 = 0;
        if (!(list instanceof rlc)) {
            while (i2 < list.size()) {
                this.a.n(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        rlc rlcVar = (rlc) list;
        while (i2 < list.size()) {
            Object zzg = rlcVar.zzg(i2);
            if (zzg instanceof String) {
                this.a.n(i, (String) zzg);
            } else {
                this.a.o(i, (zzcf) zzg);
            }
            i2++;
        }
    }

    public final void d(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.o(i, (zzcf) list.get(i2));
        }
    }

    public final void e(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.i(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += r.A(((Integer) list.get(i4)).intValue());
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.r(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void f(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.j(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void g(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void h(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                r rVar = this.a;
                int intValue = ((Integer) list.get(i2)).intValue();
                rVar.i(i, (intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
            return;
        }
        this.a.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += r.A((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            r rVar2 = this.a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            rVar2.r((intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    public final void i(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                r rVar = this.a;
                long longValue = ((Long) list.get(i2)).longValue();
                rVar.k(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        this.a.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += r.B((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            r rVar2 = this.a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            rVar2.t((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    public final void k(int i, int i2) {
        this.a.j(i, i2);
    }

    public final void l(int i, long j) {
        this.a.k(i, j);
    }

    public final void m(int i, long j) {
        this.a.l(i, j);
    }

    public final void n(int i, float f) {
        this.a.j(i, Float.floatToRawIntBits(f));
    }

    public final void o(int i, double d) {
        this.a.l(i, Double.doubleToRawLongBits(d));
    }

    public final void p(int i, int i2) {
        this.a.h(i, i2);
    }

    public final void q(int i, long j) {
        this.a.k(i, j);
    }

    public final void r(int i, int i2) {
        this.a.h(i, i2);
    }

    public final void s(int i, long j) {
        this.a.l(i, j);
    }

    public final void t(int i, int i2) {
        this.a.j(i, i2);
    }

    public final void u(int i, boolean z) {
        this.a.m(i, z);
    }

    public final void v(int i, String str) {
        this.a.n(i, str);
    }

    public final void w(int i, zzcf zzcfVar) {
        this.a.o(i, zzcfVar);
    }

    public final void x(int i, int i2) {
        this.a.i(i, i2);
    }

    public final void y(int i, int i2) {
        this.a.i(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void z(int i, long j) {
        this.a.k(i, (j >> 63) ^ (j + j));
    }
}
