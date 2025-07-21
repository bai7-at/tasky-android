package com.google.android.gms.internal.play_billing;

import defpackage.cqb;
import defpackage.sbc;
import java.util.List;

/* loaded from: classes3.dex */
final class p implements m1 {
    private final o a;

    private p(o oVar) {
        byte[] bArr = b0.d;
        this.a = oVar;
        oVar.a = this;
    }

    public static p d(o oVar) {
        p pVar = oVar.a;
        return pVar != null ? pVar : new p(oVar);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void a(int i, zzba zzbaVar) {
        this.a.g(i, zzbaVar);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void b(int i, Object obj, w0 w0Var) {
        sbc sbcVar = (sbc) obj;
        n nVar = (n) this.a;
        nVar.r((i << 3) | 2);
        nVar.r(((b) sbcVar).b(w0Var));
        w0Var.c(sbcVar, nVar.a);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void c(int i, Object obj, w0 w0Var) {
        o oVar = this.a;
        oVar.p(i, 3);
        w0Var.c((sbc) obj, oVar.a);
        oVar.p(i, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzA(int i, int i2) {
        o oVar = this.a;
        oVar.q(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzB(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o oVar = this.a;
                int intValue = ((Integer) list.get(i2)).intValue();
                oVar.q(i, (intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += o.y((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            o oVar2 = this.a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            oVar2.r((intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzC(int i, long j) {
        o oVar = this.a;
        oVar.s(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzD(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o oVar = this.a;
                long longValue = ((Long) list.get(i2)).longValue();
                oVar.s(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += o.z((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            o oVar2 = this.a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            oVar2.t((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzE(int i) {
        this.a.p(i, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzF(int i, String str) {
        this.a.o(i, str);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzG(int i, List list) {
        int i2 = 0;
        if (!(list instanceof cqb)) {
            while (i2 < list.size()) {
                this.a.o(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        cqb cqbVar = (cqb) list;
        while (i2 < list.size()) {
            Object zzf = cqbVar.zzf(i2);
            if (zzf instanceof String) {
                this.a.o(i, (String) zzf);
            } else {
                this.a.g(i, (zzba) zzf);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzH(int i, int i2) {
        this.a.q(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzI(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += o.y(((Integer) list.get(i4)).intValue());
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.r(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzJ(int i, long j) {
        this.a.s(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzK(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.s(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += o.z(((Long) list.get(i4)).longValue());
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.t(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzb(int i, boolean z) {
        this.a.f(i, z);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzc(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.f(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.e(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zze(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.g(i, (zzba) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzf(int i, double d) {
        this.a.j(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzg(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.j(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.k(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzh(int i) {
        this.a.p(i, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzi(int i, int i2) {
        this.a.l(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzj(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += o.v(((Integer) list.get(i4)).intValue());
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzk(int i, int i2) {
        this.a.h(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzl(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.h(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.i(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzm(int i, long j) {
        this.a.j(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzn(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.j(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.k(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzo(int i, float f) {
        this.a.h(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzp(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.h(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.i(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzr(int i, int i2) {
        this.a.l(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzs(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += o.v(((Integer) list.get(i4)).intValue());
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzt(int i, long j) {
        this.a.s(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzu(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.s(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += o.z(((Long) list.get(i4)).longValue());
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.t(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzw(int i, int i2) {
        this.a.h(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzx(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.h(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.i(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzy(int i, long j) {
        this.a.j(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void zzz(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.j(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.k(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
