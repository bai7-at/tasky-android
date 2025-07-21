package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class e {

    public static abstract class a extends e {
        private final Exception a;
        private final String b;

        /* renamed from: com.nytimes.android.subauth.core.auth.network.response.e$a$a, reason: collision with other inner class name */
        public static final class C0416a extends a {
            public static final C0416a c = new C0416a();

            /* JADX WARN: Multi-variable type inference failed */
            private C0416a() {
                super(null, "Empty Saved Targeting Data", 1, 0 == true ? 1 : 0);
            }
        }

        public static final class b extends a {
            public static final b c = new b();

            /* JADX WARN: Multi-variable type inference failed */
            private b() {
                super(null, "Internet Not Connected", 1, 0 == true ? 1 : 0);
            }
        }

        public static final class c extends a {
            private final Exception c;
            private final String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(Exception exc, String str) {
                super(null, str, 1, 0 == true ? 1 : 0);
                zq3.h(exc, "throwable");
                zq3.h(str, "message");
                this.c = exc;
                this.d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return zq3.c(this.c, cVar.c) && zq3.c(this.d, cVar.d);
            }

            public int hashCode() {
                return (this.c.hashCode() * 31) + this.d.hashCode();
            }

            public String toString() {
                return "ParsingException(throwable=" + this.c + ", message=" + this.d + ")";
            }
        }

        public static final class d extends a {
            private final Exception c;
            private final String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(Exception exc, String str) {
                super(null, str, 1, 0 == true ? 1 : 0);
                zq3.h(exc, "throwable");
                zq3.h(str, "message");
                this.c = exc;
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
                return zq3.c(this.c, dVar.c) && zq3.c(this.d, dVar.d);
            }

            public int hashCode() {
                return (this.c.hashCode() * 31) + this.d.hashCode();
            }

            public String toString() {
                return "UnknownException(throwable=" + this.c + ", message=" + this.d + ")";
            }
        }

        public /* synthetic */ a(Exception exc, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(exc, str);
        }

        public final Exception a() {
            return this.a;
        }

        public /* synthetic */ a(Exception exc, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : exc, str, null);
        }

        private a(Exception exc, String str) {
            super(null);
            this.a = exc;
            this.b = str;
        }
    }

    public static final class b extends e {
        private final d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(null);
            zq3.h(dVar, "data");
            this.a = dVar;
        }

        public final d a() {
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
            return "Success(data=" + this.a + ")";
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }
}
