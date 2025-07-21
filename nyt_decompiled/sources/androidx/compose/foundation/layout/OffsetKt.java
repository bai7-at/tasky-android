package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import defpackage.bu1;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class OffsetKt {
    public static final Modifier a(Modifier modifier, final ss2 ss2Var) {
        return modifier.h(new OffsetPxElement(ss2Var, true, new ss2() { // from class: androidx.compose.foundation.layout.OffsetKt$offset$2
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        }));
    }

    public static final Modifier b(Modifier modifier, final float f, final float f2) {
        return modifier.h(new OffsetElement(f, f2, true, new ss2() { // from class: androidx.compose.foundation.layout.OffsetKt$offset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        }, null));
    }

    public static /* synthetic */ Modifier c(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = bu1.g(0);
        }
        if ((i & 2) != 0) {
            f2 = bu1.g(0);
        }
        return b(modifier, f, f2);
    }
}
