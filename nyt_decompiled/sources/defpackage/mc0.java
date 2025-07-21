package defpackage;

import android.webkit.WebView;

/* loaded from: classes4.dex */
public abstract class mc0 {
    private final String a;

    public mc0(String str) {
        zq3.h(str, "commandName");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public abstract Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var);
}
