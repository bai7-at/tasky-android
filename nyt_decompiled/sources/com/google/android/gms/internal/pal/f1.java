package com.google.android.gms.internal.pal;

import defpackage.iw9;
import defpackage.vw9;
import defpackage.zx9;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
abstract class f1 {
    private static final Class a;
    private static final i1 b;
    private static final i1 c;
    private static final i1 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = C(false);
        c = C(true);
        d = new k1();
    }

    static int A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (s.a(i << 3) + 1);
    }

    static void B(p0 p0Var, Object obj, Object obj2, long j) {
        p1.x(obj, j, p0.c(p1.k(obj, j), p1.k(obj2, j)));
    }

    private static i1 C(boolean z) {
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
            return (i1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int D(List list) {
        return list.size();
    }

    static int E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int C = size * s.C(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            C += s.x((zzaby) list.get(i2));
        }
        return C;
    }

    static int F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * s.C(i));
    }

    static int G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            i = 0;
            while (i2 < size) {
                i += s.z(e0Var.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += s.z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (s.a(i << 3) + 4);
    }

    static int I(List list) {
        return list.size() * 4;
    }

    static int J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (s.a(i << 3) + 8);
    }

    static int K(List list) {
        return list.size() * 8;
    }

    static int L(int i, List list, d1 d1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += s.y(i, (zx9) list.get(i3), d1Var);
        }
        return i2;
    }

    static int M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * s.C(i));
    }

    static int N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            i = 0;
            while (i2 < size) {
                i += s.z(e0Var.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += s.z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return P(list) + (list.size() * s.C(i));
    }

    static int P(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof k0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += s.b(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    static int Q(int i, Object obj, d1 d1Var) {
        return s.a(i << 3) + s.A((zx9) obj, d1Var);
    }

    static int R(int i, List list, d1 d1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int C = s.C(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            C += s.A((zx9) list.get(i2), d1Var);
        }
        return C;
    }

    static int S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * s.C(i));
    }

    static int T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            i = 0;
            while (i2 < size) {
                int c2 = e0Var.c(i2);
                i += s.a((c2 >> 31) ^ (c2 + c2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += s.a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return V(list) + (size * s.C(i));
    }

    static int V(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof k0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += s.b((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    static int W(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int C = s.C(i) * size;
        if (list instanceof vw9) {
            vw9 vw9Var = (vw9) list;
            while (i2 < size) {
                Object zzf = vw9Var.zzf(i2);
                C += zzf instanceof zzaby ? s.x((zzaby) zzf) : s.B((String) zzf);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                C += obj instanceof zzaby ? s.x((zzaby) obj) : s.B((String) obj);
                i2++;
            }
        }
        return C;
    }

    static int X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Y(list) + (size * s.C(i));
    }

    static int Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            i = 0;
            while (i2 < size) {
                i += s.a(e0Var.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += s.a(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a0(list) + (size * s.C(i));
    }

    public static i1 a() {
        return c;
    }

    static int a0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof k0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += s.b(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static i1 b() {
        return d;
    }

    public static i1 b0() {
        return b;
    }

    static Object c(int i, List list, iw9 iw9Var, Object obj, i1 i1Var) {
        if (iw9Var == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (iw9Var.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj = d(i, intValue, obj, i1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = ((Integer) it2.next()).intValue();
                if (!iw9Var.zza(intValue2)) {
                    obj = d(i, intValue2, obj, i1Var);
                    it2.remove();
                }
            }
        }
        return obj;
    }

    static Object d(int i, int i2, Object obj, i1 i1Var) {
        if (obj == null) {
            obj = i1Var.f();
        }
        i1Var.l(obj, i, i2);
        return obj;
    }

    static void e(v vVar, Object obj, Object obj2) {
        vVar.a(obj2);
        throw null;
    }

    static void f(i1 i1Var, Object obj, Object obj2) {
        i1Var.o(obj, i1Var.e(i1Var.d(obj), i1Var.d(obj2)));
    }

    public static void g(Class cls) {
        Class cls2;
        if (!c0.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void h(int i, List list, v1 v1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzc(i, list, z);
    }

    public static void i(int i, List list, v1 v1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zze(i, list);
    }

    public static void j(int i, List list, v1 v1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzg(i, list, z);
    }

    public static void k(int i, List list, v1 v1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzj(i, list, z);
    }

    public static void l(int i, List list, v1 v1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzl(i, list, z);
    }

    public static void m(int i, List list, v1 v1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzn(i, list, z);
    }

    public static void n(int i, List list, v1 v1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzp(i, list, z);
    }

    public static void o(int i, List list, v1 v1Var, d1 d1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((t) v1Var).b(i, list.get(i2), d1Var);
        }
    }

    public static void p(int i, List list, v1 v1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzs(i, list, z);
    }

    public static void q(int i, List list, v1 v1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzu(i, list, z);
    }

    public static void r(int i, List list, v1 v1Var, d1 d1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((t) v1Var).a(i, list.get(i2), d1Var);
        }
    }

    public static void s(int i, List list, v1 v1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzx(i, list, z);
    }

    public static void t(int i, List list, v1 v1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzz(i, list, z);
    }

    public static void u(int i, List list, v1 v1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzB(i, list, z);
    }

    public static void v(int i, List list, v1 v1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzD(i, list, z);
    }

    public static void w(int i, List list, v1 v1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzG(i, list);
    }

    public static void x(int i, List list, v1 v1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzI(i, list, z);
    }

    public static void y(int i, List list, v1 v1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.zzK(i, list, z);
    }

    static boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
