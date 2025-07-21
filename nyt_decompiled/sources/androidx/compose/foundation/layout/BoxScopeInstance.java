package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.ac0;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public final class BoxScopeInstance implements ac0 {
    public static final BoxScopeInstance a = new BoxScopeInstance();

    private BoxScopeInstance() {
    }

    @Override // defpackage.ac0
    public Modifier c(Modifier modifier, final Alignment alignment) {
        return modifier.h(new BoxChildDataElement(alignment, false, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.BoxScopeInstance$align$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a()));
    }

    @Override // defpackage.ac0
    public Modifier e(Modifier modifier) {
        return modifier.h(new BoxChildDataElement(Alignment.a.e(), true, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1
            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a()));
    }
}
