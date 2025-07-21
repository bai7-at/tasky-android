package defpackage;

import android.content.Context;
import android.os.Build;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class spa {
    private final String a = (String) kra.b.e();
    private final Map b;
    private final Context c;
    private final String d;

    public spa(Context context, String str) {
        this.c = context;
        this.d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put(QueryKeys.INTERNAL_REFERRER, "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        dyf.r();
        linkedHashMap.put("device", wxf.T());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        dyf.r();
        boolean d = wxf.d(context);
        String str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        linkedHashMap.put("is_lite_sdk", true != d ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        Future b = dyf.o().b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((x9b) b.get()).k));
            linkedHashMap.put("network_fine", Integer.toString(((x9b) b.get()).l));
        } catch (Exception e) {
            dyf.q().w(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) pla.c().a(mpa.La)).booleanValue()) {
            Map map = this.b;
            dyf.r();
            map.put("is_bstar", true != wxf.a(context) ? "0" : str2);
        }
        if (((Boolean) pla.c().a(mpa.n9)).booleanValue()) {
            if (!((Boolean) pla.c().a(mpa.c2)).booleanValue() || ehe.d(dyf.q().n())) {
                return;
            }
            this.b.put("plugin", dyf.q().n());
        }
    }

    final Context a() {
        return this.c;
    }

    final String b() {
        return this.d;
    }

    final String c() {
        return this.a;
    }

    final Map d() {
        return this.b;
    }
}
