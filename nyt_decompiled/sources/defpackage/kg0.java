package defpackage;

import android.webkit.WebView;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;

/* loaded from: classes4.dex */
public final class kg0 extends mc0 {
    public kg0() {
        super("gamesCacheRefresh");
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        webView.clearCache(true);
        return BridgeCommandResult.a.d(BridgeCommandResult.Companion, i, null, 2, null);
    }
}
