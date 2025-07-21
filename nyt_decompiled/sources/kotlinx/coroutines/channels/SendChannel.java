package kotlinx.coroutines.channels;

import defpackage.by0;
import defpackage.ss2;
import defpackage.ww8;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.selects.SelectClause2;

/* loaded from: classes5.dex */
public interface SendChannel<E> {

    public static final class DefaultImpls {
        public static /* synthetic */ boolean close$default(SendChannel sendChannel, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return sendChannel.close(th);
        }

        @DelicateCoroutinesApi
        public static /* synthetic */ void isClosedForSend$annotations() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <E> boolean offer(SendChannel<? super E> sendChannel, E e) {
            Object mo129trySendJP2dKIU = sendChannel.mo129trySendJP2dKIU(e);
            if (ChannelResult.m902isSuccessimpl(mo129trySendJP2dKIU)) {
                return true;
            }
            Throwable m896exceptionOrNullimpl = ChannelResult.m896exceptionOrNullimpl(mo129trySendJP2dKIU);
            if (m896exceptionOrNullimpl == null) {
                return false;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(m896exceptionOrNullimpl);
        }
    }

    boolean close(Throwable th);

    SelectClause2<E, SendChannel<E>> getOnSend();

    /* renamed from: invokeOnClose */
    void mo949invokeOnClose(ss2 ss2Var);

    boolean isClosedForSend();

    boolean offer(E e);

    Object send(E e, by0<? super ww8> by0Var);

    /* renamed from: trySend-JP2dKIU */
    Object mo129trySendJP2dKIU(E e);
}
