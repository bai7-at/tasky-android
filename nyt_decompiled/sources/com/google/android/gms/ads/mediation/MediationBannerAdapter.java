package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import defpackage.dp4;
import defpackage.ep4;
import defpackage.hp4;
import defpackage.s7;

@Deprecated
/* loaded from: classes2.dex */
public interface MediationBannerAdapter extends ep4 {
    View getBannerView();

    @Override // defpackage.ep4, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // defpackage.ep4, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // defpackage.ep4, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, hp4 hp4Var, Bundle bundle, s7 s7Var, dp4 dp4Var, Bundle bundle2);
}
