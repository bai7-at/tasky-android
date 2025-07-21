package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;

/* loaded from: classes3.dex */
public final class ur4 implements rp2 {
    private final String a;
    private final List b;

    public static final class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(str2, "value");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Property(key=" + this.a + ", value=" + this.b + ")";
        }
    }

    public ur4(String str, List list) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(list, "properties");
        this.a = str;
        this.b = list;
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur4)) {
            return false;
        }
        ur4 ur4Var = (ur4) obj;
        return zq3.c(this.a, ur4Var.a) && zq3.c(this.b, ur4Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "MessageProperties(name=" + this.a + ", properties=" + this.b + ")";
    }
}
