package com.nytimes.android.subauth.core.database.userdata.subscription;

import androidx.annotation.Keep;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import defpackage.et3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;

@et3(generateAdapter = true)
@Keep
/* loaded from: classes4.dex */
public final class UserSubscription {
    private final String billingSource;
    private final String bundleType;
    private final Date cancellationDate;
    private final Date endDate;
    private final Set<UserSubscriptionEntitlement> entitlements;
    private final Date gracePeriodEndDate;
    private final Date gracePeriodStartDate;
    private final boolean hasActiveEntitlements;
    private final boolean hasQueuedSub;
    private final boolean hasTransactionInProgress;
    private final boolean isFreeTrial;
    private final String name;
    private final UserSubscriptionOwnershipStatus ownershipStatus;
    private final String promotionTierType;
    private final Date startDate;
    private final UserSubscriptionStatus status;
    private final List<String> subscriptionLabels;
    private final List<UserSubscriptionProduct> subscriptionProducts;

    /* JADX WARN: Multi-variable type inference failed */
    public UserSubscription(String str, UserSubscriptionStatus userSubscriptionStatus, UserSubscriptionOwnershipStatus userSubscriptionOwnershipStatus, String str2, Date date, Date date2, Date date3, Date date4, Date date5, boolean z, boolean z2, boolean z3, String str3, String str4, List<? extends UserSubscriptionProduct> list, List<String> list2, boolean z4, Set<? extends UserSubscriptionEntitlement> set) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(userSubscriptionStatus, "status");
        zq3.h(userSubscriptionOwnershipStatus, "ownershipStatus");
        zq3.h(str2, "bundleType");
        zq3.h(str3, "billingSource");
        zq3.h(str4, "promotionTierType");
        zq3.h(list, "subscriptionProducts");
        zq3.h(list2, "subscriptionLabels");
        zq3.h(set, "entitlements");
        this.name = str;
        this.status = userSubscriptionStatus;
        this.ownershipStatus = userSubscriptionOwnershipStatus;
        this.bundleType = str2;
        this.startDate = date;
        this.endDate = date2;
        this.gracePeriodStartDate = date3;
        this.gracePeriodEndDate = date4;
        this.cancellationDate = date5;
        this.isFreeTrial = z;
        this.hasQueuedSub = z2;
        this.hasTransactionInProgress = z3;
        this.billingSource = str3;
        this.promotionTierType = str4;
        this.subscriptionProducts = list;
        this.subscriptionLabels = list2;
        this.hasActiveEntitlements = z4;
        this.entitlements = set;
    }

    public final Set<UserSubscriptionEntitlement> activeEntitlements() {
        return this.hasActiveEntitlements ? this.entitlements : b0.e();
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component10() {
        return this.isFreeTrial;
    }

    public final boolean component11() {
        return this.hasQueuedSub;
    }

    public final boolean component12() {
        return this.hasTransactionInProgress;
    }

    public final String component13() {
        return this.billingSource;
    }

    public final String component14() {
        return this.promotionTierType;
    }

    public final List<UserSubscriptionProduct> component15() {
        return this.subscriptionProducts;
    }

    public final List<String> component16() {
        return this.subscriptionLabels;
    }

    public final boolean component17() {
        return this.hasActiveEntitlements;
    }

    public final Set<UserSubscriptionEntitlement> component18() {
        return this.entitlements;
    }

    public final UserSubscriptionStatus component2() {
        return this.status;
    }

    public final UserSubscriptionOwnershipStatus component3() {
        return this.ownershipStatus;
    }

    public final String component4() {
        return this.bundleType;
    }

    public final Date component5() {
        return this.startDate;
    }

    public final Date component6() {
        return this.endDate;
    }

    public final Date component7() {
        return this.gracePeriodStartDate;
    }

    public final Date component8() {
        return this.gracePeriodEndDate;
    }

    public final Date component9() {
        return this.cancellationDate;
    }

    public final UserSubscription copy(String str, UserSubscriptionStatus userSubscriptionStatus, UserSubscriptionOwnershipStatus userSubscriptionOwnershipStatus, String str2, Date date, Date date2, Date date3, Date date4, Date date5, boolean z, boolean z2, boolean z3, String str3, String str4, List<? extends UserSubscriptionProduct> list, List<String> list2, boolean z4, Set<? extends UserSubscriptionEntitlement> set) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(userSubscriptionStatus, "status");
        zq3.h(userSubscriptionOwnershipStatus, "ownershipStatus");
        zq3.h(str2, "bundleType");
        zq3.h(str3, "billingSource");
        zq3.h(str4, "promotionTierType");
        zq3.h(list, "subscriptionProducts");
        zq3.h(list2, "subscriptionLabels");
        zq3.h(set, "entitlements");
        return new UserSubscription(str, userSubscriptionStatus, userSubscriptionOwnershipStatus, str2, date, date2, date3, date4, date5, z, z2, z3, str3, str4, list, list2, z4, set);
    }

    public final String description() {
        return this.name + " (" + this.status + ")";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSubscription)) {
            return false;
        }
        UserSubscription userSubscription = (UserSubscription) obj;
        return zq3.c(this.name, userSubscription.name) && this.status == userSubscription.status && this.ownershipStatus == userSubscription.ownershipStatus && zq3.c(this.bundleType, userSubscription.bundleType) && zq3.c(this.startDate, userSubscription.startDate) && zq3.c(this.endDate, userSubscription.endDate) && zq3.c(this.gracePeriodStartDate, userSubscription.gracePeriodStartDate) && zq3.c(this.gracePeriodEndDate, userSubscription.gracePeriodEndDate) && zq3.c(this.cancellationDate, userSubscription.cancellationDate) && this.isFreeTrial == userSubscription.isFreeTrial && this.hasQueuedSub == userSubscription.hasQueuedSub && this.hasTransactionInProgress == userSubscription.hasTransactionInProgress && zq3.c(this.billingSource, userSubscription.billingSource) && zq3.c(this.promotionTierType, userSubscription.promotionTierType) && zq3.c(this.subscriptionProducts, userSubscription.subscriptionProducts) && zq3.c(this.subscriptionLabels, userSubscription.subscriptionLabels) && this.hasActiveEntitlements == userSubscription.hasActiveEntitlements && zq3.c(this.entitlements, userSubscription.entitlements);
    }

    public final String fullDescription() {
        String str = this.name;
        String name = this.status.name();
        String name2 = this.ownershipStatus.name();
        Date date = this.startDate;
        Date date2 = this.endDate;
        Date date3 = this.gracePeriodEndDate;
        return str + " (" + name + ", " + name2 + ") (" + date + " - " + date2 + ", " + date3 + " - " + date3 + "), trial: " + this.isFreeTrial;
    }

    public final String getBillingSource() {
        return this.billingSource;
    }

    public final String getBundleType() {
        return this.bundleType;
    }

    public final Date getCancellationDate() {
        return this.cancellationDate;
    }

    public final Date getEndDate() {
        return this.endDate;
    }

    public final Set<UserSubscriptionEntitlement> getEntitlements() {
        return this.entitlements;
    }

    public final Date getGracePeriodEndDate() {
        return this.gracePeriodEndDate;
    }

    public final Date getGracePeriodStartDate() {
        return this.gracePeriodStartDate;
    }

    public final boolean getHasActiveEntitlements() {
        return this.hasActiveEntitlements;
    }

    public final boolean getHasQueuedSub() {
        return this.hasQueuedSub;
    }

    public final boolean getHasTransactionInProgress() {
        return this.hasTransactionInProgress;
    }

    public final String getName() {
        return this.name;
    }

    public final UserSubscriptionOwnershipStatus getOwnershipStatus() {
        return this.ownershipStatus;
    }

    public final String getPromotionTierType() {
        return this.promotionTierType;
    }

    public final Date getStartDate() {
        return this.startDate;
    }

    public final UserSubscriptionStatus getStatus() {
        return this.status;
    }

    public final List<String> getSubscriptionLabels() {
        return this.subscriptionLabels;
    }

    public final List<UserSubscriptionProduct> getSubscriptionProducts() {
        return this.subscriptionProducts;
    }

    public final boolean hasActiveEntitlement(UserSubscriptionEntitlement userSubscriptionEntitlement) {
        boolean contains;
        zq3.h(userSubscriptionEntitlement, "entitlement");
        if (this.hasActiveEntitlements) {
            if (userSubscriptionEntitlement instanceof UserSubscriptionEntitlement.e) {
                Set<UserSubscriptionEntitlement> set = this.entitlements;
                ArrayList arrayList = new ArrayList(i.w(set, 10));
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((UserSubscriptionEntitlement) it2.next()).getRawValue());
                }
                contains = arrayList.contains(userSubscriptionEntitlement.getRawValue());
            } else {
                contains = this.entitlements.contains(userSubscriptionEntitlement);
            }
            if (contains) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((this.name.hashCode() * 31) + this.status.hashCode()) * 31) + this.ownershipStatus.hashCode()) * 31) + this.bundleType.hashCode()) * 31;
        Date date = this.startDate;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.endDate;
        int hashCode3 = (hashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.gracePeriodStartDate;
        int hashCode4 = (hashCode3 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.gracePeriodEndDate;
        int hashCode5 = (hashCode4 + (date4 == null ? 0 : date4.hashCode())) * 31;
        Date date5 = this.cancellationDate;
        return ((((((((((((((((((hashCode5 + (date5 != null ? date5.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFreeTrial)) * 31) + Boolean.hashCode(this.hasQueuedSub)) * 31) + Boolean.hashCode(this.hasTransactionInProgress)) * 31) + this.billingSource.hashCode()) * 31) + this.promotionTierType.hashCode()) * 31) + this.subscriptionProducts.hashCode()) * 31) + this.subscriptionLabels.hashCode()) * 31) + Boolean.hashCode(this.hasActiveEntitlements)) * 31) + this.entitlements.hashCode();
    }

    public final boolean isActive() {
        return this.hasActiveEntitlements;
    }

    public final boolean isFreeTrial() {
        return this.isFreeTrial;
    }

    public String toString() {
        return "UserSubscription(" + fullDescription() + ")";
    }
}
