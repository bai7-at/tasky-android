package androidx.work.impl;

import defpackage.sc8;
import defpackage.wt4;

/* loaded from: classes.dex */
final class k extends wt4 {
    public k() {
        super(22, 23);
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        sc8Var.B("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
