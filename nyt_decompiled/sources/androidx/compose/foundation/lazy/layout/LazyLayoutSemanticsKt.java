package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.by0;
import defpackage.dj7;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hn0;
import defpackage.jj7;
import defpackage.lj7;
import defpackage.nc7;
import defpackage.o04;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.w04;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public abstract class LazyLayoutSemanticsKt {
    public static final Modifier a(Modifier modifier, final qs2 qs2Var, final w04 w04Var, Orientation orientation, boolean z, boolean z2, Composer composer, int i) {
        composer.z(1070136913);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1070136913, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
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
        Object[] objArr = {qs2Var, w04Var, orientation, Boolean.valueOf(z)};
        composer.z(-568225417);
        boolean z3 = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z3 |= composer.S(objArr[i2]);
        }
        Object A2 = composer.A();
        if (z3 || A2 == Composer.a.a()) {
            final boolean z4 = orientation == Orientation.Vertical;
            final ss2 ss2Var = new ss2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Integer invoke(Object obj) {
                    o04 o04Var = (o04) qs2.this.mo865invoke();
                    int a2 = o04Var.a();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= a2) {
                            i3 = -1;
                            break;
                        }
                        if (zq3.c(o04Var.c(i3), obj)) {
                            break;
                        }
                        i3++;
                    }
                    return Integer.valueOf(i3);
                }
            };
            final nc7 nc7Var = new nc7(new qs2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Float mo865invoke() {
                    return Float.valueOf(w04.this.d());
                }
            }, new qs2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Float mo865invoke() {
                    return Float.valueOf(w04.this.h());
                }
            }, z2);
            final gt2 gt2Var = z ? new gt2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1

                @fc1(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1", f = "LazyLayoutSemantics.kt", l = {83}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                    final /* synthetic */ float $delta;
                    final /* synthetic */ w04 $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(w04 w04Var, float f, by0 by0Var) {
                        super(2, by0Var);
                        this.$state = w04Var;
                        this.$delta = f;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        return new AnonymousClass1(this.$state, this.$delta, by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object h = kotlin.coroutines.intrinsics.a.h();
                        int i = this.label;
                        if (i == 0) {
                            kotlin.f.b(obj);
                            w04 w04Var = this.$state;
                            float f = this.$delta;
                            this.label = 1;
                            if (w04Var.g(f, this) == h) {
                                return h;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.f.b(obj);
                        }
                        return ww8.a;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                        return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final Boolean b(float f, float f2) {
                    if (z4) {
                        f = f2;
                    }
                    BuildersKt__Builders_commonKt.launch$default(a, null, null, new AnonymousClass1(w04Var, f, null), 3, null);
                    return Boolean.TRUE;
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                }
            } : null;
            final ss2 ss2Var2 = z ? new ss2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1

                @fc1(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2", f = "LazyLayoutSemantics.kt", l = {100}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements gt2 {
                    final /* synthetic */ int $index;
                    final /* synthetic */ w04 $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(w04 w04Var, int i, by0 by0Var) {
                        super(2, by0Var);
                        this.$state = w04Var;
                        this.$index = i;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        return new AnonymousClass2(this.$state, this.$index, by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object h = kotlin.coroutines.intrinsics.a.h();
                        int i = this.label;
                        if (i == 0) {
                            kotlin.f.b(obj);
                            w04 w04Var = this.$state;
                            int i2 = this.$index;
                            this.label = 1;
                            if (w04Var.f(i2, this) == h) {
                                return h;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.f.b(obj);
                        }
                        return ww8.a;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                        return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final Boolean b(int i3) {
                    o04 o04Var = (o04) qs2.this.mo865invoke();
                    if (i3 >= 0 && i3 < o04Var.a()) {
                        BuildersKt__Builders_commonKt.launch$default(a, null, null, new AnonymousClass2(w04Var, i3, null), 3, null);
                        return Boolean.TRUE;
                    }
                    throw new IllegalArgumentException(("Can't scroll to index " + i3 + ", it is out of bounds [0, " + o04Var.a() + ')').toString());
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).intValue());
                }
            } : null;
            final hn0 e = w04Var.e();
            A2 = dj7.d(Modifier.a, false, new ss2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(lj7 lj7Var) {
                    jj7.j0(lj7Var, true);
                    jj7.s(lj7Var, ss2.this);
                    if (z4) {
                        jj7.k0(lj7Var, nc7Var);
                    } else {
                        jj7.R(lj7Var, nc7Var);
                    }
                    gt2 gt2Var2 = gt2Var;
                    if (gt2Var2 != null) {
                        jj7.I(lj7Var, null, gt2Var2, 1, null);
                    }
                    ss2 ss2Var3 = ss2Var2;
                    if (ss2Var3 != null) {
                        jj7.K(lj7Var, null, ss2Var3, 1, null);
                    }
                    jj7.M(lj7Var, e);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((lj7) obj);
                    return ww8.a;
                }
            }, 1, null);
            composer.q(A2);
        }
        composer.R();
        Modifier h = modifier.h((Modifier) A2);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return h;
    }
}
