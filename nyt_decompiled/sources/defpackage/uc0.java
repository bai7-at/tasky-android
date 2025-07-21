package defpackage;

/* loaded from: classes.dex */
public interface uc0 {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final ci b = di.i(0.0f, 0.0f, null, 7, null);
        private static final uc0 c = new C0544a();

        /* renamed from: uc0$a$a, reason: collision with other inner class name */
        public static final class C0544a implements uc0 {
            private final ci b = a.a.b();

            C0544a() {
            }

            @Override // defpackage.uc0
            public float a(float f, float f2, float f3) {
                float f4 = f2 + f;
                if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
                    return 0.0f;
                }
                float f5 = f4 - f3;
                return Math.abs(f) < Math.abs(f5) ? f : f5;
            }

            @Override // defpackage.uc0
            public ci b() {
                return this.b;
            }
        }

        private a() {
        }

        public final uc0 a() {
            return c;
        }

        public final ci b() {
            return b;
        }
    }

    float a(float f, float f2, float f3);

    ci b();
}
