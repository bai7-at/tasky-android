package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.fragment.AssetArgs;
import com.nytimes.android.fragment.fullscreen.FullScreenImageFragment;
import com.nytimes.android.fragment.fullscreen.FullScreenSlideshowFragment;
import com.nytimes.android.fragment.fullscreen.FullScreenVideoFragment;
import com.nytimes.android.fragment.fullscreen.a;

/* loaded from: classes4.dex */
public final class gr2 {
    public static final gr2 a = new gr2();

    private gr2() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final a a(String str) {
        switch (str.hashCode()) {
            case -795551698:
                if (str.equals(AssetConstants.SLIDESHOW_TYPE)) {
                    return new FullScreenSlideshowFragment();
                }
                return null;
            case 100313435:
                if (str.equals(AssetConstants.IMAGE_TYPE)) {
                    return new FullScreenImageFragment();
                }
                return null;
            case 112202875:
                if (str.equals(AssetConstants.VIDEO_TYPE)) {
                    return new FullScreenVideoFragment();
                }
                return null;
            case 899908915:
                if (str.equals(AssetConstants.IMAGE_SLIDESHOW_TYPE)) {
                    return new FullScreenSlideshowFragment();
                }
                return null;
            default:
                return null;
        }
    }

    public static final a b(Asset asset) {
        a a2;
        zq3.h(asset, "mediaAsset");
        String assetType = asset.getAssetType();
        if (assetType != null && (a2 = a.a(assetType)) != null) {
            a2.setArguments(new AssetArgs(asset.getSafeUri(), null, asset.getAssetType(), Long.valueOf(asset.getLastModified()), 0, null, false, false, false, false, null, 2032, null).l());
            return a2;
        }
        throw new IllegalStateException(("Unknown assetType: " + asset.getAssetType() + " in " + asset).toString());
    }

    public final boolean c(String str) {
        return (str != null ? a.a(str) : null) != null;
    }
}
