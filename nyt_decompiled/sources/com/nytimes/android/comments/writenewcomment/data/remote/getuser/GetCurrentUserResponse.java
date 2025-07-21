package com.nytimes.android.comments.writenewcomment.data.remote.getuser;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class GetCurrentUserResponse {
    public static final int $stable = 0;
    private final String displayName;
    private final Boolean emailMe;
    private final Boolean isModerator;
    private final Boolean isReporter;
    private final String location;
    private final String picURL;
    private final String title;
    private final Long userID;

    public GetCurrentUserResponse(Long l, String str, String str2, String str3, String str4, @bt3(name = "comment_notify") Boolean bool, Boolean bool2, Boolean bool3) {
        this.userID = l;
        this.displayName = str;
        this.location = str2;
        this.picURL = str3;
        this.title = str4;
        this.emailMe = bool;
        this.isReporter = bool2;
        this.isModerator = bool3;
    }

    public final Long component1() {
        return this.userID;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.location;
    }

    public final String component4() {
        return this.picURL;
    }

    public final String component5() {
        return this.title;
    }

    public final Boolean component6() {
        return this.emailMe;
    }

    public final Boolean component7() {
        return this.isReporter;
    }

    public final Boolean component8() {
        return this.isModerator;
    }

    public final GetCurrentUserResponse copy(Long l, String str, String str2, String str3, String str4, @bt3(name = "comment_notify") Boolean bool, Boolean bool2, Boolean bool3) {
        return new GetCurrentUserResponse(l, str, str2, str3, str4, bool, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCurrentUserResponse)) {
            return false;
        }
        GetCurrentUserResponse getCurrentUserResponse = (GetCurrentUserResponse) obj;
        return zq3.c(this.userID, getCurrentUserResponse.userID) && zq3.c(this.displayName, getCurrentUserResponse.displayName) && zq3.c(this.location, getCurrentUserResponse.location) && zq3.c(this.picURL, getCurrentUserResponse.picURL) && zq3.c(this.title, getCurrentUserResponse.title) && zq3.c(this.emailMe, getCurrentUserResponse.emailMe) && zq3.c(this.isReporter, getCurrentUserResponse.isReporter) && zq3.c(this.isModerator, getCurrentUserResponse.isModerator);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Boolean getEmailMe() {
        return this.emailMe;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getPicURL() {
        return this.picURL;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getUserID() {
        return this.userID;
    }

    public int hashCode() {
        Long l = this.userID;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.displayName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.location;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.picURL;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.emailMe;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isReporter;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isModerator;
        return hashCode7 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final Boolean isModerator() {
        return this.isModerator;
    }

    public final Boolean isReporter() {
        return this.isReporter;
    }

    public String toString() {
        return "GetCurrentUserResponse(userID=" + this.userID + ", displayName=" + this.displayName + ", location=" + this.location + ", picURL=" + this.picURL + ", title=" + this.title + ", emailMe=" + this.emailMe + ", isReporter=" + this.isReporter + ", isModerator=" + this.isModerator + ")";
    }
}
