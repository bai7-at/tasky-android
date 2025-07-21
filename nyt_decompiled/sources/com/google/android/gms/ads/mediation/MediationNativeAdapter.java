package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import defpackage.a25;
import defpackage.ep4;
import defpackage.mp4;

@Deprecated
/* loaded from: classes2.dex */
public interface MediationNativeAdapter extends ep4 {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, mp4 mp4Var, Bundle bundle, a25 a25Var, Bundle bundle2);
}
