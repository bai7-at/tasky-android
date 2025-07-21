package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b49 extends d49 implements Iterable, yu3 {
    private final String a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final List i;
    private final List j;

    public static final class a implements Iterator, yu3 {
        private final Iterator a;

        a(b49 b49Var) {
            this.a = b49Var.j.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d49 next() {
            return (d49) this.a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b49(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
        super(null);
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = list2;
    }

    public final d49 c(int i) {
        return (d49) this.j.get(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof b49)) {
            b49 b49Var = (b49) obj;
            return zq3.c(this.a, b49Var.a) && this.b == b49Var.b && this.c == b49Var.c && this.d == b49Var.d && this.e == b49Var.e && this.f == b49Var.f && this.g == b49Var.g && this.h == b49Var.h && zq3.c(this.i, b49Var.i) && zq3.c(this.j, b49Var.j);
        }
        return false;
    }

    public final List f() {
        return this.i;
    }

    public final String g() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + Float.hashCode(this.f)) * 31) + Float.hashCode(this.g)) * 31) + Float.hashCode(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this);
    }

    public final float j() {
        return this.c;
    }

    public final float n() {
        return this.d;
    }

    public final float o() {
        return this.b;
    }

    public final float p() {
        return this.e;
    }

    public final float q() {
        return this.f;
    }

    public final int t() {
        return this.j.size();
    }

    public final float u() {
        return this.g;
    }

    public final float v() {
        return this.h;
    }
}
