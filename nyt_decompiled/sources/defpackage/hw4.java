package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;

/* loaded from: classes3.dex */
public abstract class hw4 {
    private static float a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    private static String b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static TimeInterpolator c(String str) {
        if (!e(str, "cubic-bezier")) {
            if (e(str, "path")) {
                return op5.b(xp5.e(b(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] split = b(str, "cubic-bezier").split(",");
        if (split.length == 4) {
            return op5.a(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
    }

    private static boolean d(String str) {
        return e(str, "cubic-bezier") || e(str, "path");
    }

    private static boolean e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static int f(Context context, int i, int i2) {
        return if4.c(context, i, i2);
    }

    public static TimeInterpolator g(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        return d(valueOf) ? c(valueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }
}
