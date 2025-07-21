package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.u;
import defpackage.r14;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
abstract class t0 {
    private static final Class a = A();
    private static final w0 b = B(false);
    private static final w0 c = B(true);
    private static final w0 d = new y0();

    private static Class A() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static w0 B(boolean z) {
        try {
            Class C = C();
            if (C == null) {
                return null;
            }
            return (w0) C.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(n nVar, Object obj, Object obj2) {
        q c2 = nVar.c(obj2);
        if (c2.d()) {
            return;
        }
        nVar.d(obj).h(c2);
    }

    static void E(a0 a0Var, Object obj, Object obj2, long j) {
        z0.O(obj, j, a0Var.a(z0.A(obj, j), z0.A(obj2, j)));
    }

    static void F(w0 w0Var, Object obj, Object obj2) {
        w0Var.p(obj, w0Var.k(w0Var.g(obj), w0Var.g(obj2)));
    }

    public static w0 G() {
        return b;
    }

    public static w0 H() {
        return c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean J(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static Object K(int i, int i2, Object obj, w0 w0Var) {
        if (obj == null) {
            obj = w0Var.n();
        }
        w0Var.e(obj, i, i2);
        return obj;
    }

    public static w0 L() {
        return d;
    }

    public static void M(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.A(i, list, z);
    }

    public static void N(int i, List list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.I(i, list);
    }

    public static void O(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.G(i, list, z);
    }

    public static void P(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.n(i, list, z);
    }

    public static void Q(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.j(i, list, z);
    }

    public static void R(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.y(i, list, z);
    }

    public static void S(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.a(i, list, z);
    }

    public static void T(int i, List list, Writer writer, r0 r0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.O(i, list, r0Var);
    }

    public static void U(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.g(i, list, z);
    }

    public static void V(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.F(i, list, z);
    }

    public static void W(int i, List list, Writer writer, r0 r0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.L(i, list, r0Var);
    }

    public static void X(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.z(i, list, z);
    }

    public static void Y(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.q(i, list, z);
    }

    public static void Z(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.D(i, list, z);
    }

    static int a(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.L(i) + CodedOutputStream.x(size) : size * CodedOutputStream.d(i, true);
    }

    public static void a0(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.l(i, list, z);
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i, List list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.d(i, list);
    }

    static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L = size * CodedOutputStream.L(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            L += CodedOutputStream.g((ByteString) list.get(i2));
        }
        return L;
    }

    public static void c0(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.k(i, list, z);
    }

    static int d(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = e(list);
        return z ? CodedOutputStream.L(i) + CodedOutputStream.x(e) : e + (size * CodedOutputStream.L(i));
    }

    public static void d0(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.r(i, list, z);
    }

    static int e(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.k(tVar.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int f(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.L(i) + CodedOutputStream.x(size * 4) : size * CodedOutputStream.l(i, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.L(i) + CodedOutputStream.x(size * 8) : size * CodedOutputStream.n(i, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i, List list, r0 r0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.r(i, (f0) list.get(i3), r0Var);
        }
        return i2;
    }

    static int k(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = l(list);
        return z ? CodedOutputStream.L(i) + CodedOutputStream.x(l) : l + (size * CodedOutputStream.L(i));
    }

    static int l(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.u(tVar.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int m(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = n(list);
        return z ? CodedOutputStream.L(i) + CodedOutputStream.x(n) : n + (list.size() * CodedOutputStream.L(i));
    }

    static int n(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.w(xVar.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.w(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int o(int i, Object obj, r0 r0Var) {
        return CodedOutputStream.y(i, (f0) obj, r0Var);
    }

    static int p(int i, List list, r0 r0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L = CodedOutputStream.L(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            L += CodedOutputStream.z((f0) list.get(i2), r0Var);
        }
        return L;
    }

    static int q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = r(list);
        return z ? CodedOutputStream.L(i) + CodedOutputStream.x(r) : r + (size * CodedOutputStream.L(i));
    }

    static int r(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.G(tVar.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int s(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = t(list);
        return z ? CodedOutputStream.L(i) + CodedOutputStream.x(t) : t + (size * CodedOutputStream.L(i));
    }

    static int t(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.I(xVar.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.I(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int u(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int L = CodedOutputStream.L(i) * size;
        if (list instanceof r14) {
            r14 r14Var = (r14) list;
            while (i2 < size) {
                Object s = r14Var.s(i2);
                L += s instanceof ByteString ? CodedOutputStream.g((ByteString) s) : CodedOutputStream.K((String) s);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                L += obj instanceof ByteString ? CodedOutputStream.g((ByteString) obj) : CodedOutputStream.K((String) obj);
                i2++;
            }
        }
        return L;
    }

    static int v(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = w(list);
        return z ? CodedOutputStream.L(i) + CodedOutputStream.x(w) : w + (size * CodedOutputStream.L(i));
    }

    static int w(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.N(tVar.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.N(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int x(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = y(list);
        return z ? CodedOutputStream.L(i) + CodedOutputStream.x(y) : y + (size * CodedOutputStream.L(i));
    }

    static int y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.P(xVar.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.P(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static Object z(int i, List list, u.c cVar, Object obj, w0 w0Var) {
        if (cVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (cVar.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj = K(i, intValue, obj, w0Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = ((Integer) it2.next()).intValue();
                if (!cVar.a(intValue2)) {
                    obj = K(i, intValue2, obj, w0Var);
                    it2.remove();
                }
            }
        }
        return obj;
    }
}
