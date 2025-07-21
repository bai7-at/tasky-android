package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.y;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fd5;
import defpackage.gt2;
import defpackage.hd5;
import defpackage.qs2;
import defpackage.qz7;
import defpackage.ww8;
import defpackage.x08;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Animatable $animatable;
    final /* synthetic */ x08 $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(x08 x08Var, Animatable animatable, by0 by0Var) {
        super(2, by0Var);
        this.$targetValue$delegate = x08Var;
        this.$animatable = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(this.$targetValue$delegate, this.$animatable, by0Var);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            final x08 x08Var = this.$targetValue$delegate;
            Flow p = y.p(new qs2() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1.1
                {
                    super(0);
                }

                public final long b() {
                    return SelectionMagnifierKt.i(x08.this);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    return fd5.d(b());
                }
            });
            final Animatable animatable = this.$animatable;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1.2

                @fc1(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$1", f = "SelectionMagnifier.kt", l = {100}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                    final /* synthetic */ Animatable $animatable;
                    final /* synthetic */ long $targetValue;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Animatable animatable, long j, by0 by0Var) {
                        super(2, by0Var);
                        this.$animatable = animatable;
                        this.$targetValue = j;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        return new AnonymousClass1(this.$animatable, this.$targetValue, by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object h = kotlin.coroutines.intrinsics.a.h();
                        int i = this.label;
                        if (i == 0) {
                            kotlin.f.b(obj);
                            Animatable animatable = this.$animatable;
                            fd5 d = fd5.d(this.$targetValue);
                            qz7 e = SelectionMagnifierKt.e();
                            this.label = 1;
                            if (Animatable.f(animatable, d, e, null, null, this, 12, null) == h) {
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

                public final Object a(long j, by0 by0Var) {
                    if (hd5.c(((fd5) Animatable.this.m()).x()) && hd5.c(j) && fd5.p(((fd5) Animatable.this.m()).x()) != fd5.p(j)) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(Animatable.this, j, null), 3, null);
                        return ww8.a;
                    }
                    Object t = Animatable.this.t(fd5.d(j), by0Var);
                    return t == kotlin.coroutines.intrinsics.a.h() ? t : ww8.a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, by0 by0Var) {
                    return a(((fd5) obj2).x(), by0Var);
                }
            };
            this.label = 1;
            if (p.collect(flowCollector, this) == h) {
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
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
