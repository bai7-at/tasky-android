package defpackage;

import java.util.List;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class rr3 extends a {
    private final int b;
    private final int c;
    private final List d;

    public rr3(int i, int i2, List list) {
        zq3.h(list, "items");
        this.b = i;
        this.c = i2;
        this.d = list;
    }

    @Override // kotlin.collections.AbstractCollection
    public int a() {
        return this.b + this.d.size() + this.c;
    }

    @Override // kotlin.collections.a, java.util.List
    public Object get(int i) {
        if (i >= 0 && i < this.b) {
            return null;
        }
        int i2 = this.b;
        if (i < this.d.size() + i2 && i2 <= i) {
            return this.d.get(i - this.b);
        }
        int size = this.b + this.d.size();
        if (i < size() && size <= i) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + i + " in ItemSnapshotList of size " + size());
    }
}
