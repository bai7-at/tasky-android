package androidx.navigation;

import android.os.Bundle;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class a {
    private final j a;
    private final boolean b;
    private final boolean c;
    private final Object d;

    /* renamed from: androidx.navigation.a$a, reason: collision with other inner class name */
    public static final class C0095a {
        private j a;
        private boolean b;
        private Object c;
        private boolean d;

        public final a a() {
            j jVar = this.a;
            if (jVar == null) {
                jVar = j.c.a(this.c);
                zq3.f(jVar, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new a(jVar, this.b, this.c, this.d);
        }

        public final C0095a b(Object obj) {
            this.c = obj;
            this.d = true;
            return this;
        }
    }

    public a(j jVar, boolean z, Object obj, boolean z2) {
        zq3.h(jVar, TransferTable.COLUMN_TYPE);
        if (!jVar.c() && z) {
            throw new IllegalArgumentException((jVar.b() + " does not allow nullable values").toString());
        }
        if (!z && z2 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + jVar.b() + " has null value but is not nullable.").toString());
        }
        this.a = jVar;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    public final j a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.b;
    }

    public final void d(String str, Bundle bundle) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(bundle, "bundle");
        if (this.c) {
            this.a.h(bundle, str, this.d);
        }
    }

    public final boolean e(String str, Bundle bundle) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(bundle, "bundle");
        if (!this.b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.a.a(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zq3.c(a.class, obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        if (this.b != aVar.b || this.c != aVar.c || !zq3.c(this.a, aVar.a)) {
            return false;
        }
        Object obj2 = this.d;
        return obj2 != null ? zq3.c(obj2, aVar.d) : aVar.d == null;
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(a.class.getSimpleName());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.d);
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "sb.toString()");
        return sb2;
    }
}
