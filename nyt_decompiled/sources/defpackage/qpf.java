package defpackage;

/* loaded from: classes3.dex */
public final class qpf {
    private boolean a;
    private boolean b;
    private boolean c;

    public final qpf a(boolean z) {
        this.a = true;
        return this;
    }

    public final qpf b(boolean z) {
        this.b = z;
        return this;
    }

    public final qpf c(boolean z) {
        this.c = z;
        return this;
    }

    public final wpf d() {
        if (this.a || !(this.b || this.c)) {
            return new wpf(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
