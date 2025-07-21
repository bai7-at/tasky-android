package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class p07 {
    public static final Resources a(Composer composer, int i) {
        if (b.G()) {
            b.S(1554054999, i, -1, "androidx.compose.ui.res.resources (Resources.android.kt:30)");
        }
        composer.m(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) composer.m(AndroidCompositionLocals_androidKt.g())).getResources();
        if (b.G()) {
            b.R();
        }
        return resources;
    }
}
