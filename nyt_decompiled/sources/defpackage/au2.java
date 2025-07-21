package defpackage;

import com.nytimes.android.features.games.gameshub.configuration.models.NytGamesConfiguration;

/* loaded from: classes4.dex */
public final class au2 implements ju0 {
    private final qv6 a;
    private final at3 b;

    public au2(qv6 qv6Var, at3 at3Var) {
        zq3.h(qv6Var, "remoteConfig");
        zq3.h(at3Var, "decoder");
        this.a = qv6Var;
        this.b = at3Var;
    }

    private final NytGamesConfiguration b(String str) {
        if (str.length() == 0) {
            return null;
        }
        at3 at3Var = this.b;
        at3Var.a();
        return (NytGamesConfiguration) at3Var.c(he0.u(NytGamesConfiguration.Companion.serializer()), str);
    }

    private final String c() {
        return this.a.o();
    }

    private final String d() {
        return this.a.w();
    }

    @Override // defpackage.ju0
    public NytGamesConfiguration a(boolean z) {
        return z ? b(c()) : b(d());
    }
}
