package defpackage;

import com.nytimes.android.api.cms.Article;
import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.AssetSection;
import com.nytimes.android.api.cms.Column;
import com.nytimes.android.api.cms.DfpAssetMetaData;
import com.nytimes.android.api.cms.HybridContent;
import com.nytimes.android.api.cms.HybridCrop;
import com.nytimes.android.api.cms.HybridImage;
import com.nytimes.android.api.cms.HybridResource;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.InteractiveAsset;
import com.nytimes.android.api.cms.SlideshowAsset;
import com.nytimes.android.api.cms.Subsection;
import com.nytimes.android.api.cms.graphql.GraphQlArticleAsset;
import com.nytimes.android.apolloschema.ExtensionsKt;
import defpackage.gp;
import defpackage.gz1;
import defpackage.tp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.text.h;
import org.threeten.bp.Instant;
import type.Sensitivity;

/* loaded from: classes4.dex */
public final class sp {
    private final rf3 a;
    private final so3 b;
    private final iv7 c;
    private final b69 d;

    public sp(rf3 rf3Var, so3 so3Var, iv7 iv7Var, b69 b69Var) {
        zq3.h(rf3Var, "imageAssetParser");
        zq3.h(so3Var, "interactiveAssetParser");
        zq3.h(iv7Var, "slideshowAssetParser");
        zq3.h(b69Var, "videoAssetParser");
        this.a = rf3Var;
        this.b = so3Var;
        this.c = iv7Var;
        this.d = b69Var;
    }

    private final long a(gp gpVar) {
        Instant k;
        gp.g h = gpVar.h();
        if ((h == null || (k = h.a()) == null) && (k = gpVar.k()) == null) {
            return 0L;
        }
        return k.getEpochSecond();
    }

    private final long b(tp tpVar) {
        Instant k;
        tp.b b = tpVar.b();
        if ((b == null || (k = b.b()) == null) && (k = tpVar.a().k()) == null) {
            return 0L;
        }
        return k.getEpochSecond();
    }

    private final Asset e(gp.h hVar) {
        gz1.a a;
        kf3 a2;
        InteractiveAsset b;
        ho3 c = hVar.c();
        if (c != null && (b = this.b.b(c)) != null) {
            return b;
        }
        n59 e = hVar.e();
        if (e != null) {
            return this.d.b(e);
        }
        kf3 b2 = hVar.b();
        ImageAsset a3 = b2 != null ? this.a.a(b2) : null;
        if (a3 != null) {
            return a3;
        }
        uu7 d = hVar.d();
        SlideshowAsset b3 = d != null ? this.c.b(d) : null;
        if (b3 != null) {
            return b3;
        }
        gz1 a4 = hVar.a();
        if (a4 == null || (a = a4.a()) == null || (a2 = a.a()) == null) {
            return null;
        }
        return this.a.a(a2);
    }

    private final AssetData f(gp gpVar, long j) {
        DfpAssetMetaData dfpAssetMetaData;
        qt a;
        Sensitivity a2;
        uo0 a3;
        String s = gpVar.s();
        Long n = h.n(gpVar.o());
        long longValue = n != null ? n.longValue() : -1L;
        String r = gpVar.r();
        gp.f g = gpVar.g();
        String a4 = g != null ? g.a() : null;
        if (a4 == null) {
            a4 = "";
        }
        String str = a4;
        gp.d d = gpVar.d();
        Column c = (d == null || (a3 = d.a()) == null) ? null : dp5.c(a3);
        boolean b = ExtensionsKt.b(gpVar.e().a());
        Instant j2 = gpVar.j();
        long epochSecond = j2 != null ? j2.getEpochSecond() : 0L;
        gp.f g2 = gpVar.g();
        String b2 = g2 != null ? g2.b() : null;
        gp.b b3 = gpVar.b();
        String b4 = (b3 == null || (a2 = b3.a()) == null) ? null : dp5.b(a2);
        String n2 = gpVar.n();
        gp.i m = gpVar.m();
        AssetSection d2 = (m == null || (a = m.a()) == null) ? null : dp5.d(a);
        List<gp.a> a5 = gpVar.a();
        if (a5 != null) {
            ArrayList arrayList = new ArrayList();
            for (gp.a aVar : a5) {
                kg8 a6 = aVar != null ? aVar.a() : null;
                if (a6 != null) {
                    arrayList.add(a6);
                }
            }
            dfpAssetMetaData = dp5.e(arrayList);
        } else {
            dfpAssetMetaData = null;
        }
        String q = gpVar.q();
        String t = gpVar.t();
        String i = gpVar.i();
        gp.c cVar = (gp.c) i.n0(gpVar.c(), 0);
        String a7 = cVar != null ? cVar.a() : null;
        gp.j p = gpVar.p();
        Subsection subsection = new Subsection(p != null ? p.a() : null, null);
        gp.h l = gpVar.l();
        return new AssetData(s, r, str, AssetConstants.METERED, null, null, c, null, b, j, epochSecond, 0L, b2, b4, n2, d2, dfpAssetMetaData, null, false, false, false, false, false, null, q, t, i, a7, null, null, subsection, l != null ? e(l) : null, gpVar.f(), null, longValue, 821954736, 2, null);
    }

    private final Article g(tp.b bVar) {
        HybridContent hybridContent = new HybridContent(bVar.c().a());
        List d = bVar.d();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            tp.e eVar = (tp.e) it2.next();
            HybridResource j = eVar != null ? j(eVar) : null;
            if (j != null) {
                arrayList.add(j);
            }
        }
        List<tp.c> a = bVar.a();
        ArrayList arrayList2 = new ArrayList();
        for (tp.c cVar : a) {
            HybridImage i = cVar != null ? i(cVar) : null;
            if (i != null) {
                arrayList2.add(i);
            }
        }
        return new Article(hybridContent, arrayList, arrayList2);
    }

    private final HybridCrop h(tp.a aVar) {
        return new HybridCrop(aVar.b(), aVar.a());
    }

    private final HybridImage i(tp.c cVar) {
        List<tp.a> a = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (tp.a aVar : a) {
            HybridCrop h = aVar != null ? h(aVar) : null;
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new HybridImage(arrayList);
    }

    private final HybridResource j(tp.e eVar) {
        return new HybridResource(eVar.a());
    }

    public final ArticleAsset c(gp gpVar) {
        zq3.h(gpVar, "articleAsset");
        return new GraphQlArticleAsset(f(gpVar, a(gpVar)), null, null, 6, null);
    }

    public final ArticleAsset d(tp tpVar) {
        zq3.h(tpVar, "articleAsset");
        AssetData f = f(tpVar.a(), b(tpVar));
        tp.b b = tpVar.b();
        return new GraphQlArticleAsset(f, b != null ? g(b) : null, null, 4, null);
    }
}
