package defpackage;

import android.content.Context;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.ads.AdClientImpl;
import com.nytimes.android.ads.a;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class v6 {
    public final a a(Context context, z58 z58Var, d96 d96Var, g7 g7Var, AbraManager abraManager) {
        zq3.h(context, "context");
        zq3.h(z58Var, "subauthClient");
        zq3.h(d96Var, "purrClient");
        zq3.h(g7Var, "adOverride");
        zq3.h(abraManager, "abraManager");
        return new AdClientImpl(context, z58Var, d96Var, g7Var, abraManager);
    }

    public final String b() {
        String uuid = UUID.randomUUID().toString();
        zq3.g(uuid, "toString(...)");
        return uuid;
    }
}
