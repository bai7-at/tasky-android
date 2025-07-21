package kotlinx.coroutines.channels;

import defpackage.by0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.selects.SelectClause1;

@ObsoleteCoroutinesApi
/* loaded from: classes5.dex */
public interface ActorScope<E> extends CoroutineScope, ReceiveChannel<E> {

    public static final class DefaultImpls {
        public static <E> SelectClause1<E> getOnReceiveOrNull(ActorScope<E> actorScope) {
            return ReceiveChannel.DefaultImpls.getOnReceiveOrNull(actorScope);
        }

        public static <E> E poll(ActorScope<E> actorScope) {
            return (E) ReceiveChannel.DefaultImpls.poll(actorScope);
        }

        public static <E> Object receiveOrNull(ActorScope<E> actorScope, by0<? super E> by0Var) {
            return ReceiveChannel.DefaultImpls.receiveOrNull(actorScope, by0Var);
        }
    }

    Channel<E> getChannel();
}
