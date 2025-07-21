package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class Magnifier_androidKt {
    private static final SemanticsPropertyKey a = new SemanticsPropertyKey("MagnifierPositionInRoot", null, 2, null);

    public static final SemanticsPropertyKey a() {
        return a;
    }

    public static final boolean b(int i) {
        return i >= 28;
    }

    public static /* synthetic */ boolean c(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Build.VERSION.SDK_INT;
        }
        return b(i);
    }

    public static final Modifier d(Modifier modifier, final ss2 ss2Var, final ss2 ss2Var2, ss2 ss2Var3, final float f, boolean z, final long j, final float f2, final float f3, final boolean z2, j jVar) {
        if (c(0, 1, null)) {
            return modifier.h(new MagnifierElement(ss2Var, ss2Var2, ss2Var3, f, z, j, f2, f3, z2, jVar == null ? j.a.a() : jVar, null));
        }
        return InspectableValueKt.b(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.Magnifier_androidKt$magnifier-jPUL71Q$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), Modifier.a);
    }
}
