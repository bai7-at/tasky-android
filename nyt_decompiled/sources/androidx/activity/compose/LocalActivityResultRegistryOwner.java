package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.l5;
import defpackage.m76;
import defpackage.qs2;

/* loaded from: classes.dex */
public final class LocalActivityResultRegistryOwner {
    public static final LocalActivityResultRegistryOwner a = new LocalActivityResultRegistryOwner();
    private static final m76 b = CompositionLocalKt.d(null, new qs2() { // from class: androidx.activity.compose.LocalActivityResultRegistryOwner$LocalComposition$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l5 mo865invoke() {
            return null;
        }
    }, 1, null);

    private LocalActivityResultRegistryOwner() {
    }

    public final l5 a(Composer composer, int i) {
        composer.z(1418020823);
        l5 l5Var = (l5) composer.m(b);
        if (l5Var == null) {
            Object obj = (Context) composer.m(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof l5) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            l5Var = (l5) obj;
        }
        composer.R();
        return l5Var;
    }
}
