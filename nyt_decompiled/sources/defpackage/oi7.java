package defpackage;

import com.nytimes.android.features.games.gameshub.progress.api.data.DailyProgress;
import com.nytimes.android.features.games.gameshub.progress.api.data.MiniProgress;

/* loaded from: classes4.dex */
public final class oi7 {
    private final String a;
    private final String b;
    private final DailyProgress c;
    private final MiniProgress d;
    private final ui9 e;

    public oi7(String str, String str2, DailyProgress dailyProgress, MiniProgress miniProgress, ui9 ui9Var) {
        zq3.h(str, "spellingBeeTodayRank");
        zq3.h(str2, "spellingBeeYesterdayRank");
        zq3.h(dailyProgress, "crossword");
        zq3.h(miniProgress, "mini");
        zq3.h(ui9Var, "wordle");
        this.a = str;
        this.b = str2;
        this.c = dailyProgress;
        this.d = miniProgress;
        this.e = ui9Var;
    }

    public static /* synthetic */ oi7 b(oi7 oi7Var, String str, String str2, DailyProgress dailyProgress, MiniProgress miniProgress, ui9 ui9Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oi7Var.a;
        }
        if ((i & 2) != 0) {
            str2 = oi7Var.b;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            dailyProgress = oi7Var.c;
        }
        DailyProgress dailyProgress2 = dailyProgress;
        if ((i & 8) != 0) {
            miniProgress = oi7Var.d;
        }
        MiniProgress miniProgress2 = miniProgress;
        if ((i & 16) != 0) {
            ui9Var = oi7Var.e;
        }
        return oi7Var.a(str, str3, dailyProgress2, miniProgress2, ui9Var);
    }

    public final oi7 a(String str, String str2, DailyProgress dailyProgress, MiniProgress miniProgress, ui9 ui9Var) {
        zq3.h(str, "spellingBeeTodayRank");
        zq3.h(str2, "spellingBeeYesterdayRank");
        zq3.h(dailyProgress, "crossword");
        zq3.h(miniProgress, "mini");
        zq3.h(ui9Var, "wordle");
        return new oi7(str, str2, dailyProgress, miniProgress, ui9Var);
    }

    public final DailyProgress c() {
        return this.c;
    }

    public final MiniProgress d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi7)) {
            return false;
        }
        oi7 oi7Var = (oi7) obj;
        return zq3.c(this.a, oi7Var.a) && zq3.c(this.b, oi7Var.b) && this.c == oi7Var.c && this.d == oi7Var.d && zq3.c(this.e, oi7Var.e);
    }

    public final String f() {
        return this.b;
    }

    public final ui9 g() {
        return this.e;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "SelectedDebugProgressItems(spellingBeeTodayRank=" + this.a + ", spellingBeeYesterdayRank=" + this.b + ", crossword=" + this.c + ", mini=" + this.d + ", wordle=" + this.e + ")";
    }
}
