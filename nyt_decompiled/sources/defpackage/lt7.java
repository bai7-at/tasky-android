package defpackage;

/* loaded from: classes.dex */
public final class lt7 extends i1 {
    private final Object c;

    public lt7(Object obj, int i) {
        super(i, 1);
        this.c = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        c();
        h(f() + 1);
        return this.c;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        d();
        h(f() - 1);
        return this.c;
    }
}
