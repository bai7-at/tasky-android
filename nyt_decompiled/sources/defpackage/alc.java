package defpackage;

/* loaded from: classes3.dex */
public final class alc {
    qua a;
    nua b;
    hva c;
    ava d;
    wza e;
    final hs7 f = new hs7();
    final hs7 g = new hs7();

    public final alc a(nua nuaVar) {
        this.b = nuaVar;
        return this;
    }

    public final alc b(qua quaVar) {
        this.a = quaVar;
        return this;
    }

    public final alc c(String str, wua wuaVar, tua tuaVar) {
        this.f.put(str, wuaVar);
        if (tuaVar != null) {
            this.g.put(str, tuaVar);
        }
        return this;
    }

    public final alc d(wza wzaVar) {
        this.e = wzaVar;
        return this;
    }

    public final alc e(ava avaVar) {
        this.d = avaVar;
        return this;
    }

    public final alc f(hva hvaVar) {
        this.c = hvaVar;
        return this;
    }

    public final clc g() {
        return new clc(this);
    }
}
