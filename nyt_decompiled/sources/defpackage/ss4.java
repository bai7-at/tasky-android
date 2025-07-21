package defpackage;

import android.app.Activity;
import com.facebook.internal.FetchedAppSettingsManager;

/* loaded from: classes2.dex */
public final class ss4 {
    public static final ss4 a = new ss4();
    private static final String b = ss4.class.getCanonicalName();
    private static boolean c;

    private ss4() {
    }

    public static final void b() {
        try {
            if (c11.d(ss4.class)) {
                return;
            }
            try {
                w92.t().execute(new Runnable() { // from class: rs4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ss4.c();
                    }
                });
            } catch (Exception e) {
                g29 g29Var = g29.a;
                g29.e0(b, e);
            }
        } catch (Throwable th) {
            c11.b(th, ss4.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        if (c11.d(ss4.class)) {
            return;
        }
        try {
            if (kv.f.h(w92.l())) {
                return;
            }
            a.e();
            c = true;
        } catch (Throwable th) {
            c11.b(th, ss4.class);
        }
    }

    public static final void d(Activity activity) {
        if (c11.d(ss4.class)) {
            return;
        }
        try {
            zq3.h(activity, "activity");
            try {
                if (c && !ys4.d.c().isEmpty()) {
                    bt4.e.e(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            c11.b(th, ss4.class);
        }
    }

    private final void e() {
        String g;
        if (c11.d(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.a;
            rd2 n = FetchedAppSettingsManager.n(w92.m(), false);
            if (n == null || (g = n.g()) == null) {
                return;
            }
            ys4.d.d(g);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }
}
