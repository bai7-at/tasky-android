package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class vo6 {
    public static final void a(boolean z, Number number) {
        zq3.h(number, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    public static jm0 b(float f, float f2) {
        return new im0(f, f2);
    }
}
