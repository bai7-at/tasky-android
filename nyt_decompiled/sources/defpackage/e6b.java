package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbvg;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e6b extends n5b {
    private final RtbAdapter a;
    private String b = "";

    public e6b(RtbAdapter rtbAdapter) {
        this.a = rtbAdapter;
    }

    private static final String A6(String str, zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    private final Bundle x6(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle y6(String str) {
        fgb.g("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            fgb.e("", e);
            throw new RemoteException();
        }
    }

    private static final boolean z6(zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        kia.b();
        return tfb.t();
    }

    @Override // defpackage.o5b
    public final boolean F(ee3 ee3Var) {
        return false;
    }

    @Override // defpackage.o5b
    public final void I1(String str, String str2, zzl zzlVar, ee3 ee3Var, c5b c5bVar, t3b t3bVar, zzq zzqVar) {
        try {
            this.a.loadRtbInterscrollerAd(new gp4((Context) fc5.Q1(ee3Var), str, y6(str2), x6(zzlVar), z6(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, A6(str2, zzlVar), vka.c(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.b), new u5b(this, c5bVar, t3bVar));
        } catch (Throwable th) {
            fgb.e("Adapter failed to render interscroller ad.", th);
            e3b.a(ee3Var, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.o5b
    public final void N4(String str, String str2, zzl zzlVar, ee3 ee3Var, z4b z4bVar, t3b t3bVar) {
        try {
            this.a.loadRtbAppOpenAd(new fp4((Context) fc5.Q1(ee3Var), str, y6(str2), x6(zzlVar), z6(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, A6(str2, zzlVar), this.b), new b6b(this, z4bVar, t3bVar));
        } catch (Throwable th) {
            fgb.e("Adapter failed to render app open ad.", th);
            e3b.a(ee3Var, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.o5b
    public final void O1(String str, String str2, zzl zzlVar, ee3 ee3Var, i5b i5bVar, t3b t3bVar) {
        t2(str, str2, zzlVar, ee3Var, i5bVar, t3bVar, null);
    }

    @Override // defpackage.o5b
    public final void Q5(String str, String str2, zzl zzlVar, ee3 ee3Var, l5b l5bVar, t3b t3bVar) {
        try {
            this.a.loadRtbRewardedAd(new np4((Context) fc5.Q1(ee3Var), str, y6(str2), x6(zzlVar), z6(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, A6(str2, zzlVar), this.b), new d6b(this, l5bVar, t3bVar));
        } catch (Throwable th) {
            fgb.e("Adapter failed to render rewarded ad.", th);
            e3b.a(ee3Var, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.o5b
    public final void R4(String str, String str2, zzl zzlVar, ee3 ee3Var, f5b f5bVar, t3b t3bVar) {
        try {
            this.a.loadRtbInterstitialAd(new jp4((Context) fc5.Q1(ee3Var), str, y6(str2), x6(zzlVar), z6(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, A6(str2, zzlVar), this.b), new v5b(this, f5bVar, t3bVar));
        } catch (Throwable th) {
            fgb.e("Adapter failed to render interstitial ad.", th);
            e3b.a(ee3Var, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.o5b
    public final void U(String str) {
        this.b = str;
    }

    @Override // defpackage.o5b
    public final boolean b5(ee3 ee3Var) {
        return false;
    }

    @Override // defpackage.o5b
    public final boolean c0(ee3 ee3Var) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.o5b
    public final void c2(ee3 ee3Var, String str, Bundle bundle, Bundle bundle2, zzq zzqVar, r5b r5bVar) {
        char c;
        AdFormat adFormat;
        try {
            c6b c6bVar = new c6b(this, r5bVar);
            RtbAdapter rtbAdapter = this.a;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    adFormat = AdFormat.BANNER;
                    ip4 ip4Var = new ip4(adFormat, bundle2);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ip4Var);
                    rtbAdapter.collectSignals(new p37((Context) fc5.Q1(ee3Var), arrayList, bundle, vka.c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), c6bVar);
                    return;
                case 1:
                    adFormat = AdFormat.INTERSTITIAL;
                    ip4 ip4Var2 = new ip4(adFormat, bundle2);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ip4Var2);
                    rtbAdapter.collectSignals(new p37((Context) fc5.Q1(ee3Var), arrayList2, bundle, vka.c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), c6bVar);
                    return;
                case 2:
                    adFormat = AdFormat.REWARDED;
                    ip4 ip4Var22 = new ip4(adFormat, bundle2);
                    ArrayList arrayList22 = new ArrayList();
                    arrayList22.add(ip4Var22);
                    rtbAdapter.collectSignals(new p37((Context) fc5.Q1(ee3Var), arrayList22, bundle, vka.c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), c6bVar);
                    return;
                case 3:
                    adFormat = AdFormat.REWARDED_INTERSTITIAL;
                    ip4 ip4Var222 = new ip4(adFormat, bundle2);
                    ArrayList arrayList222 = new ArrayList();
                    arrayList222.add(ip4Var222);
                    rtbAdapter.collectSignals(new p37((Context) fc5.Q1(ee3Var), arrayList222, bundle, vka.c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), c6bVar);
                    return;
                case 4:
                    adFormat = AdFormat.NATIVE;
                    ip4 ip4Var2222 = new ip4(adFormat, bundle2);
                    ArrayList arrayList2222 = new ArrayList();
                    arrayList2222.add(ip4Var2222);
                    rtbAdapter.collectSignals(new p37((Context) fc5.Q1(ee3Var), arrayList2222, bundle, vka.c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), c6bVar);
                    return;
                case 5:
                    adFormat = AdFormat.APP_OPEN_AD;
                    ip4 ip4Var22222 = new ip4(adFormat, bundle2);
                    ArrayList arrayList22222 = new ArrayList();
                    arrayList22222.add(ip4Var22222);
                    rtbAdapter.collectSignals(new p37((Context) fc5.Q1(ee3Var), arrayList22222, bundle, vka.c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), c6bVar);
                    return;
                case 6:
                    if (((Boolean) pla.c().a(mpa.ib)).booleanValue()) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        ip4 ip4Var222222 = new ip4(adFormat, bundle2);
                        ArrayList arrayList222222 = new ArrayList();
                        arrayList222222.add(ip4Var222222);
                        rtbAdapter.collectSignals(new p37((Context) fc5.Q1(ee3Var), arrayList222222, bundle, vka.c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), c6bVar);
                        return;
                    }
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            fgb.e("Error generating signals for RTB", th);
            e3b.a(ee3Var, th, "adapter.collectSignals");
            throw new RemoteException();
        }
    }

    @Override // defpackage.o5b
    public final void o1(String str, String str2, zzl zzlVar, ee3 ee3Var, c5b c5bVar, t3b t3bVar, zzq zzqVar) {
        try {
            this.a.loadRtbBannerAd(new gp4((Context) fc5.Q1(ee3Var), str, y6(str2), x6(zzlVar), z6(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, A6(str2, zzlVar), vka.c(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.b), new t5b(this, c5bVar, t3bVar));
        } catch (Throwable th) {
            fgb.e("Adapter failed to render banner ad.", th);
            e3b.a(ee3Var, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.o5b
    public final void t2(String str, String str2, zzl zzlVar, ee3 ee3Var, i5b i5bVar, t3b t3bVar, zzbjb zzbjbVar) {
        try {
            this.a.loadRtbNativeAd(new lp4((Context) fc5.Q1(ee3Var), str, y6(str2), x6(zzlVar), z6(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, A6(str2, zzlVar), this.b, zzbjbVar), new a6b(this, i5bVar, t3bVar));
        } catch (Throwable th) {
            fgb.e("Adapter failed to render native ad.", th);
            e3b.a(ee3Var, th, "adapter.loadRtbNativeAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.o5b
    public final void y5(String str, String str2, zzl zzlVar, ee3 ee3Var, l5b l5bVar, t3b t3bVar) {
        try {
            this.a.loadRtbRewardedInterstitialAd(new np4((Context) fc5.Q1(ee3Var), str, y6(str2), x6(zzlVar), z6(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, A6(str2, zzlVar), this.b), new d6b(this, l5bVar, t3bVar));
        } catch (Throwable th) {
            fgb.e("Adapter failed to render rewarded interstitial ad.", th);
            e3b.a(ee3Var, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.o5b
    public final znc zze() {
        Object obj = this.a;
        if (obj instanceof nq9) {
            try {
                return ((nq9) obj).getVideoController();
            } catch (Throwable th) {
                fgb.e("", th);
            }
        }
        return null;
    }

    @Override // defpackage.o5b
    public final zzbvg zzf() {
        return zzbvg.t0(this.a.getVersionInfo());
    }

    @Override // defpackage.o5b
    public final zzbvg zzg() {
        return zzbvg.t0(this.a.getSDKVersionInfo());
    }
}
