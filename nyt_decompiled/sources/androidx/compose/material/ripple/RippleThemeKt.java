package androidx.compose.material.ripple;

import androidx.compose.runtime.CompositionLocalKt;
import defpackage.e27;
import defpackage.m76;
import defpackage.qs2;

/* loaded from: classes.dex */
public abstract class RippleThemeKt {
    private static final m76 a = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.material.ripple.RippleThemeKt$LocalRippleTheme$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d mo865invoke() {
            return a.b;
        }
    });
    private static final e27 b = new e27(0.16f, 0.24f, 0.08f, 0.24f);
    private static final e27 c = new e27(0.08f, 0.12f, 0.04f, 0.12f);
    private static final e27 d = new e27(0.08f, 0.12f, 0.04f, 0.1f);

    public static final m76 d() {
        return a;
    }
}
