package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class InspectableValueKt {
    private static final ss2 a = new ss2() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        public final void b(ml3 ml3Var) {
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            lh4.a(obj);
            b(null);
            return ww8.a;
        }
    };
    private static boolean b;

    public static final ss2 a() {
        return a;
    }

    public static final Modifier b(Modifier modifier, ss2 ss2Var, Modifier modifier2) {
        p pVar = new p(ss2Var);
        return modifier.h(pVar).h(modifier2).h(pVar.l());
    }

    public static final boolean c() {
        return b;
    }
}
