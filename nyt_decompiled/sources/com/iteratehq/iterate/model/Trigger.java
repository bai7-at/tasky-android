package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class Trigger {
    private final TriggerOptions options;

    /* renamed from: type, reason: collision with root package name */
    private final TriggerType f53type;

    public Trigger(TriggerType triggerType, TriggerOptions triggerOptions) {
        zq3.h(triggerType, TransferTable.COLUMN_TYPE);
        zq3.h(triggerOptions, "options");
        this.f53type = triggerType;
        this.options = triggerOptions;
    }

    public static /* synthetic */ Trigger copy$default(Trigger trigger, TriggerType triggerType, TriggerOptions triggerOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            triggerType = trigger.f53type;
        }
        if ((i & 2) != 0) {
            triggerOptions = trigger.options;
        }
        return trigger.copy(triggerType, triggerOptions);
    }

    public final TriggerType component1() {
        return this.f53type;
    }

    public final TriggerOptions component2() {
        return this.options;
    }

    public final Trigger copy(TriggerType triggerType, TriggerOptions triggerOptions) {
        zq3.h(triggerType, TransferTable.COLUMN_TYPE);
        zq3.h(triggerOptions, "options");
        return new Trigger(triggerType, triggerOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Trigger)) {
            return false;
        }
        Trigger trigger = (Trigger) obj;
        return this.f53type == trigger.f53type && zq3.c(this.options, trigger.options);
    }

    public final TriggerOptions getOptions() {
        return this.options;
    }

    public final TriggerType getType() {
        return this.f53type;
    }

    public int hashCode() {
        return (this.f53type.hashCode() * 31) + this.options.hashCode();
    }

    public String toString() {
        return "Trigger(type=" + this.f53type + ", options=" + this.options + ')';
    }
}
