package androidx.compose.material3;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.Modifier;
import defpackage.bu1;
import defpackage.du1;
import defpackage.m76;
import defpackage.qs2;

/* loaded from: classes.dex */
public abstract class InteractiveComponentSizeKt {
    private static final m76 a;
    private static final m76 b;
    private static final long c;

    static {
        m76 e = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.material3.InteractiveComponentSizeKt$LocalMinimumInteractiveComponentEnforcement$1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                return Boolean.TRUE;
            }
        });
        a = e;
        b = e;
        float f = 48;
        c = du1.b(bu1.g(f), bu1.g(f));
    }

    public static final m76 b() {
        return a;
    }

    public static final Modifier c(Modifier modifier) {
        return modifier.h(MinimumInteractiveModifier.b);
    }
}
