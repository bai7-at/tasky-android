package defpackage;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class s81 {
    public static final boolean a(Composer composer, int i) {
        if (b.G()) {
            b.S(-882615028, i, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        boolean z = (((Configuration) composer.m(AndroidCompositionLocals_androidKt.f())).uiMode & 48) == 32;
        if (b.G()) {
            b.R();
        }
        return z;
    }
}
