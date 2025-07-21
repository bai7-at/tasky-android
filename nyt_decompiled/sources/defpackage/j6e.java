package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class j6e {
    private final HashMap a;
    private final s6e b;

    private j6e() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        this.b = new s6e(dyf.b());
        hashMap.put("new_csi", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }

    public static j6e b(String str) {
        j6e j6eVar = new j6e();
        j6eVar.a.put("action", str);
        return j6eVar;
    }

    public static j6e c(String str) {
        j6e j6eVar = new j6e();
        j6eVar.a.put("request_id", str);
        return j6eVar;
    }

    public final j6e a(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public final j6e d(String str) {
        this.b.b(str);
        return this;
    }

    public final j6e e(String str, String str2) {
        this.b.c(str, str2);
        return this;
    }

    public final j6e f(v0e v0eVar) {
        this.a.put("aai", v0eVar.x);
        return this;
    }

    public final j6e g(y0e y0eVar) {
        if (!TextUtils.isEmpty(y0eVar.b)) {
            this.a.put("gqi", y0eVar.b);
        }
        return this;
    }

    public final j6e h(g1e g1eVar, nfb nfbVar) {
        f1e f1eVar = g1eVar.b;
        g(f1eVar.b);
        if (!f1eVar.a.isEmpty()) {
            switch (((v0e) f1eVar.a.get(0)).b) {
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
                    if (nfbVar != null) {
                        this.a.put("as", true != nfbVar.m() ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                        break;
                    }
                    break;
                default:
                    this.a.put("ad_format", DatasetUtils.UNKNOWN_IDENTITY_ID);
                    break;
            }
        }
        return this;
    }

    public final j6e i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map j() {
        HashMap hashMap = new HashMap(this.a);
        for (r6e r6eVar : this.b.a()) {
            hashMap.put(r6eVar.a, r6eVar.b);
        }
        return hashMap;
    }
}
