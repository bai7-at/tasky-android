package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class v32 {
    public static final a c = new a(null);
    public static final int d = 8;
    private final ue4 a;
    private final ue4 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ v32 b(a aVar, String str, u52 u52Var, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return aVar.a(str, u52Var, str2);
        }

        public final v32 a(String str, u52 u52Var, String str2) {
            Pair pair;
            zq3.h(u52Var, "eventType");
            Pair a = du8.a(AuthenticationTokenClaims.JSON_KEY_NAME, "unified-lire");
            Pair a2 = du8.a("label", "client-id:" + str);
            Pair c = u52Var.c();
            if (c != null) {
                Pair a3 = du8.a(AuthenticationTokenClaims.JSON_KEY_NAME, c.c());
                Object d = c.d();
                if (str2 == null) {
                    str2 = "";
                }
                pair = du8.a("element", new ue4(a3, du8.a("label", d + str2)));
            } else {
                pair = null;
            }
            Pair[] pairArr = (Pair[]) i.q(a, a2, pair).toArray(new Pair[0]);
            ue4 ue4Var = new ue4((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            String a4 = u52Var.a();
            Pair a5 = a4 != null ? du8.a("pageType", a4) : null;
            String b = u52Var.b();
            Pair[] pairArr2 = (Pair[]) i.q(a5, b != null ? du8.a(TransferTable.COLUMN_TYPE, b) : null).toArray(new Pair[0]);
            return new v32(ue4Var, new ue4((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
        }

        private a() {
        }
    }

    public v32(ue4 ue4Var, ue4 ue4Var2) {
        this.a = ue4Var;
        this.b = ue4Var2;
    }

    public final ue4 a() {
        return this.b;
    }

    public final ue4 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v32)) {
            return false;
        }
        v32 v32Var = (v32) obj;
        return zq3.c(this.a, v32Var.a) && zq3.c(this.b, v32Var.b);
    }

    public int hashCode() {
        ue4 ue4Var = this.a;
        int hashCode = (ue4Var == null ? 0 : ue4Var.hashCode()) * 31;
        ue4 ue4Var2 = this.b;
        return hashCode + (ue4Var2 != null ? ue4Var2.hashCode() : 0);
    }

    public String toString() {
        return "EventData(module=" + this.a + ", eventData=" + this.b + ")";
    }
}
