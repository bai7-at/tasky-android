package com.nytimes.android.subauth.devsettings.items;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.nytimes.android.devsettings.common.DevSettingSimpleClipboardItemKt;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscription;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionProduct;
import defpackage.yn1;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class SubauthNYTUserDevSettingFactory {
    public static final SubauthNYTUserDevSettingFactory a = new SubauthNYTUserDevSettingFactory();

    private SubauthNYTUserDevSettingFactory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(UserSubscription userSubscription) {
        StringBuilder sb = new StringBuilder();
        if (userSubscription == null) {
            sb.append("N/A");
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
        } else {
            sb.append("name: " + userSubscription.getName());
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            sb.append("status: " + userSubscription.getStatus());
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            sb.append("ownershipStatus: " + userSubscription.getOwnershipStatus());
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            sb.append("startDate: " + userSubscription.getStartDate());
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            sb.append("endDate: " + userSubscription.getEndDate());
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            sb.append("gracePeriodStartDate: " + userSubscription.getGracePeriodStartDate());
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            sb.append("gracePeriodEndDate: " + userSubscription.getGracePeriodEndDate());
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            sb.append("cancellationDate: " + userSubscription.getCancellationDate());
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            sb.append("hasQueuedSub: " + userSubscription.getHasQueuedSub());
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            sb.append("hasTransactionInProgress: " + userSubscription.getHasTransactionInProgress());
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            sb.append("billingSource: " + userSubscription.getBillingSource());
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            sb.append("promotionTierType: " + userSubscription.getPromotionTierType());
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            List<UserSubscriptionProduct> subscriptionProducts = userSubscription.getSubscriptionProducts();
            ArrayList arrayList = new ArrayList(i.w(subscriptionProducts, 10));
            Iterator<T> it2 = subscriptionProducts.iterator();
            while (it2.hasNext()) {
                arrayList.add(((UserSubscriptionProduct) it2.next()).getRawValue());
            }
            sb.append("subscriptionProducts: " + i.u0(arrayList, ",", null, null, 0, null, null, 62, null));
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            sb.append("subscriptionLabels: " + i.u0(userSubscription.getSubscriptionLabels(), ",", null, null, 0, null, null, 62, null));
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            sb.append("hasActiveEntitlements: " + userSubscription.getHasActiveEntitlements());
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
            Set<UserSubscriptionEntitlement> entitlements = userSubscription.getEntitlements();
            ArrayList arrayList2 = new ArrayList(i.w(entitlements, 10));
            Iterator<T> it3 = entitlements.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((UserSubscriptionEntitlement) it3.next()).getRawValue());
            }
            sb.append("entitlements: " + i.u0(arrayList2, ",", null, null, 0, null, null, 62, null));
            zq3.g(sb, "append(...)");
            sb.append('\n');
            zq3.g(sb, "append(...)");
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d(NYTUser nYTUser) {
        StringBuilder sb = new StringBuilder();
        sb.append("isSignedIn: " + nYTUser.r());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("email: " + nYTUser.d());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("regiId: " + nYTUser.p());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("displayName: " + nYTUser.j());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("name: " + nYTUser.getName());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("username: " + nYTUser.getUsername());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("givenName: " + nYTUser.u());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("familyName: " + nYTUser.f());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("gamesUsername: " + nYTUser.n());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("gamesAvatarIcon: " + nYTUser.m());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("isSubscribed: " + nYTUser.a());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("subscriptionLevel: " + nYTUser.l());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("subscriptionName: " + nYTUser.e());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("subscriptionStartDate: " + nYTUser.q());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("isEntitledForNews: " + nYTUser.c());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("isEntitledForCooking: " + nYTUser.k());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("isEntitledForGames: " + nYTUser.b());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("isEntitledForTheAthletic: " + nYTUser.s());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("isEntitledForWirecutter: " + nYTUser.w());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        sb.append("isEntitledForAudio: " + nYTUser.v());
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        UserSubscription o = nYTUser.o();
        sb.append("activeSubscription: " + (o != null ? o.description() : null));
        zq3.g(sb, "append(...)");
        sb.append('\n');
        zq3.g(sb, "append(...)");
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    public final Set e(NYTUser nYTUser) {
        zq3.h(nYTUser, "user");
        return b0.j(DevSettingSimpleClipboardItemKt.b("NYTUser Description", new SubauthNYTUserDevSettingFactory$subauthNYTUserDevSettings$1(nYTUser, null), null, new yn1.b("Subauth NYTUser - Dev Settings"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, 4, null), DevSettingSimpleClipboardItemKt.b("NYTUser Values", new SubauthNYTUserDevSettingFactory$subauthNYTUserDevSettings$2(nYTUser, null), null, new yn1.b("Subauth NYTUser - Dev Settings"), "2", 4, null), DevSettingSimpleClipboardItemKt.b("NYTUser UserDetails", new SubauthNYTUserDevSettingFactory$subauthNYTUserDevSettings$3(nYTUser, null), null, new yn1.b("Subauth NYTUser - Dev Settings"), "3", 4, null), DevSettingSimpleClipboardItemKt.b("NYTUser ActiveRawSortedEntitlements", new SubauthNYTUserDevSettingFactory$subauthNYTUserDevSettings$4(nYTUser, null), null, new yn1.b("Subauth NYTUser - Dev Settings"), "4", 4, null), DevSettingSimpleClipboardItemKt.b("NYTUser Active Subscription", new SubauthNYTUserDevSettingFactory$subauthNYTUserDevSettings$5(nYTUser, null), null, null, null, 28, null));
    }
}
