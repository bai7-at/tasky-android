package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import defpackage.a25;
import defpackage.a8;
import defpackage.dp4;
import defpackage.hp4;
import defpackage.kia;
import defpackage.kp4;
import defpackage.mp4;
import defpackage.n7;
import defpackage.nq9;
import defpackage.q6;
import defpackage.s7;
import defpackage.tfb;
import defpackage.vq3;
import defpackage.we5;
import defpackage.znc;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, we5, nq9 {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private q6 adLoader;
    protected a8 mAdView;
    protected vq3 mInterstitialAd;

    n7 buildAdRequest(Context context, dp4 dp4Var, Bundle bundle, Bundle bundle2) {
        n7.a aVar = new n7.a();
        Set g = dp4Var.g();
        if (g != null) {
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                aVar.a((String) it2.next());
            }
        }
        if (dp4Var.d()) {
            kia.b();
            aVar.e(tfb.A(context));
        }
        if (dp4Var.b() != -1) {
            aVar.g(dp4Var.b() == 1);
        }
        aVar.f(dp4Var.c());
        aVar.b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.h();
    }

    protected abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    vq3 getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // defpackage.nq9
    public znc getVideoController() {
        a8 a8Var = this.mAdView;
        if (a8Var != null) {
            return a8Var.e().b();
        }
        return null;
    }

    q6.a newAdLoader(Context context, String str) {
        return new q6.a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.ep4, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        a8 a8Var = this.mAdView;
        if (a8Var != null) {
            a8Var.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // defpackage.we5
    public void onImmersiveModeUpdated(boolean z) {
        vq3 vq3Var = this.mInterstitialAd;
        if (vq3Var != null) {
            vq3Var.d(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.ep4, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        a8 a8Var = this.mAdView;
        if (a8Var != null) {
            a8Var.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.ep4, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        a8 a8Var = this.mAdView;
        if (a8Var != null) {
            a8Var.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, hp4 hp4Var, Bundle bundle, s7 s7Var, dp4 dp4Var, Bundle bundle2) {
        a8 a8Var = new a8(context);
        this.mAdView = a8Var;
        a8Var.setAdSize(new s7(s7Var.c(), s7Var.a()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, hp4Var));
        this.mAdView.b(buildAdRequest(context, dp4Var, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, kp4 kp4Var, Bundle bundle, dp4 dp4Var, Bundle bundle2) {
        vq3.b(context, getAdUnitId(bundle), buildAdRequest(context, dp4Var, bundle2, bundle), new c(this, kp4Var));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, mp4 mp4Var, Bundle bundle, a25 a25Var, Bundle bundle2) {
        e eVar = new e(this, mp4Var);
        q6.a c = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).c(eVar);
        c.g(a25Var.e());
        c.d(a25Var.a());
        if (a25Var.f()) {
            c.f(eVar);
        }
        if (a25Var.zzb()) {
            for (String str : a25Var.zza().keySet()) {
                c.e(str, eVar, true != ((Boolean) a25Var.zza().get(str)).booleanValue() ? null : eVar);
            }
        }
        q6 a = c.a();
        this.adLoader = a;
        a.a(buildAdRequest(context, a25Var, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        vq3 vq3Var = this.mInterstitialAd;
        if (vq3Var != null) {
            vq3Var.e(null);
        }
    }
}
