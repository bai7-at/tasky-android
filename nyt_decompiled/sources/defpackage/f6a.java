package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.internal.ads.zzgaa;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes3.dex */
public final class f6a implements t4a {
    private final b9e a = new b9e();
    private final boolean b;
    private final int c;
    private final int d;
    private final String e;
    private final float f;
    private final int g;

    public f6a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = true == "Serif".equals(khe.a(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.f = 0.85f;
        }
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 == 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
                }
                z = false;
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t4a
    public final void a(byte[] bArr, int i, int i2, s4a s4aVar, pgd pgdVar) {
        String a;
        int i3;
        int i4;
        int i5;
        this.a.i(bArr, i + i2);
        this.a.k(i);
        b9e b9eVar = this.a;
        int i6 = 1;
        int i7 = 0;
        int i8 = 2;
        wad.d(b9eVar.q() >= 2);
        int F = b9eVar.F();
        if (F == 0) {
            a = "";
        } else {
            int s = b9eVar.s();
            Charset b = b9eVar.b();
            int s2 = b9eVar.s() - s;
            if (b == null) {
                b = ege.c;
            }
            a = b9eVar.a(F - s2, b);
        }
        if (a.isEmpty()) {
            pgdVar.zza(new m4a(zzgaa.t(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
        c(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.e;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.f;
        while (true) {
            b9e b9eVar2 = this.a;
            if (b9eVar2.q() < 8) {
                zzc zzcVar = new zzc();
                zzcVar.l(spannableStringBuilder);
                zzcVar.e(f, 0);
                zzcVar.f(0);
                pgdVar.zza(new m4a(zzgaa.u(zzcVar.p()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int s3 = b9eVar2.s();
            int v = b9eVar2.v();
            int v2 = this.a.v();
            if (v2 == 1937013100) {
                wad.d(this.a.q() >= i8 ? i6 : i7);
                int F2 = this.a.F();
                int i9 = i7;
                while (i9 < F2) {
                    b9e b9eVar3 = this.a;
                    wad.d(b9eVar3.q() >= 12 ? i6 : i7);
                    int F3 = b9eVar3.F();
                    int F4 = b9eVar3.F();
                    b9eVar3.l(i8);
                    int B = b9eVar3.B();
                    b9eVar3.l(i6);
                    int v3 = b9eVar3.v();
                    if (F4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        StringBuilder sb = new StringBuilder();
                        i4 = F2;
                        sb.append("Truncating styl end (");
                        sb.append(F4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        ezd.f("Tx3gParser", sb.toString());
                        i5 = spannableStringBuilder.length();
                    } else {
                        i4 = F2;
                        i5 = F4;
                    }
                    if (F3 >= i5) {
                        ezd.f("Tx3gParser", "Ignoring styl with start (" + F3 + ") >= end (" + i5 + ").");
                    } else {
                        int i10 = i5;
                        c(spannableStringBuilder, B, this.c, F3, i10, 0);
                        b(spannableStringBuilder, v3, this.d, F3, i10, 0);
                    }
                    i9++;
                    F2 = i4;
                    i6 = 1;
                    i7 = 0;
                    i8 = 2;
                }
                i3 = i8;
            } else if (v2 == 1952608120 && this.b) {
                i3 = 2;
                wad.d(this.a.q() >= 2);
                f = Math.max(0.0f, Math.min(this.a.F() / this.g, 0.95f));
            } else {
                i3 = 2;
            }
            this.a.k(s3 + v);
            i8 = i3;
            i6 = 1;
            i7 = 0;
        }
    }
}
