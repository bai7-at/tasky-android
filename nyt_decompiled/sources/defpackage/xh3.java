package defpackage;

import com.google.common.collect.k;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class xh3 implements z57 {
    private final y57 a;
    private final y57 b;
    private final y57 c;
    private final y57 d;
    private final y57 e;

    public static final class a {
        private long a;
        private y57 b;
        private y57 c;
        private y57 d;
        private y57 e;
        private y57 f;

        private String c() {
            ArrayList h = k.h();
            if ((this.a & 1) != 0) {
                h.add("mediumText");
            }
            if ((this.a & 2) != 0) {
                h.add("smallText");
            }
            if ((this.a & 4) != 0) {
                h.add("largeText");
            }
            if ((this.a & 8) != 0) {
                h.add("extraLargeText");
            }
            if ((this.a & 16) != 0) {
                h.add("jumboText");
            }
            return "Cannot build SFWrappedTextVariants, some of required attributes are not set " + h;
        }

        public xh3 a() {
            if (this.a == 0) {
                return new xh3(this.b, this.c, this.d, this.e, this.f);
            }
            throw new IllegalStateException(c());
        }

        public final a b(y57 y57Var) {
            this.e = (y57) b16.l(y57Var, "extraLargeText");
            this.a &= -9;
            return this;
        }

        public final a d(y57 y57Var) {
            this.f = (y57) b16.l(y57Var, "jumboText");
            this.a &= -17;
            return this;
        }

        public final a e(y57 y57Var) {
            this.d = (y57) b16.l(y57Var, "largeText");
            this.a &= -5;
            return this;
        }

        public final a f(y57 y57Var) {
            this.b = (y57) b16.l(y57Var, "mediumText");
            this.a &= -2;
            return this;
        }

        public final a g(y57 y57Var) {
            this.c = (y57) b16.l(y57Var, "smallText");
            this.a &= -3;
            return this;
        }

        private a() {
            this.a = 31L;
        }
    }

    public static a f() {
        return new a();
    }

    private boolean g(xh3 xh3Var) {
        return this.a.equals(xh3Var.a) && this.b.equals(xh3Var.b) && this.c.equals(xh3Var.c) && this.d.equals(xh3Var.d) && this.e.equals(xh3Var.e);
    }

    @Override // defpackage.z57
    public y57 a() {
        return this.c;
    }

    @Override // defpackage.z57
    public y57 b() {
        return this.a;
    }

    @Override // defpackage.z57
    public y57 c() {
        return this.e;
    }

    @Override // defpackage.z57
    public y57 d() {
        return this.d;
    }

    @Override // defpackage.z57
    public y57 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh3) && g((xh3) obj);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() + 177573;
        int hashCode2 = hashCode + (hashCode << 5) + this.b.hashCode();
        int hashCode3 = hashCode2 + (hashCode2 << 5) + this.c.hashCode();
        int hashCode4 = hashCode3 + (hashCode3 << 5) + this.d.hashCode();
        return hashCode4 + (hashCode4 << 5) + this.e.hashCode();
    }

    public String toString() {
        return sv4.b("SFWrappedTextVariants").h().a("mediumText", this.a).a("smallText", this.b).a("largeText", this.c).a("extraLargeText", this.d).a("jumboText", this.e).toString();
    }

    private xh3(y57 y57Var, y57 y57Var2, y57 y57Var3, y57 y57Var4, y57 y57Var5) {
        this.a = y57Var;
        this.b = y57Var2;
        this.c = y57Var3;
        this.d = y57Var4;
        this.e = y57Var5;
    }
}
