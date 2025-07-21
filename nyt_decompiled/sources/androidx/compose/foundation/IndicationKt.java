package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.ej3;
import defpackage.eo3;
import defpackage.fj3;
import defpackage.it2;
import defpackage.lh4;
import defpackage.m76;
import defpackage.ml3;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class IndicationKt {
    private static final m76 a = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.foundation.IndicationKt$LocalIndication$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ej3 mo865invoke() {
            return d.a;
        }
    });

    public static final m76 a() {
        return a;
    }

    public static final Modifier b(Modifier modifier, final eo3 eo3Var, final ej3 ej3Var) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.IndicationKt$indication$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), new it2() { // from class: androidx.compose.foundation.IndicationKt$indication$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.z(-353972293);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-353972293, i, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:108)");
                }
                ej3 ej3Var2 = ej3.this;
                if (ej3Var2 == null) {
                    ej3Var2 = i.a;
                }
                fj3 a2 = ej3Var2.a(eo3Var, composer, 0);
                composer.z(1157296644);
                boolean S = composer.S(a2);
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new h(a2);
                    composer.q(A);
                }
                composer.R();
                h hVar = (h) A;
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return hVar;
            }
        });
    }
}
