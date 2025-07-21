package defpackage;

import com.nytimes.android.features.games.gameshub.configuration.models.NytGamesConfiguration;
import java.util.List;

/* loaded from: classes4.dex */
public final class iv2 {
    private final boolean a;
    private final String b;
    private final NytGamesConfiguration c;
    private final List d;

    public iv2(boolean z, String str, NytGamesConfiguration nytGamesConfiguration, List list) {
        zq3.h(str, "userEntitlementDescription");
        zq3.h(list, "details");
        this.a = z;
        this.b = str;
        this.c = nytGamesConfiguration;
        this.d = list;
    }

    public final iv2 a(boolean z, String str, NytGamesConfiguration nytGamesConfiguration, List list) {
        zq3.h(str, "userEntitlementDescription");
        zq3.h(list, "details");
        return new iv2(z, str, nytGamesConfiguration, list);
    }

    public final List b() {
        return this.d;
    }

    public final NytGamesConfiguration c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv2)) {
            return false;
        }
        iv2 iv2Var = (iv2) obj;
        return this.a == iv2Var.a && zq3.c(this.b, iv2Var.b) && zq3.c(this.c, iv2Var.c) && zq3.c(this.d, iv2Var.d);
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.a) * 31) + this.b.hashCode()) * 31;
        NytGamesConfiguration nytGamesConfiguration = this.c;
        return ((hashCode + (nytGamesConfiguration == null ? 0 : nytGamesConfiguration.hashCode())) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "GamesProgressConfiguration(isUserGamesSubscribed=" + this.a + ", userEntitlementDescription=" + this.b + ", gameConfiguration=" + this.c + ", details=" + this.d + ")";
    }
}
