package defpackage;

import com.nytimes.android.ribbon.destinations.wirecutter.WirecutterLockupsKt;
import defpackage.d65;
import defpackage.ki9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class c65 {
    private final p19 c(d65.d dVar) {
        List h0 = i.h0(dVar.a());
        ArrayList arrayList = new ArrayList(i.w(h0, 10));
        Iterator it2 = h0.iterator();
        while (it2.hasNext()) {
            arrayList.add(((d65.c) it2.next()).b());
        }
        return new p19(i.c1(arrayList));
    }

    private final fi9 d(ki9.d dVar) {
        return new fi9(String.valueOf(dVar.b().k()), dVar.b().g(), String.valueOf(dVar.b().l()), String.valueOf(dVar.b().d()));
    }

    public final fi9 a(ki9.b bVar) {
        fi9 d;
        zq3.h(bVar, "data");
        ki9.d a = bVar.a();
        return (a == null || (d = d(a)) == null) ? WirecutterLockupsKt.e() : d;
    }

    public final Set b(d65.b bVar) {
        d65.d a;
        p19 c;
        Set a2;
        zq3.h(bVar, "data");
        d65.e a3 = bVar.a();
        return (a3 == null || (a = a3.a()) == null || (c = c(a)) == null || (a2 = c.a()) == null) ? b0.e() : a2;
    }
}
