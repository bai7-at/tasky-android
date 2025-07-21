package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class IntrinsicKt {
    public static final Modifier a(Modifier modifier, final IntrinsicSize intrinsicSize) {
        return modifier.h(new IntrinsicHeightElement(intrinsicSize, true, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.IntrinsicKt$height$$inlined$debugInspectorInfo$1
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

    public static final Modifier b(Modifier modifier, final IntrinsicSize intrinsicSize) {
        return modifier.h(new IntrinsicWidthElement(intrinsicSize, true, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.IntrinsicKt$width$$inlined$debugInspectorInfo$1
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
