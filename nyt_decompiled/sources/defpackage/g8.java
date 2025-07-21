package defpackage;

import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class g8 {
    public abstract d59 getSDKVersionInfo();

    public abstract d59 getVersionInfo();

    public abstract void initialize(Context context, tj3 tj3Var, List<ip4> list);

    public void loadAppOpenAd(fp4 fp4Var, cp4 cp4Var) {
        cp4Var.a(new c6(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads"));
    }

    public void loadBannerAd(gp4 gp4Var, cp4 cp4Var) {
        cp4Var.a(new c6(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    public void loadInterscrollerAd(gp4 gp4Var, cp4 cp4Var) {
        cp4Var.a(new c6(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(jp4 jp4Var, cp4 cp4Var) {
        cp4Var.a(new c6(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAd(lp4 lp4Var, cp4 cp4Var) {
        cp4Var.a(new c6(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(np4 np4Var, cp4 cp4Var) {
        cp4Var.a(new c6(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(np4 np4Var, cp4 cp4Var) {
        cp4Var.a(new c6(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
