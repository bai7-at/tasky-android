package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class jz6 {
    private final List a = new ArrayList();
    private final Map b = new HashMap();

    private static class a {
        private final Class a;
        final Class b;
        final iz6 c;

        public a(Class cls, Class cls2, iz6 iz6Var) {
            this.a = cls;
            this.b = cls2;
            this.c = iz6Var;
        }

        public boolean a(Class cls, Class cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    private synchronized List c(String str) {
        List list;
        try {
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            list = (List) this.b.get(str);
            if (list == null) {
                list = new ArrayList();
                this.b.put(str, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }

    public synchronized void a(String str, iz6 iz6Var, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, iz6Var));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            List<a> list = (List) this.b.get((String) it2.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            List<a> list = (List) this.b.get((String) it2.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.b)) {
                        arrayList.add(aVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.a);
            this.a.clear();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                this.a.add((String) it2.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
