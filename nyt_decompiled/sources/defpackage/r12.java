package defpackage;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r12 {
    private static final String a = h94.i("EnqueueRunnable");

    public static boolean a(xi9 xi9Var) {
        pj9 h = xi9Var.h();
        WorkDatabase u = h.u();
        u.beginTransaction();
        try {
            s12.a(u, h.n(), xi9Var);
            boolean e = e(xi9Var);
            u.setTransactionSuccessful();
            return e;
        } finally {
            u.endTransaction();
        }
    }

    public static void b(xi9 xi9Var) {
        if (!xi9Var.i()) {
            if (a(xi9Var)) {
                f(xi9Var);
            }
        } else {
            throw new IllegalStateException("WorkContinuation has cycles (" + xi9Var + ")");
        }
    }

    private static boolean c(xi9 xi9Var) {
        boolean d = d(xi9Var.h(), xi9Var.g(), (String[]) xi9.n(xi9Var).toArray(new String[0]), xi9Var.e(), xi9Var.c());
        xi9Var.m();
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean d(defpackage.pj9 r18, java.util.List r19, java.lang.String[] r20, java.lang.String r21, androidx.work.ExistingWorkPolicy r22) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r12.d(pj9, java.util.List, java.lang.String[], java.lang.String, androidx.work.ExistingWorkPolicy):boolean");
    }

    private static boolean e(xi9 xi9Var) {
        List<xi9> f = xi9Var.f();
        boolean z = false;
        if (f != null) {
            for (xi9 xi9Var2 : f) {
                if (xi9Var2.k()) {
                    h94.e().k(a, "Already enqueued work ids (" + TextUtils.join(", ", xi9Var2.d()) + ")");
                } else {
                    z |= e(xi9Var2);
                }
            }
        }
        return c(xi9Var) | z;
    }

    public static void f(xi9 xi9Var) {
        pj9 h = xi9Var.h();
        b.h(h.n(), h.u(), h.s());
    }
}
