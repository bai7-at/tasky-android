package defpackage;

import com.nytimes.android.subauth.core.auth.network.response.LoginError;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class yl7 {

    public static abstract class a extends yl7 {

        /* renamed from: yl7$a$a, reason: collision with other inner class name */
        public static final class C0558a extends a {
            private final LoginError a;
            private final Throwable b;

            public /* synthetic */ C0558a(LoginError loginError, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(loginError, (i & 2) != 0 ? null : th);
            }

            public final LoginError a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0558a)) {
                    return false;
                }
                C0558a c0558a = (C0558a) obj;
                return zq3.c(this.a, c0558a.a) && zq3.c(this.b, c0558a.b);
            }

            public int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Throwable th = this.b;
                return hashCode + (th == null ? 0 : th.hashCode());
            }

            public String toString() {
                return "General(error=" + this.a + ", throwable=" + this.b + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0558a(LoginError loginError, Throwable th) {
                super(null);
                zq3.h(loginError, "error");
                this.a = loginError;
                this.b = th;
            }
        }

        public static final class b extends a {
            private final String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(null);
                zq3.h(str, "errorMessage");
                this.a = str;
            }

            public final String a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "InvalidLoginResponse(errorMessage=" + this.a + ")";
            }
        }

        public static final class c extends a {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        public static final class d extends a {
            private final LoginError a;
            private final Throwable b;

            public /* synthetic */ d(LoginError loginError, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(loginError, (i & 2) != 0 ? null : th);
            }

            public final LoginError a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b);
            }

            public int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Throwable th = this.b;
                return hashCode + (th == null ? 0 : th.hashCode());
            }

            public String toString() {
                return "PreconditionFailed(error=" + this.a + ", throwable=" + this.b + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(LoginError loginError, Throwable th) {
                super(null);
                zq3.h(loginError, "error");
                this.a = loginError;
                this.b = th;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    public static final class b extends yl7 {
        private final LoginResponse a;

        public b(LoginResponse loginResponse) {
            super(null);
            this.a = loginResponse;
        }

        public final LoginResponse a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            LoginResponse loginResponse = this.a;
            if (loginResponse == null) {
                return 0;
            }
            return loginResponse.hashCode();
        }

        public String toString() {
            return "Success(response=" + this.a + ")";
        }
    }

    public /* synthetic */ yl7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private yl7() {
    }
}
