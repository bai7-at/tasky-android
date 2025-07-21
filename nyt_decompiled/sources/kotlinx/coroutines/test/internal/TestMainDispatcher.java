package kotlinx.coroutines.test.internal;

import defpackage.by0;
import defpackage.v1;
import defpackage.ww8;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.test.TestCoroutineScheduler;
import kotlinx.coroutines.test.TestDispatcher;

/* loaded from: classes5.dex */
public final class TestMainDispatcher extends MainCoroutineDispatcher implements Delay {
    public static final Companion Companion = new Companion(null);
    private NonConcurrentlyModifiable<CoroutineDispatcher> delegate;
    private final CoroutineDispatcher mainDispatcher;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TestDispatcher getCurrentTestDispatcher$kotlinx_coroutines_test() {
            NonConcurrentlyModifiable nonConcurrentlyModifiable;
            MainCoroutineDispatcher main = Dispatchers.getMain();
            TestMainDispatcher testMainDispatcher = main instanceof TestMainDispatcher ? (TestMainDispatcher) main : null;
            CoroutineDispatcher coroutineDispatcher = (testMainDispatcher == null || (nonConcurrentlyModifiable = testMainDispatcher.delegate) == null) ? null : (CoroutineDispatcher) nonConcurrentlyModifiable.getValue();
            if (coroutineDispatcher instanceof TestDispatcher) {
                return (TestDispatcher) coroutineDispatcher;
            }
            return null;
        }

        public final TestCoroutineScheduler getCurrentTestScheduler$kotlinx_coroutines_test() {
            TestDispatcher currentTestDispatcher$kotlinx_coroutines_test = getCurrentTestDispatcher$kotlinx_coroutines_test();
            if (currentTestDispatcher$kotlinx_coroutines_test != null) {
                return currentTestDispatcher$kotlinx_coroutines_test.getScheduler();
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final class NonConcurrentlyModifiable<T> {
        private volatile /* synthetic */ Object _value$volatile;
        private volatile /* synthetic */ Object exceptionWhenReading$volatile;
        private final String name;
        private volatile /* synthetic */ Object reader$volatile;
        private volatile /* synthetic */ int readers$volatile;
        private volatile /* synthetic */ Object writer$volatile;
        private static final /* synthetic */ AtomicReferenceFieldUpdater reader$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(NonConcurrentlyModifiable.class, Object.class, "reader$volatile");
        private static final /* synthetic */ AtomicIntegerFieldUpdater readers$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(NonConcurrentlyModifiable.class, "readers$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater writer$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(NonConcurrentlyModifiable.class, Object.class, "writer$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater exceptionWhenReading$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(NonConcurrentlyModifiable.class, Object.class, "exceptionWhenReading$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater _value$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(NonConcurrentlyModifiable.class, Object.class, "_value$volatile");

        public NonConcurrentlyModifiable(T t, String str) {
            this.name = str;
            this._value$volatile = t;
        }

        private final IllegalStateException concurrentRW(Throwable th) {
            return new IllegalStateException(this.name + " is used concurrently with setting it", th);
        }

        private final IllegalStateException concurrentWW(Throwable th) {
            return new IllegalStateException(this.name + " is modified concurrently", th);
        }

        private final /* synthetic */ Object getExceptionWhenReading$volatile() {
            return this.exceptionWhenReading$volatile;
        }

        private final /* synthetic */ Object getReader$volatile() {
            return this.reader$volatile;
        }

        private final /* synthetic */ int getReaders$volatile() {
            return this.readers$volatile;
        }

        private final /* synthetic */ Object getWriter$volatile() {
            return this.writer$volatile;
        }

        private final /* synthetic */ Object get_value$volatile() {
            return this._value$volatile;
        }

        private final /* synthetic */ void setExceptionWhenReading$volatile(Object obj) {
            this.exceptionWhenReading$volatile = obj;
        }

        private final /* synthetic */ void setReader$volatile(Object obj) {
            this.reader$volatile = obj;
        }

        private final /* synthetic */ void setReaders$volatile(int i) {
            this.readers$volatile = i;
        }

        private final /* synthetic */ void setWriter$volatile(Object obj) {
            this.writer$volatile = obj;
        }

        private final /* synthetic */ void set_value$volatile(Object obj) {
            this._value$volatile = obj;
        }

        public final T getValue() {
            reader$volatile$FU.set(this, new Throwable("reader location"));
            readers$volatile$FU.incrementAndGet(this);
            Throwable th = (Throwable) writer$volatile$FU.get(this);
            if (th != null) {
                exceptionWhenReading$volatile$FU.set(this, concurrentRW(th));
            }
            T t = (T) _value$volatile$FU.get(this);
            readers$volatile$FU.decrementAndGet(this);
            return t;
        }

        public final void setValue(T t) {
            Throwable th;
            Throwable th2;
            Throwable th3 = (Throwable) exceptionWhenReading$volatile$FU.getAndSet(this, null);
            if (th3 != null) {
                throw th3;
            }
            if (readers$volatile$FU.get(this) != 0 && (th2 = (Throwable) reader$volatile$FU.get(this)) != null) {
                throw concurrentRW(th2);
            }
            Throwable th4 = new Throwable("other writer location");
            Throwable th5 = (Throwable) writer$volatile$FU.getAndSet(this, th4);
            if (th5 != null) {
                throw concurrentWW(th5);
            }
            _value$volatile$FU.set(this, t);
            v1.a(writer$volatile$FU, this, th4, null);
            if (readers$volatile$FU.get(this) != 0 && (th = (Throwable) reader$volatile$FU.get(this)) != null) {
                throw concurrentRW(th);
            }
        }
    }

    public TestMainDispatcher(CoroutineDispatcher coroutineDispatcher) {
        this.mainDispatcher = coroutineDispatcher;
        this.delegate = new NonConcurrentlyModifiable<>(coroutineDispatcher, "Dispatchers.Main");
    }

    private final Delay getDelay() {
        CoroutineContext.a value = this.delegate.getValue();
        Delay delay = value instanceof Delay ? (Delay) value : null;
        return delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
    }

    @Override // kotlinx.coroutines.Delay
    public Object delay(long j, by0<? super ww8> by0Var) {
        return Delay.DefaultImpls.delay(this, j, by0Var);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo937dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        this.delegate.getValue().mo937dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        this.delegate.getValue().dispatchYield(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public MainCoroutineDispatcher getImmediate() {
        MainCoroutineDispatcher immediate;
        CoroutineDispatcher value = this.delegate.getValue();
        MainCoroutineDispatcher mainCoroutineDispatcher = value instanceof MainCoroutineDispatcher ? (MainCoroutineDispatcher) value : null;
        return (mainCoroutineDispatcher == null || (immediate = mainCoroutineDispatcher.getImmediate()) == null) ? this : immediate;
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return getDelay().invokeOnTimeout(j, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return this.delegate.getValue().isDispatchNeeded(coroutineContext);
    }

    public final void resetDispatcher() {
        this.delegate.setValue(this.mainDispatcher);
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: scheduleResumeAfterDelay */
    public void mo938scheduleResumeAfterDelay(long j, CancellableContinuation<? super ww8> cancellableContinuation) {
        getDelay().mo938scheduleResumeAfterDelay(j, cancellableContinuation);
    }

    public final void setDispatcher(CoroutineDispatcher coroutineDispatcher) {
        this.delegate.setValue(coroutineDispatcher);
    }
}
