package com.nytimes.android.subauth.core.auth.network.response;

import com.comscore.streaming.WindowState;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class c {

    public static abstract class a extends c {
        private final String a;
        private final String b;
        private final Integer c;

        /* renamed from: com.nytimes.android.subauth.core.auth.network.response.c$a$a, reason: collision with other inner class name */
        public static final class C0414a extends a {
            private final String d;

            public C0414a(String str) {
                super("Bad Request", str, Integer.valueOf(WindowState.NORMAL), null);
                this.d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0414a) && zq3.c(this.d, ((C0414a) obj).d);
            }

            public int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "BadRequest(message=" + this.d + ")";
            }
        }

        public static final class b extends a {
            private final String d;

            public b(String str) {
                super("Internal Server Error", str, 500, null);
                this.d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && zq3.c(this.d, ((b) obj).d);
            }

            public int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "InternalServerError(message=" + this.d + ")";
            }
        }

        /* renamed from: com.nytimes.android.subauth.core.auth.network.response.c$a$c, reason: collision with other inner class name */
        public static final class C0415c extends a {
            private final String d;

            public C0415c(String str) {
                super("Missing Cookie", str, 200, null);
                this.d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0415c) && zq3.c(this.d, ((C0415c) obj).d);
            }

            public int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "MissingCookie(message=" + this.d + ")";
            }
        }

        public static final class d extends a {
            private final String d;

            public d(String str) {
                super("Network Connectivity Error", str, null, 4, null);
                this.d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && zq3.c(this.d, ((d) obj).d);
            }

            public int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "NetworkConnectivityError(message=" + this.d + ")";
            }
        }

        public static final class e extends a {
            public static final e d = new e();

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private e() {
                /*
                    r3 = this;
                    r0 = 503(0x1f7, float:7.05E-43)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r1 = 0
                    java.lang.String r2 = "Service Unavailable"
                    r3.<init>(r2, r2, r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.network.response.c.a.e.<init>():void");
            }
        }

        public static final class f extends a {
            private final String d;

            public f(String str) {
                super("Unknown Error", str, null, 4, null);
                this.d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && zq3.c(this.d, ((f) obj).d);
            }

            public int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "UnknownError(message=" + this.d + ")";
            }
        }

        public /* synthetic */ a(String str, String str2, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, num);
        }

        public final Integer a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public /* synthetic */ a(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : num, null);
        }

        private a(String str, String str2, Integer num) {
            super(null);
            this.a = str;
            this.b = str2;
            this.c = num;
        }
    }

    public static final class b extends c {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            zq3.h(str, "refreshedToken");
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
            return "Success(refreshedToken=" + this.a + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
