package defpackage;

import com.google.common.base.Optional;

/* loaded from: classes4.dex */
public final class uh3 implements y57 {
    private final Optional a;
    private final Optional b;

    public static final class a {
        private Optional a;
        private Optional b;

        public final a a(CharSequence charSequence) {
            this.b = Optional.e(charSequence);
            return this;
        }

        public uh3 b() {
            return new uh3(this.a, this.b);
        }

        public final a c(CharSequence charSequence) {
            this.a = Optional.e(charSequence);
            return this;
        }

        private a() {
            this.a = Optional.a();
            this.b = Optional.a();
        }
    }

    public static a c() {
        return new a();
    }

    private boolean d(uh3 uh3Var) {
        return this.a.equals(uh3Var.a) && this.b.equals(uh3Var.b);
    }

    @Override // defpackage.y57
    public Optional a() {
        return this.a;
    }

    @Override // defpackage.y57
    public Optional b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uh3) && d((uh3) obj);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() + 177573;
        return hashCode + (hashCode << 5) + this.b.hashCode();
    }

    public String toString() {
        return sv4.b("SFWrappedText").h().a("thumbnailSummary", this.a.g()).a("bottomSummary", this.b.g()).toString();
    }

    private uh3(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }
}
