package com.google.android.gms.internal.ads;

import defpackage.n1c;
import defpackage.ndf;
import defpackage.o6g;
import defpackage.s7g;
import defpackage.wff;
import defpackage.z2g;
import defpackage.zzf;

/* loaded from: classes3.dex */
public final class h6 implements ndf {
    private final s7g a = new s7g(true, 65536);
    private long b = 15000000;
    private long c = 30000000;
    private long d = 2500000;
    private long e = 5000000;
    private int f;
    private boolean g;

    h6() {
    }

    @Override // defpackage.ndf
    public final /* synthetic */ void a(n1c n1cVar, zzf zzfVar, wff[] wffVarArr, z2g z2gVar, o6g[] o6gVarArr) {
        int i = 0;
        this.f = 0;
        while (true) {
            int length = wffVarArr.length;
            if (i >= 2) {
                this.a.f(this.f);
                return;
            } else {
                if (o6gVarArr[i] != null) {
                    this.f += wffVarArr[i].b() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // defpackage.ndf
    public final /* synthetic */ boolean b(n1c n1cVar, zzf zzfVar, long j, float f, boolean z, long j2) {
        long j3 = z ? this.e : this.d;
        return j3 <= 0 || j >= j3;
    }

    @Override // defpackage.ndf
    public final boolean c(long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.c ? (char) 0 : j2 < this.b ? (char) 2 : (char) 1;
        int a = this.a.a();
        int i = this.f;
        if (c != 2 && (c != 1 || !this.g || a >= i)) {
            z = false;
        }
        this.g = z;
        return z;
    }

    final void d(boolean z) {
        this.f = 0;
        this.g = false;
        if (z) {
            this.a.e();
        }
    }

    public final synchronized void e(int i) {
        this.d = i * 1000;
    }

    public final synchronized void f(int i) {
        this.e = i * 1000;
    }

    public final synchronized void g(int i) {
        this.c = i * 1000;
    }

    public final synchronized void h(int i) {
        this.b = i * 1000;
    }

    @Override // defpackage.ndf
    public final long zza() {
        return 0L;
    }

    @Override // defpackage.ndf
    public final void zzb() {
        d(false);
    }

    @Override // defpackage.ndf
    public final void zzc() {
        d(true);
    }

    @Override // defpackage.ndf
    public final void zzd() {
        d(true);
    }

    @Override // defpackage.ndf
    public final boolean zzf() {
        return false;
    }

    @Override // defpackage.ndf
    public final s7g zzi() {
        return this.a;
    }
}
