package defpackage;

/* loaded from: classes5.dex */
abstract class wp0 extends vp0 {
    public static float h(float f, float... fArr) {
        zq3.h(fArr, "other");
        for (float f2 : fArr) {
            f = Math.max(f, f2);
        }
        return f;
    }

    public static float i(float f, float... fArr) {
        zq3.h(fArr, "other");
        for (float f2 : fArr) {
            f = Math.min(f, f2);
        }
        return f;
    }
}
