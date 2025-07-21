package defpackage;

/* loaded from: classes.dex */
public abstract class xx1 {
    private static final vx1 a = new v31(0.4f, 0.0f, 0.2f, 1.0f);
    private static final vx1 b = new v31(0.0f, 0.0f, 0.2f, 1.0f);
    private static final vx1 c = new v31(0.4f, 0.0f, 1.0f, 1.0f);
    private static final vx1 d = new vx1() { // from class: wx1
        @Override // defpackage.vx1
        public final float a(float f) {
            float b2;
            b2 = xx1.b(f);
            return b2;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f) {
        return f;
    }

    public static final vx1 c() {
        return a;
    }

    public static final vx1 d() {
        return d;
    }

    public static final vx1 e() {
        return b;
    }
}
