package androidx.work.impl;

import defpackage.sc8;
import defpackage.wt4;

/* loaded from: classes.dex */
final class h extends wt4 {
    public h() {
        super(18, 19);
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        sc8Var.B("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
