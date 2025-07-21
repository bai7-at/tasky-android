package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.it2;
import defpackage.iv4;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.n76;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.uh9;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class WindowInsetsPaddingKt {
    private static final n76 a = iv4.a(new qs2() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o mo865invoke() {
            return uh9.a(0, 0, 0, 0);
        }
    });

    public static final n76 a() {
        return a;
    }

    public static final Modifier b(Modifier modifier, final ss2 ss2Var) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), new it2() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.z(-1608161351);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-1608161351, i, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:125)");
                }
                ss2 ss2Var2 = ss2.this;
                composer.z(1157296644);
                boolean S = composer.S(ss2Var2);
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new e(ss2Var2);
                    composer.q(A);
                }
                composer.R();
                e eVar = (e) A;
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return eVar;
            }
        });
    }

    public static final Modifier c(Modifier modifier, final o oVar) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), new it2() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$windowInsetsPadding$2
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.z(-1415685722);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-1415685722, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:61)");
                }
                o oVar2 = o.this;
                composer.z(1157296644);
                boolean S = composer.S(oVar2);
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new InsetsPaddingModifier(oVar2);
                    composer.q(A);
                }
                composer.R();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) A;
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return insetsPaddingModifier;
            }
        });
    }
}
