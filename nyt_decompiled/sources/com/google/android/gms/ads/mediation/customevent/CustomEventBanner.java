package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import defpackage.dp4;
import defpackage.s41;
import defpackage.s7;
import defpackage.t41;

@Deprecated
/* loaded from: classes2.dex */
public interface CustomEventBanner extends s41 {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, t41 t41Var, String str, s7 s7Var, dp4 dp4Var, Bundle bundle);
}
