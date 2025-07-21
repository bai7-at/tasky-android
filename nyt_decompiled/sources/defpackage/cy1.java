package defpackage;

import android.R;
import android.content.Context;
import android.view.Window;

/* loaded from: classes3.dex */
public abstract class cy1 {
    public static void a(Window window, boolean z, Integer num, Integer num2) {
        boolean z2 = num == null || num.intValue() == 0;
        boolean z3 = num2 == null || num2.intValue() == 0;
        if (z2 || z3) {
            int b = qf4.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z2) {
                num = Integer.valueOf(b);
            }
            if (z3) {
                num2 = Integer.valueOf(b);
            }
        }
        kg9.b(window, !z);
        int c = c(window.getContext(), z);
        int b2 = b(window.getContext(), z);
        window.setStatusBarColor(c);
        window.setNavigationBarColor(b2);
        f(window, d(c, qf4.h(num.intValue())));
        e(window, d(b2, qf4.h(num2.intValue())));
    }

    private static int b(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return qf4.b(context, R.attr.navigationBarColor, -16777216);
    }

    private static int c(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return qf4.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i, boolean z) {
        return qf4.h(i) || (i == 0 && z);
    }

    public static void e(Window window, boolean z) {
        kg9.a(window, window.getDecorView()).d(z);
    }

    public static void f(Window window, boolean z) {
        kg9.a(window, window.getDecorView()).e(z);
    }
}
