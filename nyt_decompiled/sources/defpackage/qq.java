package defpackage;

import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetUtils;
import com.nytimes.android.fragment.article.ArticleFragmentType;

/* loaded from: classes4.dex */
public final class qq {
    private final boolean b(Asset asset) {
        return asset instanceof ArticleAsset;
    }

    private final boolean c(Asset asset) {
        return (AssetUtils.isPromo(asset) && !AssetUtils.isEmbeddedPromo(asset)) || AssetUtils.isInteractive(asset) || AssetUtils.isLegacyCollection(asset);
    }

    public final ArticleFragmentType a(Asset asset) {
        return b(asset) ? ArticleFragmentType.HYBRID : c(asset) ? ArticleFragmentType.WEB : ArticleFragmentType.BLANK;
    }
}
