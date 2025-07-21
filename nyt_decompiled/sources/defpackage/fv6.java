package defpackage;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.messaging.regiwall.RegiwallCard;

/* loaded from: classes4.dex */
public abstract class fv6 implements op4 {
    public static void a(RegiwallCard regiwallCard, ET2Scope eT2Scope) {
        regiwallCard.et2Scope = eT2Scope;
    }

    public static void b(RegiwallCard regiwallCard, qv6 qv6Var) {
        regiwallCard.remoteConfig = qv6Var;
    }
}
