package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class rq8 {
    private final List a = new ArrayList();

    private static final class a {
        private final Class a;
        private final Class b;
        final j07 c;

        a(Class cls, Class cls2, j07 j07Var) {
            this.a = cls;
            this.b = cls2;
            this.c = j07Var;
        }

        public boolean a(Class cls, Class cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    public synchronized j07 a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return bx8.b();
        }
        for (a aVar : this.a) {
            if (aVar.a(cls, cls2)) {
                return aVar.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            if (((a) it2.next()).a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, j07 j07Var) {
        this.a.add(new a(cls, cls2, j07Var));
    }
}
