package defpackage;

import android.content.Context;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.features.games.gameshub.configuration.models.NytGameCardEntity;
import com.nytimes.android.features.games.gameshub.progress.api.GamesButtonState;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ui9 {
    public static final a Companion = new a(null);
    private static final ui9 d = new ui9(0, 0, false, 1, null);
    private final int a;
    private final int b;
    private final boolean c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final GamesButtonState a(int i, boolean z) {
            return z ? GamesButtonState.SOLVED : i > 0 ? GamesButtonState.CONTINUE : GamesButtonState.PLAY;
        }

        private final jv2 d(Context context, NytGameCardEntity nytGameCardEntity, int i, boolean z) {
            String e = e(context, i, z);
            return new jv2(z ? nn0.b.f() : nytGameCardEntity.a(), me6.progress_wordle_default, a(i, z), e, nytGameCardEntity.d(), null);
        }

        private final String e(Context context, int i, boolean z) {
            if (i == 1 && z) {
                String string = context.getString(rk6.progress_world_solved_1guess_byline);
                zq3.e(string);
                return string;
            }
            if (!z) {
                return "";
            }
            String string2 = context.getString(rk6.progress_world_solved_byline, Integer.valueOf(i));
            zq3.e(string2);
            return string2;
        }

        public final wt2 b(Context context, NytGameCardEntity nytGameCardEntity, int i, boolean z) {
            zq3.h(context, "context");
            zq3.h(nytGameCardEntity, AssetConstants.DAILY_FIVE_GAME);
            jv2 d = d(context, nytGameCardEntity, i, z);
            return new wt2(nytGameCardEntity.f(), d.a(), d.e(), nytGameCardEntity.g(), d.b(), nytGameCardEntity.b(), nytGameCardEntity.e(), nytGameCardEntity.h(), d.c(), d.d(), null);
        }

        public final ui9 c() {
            return ui9.d;
        }

        private a() {
        }
    }

    public ui9(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public static /* synthetic */ ui9 c(ui9 ui9Var, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = ui9Var.a;
        }
        if ((i3 & 2) != 0) {
            i2 = ui9Var.b;
        }
        if ((i3 & 4) != 0) {
            z = ui9Var.c;
        }
        return ui9Var.b(i, i2, z);
    }

    public final ui9 b(int i, int i2, boolean z) {
        return new ui9(i, i2, z);
    }

    public final int d() {
        return this.b;
    }

    public final boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui9)) {
            return false;
        }
        ui9 ui9Var = (ui9) obj;
        return this.a == ui9Var.a && this.b == ui9Var.b && this.c == ui9Var.c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        return "WordleProgress(image=" + this.a + ", guesses=" + this.b + ", win=" + this.c + ")";
    }

    public /* synthetic */ ui9(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? me6.progress_wordle_default : i, i2, z);
    }
}
