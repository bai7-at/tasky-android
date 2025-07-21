package defpackage;

/* loaded from: classes3.dex */
public class n51 extends k01 {
    float a = -1.0f;

    @Override // defpackage.k01
    public void a(cp7 cp7Var, float f, float f2, float f3) {
        cp7Var.o(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        cp7Var.m((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }
}
