package com.google.android.gms.internal.play_billing;

import defpackage.cqb;
import defpackage.sbc;
import java.util.List;

/* loaded from: classes3.dex */
abstract class y0 {
    private static final Class a;
    private static final a1 b;
    private static final a1 c;
    public static final /* synthetic */ int d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        a1 a1Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                a1Var = (a1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = a1Var;
        c = new c1();
    }

    static int A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (o.y(i << 3) + 4);
    }

    static int B(List list) {
        return list.size() * 4;
    }

    static int C(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (o.y(i << 3) + 8);
    }

    static int D(List list) {
        return list.size() * 8;
    }

    static int E(int i, List list, w0 w0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += o.u(i, (sbc) list.get(i3), w0Var);
        }
        return i2;
    }

    static int F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * o.y(i << 3));
    }

    static int G(List list) {
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
            i += o.v(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    static int H(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return I(list) + (list.size() * o.y(i << 3));
    }

    static int I(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += o.z(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    static int J(int i, Object obj, w0 w0Var) {
        return o.y(i << 3) + o.w((sbc) obj, w0Var);
    }

    static int K(int i, List list, w0 w0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = o.y(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            y += o.w((sbc) list.get(i2), w0Var);
        }
        return y;
    }

    static int L(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * o.y(i << 3));
    }

    static int M(List list) {
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
            i += o.y((intValue >> 31) ^ (intValue + intValue));
        }
        return i;
    }

    static int N(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return O(list) + (size * o.y(i << 3));
    }

    static int O(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += o.z((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    static int P(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z = list instanceof cqb;
        int y = o.y(i << 3) * size;
        if (z) {
            cqb cqbVar = (cqb) list;
            while (i2 < size) {
                Object zzf = cqbVar.zzf(i2);
                if (zzf instanceof zzba) {
                    int e = ((zzba) zzf).e();
                    y += o.y(e) + e;
                } else {
                    y += o.x((String) zzf);
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzba) {
                    int e2 = ((zzba) obj).e();
                    y += o.y(e2) + e2;
                } else {
                    y += o.x((String) obj);
                }
                i2++;
            }
        }
        return y;
    }

    static int Q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return R(list) + (size * o.y(i << 3));
    }

    static int R(List list) {
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
            i += o.y(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    static int S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * o.y(i << 3));
    }

    static int T(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += o.z(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static a1 U() {
        return b;
    }

    public static a1 V() {
        return c;
    }

    static Object a(Object obj, int i, int i2, Object obj2, a1 a1Var) {
        if (obj2 == null) {
            obj2 = a1Var.c(obj);
        }
        a1Var.f(obj2, i, i2);
        return obj2;
    }

    static void b(a1 a1Var, Object obj, Object obj2) {
        a1Var.h(obj, a1Var.e(a1Var.d(obj), a1Var.d(obj2)));
    }

    public static void c(Class cls) {
        Class cls2;
        if (!z.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void d(int i, List list, m1 m1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzc(i, list, z);
    }

    public static void e(int i, List list, m1 m1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zze(i, list);
    }

    public static void f(int i, List list, m1 m1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzg(i, list, z);
    }

    public static void g(int i, List list, m1 m1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzj(i, list, z);
    }

    public static void h(int i, List list, m1 m1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzl(i, list, z);
    }

    public static void i(int i, List list, m1 m1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzn(i, list, z);
    }

    public static void j(int i, List list, m1 m1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzp(i, list, z);
    }

    public static void k(int i, List list, m1 m1Var, w0 w0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((p) m1Var).c(i, list.get(i2), w0Var);
        }
    }

    public static void l(int i, List list, m1 m1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzs(i, list, z);
    }

    public static void m(int i, List list, m1 m1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzu(i, list, z);
    }

    public static void n(int i, List list, m1 m1Var, w0 w0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((p) m1Var).b(i, list.get(i2), w0Var);
        }
    }

    public static void o(int i, List list, m1 m1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzx(i, list, z);
    }

    public static void p(int i, List list, m1 m1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzz(i, list, z);
    }

    public static void q(int i, List list, m1 m1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzB(i, list, z);
    }

    public static void r(int i, List list, m1 m1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzD(i, list, z);
    }

    public static void s(int i, List list, m1 m1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzG(i, list);
    }

    public static void t(int i, List list, m1 m1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzI(i, list, z);
    }

    public static void u(int i, List list, m1 m1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1Var.zzK(i, list, z);
    }

    static boolean v(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int w(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (o.y(i << 3) + 1);
    }

    static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = size * o.y(i << 3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int e = ((zzba) list.get(i2)).e();
            y += o.y(e) + e;
        }
        return y;
    }

    static int y(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z(list) + (size * o.y(i << 3));
    }

    static int z(List list) {
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
            i += o.v(((Integer) list.get(i2)).intValue());
        }
        return i;
    }
}
