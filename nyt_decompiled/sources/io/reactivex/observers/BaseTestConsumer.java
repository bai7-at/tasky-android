package io.reactivex.observers;

import com.amazonaws.services.s3.internal.Constants;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import io.reactivex.Notification;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.VolatileSizeArrayList;
import io.reactivex.observers.BaseTestConsumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> implements Disposable {
    protected boolean checkSubscriptionOnce;
    protected long completions;
    protected int establishedFusionMode;
    protected int initialFusionMode;
    protected Thread lastThread;
    protected CharSequence tag;
    protected boolean timeout;
    protected final List<T> values = new VolatileSizeArrayList();
    protected final List<Throwable> errors = new VolatileSizeArrayList();
    protected final CountDownLatch done = new CountDownLatch(1);

    public enum TestWaitStrategy implements Runnable {
        SPIN { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.1
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
            }
        },
        YIELD { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.2
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                Thread.yield();
            }
        },
        SLEEP_1MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.3
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(1);
            }
        },
        SLEEP_10MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.4
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(10);
            }
        },
        SLEEP_100MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.5
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(100);
            }
        },
        SLEEP_1000MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.6
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
            }
        };

        static void sleep(int i) {
            try {
                Thread.sleep(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // java.lang.Runnable
        public abstract void run();
    }

    public static String valueAndClass(Object obj) {
        if (obj == null) {
            return Constants.NULL_VERSION_ID;
        }
        return obj + " (class: " + obj.getClass().getSimpleName() + ")";
    }

    public final U assertComplete() {
        long j = this.completions;
        if (j == 0) {
            throw fail("Not completed");
        }
        if (j <= 1) {
            return this;
        }
        throw fail("Multiple completions: " + j);
    }

    public final U assertEmpty() {
        return (U) assertSubscribed().assertNoValues().assertNoErrors().assertNotComplete();
    }

    public final U assertError(Throwable th) {
        return assertError(Functions.equalsWith(th));
    }

    public final U assertErrorMessage(String str) {
        int size = this.errors.size();
        if (size == 0) {
            throw fail("No errors");
        }
        if (size != 1) {
            throw fail("Multiple errors");
        }
        String message = this.errors.get(0).getMessage();
        if (ObjectHelper.equals(str, message)) {
            return this;
        }
        throw fail("Error message differs; exptected: " + str + " but was: " + message);
    }

    public final U assertFailure(Class<? extends Throwable> cls, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertNotComplete();
    }

    public final U assertFailureAndMessage(Class<? extends Throwable> cls, String str, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertErrorMessage(str).assertNotComplete();
    }

    public final U assertNever(T t) {
        int size = this.values.size();
        for (int i = 0; i < size; i++) {
            if (ObjectHelper.equals(this.values.get(i), t)) {
                throw fail("Value at position " + i + " is equal to " + valueAndClass(t) + "; Expected them to be different");
            }
        }
        return this;
    }

    public final U assertNoErrors() {
        if (this.errors.size() == 0) {
            return this;
        }
        throw fail("Error(s) present: " + this.errors);
    }

    public final U assertNoTimeout() {
        if (this.timeout) {
            throw fail("Timeout?!");
        }
        return this;
    }

    public final U assertNoValues() {
        return assertValueCount(0);
    }

    public final U assertNotComplete() {
        long j = this.completions;
        if (j == 1) {
            throw fail("Completed!");
        }
        if (j <= 1) {
            return this;
        }
        throw fail("Multiple completions: " + j);
    }

    public abstract U assertNotSubscribed();

    public final U assertNotTerminated() {
        if (this.done.getCount() != 0) {
            return this;
        }
        throw fail("Subscriber terminated!");
    }

    public final U assertResult(T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertComplete();
    }

    public abstract U assertSubscribed();

    public final U assertTerminated() {
        if (this.done.getCount() != 0) {
            throw fail("Subscriber still running!");
        }
        long j = this.completions;
        if (j > 1) {
            throw fail("Terminated with multiple completions: " + j);
        }
        int size = this.errors.size();
        if (size > 1) {
            throw fail("Terminated with multiple errors: " + size);
        }
        if (j == 0 || size == 0) {
            return this;
        }
        throw fail("Terminated with multiple completions and errors: " + j);
    }

    public final U assertTimeout() {
        if (this.timeout) {
            return this;
        }
        throw fail("No timeout?!");
    }

    public final U assertValue(T t) {
        if (this.values.size() != 1) {
            throw fail("expected: " + valueAndClass(t) + " but was: " + this.values);
        }
        T t2 = this.values.get(0);
        if (ObjectHelper.equals(t, t2)) {
            return this;
        }
        throw fail("expected: " + valueAndClass(t) + " but was: " + valueAndClass(t2));
    }

    public final U assertValueAt(int i, T t) {
        int size = this.values.size();
        if (size == 0) {
            throw fail("No values");
        }
        if (i >= size) {
            throw fail("Invalid index: " + i);
        }
        T t2 = this.values.get(i);
        if (ObjectHelper.equals(t, t2)) {
            return this;
        }
        throw fail("expected: " + valueAndClass(t) + " but was: " + valueAndClass(t2));
    }

    public final U assertValueCount(int i) {
        int size = this.values.size();
        if (size == i) {
            return this;
        }
        throw fail("Value counts differ; expected: " + i + " but was: " + size);
    }

    public final U assertValueSequence(Iterable<? extends T> iterable) {
        boolean hasNext;
        boolean hasNext2;
        Iterator<T> it2 = this.values.iterator();
        Iterator<? extends T> it3 = iterable.iterator();
        int i = 0;
        while (true) {
            hasNext = it3.hasNext();
            hasNext2 = it2.hasNext();
            if (!hasNext2 || !hasNext) {
                break;
            }
            T next = it3.next();
            T next2 = it2.next();
            if (!ObjectHelper.equals(next, next2)) {
                throw fail("Values at position " + i + " differ; expected: " + valueAndClass(next) + " but was: " + valueAndClass(next2));
            }
            i++;
        }
        if (hasNext2) {
            throw fail("More values received than expected (" + i + ")");
        }
        if (!hasNext) {
            return this;
        }
        throw fail("Fewer values received than expected (" + i + ")");
    }

    public final U assertValueSequenceOnly(Iterable<? extends T> iterable) {
        return (U) assertSubscribed().assertValueSequence(iterable).assertNoErrors().assertNotComplete();
    }

    public final U assertValueSet(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            assertNoValues();
            return this;
        }
        for (T t : this.values) {
            if (!collection.contains(t)) {
                throw fail("Value not in the expected collection: " + valueAndClass(t));
            }
        }
        return this;
    }

    public final U assertValueSetOnly(Collection<? extends T> collection) {
        return (U) assertSubscribed().assertValueSet(collection).assertNoErrors().assertNotComplete();
    }

    public final U assertValues(T... tArr) {
        int size = this.values.size();
        if (size != tArr.length) {
            throw fail("Value count differs; expected: " + tArr.length + " " + Arrays.toString(tArr) + " but was: " + size + " " + this.values);
        }
        for (int i = 0; i < size; i++) {
            T t = this.values.get(i);
            T t2 = tArr[i];
            if (!ObjectHelper.equals(t2, t)) {
                throw fail("Values at position " + i + " differ; expected: " + valueAndClass(t2) + " but was: " + valueAndClass(t));
            }
        }
        return this;
    }

    public final U assertValuesOnly(T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertNotComplete();
    }

    public final U await() throws InterruptedException {
        if (this.done.getCount() == 0) {
            return this;
        }
        this.done.await();
        return this;
    }

    public final U awaitCount(int i) {
        return awaitCount(i, TestWaitStrategy.SLEEP_10MS, BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT);
    }

    public final U awaitDone(long j, TimeUnit timeUnit) {
        try {
            if (!this.done.await(j, timeUnit)) {
                this.timeout = true;
                dispose();
            }
            return this;
        } catch (InterruptedException e) {
            dispose();
            throw ExceptionHelper.wrapOrThrow(e);
        }
    }

    public final boolean awaitTerminalEvent() {
        try {
            await();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final U clearTimeout() {
        this.timeout = false;
        return this;
    }

    public final long completions() {
        return this.completions;
    }

    public final int errorCount() {
        return this.errors.size();
    }

    public final List<Throwable> errors() {
        return this.errors;
    }

    protected final AssertionError fail(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 64);
        sb.append(str);
        sb.append(" (");
        sb.append("latch = ");
        sb.append(this.done.getCount());
        sb.append(", ");
        sb.append("values = ");
        sb.append(this.values.size());
        sb.append(", ");
        sb.append("errors = ");
        sb.append(this.errors.size());
        sb.append(", ");
        sb.append("completions = ");
        sb.append(this.completions);
        if (this.timeout) {
            sb.append(", timeout!");
        }
        if (isDisposed()) {
            sb.append(", disposed!");
        }
        CharSequence charSequence = this.tag;
        if (charSequence != null) {
            sb.append(", tag = ");
            sb.append(charSequence);
        }
        sb.append(')');
        AssertionError assertionError = new AssertionError(sb.toString());
        if (!this.errors.isEmpty()) {
            if (this.errors.size() == 1) {
                assertionError.initCause(this.errors.get(0));
            } else {
                assertionError.initCause(new CompositeException(this.errors));
            }
        }
        return assertionError;
    }

    public final List<List<Object>> getEvents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(values());
        arrayList.add(errors());
        ArrayList arrayList2 = new ArrayList();
        for (long j = 0; j < this.completions; j++) {
            arrayList2.add(Notification.createOnComplete());
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    public final boolean isTerminated() {
        return this.done.getCount() == 0;
    }

    public final boolean isTimeout() {
        return this.timeout;
    }

    public final Thread lastThread() {
        return this.lastThread;
    }

    public final int valueCount() {
        return this.values.size();
    }

    public final List<T> values() {
        return this.values;
    }

    public final U withTag(CharSequence charSequence) {
        this.tag = charSequence;
        return this;
    }

    public final U assertError(Class<? extends Throwable> cls) {
        return assertError(Functions.isInstanceOf(cls));
    }

    public final U awaitCount(int i, Runnable runnable) {
        return awaitCount(i, runnable, BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT);
    }

    public final U assertError(Predicate<Throwable> predicate) {
        int size = this.errors.size();
        if (size != 0) {
            Iterator<Throwable> it2 = this.errors.iterator();
            while (it2.hasNext()) {
                try {
                    if (predicate.test(it2.next())) {
                        if (size == 1) {
                            return this;
                        }
                        throw fail("Error present but other errors as well");
                    }
                } catch (Exception e) {
                    throw ExceptionHelper.wrapOrThrow(e);
                }
            }
            throw fail("Error not present");
        }
        throw fail("No errors");
    }

    public final boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean z = this.done.getCount() == 0 || this.done.await(j, timeUnit);
        this.timeout = !z;
        return z;
    }

    public final U awaitCount(int i, Runnable runnable, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (j > 0 && System.currentTimeMillis() - currentTimeMillis >= j) {
                this.timeout = true;
                break;
            }
            if (this.done.getCount() == 0 || this.values.size() >= i) {
                break;
            }
            runnable.run();
        }
        return this;
    }

    public final boolean awaitTerminalEvent(long j, TimeUnit timeUnit) {
        try {
            return await(j, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final U assertFailure(Predicate<Throwable> predicate, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(predicate).assertNotComplete();
    }

    public final U assertNever(Predicate<? super T> predicate) {
        int size = this.values.size();
        for (int i = 0; i < size; i++) {
            try {
                if (predicate.test(this.values.get(i))) {
                    throw fail("Value at position " + i + " matches predicate " + predicate.toString() + ", which was not expected.");
                }
            } catch (Exception e) {
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }
        return this;
    }

    public final U assertValue(Predicate<T> predicate) {
        assertValueAt(0, (Predicate) predicate);
        if (this.values.size() <= 1) {
            return this;
        }
        throw fail("Value present but other values as well");
    }

    public final U assertValueAt(int i, Predicate<T> predicate) {
        if (this.values.size() != 0) {
            if (i < this.values.size()) {
                try {
                    if (predicate.test(this.values.get(i))) {
                        return this;
                    }
                    throw fail("Value not present");
                } catch (Exception e) {
                    throw ExceptionHelper.wrapOrThrow(e);
                }
            }
            throw fail("Invalid index: " + i);
        }
        throw fail("No values");
    }
}
