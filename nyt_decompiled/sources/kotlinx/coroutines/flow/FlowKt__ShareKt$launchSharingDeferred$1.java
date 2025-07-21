package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

@fc1(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {336}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ CompletableDeferred<StateFlow<T>> $result;
    final /* synthetic */ Flow<T> $upstream;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ShareKt$launchSharingDeferred$1(Flow<? extends T> flow, CompletableDeferred<StateFlow<T>> completableDeferred, by0<? super FlowKt__ShareKt$launchSharingDeferred$1> by0Var) {
        super(2, by0Var);
        this.$upstream = flow;
        this.$result = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, by0Var);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, ww8] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Flow<T> flow = this.$upstream;
                final CompletableDeferred<StateFlow<T>> completableDeferred = this.$result;
                FlowCollector flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1.1
                    /* JADX WARN: Type inference failed for: r3v1, types: [T, kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow] */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(T t, by0<? super ww8> by0Var) {
                        ww8 ww8Var;
                        MutableStateFlow<T> mutableStateFlow = ref$ObjectRef.element;
                        if (mutableStateFlow != null) {
                            mutableStateFlow.setValue(t);
                            ww8Var = ww8.a;
                        } else {
                            ww8Var = null;
                        }
                        if (ww8Var == null) {
                            CoroutineScope coroutineScope2 = coroutineScope;
                            Ref$ObjectRef<MutableStateFlow<T>> ref$ObjectRef2 = ref$ObjectRef;
                            CompletableDeferred<StateFlow<T>> completableDeferred2 = completableDeferred;
                            ?? r3 = (T) StateFlowKt.MutableStateFlow(t);
                            completableDeferred2.complete(new ReadonlyStateFlow(r3, JobKt.getJob(coroutineScope2.getCoroutineContext())));
                            ref$ObjectRef2.element = r3;
                        }
                        return ww8.a;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            this = ww8.a;
            return this;
        } catch (Throwable th) {
            this.$result.completeExceptionally(th);
            throw th;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
