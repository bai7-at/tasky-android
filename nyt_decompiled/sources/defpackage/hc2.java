package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.AssetSection;
import com.nytimes.android.api.cms.Column;
import com.nytimes.android.api.cms.DfpAssetMetaData;
import com.nytimes.android.api.cms.InteractiveAsset;
import com.nytimes.android.api.cms.Subsection;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.api.cms.graphql.GraphQlInteractiveAsset;
import com.nytimes.android.apolloschema.ExtensionsKt;
import defpackage.wb2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.Sensitivity;

/* loaded from: classes4.dex */
public final class hc2 {
    private final rf3 a;
    private final iv7 b;
    private final b69 c;

    public hc2(rf3 rf3Var, iv7 iv7Var, b69 b69Var) {
        zq3.h(rf3Var, "imageAssetParser");
        zq3.h(iv7Var, "slideshowAssetParser");
        zq3.h(b69Var, "videoAssetParser");
        this.a = rf3Var;
        this.b = iv7Var;
        this.c = b69Var;
    }

    private final Asset a(wb2.g gVar) {
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

    private final AssetData c(wb2 wb2Var) {
        DfpAssetMetaData dfpAssetMetaData;
        qt a;
        Sensitivity a2;
        uo0 a3;
        String q = wb2Var.q();
        long d = d(wb2Var);
        String p = wb2Var.p();
        wb2.f f = wb2Var.f();
        String a4 = f != null ? f.a() : null;
        if (a4 == null) {
            a4 = "";
        }
        String str = a4;
        wb2.d d2 = wb2Var.d();
        Column c = (d2 == null || (a3 = d2.a()) == null) ? null : dp5.c(a3);
        boolean b = ExtensionsKt.b(wb2Var.e().a());
        Instant i = wb2Var.i();
        long epochSecond = i != null ? i.getEpochSecond() : 0L;
        Instant h = wb2Var.h();
        long epochSecond2 = h != null ? h.getEpochSecond() : 0L;
        wb2.f f2 = wb2Var.f();
        String b2 = f2 != null ? f2.b() : null;
        wb2.b b3 = wb2Var.b();
        String b4 = (b3 == null || (a2 = b3.a()) == null) ? null : dp5.b(a2);
        String l = wb2Var.l();
        wb2.h k = wb2Var.k();
        AssetSection d3 = (k == null || (a = k.a()) == null) ? null : dp5.d(a);
        List<wb2.a> a5 = wb2Var.a();
        if (a5 != null) {
            ArrayList arrayList = new ArrayList();
            for (wb2.a aVar : a5) {
                kg8 a6 = aVar != null ? aVar.a() : null;
                if (a6 != null) {
                    arrayList.add(a6);
                }
            }
            dfpAssetMetaData = dp5.e(arrayList);
        } else {
            dfpAssetMetaData = null;
        }
        String o = wb2Var.o();
        String r = wb2Var.r();
        String g = wb2Var.g();
        wb2.c cVar = (wb2.c) i.n0(wb2Var.c(), 0);
        String a7 = cVar != null ? cVar.a() : null;
        wb2.i n = wb2Var.n();
        Subsection subsection = new Subsection(n != null ? n.a() : null, null);
        wb2.g j = wb2Var.j();
        return new AssetData(q, p, str, AssetConstants.METERED, null, null, c, null, b, epochSecond, epochSecond2, 0L, b2, b4, l, d3, dfpAssetMetaData, null, false, false, false, false, false, null, o, r, g, a7, null, null, subsection, j != null ? a(j) : null, null, null, d, 821954736, 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long d(defpackage.wb2 r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc2.d(wb2):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InteractiveAsset b(wb2 wb2Var) {
        zq3.h(wb2Var, "feedPublicationAsset");
        return new GraphQlInteractiveAsset(c(wb2Var), null, 2, 0 == true ? 1 : 0);
    }
}
