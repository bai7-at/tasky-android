package com.skydoves.balloon.compose;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import defpackage.gt2;
import defpackage.lj7;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class BalloonSemanticsKt {
    private static final SemanticsPropertyKey a = new SemanticsPropertyKey("IsBalloon", new gt2() { // from class: com.skydoves.balloon.compose.BalloonSemanticsKt$IsBalloon$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ww8 invoke(ww8 ww8Var, ww8 ww8Var2) {
            zq3.h(ww8Var2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsBalloon. A dialog should not be a child of a clickable/focusable node.");
        }
    });

    public static final void a(lj7 lj7Var) {
        zq3.h(lj7Var, "<this>");
        lj7Var.a(a, ww8.a);
    }
}
