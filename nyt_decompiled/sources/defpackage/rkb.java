package defpackage;

/* loaded from: classes3.dex */
public final class rkb {
    private final zy9 a = new zy9();

    public final rkb a(int i) {
        this.a.a(i);
        return this;
    }

    public final rkb b(mmb mmbVar) {
        p0a p0aVar;
        p0aVar = mmbVar.a;
        for (int i = 0; i < p0aVar.b(); i++) {
            this.a.a(p0aVar.a(i));
        }
        return this;
    }

    public final rkb c(int... iArr) {
        for (int i = 0; i < 20; i++) {
            this.a.a(iArr[i]);
        }
        return this;
    }

    public final rkb d(int i, boolean z) {
        if (z) {
            this.a.a(i);
        }
        return this;
    }

    public final mmb e() {
        return new mmb(this.a.b(), null);
    }
}
