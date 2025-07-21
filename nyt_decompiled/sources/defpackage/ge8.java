package defpackage;

/* loaded from: classes5.dex */
final class ge8 implements yl0 {
    private static final ge8 a = new ge8();

    private ge8() {
    }

    static yl0 b() {
        return a;
    }

    @Override // defpackage.yl0
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // defpackage.yl0
    public long now() {
        return is3.b().a();
    }

    public String toString() {
        return "SystemClock{}";
    }
}
