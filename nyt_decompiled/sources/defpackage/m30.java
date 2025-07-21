package defpackage;

import android.webkit.WebView;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import com.nytimes.xwords.hybrid.view.BaseGamesHybridHostActivity;

/* loaded from: classes4.dex */
public final class m30 extends mc0 {
    private final BaseGamesHybridHostActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(BaseGamesHybridHostActivity baseGamesHybridHostActivity) {
        super("gamesBackToHub");
        zq3.h(baseGamesHybridHostActivity, "hybridHostActivity");
        this.b = baseGamesHybridHostActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(m30 m30Var) {
        zq3.h(m30Var, "this$0");
        m30Var.b.L();
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        this.b.runOnUiThread(new Runnable() { // from class: l30
            @Override // java.lang.Runnable
            public final void run() {
                m30.d(m30.this);
            }
        });
        return BridgeCommandResult.a.d(BridgeCommandResult.Companion, i, null, 2, null);
    }
}
