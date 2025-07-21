package kotlinx.coroutines.flow.internal;

import defpackage.by0;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;

@InternalCoroutinesApi
/* loaded from: classes5.dex */
public final class SendingCollector<T> implements FlowCollector<T> {
    private final SendChannel<T> channel;

    /* JADX WARN: Multi-variable type inference failed */
    public SendingCollector(SendChannel<? super T> sendChannel) {
        this.channel = sendChannel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, by0<? super ww8> by0Var) {
        Object send = this.channel.send(t, by0Var);
        return send == a.h() ? send : ww8.a;
    }
}
