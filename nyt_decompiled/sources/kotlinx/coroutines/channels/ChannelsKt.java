package kotlinx.coroutines.channels;

import defpackage.by0;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ss2;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* loaded from: classes5.dex */
public final class ChannelsKt {
    public static final String DEFAULT_CLOSE_MESSAGE = "Channel was closed";

    public static final void cancelConsumed(ReceiveChannel<?> receiveChannel, Throwable th) {
        ChannelsKt__Channels_commonKt.cancelConsumed(receiveChannel, th);
    }

    @ObsoleteCoroutinesApi
    public static final <E, R> R consume(BroadcastChannel<E> broadcastChannel, ss2 ss2Var) {
        return (R) ChannelsKt__DeprecatedKt.consume(broadcastChannel, ss2Var);
    }

    public static final <E> Object consumeEach(BroadcastChannel<E> broadcastChannel, ss2 ss2Var, by0<? super ww8> by0Var) {
        return ChannelsKt__DeprecatedKt.consumeEach(broadcastChannel, ss2Var, by0Var);
    }

    public static final ss2 consumes(ReceiveChannel<?> receiveChannel) {
        return ChannelsKt__DeprecatedKt.consumes(receiveChannel);
    }

    public static final ss2 consumesAll(ReceiveChannel<?>... receiveChannelArr) {
        return ChannelsKt__DeprecatedKt.consumesAll(receiveChannelArr);
    }

    public static final /* synthetic */ ReceiveChannel distinct(ReceiveChannel receiveChannel) {
        ReceiveChannel distinctBy$default;
        distinctBy$default = ChannelsKt__DeprecatedKt.distinctBy$default(receiveChannel, null, new ChannelsKt__DeprecatedKt$distinct$1(null), 1, null);
        return distinctBy$default;
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, gt2 gt2Var) {
        return ChannelsKt__DeprecatedKt.distinctBy(receiveChannel, coroutineContext, gt2Var);
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, gt2 gt2Var) {
        return ChannelsKt__DeprecatedKt.filter(receiveChannel, coroutineContext, gt2Var);
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> receiveChannel) {
        return ChannelsKt__DeprecatedKt.filterNotNull(receiveChannel);
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, gt2 gt2Var) {
        return ChannelsKt__DeprecatedKt.map(receiveChannel, coroutineContext, gt2Var);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, it2 it2Var) {
        return ChannelsKt__DeprecatedKt.mapIndexed(receiveChannel, coroutineContext, it2Var);
    }

    public static final /* synthetic */ ReceiveChannel requireNoNulls(ReceiveChannel receiveChannel) {
        ReceiveChannel map$default;
        map$default = ChannelsKt__DeprecatedKt.map$default(receiveChannel, null, new ChannelsKt__DeprecatedKt$requireNoNulls$1(receiveChannel, null), 1, null);
        return map$default;
    }

    public static final <E, C extends SendChannel<? super E>> Object toChannel(ReceiveChannel<? extends E> receiveChannel, C c, by0<? super C> by0Var) {
        return ChannelsKt__DeprecatedKt.toChannel(receiveChannel, c, by0Var);
    }

    public static final <E, C extends Collection<? super E>> Object toCollection(ReceiveChannel<? extends E> receiveChannel, C c, by0<? super C> by0Var) {
        return ChannelsKt__DeprecatedKt.toCollection(receiveChannel, c, by0Var);
    }

    public static final <E> Object toList(ReceiveChannel<? extends E> receiveChannel, by0<? super List<? extends E>> by0Var) {
        return ChannelsKt__Channels_commonKt.toList(receiveChannel, by0Var);
    }

    public static final /* synthetic */ Object toMap(ReceiveChannel receiveChannel, by0 by0Var) {
        Object map;
        map = toMap(receiveChannel, new LinkedHashMap(), by0Var);
        return map;
    }

    public static final /* synthetic */ Object toMutableList(ReceiveChannel receiveChannel, by0 by0Var) {
        Object collection;
        collection = toCollection(receiveChannel, new ArrayList(), by0Var);
        return collection;
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> receiveChannel, by0<? super Set<E>> by0Var) {
        return ChannelsKt__DeprecatedKt.toMutableSet(receiveChannel, by0Var);
    }

    public static final <E> Object trySendBlocking(SendChannel<? super E> sendChannel, E e) {
        return ChannelsKt__ChannelsKt.trySendBlocking(sendChannel, e);
    }

    public static final /* synthetic */ ReceiveChannel zip(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2) {
        ReceiveChannel zip$default;
        zip$default = ChannelsKt__DeprecatedKt.zip$default(receiveChannel, receiveChannel2, null, ChannelsKt__DeprecatedKt$zip$1.INSTANCE, 2, null);
        return zip$default;
    }

    public static final <E, R> R consume(ReceiveChannel<? extends E> receiveChannel, ss2 ss2Var) {
        return (R) ChannelsKt__Channels_commonKt.consume(receiveChannel, ss2Var);
    }

    public static final <E> Object consumeEach(ReceiveChannel<? extends E> receiveChannel, ss2 ss2Var, by0<? super ww8> by0Var) {
        return ChannelsKt__Channels_commonKt.consumeEach(receiveChannel, ss2Var, by0Var);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> Object toMap(ReceiveChannel<? extends Pair<? extends K, ? extends V>> receiveChannel, M m, by0<? super M> by0Var) {
        return ChannelsKt__DeprecatedKt.toMap(receiveChannel, m, by0Var);
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> receiveChannel, ReceiveChannel<? extends R> receiveChannel2, CoroutineContext coroutineContext, gt2 gt2Var) {
        return ChannelsKt__DeprecatedKt.zip(receiveChannel, receiveChannel2, coroutineContext, gt2Var);
    }
}
