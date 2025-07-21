package androidx.work.impl;

import defpackage.sc8;
import defpackage.wt4;

/* loaded from: classes.dex */
final class j extends wt4 {
    public j() {
        super(20, 21);
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        sc8Var.B("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
