package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import defpackage.dp4;
import defpackage.dyf;
import defpackage.fgb;
import defpackage.h51;
import defpackage.kp4;
import defpackage.tqa;
import defpackage.wxf;

/* loaded from: classes3.dex */
public final class zzbvk implements MediationInterstitialAdapter {
    private Activity a;
    private kp4 b;
    private Uri c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        fgb.b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        fgb.b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        fgb.b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, kp4 kp4Var, Bundle bundle, dp4 dp4Var, Bundle bundle2) {
        this.b = kp4Var;
        if (kp4Var == null) {
            fgb.g("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            fgb.g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.b.b(this, 0);
            return;
        }
        if (!tqa.g(context)) {
            fgb.g("Default browser does not support custom tabs. Bailing out.");
            this.b.b(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            fgb.g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.b.b(this, 0);
        } else {
            this.a = (Activity) context;
            this.c = Uri.parse(string);
            this.b.o(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        h51 a = new h51.b().a();
        a.a.setData(this.c);
        wxf.l.post(new a6(this, new AdOverlayInfoParcel(new zzc(a.a, null), null, new z5(this), null, new zzcei(0, 0, false, false, false), null, null)));
        dyf.q().q();
    }
}
