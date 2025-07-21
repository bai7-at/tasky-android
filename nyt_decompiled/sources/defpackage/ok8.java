package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.navigation.NavigationSource;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public abstract class ok8 {
    public static final y25 a(mk8 mk8Var, int i, String str, int i2) {
        zq3.h(mk8Var, "<this>");
        zq3.h(str, "blockLabel");
        return new y25(mk8Var.getUrl(), AssetConstants.ARTICLE_TYPE, mk8Var.getUri(), "", "", false, false, null, null, NavigationSource.XPN_PANEL, null, null, "the athletic panel", null, null, null, null, t.m(du8.a("index", Integer.valueOf(i)), du8.a("label", str)), t.f(du8.a("index", Integer.valueOf(i2))), 57600, null);
    }
}
