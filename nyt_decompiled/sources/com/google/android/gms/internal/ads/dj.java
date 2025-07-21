package com.google.android.gms.internal.ads;

import defpackage.o0f;
import defpackage.w1f;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
abstract class dj {
    private static final Class a;
    private static final fj b;
    private static final fj c;
    public static final /* synthetic */ int d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        fj fjVar = null;
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
                fjVar = (fj) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = fjVar;
        c = new hj();
    }

    public static void A(int i, List list, mh mhVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mhVar.n(i, list, z);
    }

    public static void B(int i, List list, mh mhVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mhVar.r(i, list, z);
    }

    public static void C(int i, List list, mh mhVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mhVar.u(i, list, z);
    }

    public static void D(int i, List list, mh mhVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mhVar.w(i, list, z);
    }

    public static void E(int i, List list, mh mhVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mhVar.y(i, list, z);
    }

    public static void F(int i, List list, mh mhVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mhVar.A(i, list, z);
    }

    public static void G(int i, List list, mh mhVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mhVar.D(i, list, z);
    }

    public static void a(int i, List list, mh mhVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mhVar.F(i, list, z);
    }

    public static void b(int i, List list, mh mhVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mhVar.I(i, list, z);
    }

    public static void c(int i, List list, mh mhVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mhVar.K(i, list, z);
    }

    public static void d(int i, List list, mh mhVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mhVar.b(i, list, z);
    }

    public static void e(int i, List list, mh mhVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mhVar.d(i, list, z);
    }

    public static void f(int i, List list, mh mhVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mhVar.i(i, list, z);
    }

    public static void g(int i, List list, mh mhVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mhVar.k(i, list, z);
    }

    static int h(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zh) {
            zh zhVar = (zh) list;
            i = 0;
            while (i2 < size) {
                i += lh.b(zhVar.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += lh.b(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int i(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (lh.B(i << 3) + 4);
    }

    static int j(List list) {
        return list.size() * 4;
    }

    static int k(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (lh.B(i << 3) + 8);
    }

    static int l(List list) {
        return list.size() * 8;
    }

    static int m(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zh) {
            zh zhVar = (zh) list;
            i = 0;
            while (i2 < size) {
                i += lh.b(zhVar.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += lh.b(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int n(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof gi) {
            gi giVar = (gi) list;
            i = 0;
            while (i2 < size) {
                i += lh.b(giVar.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += lh.b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int o(int i, Object obj, bj bjVar) {
        return lh.B(i << 3) + lh.z((w1f) obj, bjVar);
    }

    static int p(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zh) {
            zh zhVar = (zh) list;
            i = 0;
            while (i2 < size) {
                int c2 = zhVar.c(i2);
                i += lh.B((c2 >> 31) ^ (c2 + c2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += lh.B((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int q(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof gi) {
            gi giVar = (gi) list;
            i = 0;
            while (i2 < size) {
                long c2 = giVar.c(i2);
                i += lh.b((c2 >> 63) ^ (c2 + c2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += lh.b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int r(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zh) {
            zh zhVar = (zh) list;
            i = 0;
            while (i2 < size) {
                i += lh.B(zhVar.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += lh.B(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int s(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof gi) {
            gi giVar = (gi) list;
            i = 0;
            while (i2 < size) {
                i += lh.b(giVar.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += lh.b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static fj t() {
        return b;
    }

    public static fj u() {
        return c;
    }

    static Object v(Object obj, int i, List list, o0f o0fVar, Object obj2, fj fjVar) {
        if (o0fVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (o0fVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = w(obj, i, intValue, obj2, fjVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = ((Integer) it2.next()).intValue();
                if (!o0fVar.zza(intValue2)) {
                    obj2 = w(obj, i, intValue2, obj2, fjVar);
                    it2.remove();
                }
            }
        }
        return obj2;
    }

    static Object w(Object obj, int i, int i2, Object obj2, fj fjVar) {
        if (obj2 == null) {
            obj2 = fjVar.c(obj);
        }
        fjVar.l(obj2, i, i2);
        return obj2;
    }

    static void x(fj fjVar, Object obj, Object obj2) {
        fjVar.o(obj, fjVar.e(fjVar.d(obj), fjVar.d(obj2)));
    }

    public static void y(Class cls) {
        Class cls2;
        if (!yh.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
