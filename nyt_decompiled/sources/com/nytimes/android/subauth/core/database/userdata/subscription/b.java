package com.nytimes.android.subauth.core.database.userdata.subscription;

import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionProduct;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public abstract class b {
    private static final Set<UserSubscriptionProduct> allAccessProducts = b0.j(UserSubscriptionProduct.b.INSTANCE, UserSubscriptionProduct.c.INSTANCE, UserSubscriptionProduct.d.INSTANCE, UserSubscriptionProduct.e.INSTANCE, UserSubscriptionProduct.a.INSTANCE, UserSubscriptionProduct.g.INSTANCE);

    public static final UserSubscriptionProduct a(String str) {
        zq3.h(str, "<this>");
        UserSubscriptionProduct.c cVar = UserSubscriptionProduct.c.INSTANCE;
        if (zq3.c(str, cVar.getRawValue())) {
            return cVar;
        }
        UserSubscriptionProduct.d dVar = UserSubscriptionProduct.d.INSTANCE;
        if (zq3.c(str, dVar.getRawValue())) {
            return dVar;
        }
        UserSubscriptionProduct.e eVar = UserSubscriptionProduct.e.INSTANCE;
        if (zq3.c(str, eVar.getRawValue())) {
            return eVar;
        }
        UserSubscriptionProduct.b bVar = UserSubscriptionProduct.b.INSTANCE;
        if (zq3.c(str, bVar.getRawValue())) {
            return bVar;
        }
        UserSubscriptionProduct.g gVar = UserSubscriptionProduct.g.INSTANCE;
        if (zq3.c(str, gVar.getRawValue())) {
            return gVar;
        }
        UserSubscriptionProduct.a aVar = UserSubscriptionProduct.a.INSTANCE;
        return zq3.c(str, aVar.getRawValue()) ? aVar : new UserSubscriptionProduct.f(str);
    }
}
