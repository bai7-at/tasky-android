package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.Transition.a;
import androidx.compose.animation.core.Transition.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.gi;
import defpackage.hu8;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.ph2;
import defpackage.py1;
import defpackage.rr8;
import defpackage.ss2;
import defpackage.ty4;
import defpackage.x08;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public abstract class TransitionKt {
    public static final Transition a(final Transition transition, Object obj, Object obj2, String str, Composer composer, int i) {
        composer.z(-198307638);
        if (b.G()) {
            b.S(-198307638, i, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1022)");
        }
        composer.z(1157296644);
        boolean S = composer.S(transition);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new Transition(new ty4(obj), transition.i() + " > " + str);
            composer.q(A);
        }
        composer.R();
        final Transition transition2 = (Transition) A;
        composer.z(-561014285);
        boolean S2 = composer.S(transition) | composer.S(transition2);
        Object A2 = composer.A();
        if (S2 || A2 == Composer.a.a()) {
            A2 = new ss2() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1

                public static final class a implements ms1 {
                    final /* synthetic */ Transition a;
                    final /* synthetic */ Transition b;

                    public a(Transition transition, Transition transition2) {
                        this.a = transition;
                        this.b = transition2;
                    }

                    @Override // defpackage.ms1
                    public void dispose() {
                        this.a.y(this.b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ms1 invoke(ns1 ns1Var) {
                    Transition.this.e(transition2);
                    return new a(Transition.this, transition2);
                }
            };
            composer.q(A2);
        }
        composer.R();
        py1.a(transition2, (ss2) A2, composer, 0);
        if (transition.r()) {
            transition2.z(obj, obj2, transition.j());
        } else {
            transition2.G(obj2, composer, ((i >> 3) & 8) | ((i >> 6) & 14));
            transition2.B(false);
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return transition2;
    }

    public static final Transition.a b(final Transition transition, hu8 hu8Var, String str, Composer composer, int i, int i2) {
        composer.z(-1714122528);
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (b.G()) {
            b.S(-1714122528, i, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:976)");
        }
        composer.z(1157296644);
        boolean S = composer.S(transition);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = transition.new a(hu8Var, str);
            composer.q(A);
        }
        composer.R();
        final Transition.a aVar = (Transition.a) A;
        py1.a(aVar, new ss2() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1

            public static final class a implements ms1 {
                final /* synthetic */ Transition a;
                final /* synthetic */ Transition.a b;

                public a(Transition transition, Transition.a aVar) {
                    this.a = transition;
                    this.b = aVar;
                }

                @Override // defpackage.ms1
                public void dispose() {
                    this.a.w(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ms1 invoke(ns1 ns1Var) {
                return new a(Transition.this, aVar);
            }
        }, composer, 0);
        if (transition.r()) {
            aVar.d();
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return aVar;
    }

    public static final x08 c(final Transition transition, Object obj, Object obj2, ph2 ph2Var, hu8 hu8Var, String str, Composer composer, int i) {
        composer.z(-304821198);
        if (b.G()) {
            b.S(-304821198, i, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1097)");
        }
        composer.z(1157296644);
        boolean S = composer.S(transition);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = transition.new d(obj, gi.i(hu8Var, obj2), hu8Var, str);
            composer.q(A);
        }
        composer.R();
        final Transition.d dVar = (Transition.d) A;
        if (transition.r()) {
            dVar.P(obj, obj2, ph2Var);
        } else {
            dVar.Q(obj2, ph2Var);
        }
        composer.z(-561010487);
        boolean S2 = composer.S(transition) | composer.S(dVar);
        Object A2 = composer.A();
        if (S2 || A2 == Composer.a.a()) {
            A2 = new ss2() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1

                public static final class a implements ms1 {
                    final /* synthetic */ Transition a;
                    final /* synthetic */ Transition.d b;

                    public a(Transition transition, Transition.d dVar) {
                        this.a = transition;
                        this.b = dVar;
                    }

                    @Override // defpackage.ms1
                    public void dispose() {
                        this.a.x(this.b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ms1 invoke(ns1 ns1Var) {
                    Transition.this.d(dVar);
                    return new a(Transition.this, dVar);
                }
            };
            composer.q(A2);
        }
        composer.R();
        py1.a(dVar, (ss2) A2, composer, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return dVar;
    }

    public static final Transition d(rr8 rr8Var, String str, Composer composer, int i, int i2) {
        composer.z(1643203617);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (b.G()) {
            b.S(1643203617, i, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:316)");
        }
        composer.z(1157296644);
        boolean S = composer.S(rr8Var);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new Transition(rr8Var, str);
            composer.q(A);
        }
        composer.R();
        final Transition transition = (Transition) A;
        transition.f(rr8Var.b(), composer, 0);
        composer.z(-561041970);
        boolean S2 = composer.S(transition);
        Object A2 = composer.A();
        if (S2 || A2 == Composer.a.a()) {
            A2 = new ss2() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$1$1

                public static final class a implements ms1 {
                    final /* synthetic */ Transition a;

                    public a(Transition transition) {
                        this.a = transition;
                    }

                    @Override // defpackage.ms1
                    public void dispose() {
                        this.a.u();
                    }
                }

                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ms1 invoke(ns1 ns1Var) {
                    return new a(Transition.this);
                }
            };
            composer.q(A2);
        }
        composer.R();
        py1.a(transition, (ss2) A2, composer, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return transition;
    }

    public static final Transition e(ty4 ty4Var, String str, Composer composer, int i, int i2) {
        composer.z(882913843);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (b.G()) {
            b.S(882913843, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:355)");
        }
        Transition d = d(ty4Var, str, composer, i & WebSocketProtocol.PAYLOAD_SHORT, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return d;
    }

    public static final Transition f(Object obj, String str, Composer composer, int i, int i2) {
        composer.z(2029166765);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (b.G()) {
            b.S(2029166765, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:73)");
        }
        composer.z(-492369756);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = new Transition(obj, str);
            composer.q(A);
        }
        composer.R();
        final Transition transition = (Transition) A;
        transition.f(obj, composer, (i & 8) | 48 | (i & 14));
        composer.z(-561051652);
        boolean S = composer.S(transition);
        Object A2 = composer.A();
        if (S || A2 == aVar.a()) {
            A2 = new ss2() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1

                public static final class a implements ms1 {
                    final /* synthetic */ Transition a;

                    public a(Transition transition) {
                        this.a = transition;
                    }

                    @Override // defpackage.ms1
                    public void dispose() {
                        this.a.u();
                    }
                }

                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ms1 invoke(ns1 ns1Var) {
                    return new a(Transition.this);
                }
            };
            composer.q(A2);
        }
        composer.R();
        py1.a(transition, (ss2) A2, composer, 6);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return transition;
    }
}
