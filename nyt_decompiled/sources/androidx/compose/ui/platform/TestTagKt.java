package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import defpackage.dj7;
import defpackage.jj7;
import defpackage.lj7;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class TestTagKt {
    public static final Modifier a(Modifier modifier, final String str) {
        return dj7.d(modifier, false, new ss2() { // from class: androidx.compose.ui.platform.TestTagKt$testTag$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(lj7 lj7Var) {
                jj7.a0(lj7Var, str);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((lj7) obj);
                return ww8.a;
            }
        }, 1, null);
    }
}
