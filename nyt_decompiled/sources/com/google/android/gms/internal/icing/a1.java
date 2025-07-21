package com.google.android.gms.internal.icing;

import defpackage.i4d;
import defpackage.lh4;
import defpackage.rlc;
import java.util.List;

/* loaded from: classes3.dex */
abstract class a1 {
    private static final Class a;
    private static final d1 b;
    private static final d1 c;
    private static final d1 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = z(false);
        c = z(true);
        d = new f1();
    }

    public static void A(Class cls) {
        Class cls2;
        if (!z.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static int B(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += r.B(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    static int C(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return B(list) + (list.size() * r.y(i));
    }

    static int D(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += r.B(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    static int E(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return D(list) + (size * r.y(i));
    }

    static int F(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += r.B((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    static int G(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return F(list) + (size * r.y(i));
    }

    static int H(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += r.z(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    static int I(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + (size * r.y(i));
    }

    static int J(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += r.z(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    static int K(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J(list) + (size * r.y(i));
    }

    static int L(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += r.A(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    static int M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return L(list) + (size * r.y(i));
    }

    static int N(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += r.A((intValue >> 31) ^ (intValue + intValue));
        }
        return i;
    }

    static int O(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * r.y(i));
    }

    static int P(List list) {
        return list.size() * 4;
    }

    static int Q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (r.A(i << 3) + 4);
    }

    static int R(List list) {
        return list.size() * 8;
    }

    static int S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (r.A(i << 3) + 8);
    }

    static int T(List list) {
        return list.size();
    }

    static int U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (r.A(i << 3) + 1);
    }

    static int V(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int y = r.y(i) * size;
        if (list instanceof rlc) {
            rlc rlcVar = (rlc) list;
            while (i2 < size) {
                Object zzg = rlcVar.zzg(i2);
                y += zzg instanceof zzcf ? r.a((zzcf) zzg) : r.C((String) zzg);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                y += obj instanceof zzcf ? r.a((zzcf) obj) : r.C((String) obj);
                i2++;
            }
        }
        return y;
    }

    static int W(int i, Object obj, y0 y0Var) {
        return r.A(i << 3) + r.b((i4d) obj, y0Var);
    }

    static int X(int i, List list, y0 y0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = r.y(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            y += r.b((i4d) list.get(i2), y0Var);
        }
        return y;
    }

    static int Y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = size * r.y(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            y += r.a((zzcf) list.get(i2));
        }
        return y;
    }

    static int Z(int i, List list, y0 y0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += r.e(i, (i4d) list.get(i3), y0Var);
        }
        return i2;
    }

    public static d1 a() {
        return b;
    }

    public static d1 b() {
        return c;
    }

    public static d1 c() {
        return d;
    }

    static boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void e(t tVar, Object obj, Object obj2) {
        tVar.b(obj2);
        throw null;
    }

    static void f(d1 d1Var, Object obj, Object obj2) {
        d1Var.a(obj, d1Var.d(d1Var.b(obj), d1Var.b(obj2)));
    }

    static void g(l0 l0Var, Object obj, Object obj2, long j) {
        Object s = k1.s(obj, j);
        Object s2 = k1.s(obj2, j);
        lh4.a(s);
        lh4.a(s2);
        throw null;
    }

    public static void h(int i, List list, s sVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.I(i, list, z);
    }

    public static void i(int i, List list, s sVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.H(i, list, z);
    }

    public static void j(int i, List list, s sVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.E(i, list, z);
    }

    public static void k(int i, List list, s sVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.F(i, list, z);
    }

    public static void l(int i, List list, s sVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.i(i, list, z);
    }

    public static void m(int i, List list, s sVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.G(i, list, z);
    }

    public static void n(int i, List list, s sVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.g(i, list, z);
    }

    public static void o(int i, List list, s sVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.C(i, list, z);
    }

    public static void p(int i, List list, s sVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.e(i, list, z);
    }

    public static void q(int i, List list, s sVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.h(i, list, z);
    }

    public static void r(int i, List list, s sVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.D(i, list, z);
    }

    public static void s(int i, List list, s sVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.f(i, list, z);
    }

    public static void t(int i, List list, s sVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.a(i, list, z);
    }

    public static void u(int i, List list, s sVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.b(i, list, z);
    }

    public static void v(int i, List list, s sVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.c(i, list);
    }

    public static void w(int i, List list, s sVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        sVar.d(i, list);
    }

    public static void x(int i, List list, s sVar, y0 y0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            sVar.A(i, list.get(i2), y0Var);
        }
    }

    public static void y(int i, List list, s sVar, y0 y0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            sVar.B(i, list.get(i2), y0Var);
        }
    }

    private static d1 z(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (d1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
