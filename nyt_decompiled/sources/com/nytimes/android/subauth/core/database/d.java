package com.nytimes.android.subauth.core.database;

import defpackage.sc8;
import defpackage.wt4;

/* loaded from: classes4.dex */
final class d extends wt4 {
    public d() {
        super(4, 5);
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        sc8Var.B("ALTER TABLE `UserData` ADD COLUMN `name` TEXT DEFAULT NULL");
        sc8Var.B("ALTER TABLE `UserData` ADD COLUMN `givenName` TEXT DEFAULT NULL");
        sc8Var.B("ALTER TABLE `UserData` ADD COLUMN `familyName` TEXT DEFAULT NULL");
        sc8Var.B("ALTER TABLE `UserData` ADD COLUMN `username` TEXT DEFAULT NULL");
    }
}
