package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.graphql.GraphQlInteractiveAsset;
import defpackage.zq3;
import kotlin.text.h;

/* loaded from: classes3.dex */
public final class AssetUtils {
    public static final boolean isEmbeddedPromo(Asset asset) {
        return (asset instanceof PromoAsset) && ((PromoAsset) asset).isEmbedded();
    }

    public static final boolean isInteractive(Asset asset) {
        return asset instanceof InteractiveAsset;
    }

    public static final boolean isInteractiveGraphic(Asset asset) {
        if (asset instanceof GraphQlInteractiveAsset) {
            return true;
        }
        return h.w(AssetConstants.INTERACTIVE_GRAPHICS_TYPE, asset != null ? asset.getAssetType() : null, true);
    }

    public static final boolean isLegacyCollection(Asset asset) {
        return asset instanceof LegacyCollectionAsset;
    }

    public static final boolean isLegacyOrInteractiveCollectionWithComments(Asset asset) {
        if ((asset instanceof LegacyCollectionAsset) || isInteractive(asset)) {
            return asset != null ? asset.isCommentsEnabled() : false;
        }
        return false;
    }

    public static final boolean isLive(Asset asset) {
        zq3.h(asset, "<this>");
        return h.P(asset.getUrlOrEmpty(), "/live/", false, 2, null);
    }

    public static final boolean isPromo(Asset asset) {
        return asset instanceof PromoAsset;
    }

    public static final boolean isShareableCollection(Asset asset) {
        if (isLegacyCollection(asset)) {
            if (!(asset != null ? isLive(asset) : false)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isSlideshow(Asset asset) {
        return asset instanceof SlideshowAsset;
    }

    public static final boolean isVideo(Asset asset) {
        return asset instanceof VideoAsset;
    }
}
