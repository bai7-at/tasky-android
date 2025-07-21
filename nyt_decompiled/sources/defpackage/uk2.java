package defpackage;

/* loaded from: classes.dex */
public interface uk2 extends ci {
    default float b(float f, float f2, float f3) {
        return d(e(f, f2, f3), f, f2, f3);
    }

    float c(long j, float f, float f2, float f3);

    float d(long j, float f, float f2, float f3);

    long e(float f, float f2, float f3);

    @Override // defpackage.ci
    default n49 a(hu8 hu8Var) {
        return new n49(this);
    }
}
