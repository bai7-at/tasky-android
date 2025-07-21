package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class UserInfo {
    public static final Companion Companion = new Companion(null);
    public static final String PERSONA_FIRST_DAY_USER = "first_day";
    public static final String PERSONA_PAYER = "payer";
    private final String email;
    private final Set<String> personas;
    private final String userId;
    private final String username;

    public static final class Companion {
        private Companion() {
        }

        public final UserInfo ofStored(PreferencesService preferencesService) {
            zq3.h(preferencesService, "preferencesService");
            try {
                Systrace.startSynchronous("load-user-info-from-pref");
                String userIdentifier = preferencesService.getUserIdentifier();
                String username = preferencesService.getUsername();
                String userEmailAddress = preferencesService.getUserEmailAddress();
                HashSet hashSet = new HashSet();
                Set<String> userPersonas = preferencesService.getUserPersonas();
                if (userPersonas != null) {
                    hashSet.addAll(userPersonas);
                }
                Set<String> customPersonas = preferencesService.getCustomPersonas();
                if (customPersonas != null) {
                    hashSet.addAll(customPersonas);
                }
                hashSet.remove(UserInfo.PERSONA_PAYER);
                if (preferencesService.getUserPayer()) {
                    hashSet.add(UserInfo.PERSONA_PAYER);
                }
                hashSet.remove(UserInfo.PERSONA_FIRST_DAY_USER);
                if (preferencesService.isUsersFirstDay()) {
                    hashSet.add(UserInfo.PERSONA_FIRST_DAY_USER);
                }
                return new UserInfo(userIdentifier, userEmailAddress, username, hashSet);
            } finally {
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, String str3, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userInfo.userId;
        }
        if ((i & 2) != 0) {
            str2 = userInfo.email;
        }
        if ((i & 4) != 0) {
            str3 = userInfo.username;
        }
        if ((i & 8) != 0) {
            set = userInfo.personas;
        }
        return userInfo.copy(str, str2, str3, set);
    }

    public static final UserInfo ofStored(PreferencesService preferencesService) {
        return Companion.ofStored(preferencesService);
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

    public final UserInfo copy(@bt3(name = "id") String str, @bt3(name = "em") String str2, @bt3(name = "un") String str3, @bt3(name = "per") Set<String> set) {
        return new UserInfo(str, str2, str3, set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        return zq3.c(this.userId, userInfo.userId) && zq3.c(this.email, userInfo.email) && zq3.c(this.username, userInfo.username) && zq3.c(this.personas, userInfo.personas);
    }

    public final String getEmail() {
        return this.email;
    }

    public final Set<String> getPersonas() {
        return this.personas;
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
        return hashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "UserInfo(userId=" + this.userId + ", email=" + this.email + ", username=" + this.username + ", personas=" + this.personas + ")";
    }

    public UserInfo(@bt3(name = "id") String str, @bt3(name = "em") String str2, @bt3(name = "un") String str3, @bt3(name = "per") Set<String> set) {
        this.userId = str;
        this.email = str2;
        this.username = str3;
        this.personas = set;
    }

    public /* synthetic */ UserInfo(String str, String str2, String str3, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : set);
    }
}
