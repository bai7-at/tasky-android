package io.reactivex.internal.operators.parallel;

import defpackage.hb8;
import defpackage.kz4;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ParallelSortedJoin<T> extends Flowable<T> {
    final Comparator<? super T> comparator;
    final ParallelFlowable<List<T>> source;

    static final class SortedJoinInnerSubscriber<T> extends AtomicReference<hb8> implements FlowableSubscriber<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;
        final int index;
        final SortedJoinSubscription<T> parent;

        SortedJoinInnerSubscriber(SortedJoinSubscription<T> sortedJoinSubscription, int i) {
            this.parent = sortedJoinSubscription;
            this.index = i;
        }

        void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onComplete() {
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onSubscribe(hb8 hb8Var) {
            SubscriptionHelper.setOnce(this, hb8Var, Long.MAX_VALUE);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onNext(List<T> list) {
            this.parent.innerNext(list, this.index);
        }
    }

    static final class SortedJoinSubscription<T> extends AtomicInteger implements hb8 {
        private static final long serialVersionUID = 3481980673745556697L;
        volatile boolean cancelled;
        final Comparator<? super T> comparator;
        final va8 downstream;
        final int[] indexes;
        final List<T>[] lists;
        final SortedJoinInnerSubscriber<T>[] subscribers;
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger remaining = new AtomicInteger();
        final AtomicReference<Throwable> error = new AtomicReference<>();

        SortedJoinSubscription(va8 va8Var, int i, Comparator<? super T> comparator) {
            this.downstream = va8Var;
            this.comparator = comparator;
            SortedJoinInnerSubscriber<T>[] sortedJoinInnerSubscriberArr = new SortedJoinInnerSubscriber[i];
            for (int i2 = 0; i2 < i; i2++) {
                sortedJoinInnerSubscriberArr[i2] = new SortedJoinInnerSubscriber<>(this, i2);
            }
            this.subscribers = sortedJoinInnerSubscriberArr;
            this.lists = new List[i];
            this.indexes = new int[i];
            this.remaining.lazySet(i);
        }

        @Override // defpackage.hb8
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                Arrays.fill(this.lists, (Object) null);
            }
        }

        void cancelAll() {
            for (SortedJoinInnerSubscriber<T> sortedJoinInnerSubscriber : this.subscribers) {
                sortedJoinInnerSubscriber.cancel();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
        
            if (r11 != r7) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00a2, code lost:
        
            if (r16.cancelled == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00a9, code lost:
        
            r10 = r16.error.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00b2, code lost:
        
            if (r10 == null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00be, code lost:
        
            if (r14 >= r4) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00c8, code lost:
        
            if (r0[r14] == r3[r14].size()) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00cd, code lost:
        
            r14 = r14 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00d0, code lost:
        
            java.util.Arrays.fill(r3, (java.lang.Object) null);
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00d7, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00b4, code lost:
        
            cancelAll();
            java.util.Arrays.fill(r3, (java.lang.Object) null);
            r2.onError(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00a4, code lost:
        
            java.util.Arrays.fill(r3, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00a8, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x00da, code lost:
        
            if (r11 == 0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00e3, code lost:
        
            if (r7 == Long.MAX_VALUE) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x00e5, code lost:
        
            r16.requested.addAndGet(-r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00eb, code lost:
        
            r5 = get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x00ef, code lost:
        
            if (r5 != r6) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x00f1, code lost:
        
            r5 = addAndGet(-r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x00f6, code lost:
        
            if (r5 != 0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x00f8, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void drain() {
            /*
                Method dump skipped, instructions count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinSubscription.drain():void");
        }

        void innerError(Throwable th) {
            if (kz4.a(this.error, null, th)) {
                drain();
            } else if (th != this.error.get()) {
                RxJavaPlugins.onError(th);
            }
        }

        void innerNext(List<T> list, int i) {
            this.lists[i] = list;
            if (this.remaining.decrementAndGet() == 0) {
                drain();
            }
        }

        @Override // defpackage.hb8
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                if (this.remaining.get() == 0) {
                    drain();
                }
            }
        }
    }

    public ParallelSortedJoin(ParallelFlowable<List<T>> parallelFlowable, Comparator<? super T> comparator) {
        this.source = parallelFlowable;
        this.comparator = comparator;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(va8 va8Var) {
        SortedJoinSubscription sortedJoinSubscription = new SortedJoinSubscription(va8Var, this.source.parallelism(), this.comparator);
        va8Var.onSubscribe(sortedJoinSubscription);
        this.source.subscribe(sortedJoinSubscription.subscribers);
    }
}
