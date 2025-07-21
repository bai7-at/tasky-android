package com.nytimes.android.subauth.core.database.userdata.subscription;

import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public abstract class a {
    public static final String TEMP_ENTITLEMENT = "_TE_";
    private static final Set<UserSubscriptionEntitlement> allAccessEntitlements = b0.j(UserSubscriptionEntitlement.c.INSTANCE, UserSubscriptionEntitlement.d.INSTANCE, UserSubscriptionEntitlement.f.INSTANCE, UserSubscriptionEntitlement.g.INSTANCE, UserSubscriptionEntitlement.b.INSTANCE, UserSubscriptionEntitlement.o.INSTANCE);

    public static final Set a() {
        return allAccessEntitlements;
    }

    public static final UserSubscriptionEntitlement b(String str) {
        zq3.h(str, "<this>");
        UserSubscriptionEntitlement.a aVar = UserSubscriptionEntitlement.a.INSTANCE;
        if (zq3.c(str, aVar.getRawValue())) {
            return aVar;
        }
        UserSubscriptionEntitlement.b bVar = UserSubscriptionEntitlement.b.INSTANCE;
        if (zq3.c(str, bVar.getRawValue())) {
            return bVar;
        }
        UserSubscriptionEntitlement.c cVar = UserSubscriptionEntitlement.c.INSTANCE;
        if (zq3.c(str, cVar.getRawValue())) {
            return cVar;
        }
        UserSubscriptionEntitlement.d dVar = UserSubscriptionEntitlement.d.INSTANCE;
        if (zq3.c(str, dVar.getRawValue())) {
            return dVar;
        }
        UserSubscriptionEntitlement.f fVar = UserSubscriptionEntitlement.f.INSTANCE;
        if (zq3.c(str, fVar.getRawValue())) {
            return fVar;
        }
        UserSubscriptionEntitlement.g gVar = UserSubscriptionEntitlement.g.INSTANCE;
        if (zq3.c(str, gVar.getRawValue())) {
            return gVar;
        }
        UserSubscriptionEntitlement.h hVar = UserSubscriptionEntitlement.h.INSTANCE;
        if (zq3.c(str, hVar.getRawValue())) {
            return hVar;
        }
        UserSubscriptionEntitlement.i iVar = UserSubscriptionEntitlement.i.INSTANCE;
        if (zq3.c(str, iVar.getRawValue())) {
            return iVar;
        }
        UserSubscriptionEntitlement.j jVar = UserSubscriptionEntitlement.j.INSTANCE;
        if (zq3.c(str, jVar.getRawValue())) {
            return jVar;
        }
        UserSubscriptionEntitlement.k kVar = UserSubscriptionEntitlement.k.INSTANCE;
        if (zq3.c(str, kVar.getRawValue())) {
            return kVar;
        }
        UserSubscriptionEntitlement.l lVar = UserSubscriptionEntitlement.l.INSTANCE;
        if (zq3.c(str, lVar.getRawValue())) {
            return lVar;
        }
        UserSubscriptionEntitlement.m mVar = UserSubscriptionEntitlement.m.INSTANCE;
        if (zq3.c(str, mVar.getRawValue())) {
            return mVar;
        }
        UserSubscriptionEntitlement.n nVar = UserSubscriptionEntitlement.n.INSTANCE;
        if (zq3.c(str, nVar.getRawValue())) {
            return nVar;
        }
        UserSubscriptionEntitlement.o oVar = UserSubscriptionEntitlement.o.INSTANCE;
        return zq3.c(str, oVar.getRawValue()) ? oVar : new UserSubscriptionEntitlement.e(str);
    }
}
