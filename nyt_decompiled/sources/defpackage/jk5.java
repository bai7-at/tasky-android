package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.navigation.NavigationSource;
import com.nytimes.android.ribbon.destinations.opinions.OpinionItemLockupData;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public abstract class jk5 {
    public static final y25 a(OpinionItemLockupData opinionItemLockupData, int i, String str, int i2) {
        zq3.h(opinionItemLockupData, "<this>");
        zq3.h(str, "blockLabel");
        String d = opinionItemLockupData.d();
        String c = opinionItemLockupData.c();
        NavigationSource navigationSource = NavigationSource.XPN_PANEL;
        Map j = opinionItemLockupData.j();
        Pair a = du8.a("index", Integer.valueOf(i));
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return new y25(d, AssetConstants.ARTICLE_TYPE, c, "", "", false, false, null, null, navigationSource, null, null, "opinion panel", null, null, null, j, t.m(a, du8.a("label", lowerCase)), t.f(du8.a("index", Integer.valueOf(i2))), 57600, null);
    }
}
