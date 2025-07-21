package kotlinx.coroutines.flow;

import defpackage.bk3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.internal.CombineKt;

@fc1(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FlowKt__ZipKt$combineTransformUnsafe$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Flow<T>[] $flows;
    final /* synthetic */ it2 $transform;
    private /* synthetic */ Object L$0;
    int label;

    @fc1(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", l = {269}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements it2 {
        final /* synthetic */ it2 $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(it2 it2Var, by0<? super AnonymousClass1> by0Var) {
            super(3, by0Var);
            this.$transform = it2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                it2 it2Var = this.$transform;
                this.L$0 = null;
                this.label = 1;
                if (it2Var.invoke(flowCollector, objArr, this) == h) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            this.$transform.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this);
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, by0<? super ww8> by0Var) {
            zq3.m();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, by0Var);
            anonymousClass1.L$0 = flowCollector;
            anonymousClass1.L$1 = tArr;
            return anonymousClass1.invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransformUnsafe$1(Flow<? extends T>[] flowArr, it2 it2Var, by0<? super FlowKt__ZipKt$combineTransformUnsafe$1> by0Var) {
        super(2, by0Var);
        this.$flows = flowArr;
        this.$transform = it2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        FlowKt__ZipKt$combineTransformUnsafe$1 flowKt__ZipKt$combineTransformUnsafe$1 = new FlowKt__ZipKt$combineTransformUnsafe$1(this.$flows, this.$transform, by0Var);
        flowKt__ZipKt$combineTransformUnsafe$1.L$0 = obj;
        return flowKt__ZipKt$combineTransformUnsafe$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qs2 qs2Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<T>[] flowArr = this.$flows;
            qs2Var = new qs2() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Void mo865invoke() {
                    return null;
                }
            };
            zq3.m();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, null);
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

    public final Object invokeSuspend$$forInline(Object obj) {
        qs2 qs2Var;
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        Flow<T>[] flowArr = this.$flows;
        qs2Var = new qs2() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Void mo865invoke() {
                return null;
            }
        };
        zq3.m();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, null);
        bk3.c(0);
        CombineKt.combineInternal(flowCollector, flowArr, qs2Var, anonymousClass1, this);
        bk3.c(1);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector<? super R> flowCollector, by0<? super ww8> by0Var) {
        return ((FlowKt__ZipKt$combineTransformUnsafe$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
