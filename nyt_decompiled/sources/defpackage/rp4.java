package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class rp4 {
    public static final a k = new a(null);
    private static final long l = kotlin.time.b.b.b();
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final dg9 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            return new b();
        }

        public final long b() {
            return rp4.l;
        }

        private a() {
        }
    }

    public static final class b {
        private long a;
        private long b;
        private long c;
        private long d;
        private dg9 e;

        public b() {
            a aVar = rp4.k;
            this.a = aVar.b();
            this.b = aVar.b();
            this.c = -1L;
            this.d = -1L;
            this.e = th5.a;
        }

        public final rp4 a() {
            return new rp4(this.a, this.b, this.c, this.d, this.e, null);
        }

        public final b b(long j) {
            if (!kotlin.time.b.l(this.b, rp4.k.b())) {
                throw new IllegalStateException("Cannot set expireAfterWrite with expireAfterAccess already set");
            }
            this.a = j;
            return this;
        }

        public final b c(long j) {
            if (!(this.d == -1 && zq3.c(this.e, th5.a))) {
                throw new IllegalStateException("Cannot setMaxSize when maxWeight or weigher are already set");
            }
            if (!(j >= 0)) {
                throw new IllegalStateException("maxSize cannot be negative");
            }
            this.c = j;
            return this;
        }
    }

    public /* synthetic */ rp4(long j, long j2, long j3, long j4, dg9 dg9Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, dg9Var);
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.a;
    }

    public final boolean d() {
        return this.h;
    }

    public final boolean e() {
        return this.i;
    }

    public final boolean f() {
        return this.j;
    }

    public final boolean g() {
        return this.g;
    }

    public final long h() {
        return this.c;
    }

    public final long i() {
        return this.d;
    }

    public final dg9 j() {
        return this.e;
    }

    private rp4(long j, long j2, long j3, long j4, dg9 dg9Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = dg9Var;
        this.f = kotlin.time.b.l(c(), l);
        this.g = !kotlin.time.b.l(c(), r5);
        this.h = !kotlin.time.b.l(b(), r5);
        this.i = j3 != -1;
        this.j = j4 != -1;
    }
}
