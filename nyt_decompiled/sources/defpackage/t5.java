package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes4.dex */
public abstract class t5 {
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
        composer.z(953149080);
        if (b.G()) {
            b.S(953149080, i, -1, "com.nytimes.android.devsettings.utils.findActivity (ActivityUtils.kt:13)");
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
        composer.z(-1609115474);
        if (b.G()) {
            b.S(-1609115474, i, -1, "com.nytimes.android.devsettings.utils.findActivityOrNull (ActivityUtils.kt:16)");
        }
        ComponentActivity c = c((View) composer.m(AndroidCompositionLocals_androidKt.k()));
        if (b.G()) {
            b.R();
        }
        composer.R();
        return c;
    }
}
