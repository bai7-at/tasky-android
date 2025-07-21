package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes4.dex */
public abstract class s5 {
    public static final ComponentActivity a(View view) {
        zq3.h(view, "<this>");
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof ComponentActivity) {
                return (ComponentActivity) context;
            }
        }
        throw new IllegalStateException(("View " + view.getClass().getCanonicalName() + " has no Activity attached!").toString());
    }

    public static final ComponentActivity b(Composer composer, int i) {
        composer.z(-402711347);
        if (b.G()) {
            b.S(-402711347, i, -1, "com.nytimes.android.utils.composeutils.findActivity (ActivityUtils.kt:14)");
        }
        ComponentActivity a = a((View) composer.m(AndroidCompositionLocals_androidKt.k()));
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a;
    }

    public static final ComponentActivity c(View view) {
        zq3.h(view, "<this>");
        try {
            return a(view);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final ComponentActivity d(Composer composer, int i) {
        composer.z(1771466103);
        if (b.G()) {
            b.S(1771466103, i, -1, "com.nytimes.android.utils.composeutils.findActivityOrNull (ActivityUtils.kt:17)");
        }
        ComponentActivity c = c((View) composer.m(AndroidCompositionLocals_androidKt.k()));
        if (b.G()) {
            b.R();
        }
        composer.R();
        return c;
    }

    public static final boolean e(Activity activity) {
        zq3.h(activity, "<this>");
        return zq3.c(zt6.b(activity.getClass()).d(), "PreviewActivity");
    }
}
