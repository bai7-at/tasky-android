package defpackage;

import com.nytimes.android.api.cms.HybridCrop;
import com.nytimes.android.api.cms.HybridImage;
import com.nytimes.android.api.cms.HybridResource;
import defpackage.b73;
import defpackage.ph5;
import defpackage.qm1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class oh5 {
    private final HybridImage b(b73.c cVar) {
        List<b73.a> a = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (b73.a aVar : a) {
            HybridCrop hybridCrop = aVar == null ? null : new HybridCrop(aVar.b(), aVar.a());
            if (hybridCrop != null) {
                arrayList.add(hybridCrop);
            }
        }
        return new HybridImage(arrayList);
    }

    private final mh5 c(qm1.d dVar) {
        qm1.b a;
        String c = dVar.c();
        Instant a2 = dVar.a();
        if (a2 == null) {
            a2 = Instant.EPOCH;
        }
        zq3.e(a2);
        qm1.c b = dVar.b();
        return new mh5(c, a2, (b == null || (a = b.a()) == null) ? null : a.a());
    }

    public final nh5 a(ph5.b bVar) {
        zq3.h(bVar, "data");
        ph5.c a = bVar.a();
        zq3.e(a);
        b73 b = a.b();
        zq3.e(b);
        b73.b a2 = b.a();
        zq3.e(a2);
        qm1 a3 = a.a();
        List a4 = a3 != null ? a3.a() : null;
        if (a4 == null) {
            a4 = i.l();
        }
        String a5 = a2.b().a();
        List<b73.e> c = a2.c();
        ArrayList arrayList = new ArrayList();
        for (b73.e eVar : c) {
            HybridResource hybridResource = eVar == null ? null : new HybridResource(eVar.a());
            if (hybridResource != null) {
                arrayList.add(hybridResource);
            }
        }
        List<b73.c> a6 = a2.a();
        ArrayList arrayList2 = new ArrayList();
        for (b73.c cVar : a6) {
            HybridImage b2 = cVar != null ? b(cVar) : null;
            if (b2 != null) {
                arrayList2.add(b2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = a4.iterator();
        while (it2.hasNext()) {
            qm1.d a7 = ((qm1.a) it2.next()).a();
            if (a7 != null) {
                arrayList3.add(a7);
            }
        }
        ArrayList arrayList4 = new ArrayList(i.w(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(c((qm1.d) it3.next()));
        }
        return new nh5(a5, arrayList, arrayList2, arrayList4);
    }
}
