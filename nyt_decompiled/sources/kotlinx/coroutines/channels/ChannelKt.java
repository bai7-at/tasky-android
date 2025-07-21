package kotlinx.coroutines.channels;

import defpackage.ss2;
import kotlinx.coroutines.channels.ChannelResult;

/* loaded from: classes5.dex */
public final class ChannelKt {
    public static final <E> Channel<E> Channel(int i, BufferOverflow bufferOverflow, ss2 ss2Var) {
        Channel<E> bufferedChannel;
        if (i == -2) {
            bufferedChannel = bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel<>(Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core(), ss2Var) : new ConflatedBufferedChannel<>(1, bufferOverflow, ss2Var);
        } else {
            if (i == -1) {
                if (bufferOverflow == BufferOverflow.SUSPEND) {
                    return new ConflatedBufferedChannel(1, BufferOverflow.DROP_OLDEST, ss2Var);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i != 0) {
                return i != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(i, ss2Var) : new ConflatedBufferedChannel(i, bufferOverflow, ss2Var) : new BufferedChannel(Integer.MAX_VALUE, ss2Var);
            }
            bufferedChannel = bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel<>(0, ss2Var) : new ConflatedBufferedChannel<>(1, bufferOverflow, ss2Var);
        }
        return bufferedChannel;
    }

    public static /* synthetic */ Channel Channel$default(int i, BufferOverflow bufferOverflow, ss2 ss2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            ss2Var = null;
        }
        return Channel(i, bufferOverflow, ss2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrElse-WpGqRn0, reason: not valid java name */
    public static final <T> T m888getOrElseWpGqRn0(Object obj, ss2 ss2Var) {
        return obj instanceof ChannelResult.Failed ? (T) ss2Var.invoke(ChannelResult.m896exceptionOrNullimpl(obj)) : obj;
    }

    /* renamed from: onClosed-WpGqRn0, reason: not valid java name */
    public static final <T> Object m889onClosedWpGqRn0(Object obj, ss2 ss2Var) {
        if (obj instanceof ChannelResult.Closed) {
            ss2Var.invoke(ChannelResult.m896exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* renamed from: onFailure-WpGqRn0, reason: not valid java name */
    public static final <T> Object m890onFailureWpGqRn0(Object obj, ss2 ss2Var) {
        if (obj instanceof ChannelResult.Failed) {
            ss2Var.invoke(ChannelResult.m896exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* renamed from: onSuccess-WpGqRn0, reason: not valid java name */
    public static final <T> Object m891onSuccessWpGqRn0(Object obj, ss2 ss2Var) {
        if (!(obj instanceof ChannelResult.Failed)) {
            ss2Var.invoke(obj);
        }
        return obj;
    }

    public static /* synthetic */ Channel Channel$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return Channel(i);
    }

    public static final /* synthetic */ Channel Channel(int i) {
        return Channel$default(i, null, null, 6, null);
    }
}
