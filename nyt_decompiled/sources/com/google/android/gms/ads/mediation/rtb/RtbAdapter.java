package com.google.android.gms.ads.mediation.rtb;

import defpackage.as7;
import defpackage.c6;
import defpackage.cp4;
import defpackage.fp4;
import defpackage.g8;
import defpackage.gp4;
import defpackage.jp4;
import defpackage.lp4;
import defpackage.np4;
import defpackage.p37;

/* loaded from: classes2.dex */
public abstract class RtbAdapter extends g8 {
    public abstract void collectSignals(p37 p37Var, as7 as7Var);

    public void loadRtbAppOpenAd(fp4 fp4Var, cp4 cp4Var) {
        loadAppOpenAd(fp4Var, cp4Var);
    }

    public void loadRtbBannerAd(gp4 gp4Var, cp4 cp4Var) {
        loadBannerAd(gp4Var, cp4Var);
    }

    public void loadRtbInterscrollerAd(gp4 gp4Var, cp4 cp4Var) {
        cp4Var.a(new c6(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(jp4 jp4Var, cp4 cp4Var) {
        loadInterstitialAd(jp4Var, cp4Var);
    }

    public void loadRtbNativeAd(lp4 lp4Var, cp4 cp4Var) {
        loadNativeAd(lp4Var, cp4Var);
    }

    public void loadRtbRewardedAd(np4 np4Var, cp4 cp4Var) {
        loadRewardedAd(np4Var, cp4Var);
    }

    public void loadRtbRewardedInterstitialAd(np4 np4Var, cp4 cp4Var) {
        loadRewardedInterstitialAd(np4Var, cp4Var);
    }
}
