package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class mpc extends ova {
    private final String a;
    private final jkc b;
    private final rkc c;
    private final zuc d;

    public mpc(String str, jkc jkcVar, rkc rkcVar, zuc zucVar) {
        this.a = str;
        this.b = jkcVar;
        this.c = rkcVar;
        this.d = zucVar;
    }

    @Override // defpackage.pva
    public final boolean A() {
        return this.b.B();
    }

    @Override // defpackage.pva
    public final void F0(zcc zccVar) {
        try {
            if (!zccVar.zzf()) {
                this.d.e();
            }
        } catch (RemoteException e) {
            fgb.c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.b.v(zccVar);
    }

    @Override // defpackage.pva
    public final void F2(bwb bwbVar) {
        this.b.u(bwbVar);
    }

    @Override // defpackage.pva
    public final boolean M2(Bundle bundle) {
        return this.b.E(bundle);
    }

    @Override // defpackage.pva
    public final void S4(Bundle bundle) {
        this.b.r(bundle);
    }

    @Override // defpackage.pva
    public final void Z2(mva mvaVar) {
        this.b.w(mvaVar);
    }

    @Override // defpackage.pva
    public final List a() {
        return m() ? this.c.h() : Collections.emptyList();
    }

    @Override // defpackage.pva
    public final List c() {
        return this.c.g();
    }

    @Override // defpackage.pva
    public final void e() {
        this.b.a();
    }

    @Override // defpackage.pva
    public final String g() {
        return this.c.e();
    }

    @Override // defpackage.pva
    public final void l() {
        this.b.Y();
    }

    @Override // defpackage.pva
    public final boolean m() {
        return (this.c.h().isEmpty() || this.c.X() == null) ? false : true;
    }

    @Override // defpackage.pva
    public final void m0() {
        this.b.t();
    }

    @Override // defpackage.pva
    public final void o() {
        this.b.n();
    }

    @Override // defpackage.pva
    public final void u6(m0c m0cVar) {
        this.b.i(m0cVar);
    }

    @Override // defpackage.pva
    public final void z3(Bundle bundle) {
        this.b.m(bundle);
    }

    @Override // defpackage.pva
    public final double zze() {
        return this.c.A();
    }

    @Override // defpackage.pva
    public final Bundle zzf() {
        return this.c.Q();
    }

    @Override // defpackage.pva
    public final qkc zzg() {
        if (((Boolean) pla.c().a(mpa.N6)).booleanValue()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.pva
    public final znc zzh() {
        return this.c.W();
    }

    @Override // defpackage.pva
    public final fta zzi() {
        return this.c.Y();
    }

    @Override // defpackage.pva
    public final jta zzj() {
        return this.b.N().a();
    }

    @Override // defpackage.pva
    public final mta zzk() {
        return this.c.a0();
    }

    @Override // defpackage.pva
    public final ee3 zzl() {
        return this.c.i0();
    }

    @Override // defpackage.pva
    public final ee3 zzm() {
        return fc5.l3(this.b);
    }

    @Override // defpackage.pva
    public final String zzn() {
        return this.c.k0();
    }

    @Override // defpackage.pva
    public final String zzo() {
        return this.c.l0();
    }

    @Override // defpackage.pva
    public final String zzp() {
        return this.c.m0();
    }

    @Override // defpackage.pva
    public final String zzq() {
        return this.c.b();
    }

    @Override // defpackage.pva
    public final String zzr() {
        return this.a;
    }

    @Override // defpackage.pva
    public final String zzs() {
        return this.c.d();
    }
}
