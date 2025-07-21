package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzcei;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class v6e {
    private final Context a;
    private final String b;
    private final String c;

    public v6e(Context context, zzcei zzceiVar) {
        this.a = context;
        this.b = context.getPackageName();
        this.c = zzceiVar.zza;
    }

    public final void a(Map map) {
        map.put("s", "gmob_sdk");
        map.put(QueryKeys.INTERNAL_REFERRER, "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        dyf.r();
        map.put("device", wxf.T());
        map.put("app", this.b);
        dyf.r();
        boolean d = wxf.d(this.a);
        String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        map.put("is_lite_sdk", true != d ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        zoa zoaVar = mpa.a;
        List b = pla.a().b();
        if (((Boolean) pla.c().a(mpa.U6)).booleanValue()) {
            b.addAll(dyf.q().i().zzh().d());
        }
        map.put(QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, TextUtils.join(",", b));
        map.put("sdkVersion", this.c);
        if (((Boolean) pla.c().a(mpa.La)).booleanValue()) {
            dyf.r();
            if (true != wxf.a(this.a)) {
                str = "0";
            }
            map.put("is_bstar", str);
        }
        if (((Boolean) pla.c().a(mpa.n9)).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.c2)).booleanValue()) {
                map.put("plugin", ehe.c(dyf.q().n()));
            }
        }
    }
}
