package com.nytimes.android.comments.writenewcomment.data.remote.getuser;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class User {
    public static final int $stable = 0;
    private final Boolean emailMe;
    private final Boolean isReporter;
    private final String location;
    private final String name;
    private final String title;

    public User(String str, String str2, Boolean bool, Boolean bool2, String str3) {
        this.name = str;
        this.location = str2;
        this.emailMe = bool;
        this.isReporter = bool2;
        this.title = str3;
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, Boolean bool, Boolean bool2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = user.name;
        }
        if ((i & 2) != 0) {
            str2 = user.location;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            bool = user.emailMe;
        }
        Boolean bool3 = bool;
        if ((i & 8) != 0) {
            bool2 = user.isReporter;
        }
        Boolean bool4 = bool2;
        if ((i & 16) != 0) {
            str3 = user.title;
        }
        return user.copy(str, str4, bool3, bool4, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.location;
    }

    public final Boolean component3() {
        return this.emailMe;
    }

    public final Boolean component4() {
        return this.isReporter;
    }

    public final String component5() {
        return this.title;
    }

    public final User copy(String str, String str2, Boolean bool, Boolean bool2, String str3) {
        return new User(str, str2, bool, bool2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return zq3.c(this.name, user.name) && zq3.c(this.location, user.location) && zq3.c(this.emailMe, user.emailMe) && zq3.c(this.isReporter, user.isReporter) && zq3.c(this.title, user.title);
    }

    public final Boolean getEmailMe() {
        return this.emailMe;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.location;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.emailMe;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isReporter;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.title;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean isReporter() {
        return this.isReporter;
    }

    public String toString() {
        return "User(name=" + this.name + ", location=" + this.location + ", emailMe=" + this.emailMe + ", isReporter=" + this.isReporter + ", title=" + this.title + ")";
    }
}
