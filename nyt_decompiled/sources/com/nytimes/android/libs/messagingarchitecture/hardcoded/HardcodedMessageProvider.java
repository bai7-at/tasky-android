package com.nytimes.android.libs.messagingarchitecture.hardcoded;

import com.nytimes.android.api.config.model.TextChunk;
import com.nytimes.android.interests.InterestsManager;
import com.nytimes.android.interests.InterestsPreferencesStore;
import com.nytimes.android.libs.messagingarchitecture.model.Message;
import com.nytimes.android.libs.messagingarchitecture.model.MessageProperties;
import com.nytimes.android.utils.AppPreferences;
import defpackage.cb2;
import defpackage.du8;
import defpackage.qs2;
import defpackage.s29;
import defpackage.ww8;
import defpackage.x63;
import defpackage.zq3;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes4.dex */
public final class HardcodedMessageProvider {
    private final cb2 a;
    private final AppPreferences b;
    private final InterestsManager c;

    public HardcodedMessageProvider(cb2 cb2Var, AppPreferences appPreferences, InterestsManager interestsManager) {
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(interestsManager, "interestsManager");
        this.a = cb2Var;
        this.b = appPreferences;
        this.c = interestsManager;
    }

    private final x63 c(final long j) {
        return new x63(new Message("APP_UserSpace_NewInterest", "APP_UserSpace_NewInterest", "APP_UserSpace_NewInterest", 100, "MobileNewsHome", new MessageProperties("tabBarModal", t.n(du8.a("identifier", "you"))), null, 0, new MessageProperties("navigation", t.n(du8.a("destination", "you"))), true, i.e(s29.d(new TextChunk("You have something new in Your Interests.", "normal"))), null, null, "autoAddedInterestMessage", "You have something new in Your Interests."), new qs2() { // from class: com.nytimes.android.libs.messagingarchitecture.hardcoded.HardcodedMessageProvider$buildNewInterestMessage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m591invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m591invoke() {
                AppPreferences appPreferences;
                appPreferences = HardcodedMessageProvider.this.b;
                appPreferences.c("lastSeenNewInterestsMessage", j);
            }
        });
    }

    public final x63 d(String str) {
        Object runBlocking$default;
        zq3.h(str, "unit");
        if (!this.a.v() || !zq3.c(str, "MobileNewsHome")) {
            return null;
        }
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new HardcodedMessageProvider$provideHardcodedMessage$message$lastAutoAddedAt$1(this, null), 1, null);
        long longValue = ((Number) runBlocking$default).longValue();
        AppPreferences appPreferences = this.b;
        InterestsPreferencesStore.a aVar = InterestsPreferencesStore.Companion;
        long k = appPreferences.k("lastSeenNewInterestsMessage", aVar.a());
        long k2 = this.b.k("lastSeenUserInterests", aVar.a());
        if (longValue == k || k2 >= longValue) {
            return null;
        }
        return c(longValue);
    }
}
