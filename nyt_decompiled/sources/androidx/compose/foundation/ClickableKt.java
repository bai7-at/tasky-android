package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.by0;
import defpackage.c26;
import defpackage.dy4;
import defpackage.ej3;
import defpackage.fo3;
import defpackage.it2;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.n27;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
public abstract class ClickableKt {
    public static final Modifier b(Modifier modifier, final dy4 dy4Var, final ej3 ej3Var, final boolean z, final String str, final n27 n27Var, final qs2 qs2Var) {
        return InspectableValueKt.b(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), FocusableKt.b(g.a(IndicationKt.b(Modifier.a, dy4Var, ej3Var), dy4Var, z), z, dy4Var).h(new ClickableElement(dy4Var, z, str, n27Var, qs2Var, null)));
    }

    public static /* synthetic */ Modifier c(Modifier modifier, dy4 dy4Var, ej3 ej3Var, boolean z, String str, n27 n27Var, qs2 qs2Var, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return b(modifier, dy4Var, ej3Var, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : n27Var, qs2Var);
    }

    public static final Modifier d(Modifier modifier, final boolean z, final String str, final n27 n27Var, final qs2 qs2Var) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), new it2() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.z(-756081143);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-756081143, i, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:98)");
                }
                Modifier.a aVar = Modifier.a;
                ej3 ej3Var = (ej3) composer.m(IndicationKt.a());
                composer.z(-492369756);
                Object A = composer.A();
                if (A == Composer.a.a()) {
                    A = fo3.a();
                    composer.q(A);
                }
                composer.R();
                Modifier b = ClickableKt.b(aVar, (dy4) A, ej3Var, z, str, n27Var, qs2Var);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return b;
            }
        });
    }

    public static /* synthetic */ Modifier e(Modifier modifier, boolean z, String str, n27 n27Var, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            n27Var = null;
        }
        return d(modifier, z, str, n27Var, qs2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(c26 c26Var, long j, dy4 dy4Var, AbstractClickableNode.a aVar, qs2 qs2Var, by0 by0Var) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new ClickableKt$handlePressInteraction$2(c26Var, j, dy4Var, aVar, qs2Var, null), by0Var);
        return coroutineScope == kotlin.coroutines.intrinsics.a.h() ? coroutineScope : ww8.a;
    }
}
