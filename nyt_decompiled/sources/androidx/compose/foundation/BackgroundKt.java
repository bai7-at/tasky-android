package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.no7;
import defpackage.qt6;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yc0;

/* loaded from: classes.dex */
public abstract class BackgroundKt {
    public static final Modifier a(Modifier modifier, final yc0 yc0Var, final no7 no7Var, final float f) {
        return modifier.h(new BackgroundElement(0L, yc0Var, f, no7Var, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.BackgroundKt$background$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), 1, null));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, yc0 yc0Var, no7 no7Var, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            no7Var = qt6.a();
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return a(modifier, yc0Var, no7Var, f);
    }

    public static final Modifier c(Modifier modifier, final long j, final no7 no7Var) {
        return modifier.h(new BackgroundElement(j, null, 1.0f, no7Var, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), 2, null));
    }

    public static /* synthetic */ Modifier d(Modifier modifier, long j, no7 no7Var, int i, Object obj) {
        if ((i & 2) != 0) {
            no7Var = qt6.a();
        }
        return c(modifier, j, no7Var);
    }
}
