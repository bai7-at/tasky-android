package defpackage;

/* loaded from: classes3.dex */
final class s9f {
    static final s9f c;
    static final s9f d;
    final boolean a;
    final Throwable b;

    static {
        if (aaf.d) {
            d = null;
            c = null;
        } else {
            d = new s9f(false, null);
            c = new s9f(true, null);
        }
    }

    s9f(boolean z, Throwable th) {
        this.a = z;
        this.b = th;
    }
}
