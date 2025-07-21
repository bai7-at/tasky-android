package defpackage;

import android.database.Cursor;
import com.facebook.AuthenticationTokenClaims;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ha9 {
    public static final a c = new a(null);
    public final String a;
    public final String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ha9 a(sc8 sc8Var, String str) {
            ha9 ha9Var;
            zq3.h(sc8Var, "database");
            zq3.h(str, "viewName");
            Cursor T0 = sc8Var.T0("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + '\'');
            try {
                if (T0.moveToFirst()) {
                    String string = T0.getString(0);
                    zq3.g(string, "cursor.getString(0)");
                    ha9Var = new ha9(string, T0.getString(1));
                } else {
                    ha9Var = new ha9(str, null);
                }
                gm0.a(T0, null);
                return ha9Var;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    gm0.a(T0, th);
                    throw th2;
                }
            }
        }

        private a() {
        }
    }

    public ha9(String str, String str2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.a = str;
        this.b = str2;
    }

    public static final ha9 a(sc8 sc8Var, String str) {
        return c.a(sc8Var, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha9)) {
            return false;
        }
        ha9 ha9Var = (ha9) obj;
        if (zq3.c(this.a, ha9Var.a)) {
            String str = this.b;
            if (str != null ? zq3.c(str, ha9Var.b) : ha9Var.b == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ViewInfo{name='" + this.a + "', sql='" + this.b + "'}";
    }
}
