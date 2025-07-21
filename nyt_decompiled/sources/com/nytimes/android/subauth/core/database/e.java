package com.nytimes.android.subauth.core.database;

import defpackage.sc8;
import defpackage.wt4;

/* loaded from: classes4.dex */
final class e extends wt4 {
    public e() {
        super(5, 6);
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        sc8Var.B("ALTER TABLE `UserData` ADD COLUMN `gamesUsername` TEXT DEFAULT NULL");
        sc8Var.B("ALTER TABLE `UserData` ADD COLUMN `gamesAvatarIcon` TEXT DEFAULT NULL");
    }
}
