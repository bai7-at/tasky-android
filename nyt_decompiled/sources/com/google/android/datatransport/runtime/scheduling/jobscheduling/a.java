package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import defpackage.ul0;
import java.util.Map;

/* loaded from: classes2.dex */
final class a extends SchedulerConfig {
    private final ul0 a;
    private final Map b;

    a(ul0 ul0Var, Map map) {
        if (ul0Var == null) {
            throw new NullPointerException("Null clock");
        }
        this.a = ul0Var;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    ul0 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.a.equals(schedulerConfig.e()) && this.b.equals(schedulerConfig.h());
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    Map h() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
