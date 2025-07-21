package defpackage;

/* loaded from: classes.dex */
public interface cy4 extends ln3, sy4 {
    @Override // defpackage.ln3
    int d();

    void f(int i);

    default void h(int i) {
        f(i);
    }

    @Override // defpackage.sy4
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    @Override // defpackage.x08
    default Integer getValue() {
        return Integer.valueOf(d());
    }
}
