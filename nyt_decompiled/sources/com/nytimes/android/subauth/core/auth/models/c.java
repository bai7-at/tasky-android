package com.nytimes.android.subauth.core.auth.models;

import com.nytimes.android.subauth.core.auth.network.response.VerifyEmailWithCodeResponse;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class c {

    public static abstract class a extends c {
        private final Integer a;
        private final String b;

        /* renamed from: com.nytimes.android.subauth.core.auth.models.c$a$a, reason: collision with other inner class name */
        public static final class C0411a extends a {
            private final int c;
            private final int d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0411a(int i, int i2) {
                super(Integer.valueOf(i), null, 2, 0 == true ? 1 : 0);
                this.c = i;
                this.d = i2;
            }

            public final int b() {
                return this.d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0411a)) {
                    return false;
                }
                C0411a c0411a = (C0411a) obj;
                return this.c == c0411a.c && this.d == c0411a.d;
            }

            public int hashCode() {
                return (Integer.hashCode(this.c) * 31) + Integer.hashCode(this.d);
            }

            public String toString() {
                return "BadRequest(httpStatusCode=" + this.c + ", errorCode=" + this.d + ")";
            }
        }

        public static final class b extends a {
            public static final b c = new b();

            /* JADX WARN: Multi-variable type inference failed */
            private b() {
                super(null, "Internet Not Connected", 1, 0 == true ? 1 : 0);
            }
        }

        /* renamed from: com.nytimes.android.subauth.core.auth.models.c$a$c, reason: collision with other inner class name */
        public static final class C0412c extends a {
            private final int c;

            /* JADX WARN: Multi-variable type inference failed */
            public C0412c(int i) {
                super(Integer.valueOf(i), null, 2, 0 == true ? 1 : 0);
                this.c = i;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0412c) && this.c == ((C0412c) obj).c;
            }

            public int hashCode() {
                return Integer.hashCode(this.c);
            }

            public String toString() {
                return "ServerError(httpStatusCode=" + this.c + ")";
            }
        }

        public static final class d extends a {
            private final String c;

            /* JADX WARN: Multi-variable type inference failed */
            public d(String str) {
                super(null, str, 1, 0 == true ? 1 : 0);
                this.c = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && zq3.c(this.c, ((d) obj).c);
            }

            public int hashCode() {
                String str = this.c;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "UnknownError(errorMessage=" + this.c + ")";
            }
        }

        public /* synthetic */ a(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str);
        }

        public final String a() {
            return this.b;
        }

        private a(Integer num, String str) {
            super(null);
            this.a = num;
            this.b = str;
        }

        public /* synthetic */ a(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, null);
        }
    }

    public static final class b extends c {
        private final VerifyEmailWithCodeResponse a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(VerifyEmailWithCodeResponse verifyEmailWithCodeResponse) {
            super(null);
            zq3.h(verifyEmailWithCodeResponse, "response");
            this.a = verifyEmailWithCodeResponse;
        }

        public final VerifyEmailWithCodeResponse a() {
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
            return "Success(response=" + this.a + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
