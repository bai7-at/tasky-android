package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.AssetSection;
import com.nytimes.android.api.cms.Column;
import com.nytimes.android.api.cms.DfpAssetMetaData;
import com.nytimes.android.api.cms.LegacyCollectionAsset;
import com.nytimes.android.api.cms.Subsection;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.api.cms.graphql.GraphQlLegacyCollectionAsset;
import com.nytimes.android.apolloschema.ExtensionsKt;
import defpackage.d24;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.Sensitivity;

/* loaded from: classes4.dex */
public final class t24 {
    private final rf3 a;
    private final iv7 b;
    private final b69 c;

    public t24(rf3 rf3Var, iv7 iv7Var, b69 b69Var) {
        zq3.h(rf3Var, "imageAssetParser");
        zq3.h(iv7Var, "slideshowAssetParser");
        zq3.h(b69Var, "videoAssetParser");
        this.a = rf3Var;
        this.b = iv7Var;
        this.c = b69Var;
    }

    private final Asset a(d24.g gVar) {
        VideoAsset b;
        n59 c = gVar.c();
        if (c != null && (b = this.c.b(c)) != null) {
            return b;
        }
        kf3 a = gVar.a();
        if (a != null) {
            return this.a.a(a);
        }
        uu7 b2 = gVar.b();
        return b2 != null ? this.b.b(b2) : null;
    }

    private final AssetData c(d24 d24Var) {
        DfpAssetMetaData dfpAssetMetaData;
        qt a;
        Sensitivity a2;
        uo0 a3;
        String q = d24Var.q();
        long d = d(d24Var);
        String p = d24Var.p();
        d24.f f = d24Var.f();
        String a4 = f != null ? f.a() : null;
        if (a4 == null) {
            a4 = "";
        }
        String str = a4;
        d24.d d2 = d24Var.d();
        Column c = (d2 == null || (a3 = d2.a()) == null) ? null : dp5.c(a3);
        boolean b = ExtensionsKt.b(d24Var.e().a());
        Instant i = d24Var.i();
        long epochSecond = i != null ? i.getEpochSecond() : 0L;
        Instant h = d24Var.h();
        long epochSecond2 = h != null ? h.getEpochSecond() : 0L;
        d24.f f2 = d24Var.f();
        String b2 = f2 != null ? f2.b() : null;
        d24.b b3 = d24Var.b();
        String b4 = (b3 == null || (a2 = b3.a()) == null) ? null : dp5.b(a2);
        String l = d24Var.l();
        d24.h k = d24Var.k();
        AssetSection d3 = (k == null || (a = k.a()) == null) ? null : dp5.d(a);
        List<d24.a> a5 = d24Var.a();
        if (a5 != null) {
            ArrayList arrayList = new ArrayList();
            for (d24.a aVar : a5) {
                kg8 a6 = aVar != null ? aVar.a() : null;
                if (a6 != null) {
                    arrayList.add(a6);
                }
            }
            dfpAssetMetaData = dp5.e(arrayList);
        } else {
            dfpAssetMetaData = null;
        }
        String o = d24Var.o();
        String r = d24Var.r();
        String g = d24Var.g();
        d24.c cVar = (d24.c) i.n0(d24Var.c(), 0);
        String a7 = cVar != null ? cVar.a() : null;
        d24.i n = d24Var.n();
        Subsection subsection = new Subsection(n != null ? n.a() : null, null);
        d24.g j = d24Var.j();
        return new AssetData(q, p, str, AssetConstants.METERED, null, null, c, null, b, epochSecond, epochSecond2, 0L, b2, b4, l, d3, dfpAssetMetaData, null, false, false, false, false, false, null, o, r, g, a7, null, null, subsection, j != null ? a(j) : null, null, null, d, 821954736, 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long d(defpackage.d24 r3) {
        /*
            r2 = this;
            java.lang.String r2 = r3.m()
            r0 = 0
        L5:
            int r1 = r2.length()
            if (r0 >= r1) goto L19
            char r1 = r2.charAt(r0)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 != 0) goto L16
            goto L2c
        L16:
            int r0 = r0 + 1
            goto L5
        L19:
            java.lang.String r2 = r3.m()
            boolean r2 = kotlin.text.h.d0(r2)
            if (r2 != 0) goto L2c
            java.lang.String r2 = r3.m()
            long r2 = java.lang.Long.parseLong(r2)
            goto L2e
        L2c:
            r2 = 0
        L2e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t24.d(d24):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LegacyCollectionAsset b(d24 d24Var) {
        zq3.h(d24Var, "legacyCollectionAsset");
        return new GraphQlLegacyCollectionAsset(c(d24Var), null, 2, 0 == true ? 1 : 0);
    }
}
