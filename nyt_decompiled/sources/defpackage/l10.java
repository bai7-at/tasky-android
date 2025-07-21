package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
final class l10 extends q21 {
    private final Context a;
    private final ul0 b;
    private final ul0 c;
    private final String d;

    l10(Context context, ul0 ul0Var, ul0 ul0Var2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (ul0Var == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = ul0Var;
        if (ul0Var2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = ul0Var2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    @Override // defpackage.q21
    public Context b() {
        return this.a;
    }

    @Override // defpackage.q21
    public String c() {
        return this.d;
    }

    @Override // defpackage.q21
    public ul0 d() {
        return this.c;
    }

    @Override // defpackage.q21
    public ul0 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q21)) {
            return false;
        }
        q21 q21Var = (q21) obj;
        return this.a.equals(q21Var.b()) && this.b.equals(q21Var.e()) && this.c.equals(q21Var.d()) && this.d.equals(q21Var.c());
    }

    public int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.a + ", wallClock=" + this.b + ", monotonicClock=" + this.c + ", backendName=" + this.d + "}";
    }
}
