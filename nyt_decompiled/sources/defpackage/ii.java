package defpackage;

/* loaded from: classes.dex */
public final class ii extends mi {
    private float a;
    private final int b;

    public ii(float f) {
        super(null);
        this.a = f;
        this.b = 1;
    }

    @Override // defpackage.mi
    public float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.mi
    public int b() {
        return this.b;
    }

    @Override // defpackage.mi
    public void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.mi
    public void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ii) && ((ii) obj).a == this.a;
    }

    public final float f() {
        return this.a;
    }

    @Override // defpackage.mi
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ii c() {
        return new ii(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
