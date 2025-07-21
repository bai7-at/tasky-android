package defpackage;

/* loaded from: classes.dex */
public final class ki extends mi {
    private float a;
    private float b;
    private float c;
    private final int d;

    public ki(float f, float f2, float f3) {
        super(null);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = 3;
    }

    @Override // defpackage.mi
    public float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // defpackage.mi
    public int b() {
        return this.d;
    }

    @Override // defpackage.mi
    public void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.mi
    public void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof ki) {
            ki kiVar = (ki) obj;
            if (kiVar.a == this.a && kiVar.b == this.b && kiVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mi
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ki c() {
        return new ki(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
