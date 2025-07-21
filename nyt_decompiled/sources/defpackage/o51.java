package defpackage;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class o51 {

    private static class b {
        private final nq0 a;
        private final Set b = new HashSet();
        private final Set c = new HashSet();

        b(nq0 nq0Var) {
            this.a = nq0Var;
        }

        void a(b bVar) {
            this.b.add(bVar);
        }

        void b(b bVar) {
            this.c.add(bVar);
        }

        nq0 c() {
            return this.a;
        }

        Set d() {
            return this.b;
        }

        boolean e() {
            return this.b.isEmpty();
        }

        boolean f() {
            return this.c.isEmpty();
        }

        void g(b bVar) {
            this.c.remove(bVar);
        }
    }

    private static class c {
        private final Class a;
        private final boolean b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b == this.b;
        }

        public int hashCode() {
            return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
        }

        private c(Class cls, boolean z) {
            this.a = cls;
            this.b = z;
        }
    }

    static void a(List list) {
        Set<b> c2 = c(list);
        Set b2 = b(c2);
        int i = 0;
        while (!b2.isEmpty()) {
            b bVar = (b) b2.iterator().next();
            b2.remove(bVar);
            i++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    b2.add(bVar2);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : c2) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    for (b bVar : (Set) it3.next()) {
                        for (km1 km1Var : bVar.c().e()) {
                            if (km1Var.e() && (set = (Set) hashMap.get(new c(km1Var.c(), km1Var.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it4 = hashMap.values().iterator();
                while (it4.hasNext()) {
                    hashSet.addAll((Set) it4.next());
                }
                return hashSet;
            }
            nq0 nq0Var = (nq0) it2.next();
            b bVar3 = new b(nq0Var);
            for (Class cls : nq0Var.h()) {
                c cVar = new c(cls, !nq0Var.n());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar3);
            }
        }
    }
}
