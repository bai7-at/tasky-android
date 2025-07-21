package defpackage;

/* loaded from: classes2.dex */
public final class s15 {
    private final boolean a;
    private final int b;
    private final int c;
    private final boolean d;
    private final int e;
    private final h89 f;
    private final boolean g;

    public static final class a {
        private h89 e;
        private boolean a = false;
        private int b = -1;
        private int c = 0;
        private boolean d = false;
        private int f = 1;
        private boolean g = false;

        public s15 a() {
            return new s15(this, null);
        }

        public a b(int i) {
            this.f = i;
            return this;
        }

        public a c(int i) {
            this.b = i;
            return this;
        }

        public a d(int i) {
            this.c = i;
            return this;
        }

        public a e(boolean z) {
            this.g = z;
            return this;
        }

        public a f(boolean z) {
            this.d = z;
            return this;
        }

        public a g(boolean z) {
            this.a = z;
            return this;
        }

        public a h(h89 h89Var) {
            this.e = h89Var;
            return this;
        }
    }

    /* synthetic */ s15(a aVar, j5c j5cVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.f;
        this.f = aVar.e;
        this.g = aVar.g;
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public h89 d() {
        return this.f;
    }

    public boolean e() {
        return this.d;
    }

    public boolean f() {
        return this.a;
    }

    public final boolean g() {
        return this.g;
    }
}
