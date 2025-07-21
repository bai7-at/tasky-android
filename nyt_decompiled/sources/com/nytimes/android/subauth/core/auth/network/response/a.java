package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.rz;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.nytimes.android.subauth.core.auth.network.response.a$a, reason: collision with other inner class name */
    public static final class C0413a extends a {
        public static final C0413a a = new C0413a();

        private C0413a() {
            super(null);
        }
    }

    public static final class b extends a {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class e extends a {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class c extends a {
        private final String a;
        private final Boolean b;
        private final String c;

        public /* synthetic */ c(String str, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "NO_ACCOUNT" : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2);
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final Boolean c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b) && zq3.c(this.c, cVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Boolean bool = this.b;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.c;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "RegiLiteAccount(status=" + this.a + ", validToken=" + this.b + ", passwordSetToken=" + this.c + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Boolean bool, String str2) {
            super(null);
            zq3.h(str, "status");
            this.a = str;
            this.b = bool;
            this.c = str2;
        }
    }

    public static final class d extends a {
        private final rz a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ d(defpackage.rz r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r6 = this;
                r8 = r8 & 1
                if (r8 == 0) goto Lf
                rz r7 = new rz
                r4 = 7
                r5 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5)
            Lf:
                r6.<init>(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.network.response.a.d.<init>(rz, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final rz a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "RegisteredAccount(authMethods=" + this.a + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(rz rzVar) {
            super(null);
            zq3.h(rzVar, "authMethods");
            this.a = rzVar;
        }
    }

    private a() {
    }
}
