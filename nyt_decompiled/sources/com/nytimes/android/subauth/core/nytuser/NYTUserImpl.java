package com.nytimes.android.subauth.core.nytuser;

import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.client.SubscriptionLevel;
import com.nytimes.android.subauth.core.api.listeners.NYTUserUpdateSource;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.database.userdata.UserData;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscription;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionProduct;
import defpackage.f88;
import defpackage.h15;
import defpackage.rz8;
import defpackage.ul8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class NYTUserImpl implements NYTUser {
    public static final a Companion = new a(null);
    private final UserSubscriptionProduct a;
    private final SubauthListenerManager b;
    private h15 c;
    private final CoroutineScope d;
    private Job e;
    private final MutableSharedFlow f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public NYTUserImpl(UserSubscriptionProduct userSubscriptionProduct, UserData userData, f88 f88Var, SubauthListenerManager subauthListenerManager, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(userSubscriptionProduct, "clientAppSubscriptionProduct");
        zq3.h(userData, "initialUser");
        zq3.h(f88Var, "subauthNYTUserDevSettingsOverrides");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        this.a = userSubscriptionProduct;
        this.b = subauthListenerManager;
        this.c = new h15(userSubscriptionProduct, userSubscriptionProduct.getMatchingEntitlement(), userData, f88Var);
        this.d = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.f = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
    }

    private final boolean A(UserData userData) {
        return this.c.b() != userData.isSignedIn();
    }

    private final void C(boolean z) {
        Job launch$default;
        Job job = this.e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.e = null;
        Date provisionalExpirationDate = this.c.a().getGooglePlayData().getProvisionalExpirationDate();
        Long valueOf = provisionalExpirationDate != null ? Long.valueOf(provisionalExpirationDate.getTime()) : null;
        if (valueOf == null || System.currentTimeMillis() >= valueOf.longValue()) {
            if (z) {
                this.b.b();
            }
        } else {
            this.b.I(provisionalExpirationDate);
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new NYTUserImpl$setupProvisionalExpirationUpdate$1(valueOf, this, null), 3, null);
            this.e = launch$default;
        }
    }

    private final boolean y(UserData userData) {
        Set<UserSubscriptionEntitlement> activeLinkedEntitlements = t().getActiveLinkedEntitlements();
        ArrayList arrayList = new ArrayList(i.w(activeLinkedEntitlements, 10));
        Iterator<T> it2 = activeLinkedEntitlements.iterator();
        while (it2.hasNext()) {
            arrayList.add(((UserSubscriptionEntitlement) it2.next()).getRawValue());
        }
        Set c1 = i.c1(arrayList);
        Set<UserSubscriptionEntitlement> activeLinkedEntitlements2 = userData.getActiveLinkedEntitlements();
        ArrayList arrayList2 = new ArrayList(i.w(activeLinkedEntitlements2, 10));
        Iterator<T> it3 = activeLinkedEntitlements2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((UserSubscriptionEntitlement) it3.next()).getRawValue());
        }
        return !zq3.c(c1, i.c1(arrayList2));
    }

    private final boolean z(UserData userData) {
        Set<UserSubscriptionEntitlement> entitlements = t().getGooglePlayData().getEntitlements();
        ArrayList arrayList = new ArrayList(i.w(entitlements, 10));
        Iterator<T> it2 = entitlements.iterator();
        while (it2.hasNext()) {
            arrayList.add(((UserSubscriptionEntitlement) it2.next()).getRawValue());
        }
        Set c1 = i.c1(arrayList);
        Set<UserSubscriptionEntitlement> entitlements2 = userData.getGooglePlayData().getEntitlements();
        ArrayList arrayList2 = new ArrayList(i.w(entitlements2, 10));
        Iterator<T> it3 = entitlements2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((UserSubscriptionEntitlement) it3.next()).getRawValue());
        }
        return !zq3.c(c1, i.c1(arrayList2));
    }

    public boolean B(UserSubscriptionEntitlement userSubscriptionEntitlement) {
        zq3.h(userSubscriptionEntitlement, "entitlement");
        return this.c.a().hasActiveEntitlement(userSubscriptionEntitlement);
    }

    public final void D(UserData userData, boolean z, NYTUserUpdateSource nYTUserUpdateSource) {
        zq3.h(userData, "newUser");
        zq3.h(nYTUserUpdateSource, "updateSource");
        if (zq3.c(userData, this.c.a()) && !z) {
            this.b.w();
            return;
        }
        ul8.a.z("SUBAUTH").a("Updating NYTUser with UserData: " + userData, new Object[0]);
        boolean A = A(userData);
        boolean z2 = y(userData) || z(userData);
        boolean z3 = this.c.a().getGooglePlayData().getProvisionalExpirationDate() != null;
        this.c.f(userData);
        this.b.P(this, nYTUserUpdateSource);
        NYTUser.StateChangeType stateChangeType = (A && z2) ? NYTUser.StateChangeType.LOGIN_STATUS_AND_ENTITLEMENTS_CHANGED : A ? NYTUser.StateChangeType.LOGIN_STATUS_CHANGED : z2 ? NYTUser.StateChangeType.ENTITLEMENTS_CHANGED : null;
        if (stateChangeType != null) {
            this.f.tryEmit(stateChangeType);
            this.b.z(stateChangeType, this);
        }
        C(z3);
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public boolean a() {
        return this.c.c();
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public boolean b() {
        return B(UserSubscriptionEntitlement.f.INSTANCE);
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public boolean c() {
        return B(UserSubscriptionEntitlement.g.INSTANCE);
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public String d() {
        return this.c.a().email();
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public String e() {
        UserSubscription o = o();
        if (o != null) {
            return o.getName();
        }
        return null;
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public String f() {
        return this.c.a().familyName();
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public String g() {
        return this.c.a().description();
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public String getName() {
        return this.c.a().name();
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public String getUsername() {
        return this.c.a().username();
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public SharedFlow h() {
        return FlowKt.asSharedFlow(this.f);
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public List i() {
        Set<UserSubscriptionEntitlement> activeEntitlements = this.c.a().getActiveEntitlements();
        ArrayList arrayList = new ArrayList(i.w(activeEntitlements, 10));
        Iterator<T> it2 = activeEntitlements.iterator();
        while (it2.hasNext()) {
            arrayList.add(((UserSubscriptionEntitlement) it2.next()).getRawValue());
        }
        return i.M0(arrayList);
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public String j() {
        return this.c.a().displayName();
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public boolean k() {
        return B(UserSubscriptionEntitlement.d.INSTANCE);
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public SubscriptionLevel l() {
        boolean b = this.c.b();
        boolean c = this.c.c();
        return (b && c && this.c.d()) ? SubscriptionLevel.REGISTERED_SUBSCRIBED_LINKED : (b && c) ? SubscriptionLevel.REGISTERED_SUBSCRIBED_UNLINKED : (!b || c) ? (b || !c) ? SubscriptionLevel.ANONYMOUS : SubscriptionLevel.ANONYMOUSLY_SUBSCRIBED : SubscriptionLevel.REGISTERED;
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public String m() {
        return this.c.a().gamesAvatarIcon();
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public String n() {
        return this.c.a().gamesUsername();
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public UserSubscription o() {
        return this.c.a().activeLinkedSubscription(this.a);
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public String p() {
        return this.c.a().regiId();
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public Date q() {
        UserSubscription o = o();
        if (o != null) {
            return o.getStartDate();
        }
        return null;
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public boolean r() {
        return this.c.b();
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public boolean s() {
        return B(UserSubscriptionEntitlement.b.INSTANCE);
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public UserData t() {
        return this.c.a();
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public String u() {
        return this.c.a().givenName();
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public boolean v() {
        return B(UserSubscriptionEntitlement.c.INSTANCE);
    }

    @Override // com.nytimes.android.subauth.core.api.client.NYTUser
    public boolean w() {
        return B(UserSubscriptionEntitlement.o.INSTANCE);
    }

    public /* synthetic */ NYTUserImpl(UserSubscriptionProduct userSubscriptionProduct, UserData userData, f88 f88Var, SubauthListenerManager subauthListenerManager, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSubscriptionProduct, (i & 2) != 0 ? rz8.a() : userData, f88Var, subauthListenerManager, (i & 16) != 0 ? Dispatchers.getDefault() : coroutineDispatcher);
    }
}
