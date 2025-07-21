package defpackage;

import com.nytimes.android.features.you.youtab.composable.ComposableSingletons$CommonContentKt;
import defpackage.du5;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public abstract class lp0 {
    private static final Map a;
    private static final Map b;

    static {
        long e = ek8.e(19.5d);
        long e2 = ek8.e(19.5d);
        du5.a aVar = du5.a;
        vt5 vt5Var = new vt5(e, e2, aVar.e(), null);
        ComposableSingletons$CommonContentKt composableSingletons$CommonContentKt = ComposableSingletons$CommonContentKt.a;
        a = t.f(du8.a("savedForLaterIcon", new ck3(vt5Var, composableSingletons$CommonContentKt.a())));
        b = t.f(du8.a("addInterestIcon", new ck3(new vt5(ek8.e(19.5d), ek8.e(19.5d), aVar.e(), null), composableSingletons$CommonContentKt.b())));
    }

    public static final Map a() {
        return b;
    }
}
