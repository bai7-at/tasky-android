package com.nytimes.android.external.cache3;

import com.amazonaws.services.s3.model.InstructionFileId;
import com.nytimes.android.external.cache3.CacheBuilder;
import com.nytimes.android.external.cache3.CacheLoader;
import defpackage.a74;
import defpackage.cg9;
import defpackage.dg0;
import defpackage.e16;
import defpackage.hp2;
import defpackage.hw6;
import defpackage.i64;
import defpackage.iw6;
import defpackage.jt2;
import defpackage.ql8;
import defpackage.tw8;
import defpackage.x1;
import defpackage.y18;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
class LocalCache extends AbstractMap implements ConcurrentMap {
    static final Logger B = Logger.getLogger(LocalCache.class.getName());
    static final t H = new a();
    static final Queue L = new b();
    final int a;
    final int b;
    final Segment[] c;
    final int d;
    final Equivalence e;
    final Equivalence f;
    final Strength g;
    final Strength h;
    final long i;
    final cg9 j;
    final long k;
    final long l;
    final long m;
    final Queue n;
    final hw6 r;
    final ql8 s;
    final EntryFactory t;
    final CacheLoader u;
    Set w;
    Collection x;
    Set y;

    enum EntryFactory {
        STRONG { // from class: com.nytimes.android.external.cache3.LocalCache.EntryFactory.1
            @Override // com.nytimes.android.external.cache3.LocalCache.EntryFactory
            <K, V> l newEntry(Segment<K, V> segment, K k, int i, l lVar) {
                return new p(k, i, lVar);
            }
        },
        STRONG_ACCESS { // from class: com.nytimes.android.external.cache3.LocalCache.EntryFactory.2
            @Override // com.nytimes.android.external.cache3.LocalCache.EntryFactory
            <K, V> l copyEntry(Segment<K, V> segment, l lVar, l lVar2) {
                l copyEntry = super.copyEntry(segment, lVar, lVar2);
                copyAccessEntry(lVar, copyEntry);
                return copyEntry;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.EntryFactory
            <K, V> l newEntry(Segment<K, V> segment, K k, int i, l lVar) {
                return new n(k, i, lVar);
            }
        },
        STRONG_WRITE { // from class: com.nytimes.android.external.cache3.LocalCache.EntryFactory.3
            @Override // com.nytimes.android.external.cache3.LocalCache.EntryFactory
            <K, V> l copyEntry(Segment<K, V> segment, l lVar, l lVar2) {
                l copyEntry = super.copyEntry(segment, lVar, lVar2);
                copyWriteEntry(lVar, copyEntry);
                return copyEntry;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.EntryFactory
            <K, V> l newEntry(Segment<K, V> segment, K k, int i, l lVar) {
                return new r(k, i, lVar);
            }
        },
        STRONG_ACCESS_WRITE { // from class: com.nytimes.android.external.cache3.LocalCache.EntryFactory.4
            @Override // com.nytimes.android.external.cache3.LocalCache.EntryFactory
            <K, V> l copyEntry(Segment<K, V> segment, l lVar, l lVar2) {
                l copyEntry = super.copyEntry(segment, lVar, lVar2);
                copyAccessEntry(lVar, copyEntry);
                copyWriteEntry(lVar, copyEntry);
                return copyEntry;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.EntryFactory
            <K, V> l newEntry(Segment<K, V> segment, K k, int i, l lVar) {
                return new o(k, i, lVar);
            }
        },
        WEAK { // from class: com.nytimes.android.external.cache3.LocalCache.EntryFactory.5
            @Override // com.nytimes.android.external.cache3.LocalCache.EntryFactory
            <K, V> l newEntry(Segment<K, V> segment, K k, int i, l lVar) {
                return new x(segment.keyReferenceQueue, k, i, lVar);
            }
        },
        WEAK_ACCESS { // from class: com.nytimes.android.external.cache3.LocalCache.EntryFactory.6
            @Override // com.nytimes.android.external.cache3.LocalCache.EntryFactory
            <K, V> l copyEntry(Segment<K, V> segment, l lVar, l lVar2) {
                l copyEntry = super.copyEntry(segment, lVar, lVar2);
                copyAccessEntry(lVar, copyEntry);
                return copyEntry;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.EntryFactory
            <K, V> l newEntry(Segment<K, V> segment, K k, int i, l lVar) {
                return new v(segment.keyReferenceQueue, k, i, lVar);
            }
        },
        WEAK_WRITE { // from class: com.nytimes.android.external.cache3.LocalCache.EntryFactory.7
            @Override // com.nytimes.android.external.cache3.LocalCache.EntryFactory
            <K, V> l copyEntry(Segment<K, V> segment, l lVar, l lVar2) {
                l copyEntry = super.copyEntry(segment, lVar, lVar2);
                copyWriteEntry(lVar, copyEntry);
                return copyEntry;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.EntryFactory
            <K, V> l newEntry(Segment<K, V> segment, K k, int i, l lVar) {
                return new z(segment.keyReferenceQueue, k, i, lVar);
            }
        },
        WEAK_ACCESS_WRITE { // from class: com.nytimes.android.external.cache3.LocalCache.EntryFactory.8
            @Override // com.nytimes.android.external.cache3.LocalCache.EntryFactory
            <K, V> l copyEntry(Segment<K, V> segment, l lVar, l lVar2) {
                l copyEntry = super.copyEntry(segment, lVar, lVar2);
                copyAccessEntry(lVar, copyEntry);
                copyWriteEntry(lVar, copyEntry);
                return copyEntry;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.EntryFactory
            <K, V> l newEntry(Segment<K, V> segment, K k, int i, l lVar) {
                return new w(segment.keyReferenceQueue, k, i, lVar);
            }
        };

        static final int ACCESS_MASK = 1;
        static final int WEAK_MASK = 4;
        static final int WRITE_MASK = 2;
        static final EntryFactory[] factories = {STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};

        /* JADX WARN: Multi-variable type inference failed */
        static EntryFactory getFactory(Strength strength, boolean z, boolean z2) {
            return factories[(strength == Strength.WEAK ? (char) 4 : (char) 0) | (z ? 1 : 0) | (z2 ? 2 : 0)];
        }

        <K, V> void copyAccessEntry(l lVar, l lVar2) {
            lVar2.setAccessTime(lVar.getAccessTime());
            LocalCache.c(lVar.getPreviousInAccessQueue(), lVar2);
            LocalCache.c(lVar2, lVar.getNextInAccessQueue());
            LocalCache.x(lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        <K, V> l copyEntry(Segment<K, V> segment, l lVar, l lVar2) {
            return newEntry(segment, lVar.getKey(), lVar.getHash(), lVar2);
        }

        <K, V> void copyWriteEntry(l lVar, l lVar2) {
            lVar2.setWriteTime(lVar.getWriteTime());
            LocalCache.d(lVar.getPreviousInWriteQueue(), lVar2);
            LocalCache.d(lVar2, lVar.getNextInWriteQueue());
            LocalCache.y(lVar);
        }

        abstract <K, V> l newEntry(Segment<K, V> segment, K k, int i, l lVar);

        /* synthetic */ EntryFactory(a aVar) {
            this();
        }
    }

    static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements a74, Serializable {
        private static final long serialVersionUID = 1;
        transient a74 b;

        LoadingSerializationProxy(LocalCache localCache) {
            super(localCache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.b = h().b(this.loader);
        }

        private Object readResolve() {
            return this.b;
        }

        @Override // defpackage.a74
        public Object a(Object obj) {
            return this.b.a(obj);
        }

        @Override // defpackage.a74, defpackage.jt2
        public final Object apply(Object obj) {
            return this.b.apply(obj);
        }
    }

    static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements a74 {
        private static final long serialVersionUID = 1;

        LocalLoadingCache(CacheBuilder cacheBuilder, CacheLoader cacheLoader) {
            super(new LocalCache(cacheBuilder, (CacheLoader) e16.d(cacheLoader)), null);
        }

        @Override // defpackage.a74
        public Object a(Object obj) {
            try {
                return f(obj);
            } catch (ExecutionException e) {
                throw new UncheckedExecutionException(e.getCause());
            }
        }

        @Override // defpackage.a74, defpackage.jt2
        public final Object apply(Object obj) {
            return a(obj);
        }

        public Object f(Object obj) {
            return this.localCache.r(obj);
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.LocalManualCache
        Object writeReplace() {
            return new LoadingSerializationProxy(this.localCache);
        }
    }

    static class LocalManualCache<K, V> implements dg0, Serializable {
        private static final long serialVersionUID = 1;
        final LocalCache localCache;

        class a extends CacheLoader {
            final /* synthetic */ Callable a;

            a(Callable callable) {
                this.a = callable;
            }

            @Override // com.nytimes.android.external.cache3.CacheLoader
            public Object a(Object obj) {
                return this.a.call();
            }
        }

        /* synthetic */ LocalManualCache(LocalCache localCache, a aVar) {
            this(localCache);
        }

        @Override // defpackage.dg0
        public Object b(Object obj, Callable callable) {
            e16.d(callable);
            return this.localCache.n(obj, new a(callable));
        }

        @Override // defpackage.dg0
        public ConcurrentMap c() {
            return this.localCache;
        }

        @Override // defpackage.dg0
        public void d(Object obj) {
            e16.d(obj);
            this.localCache.remove(obj);
        }

        @Override // defpackage.dg0
        public Object e(Object obj) {
            return this.localCache.o(obj);
        }

        @Override // defpackage.dg0
        public void put(Object obj, Object obj2) {
            this.localCache.put(obj, obj2);
        }

        Object writeReplace() {
            return new ManualSerializationProxy(this.localCache);
        }

        LocalManualCache(CacheBuilder cacheBuilder) {
            this(new LocalCache(cacheBuilder, null));
        }

        private LocalManualCache(LocalCache localCache) {
            this.localCache = localCache;
        }
    }

    static class ManualSerializationProxy<K, V> extends hp2 implements Serializable {
        private static final long serialVersionUID = 1;
        transient dg0 a;
        final int concurrencyLevel;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final Equivalence keyEquivalence;
        final Strength keyStrength;
        final CacheLoader loader;
        final long maxWeight;
        final hw6 removalListener;
        final ql8 ticker;
        final Equivalence valueEquivalence;
        final Strength valueStrength;
        final cg9 weigher;

        ManualSerializationProxy(LocalCache localCache) {
            this(localCache.g, localCache.h, localCache.e, localCache.f, localCache.l, localCache.k, localCache.i, localCache.j, localCache.d, localCache.r, localCache.s, localCache.u);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.a = h().a();
        }

        private Object readResolve() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.lp2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public dg0 f() {
            return this.a;
        }

        CacheBuilder h() {
            CacheBuilder y = CacheBuilder.x().z(this.keyStrength).A(this.valueStrength).u(this.keyEquivalence).C(this.valueEquivalence).e(this.concurrencyLevel).y(this.removalListener);
            y.a = false;
            long j = this.expireAfterWriteNanos;
            if (j > 0) {
                y.g(j, TimeUnit.NANOSECONDS);
            }
            long j2 = this.expireAfterAccessNanos;
            if (j2 > 0) {
                y.f(j2, TimeUnit.NANOSECONDS);
            }
            cg9 cg9Var = this.weigher;
            if (cg9Var != CacheBuilder.OneWeigher.INSTANCE) {
                y.D(cg9Var);
                long j3 = this.maxWeight;
                if (j3 != -1) {
                    y.w(j3);
                }
            } else {
                long j4 = this.maxWeight;
                if (j4 != -1) {
                    y.v(j4);
                }
            }
            ql8 ql8Var = this.ticker;
            if (ql8Var != null) {
                y.B(ql8Var);
            }
            return y;
        }

        private ManualSerializationProxy(Strength strength, Strength strength2, Equivalence equivalence, Equivalence equivalence2, long j, long j2, long j3, cg9 cg9Var, int i, hw6 hw6Var, ql8 ql8Var, CacheLoader cacheLoader) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.expireAfterWriteNanos = j;
            this.expireAfterAccessNanos = j2;
            this.maxWeight = j3;
            this.weigher = cg9Var;
            this.concurrencyLevel = i;
            this.removalListener = hw6Var;
            this.ticker = (ql8Var == ql8.b() || ql8Var == CacheBuilder.p) ? null : ql8Var;
            this.loader = cacheLoader;
        }
    }

    private enum NullEntry implements l {
        INSTANCE;

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public int getHash() {
            return 0;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public Object getKey() {
            return null;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public l getNext() {
            return null;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public l getNextInAccessQueue() {
            return this;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public l getNextInWriteQueue() {
            return this;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public l getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public l getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public t getValueReference() {
            return null;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setAccessTime(long j) {
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setNextInAccessQueue(l lVar) {
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setNextInWriteQueue(l lVar) {
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setPreviousInAccessQueue(l lVar) {
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setPreviousInWriteQueue(l lVar) {
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setValueReference(t tVar) {
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setWriteTime(long j) {
        }
    }

    static class Segment<K, V> extends ReentrantLock {
        final Queue<l> accessQueue;
        volatile int count;
        final ReferenceQueue<K> keyReferenceQueue;
        final LocalCache map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<l> recencyQueue;
        volatile AtomicReferenceArray<l> table;
        int threshold;
        long totalWeight;
        final ReferenceQueue<V> valueReferenceQueue;
        final Queue<l> writeQueue;

        class a implements Runnable {
            final /* synthetic */ Object a;
            final /* synthetic */ int b;
            final /* synthetic */ k c;
            final /* synthetic */ i64 d;

            a(Object obj, int i, k kVar, i64 i64Var) {
                this.a = obj;
                this.b = i;
                this.c = kVar;
                this.d = i64Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Segment.this.s(this.a, this.b, this.c, this.d);
                } catch (Throwable th) {
                    LocalCache.B.log(Level.WARNING, "Exception thrown during refresh", th);
                    this.c.k(th);
                }
            }
        }

        Segment(LocalCache localCache, int i, long j) {
            this.map = localCache;
            this.maxSegmentWeight = j;
            y(E(i));
            this.keyReferenceQueue = localCache.N() ? new ReferenceQueue<>() : null;
            this.valueReferenceQueue = localCache.O() ? new ReferenceQueue<>() : null;
            this.recencyQueue = localCache.M() ? new ConcurrentLinkedQueue<>() : LocalCache.i();
            this.writeQueue = localCache.Q() ? new d0() : LocalCache.i();
            this.accessQueue = localCache.M() ? new e() : LocalCache.i();
        }

        i64 A(Object obj, int i, k kVar, CacheLoader cacheLoader) {
            i64 i2 = kVar.i(obj, cacheLoader);
            i2.a(new a(obj, i, kVar, i2), DirectExecutor.INSTANCE);
            return i2;
        }

        Object B(Object obj, int i, k kVar, CacheLoader cacheLoader) {
            return s(obj, i, kVar, kVar.i(obj, cacheLoader));
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
        
            if (r6 == false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
        
            r11 = new com.nytimes.android.external.cache3.LocalCache.k();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
        
            if (r10 != null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
        
            r10 = D(r17, r18, r9);
            r10.setValueReference(r11);
            r7.set(r8, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
        
            r10.setValueReference(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
        
            unlock();
            G();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
        
            if (r6 == false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
        
            r0 = B(r17, r18, r11, r19);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
        
            monitor-exit(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
        
            return f0(r10, r17, r13);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object C(java.lang.Object r17, int r18, com.nytimes.android.external.cache3.CacheLoader r19) {
            /*
                r16 = this;
                r1 = r16
                r0 = r17
                r2 = r18
                r16.lock()
                com.nytimes.android.external.cache3.LocalCache r3 = r1.map     // Catch: java.lang.Throwable -> L58
                ql8 r3 = r3.s     // Catch: java.lang.Throwable -> L58
                long r3 = r3.a()     // Catch: java.lang.Throwable -> L58
                r1.H(r3)     // Catch: java.lang.Throwable -> L58
                int r5 = r1.count     // Catch: java.lang.Throwable -> L58
                r6 = 1
                int r5 = r5 - r6
                java.util.concurrent.atomic.AtomicReferenceArray<com.nytimes.android.external.cache3.LocalCache$l> r7 = r1.table     // Catch: java.lang.Throwable -> L58
                int r8 = r7.length()     // Catch: java.lang.Throwable -> L58
                int r8 = r8 - r6
                r8 = r8 & r2
                java.lang.Object r9 = r7.get(r8)     // Catch: java.lang.Throwable -> L58
                com.nytimes.android.external.cache3.LocalCache$l r9 = (com.nytimes.android.external.cache3.LocalCache.l) r9     // Catch: java.lang.Throwable -> L58
                r10 = r9
            L27:
                r11 = 0
                if (r10 == 0) goto L83
                java.lang.Object r12 = r10.getKey()     // Catch: java.lang.Throwable -> L58
                int r13 = r10.getHash()     // Catch: java.lang.Throwable -> L58
                if (r13 != r2) goto L7e
                if (r12 == 0) goto L7e
                com.nytimes.android.external.cache3.LocalCache r13 = r1.map     // Catch: java.lang.Throwable -> L58
                com.nytimes.android.external.cache3.Equivalence r13 = r13.e     // Catch: java.lang.Throwable -> L58
                boolean r13 = r13.d(r0, r12)     // Catch: java.lang.Throwable -> L58
                if (r13 == 0) goto L7e
                com.nytimes.android.external.cache3.LocalCache$t r13 = r10.getValueReference()     // Catch: java.lang.Throwable -> L58
                boolean r14 = r13.b()     // Catch: java.lang.Throwable -> L58
                if (r14 == 0) goto L4c
                r6 = 0
                goto L84
            L4c:
                java.lang.Object r14 = r13.get()     // Catch: java.lang.Throwable -> L58
                if (r14 != 0) goto L5a
                com.nytimes.android.external.cache3.RemovalCause r3 = com.nytimes.android.external.cache3.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L58
                r1.m(r12, r2, r13, r3)     // Catch: java.lang.Throwable -> L58
                goto L67
            L58:
                r0 = move-exception
                goto Lb4
            L5a:
                com.nytimes.android.external.cache3.LocalCache r15 = r1.map     // Catch: java.lang.Throwable -> L58
                boolean r15 = r15.t(r10, r3)     // Catch: java.lang.Throwable -> L58
                if (r15 == 0) goto L74
                com.nytimes.android.external.cache3.RemovalCause r3 = com.nytimes.android.external.cache3.RemovalCause.EXPIRED     // Catch: java.lang.Throwable -> L58
                r1.m(r12, r2, r13, r3)     // Catch: java.lang.Throwable -> L58
            L67:
                java.util.Queue<com.nytimes.android.external.cache3.LocalCache$l> r3 = r1.writeQueue     // Catch: java.lang.Throwable -> L58
                r3.remove(r10)     // Catch: java.lang.Throwable -> L58
                java.util.Queue<com.nytimes.android.external.cache3.LocalCache$l> r3 = r1.accessQueue     // Catch: java.lang.Throwable -> L58
                r3.remove(r10)     // Catch: java.lang.Throwable -> L58
                r1.count = r5     // Catch: java.lang.Throwable -> L58
                goto L84
            L74:
                r1.L(r10, r3)     // Catch: java.lang.Throwable -> L58
                r16.unlock()
                r16.G()
                return r14
            L7e:
                com.nytimes.android.external.cache3.LocalCache$l r10 = r10.getNext()     // Catch: java.lang.Throwable -> L58
                goto L27
            L83:
                r13 = r11
            L84:
                if (r6 == 0) goto L9b
                com.nytimes.android.external.cache3.LocalCache$k r11 = new com.nytimes.android.external.cache3.LocalCache$k     // Catch: java.lang.Throwable -> L58
                r11.<init>()     // Catch: java.lang.Throwable -> L58
                if (r10 != 0) goto L98
                com.nytimes.android.external.cache3.LocalCache$l r10 = r1.D(r0, r2, r9)     // Catch: java.lang.Throwable -> L58
                r10.setValueReference(r11)     // Catch: java.lang.Throwable -> L58
                r7.set(r8, r10)     // Catch: java.lang.Throwable -> L58
                goto L9b
            L98:
                r10.setValueReference(r11)     // Catch: java.lang.Throwable -> L58
            L9b:
                r16.unlock()
                r16.G()
                if (r6 == 0) goto Laf
                monitor-enter(r10)
                r3 = r19
                java.lang.Object r0 = r1.B(r0, r2, r11, r3)     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lac
                return r0
            Lac:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lac
                throw r0
            Laf:
                java.lang.Object r0 = r1.f0(r10, r0, r13)
                return r0
            Lb4:
                r16.unlock()
                r16.G()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache3.LocalCache.Segment.C(java.lang.Object, int, com.nytimes.android.external.cache3.CacheLoader):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        l D(Object obj, int i, l lVar) {
            return this.map.t.newEntry(this, e16.d(obj), i, lVar);
        }

        AtomicReferenceArray E(int i) {
            return new AtomicReferenceArray(i);
        }

        void F() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                a();
            }
        }

        void G() {
            Z();
        }

        void H(long j) {
            Y(j);
        }

        Object I(Object obj, int i, Object obj2, boolean z) {
            int i2;
            lock();
            try {
                long a2 = this.map.s.a();
                H(a2);
                if (this.count + 1 > this.threshold) {
                    o();
                }
                AtomicReferenceArray<l> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                l lVar = atomicReferenceArray.get(length);
                l lVar2 = lVar;
                while (true) {
                    if (lVar2 == null) {
                        this.modCount++;
                        l D = D(obj, i, lVar);
                        b0(D, obj, obj2, a2);
                        atomicReferenceArray.set(length, D);
                        this.count++;
                        n(D);
                        break;
                    }
                    Object key = lVar2.getKey();
                    if (lVar2.getHash() == i && key != null && this.map.e.d(obj, key)) {
                        t valueReference = lVar2.getValueReference();
                        Object obj3 = valueReference.get();
                        if (obj3 != null) {
                            if (z) {
                                L(lVar2, a2);
                            } else {
                                this.modCount++;
                                m(obj, i, valueReference, RemovalCause.REPLACED);
                                b0(lVar2, obj, obj2, a2);
                                n(lVar2);
                            }
                            unlock();
                            G();
                            return obj3;
                        }
                        this.modCount++;
                        if (valueReference.isActive()) {
                            m(obj, i, valueReference, RemovalCause.COLLECTED);
                            b0(lVar2, obj, obj2, a2);
                            i2 = this.count;
                        } else {
                            b0(lVar2, obj, obj2, a2);
                            i2 = this.count + 1;
                        }
                        this.count = i2;
                        n(lVar2);
                    } else {
                        lVar2 = lVar2.getNext();
                    }
                }
                unlock();
                G();
                return null;
            } catch (Throwable th) {
                unlock();
                G();
                throw th;
            }
        }

        boolean J(l lVar, int i) {
            lock();
            try {
                AtomicReferenceArray<l> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                l lVar2 = atomicReferenceArray.get(length);
                for (l lVar3 = lVar2; lVar3 != null; lVar3 = lVar3.getNext()) {
                    if (lVar3 == lVar) {
                        this.modCount++;
                        l V = V(lVar2, lVar3, lVar3.getKey(), i, lVar3.getValueReference(), RemovalCause.COLLECTED);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, V);
                        this.count = i2;
                        return true;
                    }
                }
                unlock();
                G();
                return false;
            } finally {
                unlock();
                G();
            }
        }

        boolean K(Object obj, int i, t tVar) {
            lock();
            try {
                AtomicReferenceArray<l> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                l lVar = atomicReferenceArray.get(length);
                for (l lVar2 = lVar; lVar2 != null; lVar2 = lVar2.getNext()) {
                    Object key = lVar2.getKey();
                    if (lVar2.getHash() == i && key != null && this.map.e.d(obj, key)) {
                        if (lVar2.getValueReference() != tVar) {
                            unlock();
                            if (!isHeldByCurrentThread()) {
                                G();
                            }
                            return false;
                        }
                        this.modCount++;
                        l V = V(lVar, lVar2, key, i, tVar, RemovalCause.COLLECTED);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, V);
                        this.count = i2;
                        return true;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    G();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    G();
                }
            }
        }

        void L(l lVar, long j) {
            if (this.map.C()) {
                lVar.setAccessTime(j);
            }
            this.accessQueue.add(lVar);
        }

        void M(l lVar, long j) {
            if (this.map.C()) {
                lVar.setAccessTime(j);
            }
            this.recencyQueue.add(lVar);
        }

        void N(l lVar, int i, long j) {
            i();
            this.totalWeight += i;
            if (this.map.C()) {
                lVar.setAccessTime(j);
            }
            if (this.map.E()) {
                lVar.setWriteTime(j);
            }
            this.accessQueue.add(lVar);
            this.writeQueue.add(lVar);
        }

        Object O(Object obj, int i, CacheLoader cacheLoader, boolean z) {
            k z2 = z(obj, i, z);
            if (z2 == null) {
                return null;
            }
            i64 A = A(obj, i, z2, cacheLoader);
            if (A.isDone()) {
                try {
                    return tw8.a(A);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        
            r8 = r5.getValueReference();
            r11 = r8.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (r11 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            r2 = com.nytimes.android.external.cache3.RemovalCause.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        
            r9 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        
            r10.modCount++;
            r12 = V(r4, r5, r6, r12, r8, r9);
            r2 = r10.count - 1;
            r0.set(r1, r12);
            r10.count = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        
            unlock();
            G();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        
            if (r8.isActive() == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r2 = com.nytimes.android.external.cache3.RemovalCause.COLLECTED;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object P(java.lang.Object r11, int r12) {
            /*
                r10 = this;
                r10.lock()
                com.nytimes.android.external.cache3.LocalCache r0 = r10.map     // Catch: java.lang.Throwable -> L46
                ql8 r0 = r0.s     // Catch: java.lang.Throwable -> L46
                long r0 = r0.a()     // Catch: java.lang.Throwable -> L46
                r10.H(r0)     // Catch: java.lang.Throwable -> L46
                java.util.concurrent.atomic.AtomicReferenceArray<com.nytimes.android.external.cache3.LocalCache$l> r0 = r10.table     // Catch: java.lang.Throwable -> L46
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L46
                int r1 = r1 + (-1)
                r1 = r1 & r12
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L46
                r4 = r2
                com.nytimes.android.external.cache3.LocalCache$l r4 = (com.nytimes.android.external.cache3.LocalCache.l) r4     // Catch: java.lang.Throwable -> L46
                r5 = r4
            L1f:
                r2 = 0
                if (r5 == 0) goto L6d
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L46
                int r3 = r5.getHash()     // Catch: java.lang.Throwable -> L46
                if (r3 != r12) goto L74
                if (r6 == 0) goto L74
                com.nytimes.android.external.cache3.LocalCache r3 = r10.map     // Catch: java.lang.Throwable -> L46
                com.nytimes.android.external.cache3.Equivalence r3 = r3.e     // Catch: java.lang.Throwable -> L46
                boolean r3 = r3.d(r11, r6)     // Catch: java.lang.Throwable -> L46
                if (r3 == 0) goto L74
                com.nytimes.android.external.cache3.LocalCache$t r8 = r5.getValueReference()     // Catch: java.lang.Throwable -> L46
                java.lang.Object r11 = r8.get()     // Catch: java.lang.Throwable -> L46
                if (r11 == 0) goto L48
                com.nytimes.android.external.cache3.RemovalCause r2 = com.nytimes.android.external.cache3.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L46
            L44:
                r9 = r2
                goto L51
            L46:
                r11 = move-exception
                goto L79
            L48:
                boolean r3 = r8.isActive()     // Catch: java.lang.Throwable -> L46
                if (r3 == 0) goto L6d
                com.nytimes.android.external.cache3.RemovalCause r2 = com.nytimes.android.external.cache3.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L46
                goto L44
            L51:
                int r2 = r10.modCount     // Catch: java.lang.Throwable -> L46
                int r2 = r2 + 1
                r10.modCount = r2     // Catch: java.lang.Throwable -> L46
                r3 = r10
                r7 = r12
                com.nytimes.android.external.cache3.LocalCache$l r12 = r3.V(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L46
                int r2 = r10.count     // Catch: java.lang.Throwable -> L46
                int r2 = r2 + (-1)
                r0.set(r1, r12)     // Catch: java.lang.Throwable -> L46
                r10.count = r2     // Catch: java.lang.Throwable -> L46
                r10.unlock()
                r10.G()
                return r11
            L6d:
                r10.unlock()
                r10.G()
                return r2
            L74:
                com.nytimes.android.external.cache3.LocalCache$l r5 = r5.getNext()     // Catch: java.lang.Throwable -> L46
                goto L1f
            L79:
                r10.unlock()
                r10.G()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache3.LocalCache.Segment.P(java.lang.Object, int):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        
            r9 = r6.getValueReference();
            r12 = r9.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (r11.map.f.d(r14, r12) == false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            r12 = com.nytimes.android.external.cache3.RemovalCause.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        
            r11.modCount++;
            r13 = V(r5, r6, r7, r13, r9, r12);
            r14 = r11.count - 1;
            r0.set(r1, r13);
            r11.count = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
        
            if (r12 != com.nytimes.android.external.cache3.RemovalCause.EXPLICIT) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
        
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
        
            unlock();
            G();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        
            if (r12 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        
            if (r9.isActive() == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        
            r12 = com.nytimes.android.external.cache3.RemovalCause.COLLECTED;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean Q(java.lang.Object r12, int r13, java.lang.Object r14) {
            /*
                r11 = this;
                r11.lock()
                com.nytimes.android.external.cache3.LocalCache r0 = r11.map     // Catch: java.lang.Throwable -> L4d
                ql8 r0 = r0.s     // Catch: java.lang.Throwable -> L4d
                long r0 = r0.a()     // Catch: java.lang.Throwable -> L4d
                r11.H(r0)     // Catch: java.lang.Throwable -> L4d
                java.util.concurrent.atomic.AtomicReferenceArray<com.nytimes.android.external.cache3.LocalCache$l> r0 = r11.table     // Catch: java.lang.Throwable -> L4d
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L4d
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r13
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L4d
                r5 = r3
                com.nytimes.android.external.cache3.LocalCache$l r5 = (com.nytimes.android.external.cache3.LocalCache.l) r5     // Catch: java.lang.Throwable -> L4d
                r6 = r5
            L1f:
                r3 = 0
                if (r6 == 0) goto L7a
                java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L4d
                int r4 = r6.getHash()     // Catch: java.lang.Throwable -> L4d
                if (r4 != r13) goto L81
                if (r7 == 0) goto L81
                com.nytimes.android.external.cache3.LocalCache r4 = r11.map     // Catch: java.lang.Throwable -> L4d
                com.nytimes.android.external.cache3.Equivalence r4 = r4.e     // Catch: java.lang.Throwable -> L4d
                boolean r4 = r4.d(r12, r7)     // Catch: java.lang.Throwable -> L4d
                if (r4 == 0) goto L81
                com.nytimes.android.external.cache3.LocalCache$t r9 = r6.getValueReference()     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r12 = r9.get()     // Catch: java.lang.Throwable -> L4d
                com.nytimes.android.external.cache3.LocalCache r4 = r11.map     // Catch: java.lang.Throwable -> L4d
                com.nytimes.android.external.cache3.Equivalence r4 = r4.f     // Catch: java.lang.Throwable -> L4d
                boolean r14 = r4.d(r14, r12)     // Catch: java.lang.Throwable -> L4d
                if (r14 == 0) goto L4f
                com.nytimes.android.external.cache3.RemovalCause r12 = com.nytimes.android.external.cache3.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L4d
                goto L59
            L4d:
                r12 = move-exception
                goto L86
            L4f:
                if (r12 != 0) goto L7a
                boolean r12 = r9.isActive()     // Catch: java.lang.Throwable -> L4d
                if (r12 == 0) goto L7a
                com.nytimes.android.external.cache3.RemovalCause r12 = com.nytimes.android.external.cache3.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L4d
            L59:
                int r14 = r11.modCount     // Catch: java.lang.Throwable -> L4d
                int r14 = r14 + r2
                r11.modCount = r14     // Catch: java.lang.Throwable -> L4d
                r4 = r11
                r8 = r13
                r10 = r12
                com.nytimes.android.external.cache3.LocalCache$l r13 = r4.V(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4d
                int r14 = r11.count     // Catch: java.lang.Throwable -> L4d
                int r14 = r14 - r2
                r0.set(r1, r13)     // Catch: java.lang.Throwable -> L4d
                r11.count = r14     // Catch: java.lang.Throwable -> L4d
                com.nytimes.android.external.cache3.RemovalCause r13 = com.nytimes.android.external.cache3.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L4d
                if (r12 != r13) goto L72
                goto L73
            L72:
                r2 = r3
            L73:
                r11.unlock()
                r11.G()
                return r2
            L7a:
                r11.unlock()
                r11.G()
                return r3
            L81:
                com.nytimes.android.external.cache3.LocalCache$l r6 = r6.getNext()     // Catch: java.lang.Throwable -> L4d
                goto L1f
            L86:
                r11.unlock()
                r11.G()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache3.LocalCache.Segment.Q(java.lang.Object, int, java.lang.Object):boolean");
        }

        void R(l lVar) {
            l(lVar, RemovalCause.COLLECTED);
            this.writeQueue.remove(lVar);
            this.accessQueue.remove(lVar);
        }

        boolean S(l lVar, int i, RemovalCause removalCause) {
            AtomicReferenceArray<l> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            l lVar2 = atomicReferenceArray.get(length);
            for (l lVar3 = lVar2; lVar3 != null; lVar3 = lVar3.getNext()) {
                if (lVar3 == lVar) {
                    this.modCount++;
                    l V = V(lVar2, lVar3, lVar3.getKey(), i, lVar3.getValueReference(), removalCause);
                    int i2 = this.count - 1;
                    atomicReferenceArray.set(length, V);
                    this.count = i2;
                    return true;
                }
            }
            return false;
        }

        l T(l lVar, l lVar2) {
            int i = this.count;
            l next = lVar2.getNext();
            while (lVar != lVar2) {
                l g = g(lVar, next);
                if (g != null) {
                    next = g;
                } else {
                    R(lVar);
                    i--;
                }
                lVar = lVar.getNext();
            }
            this.count = i;
            return next;
        }

        boolean U(Object obj, int i, k kVar) {
            lock();
            try {
                AtomicReferenceArray<l> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                l lVar = atomicReferenceArray.get(length);
                l lVar2 = lVar;
                while (true) {
                    if (lVar2 == null) {
                        break;
                    }
                    Object key = lVar2.getKey();
                    if (lVar2.getHash() != i || key == null || !this.map.e.d(obj, key)) {
                        lVar2 = lVar2.getNext();
                    } else if (lVar2.getValueReference() == kVar) {
                        if (kVar.isActive()) {
                            lVar2.setValueReference(kVar.h());
                        } else {
                            atomicReferenceArray.set(length, T(lVar, lVar2));
                        }
                        unlock();
                        G();
                        return true;
                    }
                }
                unlock();
                G();
                return false;
            } catch (Throwable th) {
                unlock();
                G();
                throw th;
            }
        }

        l V(l lVar, l lVar2, Object obj, int i, t tVar, RemovalCause removalCause) {
            m(obj, i, tVar, removalCause);
            this.writeQueue.remove(lVar2);
            this.accessQueue.remove(lVar2);
            if (!tVar.b()) {
                return T(lVar, lVar2);
            }
            tVar.d(null);
            return lVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object W(java.lang.Object r16, int r17, java.lang.Object r18) {
            /*
                r15 = this;
                r8 = r15
                r0 = r16
                r5 = r17
                r15.lock()
                com.nytimes.android.external.cache3.LocalCache r1 = r8.map     // Catch: java.lang.Throwable -> L69
                ql8 r1 = r1.s     // Catch: java.lang.Throwable -> L69
                long r6 = r1.a()     // Catch: java.lang.Throwable -> L69
                r15.H(r6)     // Catch: java.lang.Throwable -> L69
                java.util.concurrent.atomic.AtomicReferenceArray<com.nytimes.android.external.cache3.LocalCache$l> r9 = r8.table     // Catch: java.lang.Throwable -> L69
                int r1 = r9.length()     // Catch: java.lang.Throwable -> L69
                int r1 = r1 + (-1)
                r10 = r5 & r1
                java.lang.Object r1 = r9.get(r10)     // Catch: java.lang.Throwable -> L69
                r2 = r1
                com.nytimes.android.external.cache3.LocalCache$l r2 = (com.nytimes.android.external.cache3.LocalCache.l) r2     // Catch: java.lang.Throwable -> L69
                r11 = r2
            L25:
                r12 = 0
                if (r11 == 0) goto L6b
                java.lang.Object r4 = r11.getKey()     // Catch: java.lang.Throwable -> L69
                int r1 = r11.getHash()     // Catch: java.lang.Throwable -> L69
                if (r1 != r5) goto L91
                if (r4 == 0) goto L91
                com.nytimes.android.external.cache3.LocalCache r1 = r8.map     // Catch: java.lang.Throwable -> L69
                com.nytimes.android.external.cache3.Equivalence r1 = r1.e     // Catch: java.lang.Throwable -> L69
                boolean r1 = r1.d(r0, r4)     // Catch: java.lang.Throwable -> L69
                if (r1 == 0) goto L91
                com.nytimes.android.external.cache3.LocalCache$t r13 = r11.getValueReference()     // Catch: java.lang.Throwable -> L69
                java.lang.Object r14 = r13.get()     // Catch: java.lang.Throwable -> L69
                if (r14 != 0) goto L72
                boolean r0 = r13.isActive()     // Catch: java.lang.Throwable -> L69
                if (r0 == 0) goto L6b
                int r0 = r8.modCount     // Catch: java.lang.Throwable -> L69
                int r0 = r0 + 1
                r8.modCount = r0     // Catch: java.lang.Throwable -> L69
                com.nytimes.android.external.cache3.RemovalCause r7 = com.nytimes.android.external.cache3.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L69
                r1 = r15
                r3 = r11
                r5 = r17
                r6 = r13
                com.nytimes.android.external.cache3.LocalCache$l r0 = r1.V(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L69
                int r1 = r8.count     // Catch: java.lang.Throwable -> L69
                int r1 = r1 + (-1)
                r9.set(r10, r0)     // Catch: java.lang.Throwable -> L69
                r8.count = r1     // Catch: java.lang.Throwable -> L69
                goto L6b
            L69:
                r0 = move-exception
                goto L96
            L6b:
                r15.unlock()
                r15.G()
                return r12
            L72:
                int r1 = r8.modCount     // Catch: java.lang.Throwable -> L69
                int r1 = r1 + 1
                r8.modCount = r1     // Catch: java.lang.Throwable -> L69
                com.nytimes.android.external.cache3.RemovalCause r1 = com.nytimes.android.external.cache3.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> L69
                r15.m(r0, r5, r13, r1)     // Catch: java.lang.Throwable -> L69
                r1 = r15
                r2 = r11
                r3 = r16
                r4 = r18
                r5 = r6
                r1.b0(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L69
                r15.n(r11)     // Catch: java.lang.Throwable -> L69
                r15.unlock()
                r15.G()
                return r14
            L91:
                com.nytimes.android.external.cache3.LocalCache$l r11 = r11.getNext()     // Catch: java.lang.Throwable -> L69
                goto L25
            L96:
                r15.unlock()
                r15.G()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache3.LocalCache.Segment.W(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean X(java.lang.Object r16, int r17, java.lang.Object r18, java.lang.Object r19) {
            /*
                r15 = this;
                r8 = r15
                r0 = r16
                r5 = r17
                r15.lock()
                com.nytimes.android.external.cache3.LocalCache r1 = r8.map     // Catch: java.lang.Throwable -> L67
                ql8 r1 = r1.s     // Catch: java.lang.Throwable -> L67
                long r6 = r1.a()     // Catch: java.lang.Throwable -> L67
                r15.H(r6)     // Catch: java.lang.Throwable -> L67
                java.util.concurrent.atomic.AtomicReferenceArray<com.nytimes.android.external.cache3.LocalCache$l> r9 = r8.table     // Catch: java.lang.Throwable -> L67
                int r1 = r9.length()     // Catch: java.lang.Throwable -> L67
                r10 = 1
                int r1 = r1 - r10
                r11 = r5 & r1
                java.lang.Object r1 = r9.get(r11)     // Catch: java.lang.Throwable -> L67
                r2 = r1
                com.nytimes.android.external.cache3.LocalCache$l r2 = (com.nytimes.android.external.cache3.LocalCache.l) r2     // Catch: java.lang.Throwable -> L67
                r12 = r2
            L25:
                r13 = 0
                if (r12 == 0) goto L69
                java.lang.Object r4 = r12.getKey()     // Catch: java.lang.Throwable -> L67
                int r1 = r12.getHash()     // Catch: java.lang.Throwable -> L67
                if (r1 != r5) goto L9e
                if (r4 == 0) goto L9e
                com.nytimes.android.external.cache3.LocalCache r1 = r8.map     // Catch: java.lang.Throwable -> L67
                com.nytimes.android.external.cache3.Equivalence r1 = r1.e     // Catch: java.lang.Throwable -> L67
                boolean r1 = r1.d(r0, r4)     // Catch: java.lang.Throwable -> L67
                if (r1 == 0) goto L9e
                com.nytimes.android.external.cache3.LocalCache$t r14 = r12.getValueReference()     // Catch: java.lang.Throwable -> L67
                java.lang.Object r1 = r14.get()     // Catch: java.lang.Throwable -> L67
                if (r1 != 0) goto L70
                boolean r0 = r14.isActive()     // Catch: java.lang.Throwable -> L67
                if (r0 == 0) goto L69
                int r0 = r8.modCount     // Catch: java.lang.Throwable -> L67
                int r0 = r0 + r10
                r8.modCount = r0     // Catch: java.lang.Throwable -> L67
                com.nytimes.android.external.cache3.RemovalCause r7 = com.nytimes.android.external.cache3.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L67
                r1 = r15
                r3 = r12
                r5 = r17
                r6 = r14
                com.nytimes.android.external.cache3.LocalCache$l r0 = r1.V(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L67
                int r1 = r8.count     // Catch: java.lang.Throwable -> L67
                int r1 = r1 - r10
                r9.set(r11, r0)     // Catch: java.lang.Throwable -> L67
                r8.count = r1     // Catch: java.lang.Throwable -> L67
                goto L69
            L67:
                r0 = move-exception
                goto La5
            L69:
                r15.unlock()
                r15.G()
                return r13
            L70:
                com.nytimes.android.external.cache3.LocalCache r2 = r8.map     // Catch: java.lang.Throwable -> L67
                com.nytimes.android.external.cache3.Equivalence r2 = r2.f     // Catch: java.lang.Throwable -> L67
                r3 = r18
                boolean r1 = r2.d(r3, r1)     // Catch: java.lang.Throwable -> L67
                if (r1 == 0) goto L9a
                int r1 = r8.modCount     // Catch: java.lang.Throwable -> L67
                int r1 = r1 + r10
                r8.modCount = r1     // Catch: java.lang.Throwable -> L67
                com.nytimes.android.external.cache3.RemovalCause r1 = com.nytimes.android.external.cache3.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> L67
                r15.m(r0, r5, r14, r1)     // Catch: java.lang.Throwable -> L67
                r1 = r15
                r2 = r12
                r3 = r16
                r4 = r19
                r5 = r6
                r1.b0(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L67
                r15.n(r12)     // Catch: java.lang.Throwable -> L67
                r15.unlock()
                r15.G()
                return r10
            L9a:
                r15.L(r12, r6)     // Catch: java.lang.Throwable -> L67
                goto L69
            L9e:
                r3 = r18
                com.nytimes.android.external.cache3.LocalCache$l r12 = r12.getNext()     // Catch: java.lang.Throwable -> L67
                goto L25
            La5:
                r15.unlock()
                r15.G()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache3.LocalCache.Segment.X(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        void Y(long j) {
            if (tryLock()) {
                try {
                    j();
                    p(j);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        void Z() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.map.z();
        }

        void a() {
            Y(this.map.s.a());
            Z();
        }

        Object a0(l lVar, Object obj, int i, Object obj2, long j, CacheLoader cacheLoader) {
            Object O;
            return (!this.map.F() || j - lVar.getWriteTime() <= this.map.m || lVar.getValueReference().b() || (O = O(obj, i, cacheLoader, true)) == null) ? obj2 : O;
        }

        void b() {
            if (this.count != 0) {
                lock();
                try {
                    AtomicReferenceArray<l> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (l lVar = atomicReferenceArray.get(i); lVar != null; lVar = lVar.getNext()) {
                            if (lVar.getValueReference().isActive()) {
                                l(lVar, RemovalCause.EXPLICIT);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    d();
                    this.writeQueue.clear();
                    this.accessQueue.clear();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                    unlock();
                    G();
                } catch (Throwable th) {
                    unlock();
                    G();
                    throw th;
                }
            }
        }

        void b0(l lVar, Object obj, Object obj2, long j) {
            t valueReference = lVar.getValueReference();
            int weigh = this.map.j.weigh(obj, obj2);
            e16.g(weigh >= 0, "Weights must be non-negative");
            lVar.setValueReference(this.map.h.referenceValue(this, lVar, obj2, weigh));
            N(lVar, weigh, j);
            valueReference.d(obj2);
        }

        void c() {
            while (this.keyReferenceQueue.poll() != null) {
            }
        }

        boolean c0(Object obj, int i, k kVar, Object obj2) {
            lock();
            try {
                long a2 = this.map.s.a();
                H(a2);
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    o();
                    i2 = this.count + 1;
                }
                AtomicReferenceArray<l> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                l lVar = atomicReferenceArray.get(length);
                l lVar2 = lVar;
                while (true) {
                    if (lVar2 == null) {
                        this.modCount++;
                        l D = D(obj, i, lVar);
                        b0(D, obj, obj2, a2);
                        atomicReferenceArray.set(length, D);
                        this.count = i2;
                        n(D);
                        break;
                    }
                    Object key = lVar2.getKey();
                    if (lVar2.getHash() == i && key != null && this.map.e.d(obj, key)) {
                        t valueReference = lVar2.getValueReference();
                        Object obj3 = valueReference.get();
                        if (kVar != valueReference && (obj3 != null || valueReference == LocalCache.H)) {
                            m(obj, i, new b0(obj2, 0), RemovalCause.REPLACED);
                            unlock();
                            G();
                            return false;
                        }
                        this.modCount++;
                        if (kVar.isActive()) {
                            m(obj, i, kVar, obj3 == null ? RemovalCause.COLLECTED : RemovalCause.REPLACED);
                            i2--;
                        }
                        b0(lVar2, obj, obj2, a2);
                        this.count = i2;
                        n(lVar2);
                    } else {
                        lVar2 = lVar2.getNext();
                    }
                }
                unlock();
                G();
                return true;
            } catch (Throwable th) {
                unlock();
                G();
                throw th;
            }
        }

        void d() {
            if (this.map.N()) {
                c();
            }
            if (this.map.O()) {
                e();
            }
        }

        void d0() {
            if (tryLock()) {
                try {
                    j();
                } finally {
                    unlock();
                }
            }
        }

        void e() {
            while (this.valueReferenceQueue.poll() != null) {
            }
        }

        void e0(long j) {
            if (tryLock()) {
                try {
                    p(j);
                } finally {
                    unlock();
                }
            }
        }

        boolean f(Object obj, int i) {
            try {
                if (this.count == 0) {
                    return false;
                }
                l v = v(obj, i, this.map.s.a());
                if (v == null) {
                    return false;
                }
                return v.getValueReference().get() != null;
            } finally {
                F();
            }
        }

        Object f0(l lVar, Object obj, t tVar) {
            if (!tVar.b()) {
                throw new AssertionError();
            }
            e16.h(!Thread.holdsLock(lVar), "Recursive load of: %s", obj);
            Object f = tVar.f();
            if (f != null) {
                M(lVar, this.map.s.a());
                return f;
            }
            throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + obj + InstructionFileId.DOT);
        }

        l g(l lVar, l lVar2) {
            if (lVar.getKey() == null) {
                return null;
            }
            t valueReference = lVar.getValueReference();
            Object obj = valueReference.get();
            if (obj == null && valueReference.isActive()) {
                return null;
            }
            l copyEntry = this.map.t.copyEntry(this, lVar, lVar2);
            copyEntry.setValueReference(valueReference.c(this.valueReferenceQueue, obj, copyEntry));
            return copyEntry;
        }

        void h() {
            int i = 0;
            do {
                Reference<? extends K> poll = this.keyReferenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.map.A((l) poll);
                i++;
            } while (i != 16);
        }

        void i() {
            while (true) {
                l poll = this.recencyQueue.poll();
                if (poll == null) {
                    return;
                }
                if (this.accessQueue.contains(poll)) {
                    this.accessQueue.add(poll);
                }
            }
        }

        void j() {
            if (this.map.N()) {
                h();
            }
            if (this.map.O()) {
                k();
            }
        }

        void k() {
            int i = 0;
            do {
                Reference<? extends V> poll = this.valueReferenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.map.B((t) poll);
                i++;
            } while (i != 16);
        }

        void l(l lVar, RemovalCause removalCause) {
            m(lVar.getKey(), lVar.getHash(), lVar.getValueReference(), removalCause);
        }

        void m(Object obj, int i, t tVar, RemovalCause removalCause) {
            this.totalWeight -= tVar.a();
            if (this.map.n != LocalCache.L) {
                this.map.n.offer(iw6.a(obj, tVar.get(), removalCause));
            }
        }

        void n(l lVar) {
            if (this.map.j()) {
                i();
                if (lVar.getValueReference().a() > this.maxSegmentWeight && !S(lVar, lVar.getHash(), RemovalCause.SIZE)) {
                    throw new AssertionError();
                }
                while (this.totalWeight > this.maxSegmentWeight) {
                    l x = x();
                    if (!S(x, x.getHash(), RemovalCause.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        void o() {
            AtomicReferenceArray<l> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.count;
            AtomicReferenceArray<l> E = E(length << 1);
            this.threshold = (E.length() * 3) / 4;
            int length2 = E.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                l lVar = atomicReferenceArray.get(i2);
                if (lVar != null) {
                    l next = lVar.getNext();
                    int hash = lVar.getHash() & length2;
                    if (next == null) {
                        E.set(hash, lVar);
                    } else {
                        l lVar2 = lVar;
                        while (next != null) {
                            int hash2 = next.getHash() & length2;
                            if (hash2 != hash) {
                                lVar2 = next;
                                hash = hash2;
                            }
                            next = next.getNext();
                        }
                        E.set(hash, lVar2);
                        while (lVar != lVar2) {
                            int hash3 = lVar.getHash() & length2;
                            l g = g(lVar, E.get(hash3));
                            if (g != null) {
                                E.set(hash3, g);
                            } else {
                                R(lVar);
                                i--;
                            }
                            lVar = lVar.getNext();
                        }
                    }
                }
            }
            this.table = E;
            this.count = i;
        }

        void p(long j) {
            l peek;
            l peek2;
            i();
            do {
                peek = this.writeQueue.peek();
                if (peek == null || !this.map.t(peek, j)) {
                    do {
                        peek2 = this.accessQueue.peek();
                        if (peek2 == null || !this.map.t(peek2, j)) {
                            return;
                        }
                    } while (S(peek2, peek2.getHash(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (S(peek, peek.getHash(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        Object q(Object obj, int i) {
            try {
                if (this.count != 0) {
                    long a2 = this.map.s.a();
                    l v = v(obj, i, a2);
                    if (v == null) {
                        return null;
                    }
                    Object obj2 = v.getValueReference().get();
                    if (obj2 != null) {
                        M(v, a2);
                        return a0(v, v.getKey(), i, obj2, a2, this.map.u);
                    }
                    d0();
                }
                return null;
            } finally {
                F();
            }
        }

        Object r(Object obj, int i, CacheLoader cacheLoader) {
            l t;
            e16.d(obj);
            e16.d(cacheLoader);
            try {
                try {
                    if (this.count != 0 && (t = t(obj, i)) != null) {
                        long a2 = this.map.s.a();
                        Object w = w(t, a2);
                        if (w != null) {
                            M(t, a2);
                            return a0(t, obj, i, w, a2, cacheLoader);
                        }
                        t valueReference = t.getValueReference();
                        if (valueReference.b()) {
                            return f0(t, obj, valueReference);
                        }
                    }
                    return C(obj, i, cacheLoader);
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof Error) {
                        throw new ExecutionError((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new UncheckedExecutionException(cause);
                    }
                    throw e;
                }
            } finally {
                F();
            }
        }

        Object s(Object obj, int i, k kVar, i64 i64Var) {
            Object obj2;
            try {
                obj2 = tw8.a(i64Var);
            } catch (Throwable th) {
                th = th;
                obj2 = null;
            }
            try {
                if (obj2 != null) {
                    c0(obj, i, kVar, obj2);
                    return obj2;
                }
                throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + obj + InstructionFileId.DOT);
            } catch (Throwable th2) {
                th = th2;
                if (obj2 == null) {
                    U(obj, i, kVar);
                }
                throw th;
            }
        }

        l t(Object obj, int i) {
            for (l u = u(i); u != null; u = u.getNext()) {
                if (u.getHash() == i) {
                    Object key = u.getKey();
                    if (key == null) {
                        d0();
                    } else if (this.map.e.d(obj, key)) {
                        return u;
                    }
                }
            }
            return null;
        }

        l u(int i) {
            return this.table.get(i & (r1.length() - 1));
        }

        l v(Object obj, int i, long j) {
            l t = t(obj, i);
            if (t == null) {
                return null;
            }
            if (!this.map.t(t, j)) {
                return t;
            }
            e0(j);
            return null;
        }

        Object w(l lVar, long j) {
            if (lVar.getKey() == null) {
                d0();
                return null;
            }
            Object obj = lVar.getValueReference().get();
            if (obj == null) {
                d0();
                return null;
            }
            if (!this.map.t(lVar, j)) {
                return obj;
            }
            e0(j);
            return null;
        }

        l x() {
            for (l lVar : this.accessQueue) {
                if (lVar.getValueReference().a() > 0) {
                    return lVar;
                }
            }
            throw new AssertionError();
        }

        void y(AtomicReferenceArray atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            if (!this.map.h()) {
                int i = this.threshold;
                if (i == this.maxSegmentWeight) {
                    this.threshold = i + 1;
                }
            }
            this.table = atomicReferenceArray;
        }

        /* JADX WARN: Finally extract failed */
        k z(Object obj, int i, boolean z) {
            lock();
            try {
                long a2 = this.map.s.a();
                H(a2);
                AtomicReferenceArray<l> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                l lVar = atomicReferenceArray.get(length);
                for (l lVar2 = lVar; lVar2 != null; lVar2 = lVar2.getNext()) {
                    Object key = lVar2.getKey();
                    if (lVar2.getHash() == i && key != null && this.map.e.d(obj, key)) {
                        t valueReference = lVar2.getValueReference();
                        if (!valueReference.b() && (!z || a2 - lVar2.getWriteTime() >= this.map.m)) {
                            this.modCount++;
                            k kVar = new k(valueReference);
                            lVar2.setValueReference(kVar);
                            unlock();
                            G();
                            return kVar;
                        }
                        unlock();
                        G();
                        return null;
                    }
                }
                this.modCount++;
                k kVar2 = new k();
                l D = D(obj, i, lVar);
                D.setValueReference(kVar2);
                atomicReferenceArray.set(length, D);
                unlock();
                G();
                return kVar2;
            } catch (Throwable th) {
                unlock();
                G();
                throw th;
            }
        }
    }

    enum Strength {
        STRONG { // from class: com.nytimes.android.external.cache3.LocalCache.Strength.1
            @Override // com.nytimes.android.external.cache3.LocalCache.Strength
            Equivalence defaultEquivalence() {
                return Equivalence.c();
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.Strength
            <K, V> t referenceValue(Segment<K, V> segment, l lVar, V v, int i) {
                return i == 1 ? new q(v) : new b0(v, i);
            }
        },
        SOFT { // from class: com.nytimes.android.external.cache3.LocalCache.Strength.2
            @Override // com.nytimes.android.external.cache3.LocalCache.Strength
            Equivalence defaultEquivalence() {
                return Equivalence.f();
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.Strength
            <K, V> t referenceValue(Segment<K, V> segment, l lVar, V v, int i) {
                return i == 1 ? new m(segment.valueReferenceQueue, v, lVar) : new a0(segment.valueReferenceQueue, v, lVar, i);
            }
        },
        WEAK { // from class: com.nytimes.android.external.cache3.LocalCache.Strength.3
            @Override // com.nytimes.android.external.cache3.LocalCache.Strength
            Equivalence defaultEquivalence() {
                return Equivalence.f();
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.Strength
            <K, V> t referenceValue(Segment<K, V> segment, l lVar, V v, int i) {
                return i == 1 ? new y(segment.valueReferenceQueue, v, lVar) : new c0(segment.valueReferenceQueue, v, lVar, i);
            }
        };

        abstract Equivalence defaultEquivalence();

        abstract <K, V> t referenceValue(Segment<K, V> segment, l lVar, V v, int i);

        /* synthetic */ Strength(a aVar) {
            this();
        }
    }

    final class a implements t {
        a() {
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public int a() {
            return 0;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public boolean b() {
            return false;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public t c(ReferenceQueue referenceQueue, Object obj, l lVar) {
            return this;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public void d(Object obj) {
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public l e() {
            return null;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public Object f() {
            return null;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public Object get() {
            return null;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public boolean isActive() {
            return false;
        }
    }

    static final class a0 extends m {
        final int b;

        a0(ReferenceQueue referenceQueue, Object obj, l lVar, int i) {
            super(referenceQueue, obj, lVar);
            this.b = i;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.m, com.nytimes.android.external.cache3.LocalCache.t
        public int a() {
            return this.b;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.m, com.nytimes.android.external.cache3.LocalCache.t
        public t c(ReferenceQueue referenceQueue, Object obj, l lVar) {
            return new a0(referenceQueue, obj, lVar, this.b);
        }
    }

    final class b extends AbstractQueue {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new HashSet().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    static final class b0 extends q {
        final int b;

        b0(Object obj, int i) {
            super(obj);
            this.b = i;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.q, com.nytimes.android.external.cache3.LocalCache.t
        public int a() {
            return this.b;
        }
    }

    abstract class c extends AbstractSet {
        final ConcurrentMap a;

        c(ConcurrentMap concurrentMap) {
            this.a = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return LocalCache.J(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray(Object[] objArr) {
            return LocalCache.J(this).toArray(objArr);
        }
    }

    static final class c0 extends y {
        final int b;

        c0(ReferenceQueue referenceQueue, Object obj, l lVar, int i) {
            super(referenceQueue, obj, lVar);
            this.b = i;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.y, com.nytimes.android.external.cache3.LocalCache.t
        public int a() {
            return this.b;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.y, com.nytimes.android.external.cache3.LocalCache.t
        public t c(ReferenceQueue referenceQueue, Object obj, l lVar) {
            return new c0(referenceQueue, obj, lVar, this.b);
        }
    }

    static abstract class d implements l {
        d() {
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public Object getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public l getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public l getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public l getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public l getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public l getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public t getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setNextInAccessQueue(l lVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setNextInWriteQueue(l lVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setPreviousInAccessQueue(l lVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setPreviousInWriteQueue(l lVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setValueReference(t tVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    static final class d0 extends AbstractQueue {
        final l a = new a();

        class a extends d {
            l a = this;
            l b = this;

            a() {
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
            public l getNextInWriteQueue() {
                return this.a;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
            public l getPreviousInWriteQueue() {
                return this.b;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
            public void setNextInWriteQueue(l lVar) {
                this.a = lVar;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
            public void setPreviousInWriteQueue(l lVar) {
                this.b = lVar;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
            public void setWriteTime(long j) {
            }
        }

        class b extends x1 {
            b(l lVar) {
                super(lVar);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // defpackage.x1
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public l b(l lVar) {
                l nextInWriteQueue = lVar.getNextInWriteQueue();
                if (nextInWriteQueue == d0.this.a) {
                    return null;
                }
                return nextInWriteQueue;
            }
        }

        d0() {
        }

        @Override // java.util.Queue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(l lVar) {
            LocalCache.d(lVar.getPreviousInWriteQueue(), lVar.getNextInWriteQueue());
            LocalCache.d(this.a.getPreviousInWriteQueue(), lVar);
            LocalCache.d(lVar, this.a);
            return true;
        }

        @Override // java.util.Queue
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public l peek() {
            l nextInWriteQueue = this.a.getNextInWriteQueue();
            if (nextInWriteQueue == this.a) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            l nextInWriteQueue = this.a.getNextInWriteQueue();
            while (true) {
                l lVar = this.a;
                if (nextInWriteQueue == lVar) {
                    lVar.setNextInWriteQueue(lVar);
                    l lVar2 = this.a;
                    lVar2.setPreviousInWriteQueue(lVar2);
                    return;
                } else {
                    l nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    LocalCache.y(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((l) obj).getNextInWriteQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.Queue
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public l poll() {
            l nextInWriteQueue = this.a.getNextInWriteQueue();
            if (nextInWriteQueue == this.a) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.getNextInWriteQueue() == this.a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            l lVar = (l) obj;
            l previousInWriteQueue = lVar.getPreviousInWriteQueue();
            l nextInWriteQueue = lVar.getNextInWriteQueue();
            LocalCache.d(previousInWriteQueue, nextInWriteQueue);
            LocalCache.y(lVar);
            return nextInWriteQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (l nextInWriteQueue = this.a.getNextInWriteQueue(); nextInWriteQueue != this.a; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }
    }

    static final class e extends AbstractQueue {
        final l a = new a();

        class a extends d {
            l a = this;
            l b = this;

            a() {
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
            public l getNextInAccessQueue() {
                return this.a;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
            public l getPreviousInAccessQueue() {
                return this.b;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
            public void setAccessTime(long j) {
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
            public void setNextInAccessQueue(l lVar) {
                this.a = lVar;
            }

            @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
            public void setPreviousInAccessQueue(l lVar) {
                this.b = lVar;
            }
        }

        class b extends x1 {
            b(l lVar) {
                super(lVar);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // defpackage.x1
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public l b(l lVar) {
                l nextInAccessQueue = lVar.getNextInAccessQueue();
                if (nextInAccessQueue == e.this.a) {
                    return null;
                }
                return nextInAccessQueue;
            }
        }

        e() {
        }

        @Override // java.util.Queue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(l lVar) {
            LocalCache.c(lVar.getPreviousInAccessQueue(), lVar.getNextInAccessQueue());
            LocalCache.c(this.a.getPreviousInAccessQueue(), lVar);
            LocalCache.c(lVar, this.a);
            return true;
        }

        @Override // java.util.Queue
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public l peek() {
            l nextInAccessQueue = this.a.getNextInAccessQueue();
            if (nextInAccessQueue == this.a) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            l nextInAccessQueue = this.a.getNextInAccessQueue();
            while (true) {
                l lVar = this.a;
                if (nextInAccessQueue == lVar) {
                    lVar.setNextInAccessQueue(lVar);
                    l lVar2 = this.a;
                    lVar2.setPreviousInAccessQueue(lVar2);
                    return;
                } else {
                    l nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    LocalCache.x(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((l) obj).getNextInAccessQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.Queue
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public l poll() {
            l nextInAccessQueue = this.a.getNextInAccessQueue();
            if (nextInAccessQueue == this.a) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.getNextInAccessQueue() == this.a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            l lVar = (l) obj;
            l previousInAccessQueue = lVar.getPreviousInAccessQueue();
            l nextInAccessQueue = lVar.getNextInAccessQueue();
            LocalCache.c(previousInAccessQueue, nextInAccessQueue);
            LocalCache.x(lVar);
            return nextInAccessQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (l nextInAccessQueue = this.a.getNextInAccessQueue(); nextInAccessQueue != this.a; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }
    }

    final class e0 implements Map.Entry {
        final Object a;
        Object b;

        e0(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.a.equals(entry.getKey()) && this.b.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.b.hashCode() ^ this.a.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class f extends h {
        f() {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            return d();
        }
    }

    final class g extends c {
        g(ConcurrentMap concurrentMap) {
            super(concurrentMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = LocalCache.this.get(key)) != null && LocalCache.this.f.d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return LocalCache.this.new f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && LocalCache.this.remove(key, entry.getValue());
        }
    }

    abstract class h implements Iterator {
        int a;
        int b = -1;
        Segment c;
        AtomicReferenceArray d;
        l e;
        e0 f;
        e0 g;

        h() {
            this.a = LocalCache.this.c.length - 1;
            b();
        }

        final void b() {
            this.f = null;
            if (e() || f()) {
                return;
            }
            while (true) {
                int i = this.a;
                if (i < 0) {
                    return;
                }
                Segment[] segmentArr = LocalCache.this.c;
                this.a = i - 1;
                Segment segment = segmentArr[i];
                this.c = segment;
                if (segment.count != 0) {
                    this.d = this.c.table;
                    this.b = r0.length() - 1;
                    if (f()) {
                        return;
                    }
                }
            }
        }

        boolean c(l lVar) {
            try {
                long a = LocalCache.this.s.a();
                Object key = lVar.getKey();
                Object q = LocalCache.this.q(lVar, a);
                if (q == null) {
                    this.c.F();
                    return false;
                }
                this.f = LocalCache.this.new e0(key, q);
                this.c.F();
                return true;
            } catch (Throwable th) {
                this.c.F();
                throw th;
            }
        }

        e0 d() {
            e0 e0Var = this.f;
            if (e0Var == null) {
                throw new NoSuchElementException();
            }
            this.g = e0Var;
            b();
            return this.g;
        }

        boolean e() {
            l lVar = this.e;
            if (lVar == null) {
                return false;
            }
            while (true) {
                this.e = lVar.getNext();
                l lVar2 = this.e;
                if (lVar2 == null) {
                    return false;
                }
                if (c(lVar2)) {
                    return true;
                }
                lVar = this.e;
            }
        }

        boolean f() {
            while (true) {
                int i = this.b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.d;
                this.b = i - 1;
                l lVar = (l) atomicReferenceArray.get(i);
                this.e = lVar;
                if (lVar != null && (c(lVar) || e())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            e16.f(this.g != null);
            LocalCache.this.remove(this.g.getKey());
            this.g = null;
        }
    }

    final class i extends h {
        i() {
            super();
        }

        @Override // java.util.Iterator
        public Object next() {
            return d().getKey();
        }
    }

    final class j extends c {
        j(ConcurrentMap concurrentMap) {
            super(concurrentMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return LocalCache.this.new i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.a.remove(obj) != null;
        }
    }

    static class k implements t {
        volatile t a;
        final com.nytimes.android.external.cache3.c b;
        final y18 c;

        class a implements jt2 {
            a() {
            }

            @Override // defpackage.jt2
            public Object apply(Object obj) {
                k.this.j(obj);
                return obj;
            }
        }

        public k() {
            this(LocalCache.K());
        }

        private i64 g(Throwable th) {
            return com.nytimes.android.external.cache3.a.a(th);
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public int a() {
            return this.a.a();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public boolean b() {
            return true;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public t c(ReferenceQueue referenceQueue, Object obj, l lVar) {
            return this;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public void d(Object obj) {
            if (obj != null) {
                j(obj);
            } else {
                this.a = LocalCache.K();
            }
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public l e() {
            return null;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public Object f() {
            return tw8.a(this.b);
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public Object get() {
            return this.a.get();
        }

        public t h() {
            return this.a;
        }

        public i64 i(Object obj, CacheLoader cacheLoader) {
            try {
                this.c.e();
                Object obj2 = this.a.get();
                if (obj2 == null) {
                    Object a2 = cacheLoader.a(obj);
                    return j(a2) ? this.b : com.nytimes.android.external.cache3.a.b(a2);
                }
                i64 b = cacheLoader.b(obj, obj2);
                return b == null ? com.nytimes.android.external.cache3.a.b(null) : com.nytimes.android.external.cache3.a.c(b, new a());
            } catch (Throwable th) {
                i64 g = k(th) ? this.b : g(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return g;
            }
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public boolean isActive() {
            return this.a.isActive();
        }

        public boolean j(Object obj) {
            return this.b.t(obj);
        }

        public boolean k(Throwable th) {
            return this.b.u(th);
        }

        public k(t tVar) {
            this.b = com.nytimes.android.external.cache3.c.w();
            this.c = y18.c();
            this.a = tVar;
        }
    }

    interface l {
        long getAccessTime();

        int getHash();

        Object getKey();

        l getNext();

        l getNextInAccessQueue();

        l getNextInWriteQueue();

        l getPreviousInAccessQueue();

        l getPreviousInWriteQueue();

        t getValueReference();

        long getWriteTime();

        void setAccessTime(long j);

        void setNextInAccessQueue(l lVar);

        void setNextInWriteQueue(l lVar);

        void setPreviousInAccessQueue(l lVar);

        void setPreviousInWriteQueue(l lVar);

        void setValueReference(t tVar);

        void setWriteTime(long j);
    }

    static class m extends SoftReference implements t {
        final l a;

        m(ReferenceQueue referenceQueue, Object obj, l lVar) {
            super(obj, referenceQueue);
            this.a = lVar;
        }

        public int a() {
            return 1;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public boolean b() {
            return false;
        }

        public t c(ReferenceQueue referenceQueue, Object obj, l lVar) {
            return new m(referenceQueue, obj, lVar);
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public void d(Object obj) {
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public l e() {
            return this.a;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public Object f() {
            return get();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public boolean isActive() {
            return true;
        }
    }

    static final class n extends p {
        volatile long e;
        l f;
        l g;

        n(Object obj, int i, l lVar) {
            super(obj, i, lVar);
            this.e = Long.MAX_VALUE;
            this.f = LocalCache.w();
            this.g = LocalCache.w();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public long getAccessTime() {
            return this.e;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public l getNextInAccessQueue() {
            return this.f;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public l getPreviousInAccessQueue() {
            return this.g;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public void setAccessTime(long j) {
            this.e = j;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public void setNextInAccessQueue(l lVar) {
            this.f = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public void setPreviousInAccessQueue(l lVar) {
            this.g = lVar;
        }
    }

    static final class o extends p {
        volatile long e;
        l f;
        l g;
        volatile long h;
        l i;
        l j;

        o(Object obj, int i, l lVar) {
            super(obj, i, lVar);
            this.e = Long.MAX_VALUE;
            this.f = LocalCache.w();
            this.g = LocalCache.w();
            this.h = Long.MAX_VALUE;
            this.i = LocalCache.w();
            this.j = LocalCache.w();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public long getAccessTime() {
            return this.e;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public l getNextInAccessQueue() {
            return this.f;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public l getNextInWriteQueue() {
            return this.i;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public l getPreviousInAccessQueue() {
            return this.g;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public l getPreviousInWriteQueue() {
            return this.j;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public long getWriteTime() {
            return this.h;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public void setAccessTime(long j) {
            this.e = j;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public void setNextInAccessQueue(l lVar) {
            this.f = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public void setNextInWriteQueue(l lVar) {
            this.i = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public void setPreviousInAccessQueue(l lVar) {
            this.g = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public void setPreviousInWriteQueue(l lVar) {
            this.j = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public void setWriteTime(long j) {
            this.h = j;
        }
    }

    static class p extends d {
        final Object a;
        final int b;
        final l c;
        volatile t d = LocalCache.K();

        p(Object obj, int i, l lVar) {
            this.a = obj;
            this.b = i;
            this.c = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public int getHash() {
            return this.b;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public Object getKey() {
            return this.a;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public l getNext() {
            return this.c;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public t getValueReference() {
            return this.d;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public void setValueReference(t tVar) {
            this.d = tVar;
        }
    }

    static class q implements t {
        final Object a;

        q(Object obj) {
            this.a = obj;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public int a() {
            return 1;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public boolean b() {
            return false;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public t c(ReferenceQueue referenceQueue, Object obj, l lVar) {
            return this;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public void d(Object obj) {
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public l e() {
            return null;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public Object f() {
            return get();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public Object get() {
            return this.a;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public boolean isActive() {
            return true;
        }
    }

    static final class r extends p {
        volatile long e;
        l f;
        l g;

        r(Object obj, int i, l lVar) {
            super(obj, i, lVar);
            this.e = Long.MAX_VALUE;
            this.f = LocalCache.w();
            this.g = LocalCache.w();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public l getNextInWriteQueue() {
            return this.f;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public l getPreviousInWriteQueue() {
            return this.g;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public long getWriteTime() {
            return this.e;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public void setNextInWriteQueue(l lVar) {
            this.f = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public void setPreviousInWriteQueue(l lVar) {
            this.g = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.d, com.nytimes.android.external.cache3.LocalCache.l
        public void setWriteTime(long j) {
            this.e = j;
        }
    }

    final class s extends h {
        s() {
            super();
        }

        @Override // java.util.Iterator
        public Object next() {
            return d().getValue();
        }
    }

    interface t {
        int a();

        boolean b();

        t c(ReferenceQueue referenceQueue, Object obj, l lVar);

        void d(Object obj);

        l e();

        Object f();

        Object get();

        boolean isActive();
    }

    final class u extends AbstractCollection {
        private final ConcurrentMap a;

        u(ConcurrentMap concurrentMap) {
            this.a = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return LocalCache.this.new s();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return LocalCache.J(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return LocalCache.J(this).toArray(objArr);
        }
    }

    static final class v extends x {
        volatile long d;
        l e;
        l f;

        v(ReferenceQueue referenceQueue, Object obj, int i, l lVar) {
            super(referenceQueue, obj, i, lVar);
            this.d = Long.MAX_VALUE;
            this.e = LocalCache.w();
            this.f = LocalCache.w();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public long getAccessTime() {
            return this.d;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public l getNextInAccessQueue() {
            return this.e;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public l getPreviousInAccessQueue() {
            return this.f;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public void setAccessTime(long j) {
            this.d = j;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public void setNextInAccessQueue(l lVar) {
            this.e = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public void setPreviousInAccessQueue(l lVar) {
            this.f = lVar;
        }
    }

    static final class w extends x {
        volatile long d;
        l e;
        l f;
        volatile long g;
        l h;
        l i;

        w(ReferenceQueue referenceQueue, Object obj, int i, l lVar) {
            super(referenceQueue, obj, i, lVar);
            this.d = Long.MAX_VALUE;
            this.e = LocalCache.w();
            this.f = LocalCache.w();
            this.g = Long.MAX_VALUE;
            this.h = LocalCache.w();
            this.i = LocalCache.w();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public long getAccessTime() {
            return this.d;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public l getNextInAccessQueue() {
            return this.e;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public l getNextInWriteQueue() {
            return this.h;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public l getPreviousInAccessQueue() {
            return this.f;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public l getPreviousInWriteQueue() {
            return this.i;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public long getWriteTime() {
            return this.g;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public void setAccessTime(long j) {
            this.d = j;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public void setNextInAccessQueue(l lVar) {
            this.e = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public void setNextInWriteQueue(l lVar) {
            this.h = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public void setPreviousInAccessQueue(l lVar) {
            this.f = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public void setPreviousInWriteQueue(l lVar) {
            this.i = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public void setWriteTime(long j) {
            this.g = j;
        }
    }

    static class x extends WeakReference implements l {
        final int a;
        final l b;
        volatile t c;

        x(ReferenceQueue referenceQueue, Object obj, int i, l lVar) {
            super(obj, referenceQueue);
            this.c = LocalCache.K();
            this.a = i;
            this.b = lVar;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public int getHash() {
            return this.a;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public Object getKey() {
            return get();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public l getNext() {
            return this.b;
        }

        public l getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public l getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public l getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public l getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public t getValueReference() {
            return this.c;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(l lVar) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(l lVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(l lVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(l lVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.l
        public void setValueReference(t tVar) {
            this.c = tVar;
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    static class y extends WeakReference implements t {
        final l a;

        y(ReferenceQueue referenceQueue, Object obj, l lVar) {
            super(obj, referenceQueue);
            this.a = lVar;
        }

        public int a() {
            return 1;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public boolean b() {
            return false;
        }

        public t c(ReferenceQueue referenceQueue, Object obj, l lVar) {
            return new y(referenceQueue, obj, lVar);
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public void d(Object obj) {
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public l e() {
            return this.a;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public Object f() {
            return get();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.t
        public boolean isActive() {
            return true;
        }
    }

    static final class z extends x {
        volatile long d;
        l e;
        l f;

        z(ReferenceQueue referenceQueue, Object obj, int i, l lVar) {
            super(referenceQueue, obj, i, lVar);
            this.d = Long.MAX_VALUE;
            this.e = LocalCache.w();
            this.f = LocalCache.w();
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public l getNextInWriteQueue() {
            return this.e;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public l getPreviousInWriteQueue() {
            return this.f;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public long getWriteTime() {
            return this.d;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public void setNextInWriteQueue(l lVar) {
            this.e = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public void setPreviousInWriteQueue(l lVar) {
            this.f = lVar;
        }

        @Override // com.nytimes.android.external.cache3.LocalCache.x, com.nytimes.android.external.cache3.LocalCache.l
        public void setWriteTime(long j) {
            this.d = j;
        }
    }

    LocalCache(CacheBuilder cacheBuilder, CacheLoader cacheLoader) {
        this.d = Math.min(cacheBuilder.h(), 65536);
        Strength m2 = cacheBuilder.m();
        this.g = m2;
        this.h = cacheBuilder.s();
        this.e = cacheBuilder.l();
        this.f = cacheBuilder.r();
        long n2 = cacheBuilder.n();
        this.i = n2;
        this.j = cacheBuilder.t();
        this.k = cacheBuilder.i();
        this.l = cacheBuilder.j();
        this.m = cacheBuilder.o();
        hw6 p2 = cacheBuilder.p();
        this.r = p2;
        this.n = p2 == CacheBuilder.NullListener.INSTANCE ? i() : new ConcurrentLinkedQueue();
        this.s = cacheBuilder.q(D());
        this.t = EntryFactory.getFactory(m2, L(), P());
        this.u = cacheLoader;
        int min = Math.min(cacheBuilder.k(), 1073741824);
        if (j() && !h()) {
            min = Math.min(min, (int) n2);
        }
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        while (i5 < this.d && (!j() || i5 * 20 <= this.i)) {
            i4++;
            i5 <<= 1;
        }
        this.b = 32 - i4;
        this.a = i5 - 1;
        this.c = v(i5);
        int i6 = min / i5;
        while (i3 < (i6 * i5 < min ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        if (j()) {
            long j2 = this.i;
            long j3 = i5;
            long j4 = (j2 / j3) + 1;
            long j5 = j2 % j3;
            while (true) {
                Segment[] segmentArr = this.c;
                if (i2 >= segmentArr.length) {
                    return;
                }
                if (i2 == j5) {
                    j4--;
                }
                segmentArr[i2] = f(i3, j4);
                i2++;
            }
        } else {
            while (true) {
                Segment[] segmentArr2 = this.c;
                if (i2 >= segmentArr2.length) {
                    return;
                }
                segmentArr2[i2] = f(i3, -1L);
                i2++;
            }
        }
    }

    static int G(int i2) {
        int i3 = i2 + ((i2 << 15) ^ (-12931));
        int i4 = i3 ^ (i3 >>> 10);
        int i5 = i4 + (i4 << 3);
        int i6 = i5 ^ (i5 >>> 6);
        int i7 = i6 + (i6 << 2) + (i6 << 14);
        return i7 ^ (i7 >>> 16);
    }

    public static char H(long j2) {
        if (j2 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return (char) 65535;
        }
        if (j2 < 0) {
            return (char) 0;
        }
        return (char) j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList J(Collection collection) {
        return new ArrayList(collection);
    }

    static t K() {
        return H;
    }

    static void c(l lVar, l lVar2) {
        lVar.setNextInAccessQueue(lVar2);
        lVar2.setPreviousInAccessQueue(lVar);
    }

    static void d(l lVar, l lVar2) {
        lVar.setNextInWriteQueue(lVar2);
        lVar2.setPreviousInWriteQueue(lVar);
    }

    static Queue i() {
        return L;
    }

    static l w() {
        return NullEntry.INSTANCE;
    }

    static void x(l lVar) {
        l w2 = w();
        lVar.setNextInAccessQueue(w2);
        lVar.setPreviousInAccessQueue(w2);
    }

    static void y(l lVar) {
        l w2 = w();
        lVar.setNextInWriteQueue(w2);
        lVar.setPreviousInWriteQueue(w2);
    }

    void A(l lVar) {
        int hash = lVar.getHash();
        I(hash).J(lVar, hash);
    }

    void B(t tVar) {
        l e2 = tVar.e();
        int hash = e2.getHash();
        I(hash).K(e2.getKey(), hash, tVar);
    }

    boolean C() {
        return l();
    }

    boolean D() {
        return E() || C();
    }

    boolean E() {
        return m() || F();
    }

    boolean F() {
        return this.m > 0;
    }

    Segment I(int i2) {
        return this.c[this.a & (i2 >>> this.b)];
    }

    boolean L() {
        return M() || C();
    }

    boolean M() {
        return l() || j();
    }

    boolean N() {
        return this.g != Strength.STRONG;
    }

    boolean O() {
        return this.h != Strength.STRONG;
    }

    boolean P() {
        return Q() || E();
    }

    boolean Q() {
        return m();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Segment segment : this.c) {
            segment.b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int s2 = s(obj);
        return I(s2).f(obj, s2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z2 = false;
        if (obj == null) {
            return false;
        }
        long a2 = this.s.a();
        Segment[] segmentArr = this.c;
        long j2 = -1;
        int i2 = 0;
        while (i2 < 3) {
            int length = segmentArr.length;
            long j3 = 0;
            for (?? r12 = z2; r12 < length; r12++) {
                Segment segment = segmentArr[r12];
                int i3 = segment.count;
                AtomicReferenceArray<l> atomicReferenceArray = segment.table;
                for (?? r15 = z2; r15 < atomicReferenceArray.length(); r15++) {
                    l lVar = atomicReferenceArray.get(r15);
                    while (lVar != null) {
                        Segment[] segmentArr2 = segmentArr;
                        Object w2 = segment.w(lVar, a2);
                        long j4 = a2;
                        if (w2 != null && this.f.d(obj, w2)) {
                            return true;
                        }
                        lVar = lVar.getNext();
                        segmentArr = segmentArr2;
                        a2 = j4;
                    }
                }
                j3 += segment.modCount;
                a2 = a2;
                z2 = false;
            }
            long j5 = a2;
            Segment[] segmentArr3 = segmentArr;
            if (j3 == j2) {
                return false;
            }
            i2++;
            j2 = j3;
            segmentArr = segmentArr3;
            a2 = j5;
            z2 = false;
        }
        return z2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.y;
        if (set != null) {
            return set;
        }
        g gVar = new g(this);
        this.y = gVar;
        return gVar;
    }

    Segment f(int i2, long j2) {
        return new Segment(this, i2, j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int s2 = s(obj);
        return I(s2).q(obj, s2);
    }

    boolean h() {
        return this.j != CacheBuilder.OneWeigher.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment[] segmentArr = this.c;
        long j2 = 0;
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].count != 0) {
                return false;
            }
            j2 += segmentArr[i2].modCount;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < segmentArr.length; i3++) {
            if (segmentArr[i3].count != 0) {
                return false;
            }
            j2 -= segmentArr[i3].modCount;
        }
        return j2 == 0;
    }

    boolean j() {
        return this.i >= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.w;
        if (set != null) {
            return set;
        }
        j jVar = new j(this);
        this.w = jVar;
        return jVar;
    }

    boolean l() {
        return this.k > 0;
    }

    boolean m() {
        return this.l > 0;
    }

    Object n(Object obj, CacheLoader cacheLoader) {
        int s2 = s(e16.d(obj));
        return I(s2).r(obj, s2, cacheLoader);
    }

    public Object o(Object obj) {
        int s2 = s(e16.d(obj));
        return I(s2).q(obj, s2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        e16.d(obj);
        e16.d(obj2);
        int s2 = s(obj);
        return I(s2).I(obj, s2, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object putIfAbsent(Object obj, Object obj2) {
        e16.d(obj);
        e16.d(obj2);
        int s2 = s(obj);
        return I(s2).I(obj, s2, obj2, true);
    }

    Object q(l lVar, long j2) {
        Object obj;
        if (lVar.getKey() == null || (obj = lVar.getValueReference().get()) == null || t(lVar, j2)) {
            return null;
        }
        return obj;
    }

    Object r(Object obj) {
        return n(obj, this.u);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int s2 = s(obj);
        return I(s2).P(obj, s2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(Object obj, Object obj2, Object obj3) {
        e16.d(obj);
        e16.d(obj3);
        if (obj2 == null) {
            return false;
        }
        int s2 = s(obj);
        return I(s2).X(obj, s2, obj2, obj3);
    }

    int s(Object obj) {
        return G(this.e.e(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return H(u());
    }

    boolean t(l lVar, long j2) {
        e16.d(lVar);
        if (!l() || j2 - lVar.getAccessTime() < this.k) {
            return m() && j2 - lVar.getWriteTime() >= this.l;
        }
        return true;
    }

    long u() {
        long j2 = 0;
        for (int i2 = 0; i2 < this.c.length; i2++) {
            j2 += Math.max(0, r6[i2].count);
        }
        return j2;
    }

    final Segment[] v(int i2) {
        return new Segment[i2];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.x;
        if (collection != null) {
            return collection;
        }
        u uVar = new u(this);
        this.x = uVar;
        return uVar;
    }

    void z() {
        while (true) {
            iw6 iw6Var = (iw6) this.n.poll();
            if (iw6Var == null) {
                return;
            }
            try {
                this.r.onRemoval(iw6Var);
            } catch (Throwable th) {
                B.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int s2 = s(obj);
        return I(s2).Q(obj, s2, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object replace(Object obj, Object obj2) {
        e16.d(obj);
        e16.d(obj2);
        int s2 = s(obj);
        return I(s2).W(obj, s2, obj2);
    }
}
