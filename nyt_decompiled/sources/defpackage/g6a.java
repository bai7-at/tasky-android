package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class g6a implements t4a {
    private final b9e a = new b9e();

    @Override // defpackage.t4a
    public final void a(byte[] bArr, int i, int i2, s4a s4aVar, pgd pgdVar) {
        e2d p;
        this.a.i(bArr, i2 + i);
        this.a.k(i);
        ArrayList arrayList = new ArrayList();
        while (true) {
            b9e b9eVar = this.a;
            if (b9eVar.q() <= 0) {
                pgdVar.zza(new m4a(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            wad.e(b9eVar.q() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            b9e b9eVar2 = this.a;
            int v = b9eVar2.v() - 8;
            if (b9eVar2.v() == 1987343459) {
                b9e b9eVar3 = this.a;
                CharSequence charSequence = null;
                zzc zzcVar = null;
                while (v > 0) {
                    wad.e(v >= 8, "Incomplete vtt cue box header found.");
                    int v2 = b9eVar3.v();
                    int v3 = b9eVar3.v();
                    int i3 = v - 8;
                    int i4 = v2 - 8;
                    String a = khe.a(b9eVar3.m(), b9eVar3.s(), i4);
                    b9eVar3.l(i4);
                    if (v3 == 1937011815) {
                        zzcVar = v6a.b(a);
                    } else if (v3 == 1885436268) {
                        charSequence = v6a.a(null, a.trim(), Collections.emptyList());
                    }
                    v = i3 - i4;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (zzcVar != null) {
                    zzcVar.l(charSequence);
                    p = zzcVar.p();
                } else {
                    u6a u6aVar = new u6a();
                    u6aVar.c = charSequence;
                    p = u6aVar.a().p();
                }
                arrayList.add(p);
            } else {
                this.a.l(v);
            }
        }
    }
}
