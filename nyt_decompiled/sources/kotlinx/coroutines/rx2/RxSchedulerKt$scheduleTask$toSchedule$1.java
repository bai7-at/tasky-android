package kotlinx.coroutines.rx2;

import defpackage.by0;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.disposables.Disposable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class RxSchedulerKt$scheduleTask$toSchedule$1 extends FunctionReferenceImpl implements ss2 {
    final /* synthetic */ CoroutineContext $ctx;
    final /* synthetic */ Runnable $decoratedBlock;
    final /* synthetic */ Disposable $disposable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RxSchedulerKt$scheduleTask$toSchedule$1(Disposable disposable, CoroutineContext coroutineContext, Runnable runnable) {
        super(1, zq3.a.class, "task", "scheduleTask$task(Lio/reactivex/disposables/Disposable;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.$disposable = disposable;
        this.$ctx = coroutineContext;
        this.$decoratedBlock = runnable;
    }

    @Override // defpackage.ss2
    public final Object invoke(by0<? super ww8> by0Var) {
        Object scheduleTask$task;
        scheduleTask$task = RxSchedulerKt.scheduleTask$task(this.$disposable, this.$ctx, this.$decoratedBlock, by0Var);
        return scheduleTask$task;
    }
}
