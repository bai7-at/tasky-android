package defpackage;

import com.nytimes.android.subauth.core.type.AcceptableTrackersDirectiveValue;
import com.nytimes.android.subauth.core.type.AdConfigurationDirectiveValue;
import com.nytimes.android.subauth.core.type.DataProcessingPreferenceUiDirectiveValue;
import com.nytimes.android.subauth.core.type.EmailMarketingOptInUiDirectiveValue;
import com.nytimes.android.subauth.core.type.PrivacyTargetingValue;
import com.nytimes.android.subauth.core.type.ShowDataSaleOptOutUiPrivacyDirectiveValueV2;
import com.nytimes.android.subauth.core.type.ToggleableUiDirectiveValue;

/* loaded from: classes4.dex */
public final class cg5 implements rp2 {
    private final b a;
    private final c b;
    private final a c;
    private final j d;
    private final h e;
    private final i f;
    private final g g;
    private final d h;
    private final k i;
    private final l j;
    private final e k;
    private final f l;

    public static final class a {
        private final AcceptableTrackersDirectiveValue a;

        public a(AcceptableTrackersDirectiveValue acceptableTrackersDirectiveValue) {
            this.a = acceptableTrackersDirectiveValue;
        }

        public final AcceptableTrackersDirectiveValue a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            AcceptableTrackersDirectiveValue acceptableTrackersDirectiveValue = this.a;
            if (acceptableTrackersDirectiveValue == null) {
                return 0;
            }
            return acceptableTrackersDirectiveValue.hashCode();
        }

        public String toString() {
            return "AcceptableTrackersV2(value=" + this.a + ")";
        }
    }

    public static final class b {
        private final AdConfigurationDirectiveValue a;

        public b(AdConfigurationDirectiveValue adConfigurationDirectiveValue) {
            this.a = adConfigurationDirectiveValue;
        }

        public final AdConfigurationDirectiveValue a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public int hashCode() {
            AdConfigurationDirectiveValue adConfigurationDirectiveValue = this.a;
            if (adConfigurationDirectiveValue == null) {
                return 0;
            }
            return adConfigurationDirectiveValue.hashCode();
        }

        public String toString() {
            return "AdConfigurationV2(value=" + this.a + ")";
        }
    }

    public static final class c {
        private final AdConfigurationDirectiveValue a;

        public c(AdConfigurationDirectiveValue adConfigurationDirectiveValue) {
            this.a = adConfigurationDirectiveValue;
        }

        public final AdConfigurationDirectiveValue a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public int hashCode() {
            AdConfigurationDirectiveValue adConfigurationDirectiveValue = this.a;
            if (adConfigurationDirectiveValue == null) {
                return 0;
            }
            return adConfigurationDirectiveValue.hashCode();
        }

        public String toString() {
            return "AdConfigurationV3(value=" + this.a + ")";
        }
    }

    public static final class d {
        private final EmailMarketingOptInUiDirectiveValue a;

        public d(EmailMarketingOptInUiDirectiveValue emailMarketingOptInUiDirectiveValue) {
            zq3.h(emailMarketingOptInUiDirectiveValue, "value");
            this.a = emailMarketingOptInUiDirectiveValue;
        }

        public final EmailMarketingOptInUiDirectiveValue a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "EmailMarketingOptInUIV2(value=" + this.a + ")";
        }
    }

    public static final class e {
        private final ToggleableUiDirectiveValue a;

        public e(ToggleableUiDirectiveValue toggleableUiDirectiveValue) {
            zq3.h(toggleableUiDirectiveValue, "value");
            this.a = toggleableUiDirectiveValue;
        }

        public final ToggleableUiDirectiveValue a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "FidesTCF(value=" + this.a + ")";
        }
    }

    public static final class f {
        private final PrivacyTargetingValue a;

        public f(PrivacyTargetingValue privacyTargetingValue) {
            zq3.h(privacyTargetingValue, "value");
            this.a = privacyTargetingValue;
        }

        public final PrivacyTargetingValue a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "FirstPartyBehavioralTargeting(value=" + this.a + ")";
        }
    }

    public static final class g {
        private final ToggleableUiDirectiveValue a;

        public g(ToggleableUiDirectiveValue toggleableUiDirectiveValue) {
            zq3.h(toggleableUiDirectiveValue, "value");
            this.a = toggleableUiDirectiveValue;
        }

        public final ToggleableUiDirectiveValue a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "ShowCaliforniaNoticesUI(value=" + this.a + ")";
        }
    }

    public static final class h {
        private final ToggleableUiDirectiveValue a;

        public h(ToggleableUiDirectiveValue toggleableUiDirectiveValue) {
            zq3.h(toggleableUiDirectiveValue, "value");
            this.a = toggleableUiDirectiveValue;
        }

        public final ToggleableUiDirectiveValue a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "ShowDataProcessingConsentUI(value=" + this.a + ")";
        }
    }

    public static final class i {
        private final DataProcessingPreferenceUiDirectiveValue a;

        public i(DataProcessingPreferenceUiDirectiveValue dataProcessingPreferenceUiDirectiveValue) {
            zq3.h(dataProcessingPreferenceUiDirectiveValue, "value");
            this.a = dataProcessingPreferenceUiDirectiveValue;
        }

        public final DataProcessingPreferenceUiDirectiveValue a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "ShowDataProcessingPreferenceUI(value=" + this.a + ")";
        }
    }

    public static final class j {
        private final ShowDataSaleOptOutUiPrivacyDirectiveValueV2 a;

        public j(ShowDataSaleOptOutUiPrivacyDirectiveValueV2 showDataSaleOptOutUiPrivacyDirectiveValueV2) {
            zq3.h(showDataSaleOptOutUiPrivacyDirectiveValueV2, "value");
            this.a = showDataSaleOptOutUiPrivacyDirectiveValueV2;
        }

        public final ShowDataSaleOptOutUiPrivacyDirectiveValueV2 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "ShowDataSaleOptOutUIV2(value=" + this.a + ")";
        }
    }

    public static final class k {
        private final ToggleableUiDirectiveValue a;

        public k(ToggleableUiDirectiveValue toggleableUiDirectiveValue) {
            zq3.h(toggleableUiDirectiveValue, "value");
            this.a = toggleableUiDirectiveValue;
        }

        public final ToggleableUiDirectiveValue a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.a == ((k) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "ShowLimitSensitivePIUI(value=" + this.a + ")";
        }
    }

    public static final class l {
        private final ToggleableUiDirectiveValue a;

        public l(ToggleableUiDirectiveValue toggleableUiDirectiveValue) {
            zq3.h(toggleableUiDirectiveValue, "value");
            this.a = toggleableUiDirectiveValue;
        }

        public final ToggleableUiDirectiveValue a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.a == ((l) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "TosBlockerUIV1(value=" + this.a + ")";
        }
    }

    public cg5(b bVar, c cVar, a aVar, j jVar, h hVar, i iVar, g gVar, d dVar, k kVar, l lVar, e eVar, f fVar) {
        zq3.h(bVar, "adConfigurationV2");
        zq3.h(cVar, "adConfigurationV3");
        zq3.h(aVar, "acceptableTrackersV2");
        zq3.h(jVar, "showDataSaleOptOutUIV2");
        zq3.h(hVar, "showDataProcessingConsentUI");
        zq3.h(iVar, "showDataProcessingPreferenceUI");
        zq3.h(gVar, "showCaliforniaNoticesUI");
        zq3.h(dVar, "emailMarketingOptInUIV2");
        zq3.h(kVar, "showLimitSensitivePIUI");
        zq3.h(lVar, "tosBlockerUIV1");
        zq3.h(eVar, "fidesTCF");
        zq3.h(fVar, "firstPartyBehavioralTargeting");
        this.a = bVar;
        this.b = cVar;
        this.c = aVar;
        this.d = jVar;
        this.e = hVar;
        this.f = iVar;
        this.g = gVar;
        this.h = dVar;
        this.i = kVar;
        this.j = lVar;
        this.k = eVar;
        this.l = fVar;
    }

    public final a a() {
        return this.c;
    }

    public final b b() {
        return this.a;
    }

    public final c c() {
        return this.b;
    }

    public final d d() {
        return this.h;
    }

    public final e e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg5)) {
            return false;
        }
        cg5 cg5Var = (cg5) obj;
        return zq3.c(this.a, cg5Var.a) && zq3.c(this.b, cg5Var.b) && zq3.c(this.c, cg5Var.c) && zq3.c(this.d, cg5Var.d) && zq3.c(this.e, cg5Var.e) && zq3.c(this.f, cg5Var.f) && zq3.c(this.g, cg5Var.g) && zq3.c(this.h, cg5Var.h) && zq3.c(this.i, cg5Var.i) && zq3.c(this.j, cg5Var.j) && zq3.c(this.k, cg5Var.k) && zq3.c(this.l, cg5Var.l);
    }

    public final f f() {
        return this.l;
    }

    public final g g() {
        return this.g;
    }

    public final h h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
    }

    public final i i() {
        return this.f;
    }

    public final j j() {
        return this.d;
    }

    public final k k() {
        return this.i;
    }

    public final l l() {
        return this.j;
    }

    public String toString() {
        return "OnUserPrivacyDirectives(adConfigurationV2=" + this.a + ", adConfigurationV3=" + this.b + ", acceptableTrackersV2=" + this.c + ", showDataSaleOptOutUIV2=" + this.d + ", showDataProcessingConsentUI=" + this.e + ", showDataProcessingPreferenceUI=" + this.f + ", showCaliforniaNoticesUI=" + this.g + ", emailMarketingOptInUIV2=" + this.h + ", showLimitSensitivePIUI=" + this.i + ", tosBlockerUIV1=" + this.j + ", fidesTCF=" + this.k + ", firstPartyBehavioralTargeting=" + this.l + ")";
    }
}
