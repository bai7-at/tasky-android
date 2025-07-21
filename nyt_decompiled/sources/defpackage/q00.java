package defpackage;

import java.io.File;

/* loaded from: classes3.dex */
final class q00 extends g21 {
    private final s11 a;
    private final String b;
    private final File c;

    q00(s11 s11Var, String str, File file) {
        if (s11Var == null) {
            throw new NullPointerException("Null report");
        }
        this.a = s11Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.c = file;
    }

    @Override // defpackage.g21
    public s11 b() {
        return this.a;
    }

    @Override // defpackage.g21
    public File c() {
        return this.c;
    }

    @Override // defpackage.g21
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g21)) {
            return false;
        }
        g21 g21Var = (g21) obj;
        return this.a.equals(g21Var.b()) && this.b.equals(g21Var.d()) && this.c.equals(g21Var.c());
    }

    public int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
