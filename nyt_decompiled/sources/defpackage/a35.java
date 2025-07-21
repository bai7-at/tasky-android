package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.InteractiveAsset;
import com.nytimes.android.api.cms.PromoAsset;
import com.nytimes.android.navigation.NavigationSource;

/* loaded from: classes4.dex */
public abstract class a35 {
    public static final y25 a(Asset asset, NavigationSource navigationSource) {
        zq3.h(asset, "asset");
        zq3.h(navigationSource, "source");
        String url = asset.getUrl();
        String assetType = asset.getAssetType();
        if (assetType == null) {
            assetType = "";
        }
        return new y25(url, assetType, asset.getSafeUri(), asset.getSectionContentName(), asset.getSectionDisplayName(), (asset instanceof InteractiveAsset) || (asset instanceof PromoAsset), asset instanceof PromoAsset, null, null, navigationSource, null, null, null, null, null, null, null, null, null, 522496, null);
    }
}
