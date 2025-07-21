package com.nytimes.android.messaging.regibundle.models;

import defpackage.zq3;
import java.util.List;

/* loaded from: classes4.dex */
public final class RegibundleData {
    public static final int $stable = 8;
    private final String loginText;
    private final RegistrationData registration;
    private final SubscriptionData subscription;
    private final List<UrgencyMessage> subscriptionUrgencyMessages;

    public RegibundleData(String str, RegistrationData registrationData, SubscriptionData subscriptionData, List<UrgencyMessage> list) {
        zq3.h(str, "loginText");
        zq3.h(registrationData, "registration");
        zq3.h(subscriptionData, "subscription");
        zq3.h(list, "subscriptionUrgencyMessages");
        this.loginText = str;
        this.registration = registrationData;
        this.subscription = subscriptionData;
        this.subscriptionUrgencyMessages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RegibundleData copy$default(RegibundleData regibundleData, String str, RegistrationData registrationData, SubscriptionData subscriptionData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = regibundleData.loginText;
        }
        if ((i & 2) != 0) {
            registrationData = regibundleData.registration;
        }
        if ((i & 4) != 0) {
            subscriptionData = regibundleData.subscription;
        }
        if ((i & 8) != 0) {
            list = regibundleData.subscriptionUrgencyMessages;
        }
        return regibundleData.copy(str, registrationData, subscriptionData, list);
    }

    public final String component1() {
        return this.loginText;
    }

    public final RegistrationData component2() {
        return this.registration;
    }

    public final SubscriptionData component3() {
        return this.subscription;
    }

    public final List<UrgencyMessage> component4() {
        return this.subscriptionUrgencyMessages;
    }

    public final RegibundleData copy(String str, RegistrationData registrationData, SubscriptionData subscriptionData, List<UrgencyMessage> list) {
        zq3.h(str, "loginText");
        zq3.h(registrationData, "registration");
        zq3.h(subscriptionData, "subscription");
        zq3.h(list, "subscriptionUrgencyMessages");
        return new RegibundleData(str, registrationData, subscriptionData, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegibundleData)) {
            return false;
        }
        RegibundleData regibundleData = (RegibundleData) obj;
        return zq3.c(this.loginText, regibundleData.loginText) && zq3.c(this.registration, regibundleData.registration) && zq3.c(this.subscription, regibundleData.subscription) && zq3.c(this.subscriptionUrgencyMessages, regibundleData.subscriptionUrgencyMessages);
    }

    public final String getLoginText() {
        return this.loginText;
    }

    public final RegistrationData getRegistration() {
        return this.registration;
    }

    public final SubscriptionData getSubscription() {
        return this.subscription;
    }

    public final List<UrgencyMessage> getSubscriptionUrgencyMessages() {
        return this.subscriptionUrgencyMessages;
    }

    public int hashCode() {
        return (((((this.loginText.hashCode() * 31) + this.registration.hashCode()) * 31) + this.subscription.hashCode()) * 31) + this.subscriptionUrgencyMessages.hashCode();
    }

    public String toString() {
        return "RegibundleData(loginText=" + this.loginText + ", registration=" + this.registration + ", subscription=" + this.subscription + ", subscriptionUrgencyMessages=" + this.subscriptionUrgencyMessages + ")";
    }
}
