package defpackage;

import android.webkit.WebView;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class jp6 extends mc0 {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private final RecentlyViewedManager b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp6(RecentlyViewedManager recentlyViewedManager) {
        super("getReadStatusForAssets");
        zq3.h(recentlyViewedManager, "recentlyViewedManager");
        this.b = recentlyViewedManager;
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        List k = nc0Var.k("uris");
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(k, 10)), 16));
        for (Object obj : k) {
            linkedHashMap.put(obj, cc0.a(this.b.u((String) obj)));
        }
        return BridgeCommandResult.Companion.c(i, linkedHashMap);
    }
}
