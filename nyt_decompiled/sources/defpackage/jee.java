package defpackage;

/* loaded from: classes3.dex */
final class jee extends efe {
    private String a;
    private String b;

    jee() {
    }

    @Override // defpackage.efe
    public final efe a(String str) {
        this.b = str;
        return this;
    }

    @Override // defpackage.efe
    public final efe b(String str) {
        this.a = str;
        return this;
    }

    @Override // defpackage.efe
    public final ffe c() {
        return new nee(this.a, this.b, null);
    }
}
