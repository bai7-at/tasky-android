package androidx.compose.material;

import defpackage.bo3;
import defpackage.by0;
import defpackage.d26;
import defpackage.e26;
import defpackage.eo3;
import defpackage.f26;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ka3;
import defpackage.la3;
import defpackage.sl2;
import defpackage.tl2;
import defpackage.ww8;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2", f = "FloatingActionButton.kt", l = {291}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DefaultFloatingActionButtonElevation$elevation$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
    final /* synthetic */ eo3 $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFloatingActionButtonElevation$elevation$2(eo3 eo3Var, FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, by0 by0Var) {
        super(2, by0Var);
        this.$interactionSource = eo3Var;
        this.$animatable = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DefaultFloatingActionButtonElevation$elevation$2 defaultFloatingActionButtonElevation$elevation$2 = new DefaultFloatingActionButtonElevation$elevation$2(this.$interactionSource, this.$animatable, by0Var);
        defaultFloatingActionButtonElevation$elevation$2.L$0 = obj;
        return defaultFloatingActionButtonElevation$elevation$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            final ArrayList arrayList = new ArrayList();
            Flow b = this.$interactionSource.b();
            final FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2.1

                @fc1(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1", f = "FloatingActionButton.kt", l = {317}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00441 extends SuspendLambda implements gt2 {
                    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
                    final /* synthetic */ bo3 $targetInteraction;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00441(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, bo3 bo3Var, by0 by0Var) {
                        super(2, by0Var);
                        this.$animatable = floatingActionButtonElevationAnimatable;
                        this.$targetInteraction = bo3Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        return new C00441(this.$animatable, this.$targetInteraction, by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object h = kotlin.coroutines.intrinsics.a.h();
                        int i = this.label;
                        if (i == 0) {
                            kotlin.f.b(obj);
                            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
                            bo3 bo3Var = this.$targetInteraction;
                            this.label = 1;
                            if (floatingActionButtonElevationAnimatable.b(bo3Var, this) == h) {
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
                        return ((C00441) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(bo3 bo3Var, by0 by0Var) {
                    if (bo3Var instanceof ka3) {
                        arrayList.add(bo3Var);
                    } else if (bo3Var instanceof la3) {
                        arrayList.remove(((la3) bo3Var).a());
                    } else if (bo3Var instanceof sl2) {
                        arrayList.add(bo3Var);
                    } else if (bo3Var instanceof tl2) {
                        arrayList.remove(((tl2) bo3Var).a());
                    } else if (bo3Var instanceof e26) {
                        arrayList.add(bo3Var);
                    } else if (bo3Var instanceof f26) {
                        arrayList.remove(((f26) bo3Var).a());
                    } else if (bo3Var instanceof d26) {
                        arrayList.remove(((d26) bo3Var).a());
                    }
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C00441(floatingActionButtonElevationAnimatable, (bo3) kotlin.collections.i.y0(arrayList), null), 3, null);
                    return ww8.a;
                }
            };
            this.label = 1;
            if (b.collect(flowCollector, this) == h) {
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
        return ((DefaultFloatingActionButtonElevation$elevation$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
