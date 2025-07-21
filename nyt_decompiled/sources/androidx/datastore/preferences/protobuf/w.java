package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t;
import defpackage.ix8;
import defpackage.s14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class w {
    private static final w a;
    private static final w b;

    private static final class b extends w {
        private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j) {
            return (List) a1.A(obj, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static List g(Object obj, long j, int i) {
            v vVar;
            List f = f(obj, j);
            if (f.isEmpty()) {
                List vVar2 = f instanceof s14 ? new v(i) : ((f instanceof m0) && (f instanceof t.b)) ? ((t.b) f).m(i) : new ArrayList(i);
                a1.O(obj, j, vVar2);
                return vVar2;
            }
            if (c.isAssignableFrom(f.getClass())) {
                ArrayList arrayList = new ArrayList(f.size() + i);
                arrayList.addAll(f);
                a1.O(obj, j, arrayList);
                vVar = arrayList;
            } else {
                if (!(f instanceof ix8)) {
                    if (!(f instanceof m0) || !(f instanceof t.b)) {
                        return f;
                    }
                    t.b bVar = (t.b) f;
                    if (bVar.l()) {
                        return f;
                    }
                    t.b m = bVar.m(f.size() + i);
                    a1.O(obj, j, m);
                    return m;
                }
                v vVar3 = new v(f.size() + i);
                vVar3.addAll((ix8) f);
                a1.O(obj, j, vVar3);
                vVar = vVar3;
            }
            return vVar;
        }

        @Override // androidx.datastore.preferences.protobuf.w
        void c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) a1.A(obj, j);
            if (list instanceof s14) {
                unmodifiableList = ((s14) list).r();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof m0) && (list instanceof t.b)) {
                    t.b bVar = (t.b) list;
                    if (bVar.l()) {
                        bVar.d();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            a1.O(obj, j, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.w
        void d(Object obj, Object obj2, long j) {
            List f = f(obj2, j);
            List g = g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            a1.O(obj, j, f);
        }

        @Override // androidx.datastore.preferences.protobuf.w
        List e(Object obj, long j) {
            return g(obj, j, 10);
        }
    }

    private static final class c extends w {
        private c() {
            super();
        }

        static t.b f(Object obj, long j) {
            return (t.b) a1.A(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.w
        void c(Object obj, long j) {
            f(obj, j).d();
        }

        @Override // androidx.datastore.preferences.protobuf.w
        void d(Object obj, Object obj2, long j) {
            t.b f = f(obj, j);
            t.b f2 = f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.l()) {
                    f = f.m(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            a1.O(obj, j, f2);
        }

        @Override // androidx.datastore.preferences.protobuf.w
        List e(Object obj, long j) {
            t.b f = f(obj, j);
            if (f.l()) {
                return f;
            }
            int size = f.size();
            t.b m = f.m(size == 0 ? 10 : size * 2);
            a1.O(obj, j, m);
            return m;
        }
    }

    static {
        a = new b();
        b = new c();
    }

    static w a() {
        return a;
    }

    static w b() {
        return b;
    }

    abstract void c(Object obj, long j);

    abstract void d(Object obj, Object obj2, long j);

    abstract List e(Object obj, long j);

    private w() {
    }
}
