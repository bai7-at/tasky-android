package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public class ym3 implements Iterable, yu3 {
    public static final a d = new a(null);
    private final int a;
    private final int b;
    private final int c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ym3 a(int i, int i2, int i3) {
            return new ym3(i, i2, i3);
        }

        private a() {
        }
    }

    public ym3(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = i;
        this.b = y46.c(i, i2, i3);
        this.c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ym3) {
            if (!isEmpty() || !((ym3) obj).isEmpty()) {
                ym3 ym3Var = (ym3) obj;
                if (this.a != ym3Var.a || this.b != ym3Var.b || this.c != ym3Var.c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int g() {
        return this.a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.c + (((this.a * 31) + this.b) * 31);
    }

    public boolean isEmpty() {
        if (this.c > 0) {
            if (this.a <= this.b) {
                return false;
            }
        } else if (this.a >= this.b) {
            return false;
        }
        return true;
    }

    public final int j() {
        return this.b;
    }

    public final int n() {
        return this.c;
    }

    @Override // java.lang.Iterable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public qm3 iterator() {
        return new zm3(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.c > 0) {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append("..");
            sb.append(this.b);
            sb.append(" step ");
            i = this.c;
        } else {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append(" downTo ");
            sb.append(this.b);
            sb.append(" step ");
            i = -this.c;
        }
        sb.append(i);
        return sb.toString();
    }
}
