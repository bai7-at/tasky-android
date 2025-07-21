package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes2.dex */
public class z03 implements ov3 {
    private final q73 b;
    private final URL c;
    private final String d;
    private String e;
    private URL f;
    private volatile byte[] g;
    private int h;

    public z03(URL url) {
        this(url, q73.b);
    }

    private byte[] d() {
        if (this.g == null) {
            this.g = c().getBytes(ov3.a);
        }
        return this.g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.e)) {
            String str = this.d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) z06.d(this.c)).toString();
            }
            this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.e;
    }

    private URL g() {
        if (this.f == null) {
            this.f = new URL(f());
        }
        return this.f;
    }

    @Override // defpackage.ov3
    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.d;
        return str != null ? str : ((URL) z06.d(this.c)).toString();
    }

    public Map e() {
        return this.b.getHeaders();
    }

    @Override // defpackage.ov3
    public boolean equals(Object obj) {
        if (!(obj instanceof z03)) {
            return false;
        }
        z03 z03Var = (z03) obj;
        return c().equals(z03Var.c()) && this.b.equals(z03Var.b);
    }

    public URL h() {
        return g();
    }

    @Override // defpackage.ov3
    public int hashCode() {
        if (this.h == 0) {
            int hashCode = c().hashCode();
            this.h = hashCode;
            this.h = (hashCode * 31) + this.b.hashCode();
        }
        return this.h;
    }

    public String toString() {
        return c();
    }

    public z03(String str) {
        this(str, q73.b);
    }

    public z03(URL url, q73 q73Var) {
        this.c = (URL) z06.d(url);
        this.d = null;
        this.b = (q73) z06.d(q73Var);
    }

    public z03(String str, q73 q73Var) {
        this.c = null;
        this.d = z06.b(str);
        this.b = (q73) z06.d(q73Var);
    }
}
