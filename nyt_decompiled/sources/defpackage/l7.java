package defpackage;

import com.facebook.AuthenticationTokenClaims;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class l7 {
    private final String a;

    public static final class a extends l7 {
        public static final a b = new a();

        private a() {
            super("full", null);
        }
    }

    public static final class b extends l7 {
        public static final b b = new b();

        private b() {
            super("ltd", null);
        }
    }

    public static final class c extends l7 {
        public static final c b = new c();

        private c() {
            super("npa", null);
        }
    }

    public static final class d extends l7 {
        public static final d b = new d();

        private d() {
            super("rdp", null);
        }
    }

    public static final class e extends l7 {
        private final String b;
        private final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2) {
            super(str, null);
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str2, "tcfString");
            this.b = str;
            this.c = str2;
        }

        @Override // defpackage.l7
        public String a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.b, eVar.b) && zq3.c(this.c, eVar.c);
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            return "TCF(name=" + this.b + ", tcfString=" + this.c + ")";
        }
    }

    public /* synthetic */ l7(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String a() {
        return this.a;
    }

    private l7(String str) {
        this.a = str;
    }
}
