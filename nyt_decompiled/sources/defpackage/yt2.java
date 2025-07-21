package defpackage;

import android.webkit.WebView;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public final class yt2 extends mc0 {
    private final boolean b;

    public yt2(boolean z) {
        super("gamesInitializeState");
        this.b = z;
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        return BridgeCommandResult.Companion.c(i, t.f(du8.a("gamesInitializeState", t.f(du8.a("isReturningFromBackground", cc0.a(this.b))))));
    }
}
