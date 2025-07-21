package com.nytimes.android.subauth.core.database.userdata;

import androidx.annotation.Keep;
import com.amazonaws.services.s3.internal.Constants;
import com.nytimes.android.subauth.core.database.userdata.googleplay.GooglePlayData;
import com.nytimes.android.subauth.core.database.userdata.regi.RegiData;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscription;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionProduct;
import defpackage.mz8;
import defpackage.ss2;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* loaded from: classes4.dex */
public final class UserData {
    public static final a Companion = new a(null);
    public static final long USER_ID = 1234;
    private final GooglePlayData googlePlayData;
    private final RegiData regiData;
    private final long userId;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GooglePlayData.EntitlementState.values().length];
            try {
                iArr[GooglePlayData.EntitlementState.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GooglePlayData.EntitlementState.PROVISIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GooglePlayData.EntitlementState.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UserData(long j, RegiData regiData, GooglePlayData googlePlayData) {
        zq3.h(regiData, "regiData");
        zq3.h(googlePlayData, "googlePlayData");
        this.userId = j;
        this.regiData = regiData;
        this.googlePlayData = googlePlayData;
    }

    public static /* synthetic */ UserData copy$default(UserData userData, long j, RegiData regiData, GooglePlayData googlePlayData, int i, Object obj) {
        if ((i & 1) != 0) {
            j = userData.userId;
        }
        if ((i & 2) != 0) {
            regiData = userData.regiData;
        }
        if ((i & 4) != 0) {
            googlePlayData = userData.googlePlayData;
        }
        return userData.copy(j, regiData, googlePlayData);
    }

    private final boolean hasGooglePlayEntitlement(UserSubscriptionEntitlement userSubscriptionEntitlement) {
        if (!(userSubscriptionEntitlement instanceof UserSubscriptionEntitlement.e)) {
            return this.googlePlayData.activeEntitlements().contains(userSubscriptionEntitlement);
        }
        Set<UserSubscriptionEntitlement> activeEntitlements = this.googlePlayData.activeEntitlements();
        ArrayList arrayList = new ArrayList(i.w(activeEntitlements, 10));
        Iterator<T> it2 = activeEntitlements.iterator();
        while (it2.hasNext()) {
            arrayList.add(((UserSubscriptionEntitlement) it2.next()).getRawValue());
        }
        return arrayList.contains(userSubscriptionEntitlement.getRawValue());
    }

    public final mz8 account() {
        return this.regiData.getUserAccount();
    }

    public final UserSubscription activeLinkedSubscription(UserSubscriptionProduct userSubscriptionProduct) {
        Object obj;
        zq3.h(userSubscriptionProduct, "product");
        Iterator<T> it2 = subscriptions().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            UserSubscription userSubscription = (UserSubscription) obj;
            if (userSubscription.isActive() && userSubscription.getSubscriptionProducts().contains(userSubscriptionProduct)) {
                break;
            }
        }
        return (UserSubscription) obj;
    }

    public final long component1() {
        return this.userId;
    }

    public final RegiData component2() {
        return this.regiData;
    }

    public final GooglePlayData component3() {
        return this.googlePlayData;
    }

    public final UserData copy(long j, RegiData regiData, GooglePlayData googlePlayData) {
        zq3.h(regiData, "regiData");
        zq3.h(googlePlayData, "googlePlayData");
        return new UserData(j, regiData, googlePlayData);
    }

    public final String description() {
        String str;
        StringBuilder sb = new StringBuilder();
        mz8 account = account();
        if (account == null || (str = account.a()) == null) {
            str = Constants.NULL_VERSION_ID;
        }
        sb.append("User(info: " + str);
        List<UserSubscription> subscriptions = subscriptions();
        if (subscriptions.size() == 1) {
            sb.append(", subscription: " + subscriptions.get(0).description());
        } else {
            sb.append(", subscriptions: " + i.u0(subscriptions, ",", null, null, 0, null, new ss2() { // from class: com.nytimes.android.subauth.core.database.userdata.UserData$description$subscriptionsDescription$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CharSequence invoke(UserSubscription userSubscription) {
                    zq3.h(userSubscription, "it");
                    return userSubscription.description();
                }
            }, 30, null));
        }
        if (!this.googlePlayData.getEntitlements().isEmpty()) {
            int i = b.$EnumSwitchMapping$0[this.googlePlayData.entitlementState().ordinal()];
            if (i == 1) {
                Set<UserSubscriptionEntitlement> entitlements = this.googlePlayData.getEntitlements();
                ArrayList arrayList = new ArrayList(i.w(entitlements, 10));
                Iterator<T> it2 = entitlements.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((UserSubscriptionEntitlement) it2.next()).getRawValue());
                }
                sb.append(", GooglePlay: " + i.u0(arrayList, ",", null, null, 0, null, null, 62, null));
            } else if (i == 2) {
                Set<UserSubscriptionEntitlement> entitlements2 = this.googlePlayData.getEntitlements();
                ArrayList arrayList2 = new ArrayList(i.w(entitlements2, 10));
                Iterator<T> it3 = entitlements2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((UserSubscriptionEntitlement) it3.next()).getRawValue());
                }
                sb.append(", GooglePlay: " + i.u0(arrayList2, ",", null, null, 0, null, null, 62, null) + " [provisional]");
            } else if (i == 3) {
                Set<UserSubscriptionEntitlement> entitlements3 = this.googlePlayData.getEntitlements();
                ArrayList arrayList3 = new ArrayList(i.w(entitlements3, 10));
                Iterator<T> it4 = entitlements3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((UserSubscriptionEntitlement) it4.next()).getRawValue());
                }
                sb.append(", GooglePlay: " + i.u0(arrayList3, ",", null, null, 0, null, null, 62, null) + " [expired]");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    public final String displayName() {
        mz8 userAccount = this.regiData.getUserAccount();
        if (userAccount != null) {
            return userAccount.b();
        }
        return null;
    }

    public final String email() {
        mz8 userAccount = this.regiData.getUserAccount();
        if (userAccount != null) {
            return userAccount.c();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserData)) {
            return false;
        }
        UserData userData = (UserData) obj;
        return this.userId == userData.userId && zq3.c(this.regiData, userData.regiData) && zq3.c(this.googlePlayData, userData.googlePlayData);
    }

    public final String familyName() {
        mz8 userAccount = this.regiData.getUserAccount();
        if (userAccount != null) {
            return userAccount.d();
        }
        return null;
    }

    public final String gamesAvatarIcon() {
        mz8 userAccount = this.regiData.getUserAccount();
        if (userAccount != null) {
            return userAccount.e();
        }
        return null;
    }

    public final String gamesUsername() {
        mz8 userAccount = this.regiData.getUserAccount();
        if (userAccount != null) {
            return userAccount.f();
        }
        return null;
    }

    public final Set<UserSubscriptionEntitlement> getActiveEntitlements() {
        List<UserSubscription> subscriptions = subscriptions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : subscriptions) {
            if (((UserSubscription) obj).getHasActiveEntitlements()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i.w(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((UserSubscription) it2.next()).getEntitlements());
        }
        Set e = b0.e();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            e = i.d1(e, (Set) it3.next());
        }
        return i.d1(e, this.googlePlayData.getEntitlements());
    }

    public final Set<UserSubscriptionEntitlement> getActiveLinkedEntitlements() {
        List<UserSubscription> subscriptions = subscriptions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : subscriptions) {
            if (((UserSubscription) obj).getHasActiveEntitlements()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i.w(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((UserSubscription) it2.next()).getEntitlements());
        }
        Set<UserSubscriptionEntitlement> e = b0.e();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            e = i.d1(e, (Set) it3.next());
        }
        return e;
    }

    public final GooglePlayData getGooglePlayData() {
        return this.googlePlayData;
    }

    public final RegiData getRegiData() {
        return this.regiData;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final String givenName() {
        mz8 userAccount = this.regiData.getUserAccount();
        if (userAccount != null) {
            return userAccount.g();
        }
        return null;
    }

    public final boolean hasActiveEntitlement(UserSubscriptionEntitlement userSubscriptionEntitlement) {
        zq3.h(userSubscriptionEntitlement, "entitlement");
        if (hasLinkedActiveEntitlement(userSubscriptionEntitlement)) {
            return true;
        }
        if (hasGooglePlayEntitlement(userSubscriptionEntitlement)) {
            int i = b.$EnumSwitchMapping$0[this.googlePlayData.entitlementState().ordinal()];
            if (i == 1 || i == 2) {
                return true;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public final boolean hasLinkedActiveEntitlement(UserSubscriptionEntitlement userSubscriptionEntitlement) {
        Object obj;
        zq3.h(userSubscriptionEntitlement, "entitlement");
        Iterator<T> it2 = subscriptions().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((UserSubscription) obj).hasActiveEntitlement(userSubscriptionEntitlement)) {
                break;
            }
        }
        return ((UserSubscription) obj) != null;
    }

    public int hashCode() {
        return (((Long.hashCode(this.userId) * 31) + this.regiData.hashCode()) * 31) + this.googlePlayData.hashCode();
    }

    public final boolean isSignedIn() {
        String regiId = regiId();
        return !(regiId == null || regiId.length() == 0);
    }

    public final String name() {
        mz8 userAccount = this.regiData.getUserAccount();
        if (userAccount != null) {
            return userAccount.h();
        }
        return null;
    }

    public final String regiId() {
        mz8 userAccount = this.regiData.getUserAccount();
        if (userAccount != null) {
            return userAccount.i();
        }
        return null;
    }

    public final List<UserSubscription> subscriptions() {
        return this.regiData.getSubscriptions();
    }

    public String toString() {
        return "UserData(userId=" + this.userId + ", regiData=" + this.regiData + ", googlePlayData=" + this.googlePlayData + ")";
    }

    public final String username() {
        mz8 userAccount = this.regiData.getUserAccount();
        if (userAccount != null) {
            return userAccount.j();
        }
        return null;
    }

    public /* synthetic */ UserData(long j, RegiData regiData, GooglePlayData googlePlayData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? USER_ID : j, regiData, googlePlayData);
    }
}
