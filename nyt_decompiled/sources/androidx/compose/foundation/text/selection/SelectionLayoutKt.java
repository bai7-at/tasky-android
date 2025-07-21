package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.e;
import androidx.compose.ui.text.i;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.aj8;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xi7;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes.dex */
public abstract class SelectionLayoutKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvedTextDirection b(aj8 aj8Var, int i) {
        return e(aj8Var, i) ? aj8Var.y(i) : aj8Var.c(i);
    }

    public static final xi7 c(aj8 aj8Var, int i, int i2, int i3, long j, boolean z, boolean z2) {
        return new h(z2, 1, 1, z ? null : new e(new e.a(b(aj8Var, i.n(j)), i.n(j), 1L), new e.a(b(aj8Var, i.i(j)), i.i(j), 1L), i.m(j)), new d(1L, 1, i, i2, i3, aj8Var));
    }

    public static final boolean d(e eVar, xi7 xi7Var) {
        if (eVar == null || xi7Var == null) {
            return true;
        }
        if (eVar.e().d() == eVar.c().d()) {
            return eVar.e().c() == eVar.c().c();
        }
        if ((eVar.d() ? eVar.e() : eVar.c()).c() != 0) {
            return false;
        }
        if (xi7Var.d().l() != (eVar.d() ? eVar.c() : eVar.e()).c()) {
            return false;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        xi7Var.e(new ss2() { // from class: androidx.compose.foundation.text.selection.SelectionLayoutKt$isCollapsed$1
            {
                super(1);
            }

            public final void b(d dVar) {
                if (dVar.c().length() > 0) {
                    Ref$BooleanRef.this.element = false;
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((d) obj);
                return ww8.a;
            }
        });
        return ref$BooleanRef.element;
    }

    private static final boolean e(aj8 aj8Var, int i) {
        if (aj8Var.l().j().length() == 0) {
            return true;
        }
        int q = aj8Var.q(i);
        return (i == 0 || q != aj8Var.q(i + (-1))) && (i == aj8Var.l().j().length() || q != aj8Var.q(i + 1));
    }
}
