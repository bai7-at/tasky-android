package defpackage;

/* loaded from: classes.dex */
public interface hi5 {
    public static final b.c a;
    public static final b.C0486b b;

    public static abstract class b {

        public static final class a extends b {
            private final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public String toString() {
                return "FAILURE (" + this.a.getMessage() + ")";
            }
        }

        /* renamed from: hi5$b$b, reason: collision with other inner class name */
        public static final class C0486b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0486b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        a = new b.c();
        b = new b.C0486b();
    }
}
