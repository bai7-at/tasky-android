package com.nytimes.android.widget;

import android.content.DialogInterface;
import androidx.appcompat.app.a;
import com.nytimes.android.widget.ForcedLogoutAlert;
import defpackage.e44;
import defpackage.jk;
import defpackage.lk6;
import defpackage.ml6;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class ForcedLogoutAlert {
    public static final int $stable = 8;
    private final jk activity;
    private a alertDialog;
    private final com.nytimes.android.entitlements.a eCommClient;

    public ForcedLogoutAlert(jk jkVar, com.nytimes.android.entitlements.a aVar) {
        zq3.h(jkVar, "activity");
        zq3.h(aVar, "eCommClient");
        this.activity = jkVar;
        this.eCommClient = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displayForcedLogoutAlert$lambda$0(ForcedLogoutAlert forcedLogoutAlert, DialogInterface dialogInterface, int i) {
        zq3.h(forcedLogoutAlert, "this$0");
        forcedLogoutAlert.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displayForcedLogoutAlert$lambda$1(ForcedLogoutAlert forcedLogoutAlert, DialogInterface dialogInterface, int i) {
        zq3.h(forcedLogoutAlert, "this$0");
        forcedLogoutAlert.dismiss();
        BuildersKt__Builders_commonKt.launch$default(e44.a(forcedLogoutAlert.activity), null, null, new ForcedLogoutAlert$displayForcedLogoutAlert$2$1(forcedLogoutAlert, null), 3, null);
    }

    public final void dismiss() {
        a aVar = this.alertDialog;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public final void displayForcedLogoutAlert(Integer num) {
        a create = new a.C0012a(this.activity).o(ml6.forced_logout_title).e((num != null && num.intValue() == 400) ? ml6.forced_logout_password_changed : ml6.forced_logout_account_locked).b(false).setNegativeButton(lk6.cancel, new DialogInterface.OnClickListener() { // from class: uo2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ForcedLogoutAlert.displayForcedLogoutAlert$lambda$0(ForcedLogoutAlert.this, dialogInterface, i);
            }
        }).setPositiveButton(lk6.login, new DialogInterface.OnClickListener() { // from class: vo2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ForcedLogoutAlert.displayForcedLogoutAlert$lambda$1(ForcedLogoutAlert.this, dialogInterface, i);
            }
        }).create();
        this.alertDialog = create;
        if (create != null) {
            create.show();
        }
    }
}
