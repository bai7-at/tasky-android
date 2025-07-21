package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.AssetSection;
import com.nytimes.android.api.cms.Audio;
import com.nytimes.android.api.cms.AudioAsset;
import com.nytimes.android.api.cms.Column;
import com.nytimes.android.api.cms.DfpAssetMetaData;
import com.nytimes.android.api.cms.PodcastSeries;
import com.nytimes.android.api.cms.SubscribeUrl;
import com.nytimes.android.api.cms.Subsection;
import com.nytimes.android.api.cms.graphql.GraphQlAudioAsset;
import com.nytimes.android.apolloschema.ExtensionsKt;
import defpackage.lv;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.Sensitivity;

/* loaded from: classes4.dex */
public final class zv {
    private final rf3 a;

    public zv(rf3 rf3Var) {
        zq3.h(rf3Var, "imageAssetParser");
        this.a = rf3Var;
    }

    private final Asset a(lv.i iVar) {
        kf3 a = iVar.a();
        if (a != null) {
            return this.a.a(a);
        }
        return null;
    }

    private final PodcastSeries c(lv.h hVar, List list) {
        String c = hVar.c();
        String f = hVar.f();
        String d = hVar.d();
        String e = hVar.e();
        List<lv.k> list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        for (lv.k kVar : list2) {
            arrayList.add(new SubscribeUrl(kVar.a().getRawValue(), kVar.b()));
        }
        lv.g a = hVar.a();
        return new PodcastSeries(0L, c, f, d, e, null, arrayList, a != null ? this.a.a(a.a()) : null, 33, null);
    }

    private final AssetData d(lv lvVar) {
        DfpAssetMetaData dfpAssetMetaData;
        qt a;
        Sensitivity a2;
        uo0 a3;
        String w = lvVar.w();
        long parseLong = Long.parseLong(lvVar.r());
        String v = lvVar.v();
        lv.f i = lvVar.i();
        String a4 = i != null ? i.a() : null;
        if (a4 == null) {
            a4 = "";
        }
        String str = a4;
        lv.d d = lvVar.d();
        Column c = (d == null || (a3 = d.a()) == null) ? null : dp5.c(a3);
        boolean b = ExtensionsKt.b(lvVar.e().a());
        Instant l = lvVar.l();
        long epochSecond = l != null ? l.getEpochSecond() : 0L;
        Instant k = lvVar.k();
        long epochSecond2 = k != null ? k.getEpochSecond() : 0L;
        lv.f i2 = lvVar.i();
        String b2 = i2 != null ? i2.b() : null;
        lv.b b3 = lvVar.b();
        String b4 = (b3 == null || (a2 = b3.a()) == null) ? null : dp5.b(a2);
        String q = lvVar.q();
        lv.j p = lvVar.p();
        AssetSection d2 = (p == null || (a = p.a()) == null) ? null : dp5.d(a);
        List<lv.a> a5 = lvVar.a();
        if (a5 != null) {
            ArrayList arrayList = new ArrayList();
            for (lv.a aVar : a5) {
                kg8 a6 = aVar != null ? aVar.a() : null;
                if (a6 != null) {
                    arrayList.add(a6);
                }
            }
            dfpAssetMetaData = dp5.e(arrayList);
        } else {
            dfpAssetMetaData = null;
        }
        String u = lvVar.u();
        String x = lvVar.x();
        String j = lvVar.j();
        lv.c cVar = (lv.c) i.n0(lvVar.c(), 0);
        String a7 = cVar != null ? cVar.a() : null;
        lv.l t = lvVar.t();
        Subsection subsection = new Subsection(t != null ? t.a() : null, null);
        lv.i o = lvVar.o();
        return new AssetData(w, v, str, AssetConstants.METERED, null, null, c, null, b, epochSecond, epochSecond2, 0L, b2, b4, q, d2, dfpAssetMetaData, null, false, false, false, false, false, null, u, x, j, a7, null, null, subsection, o != null ? a(o) : null, null, null, parseLong, 821954736, 3, null);
    }

    private final Audio e(lv lvVar) {
        String f = lvVar.f();
        String g = lvVar.g();
        String h = lvVar.h();
        long m = lvVar.m();
        lv.h n = lvVar.n();
        return new Audio(f, g, h, m, n != null ? c(n, i.h0(lvVar.s())) : null);
    }

    public final AudioAsset b(lv lvVar) {
        zq3.h(lvVar, "audioAsset");
        return new GraphQlAudioAsset(d(lvVar), e(lvVar));
    }
}
