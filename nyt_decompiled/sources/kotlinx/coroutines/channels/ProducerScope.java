package kotlinx.coroutines.channels;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;

/* loaded from: classes5.dex */
public interface ProducerScope<E> extends CoroutineScope, SendChannel<E> {

    public static final class DefaultImpls {
        public static <E> boolean offer(ProducerScope<? super E> producerScope, E e) {
            return SendChannel.DefaultImpls.offer(producerScope, e);
        }
    }

    SendChannel<E> getChannel();
}
