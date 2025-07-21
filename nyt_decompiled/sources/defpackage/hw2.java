package defpackage;

import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.gateway.GatewayType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class hw2 {
    public static final a Companion = new a(null);
    public static final int e = 8;
    private final Asset a;
    private final int b;
    private final GatewayType c;
    private final String d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hw2 a(Asset asset, int i, GatewayType gatewayType, String str, String str2, h90 h90Var) {
            zq3.h(gatewayType, "gatewayType");
            zq3.h(str, "pageViewId");
            if (asset instanceof ArticleAsset) {
                return new hc3((ArticleAsset) asset, i, gatewayType, str);
            }
            zq3.e(str2);
            return new rd9(asset, i, gatewayType, str, str2, h90Var);
        }

        private a() {
        }
    }

    public /* synthetic */ hw2(Asset asset, int i, GatewayType gatewayType, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(asset, i, gatewayType, str);
    }

    public final Asset a() {
        return this.a;
    }

    public final GatewayType b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final int d() {
        return this.b;
    }

    private hw2(Asset asset, int i, GatewayType gatewayType, String str) {
        this.a = asset;
        this.b = i;
        this.c = gatewayType;
        this.d = str;
    }
}
