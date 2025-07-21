package com.nytimes.android.subauth.core.database;

import defpackage.sc8;
import defpackage.wt4;

/* loaded from: classes4.dex */
final class b extends wt4 {
    public b() {
        super(2, 3);
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        sc8Var.B("ALTER TABLE `SkuPurchase` ADD COLUMN `purchaseTime` INTEGER DEFAULT NULL");
        sc8Var.B("ALTER TABLE `SkuPurchase` ADD COLUMN `isAutoRenewing` INTEGER DEFAULT NULL");
        sc8Var.B("ALTER TABLE `SkuPurchase` ADD COLUMN `originalJson` TEXT DEFAULT NULL");
    }
}
