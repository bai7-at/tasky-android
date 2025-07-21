package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.fd5;
import defpackage.it2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.x08;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends Lambda implements it2 {
    final /* synthetic */ qs2 $magnifierCenter;
    final /* synthetic */ ss2 $platformMagnifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$animatedSelectionMagnifier$1(qs2 qs2Var, ss2 ss2Var) {
        super(3);
        this.$magnifierCenter = qs2Var;
        this.$platformMagnifier = ss2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(x08 x08Var) {
        return ((fd5) x08Var.getValue()).x();
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        final x08 h;
        composer.z(759876635);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(759876635, i, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
        }
        h = SelectionMagnifierKt.h(this.$magnifierCenter, composer, 0);
        ss2 ss2Var = this.$platformMagnifier;
        composer.z(1227294510);
        boolean S = composer.S(h);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new qs2() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1
                {
                    super(0);
                }

                public final long b() {
                    long c;
                    c = SelectionMagnifierKt$animatedSelectionMagnifier$1.c(x08.this);
                    return c;
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    return fd5.d(b());
                }
            };
            composer.q(A);
        }
        composer.R();
        Modifier modifier2 = (Modifier) ss2Var.invoke((qs2) A);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return modifier2;
    }
}
