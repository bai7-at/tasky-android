package defpackage;

import defpackage.bu2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class hv2 {
    private final e23 a;

    public hv2(e23 e23Var) {
        zq3.h(e23Var, "assetParser");
        this.a = e23Var;
    }

    private final List b(bu2.g gVar) {
        List list;
        List list2;
        bu2.b a;
        List<bu2.i> a2;
        bu2.a a3;
        List<bu2.h> a4;
        bu2.d a5;
        List<bu2.k> a6;
        bu2.f a7 = gVar.a();
        List list3 = null;
        if (a7 == null || (a5 = a7.a()) == null || (a6 = a5.a()) == null) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (bu2.k kVar : a6) {
                bu2.p a8 = kVar != null ? kVar.a() : null;
                if (a8 != null) {
                    arrayList.add(a8);
                }
            }
            list = d(arrayList);
        }
        bu2.r d = gVar.d();
        if (d == null || (a3 = d.a()) == null || (a4 = a3.a()) == null) {
            list2 = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (bu2.h hVar : a4) {
                bu2.m a9 = hVar != null ? hVar.a() : null;
                if (a9 != null) {
                    arrayList2.add(a9);
                }
            }
            list2 = g(arrayList2);
        }
        bu2.q c = gVar.c();
        if (c != null && (a = c.a()) != null && (a2 = a.a()) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (bu2.i iVar : a2) {
                bu2.n a10 = iVar != null ? iVar.a() : null;
                if (a10 != null) {
                    arrayList3.add(a10);
                }
            }
            list3 = f(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        if (list != null) {
            arrayList4.addAll(list);
        }
        if (list2 != null) {
            arrayList4.addAll(list2);
        }
        if (list3 != null) {
            arrayList4.addAll(list3);
        }
        return this.a.b(arrayList4);
    }

    private final List c(bu2.l lVar) {
        bu2.c a;
        List<bu2.j> a2;
        List list = null;
        if (lVar != null && (a = lVar.a()) != null && (a2 = a.a()) != null) {
            ArrayList arrayList = new ArrayList();
            for (bu2.j jVar : a2) {
                bu2.o a3 = jVar != null ? jVar.a() : null;
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            list = e(arrayList);
        }
        e23 e23Var = this.a;
        if (list == null) {
            list = i.l();
        }
        return e23Var.b(list);
    }

    private final List d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            gp a = ((bu2.p) it2.next()).a();
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    private final List e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            gp a = ((bu2.o) it2.next()).a();
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    private final List f(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            gp a = ((bu2.n) it2.next()).a();
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    private final List g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            gp a = ((bu2.m) it2.next()).a();
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public final List a(bu2.g gVar) {
        zq3.h(gVar, "data");
        List c = c(gVar.b());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(b(gVar));
        arrayList.addAll(c);
        return arrayList;
    }
}
