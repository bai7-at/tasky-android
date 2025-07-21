package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class w2b extends vnb {
    private final qm a;

    w2b(qm qmVar) {
        this.a = qmVar;
    }

    @Override // defpackage.wnb
    public final void C(String str) {
        this.a.c(str);
    }

    @Override // defpackage.wnb
    public final Bundle G(Bundle bundle) {
        return this.a.p(bundle);
    }

    @Override // defpackage.wnb
    public final void L5(String str, String str2, ee3 ee3Var) {
        this.a.u(str, str2, ee3Var != null ? fc5.Q1(ee3Var) : null);
    }

    @Override // defpackage.wnb
    public final void M(Bundle bundle) {
        this.a.r(bundle);
    }

    @Override // defpackage.wnb
    public final void R5(ee3 ee3Var, String str, String str2) {
        this.a.t(ee3Var != null ? (Activity) fc5.Q1(ee3Var) : null, str, str2);
    }

    @Override // defpackage.wnb
    public final Map U5(String str, String str2, boolean z) {
        return this.a.m(str, str2, z);
    }

    @Override // defpackage.wnb
    public final void c6(String str, String str2, Bundle bundle) {
        this.a.b(str, str2, bundle);
    }

    @Override // defpackage.wnb
    public final int f(String str) {
        return this.a.l(str);
    }

    @Override // defpackage.wnb
    public final void n0(Bundle bundle) {
        this.a.s(bundle);
    }

    @Override // defpackage.wnb
    public final List r2(String str, String str2) {
        return this.a.g(str, str2);
    }

    @Override // defpackage.wnb
    public final void v5(String str, String str2, Bundle bundle) {
        this.a.n(str, str2, bundle);
    }

    @Override // defpackage.wnb
    public final void x(String str) {
        this.a.a(str);
    }

    @Override // defpackage.wnb
    public final void y(Bundle bundle) {
        this.a.o(bundle);
    }

    @Override // defpackage.wnb
    public final long zzc() {
        return this.a.d();
    }

    @Override // defpackage.wnb
    public final String zze() {
        return this.a.e();
    }

    @Override // defpackage.wnb
    public final String zzf() {
        return this.a.f();
    }

    @Override // defpackage.wnb
    public final String zzg() {
        return this.a.h();
    }

    @Override // defpackage.wnb
    public final String zzh() {
        return this.a.i();
    }

    @Override // defpackage.wnb
    public final String zzi() {
        return this.a.j();
    }
}
