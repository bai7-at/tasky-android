package com.datadog.android.core.internal.thread;

import com.chartbeat.androidsdk.QueryKeys;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.BackPressureMitigation;
import defpackage.du8;
import defpackage.j30;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.zq3;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes2.dex */
public final class BackPressuredBlockingQueue<E> extends LinkedBlockingQueue<E> {
    private final j30 backPressureStrategy;
    private final String executorContext;
    private final InternalLogger logger;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BackPressureMitigation.values().length];
            try {
                iArr[BackPressureMitigation.DROP_OLDEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BackPressureMitigation.IGNORE_NEWEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackPressuredBlockingQueue(InternalLogger internalLogger, String str, j30 j30Var) {
        super(j30Var.b());
        zq3.h(internalLogger, "logger");
        zq3.h(str, "executorContext");
        zq3.h(j30Var, "backPressureStrategy");
        this.logger = internalLogger;
        this.executorContext = str;
        this.backPressureStrategy = j30Var;
    }

    private final boolean e(Object obj, ss2 ss2Var) {
        int remainingCapacity = remainingCapacity();
        if (remainingCapacity != 0) {
            if (remainingCapacity == 1) {
                j();
            }
            return ((Boolean) ss2Var.invoke(obj)).booleanValue();
        }
        int i = a.a[this.backPressureStrategy.a().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            g(obj);
            return true;
        }
        E take = take();
        zq3.g(take, "first");
        g(take);
        return ((Boolean) ss2Var.invoke(obj)).booleanValue();
    }

    private final void g(final Object obj) {
        this.backPressureStrategy.c().invoke(obj);
        this.logger.b(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.thread.BackPressuredBlockingQueue$onItemDropped$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return "Dropped item in BackPressuredBlockingQueue queue: " + obj;
            }
        }, null, false, t.m(du8.a("backpressure.capacity", Integer.valueOf(this.backPressureStrategy.b())), du8.a("executor.context", this.executorContext)));
    }

    private final void j() {
        this.backPressureStrategy.d().mo865invoke();
        this.logger.c(InternalLogger.Level.WARN, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.thread.BackPressuredBlockingQueue$onThresholdReached$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                j30 j30Var;
                j30Var = ((BackPressuredBlockingQueue) BackPressuredBlockingQueue.this).backPressureStrategy;
                return "BackPressuredBlockingQueue reached capacity:" + j30Var.b();
            }
        }, null, false, t.m(du8.a("backpressure.capacity", Integer.valueOf(this.backPressureStrategy.b())), du8.a("executor.context", this.executorContext)));
    }

    public /* bridge */ int f() {
        return super.size();
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(Object obj) {
        zq3.h(obj, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING);
        return e(obj, new ss2() { // from class: com.datadog.android.core.internal.thread.BackPressuredBlockingQueue$offer$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj2) {
                boolean offer;
                zq3.h(obj2, "it");
                offer = super/*java.util.concurrent.LinkedBlockingQueue*/.offer(obj2);
                return Boolean.valueOf(offer);
            }
        });
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
    public boolean offer(Object obj, long j, TimeUnit timeUnit) {
        zq3.h(obj, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING);
        if (!super.offer(obj, j, timeUnit)) {
            return offer(obj);
        }
        if (remainingCapacity() != 0) {
            return true;
        }
        j();
        return true;
    }
}
