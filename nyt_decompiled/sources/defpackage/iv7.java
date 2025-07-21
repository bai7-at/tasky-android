package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.AssetSection;
import com.nytimes.android.api.cms.Caption;
import com.nytimes.android.api.cms.Column;
import com.nytimes.android.api.cms.DfpAssetMetaData;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.Slideshow;
import com.nytimes.android.api.cms.SlideshowAsset;
import com.nytimes.android.api.cms.Subsection;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.api.cms.graphql.GraphQlSlideshowAsset;
import com.nytimes.android.apolloschema.ExtensionsKt;
import defpackage.uu7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.text.h;
import org.threeten.bp.Instant;
import type.Sensitivity;

/* loaded from: classes4.dex */
public final class iv7 {
    private final rf3 a;
    private final b69 b;

    public iv7(rf3 rf3Var, b69 b69Var) {
        zq3.h(rf3Var, "imageAssetParser");
        zq3.h(b69Var, "videoAssetParser");
        this.a = rf3Var;
        this.b = b69Var;
    }

    private final Asset a(uu7.i iVar) {
        VideoAsset b;
        n59 b2 = iVar.b();
        if (b2 != null && (b = this.b.b(b2)) != null) {
            return b;
        }
        kf3 a = iVar.a();
        if (a != null) {
            return this.a.a(a);
        }
        return null;
    }

    private final AssetData c(uu7 uu7Var) {
        DfpAssetMetaData dfpAssetMetaData;
        String g;
        qt a;
        qt a2;
        Sensitivity a3;
        uo0 a4;
        String r = uu7Var.r();
        Long n = h.n(uu7Var.n());
        long longValue = n != null ? n.longValue() : -1L;
        String q = uu7Var.q();
        uu7.g f = uu7Var.f();
        String a5 = f != null ? f.a() : null;
        if (a5 == null) {
            a5 = "";
        }
        String str = a5;
        uu7.e d = uu7Var.d();
        Column c = (d == null || (a4 = d.a()) == null) ? null : dp5.c(a4);
        boolean b = ExtensionsKt.b(uu7Var.e().a());
        Instant i = uu7Var.i();
        long epochSecond = i != null ? i.getEpochSecond() : 0L;
        Instant h = uu7Var.h();
        long epochSecond2 = h != null ? h.getEpochSecond() : 0L;
        uu7.g f2 = uu7Var.f();
        String b2 = f2 != null ? f2.b() : null;
        uu7.b b3 = uu7Var.b();
        String b4 = (b3 == null || (a3 = b3.a()) == null) ? null : dp5.b(a3);
        String m = uu7Var.m();
        uu7.j k = uu7Var.k();
        AssetSection d2 = (k == null || (a2 = k.a()) == null) ? null : dp5.d(a2);
        List<uu7.a> a6 = uu7Var.a();
        if (a6 != null) {
            ArrayList arrayList = new ArrayList();
            for (uu7.a aVar : a6) {
                kg8 a7 = aVar != null ? aVar.a() : null;
                if (a7 != null) {
                    arrayList.add(a7);
                }
            }
            dfpAssetMetaData = dp5.e(arrayList);
        } else {
            dfpAssetMetaData = null;
        }
        String p = uu7Var.p();
        String s = uu7Var.s();
        uu7.j k2 = uu7Var.k();
        if (k2 == null || (a = k2.a()) == null || (g = a.a()) == null) {
            g = uu7Var.g();
        }
        String str2 = g;
        uu7.c cVar = (uu7.c) i.n0(uu7Var.c(), 0);
        String a8 = cVar != null ? cVar.a() : null;
        uu7.l o = uu7Var.o();
        Subsection subsection = new Subsection(o != null ? o.a() : null, null);
        uu7.i j = uu7Var.j();
        return new AssetData(r, q, str, AssetConstants.METERED, null, null, c, null, b, epochSecond, epochSecond2, 0L, b2, b4, m, d2, dfpAssetMetaData, null, false, false, false, false, false, null, p, s, str2, a8, null, null, subsection, j != null ? a(j) : null, null, null, longValue, 821954736, 3, null);
    }

    private final Slideshow d(List list) {
        uu7.h b;
        kf3 a;
        Image image;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            uu7.k kVar = (uu7.k) it2.next();
            Image image2 = null;
            if (kVar != null && (b = kVar.b()) != null && (a = b.a()) != null && (image = this.a.a(a).getImage()) != null) {
                uu7.d a2 = kVar.a();
                image2 = Image.copy$default(image, new Caption(a2 != null ? a2.a() : null, false, 2, null), null, null, null, 14, null);
            }
            if (image2 != null) {
                arrayList.add(image2);
            }
        }
        return new Slideshow(arrayList);
    }

    public final SlideshowAsset b(uu7 uu7Var) {
        zq3.h(uu7Var, "slideshowAsset");
        return new GraphQlSlideshowAsset(c(uu7Var), d(uu7Var.l()));
    }
}
