package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class TriggerOptions {
    private final Integer seconds;

    public TriggerOptions(Integer num) {
        this.seconds = num;
    }

    public static /* synthetic */ TriggerOptions copy$default(TriggerOptions triggerOptions, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = triggerOptions.seconds;
        }
        return triggerOptions.copy(num);
    }

    public final Integer component1() {
        return this.seconds;
    }

    public final TriggerOptions copy(Integer num) {
        return new TriggerOptions(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TriggerOptions) && zq3.c(this.seconds, ((TriggerOptions) obj).seconds);
    }

    public final Integer getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        Integer num = this.seconds;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "TriggerOptions(seconds=" + this.seconds + ')';
    }
}
