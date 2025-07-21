package defpackage;

/* loaded from: classes.dex */
public interface yx4 extends dl2, sy4 {
    @Override // defpackage.dl2
    float a();

    default void k(float f) {
        r(f);
    }

    void r(float f);

    @Override // defpackage.sy4
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        k(((Number) obj).floatValue());
    }

    @Override // defpackage.x08
    default Float getValue() {
        return Float.valueOf(a());
    }
}
