package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.navigation.NavigationSource;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public abstract class gi9 {
    public static final y25 a(ei9 ei9Var, int i, String str, int i2) {
        zq3.h(ei9Var, "<this>");
        zq3.h(str, "blockLabel");
        return new y25(ei9Var.g(), AssetConstants.ARTICLE_TYPE, ei9Var.f(), "", "", false, false, null, null, NavigationSource.XPN_PANEL, null, "", "wirecutter panel", null, null, null, ei9Var.a(), t.m(du8.a("index", Integer.valueOf(i)), du8.a("label", str)), t.f(du8.a("index", Integer.valueOf(i2))), 57600, null);
    }

    public static final ei9 b(Asset asset, Map map) {
        zq3.h(asset, "<this>");
        String url = asset.getUrl();
        String safeUri = asset.getSafeUri();
        String title = asset.getTitle();
        if (title == null) {
            title = "";
        }
        String str = title;
        String summary = asset.getSummary();
        String a = q29.a(asset);
        Image extractImage = asset.extractImage();
        return new ei9(url, safeUri, str, summary, a, extractImage != null ? extractImage.getCredit() : null, map);
    }
}
