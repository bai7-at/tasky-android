package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import defpackage.cv3;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class ku8 {
    public static Collection a(Object obj) {
        if ((obj instanceof yu3) && !(obj instanceof zu3)) {
            s(obj, "kotlin.collections.MutableCollection");
        }
        return g(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof yu3) && !(obj instanceof av3)) {
            s(obj, "kotlin.collections.MutableIterable");
        }
        return h(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof yu3) && !(obj instanceof bv3)) {
            s(obj, "kotlin.collections.MutableList");
        }
        return i(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof yu3) && !(obj instanceof cv3)) {
            s(obj, "kotlin.collections.MutableMap");
        }
        return j(obj);
    }

    public static Map.Entry e(Object obj) {
        if ((obj instanceof yu3) && !(obj instanceof cv3.a)) {
            s(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return k(obj);
    }

    public static Object f(Object obj, int i) {
        if (obj != null && !m(obj, i)) {
            s(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    public static Collection g(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw r(e);
        }
    }

    public static Iterable h(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw r(e);
        }
    }

    public static List i(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw r(e);
        }
    }

    public static Map j(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw r(e);
        }
    }

    public static Map.Entry k(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            throw r(e);
        }
    }

    public static int l(Object obj) {
        if (obj instanceof tt2) {
            return ((tt2) obj).getArity();
        }
        if (obj instanceof qs2) {
            return 0;
        }
        if (obj instanceof ss2) {
            return 1;
        }
        if (obj instanceof gt2) {
            return 2;
        }
        if (obj instanceof it2) {
            return 3;
        }
        if (obj instanceof kt2) {
            return 4;
        }
        if (obj instanceof mt2) {
            return 5;
        }
        if (obj instanceof nt2) {
            return 6;
        }
        if (obj instanceof ot2) {
            return 7;
        }
        if (obj instanceof pt2) {
            return 8;
        }
        if (obj instanceof qt2) {
            return 9;
        }
        if (obj instanceof rs2) {
            return 10;
        }
        if (obj instanceof ts2) {
            return 11;
        }
        if (obj instanceof vs2) {
            return 13;
        }
        if (obj instanceof ws2) {
            return 14;
        }
        if (obj instanceof xs2) {
            return 15;
        }
        if (obj instanceof ys2) {
            return 16;
        }
        if (obj instanceof zs2) {
            return 17;
        }
        if (obj instanceof at2) {
            return 18;
        }
        if (obj instanceof bt2) {
            return 19;
        }
        if (obj instanceof dt2) {
            return 20;
        }
        return obj instanceof et2 ? 21 : -1;
    }

    public static boolean m(Object obj, int i) {
        return (obj instanceof lt2) && l(obj) == i;
    }

    public static boolean n(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof yu3) || (obj instanceof cv3));
    }

    public static boolean o(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof yu3) || (obj instanceof cv3.a));
    }

    public static boolean p(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof yu3) || (obj instanceof hv3));
    }

    private static Throwable q(Throwable th) {
        return zq3.p(th, ku8.class.getName());
    }

    public static ClassCastException r(ClassCastException classCastException) {
        throw ((ClassCastException) q(classCastException));
    }

    public static void s(Object obj, String str) {
        t((obj == null ? Constants.NULL_VERSION_ID : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void t(String str) {
        throw r(new ClassCastException(str));
    }
}
