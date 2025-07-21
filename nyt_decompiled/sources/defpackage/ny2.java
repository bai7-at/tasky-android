package defpackage;

import android.webkit.WebView;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public final class ny2 extends mc0 {
    private final PageContext b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny2(PageContext pageContext) {
        super("getPageViewID");
        zq3.h(pageContext, "pageContext");
        this.b = pageContext;
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        return BridgeCommandResult.Companion.c(i, t.f(du8.a("pageViewID", this.b.g())));
    }
}
