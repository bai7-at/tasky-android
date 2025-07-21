package kotlinx.coroutines.internal;

import defpackage.bk3;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

@InternalCoroutinesApi
/* loaded from: classes5.dex */
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private T[] a;

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final T[] realloc() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new ThreadSafeHeapNode[4];
            this.a = tArr2;
            return tArr2;
        }
        if (getSize() < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, getSize() * 2);
        zq3.g(copyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((ThreadSafeHeapNode[]) copyOf);
        this.a = tArr3;
        return tArr3;
    }

    private final void setSize(int i) {
        _size$volatile$FU.set(this, i);
    }

    private final /* synthetic */ void set_size$volatile(int i) {
        this._size$volatile = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void siftDownFrom(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.getSize()
            if (r1 < r2) goto Lb
            return
        Lb:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r2 = r5.a
            defpackage.zq3.e(r2)
            int r0 = r0 + 2
            int r3 = r5.getSize()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            defpackage.zq3.e(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            defpackage.zq3.e(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            defpackage.zq3.e(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            defpackage.zq3.e(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.swap(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ThreadSafeHeap.siftDownFrom(int):void");
    }

    private final void siftUpFrom(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            zq3.e(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            zq3.e(t);
            T t2 = tArr[i];
            zq3.e(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            swap(i, i2);
            i = i2;
        }
    }

    private final void swap(int i, int i2) {
        T[] tArr = this.a;
        zq3.e(tArr);
        T t = tArr[i2];
        zq3.e(t);
        T t2 = tArr[i];
        zq3.e(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }

    public final void addImpl(T t) {
        t.setHeap(this);
        T[] realloc = realloc();
        int size = getSize();
        setSize(size + 1);
        realloc[size] = t;
        t.setIndex(size);
        siftUpFrom(size);
    }

    public final void addLast(T t) {
        synchronized (this) {
            addImpl(t);
            ww8 ww8Var = ww8.a;
        }
    }

    public final boolean addLastIf(T t, ss2 ss2Var) {
        boolean z;
        synchronized (this) {
            try {
                if (((Boolean) ss2Var.invoke(firstImpl())).booleanValue()) {
                    addImpl(t);
                    z = true;
                } else {
                    z = false;
                }
                bk3.b(1);
            } catch (Throwable th) {
                bk3.b(1);
                bk3.a(1);
                throw th;
            }
        }
        bk3.a(1);
        return z;
    }

    public final T find(ss2 ss2Var) {
        T t;
        synchronized (this) {
            try {
                int size = getSize();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    T[] tArr = this.a;
                    t = tArr != null ? tArr[i] : null;
                    zq3.e(t);
                    if (((Boolean) ss2Var.invoke(t)).booleanValue()) {
                        break;
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public final T firstImpl() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int getSize() {
        return _size$volatile$FU.get(this);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final T peek() {
        T firstImpl;
        synchronized (this) {
            firstImpl = firstImpl();
        }
        return firstImpl;
    }

    public final boolean remove(T t) {
        boolean z;
        synchronized (this) {
            if (t.getHeap() == null) {
                z = false;
            } else {
                removeAtImpl(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    public final T removeAtImpl(int i) {
        T[] tArr = this.a;
        zq3.e(tArr);
        setSize(getSize() - 1);
        if (i < getSize()) {
            swap(i, getSize());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                zq3.e(t);
                T t2 = tArr[i2];
                zq3.e(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    swap(i, i2);
                    siftUpFrom(i2);
                }
            }
            siftDownFrom(i);
        }
        T t3 = tArr[getSize()];
        zq3.e(t3);
        t3.setHeap(null);
        t3.setIndex(-1);
        tArr[getSize()] = null;
        return t3;
    }

    public final T removeFirstIf(ss2 ss2Var) {
        synchronized (this) {
            try {
                T firstImpl = firstImpl();
                if (firstImpl == null) {
                    bk3.b(2);
                    bk3.a(2);
                    return null;
                }
                T removeAtImpl = ((Boolean) ss2Var.invoke(firstImpl)).booleanValue() ? removeAtImpl(0) : null;
                bk3.b(1);
                bk3.a(1);
                return removeAtImpl;
            } catch (Throwable th) {
                bk3.b(1);
                bk3.a(1);
                throw th;
            }
        }
    }

    public final T removeFirstOrNull() {
        T removeAtImpl;
        synchronized (this) {
            removeAtImpl = getSize() > 0 ? removeAtImpl(0) : null;
        }
        return removeAtImpl;
    }
}
