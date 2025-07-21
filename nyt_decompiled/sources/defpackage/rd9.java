package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.gateway.GatewayType;

/* loaded from: classes4.dex */
public final class rd9 extends hw2 {
    private final String f;
    private final h90 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd9(Asset asset, int i, GatewayType gatewayType, String str, String str2, h90 h90Var) {
        super(asset, i, gatewayType, str, null);
        zq3.h(gatewayType, "gatewayType");
        zq3.h(str, "pageViewId");
        zq3.h(str2, "startUrl");
        this.f = str2;
        this.g = h90Var;
    }

    public final String e() {
        return this.f;
    }
}
