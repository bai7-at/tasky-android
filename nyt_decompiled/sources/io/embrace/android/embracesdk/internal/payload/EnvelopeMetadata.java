package io.embrace.android.embracesdk.internal.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class EnvelopeMetadata {
    private final String email;
    private final String locale;
    private final Set<String> personas;
    private final String timezoneDescription;
    private final String userId;
    private final String username;

    public EnvelopeMetadata() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ EnvelopeMetadata copy$default(EnvelopeMetadata envelopeMetadata, String str, String str2, String str3, Set set, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = envelopeMetadata.userId;
        }
        if ((i & 2) != 0) {
            str2 = envelopeMetadata.email;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = envelopeMetadata.username;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            set = envelopeMetadata.personas;
        }
        Set set2 = set;
        if ((i & 16) != 0) {
            str4 = envelopeMetadata.timezoneDescription;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = envelopeMetadata.locale;
        }
        return envelopeMetadata.copy(str, str6, str7, set2, str8, str5);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.email;
    }

    public final String component3() {
        return this.username;
    }

    public final Set<String> component4() {
        return this.personas;
    }

    public final String component5() {
        return this.timezoneDescription;
    }

    public final String component6() {
        return this.locale;
    }

    public final EnvelopeMetadata copy(@bt3(name = "user_id") String str, @bt3(name = "email") String str2, @bt3(name = "username") String str3, @bt3(name = "personas") Set<String> set, @bt3(name = "timezone_description") String str4, @bt3(name = "locale") String str5) {
        return new EnvelopeMetadata(str, str2, str3, set, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnvelopeMetadata)) {
            return false;
        }
        EnvelopeMetadata envelopeMetadata = (EnvelopeMetadata) obj;
        return zq3.c(this.userId, envelopeMetadata.userId) && zq3.c(this.email, envelopeMetadata.email) && zq3.c(this.username, envelopeMetadata.username) && zq3.c(this.personas, envelopeMetadata.personas) && zq3.c(this.timezoneDescription, envelopeMetadata.timezoneDescription) && zq3.c(this.locale, envelopeMetadata.locale);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final Set<String> getPersonas() {
        return this.personas;
    }

    public final String getTimezoneDescription() {
        return this.timezoneDescription;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.userId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.email;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.username;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Set<String> set = this.personas;
        int hashCode4 = (hashCode3 + (set != null ? set.hashCode() : 0)) * 31;
        String str4 = this.timezoneDescription;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.locale;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "EnvelopeMetadata(userId=" + this.userId + ", email=" + this.email + ", username=" + this.username + ", personas=" + this.personas + ", timezoneDescription=" + this.timezoneDescription + ", locale=" + this.locale + ")";
    }

    public EnvelopeMetadata(@bt3(name = "user_id") String str, @bt3(name = "email") String str2, @bt3(name = "username") String str3, @bt3(name = "personas") Set<String> set, @bt3(name = "timezone_description") String str4, @bt3(name = "locale") String str5) {
        this.userId = str;
        this.email = str2;
        this.username = str3;
        this.personas = set;
        this.timezoneDescription = str4;
        this.locale = str5;
    }

    public /* synthetic */ EnvelopeMetadata(String str, String str2, String str3, Set set, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : set, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
