package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ku8;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class ComposedModifierKt {
    public static final Modifier a(Modifier modifier, ss2 ss2Var, it2 it2Var) {
        return modifier.h(new d(ss2Var, it2Var));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, ss2 ss2Var, it2 it2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ss2Var = InspectableValueKt.a();
        }
        return a(modifier, ss2Var, it2Var);
    }

    public static final Modifier d(final Composer composer, Modifier modifier) {
        if (modifier.a(new ss2() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Modifier.b bVar) {
                return Boolean.valueOf(!(bVar instanceof d));
            }
        })) {
            return modifier;
        }
        composer.z(1219399079);
        Modifier modifier2 = (Modifier) modifier.b(Modifier.a, new gt2() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$result$1
            {
                super(2);
            }

            @Override // defpackage.gt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Modifier invoke(Modifier modifier3, Modifier.b bVar) {
                boolean z = bVar instanceof d;
                Modifier modifier4 = bVar;
                if (z) {
                    it2 l = ((d) bVar).l();
                    zq3.f(l, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    modifier4 = ComposedModifierKt.d(Composer.this, (Modifier) ((it2) ku8.f(l, 3)).invoke(Modifier.a, Composer.this, 0));
                }
                return modifier3.h(modifier4);
            }
        });
        composer.R();
        return modifier2;
    }

    public static final Modifier e(Composer composer, Modifier modifier) {
        return modifier == Modifier.a ? modifier : d(composer, new CompositionLocalMapInjectionElement(composer.o()).h(modifier));
    }
}
