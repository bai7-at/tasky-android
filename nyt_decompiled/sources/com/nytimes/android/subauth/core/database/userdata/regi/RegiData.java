package com.nytimes.android.subauth.core.database.userdata.regi;

import androidx.annotation.Keep;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscription;
import defpackage.mz8;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* loaded from: classes4.dex */
public final class RegiData {
    private final List<UserSubscription> subscriptions;
    private final mz8 userAccount;

    /* JADX WARN: Multi-variable type inference failed */
    public RegiData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RegiData copy$default(RegiData regiData, mz8 mz8Var, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            mz8Var = regiData.userAccount;
        }
        if ((i & 2) != 0) {
            list = regiData.subscriptions;
        }
        return regiData.copy(mz8Var, list);
    }

    public final mz8 component1() {
        return this.userAccount;
    }

    public final List<UserSubscription> component2() {
        return this.subscriptions;
    }

    public final RegiData copy(mz8 mz8Var, List<UserSubscription> list) {
        zq3.h(list, "subscriptions");
        return new RegiData(mz8Var, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegiData)) {
            return false;
        }
        RegiData regiData = (RegiData) obj;
        return zq3.c(this.userAccount, regiData.userAccount) && zq3.c(this.subscriptions, regiData.subscriptions);
    }

    public final List<UserSubscription> getSubscriptions() {
        return this.subscriptions;
    }

    public final mz8 getUserAccount() {
        return this.userAccount;
    }

    public int hashCode() {
        mz8 mz8Var = this.userAccount;
        return ((mz8Var == null ? 0 : mz8Var.hashCode()) * 31) + this.subscriptions.hashCode();
    }

    public String toString() {
        return "RegiData(userAccount=" + this.userAccount + ", subscriptions=" + this.subscriptions + ")";
    }

    public RegiData(mz8 mz8Var, List<UserSubscription> list) {
        zq3.h(list, "subscriptions");
        this.userAccount = mz8Var;
        this.subscriptions = list;
    }

    public /* synthetic */ RegiData(mz8 mz8Var, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mz8Var, (i & 2) != 0 ? i.l() : list);
    }
}
