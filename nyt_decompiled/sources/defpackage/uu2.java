package defpackage;

import android.content.res.Resources;
import com.nytimes.android.ribbon.destinations.games.GamesConfigItem;
import java.io.InputStream;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class uu2 {
    private final qv6 a;
    private final at3 b;
    private final int c;
    private final InputStream d;
    private final List e;

    public uu2(qv6 qv6Var, at3 at3Var, Resources resources) {
        List b;
        zq3.h(qv6Var, "remoteConfig");
        zq3.h(at3Var, "decoder");
        zq3.h(resources, "resources");
        this.a = qv6Var;
        this.b = at3Var;
        int i = gj6.android_games_destination_config;
        this.c = i;
        InputStream openRawResource = resources.openRawResource(i);
        zq3.g(openRawResource, "openRawResource(...)");
        this.d = openRawResource;
        at3Var.a();
        b = vu2.b((List) ru3.a(at3Var, new qo(GamesConfigItem.Companion.serializer()), openRawResource));
        this.e = b;
    }

    private final List a(String str) {
        List b;
        if (str.length() == 0) {
            return i.l();
        }
        at3 at3Var = this.b;
        at3Var.a();
        b = vu2.b((List) at3Var.c(new qo(GamesConfigItem.Companion.serializer()), str));
        return b;
    }

    private final String c() {
        return this.a.n();
    }

    public final List b() {
        return a(c());
    }
}
