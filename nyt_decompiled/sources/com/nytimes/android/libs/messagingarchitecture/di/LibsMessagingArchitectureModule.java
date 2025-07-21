package com.nytimes.android.libs.messagingarchitecture.di;

import android.app.Application;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.devsettings.common.DevSettingLazySummaryItem;
import com.nytimes.android.devsettings.common.DevSettingSimpleItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import com.nytimes.android.libs.messagingarchitecture.betasettings.EntitlementOption;
import com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore;
import com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater;
import com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageHistoryStorage;
import com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage;
import com.nytimes.android.libs.messagingarchitecture.db.MessagingArchitectureDatabase;
import com.nytimes.android.libs.messagingarchitecture.db.OmaMessageHistoryStorage;
import com.nytimes.android.libs.messagingarchitecture.network.GraphQlMessageFetcher;
import com.nytimes.android.libs.messagingarchitecture.network.local.OMAApiService;
import defpackage.b34;
import defpackage.b4;
import defpackage.cb2;
import defpackage.cr4;
import defpackage.er4;
import defpackage.gr4;
import defpackage.js4;
import defpackage.kr4;
import defpackage.qg0;
import defpackage.wn1;
import defpackage.xr4;
import defpackage.yc8;
import defpackage.yn1;
import defpackage.zd5;
import defpackage.zq3;
import defpackage.zr4;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public interface LibsMessagingArchitectureModule {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public final b34 a(MessagingArchitectureDatabase messagingArchitectureDatabase) {
            zq3.h(messagingArchitectureDatabase, "db");
            return messagingArchitectureDatabase.f();
        }

        public final cr4 b(MessagingArchitectureDatabase messagingArchitectureDatabase) {
            zq3.h(messagingArchitectureDatabase, "db");
            return messagingArchitectureDatabase.h();
        }

        public final b4 c(MessagingArchitectureDatabase messagingArchitectureDatabase) {
            zq3.h(messagingArchitectureDatabase, "db");
            return messagingArchitectureDatabase.d();
        }

        public final MessagingArchitectureDatabase d(Application application) {
            zq3.h(application, "app");
            return MessagingArchitectureDatabase.Companion.a(application);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final wn1 e(xr4 xr4Var, MessageQueueUpdater messageQueueUpdater, MessagePreferencesStore messagePreferencesStore) {
            DevSettingSwitchItem a2;
            DevSettingSwitchItem a3;
            DevSettingSwitchItem a4;
            DevSettingSwitchItem a5;
            DevSettingSwitchItem a6;
            DevSettingSwitchItem a7;
            zq3.h(xr4Var, "messageQueue");
            zq3.h(messageQueueUpdater, "messageQueueUpdater");
            zq3.h(messagePreferencesStore, "messagePreferences");
            a2 = DevSettingSwitchItemKt.a("Enable Messaging Architecture", (r23 & 2) != 0 ? null : "Use Messaging Queue to display all tooltips and messages", (r23 & 4) != 0 ? null : "Display tooltips and messages without a queue", "messages.architecture.feature", (r23 & 16) != 0 ? false : true, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Enable Messaging Architecture" : null, (r23 & 512) != 0 ? null : null);
            DevSettingSimpleItem devSettingSimpleItem = new DevSettingSimpleItem("Refresh message list", "Force the message list to refresh now (will reset any local message overrides)", new LibsMessagingArchitectureModule$Companion$provideDevSettingItem$1(messagePreferencesStore, messageQueueUpdater, null), null, null, null, null, false, 248, null);
            DevSettingUI devSettingUI = null;
            DevSettingLazySummaryItem devSettingLazySummaryItem = new DevSettingLazySummaryItem("Message appearance time", new LibsMessagingArchitectureModule$Companion$provideDevSettingItem$2(xr4Var, null), null, null, devSettingUI, null, null, null, false, false, 1020, null);
            DevSettingSimpleItem devSettingSimpleItem2 = new DevSettingSimpleItem("Message queue", "See the available list of next messages", new LibsMessagingArchitectureModule$Companion$provideDevSettingItem$3(null), null, null, null, null, false, 248, null);
            DevSettingSimpleItem devSettingSimpleItem3 = new DevSettingSimpleItem("Override message data (OMA)", "Edit and override the available list of next messages", new LibsMessagingArchitectureModule$Companion$provideDevSettingItem$4(null), 0 == true ? 1 : 0, devSettingUI, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 248, null);
            int i = 248;
            DefaultConstructorMarker defaultConstructorMarker = null;
            DevSettingUI devSettingUI2 = null;
            DevSettingUI devSettingUI3 = null;
            boolean z = false;
            DevSettingSimpleItem devSettingSimpleItem4 = new DevSettingSimpleItem("Message history (OMA)", "See and clear the OMA Message history", new LibsMessagingArchitectureModule$Companion$provideDevSettingItem$5(null), devSettingUI2, devSettingUI3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, i, defaultConstructorMarker);
            a3 = DevSettingSwitchItemKt.a("Show messages immediately", (r23 & 2) != 0 ? null : "Messages will not respect the cool down period", (r23 & 4) != 0 ? null : "Messages will not trigger until cool down expires", "messages.cooldown.override", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Show messages immediately" : null, (r23 & 512) != 0 ? null : null);
            a4 = DevSettingSwitchItemKt.a("Mark messages as read", (r23 & 2) != 0 ? null : "Once messages are marked as read, they will not be shown again", (r23 & 4) != 0 ? null : "Message queue will not be affected. Every run of the app will display all the messages from the first one", "messages.read.override", (r23 & 16) != 0 ? false : true, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Mark messages as read" : null, (r23 & 512) != 0 ? null : null);
            a5 = DevSettingSwitchItemKt.a("Load Messages Locally from OMA", (r23 & 2) != 0 ? null : "Messages will load from a local instance of OMA", (r23 & 4) != 0 ? null : "Messages will load from remote", "messages.architecture.OMA.local", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Load Messages Locally from OMA" : null, (r23 & 512) != 0 ? null : null);
            a6 = DevSettingSwitchItemKt.a("Override Messaging Abra Data", (r23 & 2) != 0 ? null : "Messages will appear according to Abra overrides from Dev Settings", (r23 & 4) != 0 ? null : "Messages will appear according to the current user's Abra data", "messages.enable.abra.override", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : true, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Override Messaging Abra Data" : null, (r23 & 512) != 0 ? null : null);
            a7 = DevSettingSwitchItemKt.a("Override Messaging Entitlements", (r23 & 2) != 0 ? null : "Messages will appear according to entitlements enabled below", (r23 & 4) != 0 ? null : "Messages will appear according to the current user's entitlements", "messages.enable.entitlements.override", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : true, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Override Messaging Entitlements" : null, (r23 & 512) != 0 ? null : null);
            DevSettingUI devSettingUI4 = null;
            DevSettingUI devSettingUI5 = null;
            boolean z2 = false;
            int i2 = 248;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            return new DevSettingGroupExpandable("Messaging Architecture", kotlin.collections.i.o(a2, devSettingSimpleItem, devSettingLazySummaryItem, devSettingSimpleItem2, devSettingSimpleItem3, devSettingSimpleItem4, a3, a4, a5, a6, a7, new DevSettingChoiceListPreferenceItem("Debug Messaging Entitlements", "messages.entitlements.override", kotlin.collections.d.C0(EntitlementOption.values()), null, null, null, null, false, false, 504, null).i(), new DevSettingSimpleItem("Message history (Legacy)", "See and clear the Legacy Message history", new LibsMessagingArchitectureModule$Companion$provideDevSettingItem$6(null), devSettingUI4, devSettingUI5, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z2, i2, defaultConstructorMarker2), new DevSettingSimpleItem("Actions history (Legacy)", "See and clear the Actions history", new LibsMessagingArchitectureModule$Companion$provideDevSettingItem$7(null), devSettingUI2, devSettingUI3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, i, defaultConstructorMarker), new DevSettingSimpleItem("New message (Legacy)", "Create a new message, locally.", new LibsMessagingArchitectureModule$Companion$provideDevSettingItem$8(null), devSettingUI4, devSettingUI5, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z2, i2, defaultConstructorMarker2)), null, false, yn1.a.b, null, false, false, 236, null);
        }

        public final gr4 f(MessagingArchitectureDatabase messagingArchitectureDatabase) {
            zq3.h(messagingArchitectureDatabase, "db");
            return messagingArchitectureDatabase.g();
        }

        public final OMAApiService g(Retrofit.Builder builder) {
            zq3.h(builder, "retrofitBuilder");
            Object create = builder.baseUrl("http://localhost:8085").build().create(OMAApiService.class);
            zq3.g(create, "create(...)");
            return (OMAApiService) create;
        }

        public final er4 h(GraphQlMessageFetcher graphQlMessageFetcher) {
            zq3.h(graphQlMessageFetcher, "fetcher");
            return graphQlMessageFetcher;
        }

        public final qg0 i(MessagingArchitectureDatabase messagingArchitectureDatabase) {
            zq3.h(messagingArchitectureDatabase, "db");
            return messagingArchitectureDatabase.e();
        }

        public final kr4 j(cb2 cb2Var, qg0 qg0Var, gr4 gr4Var, cr4 cr4Var) {
            zq3.h(cb2Var, "featureFlagUtil");
            zq3.h(qg0Var, "cachedMessageHistoryDao");
            zq3.h(gr4Var, "messageHistoryDao");
            zq3.h(cr4Var, "omaMessageDao");
            return cb2Var.z() ? new OmaMessageHistoryStorage(qg0Var, cr4Var) : new LegacyMessageHistoryStorage(gr4Var);
        }

        public final zr4 k(cr4 cr4Var, b34 b34Var, cb2 cb2Var, gr4 gr4Var, b4 b4Var, AbraManager abraManager, js4 js4Var) {
            zq3.h(cr4Var, "omaMessageDao");
            zq3.h(b34Var, "legacyMessageDao");
            zq3.h(cb2Var, "featureFlagUtil");
            zq3.h(gr4Var, "historyDao");
            zq3.h(b4Var, "actionHistoryDao");
            zq3.h(abraManager, "abraManager");
            zq3.h(js4Var, "currentUserState");
            return cb2Var.z() ? new zd5(cr4Var) : new LegacyMessageStorage(b34Var, cb2Var, gr4Var, b4Var, abraManager, js4Var);
        }

        public final yc8 l() {
            return new yc8(b0.j("MobileNewsHome", "MobileNewsArticle"));
        }
    }
}
