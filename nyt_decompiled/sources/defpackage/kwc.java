package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzl;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class kwc extends wya {
    private final nwc a;
    private final iwc b;
    private final Map c = new HashMap();

    kwc(nwc nwcVar, iwc iwcVar) {
        this.a = nwcVar;
        this.b = iwcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static zzl w6(Map map) {
        char c;
        dff dffVar = new dff();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return dffVar.a();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
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
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        dffVar.b(bundle);
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        dffVar.e(arrayList);
                        break;
                    case 2:
                        dffVar.d(jsonReader.nextBoolean());
                        break;
                    case 3:
                        if (!jsonReader.nextBoolean()) {
                            dffVar.g(0);
                            break;
                        } else {
                            dffVar.g(1);
                            break;
                        }
                    case 4:
                        if (!jsonReader.nextBoolean()) {
                            dffVar.h(0);
                            break;
                        } else {
                            dffVar.h(1);
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!RequestConfiguration.f.contains(nextString)) {
                            break;
                        } else {
                            dffVar.f(nextString);
                            break;
                        }
                    case 6:
                        dffVar.c(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            fgb.b("Ad Request json was malformed, parsing ended early.");
        }
        zzl a = dffVar.a();
        Bundle bundle2 = a.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = a.zzc;
            a.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new zzl(a.zza, a.zzb, bundle2, a.zzd, a.zze, a.zzf, a.zzg, a.zzh, a.zzi, a.zzj, a.zzk, a.zzl, a.zzm, a.zzn, a.zzo, a.zzp, a.zzq, a.zzr, a.zzs, a.zzt, a.zzu, a.zzv, a.zzw, a.zzx, a.zzy);
    }

    @Override // defpackage.xya
    public final void n(String str) {
        boolean z;
        long parseLong;
        if (((Boolean) pla.c().a(mpa.F9)).booleanValue()) {
            pzc.k("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri parse = Uri.parse(str);
            dyf.r();
            Map o = wxf.o(parse);
            String str2 = (String) o.get("action");
            if (TextUtils.isEmpty(str2)) {
                fgb.b("H5 gmsg did not contain an action");
                return;
            }
            int hashCode = str2.hashCode();
            if (hashCode != 579053441) {
                if (hashCode == 871091088 && str2.equals("initialize")) {
                    z = false;
                }
                z = -1;
            } else {
                if (str2.equals("dispose_all")) {
                    z = true;
                }
                z = -1;
            }
            if (!z) {
                this.c.clear();
                this.b.a();
                return;
            }
            if (z) {
                Iterator it2 = this.c.values().iterator();
                while (it2.hasNext()) {
                    ((dwc) it2.next()).zza();
                }
                this.c.clear();
                return;
            }
            String str3 = (String) o.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                parseLong = Long.parseLong(str3);
                switch (str2) {
                    case "create_interstitial_ad":
                        if (this.c.size() < ((Integer) pla.c().a(mpa.G9)).intValue()) {
                            Map map = this.c;
                            Long valueOf = Long.valueOf(parseLong);
                            if (!map.containsKey(valueOf)) {
                                String str4 = (String) o.get("ad_unit");
                                if (!TextUtils.isEmpty(str4)) {
                                    ewc zzb = this.a.zzb();
                                    zzb.b(parseLong);
                                    zzb.a(str4);
                                    this.c.put(valueOf, zzb.zzc().zza());
                                    this.b.h(parseLong);
                                    pzc.k("Created H5 interstitial #" + parseLong + " with ad unit " + str4);
                                    break;
                                } else {
                                    fgb.g("Could not create H5 ad, missing ad unit id");
                                    this.b.i(parseLong);
                                    break;
                                }
                            } else {
                                fgb.b("Could not create H5 ad, object ID already exists");
                                this.b.i(parseLong);
                                break;
                            }
                        } else {
                            fgb.g("Could not create H5 ad, too many existing objects");
                            this.b.i(parseLong);
                            break;
                        }
                    case "load_interstitial_ad":
                        dwc dwcVar = (dwc) this.c.get(Long.valueOf(parseLong));
                        if (dwcVar != null) {
                            dwcVar.a(w6(o));
                            break;
                        } else {
                            fgb.b("Could not load H5 ad, object ID does not exist");
                            this.b.f(parseLong);
                            break;
                        }
                    case "show_interstitial_ad":
                        dwc dwcVar2 = (dwc) this.c.get(Long.valueOf(parseLong));
                        if (dwcVar2 != null) {
                            dwcVar2.zzc();
                            break;
                        } else {
                            fgb.b("Could not show H5 ad, object ID does not exist");
                            this.b.f(parseLong);
                            break;
                        }
                    case "create_rewarded_ad":
                        if (this.c.size() < ((Integer) pla.c().a(mpa.G9)).intValue()) {
                            Map map2 = this.c;
                            Long valueOf2 = Long.valueOf(parseLong);
                            if (!map2.containsKey(valueOf2)) {
                                String str5 = (String) o.get("ad_unit");
                                if (!TextUtils.isEmpty(str5)) {
                                    ewc zzb2 = this.a.zzb();
                                    zzb2.b(parseLong);
                                    zzb2.a(str5);
                                    this.c.put(valueOf2, zzb2.zzc().zzb());
                                    this.b.h(parseLong);
                                    pzc.k("Created H5 rewarded #" + parseLong + " with ad unit " + str5);
                                    break;
                                } else {
                                    fgb.g("Could not create H5 ad, missing ad unit id");
                                    this.b.i(parseLong);
                                    break;
                                }
                            } else {
                                fgb.b("Could not create H5 ad, object ID already exists");
                                this.b.i(parseLong);
                                break;
                            }
                        } else {
                            fgb.g("Could not create H5 ad, too many existing objects");
                            this.b.i(parseLong);
                            break;
                        }
                    case "load_rewarded_ad":
                        dwc dwcVar3 = (dwc) this.c.get(Long.valueOf(parseLong));
                        if (dwcVar3 != null) {
                            dwcVar3.a(w6(o));
                            break;
                        } else {
                            fgb.b("Could not load H5 ad, object ID does not exist");
                            this.b.q(parseLong);
                            break;
                        }
                    case "show_rewarded_ad":
                        dwc dwcVar4 = (dwc) this.c.get(Long.valueOf(parseLong));
                        if (dwcVar4 != null) {
                            dwcVar4.zzc();
                            break;
                        } else {
                            fgb.b("Could not show H5 ad, object ID does not exist");
                            this.b.q(parseLong);
                            break;
                        }
                    case "dispose":
                        Map map3 = this.c;
                        Long valueOf3 = Long.valueOf(parseLong);
                        dwc dwcVar5 = (dwc) map3.get(valueOf3);
                        if (dwcVar5 != null) {
                            dwcVar5.zza();
                            this.c.remove(valueOf3);
                            pzc.k("Disposed H5 ad #" + parseLong);
                            break;
                        } else {
                            fgb.b("Could not dispose H5 ad, object ID does not exist");
                            break;
                        }
                    default:
                        fgb.b("H5 gmsg contained invalid action: ".concat(str2));
                        break;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                fgb.b("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }

    @Override // defpackage.xya
    public final void zze() {
        this.c.clear();
    }
}
