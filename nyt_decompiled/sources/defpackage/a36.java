package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a36 implements hb6 {
    public static final a Companion = new a(null);
    private final List a;
    private final boolean b;
    private final nk5 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query PrivacyDirectivesV2($params: [UserPrivacyPreferenceInputV2!]!, $dntOn: Boolean!, $agentTcfData: TcfPreferenceInputData) { user { privacyDirectivesV2(knownPrefs: $params, platformDoNotTrackIsOn: $dntOn) { __typename ...onUserPrivacyDirectives } tcfPref(tcfData: $agentTcfData) { __typename ...onTcfPreference } currentTcfNotice { acceptAllTcString rejectAllTcString currentNoticeVersion } } }  fragment onUserPrivacyDirectives on UserPrivacyDirectives { adConfigurationV2 { value } adConfigurationV3 { value } acceptableTrackersV2 { value } showDataSaleOptOutUIV2 { value } showDataProcessingConsentUI { value } showDataProcessingPreferenceUI { value } showCaliforniaNoticesUI { value } emailMarketingOptInUIV2 { value } showLimitSensitivePIUI { value } tosBlockerUIV1 { value } fidesTCF { value } firstPartyBehavioralTargeting { value } }  fragment onTcfPreference on TcfPreferenceData { userTcfData { tcString noticeVersion tcDecodedData } }";
        }

        private a() {
        }
    }

    public static final class b {
        private final String a;
        private final String b;
        private final String c;

        public b(String str, String str2, String str3) {
            zq3.h(str, "acceptAllTcString");
            zq3.h(str2, "rejectAllTcString");
            zq3.h(str3, "currentNoticeVersion");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "CurrentTcfNotice(acceptAllTcString=" + this.a + ", rejectAllTcString=" + this.b + ", currentNoticeVersion=" + this.c + ")";
        }
    }

    public static final class c implements ii5.a {
        private final f a;

        public c(f fVar) {
            this.a = fVar;
        }

        public final f a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            f fVar = this.a;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        public String toString() {
            return "Data(user=" + this.a + ")";
        }
    }

    public static final class d {
        private final String a;
        private final cg5 b;

        public d(String str, cg5 cg5Var) {
            zq3.h(str, "__typename");
            zq3.h(cg5Var, "onUserPrivacyDirectives");
            this.a = str;
            this.b = cg5Var;
        }

        public final cg5 a() {
            return this.b;
        }

        public final String b() {
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
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "PrivacyDirectivesV2(__typename=" + this.a + ", onUserPrivacyDirectives=" + this.b + ")";
        }
    }

    public static final class e {
        private final String a;
        private final wf5 b;

        public e(String str, wf5 wf5Var) {
            zq3.h(str, "__typename");
            zq3.h(wf5Var, "onTcfPreference");
            this.a = str;
            this.b = wf5Var;
        }

        public final wf5 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "TcfPref(__typename=" + this.a + ", onTcfPreference=" + this.b + ")";
        }
    }

    public static final class f {
        private final d a;
        private final e b;
        private final b c;

        public f(d dVar, e eVar, b bVar) {
            zq3.h(bVar, "currentTcfNotice");
            this.a = dVar;
            this.b = eVar;
            this.c = bVar;
        }

        public final b a() {
            return this.c;
        }

        public final d b() {
            return this.a;
        }

        public final e c() {
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
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b) && zq3.c(this.c, fVar.c);
        }

        public int hashCode() {
            d dVar = this.a;
            int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            e eVar = this.b;
            return ((hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "User(privacyDirectivesV2=" + this.a + ", tcfPref=" + this.b + ", currentTcfNotice=" + this.c + ")";
        }
    }

    public a36(List list, boolean z, nk5 nk5Var) {
        zq3.h(list, "params");
        zq3.h(nk5Var, "agentTcfData");
        this.a = list;
        this.b = z;
        this.c = nk5Var;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(c36.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        g36.a.a(lu3Var, this, w41Var, z);
    }

    public final nk5 d() {
        return this.c;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a36)) {
            return false;
        }
        a36 a36Var = (a36) obj;
        return zq3.c(this.a, a36Var.a) && this.b == a36Var.b && zq3.c(this.c, a36Var.c);
    }

    public final List f() {
        return this.a;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31) + this.c.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "2a65fb6b32ce2dd1904430f0380efb61400074883fd3686ed32a44391b80838f";
    }

    @Override // defpackage.ii5
    public String name() {
        return "PrivacyDirectivesV2";
    }

    public String toString() {
        return "PrivacyDirectivesV2Query(params=" + this.a + ", dntOn=" + this.b + ", agentTcfData=" + this.c + ")";
    }
}
