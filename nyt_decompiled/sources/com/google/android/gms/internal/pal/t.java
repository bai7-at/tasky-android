package com.google.android.gms.internal.pal;

import defpackage.vw9;
import defpackage.zx9;
import java.util.List;

/* loaded from: classes3.dex */
final class t implements v1 {
    private final s a;

    private t(s sVar) {
        f0.f(sVar, "output");
        this.a = sVar;
        sVar.a = this;
    }

    public static t d(s sVar) {
        t tVar = sVar.a;
        return tVar != null ? tVar : new t(sVar);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void a(int i, Object obj, d1 d1Var) {
        Object obj2 = (zx9) obj;
        r rVar = (r) this.a;
        rVar.u((i << 3) | 2);
        d dVar = (d) obj2;
        int b = dVar.b();
        if (b == -1) {
            b = d1Var.zza(dVar);
            dVar.c(b);
        }
        rVar.u(b);
        d1Var.c(obj2, rVar.a);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void b(int i, Object obj, d1 d1Var) {
        s sVar = this.a;
        sVar.s(i, 3);
        d1Var.c((zx9) obj, sVar.a);
        sVar.s(i, 4);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void c(int i, zzaby zzabyVar) {
        this.a.j(i, zzabyVar);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzA(int i, int i2) {
        this.a.t(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzB(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                s sVar = this.a;
                int intValue = ((Integer) list.get(i2)).intValue();
                sVar.t(i, (intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += s.a((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            s sVar2 = this.a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            sVar2.u((intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzC(int i, long j) {
        this.a.v(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzD(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                s sVar = this.a;
                long longValue = ((Long) list.get(i2)).longValue();
                sVar.v(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += s.b((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            s sVar2 = this.a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            sVar2.w((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzE(int i) {
        this.a.s(i, 3);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzF(int i, String str) {
        this.a.r(i, str);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzG(int i, List list) {
        int i2 = 0;
        if (!(list instanceof vw9)) {
            while (i2 < list.size()) {
                this.a.r(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        vw9 vw9Var = (vw9) list;
        while (i2 < list.size()) {
            Object zzf = vw9Var.zzf(i2);
            if (zzf instanceof String) {
                this.a.r(i, (String) zzf);
            } else {
                this.a.j(i, (zzaby) zzf);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzH(int i, int i2) {
        this.a.t(i, i2);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzI(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.t(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += s.a(((Integer) list.get(i4)).intValue());
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzJ(int i, long j) {
        this.a.v(i, j);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzK(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.v(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += s.b(((Long) list.get(i4)).longValue());
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.w(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzb(int i, boolean z) {
        this.a.i(i, z);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzc(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.i(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zze(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.j(i, (zzaby) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzf(int i, double d) {
        this.a.m(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzg(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzh(int i) {
        this.a.s(i, 4);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzi(int i, int i2) {
        this.a.o(i, i2);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzj(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += s.z(((Integer) list.get(i4)).intValue());
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.p(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzk(int i, int i2) {
        this.a.k(i, i2);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzl(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.k(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzm(int i, long j) {
        this.a.m(i, j);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzn(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzo(int i, float f) {
        this.a.k(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzp(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzr(int i, int i2) {
        this.a.o(i, i2);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzs(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += s.z(((Integer) list.get(i4)).intValue());
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.p(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzt(int i, long j) {
        this.a.v(i, j);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzu(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.v(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += s.b(((Long) list.get(i4)).longValue());
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.w(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzw(int i, int i2) {
        this.a.k(i, i2);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzx(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.k(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzy(int i, long j) {
        this.a.m(i, j);
    }

    @Override // com.google.android.gms.internal.pal.v1
    public final void zzz(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
