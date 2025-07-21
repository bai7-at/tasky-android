package defpackage;

/* loaded from: classes2.dex */
public final class t15 {
    private final boolean a;
    private final int b;
    private final boolean c;
    private final int d;
    private final h89 e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final int i;

    public static final class a {
        private h89 d;
        private boolean a = false;
        private int b = 0;
        private boolean c = false;
        private int e = 1;
        private boolean f = false;
        private boolean g = false;
        private int h = 0;
        private int i = 1;

        public t15 a() {
            return new t15(this, null);
        }

        public a b(int i, boolean z) {
            this.g = z;
            this.h = i;
            return this;
        }

        public a c(int i) {
            this.e = i;
            return this;
        }

        public a d(int i) {
            this.b = i;
            return this;
        }

        public a e(boolean z) {
            this.f = z;
            return this;
        }

        public a f(boolean z) {
            this.c = z;
            return this;
        }

        public a g(boolean z) {
            this.a = z;
            return this;
        }

        public a h(h89 h89Var) {
            this.d = h89Var;
            return this;
        }

        public final a q(int i) {
            this.i = i;
            return this;
        }
    }

    /* synthetic */ t15(a aVar, ip9 ip9Var) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.e;
        this.e = aVar.d;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.b;
    }

    public h89 c() {
        return this.e;
    }

    public boolean d() {
        return this.c;
    }

    public boolean e() {
        return this.a;
    }

    public final int f() {
        return this.h;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.f;
    }

    public final int i() {
        return this.i;
    }
}
