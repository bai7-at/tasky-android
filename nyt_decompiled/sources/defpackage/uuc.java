package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class uuc {
    private final ConcurrentHashMap a;
    private final nfb b;
    private final s1e c;
    private final String d;
    private final String e;

    public uuc(evc evcVar, nfb nfbVar, s1e s1eVar, String str, String str2) {
        ConcurrentHashMap c = evcVar.c();
        this.a = c;
        this.b = nfbVar;
        this.c = s1eVar;
        this.d = str;
        this.e = str2;
        if (((Boolean) pla.c().a(mpa.a7)).booleanValue()) {
            int e = ktd.e(s1eVar);
            int i = e - 1;
            if (i == 0) {
                c.put("scar", "false");
                return;
            }
            if (i == 1) {
                c.put("se", "query_g");
            } else if (i == 2) {
                c.put("se", "r_adinfo");
            } else if (i != 3) {
                c.put("se", "r_both");
            } else {
                c.put("se", "r_adstring");
            }
            c.put("scar", "true");
            if (((Boolean) pla.c().a(mpa.z7)).booleanValue()) {
                c.put("ad_format", str2);
            }
            if (e == 2) {
                c.put("rid", str);
            }
            d("ragent", s1eVar.d.zzp);
            d("rtype", ktd.a(ktd.b(s1eVar.d)));
        }
    }

    private final void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.a.put(str, str2);
    }

    public final Map a() {
        return this.a;
    }

    public final void b(g1e g1eVar) {
        if (!g1eVar.b.a.isEmpty()) {
            switch (((v0e) g1eVar.b.a.get(0)).b) {
                case 1:
                    this.a.put("ad_format", "banner");
                    break;
                case 2:
                    this.a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.a.put("ad_format", "app_open_ad");
                    this.a.put("as", true != this.b.m() ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    break;
                default:
                    this.a.put("ad_format", DatasetUtils.UNKNOWN_IDENTITY_ID);
                    break;
            }
        }
        d("gqi", g1eVar.b.b.b);
    }

    public final void c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
