package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public interface mh3 extends List, ih3, yu3 {

    private static final class a extends kotlin.collections.a implements mh3 {
        private final mh3 b;
        private final int c;
        private final int d;
        private int e;

        public a(mh3 mh3Var, int i, int i2) {
            this.b = mh3Var;
            this.c = i;
            this.d = i2;
            v54.c(i, i2, mh3Var.size());
            this.e = i2 - i;
        }

        @Override // kotlin.collections.AbstractCollection
        public int a() {
            return this.e;
        }

        @Override // kotlin.collections.a, java.util.List
        public Object get(int i) {
            v54.a(i, this.e);
            return this.b.get(this.c + i);
        }

        @Override // kotlin.collections.a, java.util.List
        public mh3 subList(int i, int i2) {
            v54.c(i, i2, this.e);
            mh3 mh3Var = this.b;
            int i3 = this.c;
            return new a(mh3Var, i + i3, i3 + i2);
        }
    }

    @Override // java.util.List
    default mh3 subList(int i, int i2) {
        return new a(this, i, i2);
    }
}
