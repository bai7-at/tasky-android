package defpackage;

import android.webkit.WebView;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import com.nytimes.xwords.hybrid.view.Theme;
import kotlin.Result;
import kotlin.f;

/* loaded from: classes4.dex */
public final class sv2 extends mc0 {
    private final vk8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv2(vk8 vk8Var) {
        super("gamesSetNativeColorTheme");
        zq3.h(vk8Var, "themeHandler");
        this.b = vk8Var;
    }

    private final Theme c(String str) {
        if (zq3.c(str, "light")) {
            return Theme.LIGHT;
        }
        if (zq3.c(str, "dark")) {
            return Theme.DARK;
        }
        throw new IllegalArgumentException("Unknown them type");
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        Object b;
        try {
            Result.a aVar = Result.a;
            b = Result.b(c(nc0Var.j("theme")));
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(th));
        }
        Throwable e = Result.e(b);
        if (e != null) {
            ul8.a.e(e);
        }
        if (Result.g(b)) {
            b = null;
        }
        Theme theme = (Theme) b;
        if (theme == null) {
            return BridgeCommandResult.a.b(BridgeCommandResult.Companion, i, null, null, 6, null);
        }
        this.b.o(theme);
        return BridgeCommandResult.a.d(BridgeCommandResult.Companion, i, null, 2, null);
    }
}
