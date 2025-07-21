package defpackage;

import com.nytimes.android.subauth.core.api.providers.LinkResult;
import com.nytimes.subauth.ui.models.LoginType;
import defpackage.oa4;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class q54 {

    public static final class a extends q54 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends q54 {
        private final oa4.c a;
        private final LoginType b;
        private final LinkResult c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oa4.c cVar, LoginType loginType, LinkResult linkResult) {
            super(null);
            zq3.h(cVar, "loginStatus");
            zq3.h(loginType, "loginType");
            zq3.h(linkResult, "linkResult");
            this.a = cVar;
            this.b = loginType;
            this.c = linkResult;
        }

        public final oa4.c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && this.c == bVar.c;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "LoginSuccess(loginStatus=" + this.a + ", loginType=" + this.b + ", linkResult=" + this.c + ")";
        }
    }

    public static final class c extends q54 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ q54(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private q54() {
    }
}
