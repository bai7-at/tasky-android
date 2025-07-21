package kotlinx.coroutines.rx2;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.rx2.DispatcherScheduler;

/* loaded from: classes5.dex */
final class DispatcherScheduler extends Scheduler {
    private static final /* synthetic */ AtomicLongFieldUpdater workerCounter$volatile$FU = AtomicLongFieldUpdater.newUpdater(DispatcherScheduler.class, "workerCounter$volatile");
    public final CoroutineDispatcher dispatcher;
    private final CompletableJob schedulerJob;
    private final CoroutineScope scope;
    private volatile /* synthetic */ long workerCounter$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    static final class DispatcherWorker extends Scheduler.Worker {
        private final Channel<ss2> blockChannel;
        private final long counter;
        private final CoroutineDispatcher dispatcher;
        private final CompletableJob workerJob;
        private final CoroutineScope workerScope;

        @fc1(c = "kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$1", f = "RxScheduler.kt", l = {186, 78}, m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements gt2 {
            Object L$0;
            Object L$1;
            int label;

            AnonymousClass1(by0<? super AnonymousClass1> by0Var) {
                super(2, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0<ww8> create(Object obj, by0<?> by0Var) {
                return DispatcherWorker.this.new AnonymousClass1(by0Var);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x004a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[Catch: all -> 0x001b, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x0016, B:9:0x003e, B:14:0x004e, B:16:0x0056, B:19:0x0069, B:26:0x002d, B:28:0x003a), top: B:2:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x0016, B:9:0x003e, B:14:0x004e, B:16:0x0056, B:19:0x0069, B:26:0x002d, B:28:0x003a), top: B:2:0x0008 }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0066 -> B:8:0x0019). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                    int r1 = r6.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L31
                    if (r1 == r3) goto L25
                    if (r1 != r2) goto L1d
                    java.lang.Object r1 = r6.L$1
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    java.lang.Object r4 = r6.L$0
                    kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
                    kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L1b
                L19:
                    r7 = r1
                    goto L3e
                L1b:
                    r6 = move-exception
                    goto L72
                L1d:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L25:
                    java.lang.Object r1 = r6.L$1
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    java.lang.Object r4 = r6.L$0
                    kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
                    kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L1b
                    goto L4e
                L31:
                    kotlin.f.b(r7)
                    kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker r7 = kotlinx.coroutines.rx2.DispatcherScheduler.DispatcherWorker.this
                    kotlinx.coroutines.channels.Channel r4 = kotlinx.coroutines.rx2.DispatcherScheduler.DispatcherWorker.access$getBlockChannel$p(r7)
                    kotlinx.coroutines.channels.ChannelIterator r7 = r4.iterator()     // Catch: java.lang.Throwable -> L1b
                L3e:
                    r6.L$0 = r4     // Catch: java.lang.Throwable -> L1b
                    r6.L$1 = r7     // Catch: java.lang.Throwable -> L1b
                    r6.label = r3     // Catch: java.lang.Throwable -> L1b
                    java.lang.Object r1 = r7.hasNext(r6)     // Catch: java.lang.Throwable -> L1b
                    if (r1 != r0) goto L4b
                    return r0
                L4b:
                    r5 = r1
                    r1 = r7
                    r7 = r5
                L4e:
                    java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L1b
                    boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L1b
                    if (r7 == 0) goto L69
                    java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L1b
                    ss2 r7 = (defpackage.ss2) r7     // Catch: java.lang.Throwable -> L1b
                    r6.L$0 = r4     // Catch: java.lang.Throwable -> L1b
                    r6.L$1 = r1     // Catch: java.lang.Throwable -> L1b
                    r6.label = r2     // Catch: java.lang.Throwable -> L1b
                    java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L1b
                    if (r7 != r0) goto L19
                    return r0
                L69:
                    ww8 r6 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L1b
                    r6 = 0
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r6)
                    ww8 r6 = defpackage.ww8.a
                    return r6
                L72:
                    throw r6     // Catch: java.lang.Throwable -> L73
                L73:
                    r7 = move-exception
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r6)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.DispatcherScheduler.DispatcherWorker.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // defpackage.gt2
            public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
                return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
            }
        }

        public DispatcherWorker(long j, CoroutineDispatcher coroutineDispatcher, Job job) {
            this.counter = j;
            this.dispatcher = coroutineDispatcher;
            CompletableJob SupervisorJob = SupervisorKt.SupervisorJob(job);
            this.workerJob = SupervisorJob;
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorJob.plus(coroutineDispatcher));
            this.workerScope = CoroutineScope;
            this.blockChannel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SendChannel.DefaultImpls.close$default(this.blockChannel, null, 1, null);
            Job.DefaultImpls.cancel$default((Job) this.workerJob, (CancellationException) null, 1, (Object) null);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return !CoroutineScopeKt.isActive(this.workerScope);
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            Disposable scheduleTask;
            scheduleTask = RxSchedulerKt.scheduleTask(this.workerScope, runnable, timeUnit.toMillis(j), new ss2() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$schedule$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public final Runnable invoke(final ss2 ss2Var) {
                    final DispatcherScheduler.DispatcherWorker dispatcherWorker = DispatcherScheduler.DispatcherWorker.this;
                    return new Runnable() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$schedule$1$invoke$$inlined$Runnable$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            DispatcherScheduler.DispatcherWorker.this.blockChannel.mo129trySendJP2dKIU(ss2Var);
                        }
                    };
                }
            });
            return scheduleTask;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.dispatcher);
            sb.append(" (worker ");
            sb.append(this.counter);
            sb.append(", ");
            sb.append(isDisposed() ? "disposed" : "active");
            sb.append(')');
            return sb.toString();
        }
    }

    public DispatcherScheduler(CoroutineDispatcher coroutineDispatcher) {
        this.dispatcher = coroutineDispatcher;
        CompletableJob SupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        this.schedulerJob = SupervisorJob$default;
        this.scope = CoroutineScopeKt.CoroutineScope(SupervisorJob$default.plus(coroutineDispatcher));
        this.workerCounter$volatile = 1L;
    }

    private final /* synthetic */ long getWorkerCounter$volatile() {
        return this.workerCounter$volatile;
    }

    private final /* synthetic */ void setWorkerCounter$volatile(long j) {
        this.workerCounter$volatile = j;
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.Worker createWorker() {
        return new DispatcherWorker(workerCounter$volatile$FU.getAndIncrement(this), this.dispatcher, this.schedulerJob);
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        Disposable scheduleTask;
        scheduleTask = RxSchedulerKt.scheduleTask(this.scope, runnable, timeUnit.toMillis(j), new ss2() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$scheduleDirect$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final Runnable invoke(final ss2 ss2Var) {
                final DispatcherScheduler dispatcherScheduler = DispatcherScheduler.this;
                return new Runnable() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$scheduleDirect$1$invoke$$inlined$Runnable$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoroutineScope coroutineScope;
                        coroutineScope = DispatcherScheduler.this.scope;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DispatcherScheduler$scheduleDirect$1$1$1(ss2Var, null), 3, null);
                    }
                };
            }
        });
        return scheduleTask;
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        Job.DefaultImpls.cancel$default((Job) this.schedulerJob, (CancellationException) null, 1, (Object) null);
    }

    public String toString() {
        return this.dispatcher.toString();
    }
}
