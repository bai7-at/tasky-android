package kotlinx.coroutines.internal;

import kotlinx.coroutines.InternalCoroutinesApi;

@InternalCoroutinesApi
/* loaded from: classes5.dex */
public interface ThreadSafeHeapNode {
    ThreadSafeHeap<?> getHeap();

    int getIndex();

    void setHeap(ThreadSafeHeap<?> threadSafeHeap);

    void setIndex(int i);
}
