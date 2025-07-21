package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.abtests.ChartbeatDomainVariants;
import com.nytimes.abtests.GrowthUIRegibundleVariants;
import com.nytimes.abtests.InterestsUpdatedBadging;
import com.nytimes.abtests.IterateSurveyVariants;
import com.nytimes.abtests.LegalDynamicLibrariesVariants;
import com.nytimes.abtests.MessagingOmaMigration;
import com.nytimes.abtests.NewInterestsMessaging;
import com.nytimes.abtests.SHAAndroidShareSheet0125;
import com.nytimes.abtests.UnlimitedGiftShare;
import com.nytimes.abtests.XPNTestVariants;
import com.nytimes.abtests.YouTabNameDisplay;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.AbraVariant;
import com.nytimes.android.abra.models.AbraMetaData;
import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.DeviceUtils;

/* loaded from: classes4.dex */
public final class cb2 {
    private final boolean a;
    private final Resources b;
    private final AppPreferences c;
    private final b04 d;
    private final b04 e;
    private final Application f;
    private final boolean g;

    public cb2(boolean z, Resources resources, AppPreferences appPreferences, b04 b04Var, b04 b04Var2, Application application) {
        zq3.h(resources, "resources");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(b04Var, "remoteConfig");
        zq3.h(b04Var2, "abraManager");
        zq3.h(application, "application");
        this.a = z;
        this.b = resources;
        this.c = appPreferences;
        this.d = b04Var;
        this.e = b04Var2;
        this.f = application;
        this.g = resources.getBoolean(uc6.betaSettingsEnabled);
    }

    private final boolean b(int i, boolean z) {
        if (!this.a) {
            return z;
        }
        String string = this.b.getString(i);
        zq3.g(string, "getString(...)");
        return this.c.n(string, z);
    }

    private final String e() {
        AbraMetaData abraMetaData;
        AbraTest test = ((AbraManager) this.e.get()).getTest(SHAAndroidShareSheet0125.Companion.b().getTestName());
        if (test == null || (abraMetaData = test.getAbraMetaData()) == null) {
            return null;
        }
        return abraMetaData.getAbraVariant();
    }

    private final String h() {
        AbraMetaData abraMetaData;
        AbraTest test = ((AbraManager) this.e.get()).getTest(UnlimitedGiftShare.Companion.c().getTestName());
        if (test == null || (abraMetaData = test.getAbraMetaData()) == null) {
            return null;
        }
        return abraMetaData.getAbraVariant();
    }

    public final boolean A() {
        return ((qv6) this.d.get()).l();
    }

    public final boolean B() {
        return this.c.n("beta_recently_viewed_unfear_enabled", false);
    }

    public final boolean C() {
        return this.b.getBoolean(uc6.sfTextWrapping);
    }

    public final boolean D() {
        return !F();
    }

    public final boolean E() {
        Boolean d = UnlimitedGiftShare.Companion.d(h());
        if (d != null) {
            return d.booleanValue();
        }
        return false;
    }

    public final boolean F() {
        AbraManager abraManager = (AbraManager) this.e.get();
        XPNTestVariants.a aVar = XPNTestVariants.Companion;
        return (abraManager.getTestType(aVar.a().getTestName()) == null || ((AbraManager) this.e.get()).getTestType(aVar.a().getTestName()) == XPNTestVariants.CONTROL) ? false : true;
    }

    public final boolean G() {
        return F() || !DeviceUtils.G(this.f);
    }

    public final boolean H() {
        return this.g && this.c.n("messages.architecture.OMA.local", false);
    }

    public final boolean I() {
        return !this.g || this.c.n("messages.read.override", true);
    }

    public final boolean J() {
        return this.g && this.c.n("messages.enable.abra.override", false);
    }

    public final boolean K() {
        return this.g && this.c.n("messages.enable.entitlements.override", false);
    }

    public final String L() {
        return UnlimitedGiftShare.Companion.b(h());
    }

    public final boolean a() {
        return this.g && this.c.n("messages.cooldown.override", false);
    }

    public final IterateSurveyVariants c() {
        AbraVariant testType = ((AbraManager) this.e.get()).getTestType(IterateSurveyVariants.Companion.a().getTestName());
        zq3.f(testType, "null cannot be cast to non-null type com.nytimes.abtests.IterateSurveyVariants");
        return (IterateSurveyVariants) testType;
    }

    public final boolean d(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        if (!this.g) {
            return false;
        }
        AppPreferences appPreferences = this.c;
        StringBuilder sb = new StringBuilder();
        sb.append("messages.entitlements.override_");
        sb.append(str);
        return appPreferences.n(sb.toString(), false);
    }

    public final boolean f() {
        return ((AbraManager) this.e.get()).getTestType(YouTabNameDisplay.Companion.a().getTestName()) == YouTabNameDisplay.NAME_1;
    }

    public final boolean g() {
        return b(mk6.portrait_lock_override, false);
    }

    public final boolean i() {
        GrowthUIRegibundleVariants.a aVar = GrowthUIRegibundleVariants.Companion;
        Object obj = this.e.get();
        zq3.g(obj, "get(...)");
        return aVar.b((AbraManager) obj);
    }

    public final boolean j() {
        return this.c.n("playtab.use.debug.usecase", false);
    }

    public final boolean k() {
        return this.c.n("playtab.use.local.config", false);
    }

    public final boolean l() {
        return ((qv6) this.d.get()).f();
    }

    public final boolean m() {
        return this.g;
    }

    public final boolean n() {
        AbraVariant testType = ((AbraManager) this.e.get()).getTestType(ChartbeatDomainVariants.Companion.a().getTestName());
        return testType == ChartbeatDomainVariants.STAGING || testType == ChartbeatDomainVariants.PRODUCTION;
    }

    public final boolean o() {
        return zq3.c(UnlimitedGiftShare.Companion.d(h()), Boolean.FALSE);
    }

    public final boolean p() {
        return ((qv6) this.d.get()).i();
    }

    public final boolean q() {
        return ((qv6) this.d.get()).j();
    }

    public final boolean r() {
        if (!this.a) {
            return true;
        }
        String string = this.b.getString(mk6.com_nytimes_android_phoenix_highlightAndShare);
        zq3.g(string, "getString(...)");
        return this.c.n(string, true);
    }

    public final boolean s() {
        return ((qv6) this.d.get()).t();
    }

    public final boolean t() {
        return ((qv6) this.d.get()).u();
    }

    public final boolean u() {
        return ((AbraManager) this.e.get()).getTestType(InterestsUpdatedBadging.Companion.a().getTestName()) == InterestsUpdatedBadging.BADGE;
    }

    public final boolean v() {
        return ((AbraManager) this.e.get()).getTestType(NewInterestsMessaging.Companion.a().getTestName()) == NewInterestsMessaging.MESSAGES;
    }

    public final boolean w() {
        AbraVariant testType = ((AbraManager) this.e.get()).getTestType(IterateSurveyVariants.Companion.a().getTestName());
        if (this.g) {
            if (testType == IterateSurveyVariants.STAGING || testType == IterateSurveyVariants.PRODUCTION) {
                return true;
            }
        } else if (testType == IterateSurveyVariants.PRODUCTION) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        return this.g && ((AbraManager) this.e.get()).getTestType(LegalDynamicLibrariesVariants.Companion.a().getTestName()) == LegalDynamicLibrariesVariants.ENABLED;
    }

    public final boolean y() {
        return zq3.c(SHAAndroidShareSheet0125.Companion.c(e()), Boolean.TRUE);
    }

    public final boolean z() {
        return ((AbraManager) this.e.get()).getTestType(MessagingOmaMigration.Companion.a().getTestName()) == MessagingOmaMigration.OMA;
    }
}
