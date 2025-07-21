package defpackage;

import android.content.Context;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class y68 {
    public static final y68 a = new y68();

    private y68() {
    }

    public final Set a(Context context, Subauth subauth, r98 r98Var, CoroutineScope coroutineScope) {
        zq3.h(context, "context");
        zq3.h(subauth, "subauth");
        zq3.h(r98Var, "subauthUserUI");
        zq3.h(coroutineScope, "applicationScope");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(g15.a.b(context, subauth, r98Var, coroutineScope));
        linkedHashSet.add(v68.a.a());
        z05 z05Var = z05.a;
        linkedHashSet.add(z05Var.b(subauth.k(), context));
        linkedHashSet.add(z05Var.a(subauth.k(), subauth.l(), context));
        linkedHashSet.add(z05Var.c(subauth.k(), context));
        return linkedHashSet;
    }
}
