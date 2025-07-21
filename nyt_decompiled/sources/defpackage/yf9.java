package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.t0;
import defpackage.ei7;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class yf9 implements y72 {
    private static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    private final String a;
    private final qm8 b;
    private a82 d;
    private int f;
    private final yo5 c = new yo5();
    private byte[] e = new byte[1024];

    public yf9(String str, qm8 qm8Var) {
        this.a = str;
        this.b = qm8Var;
    }

    private yp8 b(long j) {
        yp8 a = this.d.a(0, 3);
        a.d(new t0.b().g0("text/vtt").X(this.a).k0(j).G());
        this.d.s();
        return a;
    }

    private void f() {
        yo5 yo5Var = new yo5(this.e);
        zf9.e(yo5Var);
        long j = 0;
        long j2 = 0;
        for (String s = yo5Var.s(); !TextUtils.isEmpty(s); s = yo5Var.s()) {
            if (s.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = g.matcher(s);
                if (!matcher.find()) {
                    throw ParserException.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + s, null);
                }
                Matcher matcher2 = h.matcher(s);
                if (!matcher2.find()) {
                    throw ParserException.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + s, null);
                }
                j2 = zf9.d((String) ur.e(matcher.group(1)));
                j = qm8.g(Long.parseLong((String) ur.e(matcher2.group(1))));
            }
        }
        Matcher a = zf9.a(yo5Var);
        if (a == null) {
            b(0L);
            return;
        }
        long d = zf9.d((String) ur.e(a.group(1)));
        long b = this.b.b(qm8.k((j + d) - j2));
        yp8 b2 = b(b - d);
        this.c.S(this.e, this.f);
        b2.a(this.c, this.f);
        b2.b(b, 1, this.f, 0, null);
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.d = a82Var;
        a82Var.p(new ei7.b(-9223372036854775807L));
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        ur.e(this.d);
        int length = (int) z72Var.getLength();
        int i = this.f;
        byte[] bArr = this.e;
        if (i == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i2 = this.f;
        int read = z72Var.read(bArr2, i2, bArr2.length - i2);
        if (read != -1) {
            int i3 = this.f + read;
            this.f = i3;
            if (length == -1 || i3 != length) {
                return 0;
            }
        }
        f();
        return -1;
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        z72Var.e(this.e, 0, 6, false);
        this.c.S(this.e, 6);
        if (zf9.b(this.c)) {
            return true;
        }
        z72Var.e(this.e, 6, 3, false);
        this.c.S(this.e, 9);
        return zf9.b(this.c);
    }

    @Override // defpackage.y72
    public void release() {
    }
}
