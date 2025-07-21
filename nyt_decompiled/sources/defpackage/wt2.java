package defpackage;

import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.features.games.gameshub.progress.api.GamesButtonState;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class wt2 {
    private final String a;
    private final long b;
    private final int c;
    private final String d;
    private final GamesButtonState e;
    private final String f;
    private final String g;
    private final boolean h;
    private final String i;
    private final String j;

    public /* synthetic */ wt2(String str, long j, int i, String str2, GamesButtonState gamesButtonState, String str3, String str4, boolean z, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i, str2, gamesButtonState, str3, str4, z, str5, str6);
    }

    public final long a() {
        return this.b;
    }

    public final GamesButtonState b() {
        return this.e;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.i;
    }

    public final String e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt2)) {
            return false;
        }
        wt2 wt2Var = (wt2) obj;
        return zq3.c(this.a, wt2Var.a) && nn0.t(this.b, wt2Var.b) && this.c == wt2Var.c && zq3.c(this.d, wt2Var.d) && this.e == wt2Var.e && zq3.c(this.f, wt2Var.f) && zq3.c(this.g, wt2Var.g) && this.h == wt2Var.h && zq3.c(this.i, wt2Var.i) && zq3.c(this.j, wt2Var.j);
    }

    public final String f() {
        return this.g;
    }

    public final String g() {
        return this.a;
    }

    public final int h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.a.hashCode() * 31) + nn0.z(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Boolean.hashCode(this.h)) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.d;
    }

    public final boolean j() {
        return this.h;
    }

    public String toString() {
        return "GameCardDetails(id=" + this.a + ", backgroundColor=" + nn0.A(this.b) + ", image=" + this.c + ", name=" + this.d + ", buttonState=" + this.e + ", buttonTitle=" + this.f + ", gameUrl=" + this.g + ", isSubscriptionRequired=" + this.h + ", byline=" + this.i + ", description=" + this.j + ")";
    }

    private wt2(String str, long j, int i, String str2, GamesButtonState gamesButtonState, String str3, String str4, boolean z, String str5, String str6) {
        zq3.h(str, "id");
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(gamesButtonState, "buttonState");
        zq3.h(str3, "buttonTitle");
        zq3.h(str4, "gameUrl");
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = str2;
        this.e = gamesButtonState;
        this.f = str3;
        this.g = str4;
        this.h = z;
        this.i = str5;
        this.j = str6;
    }
}
