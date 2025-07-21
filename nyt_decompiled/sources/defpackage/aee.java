package defpackage;

/* loaded from: classes3.dex */
final class aee extends oee {
    private String a;
    private String b;

    aee() {
    }

    @Override // defpackage.oee
    public final oee a(String str) {
        this.b = str;
        return this;
    }

    @Override // defpackage.oee
    public final oee b(String str) {
        this.a = str;
        return this;
    }

    @Override // defpackage.oee
    public final pee c() {
        return new cee(this.a, this.b, null);
    }
}
