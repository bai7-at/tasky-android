package com.nytimes.android.subauth.core.auth.userdetails;

import com.nytimes.android.subauth.core.database.userdata.UserData;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.nytimes.android.subauth.core.auth.userdetails.a$a, reason: collision with other inner class name */
    public static final class C0417a extends a {
        private final String a;

        public C0417a(String str) {
            super(null);
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0417a) && zq3.c(this.a, ((C0417a) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Error(errorMessage=" + this.a + ")";
        }
    }

    public static final class b extends a {
        private final UserData a;
        private final boolean b;

        public b(UserData userData, boolean z) {
            super(null);
            this.a = userData;
            this.b = z;
        }

        public final UserData a() {
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
            return zq3.c(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            UserData userData = this.a;
            return ((userData == null ? 0 : userData.hashCode()) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            return "Success(userData=" + this.a + ", isCachedData=" + this.b + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
