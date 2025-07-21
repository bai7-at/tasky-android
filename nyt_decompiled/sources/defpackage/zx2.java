package defpackage;

import android.webkit.WebView;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public final class zx2 extends mc0 {
    private final tm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx2(tm tmVar) {
        super("getAutoPlay");
        zq3.h(tmVar, "preferencesManager");
        this.b = tmVar;
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        return BridgeCommandResult.Companion.c(i, t.f(du8.a("autoPlay", cc0.a(this.b.g()))));
    }
}
