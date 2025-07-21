package kotlinx.coroutines.flow;

import defpackage.ak7;
import defpackage.an3;
import defpackage.bj3;
import defpackage.by0;
import defpackage.gt2;
import defpackage.hb4;
import defpackage.it2;
import defpackage.kt2;
import defpackage.mt2;
import defpackage.nt2;
import defpackage.ot2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.vu3;
import defpackage.ww8;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BroadcastChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;

/* loaded from: classes5.dex */
public final class FlowKt {
    public static final String DEFAULT_CONCURRENCY_PROPERTY_NAME = "kotlinx.coroutines.flow.defaultConcurrency";

    public static final <T> Flow<T> asFlow(qs2 qs2Var) {
        return FlowKt__BuildersKt.asFlow(qs2Var);
    }

    public static final <T> SharedFlow<T> asSharedFlow(MutableSharedFlow<T> mutableSharedFlow) {
        return FlowKt__ShareKt.asSharedFlow(mutableSharedFlow);
    }

    public static final <T> StateFlow<T> asStateFlow(MutableStateFlow<T> mutableStateFlow) {
        return FlowKt__ShareKt.asStateFlow(mutableStateFlow);
    }

    public static final <T> Flow<T> cache(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.cache(flow);
    }

    public static final <T> Flow<T> callbackFlow(gt2 gt2Var) {
        return FlowKt__BuildersKt.callbackFlow(gt2Var);
    }

    public static final <T> Flow<T> cancellable(Flow<? extends T> flow) {
        return FlowKt__ContextKt.cancellable(flow);
    }

    /* renamed from: catch, reason: not valid java name */
    public static final <T> Flow<T> m911catch(Flow<? extends T> flow, it2 it2Var) {
        return FlowKt__ErrorsKt.m922catch(flow, it2Var);
    }

    public static final <T> Object catchImpl(Flow<? extends T> flow, FlowCollector<? super T> flowCollector, by0<? super Throwable> by0Var) {
        return FlowKt__ErrorsKt.catchImpl(flow, flowCollector, by0Var);
    }

    public static final <T> Flow<T> channelFlow(gt2 gt2Var) {
        return FlowKt__BuildersKt.channelFlow(gt2Var);
    }

    public static final Object collect(Flow<?> flow, by0<? super ww8> by0Var) {
        return FlowKt__CollectKt.collect(flow, by0Var);
    }

    public static final <T> Object collectIndexed(Flow<? extends T> flow, it2 it2Var, by0<? super ww8> by0Var) {
        return FlowKt__CollectKt.collectIndexed(flow, it2Var, by0Var);
    }

    public static final <T> Object collectLatest(Flow<? extends T> flow, gt2 gt2Var, by0<? super ww8> by0Var) {
        return FlowKt__CollectKt.collectLatest(flow, gt2Var, by0Var);
    }

    public static final <T> Object collectWhile(Flow<? extends T> flow, gt2 gt2Var, by0<? super ww8> by0Var) {
        return FlowKt__LimitKt.collectWhile(flow, gt2Var, by0Var);
    }

    public static final <T1, T2, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, it2 it2Var) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, it2Var);
    }

    public static final <T, R> Flow<R> compose(Flow<? extends T> flow, ss2 ss2Var) {
        return FlowKt__MigrationKt.compose(flow, ss2Var);
    }

    public static final <T, R> Flow<R> concatMap(Flow<? extends T> flow, ss2 ss2Var) {
        return FlowKt__MigrationKt.concatMap(flow, ss2Var);
    }

    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, T t) {
        return FlowKt__MigrationKt.concatWith(flow, t);
    }

    public static final <T> Flow<T> conflate(Flow<? extends T> flow) {
        return FlowKt__ContextKt.conflate(flow);
    }

    public static final <T> Flow<T> consumeAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.consumeAsFlow(receiveChannel);
    }

    public static final <T> Object count(Flow<? extends T> flow, by0<? super Integer> by0Var) {
        return FlowKt__CountKt.count(flow, by0Var);
    }

    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.debounce(flow, j);
    }

    @FlowPreview
    /* renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m912debounceHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.m915debounceHG0u8IE(flow, j);
    }

    @FlowPreview
    public static final <T> Flow<T> debounceDuration(Flow<? extends T> flow, ss2 ss2Var) {
        return FlowKt__DelayKt.debounceDuration(flow, ss2Var);
    }

    public static final <T> Flow<T> delayEach(Flow<? extends T> flow, long j) {
        return FlowKt__MigrationKt.delayEach(flow, j);
    }

    public static final <T> Flow<T> delayFlow(Flow<? extends T> flow, long j) {
        return FlowKt__MigrationKt.delayFlow(flow, j);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow) {
        return FlowKt__DistinctKt.distinctUntilChanged(flow);
    }

    public static final <T, K> Flow<T> distinctUntilChangedBy(Flow<? extends T> flow, ss2 ss2Var) {
        return FlowKt__DistinctKt.distinctUntilChangedBy(flow, ss2Var);
    }

    public static final <T> Flow<T> drop(Flow<? extends T> flow, int i) {
        return FlowKt__LimitKt.drop(flow, i);
    }

    public static final <T> Flow<T> dropWhile(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__LimitKt.dropWhile(flow, gt2Var);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, ReceiveChannel<? extends T> receiveChannel, by0<? super ww8> by0Var) {
        return FlowKt__ChannelsKt.emitAll(flowCollector, receiveChannel, by0Var);
    }

    public static final <T> Flow<T> emptyFlow() {
        return FlowKt__BuildersKt.emptyFlow();
    }

    public static final void ensureActive(FlowCollector<?> flowCollector) {
        FlowKt__EmittersKt.ensureActive(flowCollector);
    }

    public static final <T> Flow<T> filter(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__TransformKt.filter(flow, gt2Var);
    }

    public static final <T> Flow<T> filterNot(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__TransformKt.filterNot(flow, gt2Var);
    }

    public static final <T> Flow<T> filterNotNull(Flow<? extends T> flow) {
        return FlowKt__TransformKt.filterNotNull(flow);
    }

    public static final <T> Object first(Flow<? extends T> flow, by0<? super T> by0Var) {
        return FlowKt__ReduceKt.first(flow, by0Var);
    }

    public static final <T> Object firstOrNull(Flow<? extends T> flow, by0<? super T> by0Var) {
        return FlowKt__ReduceKt.firstOrNull(flow, by0Var);
    }

    public static final ReceiveChannel<ww8> fixedPeriodTicker(CoroutineScope coroutineScope, long j) {
        return FlowKt__DelayKt.fixedPeriodTicker(coroutineScope, j);
    }

    public static final <T, R> Flow<R> flatMap(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__MigrationKt.flatMap(flow, gt2Var);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> flatMapConcat(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__MergeKt.flatMapConcat(flow, gt2Var);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> flatMapLatest(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__MergeKt.flatMapLatest(flow, gt2Var);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> flatMapMerge(Flow<? extends T> flow, int i, gt2 gt2Var) {
        return FlowKt__MergeKt.flatMapMerge(flow, i, gt2Var);
    }

    public static final <T> Flow<T> flatten(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MigrationKt.flatten(flow);
    }

    @ExperimentalCoroutinesApi
    public static final <T> Flow<T> flattenConcat(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MergeKt.flattenConcat(flow);
    }

    @ExperimentalCoroutinesApi
    public static final <T> Flow<T> flattenMerge(Flow<? extends Flow<? extends T>> flow, int i) {
        return FlowKt__MergeKt.flattenMerge(flow, i);
    }

    public static final <T> Flow<T> flow(gt2 gt2Var) {
        return FlowKt__BuildersKt.flow(gt2Var);
    }

    public static final <T1, T2, R> Flow<R> flowCombine(Flow<? extends T1> flow, Flow<? extends T2> flow2, it2 it2Var) {
        return FlowKt__ZipKt.flowCombine(flow, flow2, it2Var);
    }

    public static final <T1, T2, R> Flow<R> flowCombineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, kt2 kt2Var) {
        return FlowKt__ZipKt.flowCombineTransform(flow, flow2, kt2Var);
    }

    public static final <T> Flow<T> flowOf(T t) {
        return FlowKt__BuildersKt.flowOf(t);
    }

    public static final <T> Flow<T> flowOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return FlowKt__ContextKt.flowOn(flow, coroutineContext);
    }

    public static final <T, R> Object fold(Flow<? extends T> flow, R r, it2 it2Var, by0<? super R> by0Var) {
        return FlowKt__ReduceKt.fold(flow, r, it2Var, by0Var);
    }

    public static final <T> void forEach(Flow<? extends T> flow, gt2 gt2Var) {
        FlowKt__MigrationKt.forEach(flow, gt2Var);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return FlowKt__MergeKt.getDEFAULT_CONCURRENCY();
    }

    public static final <T> Object last(Flow<? extends T> flow, by0<? super T> by0Var) {
        return FlowKt__ReduceKt.last(flow, by0Var);
    }

    public static final <T> Object lastOrNull(Flow<? extends T> flow, by0<? super T> by0Var) {
        return FlowKt__ReduceKt.lastOrNull(flow, by0Var);
    }

    public static final <T> Job launchIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return FlowKt__CollectKt.launchIn(flow, coroutineScope);
    }

    public static final <T, R> Flow<R> map(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__TransformKt.map(flow, gt2Var);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> mapLatest(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__MergeKt.mapLatest(flow, gt2Var);
    }

    public static final <T, R> Flow<R> mapNotNull(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__TransformKt.mapNotNull(flow, gt2Var);
    }

    public static final <T> Flow<T> merge(Iterable<? extends Flow<? extends T>> iterable) {
        return FlowKt__MergeKt.merge(iterable);
    }

    public static final Void noImpl() {
        return FlowKt__MigrationKt.noImpl();
    }

    public static final <T> Flow<T> observeOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.observeOn(flow, coroutineContext);
    }

    public static final <T> Flow<T> onCompletion(Flow<? extends T> flow, it2 it2Var) {
        return FlowKt__EmittersKt.onCompletion(flow, it2Var);
    }

    public static final <T> Flow<T> onEach(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__TransformKt.onEach(flow, gt2Var);
    }

    public static final <T> Flow<T> onEmpty(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__EmittersKt.onEmpty(flow, gt2Var);
    }

    public static final <T> Flow<T> onErrorResume(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.onErrorResume(flow, flow2);
    }

    public static final <T> Flow<T> onErrorResumeNext(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.onErrorResumeNext(flow, flow2);
    }

    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t) {
        return FlowKt__MigrationKt.onErrorReturn(flow, t);
    }

    public static final <T> Flow<T> onStart(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__EmittersKt.onStart(flow, gt2Var);
    }

    public static final <T> SharedFlow<T> onSubscription(SharedFlow<? extends T> sharedFlow, gt2 gt2Var) {
        return FlowKt__ShareKt.onSubscription(sharedFlow, gt2Var);
    }

    public static final <T> ReceiveChannel<T> produceIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return FlowKt__ChannelsKt.produceIn(flow, coroutineScope);
    }

    public static final <T> Flow<T> publish(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.publish(flow);
    }

    public static final <T> Flow<T> publishOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.publishOn(flow, coroutineContext);
    }

    public static final <T> Flow<T> receiveAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.receiveAsFlow(receiveChannel);
    }

    public static final <S, T extends S> Object reduce(Flow<? extends T> flow, it2 it2Var, by0<? super S> by0Var) {
        return FlowKt__ReduceKt.reduce(flow, it2Var, by0Var);
    }

    public static final <T> Flow<T> replay(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.replay(flow);
    }

    public static final <T> Flow<T> retry(Flow<? extends T> flow, long j, gt2 gt2Var) {
        return FlowKt__ErrorsKt.retry(flow, j, gt2Var);
    }

    public static final <T> Flow<T> retryWhen(Flow<? extends T> flow, kt2 kt2Var) {
        return FlowKt__ErrorsKt.retryWhen(flow, kt2Var);
    }

    public static final <T, R> Flow<R> runningFold(Flow<? extends T> flow, R r, it2 it2Var) {
        return FlowKt__TransformKt.runningFold(flow, r, it2Var);
    }

    public static final <T> Flow<T> runningReduce(Flow<? extends T> flow, it2 it2Var) {
        return FlowKt__TransformKt.runningReduce(flow, it2Var);
    }

    @FlowPreview
    public static final <T> Flow<T> sample(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.sample(flow, j);
    }

    @FlowPreview
    /* renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m913sampleHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.m916sampleHG0u8IE(flow, j);
    }

    public static final <T, R> Flow<R> scan(Flow<? extends T> flow, R r, it2 it2Var) {
        return FlowKt__TransformKt.scan(flow, r, it2Var);
    }

    public static final <T, R> Flow<R> scanFold(Flow<? extends T> flow, R r, it2 it2Var) {
        return FlowKt__MigrationKt.scanFold(flow, r, it2Var);
    }

    public static final <T> Flow<T> scanReduce(Flow<? extends T> flow, it2 it2Var) {
        return FlowKt__MigrationKt.scanReduce(flow, it2Var);
    }

    public static final <T> SharedFlow<T> shareIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i) {
        return FlowKt__ShareKt.shareIn(flow, coroutineScope, sharingStarted, i);
    }

    public static final <T> Object single(Flow<? extends T> flow, by0<? super T> by0Var) {
        return FlowKt__ReduceKt.single(flow, by0Var);
    }

    public static final <T> Object singleOrNull(Flow<? extends T> flow, by0<? super T> by0Var) {
        return FlowKt__ReduceKt.singleOrNull(flow, by0Var);
    }

    public static final <T> Flow<T> skip(Flow<? extends T> flow, int i) {
        return FlowKt__MigrationKt.skip(flow, i);
    }

    public static final <T> Flow<T> startWith(Flow<? extends T> flow, T t) {
        return FlowKt__MigrationKt.startWith(flow, t);
    }

    public static final <T> Object stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, by0<? super StateFlow<? extends T>> by0Var) {
        return FlowKt__ShareKt.stateIn(flow, coroutineScope, by0Var);
    }

    public static final <T> void subscribe(Flow<? extends T> flow) {
        FlowKt__MigrationKt.subscribe(flow);
    }

    public static final <T> Flow<T> subscribeOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.subscribeOn(flow, coroutineContext);
    }

    public static final <T, R> Flow<R> switchMap(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__MigrationKt.switchMap(flow, gt2Var);
    }

    public static final <T> Flow<T> take(Flow<? extends T> flow, int i) {
        return FlowKt__LimitKt.take(flow, i);
    }

    public static final <T> Flow<T> takeWhile(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__LimitKt.takeWhile(flow, gt2Var);
    }

    @FlowPreview
    /* renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m914timeoutHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.m917timeoutHG0u8IE(flow, j);
    }

    public static final <T, C extends Collection<? super T>> Object toCollection(Flow<? extends T> flow, C c, by0<? super C> by0Var) {
        return FlowKt__CollectionKt.toCollection(flow, c, by0Var);
    }

    public static final <T> Object toList(Flow<? extends T> flow, List<T> list, by0<? super List<? extends T>> by0Var) {
        return FlowKt__CollectionKt.toList(flow, list, by0Var);
    }

    public static final <T> Object toSet(Flow<? extends T> flow, Set<T> set, by0<? super Set<? extends T>> by0Var) {
        return FlowKt__CollectionKt.toSet(flow, set, by0Var);
    }

    public static final <T, R> Flow<R> transform(Flow<? extends T> flow, it2 it2Var) {
        return FlowKt__EmittersKt.transform(flow, it2Var);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> transformLatest(Flow<? extends T> flow, it2 it2Var) {
        return FlowKt__MergeKt.transformLatest(flow, it2Var);
    }

    public static final <T, R> Flow<R> transformWhile(Flow<? extends T> flow, it2 it2Var) {
        return FlowKt__LimitKt.transformWhile(flow, it2Var);
    }

    public static final <T, R> Flow<R> unsafeTransform(Flow<? extends T> flow, it2 it2Var) {
        return FlowKt__EmittersKt.unsafeTransform(flow, it2Var);
    }

    public static final <T> Flow<bj3> withIndex(Flow<? extends T> flow) {
        return FlowKt__TransformKt.withIndex(flow);
    }

    public static final <T1, T2, R> Flow<R> zip(Flow<? extends T1> flow, Flow<? extends T2> flow2, it2 it2Var) {
        return FlowKt__ZipKt.zip(flow, flow2, it2Var);
    }

    public static final <T> Flow<T> asFlow(ss2 ss2Var) {
        return FlowKt__BuildersKt.asFlow(ss2Var);
    }

    public static final <T> Flow<T> buffer(Flow<? extends T> flow, int i, BufferOverflow bufferOverflow) {
        return FlowKt__ContextKt.buffer(flow, i, bufferOverflow);
    }

    public static final <T1, T2, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, it2 it2Var) {
        return FlowKt__ZipKt.combine(flow, flow2, it2Var);
    }

    public static final <T1, T2, T3, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, kt2 kt2Var) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, kt2Var);
    }

    public static final <T1, T2, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, kt2 kt2Var) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, kt2Var);
    }

    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.concatWith((Flow) flow, (Flow) flow2);
    }

    public static final <T> Object count(Flow<? extends T> flow, gt2 gt2Var, by0<? super Integer> by0Var) {
        return FlowKt__CountKt.count(flow, gt2Var, by0Var);
    }

    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, ss2 ss2Var) {
        return FlowKt__DelayKt.debounce(flow, ss2Var);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt__DistinctKt.distinctUntilChanged(flow, gt2Var);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, by0<? super ww8> by0Var) {
        return FlowKt__CollectKt.emitAll(flowCollector, flow, by0Var);
    }

    public static final <R> Flow<R> filterIsInstance(Flow<?> flow, vu3 vu3Var) {
        return FlowKt__TransformKt.filterIsInstance(flow, vu3Var);
    }

    public static final <T> Object first(Flow<? extends T> flow, gt2 gt2Var, by0<? super T> by0Var) {
        return FlowKt__ReduceKt.first(flow, gt2Var, by0Var);
    }

    public static final <T> Object firstOrNull(Flow<? extends T> flow, gt2 gt2Var, by0<? super T> by0Var) {
        return FlowKt__ReduceKt.firstOrNull(flow, gt2Var, by0Var);
    }

    public static final <T> Flow<T> flowOf(T... tArr) {
        return FlowKt__BuildersKt.flowOf((Object[]) tArr);
    }

    public static final <T> Flow<T> merge(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MigrationKt.merge(flow);
    }

    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t, ss2 ss2Var) {
        return FlowKt__MigrationKt.onErrorReturn(flow, t, ss2Var);
    }

    public static final <T> Flow<T> publish(Flow<? extends T> flow, int i) {
        return FlowKt__MigrationKt.publish(flow, i);
    }

    public static final <T> Flow<T> replay(Flow<? extends T> flow, int i) {
        return FlowKt__MigrationKt.replay(flow, i);
    }

    public static final <T> Flow<T> startWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.startWith((Flow) flow, (Flow) flow2);
    }

    public static final <T> StateFlow<T> stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, T t) {
        return FlowKt__ShareKt.stateIn(flow, coroutineScope, sharingStarted, t);
    }

    public static final <T> void subscribe(Flow<? extends T> flow, gt2 gt2Var) {
        FlowKt__MigrationKt.subscribe(flow, gt2Var);
    }

    public static final Flow<Integer> asFlow(an3 an3Var) {
        return FlowKt__BuildersKt.asFlow(an3Var);
    }

    public static final <T1, T2, T3, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, kt2 kt2Var) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, kt2Var);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, mt2 mt2Var) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, flow4, mt2Var);
    }

    public static final <T1, T2, T3, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, mt2 mt2Var) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, mt2Var);
    }

    public static final <T> Flow<T> merge(Flow<? extends T>... flowArr) {
        return FlowKt__MergeKt.merge(flowArr);
    }

    public static final <T> void subscribe(Flow<? extends T> flow, gt2 gt2Var, gt2 gt2Var2) {
        FlowKt__MigrationKt.subscribe(flow, gt2Var, gt2Var2);
    }

    public static final Flow<Long> asFlow(hb4 hb4Var) {
        return FlowKt__BuildersKt.asFlow(hb4Var);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, mt2 mt2Var) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, flow4, mt2Var);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, nt2 nt2Var) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, flow4, flow5, nt2Var);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, nt2 nt2Var) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, flow4, nt2Var);
    }

    public static final <T> Flow<T> asFlow(ak7 ak7Var) {
        return FlowKt__BuildersKt.asFlow(ak7Var);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, nt2 nt2Var) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, flow4, flow5, nt2Var);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, ot2 ot2Var) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, flow4, flow5, ot2Var);
    }

    public static final <T> Flow<T> asFlow(Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.asFlow(iterable);
    }

    public static final <T> Flow<T> asFlow(Iterator<? extends T> it2) {
        return FlowKt__BuildersKt.asFlow(it2);
    }

    public static final <T> Flow<T> asFlow(BroadcastChannel<T> broadcastChannel) {
        return FlowKt__ChannelsKt.asFlow(broadcastChannel);
    }

    public static final Flow<Integer> asFlow(int[] iArr) {
        return FlowKt__BuildersKt.asFlow(iArr);
    }

    public static final Flow<Long> asFlow(long[] jArr) {
        return FlowKt__BuildersKt.asFlow(jArr);
    }

    public static final <T> Flow<T> asFlow(T[] tArr) {
        return FlowKt__BuildersKt.asFlow(tArr);
    }
}
