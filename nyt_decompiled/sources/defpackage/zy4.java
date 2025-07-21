package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class zy4 implements jz4 {
    public static final a Companion = new a(null);
    private final vx8 a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation MutatePrivacyPreferenceV2($input: UpdateUserPrivacyPrefsInputV2!) { updateUserPrivacyPrefsV2(input: $input) { updatedDirectives { __typename ...onUserPrivacyDirectives } updatedPref { __typename ...onUserPrivacyPreferenceV2 } } }  fragment onUserPrivacyDirectives on UserPrivacyDirectives { adConfigurationV2 { value } adConfigurationV3 { value } acceptableTrackersV2 { value } showDataSaleOptOutUIV2 { value } showDataProcessingConsentUI { value } showDataProcessingPreferenceUI { value } showCaliforniaNoticesUI { value } emailMarketingOptInUIV2 { value } showLimitSensitivePIUI { value } tosBlockerUIV1 { value } fidesTCF { value } firstPartyBehavioralTargeting { value } }  fragment onUserPrivacyPreferenceV2 on UserPrivacyPreferenceV2 { name kind value }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public final c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "Data(updateUserPrivacyPrefsV2=" + this.a + ")";
        }
    }

    public static final class c {
        private final d a;
        private final e b;

        public c(d dVar, e eVar) {
            zq3.h(dVar, "updatedDirectives");
            zq3.h(eVar, "updatedPref");
            this.a = dVar;
            this.b = eVar;
        }

        public final d a() {
            return this.a;
        }

        public final e b() {
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
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "UpdateUserPrivacyPrefsV2(updatedDirectives=" + this.a + ", updatedPref=" + this.b + ")";
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
            return "UpdatedDirectives(__typename=" + this.a + ", onUserPrivacyDirectives=" + this.b + ")";
        }
    }

    public static final class e {
        private final String a;
        private final qg5 b;

        public e(String str, qg5 qg5Var) {
            zq3.h(str, "__typename");
            zq3.h(qg5Var, "onUserPrivacyPreferenceV2");
            this.a = str;
            this.b = qg5Var;
        }

        public final qg5 a() {
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
            return "UpdatedPref(__typename=" + this.a + ", onUserPrivacyPreferenceV2=" + this.b + ")";
        }
    }

    public zy4(vx8 vx8Var) {
        zq3.h(vx8Var, "input");
        this.a = vx8Var;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(az4.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        ez4.a.a(lu3Var, this, w41Var, z);
    }

    public final vx8 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zy4) && zq3.c(this.a, ((zy4) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "582ba4ccead5ee67123430ccc0df7365c7735e3eb6ced9f0fda98e13ea7d073c";
    }

    @Override // defpackage.ii5
    public String name() {
        return "MutatePrivacyPreferenceV2";
    }

    public String toString() {
        return "MutatePrivacyPreferenceV2Mutation(input=" + this.a + ")";
    }
}
