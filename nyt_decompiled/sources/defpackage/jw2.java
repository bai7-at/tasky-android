package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes4.dex */
public final class jw2 implements iw2 {
    private final qq5 a;
    private final RecentlyViewedManager b;
    private final ex2 c;

    public jw2(qq5 qq5Var, RecentlyViewedManager recentlyViewedManager, ex2 ex2Var) {
        zq3.h(qq5Var, "stateManager");
        zq3.h(recentlyViewedManager, "recentlyViewedManager");
        zq3.h(ex2Var, "gatewayViewBindings");
        this.a = qq5Var;
        this.b = recentlyViewedManager;
        this.c = ex2Var;
    }

    @Override // defpackage.iw2
    public void a(Asset asset, String str) {
        this.c.b(asset, str);
    }

    @Override // defpackage.iw2
    public void b(boolean z) {
        this.a.b(z);
    }

    @Override // defpackage.iw2
    public void c(Asset asset) {
        if (asset != null) {
            RecentlyViewedManager recentlyViewedManager = this.b;
            z18 c = c28.c(asset);
            OffsetDateTime now = OffsetDateTime.now();
            zq3.g(now, "now(...)");
            recentlyViewedManager.a(c, now);
        }
    }
}
