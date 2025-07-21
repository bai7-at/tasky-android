package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.Caption;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.api.cms.graphql.GraphQlImageAsset;
import defpackage.kf3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.text.h;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class rf3 {
    private final AssetData b(kf3 kf3Var) {
        String h = kf3Var.h();
        Long n = h.n(kf3Var.f());
        long longValue = n != null ? n.longValue() : -1L;
        String g = kf3Var.g();
        Instant e = kf3Var.e();
        long epochSecond = e != null ? e.getEpochSecond() : 0L;
        Instant d = kf3Var.d();
        return new AssetData(h, g, null, AssetConstants.METERED, null, null, null, null, false, epochSecond, d != null ? d.getEpochSecond() : 0L, 0L, null, null, null, null, null, null, false, false, false, false, false, null, null, kf3Var.i(), null, null, null, null, null, null, null, null, longValue, -33555980, 3, null);
    }

    private final Map c(List list) {
        ArrayList<kf3.c> arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i.B(arrayList, i.h0(((kf3.b) it2.next()).a()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(arrayList, 10)), 16));
        for (kf3.c cVar : arrayList) {
            linkedHashMap.put(cVar.b(), new ImageDimension(cVar.d(), cVar.a(), cVar.c()));
        }
        return linkedHashMap;
    }

    private final Image d(kf3 kf3Var) {
        kf3.a a = kf3Var.a();
        return new Image(new Caption(a != null ? a.a() : null, false), e(i.h0(kf3Var.c())), kf3Var.b(), kf3Var.h());
    }

    private final Image.ImageCrop e(List list) {
        Map c = c(list);
        return new Image.ImageCrop((ImageDimension) c.get("articleInline"), (ImageDimension) c.get("articleLarge"), (ImageDimension) c.get("popup"), (ImageDimension) c.get("jumbo"), (ImageDimension) c.get("superJumbo"), (ImageDimension) c.get("thumbLarge"), (ImageDimension) c.get("mediumThreeByTwo225"), (ImageDimension) c.get("mediumThreeByTwo210"), (ImageDimension) c.get("videoSixteenByNine1050"), (ImageDimension) c.get("mediumThreeByTwo440"), (ImageDimension) c.get("smallSquare168"), (ImageDimension) c.get("square320"), (ImageDimension) c.get("square640"), (ImageDimension) c.get("master675"), (ImageDimension) c.get("master768"), (ImageDimension) c.get("master1050"));
    }

    public final ImageAsset a(kf3 kf3Var) {
        zq3.h(kf3Var, "imageAsset");
        return new GraphQlImageAsset(b(kf3Var), d(kf3Var));
    }
}
