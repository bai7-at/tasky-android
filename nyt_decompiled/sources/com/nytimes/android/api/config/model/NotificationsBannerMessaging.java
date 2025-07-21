package com.nytimes.android.api.config.model;

import defpackage.zq3;

/* loaded from: classes3.dex */
public final class NotificationsBannerMessaging {
    private final boolean bannerVisibility;
    private final String boldCopy;
    private final String confirmationMessage;
    private final String promotedChannelTag;
    private final String promotedChannelTitle;
    private final String secondaryCopy;

    public NotificationsBannerMessaging(String str, String str2, String str3, String str4, String str5, boolean z) {
        zq3.h(str, "boldCopy");
        zq3.h(str2, "secondaryCopy");
        zq3.h(str3, "promotedChannelTitle");
        zq3.h(str4, "promotedChannelTag");
        zq3.h(str5, "confirmationMessage");
        this.boldCopy = str;
        this.secondaryCopy = str2;
        this.promotedChannelTitle = str3;
        this.promotedChannelTag = str4;
        this.confirmationMessage = str5;
        this.bannerVisibility = z;
    }

    public static /* synthetic */ NotificationsBannerMessaging copy$default(NotificationsBannerMessaging notificationsBannerMessaging, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationsBannerMessaging.boldCopy;
        }
        if ((i & 2) != 0) {
            str2 = notificationsBannerMessaging.secondaryCopy;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = notificationsBannerMessaging.promotedChannelTitle;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = notificationsBannerMessaging.promotedChannelTag;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = notificationsBannerMessaging.confirmationMessage;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            z = notificationsBannerMessaging.bannerVisibility;
        }
        return notificationsBannerMessaging.copy(str, str6, str7, str8, str9, z);
    }

    public final String component1() {
        return this.boldCopy;
    }

    public final String component2() {
        return this.secondaryCopy;
    }

    public final String component3() {
        return this.promotedChannelTitle;
    }

    public final String component4() {
        return this.promotedChannelTag;
    }

    public final String component5() {
        return this.confirmationMessage;
    }

    public final boolean component6() {
        return this.bannerVisibility;
    }

    public final NotificationsBannerMessaging copy(String str, String str2, String str3, String str4, String str5, boolean z) {
        zq3.h(str, "boldCopy");
        zq3.h(str2, "secondaryCopy");
        zq3.h(str3, "promotedChannelTitle");
        zq3.h(str4, "promotedChannelTag");
        zq3.h(str5, "confirmationMessage");
        return new NotificationsBannerMessaging(str, str2, str3, str4, str5, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsBannerMessaging)) {
            return false;
        }
        NotificationsBannerMessaging notificationsBannerMessaging = (NotificationsBannerMessaging) obj;
        return zq3.c(this.boldCopy, notificationsBannerMessaging.boldCopy) && zq3.c(this.secondaryCopy, notificationsBannerMessaging.secondaryCopy) && zq3.c(this.promotedChannelTitle, notificationsBannerMessaging.promotedChannelTitle) && zq3.c(this.promotedChannelTag, notificationsBannerMessaging.promotedChannelTag) && zq3.c(this.confirmationMessage, notificationsBannerMessaging.confirmationMessage) && this.bannerVisibility == notificationsBannerMessaging.bannerVisibility;
    }

    public final boolean getBannerVisibility() {
        return this.bannerVisibility;
    }

    public final String getBoldCopy() {
        return this.boldCopy;
    }

    public final String getConfirmationMessage() {
        return this.confirmationMessage;
    }

    public final String getPromotedChannelTag() {
        return this.promotedChannelTag;
    }

    public final String getPromotedChannelTitle() {
        return this.promotedChannelTitle;
    }

    public final String getSecondaryCopy() {
        return this.secondaryCopy;
    }

    public int hashCode() {
        return (((((((((this.boldCopy.hashCode() * 31) + this.secondaryCopy.hashCode()) * 31) + this.promotedChannelTitle.hashCode()) * 31) + this.promotedChannelTag.hashCode()) * 31) + this.confirmationMessage.hashCode()) * 31) + Boolean.hashCode(this.bannerVisibility);
    }

    public String toString() {
        return "NotificationsBannerMessaging(boldCopy=" + this.boldCopy + ", secondaryCopy=" + this.secondaryCopy + ", promotedChannelTitle=" + this.promotedChannelTitle + ", promotedChannelTag=" + this.promotedChannelTag + ", confirmationMessage=" + this.confirmationMessage + ", bannerVisibility=" + this.bannerVisibility + ")";
    }
}
