package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzflg;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class bwc implements jl, cac, jq9, w6c, t7c, u7c, r8c, c7c, d6e {
    private final List a;
    private final lvc b;
    private long c;

    public bwc(lvc lvcVar, aob aobVar) {
        this.b = lvcVar;
        this.a = Collections.singletonList(aobVar);
    }

    private final void K(Class cls, String str, Object... objArr) {
        this.b.a(this.a, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // defpackage.u7c
    public final void E(Context context) {
        K(u7c.class, "onResume", context);
    }

    @Override // defpackage.cac
    public final void F(zzbze zzbzeVar) {
        this.c = dyf.b().elapsedRealtime();
        K(cac.class, "onAdRequest", new Object[0]);
    }

    @Override // defpackage.d6e
    public final void I(zzflg zzflgVar, String str) {
        K(y5e.class, "onTaskCreated", str);
    }

    @Override // defpackage.d6e
    public final void a(zzflg zzflgVar, String str) {
        K(y5e.class, "onTaskStarted", str);
    }

    @Override // defpackage.w6c
    public final void c(iab iabVar, String str, String str2) {
        K(w6c.class, "onRewarded", iabVar, str, str2);
    }

    @Override // defpackage.d6e
    public final void k(zzflg zzflgVar, String str) {
        K(y5e.class, "onTaskSucceeded", str);
    }

    @Override // defpackage.u7c
    public final void l(Context context) {
        K(u7c.class, "onDestroy", context);
    }

    @Override // defpackage.c7c
    public final void n(zze zzeVar) {
        K(c7c.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // defpackage.d6e
    public final void s(zzflg zzflgVar, String str, Throwable th) {
        K(y5e.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // defpackage.u7c
    public final void t(Context context) {
        K(u7c.class, "onPause", context);
    }

    @Override // defpackage.jq9
    public final void v() {
        K(jq9.class, "onAdClicked", new Object[0]);
    }

    @Override // defpackage.jl
    public final void x(String str, String str2) {
        K(jl.class, "onAppEvent", str, str2);
    }

    @Override // defpackage.cac
    public final void y0(g1e g1eVar) {
    }

    @Override // defpackage.w6c
    public final void zza() {
        K(w6c.class, "onAdClosed", new Object[0]);
    }

    @Override // defpackage.w6c
    public final void zzb() {
        K(w6c.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // defpackage.w6c
    public final void zzc() {
        K(w6c.class, "onAdOpened", new Object[0]);
    }

    @Override // defpackage.w6c
    public final void zze() {
        K(w6c.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // defpackage.w6c
    public final void zzf() {
        K(w6c.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // defpackage.t7c
    public final void zzq() {
        K(t7c.class, "onAdImpression", new Object[0]);
    }

    @Override // defpackage.r8c
    public final void zzr() {
        pzc.k("Ad Request Latency : " + (dyf.b().elapsedRealtime() - this.c));
        K(r8c.class, "onAdLoaded", new Object[0]);
    }
}
