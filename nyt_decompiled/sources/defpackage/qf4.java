package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class qf4 {
    public static int a(int i, int i2) {
        return qo0.p(i, (Color.alpha(i) * i2) / 255);
    }

    public static int b(Context context, int i, int i2) {
        Integer f = f(context, i);
        return f != null ? f.intValue() : i2;
    }

    public static int c(Context context, int i, String str) {
        return l(context, if4.e(context, i, str));
    }

    public static int d(View view, int i) {
        return l(view.getContext(), if4.f(view, i));
    }

    public static int e(View view, int i, int i2) {
        return b(view.getContext(), i, i2);
    }

    public static Integer f(Context context, int i) {
        TypedValue a = if4.a(context, i);
        if (a != null) {
            return Integer.valueOf(l(context, a));
        }
        return null;
    }

    public static ColorStateList g(Context context, int i) {
        TypedValue a = if4.a(context, i);
        if (a == null) {
            return null;
        }
        int i2 = a.resourceId;
        if (i2 != 0) {
            return mx0.d(context, i2);
        }
        int i3 = a.data;
        if (i3 != 0) {
            return ColorStateList.valueOf(i3);
        }
        return null;
    }

    public static boolean h(int i) {
        return i != 0 && qo0.f(i) > 0.5d;
    }

    public static int i(int i, int i2) {
        return qo0.k(i2, i);
    }

    public static int j(int i, int i2, float f) {
        return i(i, qo0.p(i2, Math.round(Color.alpha(i2) * f)));
    }

    public static int k(View view, int i, int i2, float f) {
        return j(d(view, i), d(view, i2), f);
    }

    private static int l(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? mx0.c(context, i) : typedValue.data;
    }
}
