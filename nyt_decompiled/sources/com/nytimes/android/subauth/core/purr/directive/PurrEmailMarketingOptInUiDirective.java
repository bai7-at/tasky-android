package com.nytimes.android.subauth.core.purr.directive;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrEmailMarketingOptInUiDirective extends PurrPrivacyDirective {
    private final EmailMarketingOptInDirectiveValue value;

    /* JADX WARN: Multi-variable type inference failed */
    public PurrEmailMarketingOptInUiDirective() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PurrEmailMarketingOptInUiDirective copy$default(PurrEmailMarketingOptInUiDirective purrEmailMarketingOptInUiDirective, EmailMarketingOptInDirectiveValue emailMarketingOptInDirectiveValue, int i, Object obj) {
        if ((i & 1) != 0) {
            emailMarketingOptInDirectiveValue = purrEmailMarketingOptInUiDirective.value;
        }
        return purrEmailMarketingOptInUiDirective.copy(emailMarketingOptInDirectiveValue);
    }

    public final EmailMarketingOptInDirectiveValue component1() {
        return this.value;
    }

    public final PurrEmailMarketingOptInUiDirective copy(EmailMarketingOptInDirectiveValue emailMarketingOptInDirectiveValue) {
        zq3.h(emailMarketingOptInDirectiveValue, "value");
        return new PurrEmailMarketingOptInUiDirective(emailMarketingOptInDirectiveValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurrEmailMarketingOptInUiDirective) && this.value == ((PurrEmailMarketingOptInUiDirective) obj).value;
    }

    public final EmailMarketingOptInDirectiveValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "PurrEmailMarketingOptInUiDirective(value=" + this.value + ")";
    }

    public /* synthetic */ PurrEmailMarketingOptInUiDirective(EmailMarketingOptInDirectiveValue emailMarketingOptInDirectiveValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmailMarketingOptInDirectiveValue.UNCHECKED : emailMarketingOptInDirectiveValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurrEmailMarketingOptInUiDirective(EmailMarketingOptInDirectiveValue emailMarketingOptInDirectiveValue) {
        super(null);
        zq3.h(emailMarketingOptInDirectiveValue, "value");
        this.value = emailMarketingOptInDirectiveValue;
    }
}
