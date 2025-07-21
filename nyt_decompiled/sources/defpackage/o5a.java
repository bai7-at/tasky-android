package defpackage;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class o5a implements t4a {
    private final b9e a = new b9e();
    private final b9e b = new b9e();
    private final n5a c = new n5a();
    private Inflater d;

    @Override // defpackage.t4a
    public final void a(byte[] bArr, int i, int i2, s4a s4aVar, pgd pgdVar) {
        this.a.i(bArr, i2 + i);
        this.a.k(i);
        b9e b9eVar = this.a;
        if (b9eVar.q() > 0 && b9eVar.u() == 120) {
            if (this.d == null) {
                this.d = new Inflater();
            }
            if (khe.g(b9eVar, this.b, this.d)) {
                b9e b9eVar2 = this.b;
                b9eVar.i(b9eVar2.m(), b9eVar2.t());
            }
        }
        this.c.e();
        ArrayList arrayList = new ArrayList();
        while (true) {
            b9e b9eVar3 = this.a;
            if (b9eVar3.q() < 3) {
                pgdVar.zza(new m4a(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            n5a n5aVar = this.c;
            int t = b9eVar3.t();
            int B = b9eVar3.B();
            int F = b9eVar3.F();
            int s = b9eVar3.s() + F;
            e2d e2dVar = null;
            if (s > t) {
                b9eVar3.k(t);
            } else {
                if (B != 128) {
                    switch (B) {
                        case 20:
                            n5a.d(n5aVar, b9eVar3, F);
                            break;
                        case 21:
                            n5a.b(n5aVar, b9eVar3, F);
                            break;
                        case 22:
                            n5a.c(n5aVar, b9eVar3, F);
                            break;
                    }
                } else {
                    e2dVar = n5aVar.a();
                    n5aVar.e();
                }
                b9eVar3.k(s);
            }
            if (e2dVar != null) {
                arrayList.add(e2dVar);
            }
        }
    }
}
