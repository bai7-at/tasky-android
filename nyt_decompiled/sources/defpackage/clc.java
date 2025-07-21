package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class clc {
    public static final clc h = new clc(new alc());
    private final qua a;
    private final nua b;
    private final hva c;
    private final ava d;
    private final wza e;
    private final hs7 f;
    private final hs7 g;

    public final nua a() {
        return this.b;
    }

    public final qua b() {
        return this.a;
    }

    public final tua c(String str) {
        return (tua) this.g.get(str);
    }

    public final wua d(String str) {
        return (wua) this.f.get(str);
    }

    public final ava e() {
        return this.d;
    }

    public final hva f() {
        return this.c;
    }

    public final wza g() {
        return this.e;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList(this.f.size());
        for (int i = 0; i < this.f.size(); i++) {
            arrayList.add((String) this.f.i(i));
        }
        return arrayList;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        if (this.c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    private clc(alc alcVar) {
        this.a = alcVar.a;
        this.b = alcVar.b;
        this.c = alcVar.c;
        this.f = new hs7(alcVar.f);
        this.g = new hs7(alcVar.g);
        this.d = alcVar.d;
        this.e = alcVar.e;
    }
}
