package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;

/* loaded from: classes.dex */
public final class pn9 implements bo9 {
    private final ConnectivityManager a;

    public pn9(Context context) {
        zq3.i(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        this.a = (ConnectivityManager) systemService;
    }

    private final Map b() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NetworkCapabilities networkCapabilities = this.a.getNetworkCapabilities(this.a.getActiveNetwork());
        String str2 = "none";
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(1)) {
                str2 = QueryKeys.SCROLL_WINDOW_HEIGHT;
            } else if (networkCapabilities.hasTransport(0)) {
                str2 = QueryKeys.TIME_ON_VIEW_IN_MINUTES;
            } else if (networkCapabilities.hasTransport(3)) {
                str2 = QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING;
            }
            str = "d_n_type";
        } else {
            str = "d.n.type";
        }
        linkedHashMap.put(str, str2);
        return linkedHashMap;
    }

    @Override // defpackage.bo9
    public Map a() {
        Map b = b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : b.entrySet()) {
            Object value = entry.getValue();
            if (value != null && !TextUtils.isEmpty(value.toString())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
