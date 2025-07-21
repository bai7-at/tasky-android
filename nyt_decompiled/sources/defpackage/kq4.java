package defpackage;

import android.view.Menu;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.fragment.article.ArticleFragmentType;

/* loaded from: classes4.dex */
public final class kq4 {
    private final Menu a;
    private final ArticleFragmentType b;
    private final Asset c;
    private boolean d;

    public kq4(Menu menu, ArticleFragmentType articleFragmentType, Asset asset, boolean z) {
        zq3.h(menu, "menu");
        this.a = menu;
        this.b = articleFragmentType;
        this.c = asset;
        this.d = z;
    }

    public final ArticleFragmentType a() {
        return this.b;
    }

    public final Asset b() {
        return this.c;
    }

    public final Menu c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq4)) {
            return false;
        }
        kq4 kq4Var = (kq4) obj;
        return zq3.c(this.a, kq4Var.a) && this.b == kq4Var.b && zq3.c(this.c, kq4Var.c) && this.d == kq4Var.d;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ArticleFragmentType articleFragmentType = this.b;
        int hashCode2 = (hashCode + (articleFragmentType == null ? 0 : articleFragmentType.hashCode())) * 31;
        Asset asset = this.c;
        return ((hashCode2 + (asset != null ? asset.hashCode() : 0)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "MenuPreparerParam(menu=" + this.a + ", articleFragmentType=" + this.b + ", asset=" + this.c + ", webIsShowShare=" + this.d + ")";
    }
}
