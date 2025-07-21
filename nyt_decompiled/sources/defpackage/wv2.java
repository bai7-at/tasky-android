package defpackage;

import com.nytimes.android.ribbon.destinations.games.GamesLockupData;
import java.util.List;

/* loaded from: classes4.dex */
public final class wv2 {
    private final List a;
    private final List b;
    private final GamesLockupData c;
    private final GamesLockupData d;

    public wv2(List list, List list2, GamesLockupData gamesLockupData, GamesLockupData gamesLockupData2) {
        zq3.h(list, "games");
        zq3.h(list2, "tipsAndTricks");
        this.a = list;
        this.b = list2;
        this.c = gamesLockupData;
        this.d = gamesLockupData2;
    }

    public final GamesLockupData a() {
        return this.c;
    }

    public final GamesLockupData b() {
        return this.d;
    }

    public final List c() {
        return this.a;
    }

    public final List d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv2)) {
            return false;
        }
        wv2 wv2Var = (wv2) obj;
        return zq3.c(this.a, wv2Var.a) && zq3.c(this.b, wv2Var.b) && zq3.c(this.c, wv2Var.c) && zq3.c(this.d, wv2Var.d);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        GamesLockupData gamesLockupData = this.c;
        int hashCode2 = (hashCode + (gamesLockupData == null ? 0 : gamesLockupData.hashCode())) * 31;
        GamesLockupData gamesLockupData2 = this.d;
        return hashCode2 + (gamesLockupData2 != null ? gamesLockupData2.hashCode() : 0);
    }

    public String toString() {
        return "GamesViewState(games=" + this.a + ", tipsAndTricks=" + this.b + ", featuredHero=" + this.c + ", featuredSidekick=" + this.d + ")";
    }
}
