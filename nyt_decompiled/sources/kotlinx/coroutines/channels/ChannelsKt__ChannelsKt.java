package kotlinx.coroutines.channels;

import defpackage.ww8;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.channels.ChannelResult;

/* loaded from: classes5.dex */
final /* synthetic */ class ChannelsKt__ChannelsKt {
    public static final /* synthetic */ void sendBlocking(SendChannel sendChannel, Object obj) {
        if (ChannelResult.m902isSuccessimpl(sendChannel.mo129trySendJP2dKIU(obj))) {
            return;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new ChannelsKt__ChannelsKt$sendBlocking$1(sendChannel, obj, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object trySendBlocking(SendChannel<? super E> sendChannel, E e) {
        Object runBlocking$default;
        Object mo129trySendJP2dKIU = sendChannel.mo129trySendJP2dKIU(e);
        if (mo129trySendJP2dKIU instanceof ChannelResult.Failed) {
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(sendChannel, e, null), 1, null);
            return ((ChannelResult) runBlocking$default).m904unboximpl();
        }
        return ChannelResult.Companion.m907successJP2dKIU(ww8.a);
    }
}
