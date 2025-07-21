package defpackage;

import android.webkit.WebResourceResponse;
import java.util.Map;

/* loaded from: classes4.dex */
public final class if9 {
    private final xd9 a;

    public if9(xd9 xd9Var) {
        zq3.h(xd9Var, "webResourceLoader");
        this.a = xd9Var;
    }

    public final WebResourceResponse a(String str, Map map) {
        zq3.h(str, "url");
        zq3.h(map, "headers");
        return this.a.a(str, map);
    }
}
