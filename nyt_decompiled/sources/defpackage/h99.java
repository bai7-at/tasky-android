package defpackage;

/* loaded from: classes5.dex */
public final class h99 {
    private String a;
    private String b;
    private bb c = bb.a();
    private jv d = jv.a();
    private int e = 2000;

    h99() {
    }

    public d99 a() {
        return d99.b(this.a, this.b, this.c, this.d, this.e);
    }

    public h99 b(bb bbVar) {
        if (!(bbVar instanceof cb)) {
            throw new IllegalArgumentException("Custom Aggregation implementations are currently not supported. Use one of the standard implementations returned by the static factories in the Aggregation class.");
        }
        this.c = bbVar;
        return this;
    }
}
