package com.nytimes.android.features.notifications.push;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.lifecycle.n;
import androidx.lifecycle.r;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.api.config.model.Channel;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.push.PushClientManager;
import defpackage.jk;
import defpackage.la5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public final class SettingsNotificationsViewModel extends NotificationsViewModel {
    public static final a Companion = new a(null);
    public static final int t = 8;
    private final Application l;
    private final ET2SimpleScope m;
    private final la5 n;
    private final CoroutineDispatcher r;
    private final n s;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsNotificationsViewModel(Application application, FeedStore feedStore, ET2SimpleScope eT2SimpleScope, PushClientManager pushClientManager, la5 la5Var, SharedPreferences sharedPreferences, CoroutineDispatcher coroutineDispatcher, n nVar) {
        super(feedStore, eT2SimpleScope, pushClientManager, sharedPreferences, coroutineDispatcher);
        zq3.h(application, "app");
        zq3.h(feedStore, "feedStore");
        zq3.h(eT2SimpleScope, "et2Scope");
        zq3.h(pushClientManager, "pushClientManager");
        zq3.h(la5Var, "notificationsHelper");
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(nVar, TransferTable.COLUMN_STATE);
        this.l = application;
        this.m = eT2SimpleScope;
        this.n = la5Var;
        this.r = coroutineDispatcher;
        this.s = nVar;
    }

    public final void A() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", this.l.getPackageName());
        intent.putExtra("app_package", this.l.getPackageName());
        intent.addFlags(268435456);
        this.l.startActivity(intent);
    }

    public final void B(jk jkVar) {
        zq3.h(jkVar, "activity");
        x("notification settings");
        jkVar.finish();
    }

    public final boolean C(boolean z) {
        if (!this.s.c("SettingsNotificationsViewModel.key.notifications.permission")) {
            this.s.i("SettingsNotificationsViewModel.key.notifications.permission", Boolean.valueOf(z));
            return false;
        }
        if (zq3.c((Boolean) this.s.d("SettingsNotificationsViewModel.key.notifications.permission"), Boolean.valueOf(z))) {
            return false;
        }
        this.s.i("SettingsNotificationsViewModel.key.notifications.permission", Boolean.valueOf(z));
        return true;
    }

    public final Job D() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), this.r, null, new SettingsNotificationsViewModel$trackPage$1(this, null), 2, null);
        return launch$default;
    }

    @Override // com.nytimes.android.features.notifications.push.NotificationsViewModel
    public boolean r(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        return this.n.b(channel);
    }
}
