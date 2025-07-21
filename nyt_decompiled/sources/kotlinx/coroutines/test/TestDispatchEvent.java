package kotlinx.coroutines.test;

import defpackage.qs2;
import defpackage.tp0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* loaded from: classes5.dex */
final class TestDispatchEvent<T> implements Comparable<TestDispatchEvent<?>>, ThreadSafeHeapNode {
    private final long count;
    public final TestDispatcher dispatcher;
    private ThreadSafeHeap<?> heap;
    private int index;
    public final qs2 isCancelled;
    public final boolean isForeground;
    public final T marker;
    public final long time;

    public TestDispatchEvent(TestDispatcher testDispatcher, long j, long j2, T t, boolean z, qs2 qs2Var) {
        this.dispatcher = testDispatcher;
        this.count = j;
        this.time = j2;
        this.marker = t;
        this.isForeground = z;
        this.isCancelled = qs2Var;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public ThreadSafeHeap<?> getHeap() {
        return this.heap;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public int getIndex() {
        return this.index;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public void setHeap(ThreadSafeHeap<?> threadSafeHeap) {
        this.heap = threadSafeHeap;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public void setIndex(int i) {
        this.index = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TestDispatchEvent(time=");
        sb.append(this.time);
        sb.append(", dispatcher=");
        sb.append(this.dispatcher);
        sb.append(this.isForeground ? "" : ", background");
        sb.append(')');
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(TestDispatchEvent<?> testDispatchEvent) {
        return tp0.e(this, testDispatchEvent, new PropertyReference1Impl() { // from class: kotlinx.coroutines.test.TestDispatchEvent$compareTo$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.kv3
            public Object get(Object obj) {
                return Long.valueOf(((TestDispatchEvent) obj).time);
            }
        }, new PropertyReference1Impl() { // from class: kotlinx.coroutines.test.TestDispatchEvent$compareTo$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.kv3
            public Object get(Object obj) {
                long j;
                j = ((TestDispatchEvent) obj).count;
                return Long.valueOf(j);
            }
        });
    }
}
