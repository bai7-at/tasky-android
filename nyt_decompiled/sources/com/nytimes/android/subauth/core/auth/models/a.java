package com.nytimes.android.subauth.core.auth.models;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.nytimes.android.subauth.core.auth.models.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0406a extends a {
        private final Integer a;
        private final String b;

        /* renamed from: com.nytimes.android.subauth.core.auth.models.a$a$a, reason: collision with other inner class name */
        public static final class C0407a extends AbstractC0406a {
            public static final C0407a c = new C0407a();

            /* JADX WARN: Multi-variable type inference failed */
            private C0407a() {
                super(null, "Anonymous User", 0 == true ? 1 : 0);
            }
        }

        /* renamed from: com.nytimes.android.subauth.core.auth.models.a$a$b */
        public static final class b extends AbstractC0406a {
            private final int c;
            private final String d;

            public b(int i, String str) {
                super(Integer.valueOf(i), str, null);
                this.c = i;
                this.d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.c == bVar.c && zq3.c(this.d, bVar.d);
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.c) * 31;
                String str = this.d;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Existing1PSubscription(httpStatusCode=" + this.c + ", errorMessage=" + this.d + ")";
            }
        }

        /* renamed from: com.nytimes.android.subauth.core.auth.models.a$a$c */
        public static final class c extends AbstractC0406a {
            public static final c c = new c();

            /* JADX WARN: Multi-variable type inference failed */
            private c() {
                super(null, "Existing 3P (Google Play) Subscription", 0 == true ? 1 : 0);
            }
        }

        /* renamed from: com.nytimes.android.subauth.core.auth.models.a$a$d */
        public static final class d extends AbstractC0406a {
            private final int c;
            private final String d;

            public d(int i, String str) {
                super(Integer.valueOf(i), str, null);
                this.c = i;
                this.d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.c == dVar.c && zq3.c(this.d, dVar.d);
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.c) * 31;
                String str = this.d;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "InvalidOrMissingCookie(httpStatusCode=" + this.c + ", errorMessage=" + this.d + ")";
            }
        }

        /* renamed from: com.nytimes.android.subauth.core.auth.models.a$a$e */
        public static final class e extends AbstractC0406a {
            public static final e c = new e();

            /* JADX WARN: Multi-variable type inference failed */
            private e() {
                super(null, "Internet Not Connected", 1, 0 == true ? 1 : 0);
            }
        }

        /* renamed from: com.nytimes.android.subauth.core.auth.models.a$a$f */
        public static final class f extends AbstractC0406a {
            private final int c;
            private final String d;

            public f(int i, String str) {
                super(Integer.valueOf(i), str, null);
                this.c = i;
                this.d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.c == fVar.c && zq3.c(this.d, fVar.d);
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.c) * 31;
                String str = this.d;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "ServerError(httpStatusCode=" + this.c + ", errorMessage=" + this.d + ")";
            }
        }

        /* renamed from: com.nytimes.android.subauth.core.auth.models.a$a$g */
        public static final class g extends AbstractC0406a {
            private final String c;

            /* JADX WARN: Multi-variable type inference failed */
            public g(String str) {
                super(null, str, 1, 0 == true ? 1 : 0);
                this.c = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && zq3.c(this.c, ((g) obj).c);
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

        public /* synthetic */ AbstractC0406a(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str);
        }

        public /* synthetic */ AbstractC0406a(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, null);
        }

        private AbstractC0406a(Integer num, String str) {
            super(null);
            this.a = num;
            this.b = str;
        }
    }

    public static final class b extends a {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
