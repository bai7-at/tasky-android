package defpackage;

/* loaded from: classes4.dex */
public final class g69 {
    private Long a;

    public final void a(long j) {
        Long l = this.a;
        if (l == null || l == null || l.longValue() != j) {
            return;
        }
        this.a = null;
    }

    public final boolean b() {
        return this.a != null;
    }

    public final void c(long j) {
        this.a = Long.valueOf(j);
    }
}
