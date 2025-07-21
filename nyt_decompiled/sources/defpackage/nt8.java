package defpackage;

import com.nytimes.android.messaging.truncator.TruncatorData;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;

/* loaded from: classes4.dex */
public final class nt8 {
    private final qv6 a;

    public nt8(qv6 qv6Var) {
        zq3.h(qv6Var, "remoteConfig");
        this.a = qv6Var;
    }

    public final TruncatorData a() {
        TruncatorData truncatorData;
        i d = new i.b().d();
        zq3.g(d, "build(...)");
        JsonAdapter c = d.c(TruncatorData.class);
        zq3.g(c, "adapter(...)");
        String r = this.a.r();
        return (r.length() <= 0 || (truncatorData = (TruncatorData) c.fromJson(r)) == null) ? new TruncatorData(false, null, null, null, null, null, false, 0, 255, null) : truncatorData;
    }
}
