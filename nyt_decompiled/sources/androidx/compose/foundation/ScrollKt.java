package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.by0;
import defpackage.dj7;
import defpackage.ea7;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hm5;
import defpackage.im5;
import defpackage.it2;
import defpackage.jj7;
import defpackage.lh4;
import defpackage.lj7;
import defpackage.ml3;
import defpackage.nc7;
import defpackage.py1;
import defpackage.qk2;
import defpackage.qs2;
import defpackage.rl0;
import defpackage.sc7;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public abstract class ScrollKt {
    public static final Modifier a(Modifier modifier, ScrollState scrollState, boolean z, qk2 qk2Var, boolean z2) {
        return d(modifier, scrollState, z2, qk2Var, z, false);
    }

    public static /* synthetic */ Modifier b(Modifier modifier, ScrollState scrollState, boolean z, qk2 qk2Var, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            qk2Var = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return a(modifier, scrollState, z, qk2Var, z2);
    }

    public static final ScrollState c(final int i, Composer composer, int i2, int i3) {
        composer.z(-1464256199);
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1464256199, i2, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:73)");
        }
        Object[] objArr = new Object[0];
        ea7 a = ScrollState.i.a();
        composer.z(546516376);
        boolean d = composer.d(i);
        Object A = composer.A();
        if (d || A == Composer.a.a()) {
            A = new qs2() { // from class: androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ScrollState mo865invoke() {
                    return new ScrollState(i);
                }
            };
            composer.q(A);
        }
        composer.R();
        ScrollState scrollState = (ScrollState) RememberSaveableKt.b(objArr, a, null, (qs2) A, composer, 72, 4);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return scrollState;
    }

    private static final Modifier d(Modifier modifier, final ScrollState scrollState, final boolean z, final qk2 qk2Var, final boolean z2, final boolean z3) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.a(), new it2() { // from class: androidx.compose.foundation.ScrollKt$scroll$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.z(1478351300);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1478351300, i, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:272)");
                }
                sc7 sc7Var = sc7.a;
                hm5 c = sc7Var.c(composer, 6);
                composer.z(773894976);
                composer.z(-492369756);
                Object A = composer.A();
                if (A == Composer.a.a()) {
                    androidx.compose.runtime.e eVar = new androidx.compose.runtime.e(py1.j(EmptyCoroutineContext.a, composer));
                    composer.q(eVar);
                    A = eVar;
                }
                composer.R();
                final CoroutineScope a = ((androidx.compose.runtime.e) A).a();
                composer.R();
                Modifier.a aVar = Modifier.a;
                final boolean z4 = z;
                final boolean z5 = z3;
                final boolean z6 = z2;
                final ScrollState scrollState2 = scrollState;
                Modifier d = dj7.d(aVar, false, new ss2() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(lj7 lj7Var) {
                        jj7.j0(lj7Var, true);
                        final ScrollState scrollState3 = scrollState2;
                        qs2 qs2Var = new qs2() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final Float mo865invoke() {
                                return Float.valueOf(ScrollState.this.n());
                            }
                        };
                        final ScrollState scrollState4 = scrollState2;
                        nc7 nc7Var = new nc7(qs2Var, new qs2() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final Float mo865invoke() {
                                return Float.valueOf(ScrollState.this.m());
                            }
                        }, z4);
                        if (z5) {
                            jj7.k0(lj7Var, nc7Var);
                        } else {
                            jj7.R(lj7Var, nc7Var);
                        }
                        if (z6) {
                            final CoroutineScope coroutineScope = a;
                            final boolean z7 = z5;
                            final ScrollState scrollState5 = scrollState2;
                            jj7.I(lj7Var, null, new gt2() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1.1

                                @fc1(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", l = {293, 295}, m = "invokeSuspend")
                                /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C00191 extends SuspendLambda implements gt2 {
                                    final /* synthetic */ boolean $isVertical;
                                    final /* synthetic */ ScrollState $state;
                                    final /* synthetic */ float $x;
                                    final /* synthetic */ float $y;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C00191(boolean z, ScrollState scrollState, float f, float f2, by0 by0Var) {
                                        super(2, by0Var);
                                        this.$isVertical = z;
                                        this.$state = scrollState;
                                        this.$y = f;
                                        this.$x = f2;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final by0 create(Object obj, by0 by0Var) {
                                        return new C00191(this.$isVertical, this.$state, this.$y, this.$x, by0Var);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object h = kotlin.coroutines.intrinsics.a.h();
                                        int i = this.label;
                                        if (i == 0) {
                                            kotlin.f.b(obj);
                                            if (this.$isVertical) {
                                                ScrollState scrollState = this.$state;
                                                zq3.f(scrollState, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                                float f = this.$y;
                                                this.label = 1;
                                                if (ScrollExtensionsKt.b(scrollState, f, null, this, 2, null) == h) {
                                                    return h;
                                                }
                                            } else {
                                                ScrollState scrollState2 = this.$state;
                                                zq3.f(scrollState2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                                float f2 = this.$x;
                                                this.label = 2;
                                                if (ScrollExtensionsKt.b(scrollState2, f2, null, this, 2, null) == h) {
                                                    return h;
                                                }
                                            }
                                        } else {
                                            if (i != 1 && i != 2) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.f.b(obj);
                                        }
                                        return ww8.a;
                                    }

                                    @Override // defpackage.gt2
                                    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                                        return ((C00191) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final Boolean b(float f, float f2) {
                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C00191(z7, scrollState5, f2, f, null), 3, null);
                                    return Boolean.TRUE;
                                }

                                @Override // defpackage.gt2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    return b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                                }
                            }, 1, null);
                        }
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((lj7) obj);
                        return ww8.a;
                    }
                }, 1, null);
                Orientation orientation = z3 ? Orientation.Vertical : Orientation.Horizontal;
                Modifier h = im5.a(rl0.a(d, orientation), c).h(ScrollableKt.k(aVar, scrollState, orientation, c, z2, sc7Var.d((LayoutDirection) composer.m(CompositionLocalsKt.j()), orientation, z), qk2Var, scrollState.l(), null, 128, null)).h(new ScrollingLayoutElement(scrollState, z, z3));
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return h;
            }
        });
    }

    public static final Modifier e(Modifier modifier, ScrollState scrollState, boolean z, qk2 qk2Var, boolean z2) {
        return d(modifier, scrollState, z2, qk2Var, z, true);
    }

    public static /* synthetic */ Modifier f(Modifier modifier, ScrollState scrollState, boolean z, qk2 qk2Var, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            qk2Var = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return e(modifier, scrollState, z, qk2Var, z2);
    }
}
