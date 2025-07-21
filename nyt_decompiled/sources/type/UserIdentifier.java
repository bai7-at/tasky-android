package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class UserIdentifier {
    private final nk5 demographicsToken;
    private final nk5 profileToken;
    private final String token;

    public UserIdentifier(String str, nk5 nk5Var, nk5 nk5Var2) {
        zq3.h(str, "token");
        zq3.h(nk5Var, "demographicsToken");
        zq3.h(nk5Var2, "profileToken");
        this.token = str;
        this.demographicsToken = nk5Var;
        this.profileToken = nk5Var2;
    }

    public static /* synthetic */ UserIdentifier copy$default(UserIdentifier userIdentifier, String str, nk5 nk5Var, nk5 nk5Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userIdentifier.token;
        }
        if ((i & 2) != 0) {
            nk5Var = userIdentifier.demographicsToken;
        }
        if ((i & 4) != 0) {
            nk5Var2 = userIdentifier.profileToken;
        }
        return userIdentifier.copy(str, nk5Var, nk5Var2);
    }

    public final String component1() {
        return this.token;
    }

    public final nk5 component2() {
        return this.demographicsToken;
    }

    public final nk5 component3() {
        return this.profileToken;
    }

    public final UserIdentifier copy(String str, nk5 nk5Var, nk5 nk5Var2) {
        zq3.h(str, "token");
        zq3.h(nk5Var, "demographicsToken");
        zq3.h(nk5Var2, "profileToken");
        return new UserIdentifier(str, nk5Var, nk5Var2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserIdentifier)) {
            return false;
        }
        UserIdentifier userIdentifier = (UserIdentifier) obj;
        return zq3.c(this.token, userIdentifier.token) && zq3.c(this.demographicsToken, userIdentifier.demographicsToken) && zq3.c(this.profileToken, userIdentifier.profileToken);
    }

    public final nk5 getDemographicsToken() {
        return this.demographicsToken;
    }

    public final nk5 getProfileToken() {
        return this.profileToken;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((this.token.hashCode() * 31) + this.demographicsToken.hashCode()) * 31) + this.profileToken.hashCode();
    }

    public String toString() {
        return "UserIdentifier(token=" + this.token + ", demographicsToken=" + this.demographicsToken + ", profileToken=" + this.profileToken + ")";
    }

    public /* synthetic */ UserIdentifier(String str, nk5 nk5Var, nk5 nk5Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? nk5.a.b : nk5Var, (i & 4) != 0 ? nk5.a.b : nk5Var2);
    }
}
