package com.google.android.gms.internal.measurement;

import defpackage.cef;
import defpackage.gcf;
import defpackage.kbf;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
abstract class j3 {
    private static final Class a;
    private static final l3 b;
    private static final l3 c;
    private static final l3 d;

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
        d = new n3();
    }

    static int A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (b2.a(i << 3) + 1);
    }

    static void B(u2 u2Var, Object obj, Object obj2, long j) {
        s3.x(obj, j, u2.b(s3.k(obj, j), s3.k(obj2, j)));
    }

    private static l3 C(boolean z) {
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
            return (l3) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
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
        int C = size * b2.C(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            C += b2.x((zzjb) list.get(i2));
        }
        return C;
    }

    static int F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * b2.C(i));
    }

    static int G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            i = 0;
            while (i2 < size) {
                i += b2.z(k2Var.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += b2.z(((Integer) list.get(i2)).intValue());
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
        return size * (b2.a(i << 3) + 4);
    }

    static int I(List list) {
        return list.size() * 4;
    }

    static int J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (b2.a(i << 3) + 8);
    }

    static int K(List list) {
        return list.size() * 8;
    }

    static int L(int i, List list, h3 h3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += b2.y(i, (cef) list.get(i3), h3Var);
        }
        return i2;
    }

    static int M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * b2.C(i));
    }

    static int N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            i = 0;
            while (i2 < size) {
                i += b2.z(k2Var.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += b2.z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return P(list) + (list.size() * b2.C(i));
    }

    static int P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q2) {
            q2 q2Var = (q2) list;
            i = 0;
            while (i2 < size) {
                i += b2.b(q2Var.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += b2.b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int Q(int i, Object obj, h3 h3Var) {
        return b2.a(i << 3) + b2.A((cef) obj, h3Var);
    }

    static int R(int i, List list, h3 h3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int C = b2.C(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            C += b2.A((cef) list.get(i2), h3Var);
        }
        return C;
    }

    static int S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * b2.C(i));
    }

    static int T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            i = 0;
            while (i2 < size) {
                int c2 = k2Var.c(i2);
                i += b2.a((c2 >> 31) ^ (c2 + c2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += b2.a((intValue >> 31) ^ (intValue + intValue));
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
        return V(list) + (size * b2.C(i));
    }

    static int V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q2) {
            q2 q2Var = (q2) list;
            i = 0;
            while (i2 < size) {
                long zza = q2Var.zza(i2);
                i += b2.b((zza >> 63) ^ (zza + zza));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += b2.b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int W(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int C = b2.C(i) * size;
        if (list instanceof gcf) {
            gcf gcfVar = (gcf) list;
            while (i2 < size) {
                Object zzf = gcfVar.zzf(i2);
                C += zzf instanceof zzjb ? b2.x((zzjb) zzf) : b2.B((String) zzf);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                C += obj instanceof zzjb ? b2.x((zzjb) obj) : b2.B((String) obj);
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
        return Y(list) + (size * b2.C(i));
    }

    static int Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            i = 0;
            while (i2 < size) {
                i += b2.a(k2Var.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += b2.a(((Integer) list.get(i2)).intValue());
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
        return a0(list) + (size * b2.C(i));
    }

    public static l3 a() {
        return c;
    }

    static int a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q2) {
            q2 q2Var = (q2) list;
            i = 0;
            while (i2 < size) {
                i += b2.b(q2Var.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += b2.b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static l3 b() {
        return d;
    }

    public static l3 b0() {
        return b;
    }

    static Object c(int i, List list, kbf kbfVar, Object obj, l3 l3Var) {
        if (kbfVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (kbfVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj = d(i, intValue, obj, l3Var);
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
                if (!kbfVar.zza(intValue2)) {
                    obj = d(i, intValue2, obj, l3Var);
                    it2.remove();
                }
            }
        }
        return obj;
    }

    static Object d(int i, int i2, Object obj, l3 l3Var) {
        if (obj == null) {
            obj = l3Var.e();
        }
        l3Var.f(obj, i, i2);
        return obj;
    }

    static void e(d2 d2Var, Object obj, Object obj2) {
        d2Var.a(obj2);
        throw null;
    }

    static void f(l3 l3Var, Object obj, Object obj2) {
        l3Var.h(obj, l3Var.d(l3Var.c(obj), l3Var.c(obj2)));
    }

    public static void g(Class cls) {
        Class cls2;
        if (!j2.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void h(int i, List list, x3 x3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzc(i, list, z);
    }

    public static void i(int i, List list, x3 x3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zze(i, list);
    }

    public static void j(int i, List list, x3 x3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzg(i, list, z);
    }

    public static void k(int i, List list, x3 x3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzj(i, list, z);
    }

    public static void l(int i, List list, x3 x3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzl(i, list, z);
    }

    public static void m(int i, List list, x3 x3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzn(i, list, z);
    }

    public static void n(int i, List list, x3 x3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzp(i, list, z);
    }

    public static void o(int i, List list, x3 x3Var, h3 h3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((c2) x3Var).b(i, list.get(i2), h3Var);
        }
    }

    public static void p(int i, List list, x3 x3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzs(i, list, z);
    }

    public static void q(int i, List list, x3 x3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzu(i, list, z);
    }

    public static void r(int i, List list, x3 x3Var, h3 h3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((c2) x3Var).c(i, list.get(i2), h3Var);
        }
    }

    public static void s(int i, List list, x3 x3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzx(i, list, z);
    }

    public static void t(int i, List list, x3 x3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzz(i, list, z);
    }

    public static void u(int i, List list, x3 x3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzB(i, list, z);
    }

    public static void v(int i, List list, x3 x3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzD(i, list, z);
    }

    public static void w(int i, List list, x3 x3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzG(i, list);
    }

    public static void x(int i, List list, x3 x3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzI(i, list, z);
    }

    public static void y(int i, List list, x3 x3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x3Var.zzK(i, list, z);
    }

    static boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
