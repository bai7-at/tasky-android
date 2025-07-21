package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class if4 {
    public static TypedValue a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i, boolean z) {
        TypedValue a = a(context, i);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }

    public static int c(Context context, int i, int i2) {
        TypedValue a = a(context, i);
        return (a == null || a.type != 16) ? i2 : a.data;
    }

    public static int d(Context context, int i, String str) {
        return e(context, i, str).data;
    }

    public static TypedValue e(Context context, int i, String str) {
        TypedValue a = a(context, i);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static TypedValue f(View view, int i) {
        return e(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
