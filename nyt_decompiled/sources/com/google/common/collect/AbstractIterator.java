package com.google.common.collect;

import defpackage.b16;
import defpackage.gx8;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class AbstractIterator extends gx8 {
    private State a = State.NOT_READY;
    private Object b;

    private enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[State.values().length];
            a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected AbstractIterator() {
    }

    private boolean d() {
        this.a = State.FAILED;
        this.b = b();
        if (this.a == State.DONE) {
            return false;
        }
        this.a = State.READY;
        return true;
    }

    protected abstract Object b();

    protected final Object c() {
        this.a = State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b16.p(this.a != State.FAILED);
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return d();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = State.NOT_READY;
        Object a2 = m.a(this.b);
        this.b = null;
        return a2;
    }
}
