package com.nytimes.android.subauth.core.purr.model;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.subauth.core.purr.directive.AcceptableTracker;
import com.nytimes.android.subauth.core.purr.directive.AdConfiguration;
import com.nytimes.android.subauth.core.purr.directive.DataProcessingPreferenceDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.DataSaleOptOutDirectiveValueV2;
import com.nytimes.android.subauth.core.purr.directive.EmailMarketingOptInDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.FirstPartyDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.PurrAcceptableTrackersDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV3;
import com.nytimes.android.subauth.core.purr.directive.PurrDataSaleOptOutDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrEmailMarketingOptInUiDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrFirstPartyBehavioralTargetingDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowCaliforniaNoticesUiDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowDataProcessingConsentDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowDataProcessingPreferenceDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowLimitSensitivePIUiDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrTCFUIDirective;
import com.nytimes.android.subauth.core.purr.directive.ToggleableDirectiveValue;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class PrivacyDirectives {
    public static final Companion Companion = new Companion(null);
    private final AcceptableTrackersDirectiveV2 acceptableTrackersV2;
    private final AdConfigurationDirectiveV2 adConfigurationV2;
    private final AdConfigurationDirectiveV3 adConfigurationV3;
    private final EmailMarketingOptInUiPrivacyDirective emailMarketingOptInUiPrivacyDirective;
    private final FirstPartyBehavioralTargetingDirective firstPartyDirective;
    private final ShowCaliforniaNoticesUiDirective showCaliforniaNoticesUiDirective;
    private final ShowDataProcessingConsentUiPrivacyDirective showDataProcessingConsentDirective;
    private final ShowDataProcessingPreferenceUiPrivacyDirective showDataProcessingPreferenceDirective;
    private final ShowDataSaleOptOutDirectiveV2 showDataSaleOptOutDirectiveV2;
    private final ShowLimitSensitivePIUiDirective showLimitSensitivePIUiDirective;
    private final ShowTCFUIDirective showTCFUiDirective;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<PurrPrivacyDirective> default$subauth_core_release() {
            return i.o(new PurrAdvertisingConfigurationDirectiveV2(null, 1, null), new PurrAdvertisingConfigurationDirectiveV3(null, 1, null), new PurrAcceptableTrackersDirectiveV2(null, 1, null), new PurrDataSaleOptOutDirectiveV2(null, 1, null), new PurrShowDataProcessingConsentDirective(null, 1, null), new PurrShowDataProcessingPreferenceDirective(null, 1, null), new PurrShowCaliforniaNoticesUiDirective(null, 1, null), new PurrEmailMarketingOptInUiDirective(null, 1, null), new PurrShowLimitSensitivePIUiDirective(null, 1, null), new PurrTCFUIDirective(null, 1, null), new PurrFirstPartyBehavioralTargetingDirective(null, 1, null));
        }

        private Companion() {
        }
    }

    public PrivacyDirectives() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final AdConfigurationDirectiveV2 component1() {
        return this.adConfigurationV2;
    }

    public final ShowTCFUIDirective component10() {
        return this.showTCFUiDirective;
    }

    public final FirstPartyBehavioralTargetingDirective component11() {
        return this.firstPartyDirective;
    }

    public final AdConfigurationDirectiveV3 component2() {
        return this.adConfigurationV3;
    }

    public final AcceptableTrackersDirectiveV2 component3() {
        return this.acceptableTrackersV2;
    }

    public final ShowDataSaleOptOutDirectiveV2 component4() {
        return this.showDataSaleOptOutDirectiveV2;
    }

    public final ShowDataProcessingConsentUiPrivacyDirective component5() {
        return this.showDataProcessingConsentDirective;
    }

    public final ShowDataProcessingPreferenceUiPrivacyDirective component6() {
        return this.showDataProcessingPreferenceDirective;
    }

    public final ShowCaliforniaNoticesUiDirective component7() {
        return this.showCaliforniaNoticesUiDirective;
    }

    public final EmailMarketingOptInUiPrivacyDirective component8() {
        return this.emailMarketingOptInUiPrivacyDirective;
    }

    public final ShowLimitSensitivePIUiDirective component9() {
        return this.showLimitSensitivePIUiDirective;
    }

    public final PrivacyDirectives copy(AdConfigurationDirectiveV2 adConfigurationDirectiveV2, AdConfigurationDirectiveV3 adConfigurationDirectiveV3, AcceptableTrackersDirectiveV2 acceptableTrackersDirectiveV2, ShowDataSaleOptOutDirectiveV2 showDataSaleOptOutDirectiveV2, ShowDataProcessingConsentUiPrivacyDirective showDataProcessingConsentUiPrivacyDirective, ShowDataProcessingPreferenceUiPrivacyDirective showDataProcessingPreferenceUiPrivacyDirective, ShowCaliforniaNoticesUiDirective showCaliforniaNoticesUiDirective, EmailMarketingOptInUiPrivacyDirective emailMarketingOptInUiPrivacyDirective, ShowLimitSensitivePIUiDirective showLimitSensitivePIUiDirective, ShowTCFUIDirective showTCFUIDirective, FirstPartyBehavioralTargetingDirective firstPartyBehavioralTargetingDirective) {
        zq3.h(adConfigurationDirectiveV2, "adConfigurationV2");
        zq3.h(adConfigurationDirectiveV3, "adConfigurationV3");
        zq3.h(acceptableTrackersDirectiveV2, "acceptableTrackersV2");
        zq3.h(showDataSaleOptOutDirectiveV2, "showDataSaleOptOutDirectiveV2");
        zq3.h(showDataProcessingConsentUiPrivacyDirective, "showDataProcessingConsentDirective");
        zq3.h(showDataProcessingPreferenceUiPrivacyDirective, "showDataProcessingPreferenceDirective");
        zq3.h(showCaliforniaNoticesUiDirective, "showCaliforniaNoticesUiDirective");
        zq3.h(emailMarketingOptInUiPrivacyDirective, "emailMarketingOptInUiPrivacyDirective");
        zq3.h(showLimitSensitivePIUiDirective, "showLimitSensitivePIUiDirective");
        zq3.h(showTCFUIDirective, "showTCFUiDirective");
        zq3.h(firstPartyBehavioralTargetingDirective, "firstPartyDirective");
        return new PrivacyDirectives(adConfigurationDirectiveV2, adConfigurationDirectiveV3, acceptableTrackersDirectiveV2, showDataSaleOptOutDirectiveV2, showDataProcessingConsentUiPrivacyDirective, showDataProcessingPreferenceUiPrivacyDirective, showCaliforniaNoticesUiDirective, emailMarketingOptInUiPrivacyDirective, showLimitSensitivePIUiDirective, showTCFUIDirective, firstPartyBehavioralTargetingDirective);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyDirectives)) {
            return false;
        }
        PrivacyDirectives privacyDirectives = (PrivacyDirectives) obj;
        return zq3.c(this.adConfigurationV2, privacyDirectives.adConfigurationV2) && zq3.c(this.adConfigurationV3, privacyDirectives.adConfigurationV3) && zq3.c(this.acceptableTrackersV2, privacyDirectives.acceptableTrackersV2) && zq3.c(this.showDataSaleOptOutDirectiveV2, privacyDirectives.showDataSaleOptOutDirectiveV2) && zq3.c(this.showDataProcessingConsentDirective, privacyDirectives.showDataProcessingConsentDirective) && zq3.c(this.showDataProcessingPreferenceDirective, privacyDirectives.showDataProcessingPreferenceDirective) && zq3.c(this.showCaliforniaNoticesUiDirective, privacyDirectives.showCaliforniaNoticesUiDirective) && zq3.c(this.emailMarketingOptInUiPrivacyDirective, privacyDirectives.emailMarketingOptInUiPrivacyDirective) && zq3.c(this.showLimitSensitivePIUiDirective, privacyDirectives.showLimitSensitivePIUiDirective) && zq3.c(this.showTCFUiDirective, privacyDirectives.showTCFUiDirective) && zq3.c(this.firstPartyDirective, privacyDirectives.firstPartyDirective);
    }

    public final AcceptableTrackersDirectiveV2 getAcceptableTrackersV2() {
        return this.acceptableTrackersV2;
    }

    public final AdConfigurationDirectiveV2 getAdConfigurationV2() {
        return this.adConfigurationV2;
    }

    public final AdConfigurationDirectiveV3 getAdConfigurationV3() {
        return this.adConfigurationV3;
    }

    public final EmailMarketingOptInUiPrivacyDirective getEmailMarketingOptInUiPrivacyDirective() {
        return this.emailMarketingOptInUiPrivacyDirective;
    }

    public final FirstPartyBehavioralTargetingDirective getFirstPartyDirective() {
        return this.firstPartyDirective;
    }

    public final ShowCaliforniaNoticesUiDirective getShowCaliforniaNoticesUiDirective() {
        return this.showCaliforniaNoticesUiDirective;
    }

    public final ShowDataProcessingConsentUiPrivacyDirective getShowDataProcessingConsentDirective() {
        return this.showDataProcessingConsentDirective;
    }

    public final ShowDataProcessingPreferenceUiPrivacyDirective getShowDataProcessingPreferenceDirective() {
        return this.showDataProcessingPreferenceDirective;
    }

    public final ShowDataSaleOptOutDirectiveV2 getShowDataSaleOptOutDirectiveV2() {
        return this.showDataSaleOptOutDirectiveV2;
    }

    public final ShowLimitSensitivePIUiDirective getShowLimitSensitivePIUiDirective() {
        return this.showLimitSensitivePIUiDirective;
    }

    public final ShowTCFUIDirective getShowTCFUiDirective() {
        return this.showTCFUiDirective;
    }

    public int hashCode() {
        return (((((((((((((((((((this.adConfigurationV2.hashCode() * 31) + this.adConfigurationV3.hashCode()) * 31) + this.acceptableTrackersV2.hashCode()) * 31) + this.showDataSaleOptOutDirectiveV2.hashCode()) * 31) + this.showDataProcessingConsentDirective.hashCode()) * 31) + this.showDataProcessingPreferenceDirective.hashCode()) * 31) + this.showCaliforniaNoticesUiDirective.hashCode()) * 31) + this.emailMarketingOptInUiPrivacyDirective.hashCode()) * 31) + this.showLimitSensitivePIUiDirective.hashCode()) * 31) + this.showTCFUiDirective.hashCode()) * 31) + this.firstPartyDirective.hashCode();
    }

    public final List<PurrPrivacyDirective> toPublic$subauth_core_release() {
        return i.o(this.adConfigurationV2.toPublic$subauth_core_release(), this.adConfigurationV3.toPublic$subauth_core_release(), this.acceptableTrackersV2.toPublic$subauth_core_release(), this.showDataSaleOptOutDirectiveV2.toPublic$subauth_core_release(), this.showDataProcessingConsentDirective.toPublic$subauth_core_release(), this.showDataProcessingPreferenceDirective.toPublic$subauth_core_release(), this.showCaliforniaNoticesUiDirective.toPublic$subauth_core_release(), this.emailMarketingOptInUiPrivacyDirective.toPublic$subauth_core_release(), this.showLimitSensitivePIUiDirective.toPublic$subauth_core_release(), this.showTCFUiDirective.toPublic$subauth_core_release(), this.firstPartyDirective.toPublic$subauth_core_release());
    }

    public String toString() {
        return "PrivacyDirectives(adConfigurationV2=" + this.adConfigurationV2 + ", adConfigurationV3=" + this.adConfigurationV3 + ", acceptableTrackersV2=" + this.acceptableTrackersV2 + ", showDataSaleOptOutDirectiveV2=" + this.showDataSaleOptOutDirectiveV2 + ", showDataProcessingConsentDirective=" + this.showDataProcessingConsentDirective + ", showDataProcessingPreferenceDirective=" + this.showDataProcessingPreferenceDirective + ", showCaliforniaNoticesUiDirective=" + this.showCaliforniaNoticesUiDirective + ", emailMarketingOptInUiPrivacyDirective=" + this.emailMarketingOptInUiPrivacyDirective + ", showLimitSensitivePIUiDirective=" + this.showLimitSensitivePIUiDirective + ", showTCFUiDirective=" + this.showTCFUiDirective + ", firstPartyDirective=" + this.firstPartyDirective + ")";
    }

    public PrivacyDirectives(AdConfigurationDirectiveV2 adConfigurationDirectiveV2, AdConfigurationDirectiveV3 adConfigurationDirectiveV3, AcceptableTrackersDirectiveV2 acceptableTrackersDirectiveV2, ShowDataSaleOptOutDirectiveV2 showDataSaleOptOutDirectiveV2, ShowDataProcessingConsentUiPrivacyDirective showDataProcessingConsentUiPrivacyDirective, ShowDataProcessingPreferenceUiPrivacyDirective showDataProcessingPreferenceUiPrivacyDirective, ShowCaliforniaNoticesUiDirective showCaliforniaNoticesUiDirective, EmailMarketingOptInUiPrivacyDirective emailMarketingOptInUiPrivacyDirective, ShowLimitSensitivePIUiDirective showLimitSensitivePIUiDirective, ShowTCFUIDirective showTCFUIDirective, FirstPartyBehavioralTargetingDirective firstPartyBehavioralTargetingDirective) {
        zq3.h(adConfigurationDirectiveV2, "adConfigurationV2");
        zq3.h(adConfigurationDirectiveV3, "adConfigurationV3");
        zq3.h(acceptableTrackersDirectiveV2, "acceptableTrackersV2");
        zq3.h(showDataSaleOptOutDirectiveV2, "showDataSaleOptOutDirectiveV2");
        zq3.h(showDataProcessingConsentUiPrivacyDirective, "showDataProcessingConsentDirective");
        zq3.h(showDataProcessingPreferenceUiPrivacyDirective, "showDataProcessingPreferenceDirective");
        zq3.h(showCaliforniaNoticesUiDirective, "showCaliforniaNoticesUiDirective");
        zq3.h(emailMarketingOptInUiPrivacyDirective, "emailMarketingOptInUiPrivacyDirective");
        zq3.h(showLimitSensitivePIUiDirective, "showLimitSensitivePIUiDirective");
        zq3.h(showTCFUIDirective, "showTCFUiDirective");
        zq3.h(firstPartyBehavioralTargetingDirective, "firstPartyDirective");
        this.adConfigurationV2 = adConfigurationDirectiveV2;
        this.adConfigurationV3 = adConfigurationDirectiveV3;
        this.acceptableTrackersV2 = acceptableTrackersDirectiveV2;
        this.showDataSaleOptOutDirectiveV2 = showDataSaleOptOutDirectiveV2;
        this.showDataProcessingConsentDirective = showDataProcessingConsentUiPrivacyDirective;
        this.showDataProcessingPreferenceDirective = showDataProcessingPreferenceUiPrivacyDirective;
        this.showCaliforniaNoticesUiDirective = showCaliforniaNoticesUiDirective;
        this.emailMarketingOptInUiPrivacyDirective = emailMarketingOptInUiPrivacyDirective;
        this.showLimitSensitivePIUiDirective = showLimitSensitivePIUiDirective;
        this.showTCFUiDirective = showTCFUIDirective;
        this.firstPartyDirective = firstPartyBehavioralTargetingDirective;
    }

    public /* synthetic */ PrivacyDirectives(AdConfigurationDirectiveV2 adConfigurationDirectiveV2, AdConfigurationDirectiveV3 adConfigurationDirectiveV3, AcceptableTrackersDirectiveV2 acceptableTrackersDirectiveV2, ShowDataSaleOptOutDirectiveV2 showDataSaleOptOutDirectiveV2, ShowDataProcessingConsentUiPrivacyDirective showDataProcessingConsentUiPrivacyDirective, ShowDataProcessingPreferenceUiPrivacyDirective showDataProcessingPreferenceUiPrivacyDirective, ShowCaliforniaNoticesUiDirective showCaliforniaNoticesUiDirective, EmailMarketingOptInUiPrivacyDirective emailMarketingOptInUiPrivacyDirective, ShowLimitSensitivePIUiDirective showLimitSensitivePIUiDirective, ShowTCFUIDirective showTCFUIDirective, FirstPartyBehavioralTargetingDirective firstPartyBehavioralTargetingDirective, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AdConfigurationDirectiveV2(AdConfiguration.FULL) : adConfigurationDirectiveV2, (i & 2) != 0 ? new AdConfigurationDirectiveV3(AdConfiguration.FULL) : adConfigurationDirectiveV3, (i & 4) != 0 ? new AcceptableTrackersDirectiveV2(AcceptableTracker.CONTROLLERS) : acceptableTrackersDirectiveV2, (i & 8) != 0 ? new ShowDataSaleOptOutDirectiveV2(DataSaleOptOutDirectiveValueV2.HIDE) : showDataSaleOptOutDirectiveV2, (i & 16) != 0 ? new ShowDataProcessingConsentUiPrivacyDirective(ToggleableDirectiveValue.HIDE) : showDataProcessingConsentUiPrivacyDirective, (i & 32) != 0 ? new ShowDataProcessingPreferenceUiPrivacyDirective(DataProcessingPreferenceDirectiveValue.HIDE) : showDataProcessingPreferenceUiPrivacyDirective, (i & 64) != 0 ? new ShowCaliforniaNoticesUiDirective(ToggleableDirectiveValue.HIDE) : showCaliforniaNoticesUiDirective, (i & 128) != 0 ? new EmailMarketingOptInUiPrivacyDirective(EmailMarketingOptInDirectiveValue.UNCHECKED) : emailMarketingOptInUiPrivacyDirective, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? new ShowLimitSensitivePIUiDirective(ToggleableDirectiveValue.HIDE) : showLimitSensitivePIUiDirective, (i & 512) != 0 ? new ShowTCFUIDirective(ToggleableDirectiveValue.HIDE) : showTCFUIDirective, (i & 1024) != 0 ? new FirstPartyBehavioralTargetingDirective(FirstPartyDirectiveValue.ALLOWED) : firstPartyBehavioralTargetingDirective);
    }
}
