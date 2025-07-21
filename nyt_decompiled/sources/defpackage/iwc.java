package defpackage;

/* loaded from: classes3.dex */
public final class iwc {
    private final vya a;

    iwc(vya vyaVar) {
        this.a = vyaVar;
    }

    private final void s(hwc hwcVar) {
        String a = hwc.a(hwcVar);
        fgb.f("Dispatching AFMA event on publisher webview: ".concat(a));
        this.a.f(a);
    }

    public final void a() {
        s(new hwc("initialize", null));
    }

    public final void b(long j) {
        hwc hwcVar = new hwc("interstitial", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onAdClicked";
        this.a.f(hwc.a(hwcVar));
    }

    public final void c(long j) {
        hwc hwcVar = new hwc("interstitial", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onAdClosed";
        s(hwcVar);
    }

    public final void d(long j, int i) {
        hwc hwcVar = new hwc("interstitial", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onAdFailedToLoad";
        hwcVar.d = Integer.valueOf(i);
        s(hwcVar);
    }

    public final void e(long j) {
        hwc hwcVar = new hwc("interstitial", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onAdLoaded";
        s(hwcVar);
    }

    public final void f(long j) {
        hwc hwcVar = new hwc("interstitial", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onNativeAdObjectNotAvailable";
        s(hwcVar);
    }

    public final void g(long j) {
        hwc hwcVar = new hwc("interstitial", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onAdOpened";
        s(hwcVar);
    }

    public final void h(long j) {
        hwc hwcVar = new hwc("creation", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "nativeObjectCreated";
        s(hwcVar);
    }

    public final void i(long j) {
        hwc hwcVar = new hwc("creation", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "nativeObjectNotCreated";
        s(hwcVar);
    }

    public final void j(long j) {
        hwc hwcVar = new hwc("rewarded", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onAdClicked";
        s(hwcVar);
    }

    public final void k(long j) {
        hwc hwcVar = new hwc("rewarded", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onRewardedAdClosed";
        s(hwcVar);
    }

    public final void l(long j, zbb zbbVar) {
        hwc hwcVar = new hwc("rewarded", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onUserEarnedReward";
        hwcVar.e = zbbVar.zzf();
        hwcVar.f = Integer.valueOf(zbbVar.zze());
        s(hwcVar);
    }

    public final void m(long j, int i) {
        hwc hwcVar = new hwc("rewarded", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onRewardedAdFailedToLoad";
        hwcVar.d = Integer.valueOf(i);
        s(hwcVar);
    }

    public final void n(long j, int i) {
        hwc hwcVar = new hwc("rewarded", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onRewardedAdFailedToShow";
        hwcVar.d = Integer.valueOf(i);
        s(hwcVar);
    }

    public final void o(long j) {
        hwc hwcVar = new hwc("rewarded", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onAdImpression";
        s(hwcVar);
    }

    public final void p(long j) {
        hwc hwcVar = new hwc("rewarded", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onRewardedAdLoaded";
        s(hwcVar);
    }

    public final void q(long j) {
        hwc hwcVar = new hwc("rewarded", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onNativeAdObjectNotAvailable";
        s(hwcVar);
    }

    public final void r(long j) {
        hwc hwcVar = new hwc("rewarded", null);
        hwcVar.a = Long.valueOf(j);
        hwcVar.c = "onRewardedAdOpened";
        s(hwcVar);
    }
}
