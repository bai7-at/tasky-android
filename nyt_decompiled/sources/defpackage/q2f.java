package defpackage;

/* loaded from: classes3.dex */
public final class q2f implements hye {
    private f6f b;
    private String c;
    private boolean f;
    private final o5f a = new o5f();
    private int d = 8000;
    private int e = 8000;

    public final q2f a(boolean z) {
        this.f = true;
        return this;
    }

    public final q2f b(int i) {
        this.d = i;
        return this;
    }

    public final q2f c(int i) {
        this.e = i;
        return this;
    }

    public final q2f d(f6f f6fVar) {
        this.b = f6fVar;
        return this;
    }

    public final q2f e(String str) {
        this.c = str;
        return this;
    }

    @Override // defpackage.hye
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final t4f zza() {
        t4f t4fVar = new t4f(this.c, this.d, this.e, this.f, this.a);
        f6f f6fVar = this.b;
        if (f6fVar != null) {
            t4fVar.h(f6fVar);
        }
        return t4fVar;
    }
}
