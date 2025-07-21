package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.im8;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.time.AbstractLongTimeSource;
import kotlin.time.DurationUnit;
import kotlin.time.b;
import kotlin.time.c;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.selects.SelectClause1;

/* loaded from: classes5.dex */
public final class TestCoroutineScheduler extends kotlin.coroutines.a implements CoroutineContext.a {
    public static final Key Key = new Key(null);
    private static final /* synthetic */ AtomicLongFieldUpdater count$volatile$FU = AtomicLongFieldUpdater.newUpdater(TestCoroutineScheduler.class, "count$volatile");
    private volatile /* synthetic */ long count$volatile;
    private long currentTime;
    private final Channel<ww8> dispatchEvents;
    private final Channel<ww8> dispatchEventsForeground;
    private final ThreadSafeHeap<TestDispatchEvent<Object>> events;
    private final Object lock;
    private final im8 timeSource;

    public static final class Key implements CoroutineContext.b {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Key() {
        }
    }

    public TestCoroutineScheduler() {
        super(Key);
        this.events = new ThreadSafeHeap<>();
        this.lock = new Object();
        this.dispatchEventsForeground = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.dispatchEvents = ChannelKt.Channel$default(-1, null, null, 6, null);
        final DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        this.timeSource = new AbstractLongTimeSource(durationUnit) { // from class: kotlinx.coroutines.test.TestCoroutineScheduler$timeSource$1
            @Override // kotlin.time.AbstractLongTimeSource
            protected long read() {
                return TestCoroutineScheduler.this.getCurrentTime();
            }
        };
    }

    private final /* synthetic */ long getCount$volatile() {
        return this.count$volatile;
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void getCurrentTime$annotations() {
    }

    public static /* synthetic */ void getTimeSource$annotations() {
    }

    public static /* synthetic */ boolean isIdle$kotlinx_coroutines_test$default(TestCoroutineScheduler testCoroutineScheduler, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return testCoroutineScheduler.isIdle$kotlinx_coroutines_test(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerEvent$lambda$4$lambda$3(TestCoroutineScheduler testCoroutineScheduler, TestDispatchEvent testDispatchEvent) {
        synchronized (testCoroutineScheduler.lock) {
            testCoroutineScheduler.events.remove(testDispatchEvent);
            ww8 ww8Var = ww8.a;
        }
    }

    private final /* synthetic */ void setCount$volatile(long j) {
        this.count$volatile = j;
    }

    @ExperimentalCoroutinesApi
    public final void advanceTimeBy(long j) {
        b.a aVar = b.b;
        m968advanceTimeByLRDsOJo(c.t(j, DurationUnit.MILLISECONDS));
    }

    /* renamed from: advanceTimeBy-LRDsOJo, reason: not valid java name */
    public final void m968advanceTimeByLRDsOJo(long j) {
        long addClamping;
        TestDispatchEvent<Object> testDispatchEvent;
        TestDispatchEvent<Object> testDispatchEvent2;
        if (b.F(j)) {
            throw new IllegalArgumentException(("Can not advance time by a negative delay: " + ((Object) b.L(j))).toString());
        }
        addClamping = TestCoroutineSchedulerKt.addClamping(getCurrentTime(), b.s(j));
        while (true) {
            synchronized (this.lock) {
                long currentTime = getCurrentTime();
                ThreadSafeHeap<TestDispatchEvent<Object>> threadSafeHeap = this.events;
                synchronized (threadSafeHeap) {
                    TestDispatchEvent<Object> firstImpl = threadSafeHeap.firstImpl();
                    if (firstImpl != null) {
                        testDispatchEvent = addClamping > firstImpl.time ? threadSafeHeap.removeAtImpl(0) : null;
                    }
                }
                testDispatchEvent2 = testDispatchEvent;
                if (testDispatchEvent2 == null) {
                    this.currentTime = addClamping;
                    return;
                }
                long j2 = testDispatchEvent2.time;
                if (currentTime > j2) {
                    TestCoroutineSchedulerKt.currentTimeAheadOfEvents();
                    throw new KotlinNothingValueException();
                }
                this.currentTime = j2;
            }
            testDispatchEvent2.dispatcher.processEvent$kotlinx_coroutines_test(testDispatchEvent2.marker);
        }
    }

    public final void advanceUntilIdle() {
        advanceUntilIdleOr$kotlinx_coroutines_test(new qs2() { // from class: kotlinx.coroutines.test.TestCoroutineScheduler$advanceUntilIdle$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                ThreadSafeHeap threadSafeHeap;
                boolean none;
                threadSafeHeap = TestCoroutineScheduler.this.events;
                none = TestCoroutineSchedulerKt.none(threadSafeHeap, new PropertyReference1Impl() { // from class: kotlinx.coroutines.test.TestCoroutineScheduler$advanceUntilIdle$1.1
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.kv3
                    public Object get(Object obj) {
                        return Boolean.valueOf(((TestDispatchEvent) obj).isForeground);
                    }
                });
                return Boolean.valueOf(none);
            }
        });
    }

    public final void advanceUntilIdleOr$kotlinx_coroutines_test(qs2 qs2Var) {
        while (tryRunNextTaskUnless$kotlinx_coroutines_test(qs2Var)) {
        }
    }

    public final long getCurrentTime() {
        long j;
        synchronized (this.lock) {
            j = this.currentTime;
        }
        return j;
    }

    public final SelectClause1<ww8> getOnDispatchEvent$kotlinx_coroutines_test() {
        return this.dispatchEvents.getOnReceive();
    }

    public final SelectClause1<ww8> getOnDispatchEventForeground$kotlinx_coroutines_test() {
        return this.dispatchEventsForeground.getOnReceive();
    }

    public final im8 getTimeSource() {
        return this.timeSource;
    }

    public final boolean isIdle$kotlinx_coroutines_test(boolean z) {
        boolean isEmpty;
        synchronized (this.lock) {
            try {
                isEmpty = z ? this.events.isEmpty() : TestCoroutineSchedulerKt.none(this.events, new ss2() { // from class: kotlinx.coroutines.test.TestCoroutineScheduler$isIdle$1$1
                    @Override // defpackage.ss2
                    public final Boolean invoke(TestDispatchEvent<Object> testDispatchEvent) {
                        return Boolean.valueOf(!((Boolean) testDispatchEvent.isCancelled.mo865invoke()).booleanValue());
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
        return isEmpty;
    }

    public final Object receiveDispatchEvent$kotlinx_coroutines_test(by0<? super ww8> by0Var) {
        Object receive = this.dispatchEvents.receive(by0Var);
        return receive == kotlin.coroutines.intrinsics.a.h() ? receive : ww8.a;
    }

    public final <T> DisposableHandle registerEvent$kotlinx_coroutines_test(TestDispatcher testDispatcher, long j, final T t, CoroutineContext coroutineContext, final ss2 ss2Var) {
        long addClamping;
        DisposableHandle disposableHandle;
        if (j < 0) {
            throw new IllegalArgumentException(("Attempted scheduling an event earlier in time (with the time delta " + j + ')').toString());
        }
        TestCoroutineSchedulerKt.checkSchedulerInContext(this, coroutineContext);
        long andIncrement = count$volatile$FU.getAndIncrement(this);
        boolean z = coroutineContext.get(BackgroundWork.INSTANCE) == null;
        synchronized (this.lock) {
            addClamping = TestCoroutineSchedulerKt.addClamping(getCurrentTime(), j);
            zq3.f(t, "null cannot be cast to non-null type kotlin.Any");
            final TestDispatchEvent<Object> testDispatchEvent = new TestDispatchEvent<>(testDispatcher, andIncrement, addClamping, t, z, new qs2() { // from class: kotlinx.coroutines.test.TestCoroutineScheduler$registerEvent$2$event$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    return (Boolean) ss2.this.invoke(t);
                }
            });
            this.events.addLast(testDispatchEvent);
            sendDispatchEvent$kotlinx_coroutines_test(coroutineContext);
            disposableHandle = new DisposableHandle() { // from class: kotlinx.coroutines.test.a
                @Override // kotlinx.coroutines.DisposableHandle
                public final void dispose() {
                    TestCoroutineScheduler.registerEvent$lambda$4$lambda$3(TestCoroutineScheduler.this, testDispatchEvent);
                }
            };
        }
        return disposableHandle;
    }

    public final void runCurrent() {
        long currentTime;
        TestDispatchEvent<Object> testDispatchEvent;
        TestDispatchEvent<Object> testDispatchEvent2;
        synchronized (this.lock) {
            currentTime = getCurrentTime();
        }
        while (true) {
            synchronized (this.lock) {
                ThreadSafeHeap<TestDispatchEvent<Object>> threadSafeHeap = this.events;
                synchronized (threadSafeHeap) {
                    TestDispatchEvent<Object> firstImpl = threadSafeHeap.firstImpl();
                    if (firstImpl != null) {
                        testDispatchEvent = firstImpl.time <= currentTime ? threadSafeHeap.removeAtImpl(0) : null;
                    }
                }
                testDispatchEvent2 = testDispatchEvent;
                if (testDispatchEvent2 == null) {
                    return;
                }
            }
            testDispatchEvent2.dispatcher.processEvent$kotlinx_coroutines_test(testDispatchEvent2.marker);
        }
    }

    public final void sendDispatchEvent$kotlinx_coroutines_test(CoroutineContext coroutineContext) {
        Channel<ww8> channel = this.dispatchEvents;
        ww8 ww8Var = ww8.a;
        channel.mo129trySendJP2dKIU(ww8Var);
        BackgroundWork backgroundWork = BackgroundWork.INSTANCE;
        if (coroutineContext.get(backgroundWork) != backgroundWork) {
            this.dispatchEventsForeground.mo129trySendJP2dKIU(ww8Var);
        }
    }

    public final boolean tryRunNextTaskUnless$kotlinx_coroutines_test(qs2 qs2Var) {
        synchronized (this.lock) {
            if (((Boolean) qs2Var.mo865invoke()).booleanValue()) {
                return false;
            }
            TestDispatchEvent<Object> removeFirstOrNull = this.events.removeFirstOrNull();
            if (removeFirstOrNull == null) {
                return false;
            }
            long currentTime = getCurrentTime();
            long j = removeFirstOrNull.time;
            if (currentTime > j) {
                TestCoroutineSchedulerKt.currentTimeAheadOfEvents();
                throw new KotlinNothingValueException();
            }
            this.currentTime = j;
            removeFirstOrNull.dispatcher.processEvent$kotlinx_coroutines_test(removeFirstOrNull.marker);
            return true;
        }
    }
}
