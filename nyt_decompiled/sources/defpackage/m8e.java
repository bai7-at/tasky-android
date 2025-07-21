package defpackage;

import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzfog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class m8e {
    private final o8e a;
    private final WebView b;
    private final List c = new ArrayList();
    private final Map d = new HashMap();
    private final String e = "";
    private final String f;
    private final zzfog g;

    private m8e(o8e o8eVar, WebView webView, String str, List list, String str2, String str3, zzfog zzfogVar) {
        this.a = o8eVar;
        this.b = webView;
        this.g = zzfogVar;
        this.f = str2;
    }

    public static m8e b(o8e o8eVar, WebView webView, String str, String str2) {
        return new m8e(o8eVar, webView, null, null, str, "", zzfog.HTML);
    }

    public static m8e c(o8e o8eVar, WebView webView, String str, String str2) {
        return new m8e(o8eVar, webView, null, null, str, "", zzfog.JAVASCRIPT);
    }

    public final WebView a() {
        return this.b;
    }

    public final zzfog d() {
        return this.g;
    }

    public final o8e e() {
        return this.a;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.e;
    }

    public final List h() {
        return Collections.unmodifiableList(this.c);
    }

    public final Map i() {
        return Collections.unmodifiableMap(this.d);
    }
}
