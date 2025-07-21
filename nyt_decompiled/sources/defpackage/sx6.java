package defpackage;

import android.webkit.WebView;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class sx6 extends mc0 {
    public static final a Companion = new a(null);
    private final PageContext b;
    private final AbraManager c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx6(PageContext pageContext, AbraManager abraManager) {
        super("reportABExposure");
        zq3.h(pageContext, "pageContext");
        zq3.h(abraManager, "abraManager");
        this.b = pageContext;
        this.c = abraManager;
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        this.c.exposeTest(nc0Var.j("testName"), t.f(du8.a("pageContext", this.b)));
        return BridgeCommandResult.Companion.c(i, t.i());
    }
}
