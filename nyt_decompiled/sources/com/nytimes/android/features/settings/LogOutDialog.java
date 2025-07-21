package com.nytimes.android.features.settings;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;
import androidx.fragment.app.FragmentManager;
import com.nytimes.android.features.settings.LogOutDialog;
import com.nytimes.android.latestfeed.feed.FeedStore;
import defpackage.lk6;
import defpackage.sm6;
import defpackage.vx0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes4.dex */
public final class LogOutDialog extends f {
    public static final a Companion = new a(null);
    public static final int f = 8;
    public com.nytimes.android.entitlements.a ecommClient;
    public FeedStore feedStore;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void h1() {
        getFeedStore().clear();
        BuildersKt__BuildersKt.runBlocking$default(null, new LogOutDialog$logout$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(LogOutDialog logOutDialog, DialogInterface dialogInterface, int i) {
        zq3.h(logOutDialog, "this$0");
        logOutDialog.h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(DialogInterface dialogInterface, int i) {
    }

    public final void F(FragmentManager fragmentManager) {
        zq3.h(fragmentManager, "manager");
        super.show(fragmentManager, "TAG.LogOutDialog");
    }

    public final com.nytimes.android.entitlements.a g1() {
        com.nytimes.android.entitlements.a aVar = this.ecommClient;
        if (aVar != null) {
            return aVar;
        }
        zq3.z("ecommClient");
        return null;
    }

    public final FeedStore getFeedStore() {
        FeedStore feedStore = this.feedStore;
        if (feedStore != null) {
            return feedStore;
        }
        zq3.z("feedStore");
        return null;
    }

    @Override // androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        androidx.appcompat.app.a create = new a.C0012a(new vx0(requireContext(), sm6.AppTheme)).o(lk6.logout).setPositiveButton(lk6.logout, new DialogInterface.OnClickListener() { // from class: n84
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LogOutDialog.i1(LogOutDialog.this, dialogInterface, i);
            }
        }).setNegativeButton(lk6.cancel, new DialogInterface.OnClickListener() { // from class: o84
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LogOutDialog.j1(dialogInterface, i);
            }
        }).create();
        zq3.g(create, "create(...)");
        return create;
    }
}
