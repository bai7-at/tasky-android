package androidx.compose.foundation.text;

import defpackage.ss2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class b {
    public static final int h = 0;
    private final ss2 a;
    private final ss2 b;
    private final ss2 c;
    private final ss2 d;
    private final ss2 e;
    private final ss2 f;
    public static final a g = new a(null);
    private static final b i = new b(null, null, null, null, null, null, 63, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            return b.i;
        }

        private a() {
        }
    }

    public b(ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, ss2 ss2Var4, ss2 ss2Var5, ss2 ss2Var6) {
        this.a = ss2Var;
        this.b = ss2Var2;
        this.c = ss2Var3;
        this.d = ss2Var4;
        this.e = ss2Var5;
        this.f = ss2Var6;
    }

    public final ss2 b() {
        return this.a;
    }

    public final ss2 c() {
        return this.b;
    }

    public final ss2 d() {
        return this.c;
    }

    public final ss2 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c) && zq3.c(this.d, bVar.d) && zq3.c(this.e, bVar.e) && zq3.c(this.f, bVar.f);
    }

    public final ss2 f() {
        return this.e;
    }

    public final ss2 g() {
        return this.f;
    }

    public int hashCode() {
        ss2 ss2Var = this.a;
        int hashCode = (ss2Var != null ? ss2Var.hashCode() : 0) * 31;
        ss2 ss2Var2 = this.b;
        int hashCode2 = (hashCode + (ss2Var2 != null ? ss2Var2.hashCode() : 0)) * 31;
        ss2 ss2Var3 = this.c;
        int hashCode3 = (hashCode2 + (ss2Var3 != null ? ss2Var3.hashCode() : 0)) * 31;
        ss2 ss2Var4 = this.d;
        int hashCode4 = (hashCode3 + (ss2Var4 != null ? ss2Var4.hashCode() : 0)) * 31;
        ss2 ss2Var5 = this.e;
        int hashCode5 = (hashCode4 + (ss2Var5 != null ? ss2Var5.hashCode() : 0)) * 31;
        ss2 ss2Var6 = this.f;
        return hashCode5 + (ss2Var6 != null ? ss2Var6.hashCode() : 0);
    }

    public /* synthetic */ b(ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, ss2 ss2Var4, ss2 ss2Var5, ss2 ss2Var6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : ss2Var, (i2 & 2) != 0 ? null : ss2Var2, (i2 & 4) != 0 ? null : ss2Var3, (i2 & 8) != 0 ? null : ss2Var4, (i2 & 16) != 0 ? null : ss2Var5, (i2 & 32) != 0 ? null : ss2Var6);
    }
}
