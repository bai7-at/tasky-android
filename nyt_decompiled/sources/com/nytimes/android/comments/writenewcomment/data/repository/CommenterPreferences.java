package com.nytimes.android.comments.writenewcomment.data.repository;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class CommenterPreferences {
    public static final int $stable = 0;
    private final String commenterLocation;
    private final String commenterName;
    private final boolean isVerifiedUser;
    private final boolean sendEmailNotification;
    private final String title;

    public CommenterPreferences(String str, String str2, boolean z, boolean z2, String str3) {
        zq3.h(str, "commenterName");
        zq3.h(str2, "commenterLocation");
        zq3.h(str3, "title");
        this.commenterName = str;
        this.commenterLocation = str2;
        this.sendEmailNotification = z;
        this.isVerifiedUser = z2;
        this.title = str3;
    }

    public static /* synthetic */ CommenterPreferences copy$default(CommenterPreferences commenterPreferences, String str, String str2, boolean z, boolean z2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commenterPreferences.commenterName;
        }
        if ((i & 2) != 0) {
            str2 = commenterPreferences.commenterLocation;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = commenterPreferences.sendEmailNotification;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = commenterPreferences.isVerifiedUser;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str3 = commenterPreferences.title;
        }
        return commenterPreferences.copy(str, str4, z3, z4, str3);
    }

    public final String component1() {
        return this.commenterName;
    }

    public final String component2() {
        return this.commenterLocation;
    }

    public final boolean component3() {
        return this.sendEmailNotification;
    }

    public final boolean component4() {
        return this.isVerifiedUser;
    }

    public final String component5() {
        return this.title;
    }

    public final CommenterPreferences copy(String str, String str2, boolean z, boolean z2, String str3) {
        zq3.h(str, "commenterName");
        zq3.h(str2, "commenterLocation");
        zq3.h(str3, "title");
        return new CommenterPreferences(str, str2, z, z2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommenterPreferences)) {
            return false;
        }
        CommenterPreferences commenterPreferences = (CommenterPreferences) obj;
        return zq3.c(this.commenterName, commenterPreferences.commenterName) && zq3.c(this.commenterLocation, commenterPreferences.commenterLocation) && this.sendEmailNotification == commenterPreferences.sendEmailNotification && this.isVerifiedUser == commenterPreferences.isVerifiedUser && zq3.c(this.title, commenterPreferences.title);
    }

    public final String getCommenterLocation() {
        return this.commenterLocation;
    }

    public final String getCommenterName() {
        return this.commenterName;
    }

    public final boolean getSendEmailNotification() {
        return this.sendEmailNotification;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.commenterName.hashCode() * 31) + this.commenterLocation.hashCode()) * 31) + Boolean.hashCode(this.sendEmailNotification)) * 31) + Boolean.hashCode(this.isVerifiedUser)) * 31) + this.title.hashCode();
    }

    public final boolean isVerifiedUser() {
        return this.isVerifiedUser;
    }

    public String toString() {
        return "CommenterPreferences(commenterName=" + this.commenterName + ", commenterLocation=" + this.commenterLocation + ", sendEmailNotification=" + this.sendEmailNotification + ", isVerifiedUser=" + this.isVerifiedUser + ", title=" + this.title + ")";
    }

    public /* synthetic */ CommenterPreferences(String str, String str2, boolean z, boolean z2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? "" : str3);
    }
}
