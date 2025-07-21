package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import defpackage.dp4;
import defpackage.ep4;
import defpackage.kp4;

@Deprecated
/* loaded from: classes2.dex */
public interface MediationInterstitialAdapter extends ep4 {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, kp4 kp4Var, Bundle bundle, dp4 dp4Var, Bundle bundle2);

    void showInterstitial();
}
