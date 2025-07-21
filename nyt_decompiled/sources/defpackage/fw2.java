package defpackage;

import android.content.Intent;
import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.gateway.GatewayType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class fw2 {
    public static final a Companion = new a(null);
    public static final int e = 8;
    private final jc a;
    private final fp b;
    private final dk0 c;
    private hw2 d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public fw2(jc jcVar, fp fpVar, dk0 dk0Var) {
        zq3.h(jcVar, "analyticsClient");
        zq3.h(fpVar, "articleAnalyticsUtil");
        zq3.h(dk0Var, "chartbeatAnalyticsReporter");
        this.a = jcVar;
        this.b = fpVar;
        this.c = dk0Var;
    }

    public final void a(hw2 hw2Var) {
        zq3.h(hw2Var, "gatewayAnalyticsData");
        this.d = hw2Var;
    }

    public final void b() {
        this.b.d();
    }

    public final void c(Intent intent) {
        zq3.h(intent, "intent");
        this.a.y(true);
        hw2 hw2Var = this.d;
        if (hw2Var == null) {
            zq3.z("gatewayAnalyticsData");
            hw2Var = null;
        }
        Asset a2 = hw2Var.a();
        if (a2 != null) {
            this.c.e(a2);
        }
        d(intent);
    }

    public final void d(Intent intent) {
        zq3.h(intent, "intent");
        hw2 hw2Var = this.d;
        hw2 hw2Var2 = null;
        if (hw2Var == null) {
            zq3.z("gatewayAnalyticsData");
            hw2Var = null;
        }
        boolean z = false;
        if (hw2Var.d() != 0) {
            hw2 hw2Var3 = this.d;
            if (hw2Var3 == null) {
                zq3.z("gatewayAnalyticsData");
                hw2Var3 = null;
            }
            if (hw2Var3.d() != 2) {
                hw2 hw2Var4 = this.d;
                if (hw2Var4 == null) {
                    zq3.z("gatewayAnalyticsData");
                    hw2Var4 = null;
                }
                if (hw2Var4.b() != GatewayType.NONE) {
                    hw2 hw2Var5 = this.d;
                    if (hw2Var5 == null) {
                        zq3.z("gatewayAnalyticsData");
                    } else {
                        hw2Var2 = hw2Var5;
                    }
                    if (hw2Var2.b() == GatewayType.BLOCKED) {
                        z = true;
                    }
                }
            }
            if (this.a.k()) {
                e(intent);
                this.a.y(false);
            }
        }
        this.a.z(z);
    }

    public final void e(Intent intent) {
        zq3.h(intent, "intent");
        hw2 hw2Var = this.d;
        hw2 hw2Var2 = null;
        if (hw2Var == null) {
            zq3.z("gatewayAnalyticsData");
            hw2Var = null;
        }
        if (hw2Var instanceof rd9) {
            jc jcVar = this.a;
            hw2 hw2Var3 = this.d;
            if (hw2Var3 == null) {
                zq3.z("gatewayAnalyticsData");
            } else {
                hw2Var2 = hw2Var3;
            }
            jcVar.w(((rd9) hw2Var2).e());
            return;
        }
        fp fpVar = this.b;
        hw2 hw2Var4 = this.d;
        if (hw2Var4 == null) {
            zq3.z("gatewayAnalyticsData");
            hw2Var4 = null;
        }
        Asset a2 = hw2Var4.a();
        zq3.f(a2, "null cannot be cast to non-null type com.nytimes.android.api.cms.ArticleAsset");
        ArticleAsset articleAsset = (ArticleAsset) a2;
        hw2 hw2Var5 = this.d;
        if (hw2Var5 == null) {
            zq3.z("gatewayAnalyticsData");
        } else {
            hw2Var2 = hw2Var5;
        }
        fpVar.f(articleAsset, hw2Var2.c(), intent);
    }

    public final void f() {
        hw2 hw2Var = this.d;
        if (hw2Var != null) {
            if (hw2Var == null) {
                zq3.z("gatewayAnalyticsData");
                hw2Var = null;
            }
            Asset a2 = hw2Var.a();
            if (a2 != null) {
                this.c.e(a2);
            }
        }
    }

    public final void g() {
        this.c.c();
    }
}
