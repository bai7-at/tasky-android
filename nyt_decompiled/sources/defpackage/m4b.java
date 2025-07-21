package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbvg;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m4b extends j3b {
    private final Object a;
    private n4b b;
    private vbb c;
    private ee3 d;
    private View e;
    private sw8 f;
    private final String g = "";

    public m4b(g8 g8Var) {
        this.a = g8Var;
    }

    private final Bundle w6(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle x6(String str, zzl zzlVar, String str2) {
        fgb.b("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            fgb.e("", th);
            throw new RemoteException();
        }
    }

    private static final boolean y6(zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        kia.b();
        return tfb.t();
    }

    private static final String z6(String str, zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // defpackage.k3b
    public final void C1(ee3 ee3Var) {
        Object obj = this.a;
        if (obj instanceof g8) {
            fgb.b("Show app open ad from adapter.");
            fgb.d("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        fgb.g(g8.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // defpackage.k3b
    public final void D() {
        Object obj = this.a;
        if (obj instanceof ep4) {
            try {
                ((ep4) obj).onPause();
            } catch (Throwable th) {
                fgb.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // defpackage.k3b
    public final void E3(zzl zzlVar, String str, String str2) {
        Object obj = this.a;
        if (obj instanceof g8) {
            N2(this.d, zzlVar, str, new o4b((g8) obj, this.c));
            return;
        }
        fgb.g(g8.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // defpackage.k3b
    public final boolean H() {
        return false;
    }

    @Override // defpackage.k3b
    public final void H2(ee3 ee3Var, zzl zzlVar, String str, t3b t3bVar) {
        Object obj = this.a;
        if (!(obj instanceof g8)) {
            fgb.g(g8.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        fgb.b("Requesting app open ad from adapter.");
        try {
            ((g8) this.a).loadAppOpenAd(new fp4((Context) fc5.Q1(ee3Var), "", x6(str, zzlVar, null), w6(zzlVar), y6(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, z6(str, zzlVar), ""), new l4b(this, t3bVar));
        } catch (Exception e) {
            fgb.e("", e);
            e3b.a(ee3Var, e, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.k3b
    public final void J1(ee3 ee3Var) {
        Object obj = this.a;
        if ((obj instanceof g8) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                r();
                return;
            } else {
                fgb.b("Show interstitial ad from adapter.");
                fgb.d("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        fgb.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + g8.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // defpackage.k3b
    public final void N2(ee3 ee3Var, zzl zzlVar, String str, t3b t3bVar) {
        Object obj = this.a;
        if (!(obj instanceof g8)) {
            fgb.g(g8.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        fgb.b("Requesting rewarded ad from adapter.");
        try {
            ((g8) this.a).loadRewardedAd(new np4((Context) fc5.Q1(ee3Var), "", x6(str, zzlVar, null), w6(zzlVar), y6(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, z6(str, zzlVar), ""), new k4b(this, t3bVar));
        } catch (Exception e) {
            fgb.e("", e);
            e3b.a(ee3Var, e, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.k3b
    public final void O2(ee3 ee3Var, zzl zzlVar, String str, vbb vbbVar, String str2) {
        Object obj = this.a;
        if ((obj instanceof g8) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.d = ee3Var;
            this.c = vbbVar;
            vbbVar.zzl(fc5.l3(this.a));
            return;
        }
        Object obj2 = this.a;
        fgb.g(g8.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // defpackage.k3b
    public final void O5(ee3 ee3Var) {
    }

    @Override // defpackage.k3b
    public final void Q(boolean z) {
        Object obj = this.a;
        if (obj instanceof we5) {
            try {
                ((we5) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                fgb.e("", th);
                return;
            }
        }
        fgb.b(we5.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // defpackage.k3b
    public final void Q4(ee3 ee3Var, zzq zzqVar, zzl zzlVar, String str, String str2, t3b t3bVar) {
        Object obj = this.a;
        if (!(obj instanceof g8)) {
            fgb.g(g8.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        fgb.b("Requesting interscroller ad from adapter.");
        try {
            g8 g8Var = (g8) this.a;
            g8Var.loadInterscrollerAd(new gp4((Context) fc5.Q1(ee3Var), "", x6(str, zzlVar, str2), w6(zzlVar), y6(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, z6(str, zzlVar), vka.e(zzqVar.zze, zzqVar.zzb), ""), new f4b(this, t3bVar, g8Var));
        } catch (Exception e) {
            fgb.e("", e);
            e3b.a(ee3Var, e, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.k3b
    public final void R2(ee3 ee3Var, vbb vbbVar, List list) {
        fgb.g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // defpackage.k3b
    public final void U2(zzl zzlVar, String str) {
        E3(zzlVar, str, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.k3b
    public final void W3(ee3 ee3Var, jza jzaVar, List list) {
        char c;
        if (!(this.a instanceof g8)) {
            throw new RemoteException();
        }
        g4b g4bVar = new g4b(this, jzaVar);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            zzbpn zzbpnVar = (zzbpn) it2.next();
            String str = zzbpnVar.zza;
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
            AdFormat adFormat = null;
            switch (c) {
                case 0:
                    adFormat = AdFormat.BANNER;
                    break;
                case 1:
                    adFormat = AdFormat.INTERSTITIAL;
                    break;
                case 2:
                    adFormat = AdFormat.REWARDED;
                    break;
                case 3:
                    adFormat = AdFormat.REWARDED_INTERSTITIAL;
                    break;
                case 4:
                    adFormat = AdFormat.NATIVE;
                    break;
                case 5:
                    adFormat = AdFormat.APP_OPEN_AD;
                    break;
                case 6:
                    if (((Boolean) pla.c().a(mpa.ib)).booleanValue()) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    }
                    break;
            }
            if (adFormat != null) {
                arrayList.add(new ip4(adFormat, zzbpnVar.zzb));
            }
        }
        ((g8) this.a).initialize((Context) fc5.Q1(ee3Var), g4bVar, arrayList);
    }

    @Override // defpackage.k3b
    public final void Z4(ee3 ee3Var, zzl zzlVar, String str, t3b t3bVar) {
        Object obj = this.a;
        if (obj instanceof g8) {
            fgb.b("Requesting rewarded interstitial ad from adapter.");
            try {
                ((g8) this.a).loadRewardedInterstitialAd(new np4((Context) fc5.Q1(ee3Var), "", x6(str, zzlVar, null), w6(zzlVar), y6(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, z6(str, zzlVar), ""), new k4b(this, t3bVar));
                return;
            } catch (Exception e) {
                e3b.a(ee3Var, e, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        fgb.g(g8.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // defpackage.k3b
    public final void d1(ee3 ee3Var, zzl zzlVar, String str, String str2, t3b t3bVar, zzbjb zzbjbVar, List list) {
        Object obj = this.a;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof g8)) {
            fgb.g(MediationNativeAdapter.class.getCanonicalName() + " or " + g8.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        fgb.b("Requesting native ad from adapter.");
        Object obj2 = this.a;
        if (!(obj2 instanceof MediationNativeAdapter)) {
            if (obj2 instanceof g8) {
                try {
                    ((g8) obj2).loadNativeAd(new lp4((Context) fc5.Q1(ee3Var), "", x6(str, zzlVar, str2), w6(zzlVar), y6(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, z6(str, zzlVar), this.g, zzbjbVar), new j4b(this, t3bVar));
                    return;
                } catch (Throwable th) {
                    fgb.e("", th);
                    e3b.a(ee3Var, th, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
            List list2 = zzlVar.zze;
            HashSet hashSet = list2 != null ? new HashSet(list2) : null;
            long j = zzlVar.zzb;
            p4b p4bVar = new p4b(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, y6(zzlVar), zzlVar.zzg, zzbjbVar, list, zzlVar.zzr, zzlVar.zzt, z6(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.b = new n4b(t3bVar);
            mediationNativeAdapter.requestNativeAd((Context) fc5.Q1(ee3Var), this.b, x6(str, zzlVar, str2), p4bVar, bundle2);
        } catch (Throwable th2) {
            fgb.e("", th2);
            e3b.a(ee3Var, th2, "adapter.requestNativeAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.k3b
    public final void g5(ee3 ee3Var, zzl zzlVar, String str, String str2, t3b t3bVar) {
        Object obj = this.a;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof g8)) {
            fgb.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + g8.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        fgb.b("Requesting interstitial ad from adapter.");
        Object obj2 = this.a;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof g8) {
                try {
                    ((g8) obj2).loadInterstitialAd(new jp4((Context) fc5.Q1(ee3Var), "", x6(str, zzlVar, str2), w6(zzlVar), y6(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, z6(str, zzlVar), this.g), new i4b(this, t3bVar));
                    return;
                } catch (Throwable th) {
                    fgb.e("", th);
                    e3b.a(ee3Var, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List list = zzlVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzlVar.zzb;
            e4b e4bVar = new e4b(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, y6(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, z6(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) fc5.Q1(ee3Var), new n4b(t3bVar), x6(str, zzlVar, str2), e4bVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            fgb.e("", th2);
            e3b.a(ee3Var, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // defpackage.k3b
    public final void h() {
        Object obj = this.a;
        if (obj instanceof ep4) {
            try {
                ((ep4) obj).onResume();
            } catch (Throwable th) {
                fgb.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // defpackage.k3b
    public final z3b j() {
        return null;
    }

    @Override // defpackage.k3b
    public final void r() {
        Object obj = this.a;
        if (obj instanceof MediationInterstitialAdapter) {
            fgb.b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.a).showInterstitial();
                return;
            } catch (Throwable th) {
                fgb.e("", th);
                throw new RemoteException();
            }
        }
        fgb.g(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // defpackage.k3b
    public final void u() {
        Object obj = this.a;
        if (obj instanceof g8) {
            fgb.d("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        fgb.g(g8.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // defpackage.k3b
    public final void u4(ee3 ee3Var, zzl zzlVar, String str, t3b t3bVar) {
        g5(ee3Var, zzlVar, str, null, t3bVar);
    }

    @Override // defpackage.k3b
    public final void x0(ee3 ee3Var) {
        Object obj = this.a;
        if (obj instanceof g8) {
            fgb.b("Show rewarded ad from adapter.");
            fgb.d("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        fgb.g(g8.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // defpackage.k3b
    public final void x3(ee3 ee3Var, zzq zzqVar, zzl zzlVar, String str, t3b t3bVar) {
        z4(ee3Var, zzqVar, zzlVar, str, null, t3bVar);
    }

    @Override // defpackage.k3b
    public final void z4(ee3 ee3Var, zzq zzqVar, zzl zzlVar, String str, String str2, t3b t3bVar) {
        String str3;
        Object obj = this.a;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof g8)) {
            fgb.g(MediationBannerAdapter.class.getCanonicalName() + " or " + g8.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        fgb.b("Requesting banner ad from adapter.");
        s7 d = zzqVar.zzn ? vka.d(zzqVar.zze, zzqVar.zzb) : vka.c(zzqVar.zze, zzqVar.zzb, zzqVar.zza);
        Object obj2 = this.a;
        if (obj2 instanceof MediationBannerAdapter) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                List list = zzlVar.zze;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j = zzlVar.zzb;
                e4b e4bVar = new e4b(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, y6(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, z6(str, zzlVar));
                Bundle bundle = zzlVar.zzm;
                mediationBannerAdapter.requestBannerAd((Context) fc5.Q1(ee3Var), new n4b(t3bVar), x6(str, zzlVar, str2), d, e4bVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                fgb.e("", th);
                e3b.a(ee3Var, th, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        }
        if (!(obj2 instanceof g8)) {
            return;
        }
        try {
            str3 = "";
            try {
                ((g8) obj2).loadBannerAd(new gp4((Context) fc5.Q1(ee3Var), "", x6(str, zzlVar, str2), w6(zzlVar), y6(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, z6(str, zzlVar), d, this.g), new h4b(this, t3bVar));
            } catch (Throwable th2) {
                th = th2;
                fgb.e(str3, th);
                e3b.a(ee3Var, th, "adapter.loadBannerAd");
                throw new RemoteException();
            }
        } catch (Throwable th3) {
            th = th3;
            str3 = "";
        }
    }

    @Override // defpackage.k3b
    public final boolean zzN() {
        Object obj = this.a;
        if ((obj instanceof g8) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.c != null;
        }
        Object obj2 = this.a;
        fgb.g(g8.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // defpackage.k3b
    public final y3b zzO() {
        return null;
    }

    @Override // defpackage.k3b
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // defpackage.k3b
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // defpackage.k3b
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // defpackage.k3b
    public final znc zzh() {
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

    @Override // defpackage.k3b
    public final jua zzi() {
        kua u;
        n4b n4bVar = this.b;
        if (n4bVar == null || (u = n4bVar.u()) == null) {
            return null;
        }
        return u.a();
    }

    @Override // defpackage.k3b
    public final w3b zzj() {
        return null;
    }

    @Override // defpackage.k3b
    public final c4b zzk() {
        sw8 sw8Var;
        sw8 t;
        Object obj = this.a;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof g8) || (sw8Var = this.f) == null) {
                return null;
            }
            return new w4b(sw8Var);
        }
        n4b n4bVar = this.b;
        if (n4bVar == null || (t = n4bVar.t()) == null) {
            return null;
        }
        return new w4b(t);
    }

    @Override // defpackage.k3b
    public final zzbvg zzl() {
        Object obj = this.a;
        if (obj instanceof g8) {
            return zzbvg.t0(((g8) obj).getVersionInfo());
        }
        return null;
    }

    @Override // defpackage.k3b
    public final zzbvg zzm() {
        Object obj = this.a;
        if (obj instanceof g8) {
            return zzbvg.t0(((g8) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // defpackage.k3b
    public final ee3 zzn() {
        Object obj = this.a;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return fc5.l3(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                fgb.e("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof g8) {
            return fc5.l3(this.e);
        }
        fgb.g(MediationBannerAdapter.class.getCanonicalName() + " or " + g8.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // defpackage.k3b
    public final void zzo() {
        Object obj = this.a;
        if (obj instanceof ep4) {
            try {
                ((ep4) obj).onDestroy();
            } catch (Throwable th) {
                fgb.e("", th);
                throw new RemoteException();
            }
        }
    }

    public m4b(ep4 ep4Var) {
        this.a = ep4Var;
    }
}
