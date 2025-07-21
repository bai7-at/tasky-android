package defpackage;

/* loaded from: classes.dex */
public final class ji extends mi {
    private float a;
    private float b;
    private final int c;

    public ji(float f, float f2) {
        super(null);
        this.a = f;
        this.b = f2;
        this.c = 2;
    }

    @Override // defpackage.mi
    public float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.mi
    public int b() {
        return this.c;
    }

    @Override // defpackage.mi
    public void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.mi
    public void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof ji) {
            ji jiVar = (ji) obj;
            if (jiVar.a == this.a && jiVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final float f() {
        return this.a;
    }

    public final float g() {
        return this.b;
    }

    @Override // defpackage.mi
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ji c() {
        return new ji(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.a) * 31) + Float.hashCode(this.b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
