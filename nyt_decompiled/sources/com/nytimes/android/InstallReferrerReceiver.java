package com.nytimes.android;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.MultipleInstallBroadcastReceiver;
import com.nytimes.android.InstallReferrerReceiver;
import defpackage.cb2;
import defpackage.qv6;
import io.reactivex.functions.Action;

/* loaded from: classes2.dex */
public class InstallReferrerReceiver extends c {
    cb2 featureFlagUtil;
    qv6 remoteConfig;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, Intent intent) {
        if (this.featureFlagUtil.l()) {
            new MultipleInstallBroadcastReceiver().onReceive(context, intent);
        }
    }

    @Override // com.nytimes.android.c, defpackage.e83, android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        super.onReceive(context, intent);
        this.remoteConfig.e(new Action() { // from class: tl3
            @Override // io.reactivex.functions.Action
            public final void run() {
                InstallReferrerReceiver.this.c(context, intent);
            }
        });
    }
}
