package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverKt;
import defpackage.bu1;
import defpackage.by0;
import defpackage.ea7;
import defpackage.fa7;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.kd;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class SheetState {
    public static final Companion e = new Companion(null);
    private final boolean a;
    private final boolean b;
    private AnchoredDraggableState c;
    private fm1 d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ea7 a(final boolean z, final ss2 ss2Var, final fm1 fm1Var) {
            return SaverKt.a(new gt2() { // from class: androidx.compose.material3.SheetState$Companion$Saver$1
                @Override // defpackage.gt2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SheetValue invoke(fa7 fa7Var, SheetState sheetState) {
                    return sheetState.f();
                }
            }, new ss2() { // from class: androidx.compose.material3.SheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SheetState invoke(SheetValue sheetValue) {
                    return new SheetState(z, fm1Var, sheetValue, ss2Var, false, 16, null);
                }
            });
        }

        private Companion() {
        }
    }

    public SheetState(boolean z, SheetValue sheetValue, ss2 ss2Var, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z && sheetValue == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z2 && sheetValue == SheetValue.Hidden) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.c = new AnchoredDraggableState(sheetValue, new ss2() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$1
            {
                super(1);
            }

            public final Float b(float f) {
                fm1 n;
                n = SheetState.this.n();
                return Float.valueOf(n.f1(bu1.g(56)));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).floatValue());
            }
        }, new qs2() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float mo865invoke() {
                fm1 n;
                n = SheetState.this.n();
                return Float.valueOf(n.f1(bu1.g(125)));
            }
        }, kd.a.a(), ss2Var);
    }

    public static /* synthetic */ Object c(SheetState sheetState, SheetValue sheetValue, float f, by0 by0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            f = sheetState.c.v();
        }
        return sheetState.b(sheetValue, f, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fm1 n() {
        fm1 fm1Var = this.d;
        if (fm1Var != null) {
            return fm1Var;
        }
        throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
    }

    public final Object b(SheetValue sheetValue, float f, by0 by0Var) {
        Object d = AnchoredDraggableKt.d(this.c, sheetValue, f, by0Var);
        return d == kotlin.coroutines.intrinsics.a.h() ? d : ww8.a;
    }

    public final Object d(by0 by0Var) {
        Object e2 = AnchoredDraggableKt.e(this.c, SheetValue.Expanded, 0.0f, by0Var, 2, null);
        return e2 == kotlin.coroutines.intrinsics.a.h() ? e2 : ww8.a;
    }

    public final AnchoredDraggableState e() {
        return this.c;
    }

    public final SheetValue f() {
        return (SheetValue) this.c.s();
    }

    public final boolean g() {
        return this.c.o().c(SheetValue.Expanded);
    }

    public final boolean h() {
        return this.c.o().c(SheetValue.PartiallyExpanded);
    }

    public final boolean i() {
        return this.a;
    }

    public final SheetValue j() {
        return (SheetValue) this.c.x();
    }

    public final Object k(by0 by0Var) {
        if (this.b) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Object c = c(this, SheetValue.Hidden, 0.0f, by0Var, 2, null);
        return c == kotlin.coroutines.intrinsics.a.h() ? c : ww8.a;
    }

    public final boolean l() {
        return this.c.s() != SheetValue.Hidden;
    }

    public final Object m(by0 by0Var) {
        if (this.a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object c = c(this, SheetValue.PartiallyExpanded, 0.0f, by0Var, 2, null);
        return c == kotlin.coroutines.intrinsics.a.h() ? c : ww8.a;
    }

    public final float o() {
        return this.c.A();
    }

    public final void p(fm1 fm1Var) {
        this.d = fm1Var;
    }

    public final Object q(float f, by0 by0Var) {
        Object G = this.c.G(f, by0Var);
        return G == kotlin.coroutines.intrinsics.a.h() ? G : ww8.a;
    }

    public final Object r(by0 by0Var) {
        Object c = c(this, h() ? SheetValue.PartiallyExpanded : SheetValue.Expanded, 0.0f, by0Var, 2, null);
        return c == kotlin.coroutines.intrinsics.a.h() ? c : ww8.a;
    }

    public /* synthetic */ SheetState(boolean z, fm1 fm1Var, SheetValue sheetValue, ss2 ss2Var, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, fm1Var, (i & 4) != 0 ? SheetValue.Hidden : sheetValue, (i & 8) != 0 ? new ss2() { // from class: androidx.compose.material3.SheetState.2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(SheetValue sheetValue2) {
                return Boolean.TRUE;
            }
        } : ss2Var, (i & 16) != 0 ? false : z2);
    }

    public SheetState(boolean z, fm1 fm1Var, SheetValue sheetValue, ss2 ss2Var, boolean z2) {
        this(z, sheetValue, ss2Var, z2);
        this.d = fm1Var;
    }
}
