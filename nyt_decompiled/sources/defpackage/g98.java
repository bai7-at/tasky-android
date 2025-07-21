package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class g98 {
    private Map a;

    public g98(Map map) {
        zq3.h(map, "ssoProviders");
        this.a = map;
    }

    public final Map a() {
        return this.a;
    }

    public /* synthetic */ g98(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
