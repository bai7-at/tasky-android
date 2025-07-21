package defpackage;

/* loaded from: classes3.dex */
public final class zuf {
    private int a;
    private int b;
    private int c;
    private byte[] d;
    private int e;
    private int f;

    public zuf() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.e = -1;
        this.f = -1;
    }

    public final zuf a(int i) {
        this.f = i;
        return this;
    }

    public final zuf b(int i) {
        this.b = i;
        return this;
    }

    public final zuf c(int i) {
        this.a = i;
        return this;
    }

    public final zuf d(int i) {
        this.c = i;
        return this;
    }

    public final zuf e(byte[] bArr) {
        this.d = bArr;
        return this;
    }

    public final zuf f(int i) {
        this.e = i;
        return this;
    }

    public final ayf g() {
        return new ayf(this.a, this.b, this.c, this.d, this.e, this.f, null);
    }

    /* synthetic */ zuf(ayf ayfVar, isf isfVar) {
        this.a = ayfVar.a;
        this.b = ayfVar.b;
        this.c = ayfVar.c;
        this.d = ayfVar.d;
        this.e = ayfVar.e;
        this.f = ayfVar.f;
    }
}
