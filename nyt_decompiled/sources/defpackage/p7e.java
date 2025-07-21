package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class p7e {
    public static void a(j64 j64Var, q7e q7eVar, f7e f7eVar) {
        g(j64Var, q7eVar, f7eVar, false);
    }

    public static void b(j64 j64Var, q7e q7eVar, f7e f7eVar) {
        g(j64Var, q7eVar, f7eVar, true);
    }

    public static void c(j64 j64Var, q7e q7eVar, f7e f7eVar) {
        if (((Boolean) jra.c.e()).booleanValue()) {
            zb.r(vb.C(j64Var), new o7e(q7eVar, f7eVar), pgb.f);
        }
    }

    public static void d(j64 j64Var, f7e f7eVar) {
        if (((Boolean) jra.c.e()).booleanValue()) {
            zb.r(vb.C(j64Var), new m7e(f7eVar), pgb.f);
        }
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) pla.c().a(mpa.H8), str);
    }

    public static int f(s1e s1eVar) {
        int e = ktd.e(s1eVar) - 1;
        return (e == 0 || e == 1) ? 7 : 23;
    }

    private static void g(j64 j64Var, q7e q7eVar, f7e f7eVar, boolean z) {
        if (((Boolean) jra.c.e()).booleanValue()) {
            zb.r(vb.C(j64Var), new n7e(q7eVar, f7eVar, z), pgb.f);
        }
    }
}
