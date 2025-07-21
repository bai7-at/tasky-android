package defpackage;

/* loaded from: classes.dex */
final class x44 implements vm2 {
    private final float a;

    public x44(float f) {
        this.a = f;
    }

    @Override // defpackage.vm2
    public float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.vm2
    public float b(float f) {
        return f * this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x44) && Float.compare(this.a, ((x44) obj).a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.a);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ')';
    }
}
