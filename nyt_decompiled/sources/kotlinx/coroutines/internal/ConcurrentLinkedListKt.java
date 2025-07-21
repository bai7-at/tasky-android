package kotlinx.coroutines.internal;

import defpackage.gt2;
import defpackage.ij0;
import defpackage.ss2;
import defpackage.v1;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public final class ConcurrentLinkedListKt {
    private static final Symbol CLOSED = new Symbol("CLOSED");
    private static final int POINTERS_SHIFT = 16;

    private static final /* synthetic */ boolean addConditionally$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, int i, ss2 ss2Var) {
        int i2;
        do {
            i2 = atomicIntegerFieldUpdater.get(obj);
            if (!((Boolean) ss2Var.invoke(Integer.valueOf(i2))).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i2, i2 + i));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$array(AtomicIntegerArray atomicIntegerArray, int i, int i2, ss2 ss2Var) {
        int i3;
        do {
            i3 = atomicIntegerArray.get(i);
            if (!((Boolean) ss2Var.invoke(Integer.valueOf(i3))).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i, i3, i3 + i2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.ConcurrentLinkedListNode] */
    public static final <N extends ConcurrentLinkedListNode<N>> N close(N n) {
        while (true) {
            Object nextOrClosed = n.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return n;
            }
            ?? r0 = (ConcurrentLinkedListNode) nextOrClosed;
            if (r0 != 0) {
                n = r0;
            } else if (n.markAsClosed()) {
                return n;
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j, S s, gt2 gt2Var) {
        Object findSegmentInternal;
        loop0: while (true) {
            findSegmentInternal = findSegmentInternal(s, j, gt2Var);
            if (!SegmentOrClosed.m945isClosedimpl(findSegmentInternal)) {
                Segment m943getSegmentimpl = SegmentOrClosed.m943getSegmentimpl(findSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
                    if (segment.id >= m943getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m943getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (v1.a(atomicReferenceFieldUpdater, obj, segment, m943getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m943getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m943getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return findSegmentInternal;
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$array(AtomicReferenceArray atomicReferenceArray, int i, long j, S s, gt2 gt2Var) {
        Object findSegmentInternal;
        loop0: while (true) {
            findSegmentInternal = findSegmentInternal(s, j, gt2Var);
            if (!SegmentOrClosed.m945isClosedimpl(findSegmentInternal)) {
                Segment m943getSegmentimpl = SegmentOrClosed.m943getSegmentimpl(findSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceArray.get(i);
                    if (segment.id >= m943getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m943getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (ij0.a(atomicReferenceArray, i, segment, m943getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m943getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m943getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return findSegmentInternal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlinx.coroutines.internal.ConcurrentLinkedListNode, kotlinx.coroutines.internal.Segment] */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlinx.coroutines.internal.Segment] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final <S extends Segment<S>> Object findSegmentInternal(S s, long j, gt2 gt2Var) {
        while (true) {
            if (s.id >= j && !s.isRemoved()) {
                return SegmentOrClosed.m940constructorimpl(s);
            }
            Object nextOrClosed = s.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return SegmentOrClosed.m940constructorimpl(CLOSED);
            }
            ?? r0 = (Segment) ((ConcurrentLinkedListNode) nextOrClosed);
            if (r0 == 0) {
                r0 = (Segment) gt2Var.invoke(Long.valueOf(s.id + 1), s);
                if (s.trySetNext(r0)) {
                    if (s.isRemoved()) {
                        s.remove();
                    }
                }
            }
            s = r0;
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, S s) {
        while (true) {
            Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
            if (segment.id >= s.id) {
                return true;
            }
            if (!s.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (v1.a(atomicReferenceFieldUpdater, obj, segment, s)) {
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return true;
            }
            if (s.decPointers$kotlinx_coroutines_core()) {
                s.remove();
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$array(AtomicReferenceArray atomicReferenceArray, int i, S s) {
        while (true) {
            Segment segment = (Segment) atomicReferenceArray.get(i);
            if (segment.id >= s.id) {
                return true;
            }
            if (!s.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (ij0.a(atomicReferenceArray, i, segment, s)) {
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return true;
            }
            if (s.decPointers$kotlinx_coroutines_core()) {
                s.remove();
            }
        }
    }
}
