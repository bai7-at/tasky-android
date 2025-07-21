package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.ribbon.destinations.opinions.OpinionItemLockupData;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class sj5 {
    public static final OpinionItemLockupData a(Asset asset) {
        String kicker;
        String str;
        String credit;
        zq3.h(asset, "<this>");
        String byline = asset.getByline();
        if (byline == null || (kicker = h.v0(byline, "By ")) == null) {
            kicker = asset.getKicker();
        }
        String str2 = kicker;
        String title = asset.getTitle();
        if (title == null) {
            title = "";
        }
        String str3 = title;
        String a = q29.a(asset);
        String b = tb1.b(asset.getLastMajorModified());
        String summary = asset.getSummary();
        Image extractImage = asset.extractImage();
        if (extractImage == null || (credit = extractImage.getCredit()) == null) {
            str = null;
        } else {
            str = credit.toUpperCase(Locale.ROOT);
            zq3.g(str, "toUpperCase(...)");
        }
        String str4 = str;
        String url = asset.getUrl();
        if (url == null) {
            url = asset.getSafeUri();
        }
        return new OpinionItemLockupData(str2, str3, url, asset.getSafeUri(), a, b, summary, str4, (Map) null, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, (DefaultConstructorMarker) null);
    }
}
