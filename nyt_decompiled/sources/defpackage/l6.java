package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.nytimes.android.ads.AdConfig;
import com.nytimes.android.ads.models.CoreAdKeys;
import defpackage.xc8;

/* loaded from: classes2.dex */
public abstract class l6 {
    public static final WebView a(ViewGroup viewGroup) {
        zq3.h(viewGroup, "<this>");
        if (viewGroup.getChildCount() <= 0) {
            return null;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt instanceof WebView) {
            return (WebView) childAt;
        }
        if (childAt instanceof ViewGroup) {
            return a((ViewGroup) childAt);
        }
        return null;
    }

    public static final s7[] b(AdConfig adConfig) {
        zq3.h(adConfig, "<this>");
        String k = adConfig.k(CoreAdKeys.VIEWPORT_SIZE.getKey());
        if (zq3.c(k, "medium")) {
            s7 s7Var = s7.l;
            zq3.g(s7Var, "LEADERBOARD");
            s7 s7Var2 = s7.p;
            zq3.g(s7Var2, "FLUID");
            return new s7[]{s7Var, s7Var2};
        }
        if (zq3.c(k, "large")) {
            s7 s7Var3 = s7.l;
            zq3.g(s7Var3, "LEADERBOARD");
            s7 s7Var4 = s7.p;
            zq3.g(s7Var4, "FLUID");
            return new s7[]{xc8.b.b.a(), xc8.c.b.a(), s7Var3, s7Var4};
        }
        s7 s7Var5 = s7.m;
        zq3.g(s7Var5, "MEDIUM_RECTANGLE");
        s7 s7Var6 = s7.p;
        zq3.g(s7Var6, "FLUID");
        return new s7[]{s7Var5, s7Var6};
    }

    public static final void c(ViewGroup viewGroup, boolean z) {
        WebView a;
        zq3.h(viewGroup, "<this>");
        if (re9.a("FORCE_DARK") && (a = a(viewGroup)) != null) {
            ge9.c(a.getSettings(), z ? 0 : 2);
        }
    }
}
