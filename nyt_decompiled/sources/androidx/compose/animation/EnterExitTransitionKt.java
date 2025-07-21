package androidx.compose.animation;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.comscore.streaming.ContentType;
import defpackage.di;
import defpackage.fa2;
import defpackage.fj0;
import defpackage.hn3;
import defpackage.hu8;
import defpackage.ic9;
import defpackage.in3;
import defpackage.ji;
import defpackage.la7;
import defpackage.lr8;
import defpackage.n23;
import defpackage.ph2;
import defpackage.qu7;
import defpackage.qz7;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.vm3;
import defpackage.vq8;
import defpackage.wk2;
import defpackage.wm3;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public abstract class EnterExitTransitionKt {
    private static final hu8 a = VectorConvertersKt.a(new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        public final ji b(long j) {
            return new ji(androidx.compose.ui.graphics.e.f(j), androidx.compose.ui.graphics.e.g(j));
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((androidx.compose.ui.graphics.e) obj).j());
        }
    }, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        public final long b(ji jiVar) {
            return vq8.a(jiVar.f(), jiVar.g());
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return androidx.compose.ui.graphics.e.b(b((ji) obj));
        }
    });
    private static final qz7 b = di.i(0.0f, 400.0f, null, 5, null);
    private static final qz7 c = di.i(0.0f, 400.0f, vm3.b(ic9.c(vm3.b)), 1, null);
    private static final qz7 d = di.i(0.0f, 400.0f, hn3.b(ic9.d(hn3.b)), 1, null);

    public static final c A(ph2 ph2Var, final ss2 ss2Var) {
        return z(ph2Var, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2
            {
                super(1);
            }

            public final long b(long j) {
                return wm3.a(((Number) ss2.this.invoke(Integer.valueOf(hn3.g(j)))).intValue(), 0);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return vm3.b(b(((hn3) obj).j()));
            }
        });
    }

    public static /* synthetic */ c B(ph2 ph2Var, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ph2Var = di.i(0.0f, 400.0f, vm3.b(ic9.c(vm3.b)), 1, null);
        }
        if ((i & 2) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$1
                public final Integer b(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return b(((Number) obj2).intValue());
                }
            };
        }
        return A(ph2Var, ss2Var);
    }

    public static final c C(ph2 ph2Var, final ss2 ss2Var) {
        return z(ph2Var, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            {
                super(1);
            }

            public final long b(long j) {
                return wm3.a(0, ((Number) ss2.this.invoke(Integer.valueOf(hn3.f(j)))).intValue());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return vm3.b(b(((hn3) obj).j()));
            }
        });
    }

    public static /* synthetic */ c D(ph2 ph2Var, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ph2Var = di.i(0.0f, 400.0f, vm3.b(ic9.c(vm3.b)), 1, null);
        }
        if ((i & 2) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$1
                public final Integer b(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return b(((Number) obj2).intValue());
                }
            };
        }
        return C(ph2Var, ss2Var);
    }

    public static final e E(ph2 ph2Var, ss2 ss2Var) {
        return new f(new lr8(null, new qu7(ss2Var, ph2Var), null, null, false, null, 61, null));
    }

    public static final e F(ph2 ph2Var, final ss2 ss2Var) {
        return E(ph2Var, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2
            {
                super(1);
            }

            public final long b(long j) {
                return wm3.a(((Number) ss2.this.invoke(Integer.valueOf(hn3.g(j)))).intValue(), 0);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return vm3.b(b(((hn3) obj).j()));
            }
        });
    }

    public static final e G(ph2 ph2Var, final ss2 ss2Var) {
        return E(ph2Var, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2
            {
                super(1);
            }

            public final long b(long j) {
                return wm3.a(0, ((Number) ss2.this.invoke(Integer.valueOf(hn3.f(j)))).intValue());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return vm3.b(b(((hn3) obj).j()));
            }
        });
    }

    private static final Alignment H(Alignment.b bVar) {
        Alignment.a aVar = Alignment.a;
        return zq3.c(bVar, aVar.k()) ? aVar.h() : zq3.c(bVar, aVar.j()) ? aVar.f() : aVar.e();
    }

    private static final Alignment I(Alignment.c cVar) {
        Alignment.a aVar = Alignment.a;
        return zq3.c(cVar, aVar.l()) ? aVar.m() : zq3.c(cVar, aVar.a()) ? aVar.b() : aVar.e();
    }

    public static final c J(Transition transition, c cVar, Composer composer, int i) {
        composer.z(21614502);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(21614502, i, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:894)");
        }
        composer.z(1157296644);
        boolean S = composer.S(transition);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = b0.e(cVar, null, 2, null);
            composer.q(A);
        }
        composer.R();
        sy4 sy4Var = (sy4) A;
        if (transition.h() == transition.n() && transition.h() == EnterExitState.Visible) {
            if (transition.r()) {
                L(sy4Var, cVar);
            } else {
                L(sy4Var, c.a.a());
            }
        } else if (transition.n() == EnterExitState.Visible) {
            L(sy4Var, K(sy4Var).c(cVar));
        }
        c K = K(sy4Var);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return K;
    }

    private static final c K(sy4 sy4Var) {
        return (c) sy4Var.getValue();
    }

    private static final void L(sy4 sy4Var, c cVar) {
        sy4Var.setValue(cVar);
    }

    public static final e M(Transition transition, e eVar, Composer composer, int i) {
        composer.z(-1363864804);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1363864804, i, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:914)");
        }
        composer.z(1157296644);
        boolean S = composer.S(transition);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = b0.e(eVar, null, 2, null);
            composer.q(A);
        }
        composer.R();
        sy4 sy4Var = (sy4) A;
        if (transition.h() == transition.n() && transition.h() == EnterExitState.Visible) {
            if (transition.r()) {
                O(sy4Var, eVar);
            } else {
                O(sy4Var, e.a.a());
            }
        } else if (transition.n() != EnterExitState.Visible) {
            O(sy4Var, N(sy4Var).c(eVar));
        }
        e N = N(sy4Var);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return N;
    }

    private static final e N(sy4 sy4Var) {
        return (e) sy4Var.getValue();
    }

    private static final void O(sy4 sy4Var, e eVar) {
        sy4Var.setValue(eVar);
    }

    private static final n23 e(final Transition transition, final c cVar, final e eVar, String str, Composer composer, int i) {
        final Transition.a aVar;
        final Transition.a aVar2;
        composer.z(642253525);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(642253525, i, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:942)");
        }
        boolean z = (cVar.b().c() == null && eVar.b().c() == null) ? false : true;
        boolean z2 = (cVar.b().e() == null && eVar.b().e() == null) ? false : true;
        composer.z(-1158245383);
        if (z) {
            hu8 d2 = VectorConvertersKt.d(wk2.a);
            composer.z(-492369756);
            Object A = composer.A();
            if (A == Composer.a.a()) {
                A = str + " alpha";
                composer.q(A);
            }
            composer.R();
            aVar = TransitionKt.b(transition, d2, (String) A, composer, (i & 14) | 448, 0);
        } else {
            aVar = null;
        }
        composer.R();
        composer.z(-1158245186);
        if (z2) {
            hu8 d3 = VectorConvertersKt.d(wk2.a);
            composer.z(-492369756);
            Object A2 = composer.A();
            if (A2 == Composer.a.a()) {
                A2 = str + " scale";
                composer.q(A2);
            }
            composer.R();
            aVar2 = TransitionKt.b(transition, d3, (String) A2, composer, (i & 14) | 448, 0);
        } else {
            aVar2 = null;
        }
        composer.R();
        final Transition.a b2 = z2 ? TransitionKt.b(transition, a, "TransformOriginInterruptionHandling", composer, (i & 14) | 448, 0) : null;
        n23 n23Var = new n23() { // from class: t12
            @Override // defpackage.n23
            public final ss2 init() {
                ss2 f;
                f = EnterExitTransitionKt.f(Transition.a.this, aVar2, transition, cVar, eVar, b2);
                return f;
            }
        };
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return n23Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ss2 f(Transition.a aVar, Transition.a aVar2, Transition transition, final c cVar, final e eVar, Transition.a aVar3) {
        final androidx.compose.ui.graphics.e b2;
        final x08 a2 = aVar != null ? aVar.a(new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ph2 invoke(Transition.b bVar) {
                qz7 qz7Var;
                qz7 qz7Var2;
                ph2 b3;
                qz7 qz7Var3;
                ph2 b4;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (bVar.f(enterExitState, enterExitState2)) {
                    fa2 c2 = c.this.b().c();
                    if (c2 != null && (b4 = c2.b()) != null) {
                        return b4;
                    }
                    qz7Var3 = EnterExitTransitionKt.b;
                    return qz7Var3;
                }
                if (!bVar.f(enterExitState2, EnterExitState.PostExit)) {
                    qz7Var = EnterExitTransitionKt.b;
                    return qz7Var;
                }
                fa2 c3 = eVar.b().c();
                if (c3 != null && (b3 = c3.b()) != null) {
                    return b3;
                }
                qz7Var2 = EnterExitTransitionKt.b;
                return qz7Var2;
            }
        }, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$2

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float invoke(EnterExitState enterExitState) {
                int i = a.a[enterExitState.ordinal()];
                float f = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        fa2 c2 = c.this.b().c();
                        if (c2 != null) {
                            f = c2.a();
                        }
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fa2 c3 = eVar.b().c();
                        if (c3 != null) {
                            f = c3.a();
                        }
                    }
                }
                return Float.valueOf(f);
            }
        }) : null;
        final x08 a3 = aVar2 != null ? aVar2.a(new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$scale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ph2 invoke(Transition.b bVar) {
                qz7 qz7Var;
                qz7 qz7Var2;
                ph2 a4;
                qz7 qz7Var3;
                ph2 a5;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (bVar.f(enterExitState, enterExitState2)) {
                    la7 e = c.this.b().e();
                    if (e != null && (a5 = e.a()) != null) {
                        return a5;
                    }
                    qz7Var3 = EnterExitTransitionKt.b;
                    return qz7Var3;
                }
                if (!bVar.f(enterExitState2, EnterExitState.PostExit)) {
                    qz7Var = EnterExitTransitionKt.b;
                    return qz7Var;
                }
                la7 e2 = eVar.b().e();
                if (e2 != null && (a4 = e2.a()) != null) {
                    return a4;
                }
                qz7Var2 = EnterExitTransitionKt.b;
                return qz7Var2;
            }
        }, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$scale$2

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float invoke(EnterExitState enterExitState) {
                int i = a.a[enterExitState.ordinal()];
                float f = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        la7 e = c.this.b().e();
                        if (e != null) {
                            f = e.b();
                        }
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        la7 e2 = eVar.b().e();
                        if (e2 != null) {
                            f = e2.b();
                        }
                    }
                }
                return Float.valueOf(f);
            }
        }) : null;
        if (transition.h() == EnterExitState.PreEnter) {
            la7 e = cVar.b().e();
            if (e != null || (e = eVar.b().e()) != null) {
                b2 = androidx.compose.ui.graphics.e.b(e.c());
            }
            b2 = null;
        } else {
            la7 e2 = eVar.b().e();
            if (e2 != null || (e2 = cVar.b().e()) != null) {
                b2 = androidx.compose.ui.graphics.e.b(e2.c());
            }
            b2 = null;
        }
        final x08 a4 = aVar3 != null ? aVar3.a(new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$transformOrigin$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ph2 invoke(Transition.b bVar) {
                return di.i(0.0f, 0.0f, null, 7, null);
            }
        }, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$transformOrigin$2

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final long b(EnterExitState enterExitState) {
                androidx.compose.ui.graphics.e eVar2;
                long c2;
                long c3;
                int i = a.a[enterExitState.ordinal()];
                if (i != 1) {
                    eVar2 = null;
                    if (i == 2) {
                        la7 e3 = cVar.b().e();
                        if (e3 != null) {
                            c2 = e3.c();
                        } else {
                            la7 e4 = eVar.b().e();
                            if (e4 != null) {
                                c2 = e4.c();
                            }
                        }
                        eVar2 = androidx.compose.ui.graphics.e.b(c2);
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        la7 e5 = eVar.b().e();
                        if (e5 != null) {
                            c3 = e5.c();
                        } else {
                            la7 e6 = cVar.b().e();
                            if (e6 != null) {
                                c3 = e6.c();
                            }
                        }
                        eVar2 = androidx.compose.ui.graphics.e.b(c3);
                    }
                } else {
                    eVar2 = androidx.compose.ui.graphics.e.this;
                }
                return eVar2 != null ? eVar2.j() : androidx.compose.ui.graphics.e.b.a();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return androidx.compose.ui.graphics.e.b(b((EnterExitState) obj));
            }
        }) : null;
        return new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$block$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(androidx.compose.ui.graphics.c cVar2) {
                x08 x08Var = x08.this;
                cVar2.c(x08Var != null ? ((Number) x08Var.getValue()).floatValue() : 1.0f);
                x08 x08Var2 = a3;
                cVar2.n(x08Var2 != null ? ((Number) x08Var2.getValue()).floatValue() : 1.0f);
                x08 x08Var3 = a3;
                cVar2.t(x08Var3 != null ? ((Number) x08Var3.getValue()).floatValue() : 1.0f);
                x08 x08Var4 = a4;
                cVar2.m0(x08Var4 != null ? ((androidx.compose.ui.graphics.e) x08Var4.getValue()).j() : androidx.compose.ui.graphics.e.b.a());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((androidx.compose.ui.graphics.c) obj);
                return ww8.a;
            }
        };
    }

    public static final Modifier g(Transition transition, c cVar, e eVar, String str, Composer composer, int i) {
        int i2;
        Transition.a aVar;
        Transition.a aVar2;
        fj0 a2;
        composer.z(914000546);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(914000546, i, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:855)");
        }
        int i3 = i & 14;
        c J = J(transition, cVar, composer, i & WebSocketProtocol.PAYLOAD_SHORT);
        e M = M(transition, eVar, composer, ((i >> 3) & ContentType.LONG_FORM_ON_DEMAND) | i3);
        boolean z = (J.b().f() == null && M.b().f() == null) ? false : true;
        boolean z2 = (J.b().a() == null && M.b().a() == null) ? false : true;
        composer.z(1657242209);
        Transition.a aVar3 = null;
        if (z) {
            hu8 f = VectorConvertersKt.f(vm3.b);
            composer.z(-492369756);
            Object A = composer.A();
            if (A == Composer.a.a()) {
                A = str + " slide";
                composer.q(A);
            }
            composer.R();
            i2 = -492369756;
            aVar = TransitionKt.b(transition, f, (String) A, composer, i3 | 448, 0);
        } else {
            i2 = -492369756;
            aVar = null;
        }
        composer.R();
        composer.z(1657242379);
        if (z2) {
            hu8 g = VectorConvertersKt.g(hn3.b);
            composer.z(i2);
            Object A2 = composer.A();
            if (A2 == Composer.a.a()) {
                A2 = str + " shrink/expand";
                composer.q(A2);
            }
            composer.R();
            aVar2 = TransitionKt.b(transition, g, (String) A2, composer, i3 | 448, 0);
        } else {
            aVar2 = null;
        }
        composer.R();
        composer.z(1657242547);
        if (z2) {
            hu8 f2 = VectorConvertersKt.f(vm3.b);
            composer.z(i2);
            Object A3 = composer.A();
            if (A3 == Composer.a.a()) {
                A3 = str + " InterruptionHandlingOffset";
                composer.q(A3);
            }
            composer.R();
            aVar3 = TransitionKt.b(transition, f2, (String) A3, composer, i3 | 448, 0);
        }
        composer.R();
        fj0 a3 = J.b().a();
        Modifier h = androidx.compose.ui.graphics.b.c(Modifier.a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, !(((a3 == null || a3.c()) && ((a2 = M.b().a()) == null || a2.c()) && z2) ? false : true), null, 0L, 0L, 0, 126975, null).h(new EnterExitTransitionElement(transition, aVar2, aVar3, aVar, J, M, e(transition, J, M, str, composer, i & 7182)));
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return h;
    }

    public static final c h(ph2 ph2Var, Alignment.b bVar, boolean z, final ss2 ss2Var) {
        return j(ph2Var, H(bVar), z, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            {
                super(1);
            }

            public final long b(long j) {
                return in3.a(((Number) ss2.this.invoke(Integer.valueOf(hn3.g(j)))).intValue(), hn3.f(j));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return hn3.b(b(((hn3) obj).j()));
            }
        });
    }

    public static /* synthetic */ c i(ph2 ph2Var, Alignment.b bVar, boolean z, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ph2Var = di.i(0.0f, 400.0f, hn3.b(ic9.d(hn3.b)), 1, null);
        }
        if ((i & 2) != 0) {
            bVar = Alignment.a.j();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1
                public final Integer b(int i2) {
                    return 0;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return b(((Number) obj2).intValue());
                }
            };
        }
        return h(ph2Var, bVar, z, ss2Var);
    }

    public static final c j(ph2 ph2Var, Alignment alignment, boolean z, ss2 ss2Var) {
        return new d(new lr8(null, null, new fj0(alignment, ss2Var, ph2Var, z), null, false, null, 59, null));
    }

    public static /* synthetic */ c k(ph2 ph2Var, Alignment alignment, boolean z, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ph2Var = di.i(0.0f, 400.0f, hn3.b(ic9.d(hn3.b)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.a.c();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandIn$1
                public final long b(long j) {
                    return in3.a(0, 0);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return hn3.b(b(((hn3) obj2).j()));
                }
            };
        }
        return j(ph2Var, alignment, z, ss2Var);
    }

    public static final c l(ph2 ph2Var, Alignment.c cVar, boolean z, final ss2 ss2Var) {
        return j(ph2Var, I(cVar), z, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            {
                super(1);
            }

            public final long b(long j) {
                return in3.a(hn3.g(j), ((Number) ss2.this.invoke(Integer.valueOf(hn3.f(j)))).intValue());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return hn3.b(b(((hn3) obj).j()));
            }
        });
    }

    public static /* synthetic */ c m(ph2 ph2Var, Alignment.c cVar, boolean z, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ph2Var = di.i(0.0f, 400.0f, hn3.b(ic9.d(hn3.b)), 1, null);
        }
        if ((i & 2) != 0) {
            cVar = Alignment.a.a();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1
                public final Integer b(int i2) {
                    return 0;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return b(((Number) obj2).intValue());
                }
            };
        }
        return l(ph2Var, cVar, z, ss2Var);
    }

    public static final c n(ph2 ph2Var, float f) {
        return new d(new lr8(new fa2(f, ph2Var), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ c o(ph2 ph2Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            ph2Var = di.i(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return n(ph2Var, f);
    }

    public static final e p(ph2 ph2Var, float f) {
        return new f(new lr8(new fa2(f, ph2Var), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ e q(ph2 ph2Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            ph2Var = di.i(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return p(ph2Var, f);
    }

    public static final c r(ph2 ph2Var, float f, long j) {
        return new d(new lr8(null, null, null, new la7(f, j, ph2Var, null), false, null, 55, null));
    }

    public static /* synthetic */ c s(ph2 ph2Var, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            ph2Var = di.i(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = androidx.compose.ui.graphics.e.b.a();
        }
        return r(ph2Var, f, j);
    }

    public static final e t(ph2 ph2Var, Alignment.b bVar, boolean z, final ss2 ss2Var) {
        return v(ph2Var, H(bVar), z, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            {
                super(1);
            }

            public final long b(long j) {
                return in3.a(((Number) ss2.this.invoke(Integer.valueOf(hn3.g(j)))).intValue(), hn3.f(j));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return hn3.b(b(((hn3) obj).j()));
            }
        });
    }

    public static /* synthetic */ e u(ph2 ph2Var, Alignment.b bVar, boolean z, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ph2Var = di.i(0.0f, 400.0f, hn3.b(ic9.d(hn3.b)), 1, null);
        }
        if ((i & 2) != 0) {
            bVar = Alignment.a.j();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1
                public final Integer b(int i2) {
                    return 0;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return b(((Number) obj2).intValue());
                }
            };
        }
        return t(ph2Var, bVar, z, ss2Var);
    }

    public static final e v(ph2 ph2Var, Alignment alignment, boolean z, ss2 ss2Var) {
        return new f(new lr8(null, null, new fj0(alignment, ss2Var, ph2Var, z), null, false, null, 59, null));
    }

    public static /* synthetic */ e w(ph2 ph2Var, Alignment alignment, boolean z, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ph2Var = di.i(0.0f, 400.0f, hn3.b(ic9.d(hn3.b)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.a.c();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1
                public final long b(long j) {
                    return in3.a(0, 0);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return hn3.b(b(((hn3) obj2).j()));
                }
            };
        }
        return v(ph2Var, alignment, z, ss2Var);
    }

    public static final e x(ph2 ph2Var, Alignment.c cVar, boolean z, final ss2 ss2Var) {
        return v(ph2Var, I(cVar), z, new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            {
                super(1);
            }

            public final long b(long j) {
                return in3.a(hn3.g(j), ((Number) ss2.this.invoke(Integer.valueOf(hn3.f(j)))).intValue());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return hn3.b(b(((hn3) obj).j()));
            }
        });
    }

    public static /* synthetic */ e y(ph2 ph2Var, Alignment.c cVar, boolean z, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ph2Var = di.i(0.0f, 400.0f, hn3.b(ic9.d(hn3.b)), 1, null);
        }
        if ((i & 2) != 0) {
            cVar = Alignment.a.a();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1
                public final Integer b(int i2) {
                    return 0;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return b(((Number) obj2).intValue());
                }
            };
        }
        return x(ph2Var, cVar, z, ss2Var);
    }

    public static final c z(ph2 ph2Var, ss2 ss2Var) {
        return new d(new lr8(null, new qu7(ss2Var, ph2Var), null, null, false, null, 61, null));
    }
}
