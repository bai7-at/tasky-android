package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import defpackage.e27;
import defpackage.go0;
import defpackage.nn0;
import defpackage.sj8;

/* loaded from: classes.dex */
public abstract class MaterialThemeKt {
    private static final e27 a = new e27(0.16f, 0.12f, 0.08f, 0.12f);

    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
    
        if ((r15 & 4) != 0) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.go0 r9, defpackage.jp7 r10, final defpackage.zu8 r11, final defpackage.gt2 r12, androidx.compose.runtime.Composer r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MaterialThemeKt.a(go0, jp7, zu8, gt2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final sj8 c(go0 go0Var, Composer composer, int i) {
        composer.z(1866455512);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1866455512, i, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:126)");
        }
        long x = go0Var.x();
        composer.z(-314518050);
        boolean e = composer.e(x);
        Object A = composer.A();
        if (e || A == Composer.a.a()) {
            A = new sj8(x, nn0.r(x, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            composer.q(A);
        }
        sj8 sj8Var = (sj8) A;
        composer.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return sj8Var;
    }
}
