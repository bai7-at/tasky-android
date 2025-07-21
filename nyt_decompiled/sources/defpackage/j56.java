package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.InteractiveAsset;
import com.nytimes.android.api.cms.PromoAsset;
import com.nytimes.android.api.cms.SlideshowAsset;
import com.nytimes.android.api.cms.graphql.GraphQlPromoAsset;
import defpackage.g56;
import defpackage.gz1;
import defpackage.t66;
import defpackage.u21;
import kotlin.text.h;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class j56 {
    private final rf3 a;
    private final so3 b;
    private final iv7 c;
    private final b69 d;

    public j56(rf3 rf3Var, so3 so3Var, iv7 iv7Var, b69 b69Var) {
        zq3.h(rf3Var, "imageAssetParser");
        zq3.h(so3Var, "interactiveAssetParser");
        zq3.h(iv7Var, "slideshowAssetParser");
        zq3.h(b69Var, "videoAssetParser");
        this.a = rf3Var;
        this.b = so3Var;
        this.c = iv7Var;
        this.d = b69Var;
    }

    private final Asset a(g56.a aVar) {
        kf3 a = aVar.a();
        if (a != null) {
            return this.a.a(a);
        }
        return null;
    }

    private final Asset b(t66.a aVar) {
        gz1.a a;
        kf3 a2;
        InteractiveAsset b;
        ho3 c = aVar.c();
        if (c != null && (b = this.b.b(c)) != null) {
            return b;
        }
        n59 e = aVar.e();
        if (e != null) {
            return this.d.b(e);
        }
        kf3 b2 = aVar.b();
        ImageAsset a3 = b2 != null ? this.a.a(b2) : null;
        if (a3 != null) {
            return a3;
        }
        uu7 d = aVar.d();
        SlideshowAsset b3 = d != null ? this.c.b(d) : null;
        if (b3 != null) {
            return b3;
        }
        gz1 a4 = aVar.a();
        if (a4 == null || (a = a4.a()) == null || (a2 = a.a()) == null) {
            return null;
        }
        return this.a.a(a2);
    }

    private final AssetData i(g56 g56Var) {
        String j = g56Var.j();
        Long n = h.n(g56Var.g());
        long longValue = n != null ? n.longValue() : -1L;
        String i = g56Var.i();
        String d = g56Var.d();
        Instant c = g56Var.c();
        long epochSecond = c != null ? c.getEpochSecond() : 0L;
        Instant b = g56Var.b();
        long epochSecond2 = b != null ? b.getEpochSecond() : 0L;
        String f = g56Var.f();
        String h = g56Var.h();
        g56.a e = g56Var.e();
        return new AssetData(j, i, d, AssetConstants.METERED, null, null, null, null, false, epochSecond, epochSecond2, 0L, null, null, null, null, null, null, false, false, false, false, false, null, f, h, null, null, null, null, null, e != null ? a(e) : null, null, null, longValue, 2097150448, 3, null);
    }

    private final PromoAsset j(c86 c86Var, t66 t66Var, u21 u21Var) {
        String e = c86Var.e();
        Long n = h.n(c86Var.c());
        long longValue = n != null ? n.longValue() : -1L;
        String d = c86Var.d();
        u21.a a = u21Var.a();
        String a2 = a != null ? a.a() : null;
        if (a2 == null) {
            a2 = "";
        }
        String str = a2;
        Instant b = c86Var.b();
        long epochSecond = b != null ? b.getEpochSecond() : 0L;
        Instant a3 = c86Var.a();
        long epochSecond2 = a3 != null ? a3.getEpochSecond() : 0L;
        u21.a a4 = u21Var.a();
        String b2 = a4 != null ? a4.b() : null;
        String c = u21Var.c();
        String f = c86Var.f();
        t66.a a5 = t66Var.a();
        AssetData assetData = new AssetData(e, d, str, AssetConstants.METERED, null, null, null, null, false, epochSecond, epochSecond2, 0L, b2, null, null, null, null, null, false, false, false, false, false, null, c, f, null, null, null, null, null, a5 != null ? b(a5) : null, null, null, longValue, 2097146352, 3, null);
        return new GraphQlPromoAsset(assetData, assetData.getUrl(), false);
    }

    public final PromoAsset c(pu puVar) {
        zq3.h(puVar, "athleticArticle");
        return j(puVar.c(), puVar.b(), puVar.a());
    }

    public final PromoAsset d(uu uuVar) {
        zq3.h(uuVar, "athleticLiveBlog");
        return j(uuVar.c(), uuVar.b(), uuVar.a());
    }

    public final PromoAsset e(bi0 bi0Var) {
        zq3.h(bi0Var, "cardDeck");
        return j(bi0Var.c(), bi0Var.b(), bi0Var.a());
    }

    public final PromoAsset f(g56 g56Var) {
        zq3.h(g56Var, AssetConstants.PROMO_TYPE);
        return new GraphQlPromoAsset(i(g56Var), g56Var.h(), false);
    }

    public final PromoAsset g(dt6 dt6Var) {
        zq3.h(dt6Var, "recipe");
        return j(dt6Var.c(), dt6Var.b(), dt6Var.a());
    }

    public final PromoAsset h(ci9 ci9Var) {
        zq3.h(ci9Var, "recipe");
        return j(ci9Var.c(), ci9Var.b(), ci9Var.a());
    }
}
