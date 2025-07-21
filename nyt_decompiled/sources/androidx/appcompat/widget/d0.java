package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import defpackage.fo6;
import defpackage.qo0;

/* loaded from: classes.dex */
public abstract class d0 {
    private static final ThreadLocal a = new ThreadLocal();
    static final int[] b = {-16842910};
    static final int[] c = {R.attr.state_focused};
    static final int[] d = {R.attr.state_activated};
    static final int[] e = {R.attr.state_pressed};
    static final int[] f = {R.attr.state_checked};
    static final int[] g = {R.attr.state_selected};
    static final int[] h = {-16842919, -16842908};
    static final int[] i = new int[0];
    private static final int[] j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(fo6.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(fo6.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList e2 = e(context, i2);
        if (e2 != null && e2.isStateful()) {
            return e2.getColorForState(b, e2.getDefaultColor());
        }
        TypedValue f2 = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, f2, true);
        return d(context, i2, f2.getFloat());
    }

    public static int c(Context context, int i2) {
        int[] iArr = j;
        iArr[0] = i2;
        h0 u = h0.u(context, null, iArr);
        try {
            return u.b(0, 0);
        } finally {
            u.w();
        }
    }

    static int d(Context context, int i2, float f2) {
        return qo0.p(c(context, i2), Math.round(Color.alpha(r0) * f2));
    }

    public static ColorStateList e(Context context, int i2) {
        int[] iArr = j;
        iArr[0] = i2;
        h0 u = h0.u(context, null, iArr);
        try {
            return u.c(0);
        } finally {
            u.w();
        }
    }

    private static TypedValue f() {
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
