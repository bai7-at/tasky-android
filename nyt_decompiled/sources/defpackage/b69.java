package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.AssetSection;
import com.nytimes.android.api.cms.Column;
import com.nytimes.android.api.cms.ContentSeries;
import com.nytimes.android.api.cms.DfpAssetMetaData;
import com.nytimes.android.api.cms.PlaylistRef;
import com.nytimes.android.api.cms.Subsection;
import com.nytimes.android.api.cms.Video;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.api.cms.graphql.GraphQlVideoAsset;
import com.nytimes.android.apolloschema.ExtensionsKt;
import defpackage.n59;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.text.h;
import okhttp3.internal.ws.WebSocketProtocol;
import org.threeten.bp.Instant;
import type.Sensitivity;

/* loaded from: classes4.dex */
public final class b69 {
    private final rf3 a;

    public b69(rf3 rf3Var) {
        zq3.h(rf3Var, "imageAssetParser");
        this.a = rf3Var;
    }

    private final Asset a(n59.i iVar) {
        kf3 a = iVar.a();
        if (a != null) {
            return this.a.a(a);
        }
        return null;
    }

    private final AssetData c(n59 n59Var) {
        DfpAssetMetaData dfpAssetMetaData;
        qt a;
        Sensitivity a2;
        uo0 a3;
        String y = n59Var.y();
        long parseLong = Long.parseLong(n59Var.t());
        String x = n59Var.x();
        n59.g i = n59Var.i();
        String a4 = i != null ? i.a() : null;
        if (a4 == null) {
            a4 = "";
        }
        String str = a4;
        n59.d e = n59Var.e();
        Column c = (e == null || (a3 = e.a()) == null) ? null : dp5.c(a3);
        boolean b = ExtensionsKt.b(n59Var.f().a());
        Instant l = n59Var.l();
        long epochSecond = l != null ? l.getEpochSecond() : 0L;
        Instant k = n59Var.k();
        long epochSecond2 = k != null ? k.getEpochSecond() : 0L;
        n59.g i2 = n59Var.i();
        String b2 = i2 != null ? i2.b() : null;
        n59.b b3 = n59Var.b();
        String b4 = (b3 == null || (a2 = b3.a()) == null) ? null : dp5.b(a2);
        String s = n59Var.s();
        n59.k r = n59Var.r();
        AssetSection d = (r == null || (a = r.a()) == null) ? null : dp5.d(a);
        List<n59.a> a5 = n59Var.a();
        if (a5 != null) {
            ArrayList arrayList = new ArrayList();
            for (n59.a aVar : a5) {
                kg8 a6 = aVar != null ? aVar.a() : null;
                if (a6 != null) {
                    arrayList.add(a6);
                }
            }
            dfpAssetMetaData = dp5.e(arrayList);
        } else {
            dfpAssetMetaData = null;
        }
        String v = n59Var.v();
        String z = n59Var.z();
        String j = n59Var.j();
        n59.c cVar = (n59.c) i.n0(n59Var.d(), 0);
        String a7 = cVar != null ? cVar.a() : null;
        n59.l u = n59Var.u();
        Subsection subsection = new Subsection(u != null ? u.a() : null, null);
        n59.i p = n59Var.p();
        return new AssetData(y, x, str, AssetConstants.METERED, null, null, c, null, b, epochSecond, epochSecond2, 0L, b2, b4, s, d, dfpAssetMetaData, null, false, false, false, false, false, null, v, z, j, a7, null, null, subsection, p != null ? a(p) : null, null, null, parseLong, 821954736, 3, null);
    }

    private final List d(n59.h hVar) {
        Long n = h.n(hVar.b());
        long longValue = n != null ? n.longValue() : 0L;
        String c = hVar.c();
        n59.f a = hVar.a();
        return i.e(new PlaylistRef(longValue, c, a != null ? a.a() : null));
    }

    private final Video e(n59 n59Var, Sensitivity sensitivity) {
        Video.Channel channel;
        List m = n59Var.m();
        ArrayList arrayList = new ArrayList(i.w(m, 10));
        Iterator it2 = m.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            arrayList.add(new Video.LiveUrl(0, (String) it2.next(), 1, null));
        }
        boolean C = n59Var.C();
        n59.h n = n59Var.n();
        List d = n != null ? d(n) : null;
        n59.h n2 = n59Var.n();
        if (n2 != null) {
            n59.f a = n2.a();
            channel = new Video.Channel(a != null ? a.a() : null);
        } else {
            channel = null;
        }
        ContentSeries contentSeries = new ContentSeries(n59Var.g(), n59Var.g());
        String c = n59Var.c();
        List<n59.j> h0 = i.h0(n59Var.q());
        ArrayList arrayList2 = new ArrayList(i.w(h0, 10));
        for (n59.j jVar : h0) {
            String b = jVar.b();
            Integer c2 = jVar.c();
            arrayList2.add(new Video.VideoFiles(c2 != null ? c2.intValue() : 0, 0, 0, 0, false, 0L, null, b, jVar.a(), WebSocketProtocol.PAYLOAD_SHORT, null));
        }
        return new Video(arrayList, C, d, null, contentSeries, c, channel, arrayList2, n59Var.h() != null ? r1.intValue() : 0L, dp5.a(sensitivity), n59Var.o().getRawValue(), n59Var.w(), 8, null);
    }

    public final VideoAsset b(n59 n59Var) {
        zq3.h(n59Var, "videoAsset");
        AssetData c = c(n59Var);
        n59.b b = n59Var.b();
        return new GraphQlVideoAsset(c, e(n59Var, b != null ? b.a() : null));
    }
}
