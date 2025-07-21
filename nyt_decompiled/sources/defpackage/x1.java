package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class x1 extends fx8 {
    private Object a;

    protected x1(Object obj) {
        this.a = obj;
    }

    protected abstract Object b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            Object obj = this.a;
            this.a = b(obj);
            return obj;
        } catch (Throwable th) {
            this.a = b(this.a);
            throw th;
        }
    }
}
