package defpackage;

import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import com.nytimes.android.subauth.core.auth.network.response.LoginError;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import defpackage.h77;
import defpackage.lh5;
import defpackage.qv7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class oa4 {

    public static final class a extends oa4 {
        private final LoginMethod a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LoginMethod loginMethod) {
            super(null);
            zq3.h(loginMethod, "loginMethod");
            this.a = loginMethod;
        }

        public final LoginMethod a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Cancelled(loginMethod=" + this.a + ")";
        }
    }

    public static final class b extends oa4 {
        private final LoginError a;
        private final LoginMethod b;
        private final qv7.a c;
        private final lh5.a d;
        private final h77.a e;
        private final Throwable f;
        private final boolean g;

        public /* synthetic */ b(LoginError loginError, LoginMethod loginMethod, qv7.a aVar, lh5.a aVar2, h77.a aVar3, Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(loginError, loginMethod, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? null : aVar2, (i & 16) != 0 ? null : aVar3, (i & 32) != 0 ? null : th, (i & 64) != 0 ? false : z);
        }

        public final LoginError a() {
            return this.a;
        }

        public final LoginMethod b() {
            return this.b;
        }

        public final lh5.a c() {
            return this.d;
        }

        public final qv7.a d() {
            return this.c;
        }

        public final h77.a e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && this.b == bVar.b && zq3.c(this.c, bVar.c) && zq3.c(this.d, bVar.d) && zq3.c(this.e, bVar.e) && zq3.c(this.f, bVar.f) && this.g == bVar.g;
        }

        public final Throwable f() {
            return this.f;
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            qv7.a aVar = this.c;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            lh5.a aVar2 = this.d;
            int hashCode3 = (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            h77.a aVar3 = this.e;
            int hashCode4 = (hashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
            Throwable th = this.f;
            return ((hashCode4 + (th != null ? th.hashCode() : 0)) * 31) + Boolean.hashCode(this.g);
        }

        public String toString() {
            return "Error(error=" + this.a + ", loginMethod=" + this.b + ", smartLockReadResult=" + this.c + ", oneTapResult=" + this.d + ", ssoResult=" + this.e + ", throwable=" + this.f + ", isNetworkConnectivityError=" + this.g + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LoginError loginError, LoginMethod loginMethod, qv7.a aVar, lh5.a aVar2, h77.a aVar3, Throwable th, boolean z) {
            super(null);
            zq3.h(loginError, "error");
            zq3.h(loginMethod, "loginMethod");
            this.a = loginError;
            this.b = loginMethod;
            this.c = aVar;
            this.d = aVar2;
            this.e = aVar3;
            this.f = th;
            this.g = z;
        }
    }

    public static final class c extends oa4 {
        private final LoginResponse a;
        private final LoginMethod b;
        private final h77.c c;

        public /* synthetic */ c(LoginResponse loginResponse, LoginMethod loginMethod, h77.c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(loginResponse, loginMethod, (i & 4) != 0 ? null : cVar);
        }

        public static /* synthetic */ c b(c cVar, LoginResponse loginResponse, LoginMethod loginMethod, h77.c cVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                loginResponse = cVar.a;
            }
            if ((i & 2) != 0) {
                loginMethod = cVar.b;
            }
            if ((i & 4) != 0) {
                cVar2 = cVar.c;
            }
            return cVar.a(loginResponse, loginMethod, cVar2);
        }

        public final c a(LoginResponse loginResponse, LoginMethod loginMethod, h77.c cVar) {
            zq3.h(loginResponse, "response");
            zq3.h(loginMethod, "loginMethod");
            return new c(loginResponse, loginMethod, cVar);
        }

        public final LoginMethod c() {
            return this.b;
        }

        public final LoginResponse d() {
            return this.a;
        }

        public final h77.c e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && this.b == cVar.b && zq3.c(this.c, cVar.c);
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            h77.c cVar = this.c;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "Success(response=" + this.a + ", loginMethod=" + this.b + ", ssoResult=" + this.c + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LoginResponse loginResponse, LoginMethod loginMethod, h77.c cVar) {
            super(null);
            zq3.h(loginResponse, "response");
            zq3.h(loginMethod, "loginMethod");
            this.a = loginResponse;
            this.b = loginMethod;
            this.c = cVar;
        }
    }

    public /* synthetic */ oa4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private oa4() {
    }
}
