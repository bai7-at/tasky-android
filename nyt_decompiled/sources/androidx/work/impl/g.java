package androidx.work.impl;

import defpackage.sc8;
import defpackage.wt4;

/* loaded from: classes.dex */
final class g extends wt4 {
    public g() {
        super(17, 18);
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        sc8Var.B("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        sc8Var.B("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
