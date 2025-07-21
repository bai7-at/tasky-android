package com.nytimes.android.subauth.core.database;

import defpackage.sc8;
import defpackage.wt4;

/* loaded from: classes4.dex */
final class a extends wt4 {
    public a() {
        super(1, 2);
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        sc8Var.B("ALTER TABLE `SkuPurchase` ADD COLUMN `orderId` TEXT DEFAULT NULL");
    }
}
