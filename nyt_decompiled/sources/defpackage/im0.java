package defpackage;

/* loaded from: classes5.dex */
final class im0 implements jm0 {
    private final float a;
    private final float b;

    public im0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.km0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float f() {
        return Float.valueOf(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jm0
    public /* bridge */ /* synthetic */ boolean c(Comparable comparable, Comparable comparable2) {
        return e(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    @Override // defpackage.km0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float a() {
        return Float.valueOf(this.a);
    }

    public boolean e(float f, float f2) {
        return f <= f2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof im0) {
            if (!isEmpty() || !((im0) obj).isEmpty()) {
                im0 im0Var = (im0) obj;
                if (this.a != im0Var.a || this.b != im0Var.b) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.jm0, defpackage.km0
    public boolean isEmpty() {
        return this.a > this.b;
    }

    public String toString() {
        return this.a + ".." + this.b;
    }
}
