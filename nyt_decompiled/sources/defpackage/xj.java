package defpackage;

import com.apollographql.apollo.api.http.HttpMethod;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import java.util.UUID;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class xj {
    private final ii5 a;
    private final UUID b;
    private final m62 c;
    private final HttpMethod d;
    private final List e;
    private final Boolean f;
    private final Boolean g;
    private final Boolean h;
    private final Boolean i;
    private final Boolean j;
    private final Boolean k;
    private final Boolean l;

    public static final class a {
        private final ii5 a;
        private UUID b;
        private m62 c;
        private HttpMethod d;
        private List e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private Boolean k;
        private Boolean l;

        public a(ii5 ii5Var) {
            zq3.h(ii5Var, "operation");
            this.a = ii5Var;
            this.c = m62.b;
        }

        public a a(String str, String str2) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str2, "value");
            List k = k();
            if (k == null) {
                k = i.l();
            }
            this.e = i.G0(k, new va3(str, str2));
            return this;
        }

        public final xj b() {
            ii5 ii5Var = this.a;
            UUID uuid = this.b;
            if (uuid == null) {
                uuid = UUID.randomUUID();
                zq3.g(uuid, "randomUUID(...)");
            }
            return new xj(ii5Var, uuid, i(), l(), k(), o(), p(), h(), g(), this.j, this.k, this.l, null);
        }

        public a c(Boolean bool) {
            this.i = bool;
            return this;
        }

        public a d(Boolean bool) {
            this.f = bool;
            return this;
        }

        public final a e(m62 m62Var) {
            zq3.h(m62Var, "executionContext");
            this.c = m62Var;
            return this;
        }

        public final a f(Boolean bool) {
            this.l = bool;
            return this;
        }

        public Boolean g() {
            return this.i;
        }

        public Boolean h() {
            return this.f;
        }

        public m62 i() {
            return this.c;
        }

        public final Boolean j() {
            return this.l;
        }

        public List k() {
            return this.e;
        }

        public HttpMethod l() {
            return this.d;
        }

        public final Boolean m() {
            return this.j;
        }

        public final Boolean n() {
            return this.k;
        }

        public Boolean o() {
            return this.g;
        }

        public Boolean p() {
            return this.h;
        }

        public a q(List list) {
            this.e = list;
            return this;
        }

        public a r(HttpMethod httpMethod) {
            this.d = httpMethod;
            return this;
        }

        public final a s(Boolean bool) {
            this.j = bool;
            return this;
        }

        public final a t(UUID uuid) {
            zq3.h(uuid, "requestUuid");
            this.b = uuid;
            return this;
        }

        public final a u(Boolean bool) {
            this.k = bool;
            return this;
        }

        public a v(Boolean bool) {
            this.g = bool;
            return this;
        }

        public a w(Boolean bool) {
            this.h = bool;
            return this;
        }
    }

    public /* synthetic */ xj(ii5 ii5Var, UUID uuid, m62 m62Var, HttpMethod httpMethod, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, DefaultConstructorMarker defaultConstructorMarker) {
        this(ii5Var, uuid, m62Var, httpMethod, list, bool, bool2, bool3, bool4, bool5, bool6, bool7);
    }

    public Boolean a() {
        return this.i;
    }

    public Boolean b() {
        return this.h;
    }

    public m62 c() {
        return this.c;
    }

    public final Boolean d() {
        return this.l;
    }

    public List e() {
        return this.e;
    }

    public HttpMethod f() {
        return this.d;
    }

    public final ii5 g() {
        return this.a;
    }

    public final UUID h() {
        return this.b;
    }

    public final Boolean i() {
        return this.k;
    }

    public Boolean j() {
        return this.f;
    }

    public Boolean k() {
        return this.g;
    }

    public final a l() {
        return m(this.a);
    }

    public final a m(ii5 ii5Var) {
        zq3.h(ii5Var, "operation");
        return new a(ii5Var).t(this.b).e(c()).r(f()).q(e()).v(j()).w(k()).d(b()).c(a()).u(this.k).f(this.l).s(this.j);
    }

    private xj(ii5 ii5Var, UUID uuid, m62 m62Var, HttpMethod httpMethod, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this.a = ii5Var;
        this.b = uuid;
        this.c = m62Var;
        this.d = httpMethod;
        this.e = list;
        this.f = bool;
        this.g = bool2;
        this.h = bool3;
        this.i = bool4;
        this.j = bool5;
        this.k = bool6;
        this.l = bool7;
    }
}
