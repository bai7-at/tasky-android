package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.u;
import defpackage.hx8;
import defpackage.r14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
abstract class w {
    private static final w a;
    private static final w b;

    private static final class b extends w {
        private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j) {
            return (List) z0.A(obj, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static List g(Object obj, long j, int i) {
            v vVar;
            List f = f(obj, j);
            if (f.isEmpty()) {
                List vVar2 = f instanceof r14 ? new v(i) : ((f instanceof m0) && (f instanceof u.d)) ? ((u.d) f).m(i) : new ArrayList(i);
                z0.O(obj, j, vVar2);
                return vVar2;
            }
            if (c.isAssignableFrom(f.getClass())) {
                ArrayList arrayList = new ArrayList(f.size() + i);
                arrayList.addAll(f);
                z0.O(obj, j, arrayList);
                vVar = arrayList;
            } else {
                if (!(f instanceof hx8)) {
                    if (!(f instanceof m0) || !(f instanceof u.d)) {
                        return f;
                    }
                    u.d dVar = (u.d) f;
                    if (dVar.l()) {
                        return f;
                    }
                    u.d m = dVar.m(f.size() + i);
                    z0.O(obj, j, m);
                    return m;
                }
                v vVar3 = new v(f.size() + i);
                vVar3.addAll((hx8) f);
                z0.O(obj, j, vVar3);
                vVar = vVar3;
            }
            return vVar;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.w
        void c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) z0.A(obj, j);
            if (list instanceof r14) {
                unmodifiableList = ((r14) list).r();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof m0) && (list instanceof u.d)) {
                    u.d dVar = (u.d) list;
                    if (dVar.l()) {
                        dVar.d();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            z0.O(obj, j, unmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.w
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
            z0.O(obj, j, f);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.w
        List e(Object obj, long j) {
            return g(obj, j, 10);
        }
    }

    private static final class c extends w {
        private c() {
            super();
        }

        static u.d f(Object obj, long j) {
            return (u.d) z0.A(obj, j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.w
        void c(Object obj, long j) {
            f(obj, j).d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.w
        void d(Object obj, Object obj2, long j) {
            u.d f = f(obj, j);
            u.d f2 = f(obj2, j);
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
            z0.O(obj, j, f2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.w
        List e(Object obj, long j) {
            u.d f = f(obj, j);
            if (f.l()) {
                return f;
            }
            int size = f.size();
            u.d m = f.m(size == 0 ? 10 : size * 2);
            z0.O(obj, j, m);
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
