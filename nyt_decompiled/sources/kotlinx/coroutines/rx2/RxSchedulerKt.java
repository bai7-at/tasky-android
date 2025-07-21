package kotlinx.coroutines.rx2;

import defpackage.ss2;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.plugins.RxJavaPlugins;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.rx2.RxSchedulerKt;

/* loaded from: classes5.dex */
public final class RxSchedulerKt {
    public static final CoroutineDispatcher asCoroutineDispatcher(Scheduler scheduler) {
        return scheduler instanceof DispatcherScheduler ? ((DispatcherScheduler) scheduler).dispatcher : new SchedulerCoroutineDispatcher(scheduler);
    }

    public static final Scheduler asScheduler(CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher instanceof SchedulerCoroutineDispatcher ? ((SchedulerCoroutineDispatcher) coroutineDispatcher).getScheduler() : new DispatcherScheduler(coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, kotlinx.coroutines.DisposableHandle] */
    public static final Disposable scheduleTask(CoroutineScope coroutineScope, Runnable runnable, long j, ss2 ss2Var) {
        CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Disposable fromRunnable = Disposables.fromRunnable(new Runnable() { // from class: a57
            @Override // java.lang.Runnable
            public final void run() {
                RxSchedulerKt.scheduleTask$lambda$0(Ref$ObjectRef.this);
            }
        });
        Runnable runnable2 = (Runnable) ss2Var.invoke(new RxSchedulerKt$scheduleTask$toSchedule$1(fromRunnable, coroutineContext, RxJavaPlugins.onSchedule(runnable)));
        if (!CoroutineScopeKt.isActive(coroutineScope)) {
            return Disposables.disposed();
        }
        if (j <= 0) {
            runnable2.run();
        } else {
            ref$ObjectRef.element = DelayKt.getDelay(coroutineContext).invokeOnTimeout(j, runnable2, coroutineContext);
        }
        return fromRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleTask$lambda$0(Ref$ObjectRef ref$ObjectRef) {
        DisposableHandle disposableHandle = (DisposableHandle) ref$ObjectRef.element;
        if (disposableHandle != null) {
            disposableHandle.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(2:19|(2:21|22)(2:23|(1:25)))|12|13|14))|28|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        kotlinx.coroutines.rx2.RxCancellableKt.handleUndeliverableException(r4, r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object scheduleTask$task(io.reactivex.disposables.Disposable r4, kotlin.coroutines.CoroutineContext r5, final java.lang.Runnable r6, defpackage.by0<? super defpackage.ww8> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1 r0 = (kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1 r0 = new kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.L$0
            r5 = r4
            kotlin.coroutines.CoroutineContext r5 = (kotlin.coroutines.CoroutineContext) r5
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L58
        L2e:
            r4 = move-exception
            goto L55
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.f.b(r7)
            boolean r4 = r4.isDisposed()
            if (r4 == 0) goto L44
            ww8 r4 = defpackage.ww8.a
            return r4
        L44:
            kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$2 r4 = new kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$2     // Catch: java.lang.Throwable -> L2e
            r4.<init>()     // Catch: java.lang.Throwable -> L2e
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L2e
            r0.label = r3     // Catch: java.lang.Throwable -> L2e
            r6 = 0
            java.lang.Object r4 = kotlinx.coroutines.InterruptibleKt.runInterruptible$default(r6, r4, r0, r3, r6)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L58
            return r1
        L55:
            kotlinx.coroutines.rx2.RxCancellableKt.handleUndeliverableException(r4, r5)
        L58:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxSchedulerKt.scheduleTask$task(io.reactivex.disposables.Disposable, kotlin.coroutines.CoroutineContext, java.lang.Runnable, by0):java.lang.Object");
    }

    /* renamed from: asCoroutineDispatcher, reason: collision with other method in class */
    public static final /* synthetic */ SchedulerCoroutineDispatcher m953asCoroutineDispatcher(Scheduler scheduler) {
        return new SchedulerCoroutineDispatcher(scheduler);
    }
}
