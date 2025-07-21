package defpackage;

import androidx.recyclerview.widget.f;
import java.util.Collection;

/* loaded from: classes4.dex */
class gq1 extends f.b {
    private final int a;
    private final int b;
    private final Collection c;
    private final Collection d;

    gq1(Collection collection, Collection collection2) {
        this.a = r33.b(collection);
        this.b = r33.b(collection2);
        this.c = collection;
        this.d = collection2;
    }

    @Override // androidx.recyclerview.widget.f.b
    public boolean a(int i, int i2) {
        return r33.a(this.d, i2).r(r33.a(this.c, i));
    }

    @Override // androidx.recyclerview.widget.f.b
    public boolean b(int i, int i2) {
        return r33.a(this.d, i2).v(r33.a(this.c, i));
    }

    @Override // androidx.recyclerview.widget.f.b
    public Object c(int i, int i2) {
        return r33.a(this.c, i).m(r33.a(this.d, i2));
    }

    @Override // androidx.recyclerview.widget.f.b
    public int d() {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.f.b
    public int e() {
        return this.a;
    }
}
