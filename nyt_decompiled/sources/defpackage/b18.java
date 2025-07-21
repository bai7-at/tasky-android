package defpackage;

/* loaded from: classes2.dex */
public abstract class b18 {

    private static class b extends b18 {
        private volatile boolean a;

        b() {
            super();
        }

        @Override // defpackage.b18
        public void b(boolean z) {
            this.a = z;
        }

        @Override // defpackage.b18
        public void c() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static b18 a() {
        return new b();
    }

    abstract void b(boolean z);

    public abstract void c();

    private b18() {
    }
}
