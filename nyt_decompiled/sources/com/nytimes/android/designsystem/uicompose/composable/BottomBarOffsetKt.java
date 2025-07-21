package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class BottomBarOffsetKt {
    public static final Modifier a(Modifier modifier, final float f) {
        zq3.h(modifier, "$this$bottomBarOffset");
        return modifier.h(new BottomBarOffsetModifier(f, InspectableValueKt.c() ? new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.BottomBarOffsetKt$bottomBarOffset-3ABfNKs$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), null));
    }
}
