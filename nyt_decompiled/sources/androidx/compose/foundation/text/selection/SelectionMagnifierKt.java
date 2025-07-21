package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import defpackage.fd5;
import defpackage.hd5;
import defpackage.hu8;
import defpackage.ji;
import defpackage.py1;
import defpackage.qs2;
import defpackage.qz7;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;

/* loaded from: classes.dex */
public abstract class SelectionMagnifierKt {
    private static final ji a = new ji(Float.NaN, Float.NaN);
    private static final hu8 b = VectorConvertersKt.a(new ss2() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1
        public final ji b(long j) {
            ji jiVar;
            if (hd5.c(j)) {
                return new ji(fd5.o(j), fd5.p(j));
            }
            jiVar = SelectionMagnifierKt.a;
            return jiVar;
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((fd5) obj).x());
        }
    }, new ss2() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2
        public final long b(ji jiVar) {
            return hd5.a(jiVar.f(), jiVar.g());
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return fd5.d(b((ji) obj));
        }
    });
    private static final long c;
    private static final qz7 d;

    static {
        long a2 = hd5.a(0.01f, 0.01f);
        c = a2;
        d = new qz7(0.0f, 0.0f, fd5.d(a2), 3, null);
    }

    public static final Modifier d(Modifier modifier, qs2 qs2Var, ss2 ss2Var) {
        return ComposedModifierKt.b(modifier, null, new SelectionMagnifierKt$animatedSelectionMagnifier$1(qs2Var, ss2Var), 1, null);
    }

    public static final qz7 e() {
        return d;
    }

    public static final long f() {
        return c;
    }

    public static final hu8 g() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x08 h(qs2 qs2Var, Composer composer, int i) {
        composer.z(-1589795249);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1589795249, i, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        composer.z(-492369756);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = y.d(qs2Var);
            composer.q(A);
        }
        composer.R();
        x08 x08Var = (x08) A;
        composer.z(-492369756);
        Object A2 = composer.A();
        if (A2 == aVar.a()) {
            A2 = new Animatable(fd5.d(i(x08Var)), g(), fd5.d(f()), null, 8, null);
            composer.q(A2);
        }
        composer.R();
        Animatable animatable = (Animatable) A2;
        py1.d(ww8.a, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(x08Var, animatable, null), composer, 70);
        x08 g = animatable.g();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(x08 x08Var) {
        return ((fd5) x08Var.getValue()).x();
    }
}
