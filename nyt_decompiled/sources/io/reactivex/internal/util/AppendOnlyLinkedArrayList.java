package io.reactivex.internal.util;

import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Predicate;

/* loaded from: classes5.dex */
public class AppendOnlyLinkedArrayList<T> {
    final int capacity;
    final Object[] head;
    int offset;
    Object[] tail;

    public interface NonThrowingPredicate<T> extends Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        boolean test(T t);
    }

    public AppendOnlyLinkedArrayList(int i) {
        this.capacity = i;
        Object[] objArr = new Object[i + 1];
        this.head = objArr;
        this.tail = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <U> boolean accept(defpackage.va8 r4) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r3.head
            int r3 = r3.capacity
        L4:
            r1 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r1 >= r3) goto L19
            r2 = r0[r1]
            if (r2 != 0) goto Le
            goto L19
        Le:
            boolean r2 = io.reactivex.internal.util.NotificationLite.acceptFull(r2, r4)
            if (r2 == 0) goto L16
            r3 = 1
            return r3
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            r0 = r0[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.AppendOnlyLinkedArrayList.accept(va8):boolean");
    }

    public void add(T t) {
        int i = this.capacity;
        int i2 = this.offset;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.tail[i] = objArr;
            this.tail = objArr;
            i2 = 0;
        }
        this.tail[i2] = t;
        this.offset = i2 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void forEachWhile(io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate<? super T> r4) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r3.head
            int r3 = r3.capacity
        L4:
            if (r0 == 0) goto L1d
            r1 = 0
        L7:
            if (r1 >= r3) goto L18
            r2 = r0[r1]
            if (r2 != 0) goto Le
            goto L18
        Le:
            boolean r2 = r4.test(r2)
            if (r2 == 0) goto L15
            return
        L15:
            int r1 = r1 + 1
            goto L7
        L18:
            r0 = r0[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.AppendOnlyLinkedArrayList.forEachWhile(io.reactivex.internal.util.AppendOnlyLinkedArrayList$NonThrowingPredicate):void");
    }

    public void setFirst(T t) {
        this.head[0] = t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <U> boolean accept(io.reactivex.Observer<? super U> r4) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r3.head
            int r3 = r3.capacity
        L4:
            r1 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r1 >= r3) goto L19
            r2 = r0[r1]
            if (r2 != 0) goto Le
            goto L19
        Le:
            boolean r2 = io.reactivex.internal.util.NotificationLite.acceptFull(r2, r4)
            if (r2 == 0) goto L16
            r3 = 1
            return r3
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            r0 = r0[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.AppendOnlyLinkedArrayList.accept(io.reactivex.Observer):boolean");
    }

    public <S> void forEachWhile(S s, BiPredicate<? super S, ? super T> biPredicate) throws Exception {
        Object[] objArr = this.head;
        int i = this.capacity;
        while (true) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj == null || biPredicate.test(s, obj)) {
                    return;
                }
            }
            objArr = (Object[]) objArr[i];
        }
    }
}
