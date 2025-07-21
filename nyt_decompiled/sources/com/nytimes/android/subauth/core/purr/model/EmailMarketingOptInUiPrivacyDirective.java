package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.EmailMarketingOptInDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.PurrEmailMarketingOptInUiDirective;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class EmailMarketingOptInUiPrivacyDirective extends UserPrivacyDirective {
    private final EmailMarketingOptInDirectiveValue value;

    public EmailMarketingOptInUiPrivacyDirective(EmailMarketingOptInDirectiveValue emailMarketingOptInDirectiveValue) {
        zq3.h(emailMarketingOptInDirectiveValue, "value");
        this.value = emailMarketingOptInDirectiveValue;
    }

    public static /* synthetic */ EmailMarketingOptInUiPrivacyDirective copy$default(EmailMarketingOptInUiPrivacyDirective emailMarketingOptInUiPrivacyDirective, EmailMarketingOptInDirectiveValue emailMarketingOptInDirectiveValue, int i, Object obj) {
        if ((i & 1) != 0) {
            emailMarketingOptInDirectiveValue = emailMarketingOptInUiPrivacyDirective.value;
        }
        return emailMarketingOptInUiPrivacyDirective.copy(emailMarketingOptInDirectiveValue);
    }

    public final EmailMarketingOptInDirectiveValue component1() {
        return this.value;
    }

    public final EmailMarketingOptInUiPrivacyDirective copy(EmailMarketingOptInDirectiveValue emailMarketingOptInDirectiveValue) {
        zq3.h(emailMarketingOptInDirectiveValue, "value");
        return new EmailMarketingOptInUiPrivacyDirective(emailMarketingOptInDirectiveValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmailMarketingOptInUiPrivacyDirective) && this.value == ((EmailMarketingOptInUiPrivacyDirective) obj).value;
    }

    public final EmailMarketingOptInDirectiveValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "EmailMarketingOptInUiPrivacyDirective(value=" + this.value + ")";
    }

    @Override // com.nytimes.android.subauth.core.purr.model.UserPrivacyDirective
    public PurrEmailMarketingOptInUiDirective toPublic$subauth_core_release() {
        return new PurrEmailMarketingOptInUiDirective(this.value);
    }
}
