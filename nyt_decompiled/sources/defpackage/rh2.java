package defpackage;

import android.content.Context;
import com.google.firebase.abt.AbtException;
import defpackage.oc;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class rh2 {
    private final q76 a;
    private final String b;
    private Integer c = null;

    public rh2(Context context, q76 q76Var, String str) {
        this.a = q76Var;
        this.b = str;
    }

    private void a(oc.c cVar) {
        ((oc) this.a.get()).a(cVar);
    }

    private void b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(d());
        int g = g();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            d2 d2Var = (d2) it2.next();
            while (arrayDeque.size() >= g) {
                i(((oc.c) arrayDeque.pollFirst()).b);
            }
            oc.c d = d2Var.d(this.b);
            a(d);
            arrayDeque.offer(d);
        }
    }

    private static List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(d2.a((Map) it2.next()));
        }
        return arrayList;
    }

    private List d() {
        return ((oc) this.a.get()).g(this.b, "");
    }

    private ArrayList e(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            d2 d2Var = (d2) it2.next();
            if (!set.contains(d2Var.b())) {
                arrayList.add(d2Var);
            }
        }
        return arrayList;
    }

    private ArrayList f(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            oc.c cVar = (oc.c) it2.next();
            if (!set.contains(cVar.b)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    private int g() {
        if (this.c == null) {
            this.c = Integer.valueOf(((oc) this.a.get()).f(this.b));
        }
        return this.c.intValue();
    }

    private void i(String str) {
        ((oc) this.a.get()).clearConditionalUserProperty(str, null, null);
    }

    private void j(Collection collection) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            i(((oc.c) it2.next()).b);
        }
    }

    private void l(List list) {
        if (list.isEmpty()) {
            h();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            hashSet.add(((d2) it2.next()).b());
        }
        List d = d();
        HashSet hashSet2 = new HashSet();
        Iterator it3 = d.iterator();
        while (it3.hasNext()) {
            hashSet2.add(((oc.c) it3.next()).b);
        }
        j(f(d, hashSet));
        b(e(list, hashSet2));
    }

    private void m() {
        if (this.a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public void h() {
        m();
        j(d());
    }

    public void k(List list) {
        m();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        l(c(list));
    }
}
