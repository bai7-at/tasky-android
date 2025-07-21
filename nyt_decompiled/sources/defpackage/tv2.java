package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.navigation.NavigationSource;
import com.nytimes.android.ribbon.destinations.games.GamesDestinationItem;
import com.nytimes.android.ribbon.destinations.games.GamesLockupData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class tv2 {
    public static final GamesLockupData b(Asset asset) {
        Image.ImageCrop crops;
        ImageDimension square640;
        zq3.h(asset, "<this>");
        String title = asset.getTitle();
        String str = title == null ? "" : title;
        String summary = asset.getSummary();
        String str2 = summary == null ? "" : summary;
        Image extractImage = asset.extractImage();
        String url = (extractImage == null || (crops = extractImage.getCrops()) == null || (square640 = crops.getSquare640()) == null) ? null : square640.getUrl();
        Image extractImage2 = asset.extractImage();
        String credit = extractImage2 != null ? extractImage2.getCredit() : null;
        String str3 = credit == null ? "" : credit;
        String b = tb1.b(asset.getLastMajorModified());
        zq3.g(b, "getDayDate(...)");
        return new GamesLockupData(asset, url, str, h.Y0(b, ",", null, 2, null), str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(b((Asset) it2.next()));
        }
        return arrayList;
    }

    public static final y25 d(Asset asset, int i, String str, int i2) {
        y25 b;
        zq3.h(asset, "<this>");
        zq3.h(str, "blockLabel");
        NavigationSource navigationSource = NavigationSource.XPN_PANEL;
        Pair a = du8.a("index", Integer.valueOf(i));
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        b = q29.b(asset, navigationSource, "", "games panel", (r16 & 8) != 0 ? null : t.m(a, du8.a("label", lowerCase)), (r16 & 16) != 0 ? null : t.f(du8.a("index", Integer.valueOf(i2))), (r16 & 32) != 0 ? null : null);
        return b;
    }

    public static final y25 e(GamesDestinationItem gamesDestinationItem, int i, String str, int i2, String str2) {
        zq3.h(gamesDestinationItem, "<this>");
        zq3.h(str, "blockLabel");
        zq3.h(str2, "cardUrl");
        return new y25(gamesDestinationItem.f(), AssetConstants.ARTICLE_TYPE, "", "", "", false, false, null, null, NavigationSource.XPN_PANEL, null, null, "games panel", gamesDestinationItem.b(), null, null, null, t.m(du8.a("index", Integer.valueOf(i)), du8.a("label", str)), t.m(du8.a("index", Integer.valueOf(i2)), du8.a("url", str2)), 51456, null);
    }
}
