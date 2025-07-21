package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.NotCompleted;
import kotlinx.coroutines.internal.Segment;

/* loaded from: classes5.dex */
public abstract class Segment<S extends Segment<S>> extends ConcurrentLinkedListNode<S> implements NotCompleted {
    private static final /* synthetic */ AtomicIntegerFieldUpdater cleanedAndPointers$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Segment.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long id;

    public Segment(long j, S s, int i) {
        super(s);
        this.id = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    private final /* synthetic */ int getCleanedAndPointers$volatile() {
        return this.cleanedAndPointers$volatile;
    }

    private final /* synthetic */ void setCleanedAndPointers$volatile(int i) {
        this.cleanedAndPointers$volatile = i;
    }

    public final boolean decPointers$kotlinx_coroutines_core() {
        return cleanedAndPointers$volatile$FU.addAndGet(this, -65536) == getNumberOfSlots() && !isTail();
    }

    public abstract int getNumberOfSlots();

    @Override // kotlinx.coroutines.internal.ConcurrentLinkedListNode
    public boolean isRemoved() {
        return cleanedAndPointers$volatile$FU.get(this) == getNumberOfSlots() && !isTail();
    }

    public abstract void onCancellation(int i, Throwable th, CoroutineContext coroutineContext);

    public final void onSlotCleaned() {
        if (cleanedAndPointers$volatile$FU.incrementAndGet(this) == getNumberOfSlots()) {
            remove();
        }
    }

    public final boolean tryIncPointers$kotlinx_coroutines_core() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = cleanedAndPointers$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == getNumberOfSlots() && !isTail()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
