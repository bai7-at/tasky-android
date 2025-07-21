package defpackage;

/* loaded from: classes2.dex */
public final class km8 {
    private static final km8 c = new a().a();
    private final long a;
    private final long b;

    public static final class a {
        private long a = 0;
        private long b = 0;

        a() {
        }

        public km8 a() {
            return new km8(this.a, this.b);
        }

        public a b(long j) {
            this.b = j;
            return this;
        }

        public a c(long j) {
            this.a = j;
            return this;
        }
    }

    km8(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }
}
