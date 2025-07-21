package kotlin.sequences;

import defpackage.bk7;
import defpackage.by0;
import defpackage.hc1;
import defpackage.ww8;
import defpackage.yu3;
import defpackage.zq3;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes5.dex */
final class c extends bk7 implements Iterator, by0, yu3 {
    private int a;
    private Object b;
    private Iterator c;
    private by0 d;

    private final Throwable g() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    private final Object h() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.bk7
    public Object c(Object obj, by0 by0Var) {
        this.b = obj;
        this.a = 3;
        this.d = by0Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        if (h == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return h == kotlin.coroutines.intrinsics.a.h() ? h : ww8.a;
    }

    @Override // defpackage.bk7
    public Object f(Iterator it2, by0 by0Var) {
        if (!it2.hasNext()) {
            return ww8.a;
        }
        this.c = it2;
        this.a = 2;
        this.d = by0Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        if (h == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return h == kotlin.coroutines.intrinsics.a.h() ? h : ww8.a;
    }

    @Override // defpackage.by0
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator it2 = this.c;
                zq3.e(it2);
                if (it2.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.c = null;
            }
            this.a = 5;
            by0 by0Var = this.d;
            zq3.e(by0Var);
            this.d = null;
            Result.a aVar = Result.a;
            by0Var.resumeWith(Result.b(ww8.a));
        }
    }

    public final void i(by0 by0Var) {
        this.d = by0Var;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return h();
        }
        if (i == 2) {
            this.a = 1;
            Iterator it2 = this.c;
            zq3.e(it2);
            return it2.next();
        }
        if (i != 3) {
            throw g();
        }
        this.a = 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.by0
    public void resumeWith(Object obj) {
        kotlin.f.b(obj);
        this.a = 4;
    }
}
