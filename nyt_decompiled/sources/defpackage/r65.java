package defpackage;

import com.datadog.android.DatadogSite;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.privacy.TrackingConsent;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes2.dex */
public final class r65 implements tx0 {
    @Override // defpackage.tx0
    public Map a(String str) {
        zq3.h(str, "feature");
        return t.i();
    }

    @Override // defpackage.tx0
    public void b(String str, Map map) {
        zq3.h(str, "feature");
        zq3.h(map, "context");
    }

    @Override // defpackage.tx0
    public ua1 getContext() {
        return new ua1(DatadogSite.US1, "", "", "", "", "", "", "", new wl8(0L, 0L, 0L, 0L), new p36(true), new NetworkInfo(NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null), new gp1("", "", "", DeviceType.OTHER, "", "", "", "", ""), new j09(null, null, null, t.i()), TrackingConsent.NOT_GRANTED, null, t.i());
    }
}
