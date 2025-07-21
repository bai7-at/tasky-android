package com.nytimes.android.poisonpill.model;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class PoisonPillModel {
    private final Pill a;
    private int b;
    private Long c;

    public PoisonPillModel(Pill pill, int i, Long l) {
        zq3.h(pill, "pill");
        this.a = pill;
        this.b = i;
        this.c = l;
    }

    public final Long a() {
        return this.c;
    }

    public final Pill b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoisonPillModel)) {
            return false;
        }
        PoisonPillModel poisonPillModel = (PoisonPillModel) obj;
        return zq3.c(this.a, poisonPillModel.a) && this.b == poisonPillModel.b && zq3.c(this.c, poisonPillModel.c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31;
        Long l = this.c;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "PoisonPillModel(pill=" + this.a + ", remainingDismisses=" + this.b + ", lastDismissTimestampSeconds=" + this.c + ")";
    }
}
