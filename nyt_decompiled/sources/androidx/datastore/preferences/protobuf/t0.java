package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t;
import defpackage.s14;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class t0 {
    private static final Class a = A();
    private static final x0 b = B(false);
    private static final x0 c = B(true);
    private static final x0 d = new z0();

    private static Class A() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static x0 B(boolean z) {
        try {
            Class C = C();
            if (C == null) {
                return null;
            }
            return (x0) C.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(m mVar, Object obj, Object obj2) {
        p c2 = mVar.c(obj2);
        if (c2.j()) {
            return;
        }
        mVar.d(obj).p(c2);
    }

    static void E(a0 a0Var, Object obj, Object obj2, long j) {
        a1.O(obj, j, a0Var.a(a1.A(obj, j), a1.A(obj2, j)));
    }

    static void F(x0 x0Var, Object obj, Object obj2) {
        x0Var.p(obj, x0Var.k(x0Var.g(obj), x0Var.g(obj2)));
    }

    public static x0 G() {
        return b;
    }

    public static x0 H() {
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

    static Object K(int i, int i2, Object obj, x0 x0Var) {
        if (obj == null) {
            obj = x0Var.n();
        }
        x0Var.e(obj, i, i2);
        return obj;
    }

    public static x0 L() {
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
        writer.J(i, list, r0Var);
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
        writer.O(i, list, r0Var);
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
        return z ? CodedOutputStream.P(i) + CodedOutputStream.y(size) : size * CodedOutputStream.c(i, true);
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
        int P = size * CodedOutputStream.P(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            P += CodedOutputStream.g((ByteString) list.get(i2));
        }
        return P;
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
        return z ? CodedOutputStream.P(i) + CodedOutputStream.y(e) : e + (size * CodedOutputStream.P(i));
    }

    public static void d0(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.r(i, list, z);
    }

    static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof s) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.k(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    static int f(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.P(i) + CodedOutputStream.y(size * 4) : size * CodedOutputStream.l(i, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.P(i) + CodedOutputStream.y(size * 8) : size * CodedOutputStream.n(i, 0L);
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
        return z ? CodedOutputStream.P(i) + CodedOutputStream.y(l) : l + (size * CodedOutputStream.P(i));
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof s) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.v(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    static int m(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = n(list);
        return z ? CodedOutputStream.P(i) + CodedOutputStream.y(n) : n + (list.size() * CodedOutputStream.P(i));
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.x(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    static int o(int i, Object obj, r0 r0Var) {
        return CodedOutputStream.z(i, (f0) obj, r0Var);
    }

    static int p(int i, List list, r0 r0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int P = CodedOutputStream.P(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            P += CodedOutputStream.B((f0) list.get(i2), r0Var);
        }
        return P;
    }

    static int q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = r(list);
        return z ? CodedOutputStream.P(i) + CodedOutputStream.y(r) : r + (size * CodedOutputStream.P(i));
    }

    static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof s) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.K(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    static int s(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = t(list);
        return z ? CodedOutputStream.P(i) + CodedOutputStream.y(t) : t + (size * CodedOutputStream.P(i));
    }

    static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.M(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    static int u(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int P = CodedOutputStream.P(i) * size;
        if (list instanceof s14) {
            s14 s14Var = (s14) list;
            while (i2 < size) {
                Object s = s14Var.s(i2);
                P += s instanceof ByteString ? CodedOutputStream.g((ByteString) s) : CodedOutputStream.O((String) s);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                P += obj instanceof ByteString ? CodedOutputStream.g((ByteString) obj) : CodedOutputStream.O((String) obj);
                i2++;
            }
        }
        return P;
    }

    static int v(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = w(list);
        return z ? CodedOutputStream.P(i) + CodedOutputStream.y(w) : w + (size * CodedOutputStream.P(i));
    }

    static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof s) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.R(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    static int x(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = y(list);
        return z ? CodedOutputStream.P(i) + CodedOutputStream.y(y) : y + (size * CodedOutputStream.P(i));
    }

    static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.T(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    static Object z(int i, List list, t.a aVar, Object obj, x0 x0Var) {
        if (aVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (aVar.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj = K(i, intValue, obj, x0Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = ((Integer) it2.next()).intValue();
                if (!aVar.a(intValue2)) {
                    obj = K(i, intValue2, obj, x0Var);
                    it2.remove();
                }
            }
        }
        return obj;
    }
}
