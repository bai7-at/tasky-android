package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;

/* loaded from: classes2.dex */
public class ib6 {
    private final gdd a;

    public ib6(gdd gddVar) {
        this.a = gddVar;
    }

    public static void a(Context context, AdFormat adFormat, n7 n7Var, jb6 jb6Var) {
        c(context, adFormat, n7Var, null, jb6Var);
    }

    private static void c(final Context context, final AdFormat adFormat, final n7 n7Var, final String str, final jb6 jb6Var) {
        mpa.a(context);
        if (((Boolean) ora.k.e()).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.Ga)).booleanValue()) {
                pfb.b.execute(new Runnable() { // from class: jp9
                    @Override // java.lang.Runnable
                    public final void run() {
                        n7 n7Var2 = n7Var;
                        xvc a = n7Var2 == null ? null : n7Var2.a();
                        new f8b(context, adFormat, a, str).b(jb6Var);
                    }
                });
                return;
            }
        }
        new f8b(context, adFormat, n7Var == null ? null : n7Var.a(), str).b(jb6Var);
    }

    public String b() {
        return this.a.a();
    }
}
