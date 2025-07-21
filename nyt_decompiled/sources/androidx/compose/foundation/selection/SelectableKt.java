package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.dj7;
import defpackage.dy4;
import defpackage.ej3;
import defpackage.fo3;
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
public abstract class SelectableKt {
    public static final Modifier a(Modifier modifier, final boolean z, final dy4 dy4Var, final ej3 ej3Var, final boolean z2, final n27 n27Var, final qs2 qs2Var) {
        return InspectableValueKt.b(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), dj7.d(ClickableKt.c(Modifier.a, dy4Var, ej3Var, z2, null, n27Var, qs2Var, 8, null), false, new ss2() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(lj7 lj7Var) {
                jj7.W(lj7Var, z);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((lj7) obj);
                return ww8.a;
            }
        }, 1, null));
    }

    public static final Modifier b(Modifier modifier, final boolean z, final boolean z2, final n27 n27Var, final qs2 qs2Var) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-XHw0xAI$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), new it2() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.z(-2124609672);
                if (b.G()) {
                    b.S(-2124609672, i, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:68)");
                }
                Modifier.a aVar = Modifier.a;
                composer.z(-492369756);
                Object A = composer.A();
                if (A == Composer.a.a()) {
                    A = fo3.a();
                    composer.q(A);
                }
                composer.R();
                Modifier a = SelectableKt.a(aVar, z, (dy4) A, (ej3) composer.m(IndicationKt.a()), z2, n27Var, qs2Var);
                if (b.G()) {
                    b.R();
                }
                composer.R();
                return a;
            }
        });
    }

    public static /* synthetic */ Modifier c(Modifier modifier, boolean z, boolean z2, n27 n27Var, qs2 qs2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            n27Var = null;
        }
        return b(modifier, z, z2, n27Var, qs2Var);
    }
}
