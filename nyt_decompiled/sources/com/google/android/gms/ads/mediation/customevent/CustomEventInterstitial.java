package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import defpackage.dp4;
import defpackage.s41;
import defpackage.u41;

@Deprecated
/* loaded from: classes2.dex */
public interface CustomEventInterstitial extends s41 {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, u41 u41Var, String str, dp4 dp4Var, Bundle bundle);

    void showInterstitial();
}
