package androidx.compose.runtime.snapshots;

import defpackage.uw7;
import defpackage.yu3;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
final class l implements ListIterator, yu3 {
    private final SnapshotStateList a;
    private int b;
    private int c = -1;
    private int d;

    public l(SnapshotStateList snapshotStateList, int i) {
        this.a = snapshotStateList;
        this.b = i - 1;
        this.d = snapshotStateList.f();
    }

    private final void c() {
        if (this.a.f() != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        c();
        this.a.add(this.b + 1, obj);
        this.c = -1;
        this.b++;
        this.d = this.a.f();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.b < this.a.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        c();
        int i = this.b + 1;
        this.c = i;
        uw7.g(i, this.a.size());
        Object obj = this.a.get(i);
        this.b = i;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.b + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        c();
        uw7.g(this.b, this.a.size());
        int i = this.b;
        this.c = i;
        this.b--;
        return this.a.get(i);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        c();
        this.a.remove(this.b);
        this.b--;
        this.c = -1;
        this.d = this.a.f();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        c();
        int i = this.c;
        if (i < 0) {
            uw7.e();
            throw new KotlinNothingValueException();
        }
        this.a.set(i, obj);
        this.d = this.a.f();
    }
}
