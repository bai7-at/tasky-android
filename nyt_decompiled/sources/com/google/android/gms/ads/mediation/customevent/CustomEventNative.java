package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import defpackage.a25;
import defpackage.s41;
import defpackage.v41;

@Deprecated
/* loaded from: classes2.dex */
public interface CustomEventNative extends s41 {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, v41 v41Var, String str, a25 a25Var, Bundle bundle);
}
