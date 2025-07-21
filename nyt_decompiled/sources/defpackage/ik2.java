package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes2.dex */
public final class ik2 {
    private final SparseBooleanArray a;

    public static final class b {
        private final SparseBooleanArray a = new SparseBooleanArray();
        private boolean b;

        public b a(int i) {
            ur.g(!this.b);
            this.a.append(i, true);
            return this;
        }

        public b b(ik2 ik2Var) {
            for (int i = 0; i < ik2Var.c(); i++) {
                a(ik2Var.b(i));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i : iArr) {
                a(i);
            }
            return this;
        }

        public b d(int i, boolean z) {
            return z ? a(i) : this;
        }

        public ik2 e() {
            ur.g(!this.b);
            this.b = true;
            return new ik2(this.a);
        }
    }

    public boolean a(int i) {
        return this.a.get(i);
    }

    public int b(int i) {
        ur.c(i, 0, c());
        return this.a.keyAt(i);
    }

    public int c() {
        return this.a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik2)) {
            return false;
        }
        ik2 ik2Var = (ik2) obj;
        if (z19.a >= 24) {
            return this.a.equals(ik2Var.a);
        }
        if (c() != ik2Var.c()) {
            return false;
        }
        for (int i = 0; i < c(); i++) {
            if (b(i) != ik2Var.b(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (z19.a >= 24) {
            return this.a.hashCode();
        }
        int c = c();
        for (int i = 0; i < c(); i++) {
            c = (c * 31) + b(i);
        }
        return c;
    }

    private ik2(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }
}
