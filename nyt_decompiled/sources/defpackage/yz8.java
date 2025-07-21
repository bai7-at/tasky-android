package defpackage;

import com.nytimes.android.subauth.core.type.UserSubscriptionOwnershipStatus;
import com.nytimes.android.subauth.core.type.UserSubscriptionStatus;
import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class yz8 implements hb6 {
    public static final b Companion = new b(null);

    public static final class a {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Avatar(value=" + this.a + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query UserDetails { user { email { address } profile { displayName name givenName familyName username gamesUsername } regiId setting { games { avatar { value } } } subscriptionDetails(include: ACTIVE) { bundleType cancellationDate subscriptionName isFreeTrial hasQueuedSub startDate endDate status entitlements graceStartDate graceEndDate hasTransactionInProgress hasActiveEntitlements billingSource ownershipStatus promotionTierType subscriptionProducts subscriptionLabels } } }";
        }

        private b() {
        }
    }

    public static final class c implements ii5.a {
        private final i a;

        public c(i iVar) {
            this.a = iVar;
        }

        public final i a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            i iVar = this.a;
            if (iVar == null) {
                return 0;
            }
            return iVar.hashCode();
        }

        public String toString() {
            return "Data(user=" + this.a + ")";
        }
    }

    public static final class d {
        private final String a;

        public d(String str) {
            zq3.h(str, "address");
            this.a = str;
        }

        public final String a() {
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
            return "Email(address=" + this.a + ")";
        }
    }

    public static final class e {
        private final a a;

        public e(a aVar) {
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && zq3.c(this.a, ((e) obj).a);
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            return "Games(avatar=" + this.a + ")";
        }
    }

    public static final class f {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final String f;

        public f(String str, String str2, String str3, String str4, String str5, String str6) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.f;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b) && zq3.c(this.c, fVar.c) && zq3.c(this.d, fVar.d) && zq3.c(this.e, fVar.e) && zq3.c(this.f, fVar.f);
        }

        public final String f() {
            return this.e;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Profile(displayName=" + this.a + ", name=" + this.b + ", givenName=" + this.c + ", familyName=" + this.d + ", username=" + this.e + ", gamesUsername=" + this.f + ")";
        }
    }

    public static final class g {
        private final e a;

        public g(e eVar) {
            this.a = eVar;
        }

        public final e a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && zq3.c(this.a, ((g) obj).a);
        }

        public int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            return "Setting(games=" + this.a + ")";
        }
    }

    public static final class h {
        private final String a;
        private final Object b;
        private final String c;
        private final boolean d;
        private final Boolean e;
        private final Object f;
        private final Object g;
        private final UserSubscriptionStatus h;
        private final List i;
        private final Object j;
        private final Object k;
        private final Boolean l;
        private final Boolean m;
        private final String n;
        private final UserSubscriptionOwnershipStatus o;
        private final String p;
        private final List q;
        private final List r;

        public h(String str, Object obj, String str2, boolean z, Boolean bool, Object obj2, Object obj3, UserSubscriptionStatus userSubscriptionStatus, List list, Object obj4, Object obj5, Boolean bool2, Boolean bool3, String str3, UserSubscriptionOwnershipStatus userSubscriptionOwnershipStatus, String str4, List list2, List list3) {
            zq3.h(str, "bundleType");
            zq3.h(str2, "subscriptionName");
            zq3.h(list, "entitlements");
            zq3.h(str3, "billingSource");
            zq3.h(userSubscriptionOwnershipStatus, "ownershipStatus");
            zq3.h(str4, "promotionTierType");
            zq3.h(list2, "subscriptionProducts");
            zq3.h(list3, "subscriptionLabels");
            this.a = str;
            this.b = obj;
            this.c = str2;
            this.d = z;
            this.e = bool;
            this.f = obj2;
            this.g = obj3;
            this.h = userSubscriptionStatus;
            this.i = list;
            this.j = obj4;
            this.k = obj5;
            this.l = bool2;
            this.m = bool3;
            this.n = str3;
            this.o = userSubscriptionOwnershipStatus;
            this.p = str4;
            this.q = list2;
            this.r = list3;
        }

        public final h a(String str, Object obj, String str2, boolean z, Boolean bool, Object obj2, Object obj3, UserSubscriptionStatus userSubscriptionStatus, List list, Object obj4, Object obj5, Boolean bool2, Boolean bool3, String str3, UserSubscriptionOwnershipStatus userSubscriptionOwnershipStatus, String str4, List list2, List list3) {
            zq3.h(str, "bundleType");
            zq3.h(str2, "subscriptionName");
            zq3.h(list, "entitlements");
            zq3.h(str3, "billingSource");
            zq3.h(userSubscriptionOwnershipStatus, "ownershipStatus");
            zq3.h(str4, "promotionTierType");
            zq3.h(list2, "subscriptionProducts");
            zq3.h(list3, "subscriptionLabels");
            return new h(str, obj, str2, z, bool, obj2, obj3, userSubscriptionStatus, list, obj4, obj5, bool2, bool3, str3, userSubscriptionOwnershipStatus, str4, list2, list3);
        }

        public final String c() {
            return this.n;
        }

        public final String d() {
            return this.a;
        }

        public final Object e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b) && zq3.c(this.c, hVar.c) && this.d == hVar.d && zq3.c(this.e, hVar.e) && zq3.c(this.f, hVar.f) && zq3.c(this.g, hVar.g) && this.h == hVar.h && zq3.c(this.i, hVar.i) && zq3.c(this.j, hVar.j) && zq3.c(this.k, hVar.k) && zq3.c(this.l, hVar.l) && zq3.c(this.m, hVar.m) && zq3.c(this.n, hVar.n) && this.o == hVar.o && zq3.c(this.p, hVar.p) && zq3.c(this.q, hVar.q) && zq3.c(this.r, hVar.r);
        }

        public final Object f() {
            return this.g;
        }

        public final List g() {
            return this.i;
        }

        public final Object h() {
            return this.k;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Object obj = this.b;
            int hashCode2 = (((((hashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31;
            Boolean bool = this.e;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Object obj2 = this.f;
            int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Object obj3 = this.g;
            int hashCode5 = (hashCode4 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
            UserSubscriptionStatus userSubscriptionStatus = this.h;
            int hashCode6 = (((hashCode5 + (userSubscriptionStatus == null ? 0 : userSubscriptionStatus.hashCode())) * 31) + this.i.hashCode()) * 31;
            Object obj4 = this.j;
            int hashCode7 = (hashCode6 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
            Object obj5 = this.k;
            int hashCode8 = (hashCode7 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
            Boolean bool2 = this.l;
            int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.m;
            return ((((((((((hashCode9 + (bool3 != null ? bool3.hashCode() : 0)) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode();
        }

        public final Object i() {
            return this.j;
        }

        public final Boolean j() {
            return this.m;
        }

        public final Boolean k() {
            return this.e;
        }

        public final Boolean l() {
            return this.l;
        }

        public final UserSubscriptionOwnershipStatus m() {
            return this.o;
        }

        public final String n() {
            return this.p;
        }

        public final Object o() {
            return this.f;
        }

        public final UserSubscriptionStatus p() {
            return this.h;
        }

        public final List q() {
            return this.r;
        }

        public final String r() {
            return this.c;
        }

        public final List s() {
            return this.q;
        }

        public final boolean t() {
            return this.d;
        }

        public String toString() {
            return "SubscriptionDetail(bundleType=" + this.a + ", cancellationDate=" + this.b + ", subscriptionName=" + this.c + ", isFreeTrial=" + this.d + ", hasQueuedSub=" + this.e + ", startDate=" + this.f + ", endDate=" + this.g + ", status=" + this.h + ", entitlements=" + this.i + ", graceStartDate=" + this.j + ", graceEndDate=" + this.k + ", hasTransactionInProgress=" + this.l + ", hasActiveEntitlements=" + this.m + ", billingSource=" + this.n + ", ownershipStatus=" + this.o + ", promotionTierType=" + this.p + ", subscriptionProducts=" + this.q + ", subscriptionLabels=" + this.r + ")";
        }
    }

    public static final class i {
        private final d a;
        private final f b;
        private final String c;
        private final g d;
        private final List e;

        public i(d dVar, f fVar, String str, g gVar, List list) {
            this.a = dVar;
            this.b = fVar;
            this.c = str;
            this.d = gVar;
            this.e = list;
        }

        public final d a() {
            return this.a;
        }

        public final f b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final g d() {
            return this.d;
        }

        public final List e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return zq3.c(this.a, iVar.a) && zq3.c(this.b, iVar.b) && zq3.c(this.c, iVar.c) && zq3.c(this.d, iVar.d) && zq3.c(this.e, iVar.e);
        }

        public int hashCode() {
            d dVar = this.a;
            int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            f fVar = this.b;
            int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
            String str = this.c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            g gVar = this.d;
            int hashCode4 = (hashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            List list = this.e;
            return hashCode4 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "User(email=" + this.a + ", profile=" + this.b + ", regiId=" + this.c + ", setting=" + this.d + ", subscriptionDetails=" + this.e + ")";
        }
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(a09.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == yz8.class;
    }

    public int hashCode() {
        return zt6.b(yz8.class).hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "cfe392767b02581dc750bcdc8d9960bbdce2459ccb035bdc694212e8960e47a0";
    }

    @Override // defpackage.ii5
    public String name() {
        return "UserDetails";
    }
}
