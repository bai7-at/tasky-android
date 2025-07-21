package defpackage;

import android.content.Context;
import com.nytimes.android.ads.AdRepositoryImpl;
import com.nytimes.android.ads.a;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes2.dex */
public final class d7 {
    public static final d7 a = new d7();

    private d7() {
    }

    public final m7 a(a aVar, t6 t6Var, o7 o7Var, MutableSharedFlow mutableSharedFlow) {
        zq3.h(aVar, "adClient");
        zq3.h(t6Var, "adManagerFactory");
        zq3.h(o7Var, "adService");
        zq3.h(mutableSharedFlow, "adEventFlow");
        return new AdRepositoryImpl(aVar, t6Var, o7Var, mutableSharedFlow, null, null, 48, null);
    }

    public final t6 b(Context context) {
        zq3.h(context, "appContext");
        return new t6(context);
    }
}
