package com.nytimes.android.subauth.core.auth.models;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class b {

    public static abstract class a extends b {
        private final Integer a;
        private final String b;

        /* renamed from: com.nytimes.android.subauth.core.auth.models.b$a$a, reason: collision with other inner class name */
        public static final class C0408a extends a {
            private final int c;

            /* JADX WARN: Multi-variable type inference failed */
            public C0408a(int i) {
                super(Integer.valueOf(i), null, 2, 0 == true ? 1 : 0);
                this.c = i;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0408a) && this.c == ((C0408a) obj).c;
            }

            public int hashCode() {
                return Integer.hashCode(this.c);
            }

            public String toString() {
                return "BadRequest(httpStatusCode=" + this.c + ")";
            }
        }

        /* renamed from: com.nytimes.android.subauth.core.auth.models.b$a$b, reason: collision with other inner class name */
        public static final class C0409b extends a {
            public static final C0409b c = new C0409b();

            /* JADX WARN: Multi-variable type inference failed */
            private C0409b() {
                super(null, "Internet Not Connected", 1, 0 == true ? 1 : 0);
            }
        }

        public static final class c extends a {
            private final int c;

            /* JADX WARN: Multi-variable type inference failed */
            public c(int i) {
                super(Integer.valueOf(i), null, 2, 0 == true ? 1 : 0);
                this.c = i;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.c == ((c) obj).c;
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

        private a(Integer num, String str) {
            super(null);
            this.a = num;
            this.b = str;
        }

        public /* synthetic */ a(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, null);
        }
    }

    /* renamed from: com.nytimes.android.subauth.core.auth.models.b$b, reason: collision with other inner class name */
    public static final class C0410b extends b {
        public static final C0410b a = new C0410b();

        private C0410b() {
            super(null);
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
