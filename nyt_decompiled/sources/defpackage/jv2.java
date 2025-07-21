package defpackage;

import com.nytimes.android.features.games.gameshub.progress.api.GamesButtonState;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class jv2 {
    private final long a;
    private final int b;
    private final GamesButtonState c;
    private final String d;
    private final String e;

    public /* synthetic */ jv2(long j, int i, GamesButtonState gamesButtonState, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, gamesButtonState, str, str2);
    }

    public final long a() {
        return this.a;
    }

    public final GamesButtonState b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv2)) {
            return false;
        }
        jv2 jv2Var = (jv2) obj;
        return nn0.t(this.a, jv2Var.a) && this.b == jv2Var.b && this.c == jv2Var.c && zq3.c(this.d, jv2Var.d) && zq3.c(this.e, jv2Var.e);
    }

    public int hashCode() {
        int z = ((((nn0.z(this.a) * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int hashCode = (z + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GamesProgressFields(backgroundColor=" + nn0.A(this.a) + ", image=" + this.b + ", buttonState=" + this.c + ", byline=" + this.d + ", description=" + this.e + ")";
    }

    private jv2(long j, int i, GamesButtonState gamesButtonState, String str, String str2) {
        zq3.h(gamesButtonState, "buttonState");
        this.a = j;
        this.b = i;
        this.c = gamesButtonState;
        this.d = str;
        this.e = str2;
    }
}
