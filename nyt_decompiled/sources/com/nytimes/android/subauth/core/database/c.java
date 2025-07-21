package com.nytimes.android.subauth.core.database;

import com.nytimes.android.subauth.core.database.SubauthDatabase;
import defpackage.c00;
import defpackage.sc8;
import defpackage.wt4;

/* loaded from: classes4.dex */
final class c extends wt4 {
    private final c00 callback;

    public c() {
        super(3, 4);
        this.callback = new SubauthDatabase.a();
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        sc8Var.B("CREATE TABLE IF NOT EXISTS `UserData` (`userId` INTEGER NOT NULL, `subscriptions` TEXT NOT NULL, `regiId` TEXT, `email` TEXT, `displayName` TEXT, `entitlements` TEXT NOT NULL, `provisionalExpirationDate` INTEGER, PRIMARY KEY(`userId`))");
        this.callback.a(sc8Var);
    }
}
