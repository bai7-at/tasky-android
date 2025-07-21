package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class OnRemeasuredModifierKt {
    public static final Modifier a(Modifier modifier, final ss2 ss2Var) {
        return modifier.h(new j(ss2Var, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.ui.layout.OnRemeasuredModifierKt$onSizeChanged$$inlined$debugInspectorInfo$1
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
}
