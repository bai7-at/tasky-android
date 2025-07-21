package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetUtils;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.navigation.NavigationSource;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class q29 {
    public static final String a(Asset asset) {
        Image.ImageCrop crops;
        ImageDimension square320;
        Image.ImageCrop crops2;
        ImageDimension square640;
        String url;
        zq3.h(asset, "<this>");
        Image extractImage = asset.extractImage();
        if (extractImage != null && (crops2 = extractImage.getCrops()) != null && (square640 = crops2.getSquare640()) != null && (url = square640.getUrl()) != null) {
            return url;
        }
        Image extractImage2 = asset.extractImage();
        if (extractImage2 == null || (crops = extractImage2.getCrops()) == null || (square320 = crops.getSquare320()) == null) {
            return null;
        }
        return square320.getUrl();
    }

    public static final y25 b(Asset asset, NavigationSource navigationSource, String str, String str2, Map map, Map map2, Map map3) {
        zq3.h(asset, "<this>");
        zq3.h(navigationSource, "navigationSource");
        zq3.h(str, "et2Label");
        zq3.h(str2, "et2Context");
        return new y25(asset.getUrl(), AssetConstants.ARTICLE_TYPE, asset.getSafeUri(), asset.getSectionContentName(), asset.getSectionDisplayName(), AssetUtils.isInteractive(asset) || AssetUtils.isPromo(asset), false, null, null, navigationSource, null, str, str2, null, null, null, map3, map, map2, 57600, null);
    }
}
