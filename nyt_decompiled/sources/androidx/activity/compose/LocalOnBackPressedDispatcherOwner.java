package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.fe5;
import defpackage.m76;
import defpackage.o76;
import defpackage.qs2;

/* loaded from: classes.dex */
public final class LocalOnBackPressedDispatcherOwner {
    public static final LocalOnBackPressedDispatcherOwner a = new LocalOnBackPressedDispatcherOwner();
    private static final m76 b = CompositionLocalKt.d(null, new qs2() { // from class: androidx.activity.compose.LocalOnBackPressedDispatcherOwner$LocalOnBackPressedDispatcherOwner$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final fe5 mo865invoke() {
            return null;
        }
    }, 1, null);

    private LocalOnBackPressedDispatcherOwner() {
    }

    public final fe5 a(Composer composer, int i) {
        composer.z(-2068013981);
        fe5 fe5Var = (fe5) composer.m(b);
        composer.z(1680121597);
        if (fe5Var == null) {
            fe5Var = ViewTreeOnBackPressedDispatcherOwner.a((View) composer.m(AndroidCompositionLocals_androidKt.k()));
        }
        composer.R();
        if (fe5Var == null) {
            Object obj = (Context) composer.m(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof fe5) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            fe5Var = (fe5) obj;
        }
        composer.R();
        return fe5Var;
    }

    public final o76 b(fe5 fe5Var) {
        return b.c(fe5Var);
    }
}
