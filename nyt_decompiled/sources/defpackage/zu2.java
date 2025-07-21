package defpackage;

import java.util.Calendar;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class zu2 {
    public static final a h = new a(null);
    public static final int i = 8;
    private static final Set j = b0.j("AUD", "CKG", "XWD", "MM", "WC", "ATH");
    private final boolean a;
    private final boolean b;
    private final String c;
    private final String d;
    private final long e;
    private final String f;
    private final Set g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public zu2(boolean z, boolean z2, String str, String str2, long j2, String str3, Set set) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = j2;
        this.f = str3;
        this.g = set;
    }

    public final String a() {
        boolean z = this.a;
        return (z && this.b) ? "sub" : (!z || this.b) ? (z || !this.b) ? "anon" : "regi" : "anon sub";
    }

    public final String b() {
        return this.f;
    }

    public final Set c() {
        return this.g;
    }

    public final long d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu2)) {
            return false;
        }
        zu2 zu2Var = (zu2) obj;
        return this.a == zu2Var.a && this.b == zu2Var.b && zq3.c(this.c, zu2Var.c) && zq3.c(this.d, zu2Var.d) && this.e == zu2Var.e && zq3.c(this.f, zu2Var.f) && zq3.c(this.g, zu2Var.g);
    }

    public final String f() {
        return this.c;
    }

    public final boolean g() {
        return this.a;
    }

    public final boolean h() {
        Set set = j;
        Set set2 = this.g;
        if (set2 == null) {
            set2 = b0.e();
        }
        return !b0.k(set, i.c1(set2)).isEmpty();
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.e)) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Set set = this.g;
        return hashCode4 + (set != null ? set.hashCode() : 0);
    }

    public final boolean i() {
        return this.b;
    }

    public String toString() {
        return "GamesHybridUserConfig(isSubscribed=" + this.a + ", isUserLoggedIn=" + this.b + ", regiID=" + this.c + ", nytsCookie=" + this.d + ", lastUpdated=" + this.e + ", email=" + this.f + ", entitlements=" + this.g + ")";
    }

    public /* synthetic */ zu2(boolean z, boolean z2, String str, String str2, long j2, String str3, Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? Calendar.getInstance().getTimeInMillis() : j2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : set);
    }
}
