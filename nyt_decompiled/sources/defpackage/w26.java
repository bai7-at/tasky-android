package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.t;
import kotlin.text.a;
import kotlin.text.h;
import kotlin.time.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public abstract class w26 {
    private static final Map a = t.m(du8.a(zt6.b(String.class), he0.D(z38.a)), du8.a(zt6.b(Character.TYPE), he0.x(nj0.a)), du8.a(zt6.b(char[].class), he0.d()), du8.a(zt6.b(Double.TYPE), he0.y(pt1.a)), du8.a(zt6.b(double[].class), he0.e()), du8.a(zt6.b(Float.TYPE), he0.z(wk2.a)), du8.a(zt6.b(float[].class), he0.f()), du8.a(zt6.b(Long.TYPE), he0.B(xa4.a)), du8.a(zt6.b(long[].class), he0.i()), du8.a(zt6.b(pv8.class), he0.G(pv8.b)), du8.a(zt6.b(qv8.class), he0.s()), du8.a(zt6.b(Integer.TYPE), he0.A(om3.a)), du8.a(zt6.b(int[].class), he0.g()), du8.a(zt6.b(lv8.class), he0.F(lv8.b)), du8.a(zt6.b(mv8.class), he0.r()), du8.a(zt6.b(Short.TYPE), he0.C(xq7.a)), du8.a(zt6.b(short[].class), he0.o()), du8.a(zt6.b(aw8.class), he0.H(aw8.b)), du8.a(zt6.b(bw8.class), he0.t()), du8.a(zt6.b(Byte.TYPE), he0.w(mf0.a)), du8.a(zt6.b(byte[].class), he0.c()), du8.a(zt6.b(hv8.class), he0.E(hv8.b)), du8.a(zt6.b(iv8.class), he0.q()), du8.a(zt6.b(Boolean.TYPE), he0.v(ua0.a)), du8.a(zt6.b(boolean[].class), he0.b()), du8.a(zt6.b(ww8.class), he0.I(ww8.a)), du8.a(zt6.b(Void.class), he0.l()), du8.a(zt6.b(b.class), he0.J(b.b)));

    public static final SerialDescriptor a(String str, r26 r26Var) {
        zq3.h(str, "serialName");
        zq3.h(r26Var, "kind");
        d(str);
        return new s26(str, r26Var);
    }

    public static final KSerializer b(vu3 vu3Var) {
        zq3.h(vu3Var, "<this>");
        return (KSerializer) a.get(vu3Var);
    }

    private static final String c(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(charAt) ? a.h(charAt) : String.valueOf(charAt)));
        String substring = str.substring(1);
        zq3.g(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    private static final void d(String str) {
        Iterator it2 = a.keySet().iterator();
        while (it2.hasNext()) {
            String d = ((vu3) it2.next()).d();
            zq3.e(d);
            String c = c(d);
            if (h.w(str, "kotlin." + c, true) || h.w(str, c, true)) {
                throw new IllegalArgumentException(h.f("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + c(c) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
