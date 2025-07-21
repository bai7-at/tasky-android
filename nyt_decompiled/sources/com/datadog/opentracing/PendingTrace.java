package com.datadog.opentracing;

import defpackage.kz4;
import defpackage.pp0;
import defpackage.tl0;
import java.io.Closeable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class PendingTrace extends LinkedList<com.datadog.opentracing.a> {
    private static final AtomicReference a = new AtomicReference();
    private final BigInteger traceId;
    private final com.datadog.opentracing.b tracer;
    private final ReferenceQueue referenceQueue = new ReferenceQueue();
    private final Set<WeakReference<?>> weakReferences = Collections.newSetFromMap(new ConcurrentHashMap());
    private final AtomicInteger pendingReferenceCount = new AtomicInteger(0);
    private final AtomicInteger completedSpanCount = new AtomicInteger(0);
    private final AtomicReference<WeakReference<com.datadog.opentracing.a>> rootSpan = new AtomicReference<>();
    private final AtomicBoolean isWritten = new AtomicBoolean(false);
    private final long startTimeNano = tl0.c();
    private final long startNanoTicks = tl0.b();

    private static class a implements Runnable, Closeable {
        private final Set a = Collections.newSetFromMap(new ConcurrentHashMap());

        public a() {
            pp0.b.b(b.a, this, 0L, 1L, TimeUnit.SECONDS, "Pending trace cleaner");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            run();
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((PendingTrace) it2.next()).f();
            }
        }
    }

    private static class b implements pp0.c {
        static final b a = new b();

        private b() {
        }

        @Override // pp0.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(a aVar) {
            aVar.run();
        }
    }

    PendingTrace(com.datadog.opentracing.b bVar, BigInteger bigInteger) {
        this.tracer = bVar;
        this.traceId = bigInteger;
        c();
    }

    private void c() {
        a aVar = (a) a.get();
        if (aVar != null) {
            aVar.a.add(this);
        }
    }

    static void close() {
        a aVar = (a) a.getAndSet(null);
        if (aVar != null) {
            aVar.close();
        }
    }

    private void k() {
        if (this.pendingReferenceCount.decrementAndGet() == 0) {
            v();
            return;
        }
        if (this.tracer.s() <= 0 || size() <= this.tracer.s()) {
            return;
        }
        synchronized (this) {
            try {
                if (size() > this.tracer.s()) {
                    com.datadog.opentracing.a p = p();
                    ArrayList arrayList = new ArrayList(size());
                    Iterator<com.datadog.opentracing.a> it2 = iterator();
                    while (it2.hasNext()) {
                        com.datadog.opentracing.a next = it2.next();
                        if (next != p) {
                            arrayList.add(next);
                            this.completedSpanCount.decrementAndGet();
                            it2.remove();
                        }
                    }
                    this.tracer.X(arrayList);
                }
            } finally {
            }
        }
    }

    private void n(com.datadog.opentracing.a aVar, boolean z) {
        if (this.traceId == null || aVar.f() == null || !this.traceId.equals(aVar.f().o())) {
            return;
        }
        synchronized (aVar) {
            try {
                if (aVar.g == null) {
                    return;
                }
                this.weakReferences.remove(aVar.g);
                aVar.g.clear();
                aVar.g = null;
                if (z) {
                    k();
                } else {
                    this.pendingReferenceCount.decrementAndGet();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void q() {
        a aVar = (a) a.getAndSet(new a());
        if (aVar != null) {
            aVar.close();
        }
    }

    private void u() {
        a aVar = (a) a.get();
        if (aVar != null) {
            aVar.a.remove(this);
        }
    }

    private synchronized void v() {
        if (this.isWritten.compareAndSet(false, true)) {
            u();
            if (!isEmpty()) {
                this.tracer.X(this);
            }
        }
    }

    @Override // java.util.LinkedList, java.util.Deque
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void addFirst(com.datadog.opentracing.a aVar) {
        synchronized (this) {
            super.addFirst(aVar);
        }
        this.completedSpanCount.incrementAndGet();
    }

    public void e(com.datadog.opentracing.a aVar) {
        synchronized (this) {
            try {
                if (aVar.n() == 0) {
                    return;
                }
                if (this.traceId != null && aVar.f() != null) {
                    if (this.traceId.equals(aVar.y())) {
                        if (!this.isWritten.get()) {
                            addFirst(aVar);
                        }
                        n(aVar, true);
                    }
                }
            } finally {
            }
        }
    }

    public synchronized boolean f() {
        int i;
        i = 0;
        while (true) {
            try {
                Reference poll = this.referenceQueue.poll();
                if (poll == null) {
                    break;
                }
                this.weakReferences.remove(poll);
                if (this.isWritten.compareAndSet(false, true)) {
                    u();
                    this.tracer.N0();
                }
                i++;
                k();
            } catch (Throwable th) {
                throw th;
            }
        }
        return i > 0;
    }

    public void g(com.datadog.opentracing.a aVar) {
        n(aVar, false);
    }

    public long o() {
        return this.startTimeNano + Math.max(0L, tl0.b() - this.startNanoTicks);
    }

    public com.datadog.opentracing.a p() {
        WeakReference<com.datadog.opentracing.a> weakReference = this.rootSpan.get();
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public int size() {
        return this.completedSpanCount.get();
    }

    public void t(com.datadog.opentracing.a aVar) {
        if (this.traceId == null || aVar.f() == null || !this.traceId.equals(aVar.f().o())) {
            return;
        }
        kz4.a(this.rootSpan, null, new WeakReference(aVar));
        synchronized (aVar) {
            try {
                if (aVar.g == null) {
                    aVar.g = new WeakReference(aVar, this.referenceQueue);
                    this.weakReferences.add(aVar.g);
                    this.pendingReferenceCount.incrementAndGet();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
