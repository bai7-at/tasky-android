package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition.a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.comscore.streaming.ContentType;
import defpackage.hu8;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.oj3;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.wk2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class InfiniteTransitionKt {
    public static final /* synthetic */ x08 a(InfiniteTransition infiniteTransition, float f, float f2, oj3 oj3Var, Composer composer, int i) {
        composer.z(469472752);
        if (b.G()) {
            b.S(469472752, i, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:356)");
        }
        x08 b = b(infiniteTransition, f, f2, oj3Var, "FloatAnimation", composer, (i & ContentType.LONG_FORM_ON_DEMAND) | 24584 | (i & 896) | (i & 7168), 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return b;
    }

    public static final x08 b(InfiniteTransition infiniteTransition, float f, float f2, oj3 oj3Var, String str, Composer composer, int i, int i2) {
        composer.z(-644770905);
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        if (b.G()) {
            b.S(-644770905, i, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i3 = i << 3;
        x08 c = c(infiniteTransition, Float.valueOf(f), Float.valueOf(f2), VectorConvertersKt.d(wk2.a), oj3Var, str2, composer, (i & ContentType.LONG_FORM_ON_DEMAND) | 8 | (i & 896) | (57344 & i3) | (i3 & 458752), 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return c;
    }

    public static final x08 c(final InfiniteTransition infiniteTransition, final Object obj, final Object obj2, hu8 hu8Var, final oj3 oj3Var, String str, Composer composer, int i, int i2) {
        composer.z(-1062847727);
        String str2 = (i2 & 16) != 0 ? "ValueAnimation" : str;
        if (b.G()) {
            b.S(-1062847727, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");
        }
        composer.z(-492369756);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = infiniteTransition.new a(obj, obj2, hu8Var, oj3Var, str2);
            composer.q(A);
        }
        composer.R();
        final InfiniteTransition.a aVar = (InfiniteTransition.a) A;
        py1.h(new qs2() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m16invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16invoke() {
                if (zq3.c(obj, aVar.j()) && zq3.c(obj2, aVar.n())) {
                    return;
                }
                aVar.D(obj, obj2, oj3Var);
            }
        }, composer, 0);
        py1.a(aVar, new ss2() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2

            public static final class a implements ms1 {
                final /* synthetic */ InfiniteTransition a;
                final /* synthetic */ InfiniteTransition.a b;

                public a(InfiniteTransition infiniteTransition, InfiniteTransition.a aVar) {
                    this.a = infiniteTransition;
                    this.b = aVar;
                }

                @Override // defpackage.ms1
                public void dispose() {
                    this.a.j(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ms1 invoke(ns1 ns1Var) {
                InfiniteTransition.this.f(aVar);
                return new a(InfiniteTransition.this, aVar);
            }
        }, composer, 6);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return aVar;
    }

    public static final /* synthetic */ InfiniteTransition d(Composer composer, int i) {
        composer.z(-840193660);
        if (b.G()) {
            b.S(-840193660, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:323)");
        }
        InfiniteTransition e = e("InfiniteTransition", composer, 6, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return e;
    }

    public static final InfiniteTransition e(String str, Composer composer, int i, int i2) {
        composer.z(1013651573);
        if ((i2 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (b.G()) {
            b.S(1013651573, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        composer.z(-492369756);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = new InfiniteTransition(str);
            composer.q(A);
        }
        composer.R();
        InfiniteTransition infiniteTransition = (InfiniteTransition) A;
        infiniteTransition.k(composer, 8);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return infiniteTransition;
    }
}
