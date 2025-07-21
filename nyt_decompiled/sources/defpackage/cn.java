package defpackage;

/* loaded from: classes4.dex */
public final class cn implements hx2 {
    private volatile Object a;
    private final Object b = new Object();
    private final wr0 c;

    public cn(wr0 wr0Var) {
        this.c = wr0Var;
    }

    @Override // defpackage.hx2
    public Object generatedComponent() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = this.c.get();
                    }
                } finally {
                }
            }
        }
        return this.a;
    }
}
