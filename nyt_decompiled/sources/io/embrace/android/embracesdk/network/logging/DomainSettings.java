package io.embrace.android.embracesdk.network.logging;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class DomainSettings {
    private final int limit;
    private final String suffix;

    /* JADX WARN: Multi-variable type inference failed */
    public DomainSettings() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DomainSettings copy$default(DomainSettings domainSettings, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = domainSettings.limit;
        }
        if ((i2 & 2) != 0) {
            str = domainSettings.suffix;
        }
        return domainSettings.copy(i, str);
    }

    public final int component1() {
        return this.limit;
    }

    public final String component2() {
        return this.suffix;
    }

    public final DomainSettings copy(int i, String str) {
        return new DomainSettings(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DomainSettings)) {
            return false;
        }
        DomainSettings domainSettings = (DomainSettings) obj;
        return this.limit == domainSettings.limit && zq3.c(this.suffix, domainSettings.suffix);
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.limit) * 31;
        String str = this.suffix;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DomainSettings(limit=" + this.limit + ", suffix=" + this.suffix + ")";
    }

    public DomainSettings(int i, String str) {
        this.limit = i;
        this.suffix = str;
    }

    public /* synthetic */ DomainSettings(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
    }
}
