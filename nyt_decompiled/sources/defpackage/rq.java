package defpackage;

import androidx.fragment.app.Fragment;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.fragment.AssetArgs;
import com.nytimes.android.fragment.WebViewFragment;
import com.nytimes.android.fragment.article.ArticleFragmentType;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public final class rq {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ArticleFragmentType.values().length];
            try {
                iArr[ArticleFragmentType.HYBRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArticleFragmentType.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ArticleFragmentType.BLANK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final Fragment a(Asset asset, String str, String str2, String str3, String str4, ArticleFragmentType articleFragmentType) {
        zq3.h(asset, "asset");
        zq3.h(articleFragmentType, "fragmentType");
        int i = a.a[articleFragmentType.ordinal()];
        if (i == 1) {
            return WebViewFragment.Companion.a(new AssetArgs(str3, str4, asset.getAssetType(), Long.valueOf(asset.getLastModified()), 0, str2, false, false, false, true, str4, 464, null));
        }
        if (i == 2) {
            return WebViewFragment.Companion.a(AssetArgs.Companion.d(asset, str, str4));
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Type BLANK is not supported");
    }
}
