package defpackage;

/* loaded from: classes.dex */
public interface hy4 extends ob4, sy4 {
    @Override // defpackage.ob4
    long b();

    default void g(long j) {
        x(j);
    }

    @Override // defpackage.sy4
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        g(((Number) obj).longValue());
    }

    void x(long j);

    @Override // defpackage.x08
    default Long getValue() {
        return Long.valueOf(b());
    }
}
