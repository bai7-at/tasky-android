package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class af {
    public static final fm1 a(Context context) {
        vm2 b;
        float f = context.getResources().getConfiguration().fontScale;
        if (bn2.a()) {
            b = new x44(f);
        } else {
            b = wm2.a.b(f);
            if (b == null) {
                b = new x44(f);
            }
        }
        return new im1(context.getResources().getDisplayMetrics().density, f, b);
    }
}
