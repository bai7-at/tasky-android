package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.p;
import defpackage.dy4;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ov4;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class FocusableKt {
    private static final p a;
    private static final FocusableKt$FocusableInNonTouchModeElement$1 b;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        a = new p(InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.FocusableKt$special$$inlined$debugInspectorInfo$1
            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a());
        b = new ov4() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public boolean equals(Object obj) {
                return this == obj;
            }

            @Override // defpackage.ov4
            public int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // defpackage.ov4
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public f l() {
                return new f();
            }

            @Override // defpackage.ov4
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public void r(f fVar) {
            }
        };
    }

    public static final Modifier a(Modifier modifier, boolean z, dy4 dy4Var) {
        return modifier.h(z ? androidx.compose.ui.focus.e.a(new FocusableElement(dy4Var)) : Modifier.a);
    }

    public static final Modifier b(Modifier modifier, final boolean z, final dy4 dy4Var) {
        return InspectableValueKt.b(modifier, new ss2() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$1
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
        }, a(Modifier.a.h(b), z, dy4Var));
    }
}
