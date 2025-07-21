package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.state.ToggleableState;
import defpackage.dj7;
import defpackage.dy4;
import defpackage.ej3;
import defpackage.fo3;
import defpackage.hn8;
import defpackage.it2;
import defpackage.jj7;
import defpackage.lh4;
import defpackage.lj7;
import defpackage.ml3;
import defpackage.n27;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class ToggleableKt {
    public static final Modifier a(Modifier modifier, final boolean z, final dy4 dy4Var, final ej3 ej3Var, final boolean z2, final n27 n27Var, final ss2 ss2Var) {
        return InspectableValueKt.b(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), d(Modifier.a, hn8.a(z), dy4Var, ej3Var, z2, n27Var, new qs2() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m23invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m23invoke() {
                ss2.this.invoke(Boolean.valueOf(!z));
            }
        }));
    }

    public static final Modifier b(Modifier modifier, final boolean z, final boolean z2, final n27 n27Var, final ss2 ss2Var) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-XHw0xAI$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), new it2() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.z(290332169);
                if (b.G()) {
                    b.S(290332169, i, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:66)");
                }
                Modifier.a aVar = Modifier.a;
                boolean z3 = z;
                composer.z(-492369756);
                Object A = composer.A();
                if (A == Composer.a.a()) {
                    A = fo3.a();
                    composer.q(A);
                }
                composer.R();
                Modifier a = ToggleableKt.a(aVar, z3, (dy4) A, (ej3) composer.m(IndicationKt.a()), z2, n27Var, ss2Var);
                if (b.G()) {
                    b.R();
                }
                composer.R();
                return a;
            }
        });
    }

    public static /* synthetic */ Modifier c(Modifier modifier, boolean z, boolean z2, n27 n27Var, ss2 ss2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            n27Var = null;
        }
        return b(modifier, z, z2, n27Var, ss2Var);
    }

    public static final Modifier d(Modifier modifier, final ToggleableState toggleableState, final dy4 dy4Var, final ej3 ej3Var, final boolean z, final n27 n27Var, final qs2 qs2Var) {
        return InspectableValueKt.b(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), dj7.d(ClickableKt.c(Modifier.a, dy4Var, ej3Var, z, null, n27Var, qs2Var, 8, null), false, new ss2() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable$4$1
            {
                super(1);
            }

            public final void b(lj7 lj7Var) {
                jj7.i0(lj7Var, ToggleableState.this);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((lj7) obj);
                return ww8.a;
            }
        }, 1, null));
    }
}
