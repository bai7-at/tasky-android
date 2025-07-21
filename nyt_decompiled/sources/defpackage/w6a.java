package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcc;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class w6a implements t4a {
    private final b9e a = new b9e();
    private final h6a b = new h6a();

    @Override // defpackage.t4a
    public final void a(byte[] bArr, int i, int i2, s4a s4aVar, pgd pgdVar) {
        this.a.i(bArr, i2 + i);
        this.a.k(i);
        ArrayList arrayList = new ArrayList();
        try {
            b9e b9eVar = this.a;
            int s = b9eVar.s();
            Charset charset = ege.c;
            String N = b9eVar.N(charset);
            if (N == null || !N.startsWith("WEBVTT")) {
                b9eVar.k(s);
                throw zzcc.a("Expected WEBVTT. Got ".concat(String.valueOf(b9eVar.N(charset))), null);
            }
            while (!TextUtils.isEmpty(this.a.N(ege.c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                b9e b9eVar2 = this.a;
                char c = 65535;
                int i3 = 0;
                while (c == 65535) {
                    i3 = b9eVar2.s();
                    String N2 = b9eVar2.N(ege.c);
                    c = N2 == null ? (char) 0 : "STYLE".equals(N2) ? (char) 2 : N2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                b9eVar2.k(i3);
                if (c == 0) {
                    o4a.a(new z6a(arrayList2), s4aVar, pgdVar);
                    return;
                }
                if (c == 1) {
                    while (!TextUtils.isEmpty(this.a.N(ege.c))) {
                    }
                } else if (c != 2) {
                    o6a c2 = v6a.c(this.a, arrayList);
                    if (c2 != null) {
                        arrayList2.add(c2);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.a.N(ege.c);
                    arrayList.addAll(this.b.b(this.a));
                }
            }
        } catch (zzcc e) {
            throw new IllegalArgumentException(e);
        }
    }
}
