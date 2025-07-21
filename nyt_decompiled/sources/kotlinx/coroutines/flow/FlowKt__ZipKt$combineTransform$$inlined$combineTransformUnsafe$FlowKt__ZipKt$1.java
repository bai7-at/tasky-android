package kotlinx.coroutines.flow;

import defpackage.bk3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.kt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.internal.CombineKt;

@fc1(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", f = "Zip.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Flow[] $flows;
    final /* synthetic */ kt2 $transform$inlined;
    private /* synthetic */ Object L$0;
    int label;

    @fc1(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", f = "Zip.kt", l = {329}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements it2 {
        final /* synthetic */ kt2 $transform$inlined;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(by0 by0Var, kt2 kt2Var) {
            super(3, by0Var);
            this.$transform$inlined = kt2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                kt2 kt2Var = this.$transform$inlined;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.label = 1;
                bk3.c(6);
                Object invoke = kt2Var.invoke(flowCollector, obj2, obj3, this);
                bk3.c(7);
                if (invoke == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, by0<? super ww8> by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(by0Var, this.$transform$inlined);
            anonymousClass1.L$0 = flowCollector;
            anonymousClass1.L$1 = objArr;
            return anonymousClass1.invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(Flow[] flowArr, by0 by0Var, kt2 kt2Var) {
        super(2, by0Var);
        this.$flows = flowArr;
        this.$transform$inlined = kt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1 flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1 = new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(this.$flows, by0Var, this.$transform$inlined);
        flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1.L$0 = obj;
        return flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qs2 qs2Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow[] flowArr = this.$flows;
            qs2Var = new qs2() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Void mo865invoke() {
                    return null;
                }
            };
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$transform$inlined);
            this.label = 1;
            if (CombineKt.combineInternal(flowCollector, flowArr, qs2Var, anonymousClass1, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector<? super R> flowCollector, by0<? super ww8> by0Var) {
        return ((FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
