package kotlinx.coroutines.channels;

import defpackage.by0;
import defpackage.cc0;
import defpackage.g62;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zt6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;

/* loaded from: classes5.dex */
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {
    private final int capacity;
    private final BufferOverflow onBufferOverflow;

    public /* synthetic */ ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, ss2 ss2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bufferOverflow, (i2 & 4) != 0 ? null : ss2Var);
    }

    static /* synthetic */ <E> Object send$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e, by0<? super ww8> by0Var) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object m910trySendImplMj0NB7M = conflatedBufferedChannel.m910trySendImplMj0NB7M(e, true);
        if (!(m910trySendImplMj0NB7M instanceof ChannelResult.Closed)) {
            return ww8.a;
        }
        ChannelResult.m896exceptionOrNullimpl(m910trySendImplMj0NB7M);
        ss2 ss2Var = conflatedBufferedChannel.onUndeliveredElement;
        if (ss2Var == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(ss2Var, e, null, 2, null)) == null) {
            throw conflatedBufferedChannel.getSendException();
        }
        g62.a(callUndeliveredElementCatchingException$default, conflatedBufferedChannel.getSendException());
        throw callUndeliveredElementCatchingException$default;
    }

    static /* synthetic */ <E> Object sendBroadcast$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e, by0<? super Boolean> by0Var) {
        Object m910trySendImplMj0NB7M = conflatedBufferedChannel.m910trySendImplMj0NB7M(e, true);
        if (m910trySendImplMj0NB7M instanceof ChannelResult.Failed) {
            return cc0.a(false);
        }
        return cc0.a(true);
    }

    /* renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final Object m908trySendDropLatestMj0NB7M(E e, boolean z) {
        ss2 ss2Var;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object mo129trySendJP2dKIU = super.mo129trySendJP2dKIU(e);
        if (ChannelResult.m902isSuccessimpl(mo129trySendJP2dKIU) || ChannelResult.m900isClosedimpl(mo129trySendJP2dKIU)) {
            return mo129trySendJP2dKIU;
        }
        if (!z || (ss2Var = this.onUndeliveredElement) == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(ss2Var, e, null, 2, null)) == null) {
            return ChannelResult.Companion.m907successJP2dKIU(ww8.a);
        }
        throw callUndeliveredElementCatchingException$default;
    }

    /* renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    private final Object m909trySendDropOldestJP2dKIU(E e) {
        ChannelSegment channelSegment;
        Object obj = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = BufferedChannel.sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / i;
            int i2 = (int) (j % i);
            if (channelSegment2.id != j2) {
                ChannelSegment findSegmentSend = findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    return ChannelResult.Companion.m905closedJP2dKIU(getSendException());
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = updateCellSend(channelSegment, i2, e, j, obj, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                return ChannelResult.Companion.m907successJP2dKIU(ww8.a);
            }
            if (updateCellSend == 1) {
                return ChannelResult.Companion.m907successJP2dKIU(ww8.a);
            }
            if (updateCellSend == 2) {
                if (isClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return ChannelResult.Companion.m905closedJP2dKIU(getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i2);
                }
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment.id * i) + i2);
                return ChannelResult.Companion.m907successJP2dKIU(ww8.a);
            }
            if (updateCellSend == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (updateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return ChannelResult.Companion.m905closedJP2dKIU(getSendException());
            }
            if (updateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
    }

    /* renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final Object m910trySendImplMj0NB7M(E e, boolean z) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m908trySendDropLatestMj0NB7M(e, z) : m909trySendDropOldestJP2dKIU(e);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void registerSelectForSend(SelectInstance<?> selectInstance, Object obj) {
        Object mo129trySendJP2dKIU = mo129trySendJP2dKIU(obj);
        if (!(mo129trySendJP2dKIU instanceof ChannelResult.Failed)) {
            selectInstance.selectInRegistrationPhase(ww8.a);
        } else {
            if (!(mo129trySendJP2dKIU instanceof ChannelResult.Closed)) {
                throw new IllegalStateException("unreachable");
            }
            ChannelResult.m896exceptionOrNullimpl(mo129trySendJP2dKIU);
            selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public Object send(E e, by0<? super ww8> by0Var) {
        return send$suspendImpl((ConflatedBufferedChannel) this, (Object) e, by0Var);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public Object sendBroadcast$kotlinx_coroutines_core(E e, by0<? super Boolean> by0Var) {
        return sendBroadcast$suspendImpl((ConflatedBufferedChannel) this, (Object) e, by0Var);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public Object mo129trySendJP2dKIU(E e) {
        return m910trySendImplMj0NB7M(e, false);
    }

    public ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, ss2 ss2Var) {
        super(i, ss2Var);
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + zt6.b(BufferedChannel.class).d() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }
}
