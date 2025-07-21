package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import defpackage.dj7;
import defpackage.jj7;
import defpackage.lj7;
import defpackage.r46;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class ProgressSemanticsKt {
    public static final Modifier a(Modifier modifier) {
        return dj7.c(modifier, true, new ss2() { // from class: androidx.compose.foundation.ProgressSemanticsKt$progressSemantics$2
            public final void b(lj7 lj7Var) {
                jj7.U(lj7Var, r46.d.a());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((lj7) obj);
                return ww8.a;
            }
        });
    }
}
