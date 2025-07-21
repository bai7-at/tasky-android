package defpackage;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.v2;
import com.google.android.gms.internal.ads.zzbze;

/* loaded from: classes3.dex */
public final class w2c implements r8c, jq9, cac, t7c, w6c, edc {
    private final Clock a;
    private final dfb b;

    public w2c(Clock clock, dfb dfbVar) {
        this.a = clock;
        this.b = dfbVar;
    }

    @Override // defpackage.cac
    public final void F(zzbze zzbzeVar) {
    }

    @Override // defpackage.edc
    public final void K(v2 v2Var) {
        this.b.g();
    }

    public final String a() {
        return this.b.c();
    }

    @Override // defpackage.w6c
    public final void c(iab iabVar, String str, String str2) {
    }

    @Override // defpackage.edc
    public final void c0(boolean z) {
    }

    public final void k(zzl zzlVar) {
        this.b.j(zzlVar);
    }

    @Override // defpackage.edc
    public final void s0(v2 v2Var) {
    }

    @Override // defpackage.edc
    public final void t(boolean z) {
    }

    @Override // defpackage.edc
    public final void u0(v2 v2Var) {
        this.b.i();
    }

    @Override // defpackage.jq9
    public final void v() {
        this.b.d();
    }

    @Override // defpackage.cac
    public final void y0(g1e g1eVar) {
        this.b.k(this.a.elapsedRealtime());
    }

    @Override // defpackage.w6c
    public final void zza() {
        this.b.e();
    }

    @Override // defpackage.w6c
    public final void zzb() {
    }

    @Override // defpackage.w6c
    public final void zzc() {
    }

    @Override // defpackage.w6c
    public final void zze() {
    }

    @Override // defpackage.w6c
    public final void zzf() {
    }

    @Override // defpackage.edc
    public final void zzh() {
    }

    @Override // defpackage.t7c
    public final void zzq() {
        this.b.f();
    }

    @Override // defpackage.r8c
    public final void zzr() {
        this.b.h(true);
    }
}
