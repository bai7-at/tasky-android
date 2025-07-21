package defpackage;

import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.gateway.GatewayType;

/* loaded from: classes4.dex */
public final class hc3 extends hw2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc3(ArticleAsset articleAsset, int i, GatewayType gatewayType, String str) {
        super(articleAsset, i, gatewayType, str, null);
        zq3.h(articleAsset, "asset");
        zq3.h(gatewayType, "gatewayType");
        zq3.h(str, "pageViewId");
    }
}
