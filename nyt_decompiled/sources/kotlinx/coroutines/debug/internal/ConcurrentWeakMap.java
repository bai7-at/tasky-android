package kotlinx.coroutines.debug.internal;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.cv3;
import defpackage.gt2;
import defpackage.ij0;
import defpackage.o1;
import defpackage.p1;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.yu3;
import defpackage.zq3;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes5.dex */
public final class ConcurrentWeakMap<K, V> extends o1 {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater core$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private volatile /* synthetic */ Object core$volatile;
    private final ReferenceQueue<K> weakRefQueue;

    private final class Core {
        private static final /* synthetic */ AtomicIntegerFieldUpdater load$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Core.class, "load$volatile");
        private final int allocated;
        private final /* synthetic */ AtomicReferenceArray keys;
        private volatile /* synthetic */ int load$volatile;
        private final int shift;
        private final int threshold;
        private final /* synthetic */ AtomicReferenceArray values;

        private final class KeyValueIterator<E> implements Iterator<E>, yu3 {
            private final gt2 factory;
            private int index = -1;
            private K key;
            private V value;

            public KeyValueIterator(gt2 gt2Var) {
                this.factory = gt2Var;
                findNext();
            }

            private final void findNext() {
                K k;
                while (true) {
                    int i = this.index + 1;
                    this.index = i;
                    if (i >= ((Core) Core.this).allocated) {
                        return;
                    }
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) Core.this.getKeys().get(this.index);
                    if (hashedWeakRef != null && (k = (K) hashedWeakRef.get()) != null) {
                        this.key = k;
                        Object obj = (V) Core.this.getValues().get(this.index);
                        if (obj instanceof Marked) {
                            obj = (V) ((Marked) obj).ref;
                        }
                        if (obj != null) {
                            this.value = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < ((Core) Core.this).allocated;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.index >= ((Core) Core.this).allocated) {
                    throw new NoSuchElementException();
                }
                gt2 gt2Var = this.factory;
                Object obj = this.key;
                if (obj == null) {
                    zq3.z(TransferTable.COLUMN_KEY);
                    obj = ww8.a;
                }
                Object obj2 = this.value;
                if (obj2 == null) {
                    zq3.z("value");
                    obj2 = ww8.a;
                }
                E e = (E) gt2Var.invoke(obj, obj2);
                findNext();
                return e;
            }

            @Override // java.util.Iterator
            public Void remove() {
                ConcurrentWeakMapKt.noImpl();
                throw new KotlinNothingValueException();
            }
        }

        public Core(int i) {
            this.allocated = i;
            this.shift = Integer.numberOfLeadingZeros(i) + 1;
            this.threshold = (i * 2) / 3;
            this.keys = new AtomicReferenceArray(i);
            this.values = new AtomicReferenceArray(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final /* synthetic */ AtomicReferenceArray getKeys() {
            return this.keys;
        }

        private final /* synthetic */ int getLoad$volatile() {
            return this.load$volatile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final /* synthetic */ AtomicReferenceArray getValues() {
            return this.values;
        }

        private final int index(int i) {
            return (i * (-1640531527)) >>> this.shift;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object putImpl$default(Core core, Object obj, Object obj2, HashedWeakRef hashedWeakRef, int i, Object obj3) {
            if ((i & 4) != 0) {
                hashedWeakRef = null;
            }
            return core.putImpl(obj, obj2, hashedWeakRef);
        }

        private final void removeCleanedAt(int i) {
            Object obj;
            do {
                obj = getValues().get(i);
                if (obj == null || (obj instanceof Marked)) {
                    return;
                }
            } while (!ij0.a(getValues(), i, obj, null));
            ConcurrentWeakMap.this.decrementSize();
        }

        private final /* synthetic */ void setLoad$volatile(int i) {
            this.load$volatile = i;
        }

        private final /* synthetic */ void update$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, ss2 ss2Var) {
            int i;
            do {
                i = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i, ((Number) ss2Var.invoke(Integer.valueOf(i))).intValue()));
        }

        public final void cleanWeakRef(HashedWeakRef<?> hashedWeakRef) {
            int index = index(hashedWeakRef.hash);
            while (true) {
                HashedWeakRef<?> hashedWeakRef2 = (HashedWeakRef) getKeys().get(index);
                if (hashedWeakRef2 == null) {
                    return;
                }
                if (hashedWeakRef2 == hashedWeakRef) {
                    removeCleanedAt(index);
                    return;
                } else {
                    if (index == 0) {
                        index = this.allocated;
                    }
                    index--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final V getImpl(K k) {
            int index = index(k.hashCode());
            while (true) {
                HashedWeakRef hashedWeakRef = (HashedWeakRef) getKeys().get(index);
                if (hashedWeakRef == null) {
                    return null;
                }
                T t = hashedWeakRef.get();
                if (zq3.c(k, t)) {
                    V v = (V) getValues().get(index);
                    return v instanceof Marked ? (V) ((Marked) v).ref : v;
                }
                if (t == 0) {
                    removeCleanedAt(index);
                }
                if (index == 0) {
                    index = this.allocated;
                }
                index--;
            }
        }

        public final <E> Iterator<E> keyValueIterator(gt2 gt2Var) {
            return new KeyValueIterator(gt2Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
        
            r6 = getValues().get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
        
            if ((r6 instanceof kotlinx.coroutines.debug.internal.Marked) == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
        
            if (defpackage.ij0.a(getValues(), r0, r6, r7) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        
            r5 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.REHASH;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        
            return r5;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object putImpl(K r6, V r7, kotlinx.coroutines.debug.internal.HashedWeakRef<K> r8) {
            /*
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.index(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.getKeys()
                java.lang.Object r2 = r2.get(r0)
                kotlinx.coroutines.debug.internal.HashedWeakRef r2 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r2
                if (r2 != 0) goto L4d
                r2 = 0
                if (r7 != 0) goto L19
                return r2
            L19:
                if (r1 != 0) goto L35
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = getLoad$volatile$FU()
            L1f:
                int r1 = r3.get(r5)
                int r4 = r5.threshold
                if (r1 < r4) goto L2c
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                return r5
            L2c:
                int r4 = r1 + 1
                boolean r1 = r3.compareAndSet(r5, r1, r4)
                if (r1 == 0) goto L1f
                r1 = 1
            L35:
                if (r8 != 0) goto L42
                kotlinx.coroutines.debug.internal.HashedWeakRef r8 = new kotlinx.coroutines.debug.internal.HashedWeakRef
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r3 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this
                java.lang.ref.ReferenceQueue r3 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.access$getWeakRefQueue$p(r3)
                r8.<init>(r6, r3)
            L42:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.getKeys()
                boolean r2 = defpackage.ij0.a(r3, r0, r2, r8)
                if (r2 != 0) goto L60
                goto L9
            L4d:
                java.lang.Object r2 = r2.get()
                boolean r3 = defpackage.zq3.c(r6, r2)
                if (r3 == 0) goto L7c
                if (r1 == 0) goto L60
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = getLoad$volatile$FU()
                r6.decrementAndGet(r5)
            L60:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.getValues()
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof kotlinx.coroutines.debug.internal.Marked
                if (r8 == 0) goto L71
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                return r5
            L71:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.getValues()
                boolean r8 = defpackage.ij0.a(r8, r0, r6, r7)
                if (r8 == 0) goto L60
                return r6
            L7c:
                if (r2 != 0) goto L81
                r5.removeCleanedAt(r0)
            L81:
                if (r0 != 0) goto L85
                int r0 = r5.allocated
            L85:
                int r0 = r0 + (-1)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.putImpl(java.lang.Object, java.lang.Object, kotlinx.coroutines.debug.internal.HashedWeakRef):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ConcurrentWeakMap<K, V>.Core rehash() {
            Object obj;
            Symbol symbol;
            Marked mark;
            while (true) {
                ConcurrentWeakMap<K, V>.Core core = (ConcurrentWeakMap<K, V>.Core) ConcurrentWeakMap.this.new Core(Integer.highestOneBit(uo6.d(ConcurrentWeakMap.this.size(), 4)) * 4);
                int i = this.allocated;
                for (int i2 = 0; i2 < i; i2++) {
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) getKeys().get(i2);
                    Object obj2 = hashedWeakRef != null ? hashedWeakRef.get() : null;
                    if (hashedWeakRef != null && obj2 == null) {
                        removeCleanedAt(i2);
                    }
                    while (true) {
                        obj = getValues().get(i2);
                        if (obj instanceof Marked) {
                            obj = ((Marked) obj).ref;
                            break;
                        }
                        AtomicReferenceArray values = getValues();
                        mark = ConcurrentWeakMapKt.mark(obj);
                        if (ij0.a(values, i2, obj, mark)) {
                            break;
                        }
                    }
                    if (obj2 != null && obj != null) {
                        Object putImpl = core.putImpl(obj2, obj, hashedWeakRef);
                        symbol = ConcurrentWeakMapKt.REHASH;
                        if (putImpl != symbol) {
                        }
                    }
                }
                return core;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class Entry<K, V> implements Map.Entry<K, V>, cv3.a {
        private final K key;
        private final V value;

        public Entry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            ConcurrentWeakMapKt.noImpl();
            throw new KotlinNothingValueException();
        }
    }

    private final class KeyValueSet<E> extends p1 {
        private final gt2 factory;

        public KeyValueSet(gt2 gt2Var) {
            this.factory = gt2Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e) {
            ConcurrentWeakMapKt.noImpl();
            throw new KotlinNothingValueException();
        }

        @Override // defpackage.p1
        public int getSize() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return ((Core) ConcurrentWeakMap.getCore$volatile$FU().get(ConcurrentWeakMap.this)).keyValueIterator(this.factory);
        }
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    private final void cleanWeakRef(HashedWeakRef<?> hashedWeakRef) {
        ((Core) core$volatile$FU.get(this)).cleanWeakRef(hashedWeakRef);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decrementSize() {
        _size$volatile$FU.decrementAndGet(this);
    }

    private final /* synthetic */ Object getCore$volatile() {
        return this.core$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getCore$volatile$FU() {
        return core$volatile$FU;
    }

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final synchronized V putSynchronized(K k, V v) {
        V v2;
        Symbol symbol;
        Core core = (Core) core$volatile$FU.get(this);
        while (true) {
            v2 = (V) Core.putImpl$default(core, k, v, null, 4, null);
            symbol = ConcurrentWeakMapKt.REHASH;
            if (v2 == symbol) {
                core = core.rehash();
                core$volatile$FU.set(this, core);
            }
        }
        return v2;
    }

    private final /* synthetic */ void setCore$volatile(Object obj) {
        this.core$volatile = obj;
    }

    private final /* synthetic */ void set_size$volatile(int i) {
        this._size$volatile = i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<Object> it2 = keySet().iterator();
        while (it2.hasNext()) {
            remove(it2.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((Core) core$volatile$FU.get(this)).getImpl(obj);
    }

    @Override // defpackage.o1
    public Set<Map.Entry<K, V>> getEntries() {
        return new KeyValueSet(new gt2() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$entries$1
            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((ConcurrentWeakMap$entries$1) obj, obj2);
            }

            @Override // defpackage.gt2
            public final Map.Entry<K, V> invoke(K k, V v) {
                return new ConcurrentWeakMap.Entry(k, v);
            }
        });
    }

    @Override // defpackage.o1
    public Set<K> getKeys() {
        return new KeyValueSet(new gt2() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$keys$1
            @Override // defpackage.gt2
            public final K invoke(K k, V v) {
                return k;
            }
        });
    }

    @Override // defpackage.o1
    public int getSize() {
        return _size$volatile$FU.get(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        Symbol symbol;
        V v2 = (V) Core.putImpl$default((Core) core$volatile$FU.get(this), k, v, null, 4, null);
        symbol = ConcurrentWeakMapKt.REHASH;
        if (v2 == symbol) {
            v2 = putSynchronized(k, v);
        }
        if (v2 == null) {
            _size$volatile$FU.incrementAndGet(this);
        }
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Symbol symbol;
        if (obj == 0) {
            return null;
        }
        V v = (V) Core.putImpl$default((Core) core$volatile$FU.get(this), obj, null, null, 4, null);
        symbol = ConcurrentWeakMapKt.REHASH;
        if (v == symbol) {
            v = putSynchronized(obj, null);
        }
        if (v != null) {
            _size$volatile$FU.decrementAndGet(this);
        }
        return v;
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
        if (this.weakRefQueue == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true");
        }
        while (true) {
            try {
                Reference<? extends K> remove = this.weakRefQueue.remove();
                zq3.f(remove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                cleanWeakRef((HashedWeakRef) remove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public ConcurrentWeakMap(boolean z) {
        this.core$volatile = new Core(16);
        this.weakRefQueue = z ? new ReferenceQueue<>() : null;
    }
}
