package defpackage;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class t48 {
    public static final String a(int i, Composer composer, int i2) {
        if (b.G()) {
            b.S(-176762646, i2, -1, "androidx.compose.material3.getString (Strings.android.kt:30)");
        }
        composer.m(AndroidCompositionLocals_androidKt.f());
        String string = ((Context) composer.m(AndroidCompositionLocals_androidKt.g())).getResources().getString(i);
        if (b.G()) {
            b.R();
        }
        return string;
    }
}
