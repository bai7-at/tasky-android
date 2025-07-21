package defpackage;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes4.dex */
public abstract class js0 {
    public static final Integer a(String str, Composer composer, int i) {
        composer.z(-284580288);
        if (b.G()) {
            b.S(-284580288, i, -1, "com.nytimes.android.libs.messagingarchitecture.utils.getResourceIdFromFilenameOrNull (ComposeUtils.kt:6)");
        }
        if (str == null || str.length() == 0) {
            if (b.G()) {
                b.R();
            }
            composer.R();
            return null;
        }
        int identifier = ((Context) composer.m(AndroidCompositionLocals_androidKt.g())).getResources().getIdentifier(str, "raw", ((Context) composer.m(AndroidCompositionLocals_androidKt.g())).getPackageName());
        Integer valueOf = identifier != 0 ? Integer.valueOf(identifier) : null;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return valueOf;
    }
}
