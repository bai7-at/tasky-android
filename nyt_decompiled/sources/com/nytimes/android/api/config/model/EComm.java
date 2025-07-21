package com.nytimes.android.api.config.model;

import com.nytimes.android.api.config.model.overrides.Skus;
import com.nytimes.android.api.config.model.overrides.StoreOverride;
import defpackage.zq3;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class EComm {
    private final boolean killSmartLock;
    private final Skus skus;

    /* JADX WARN: Multi-variable type inference failed */
    public EComm() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EComm copy$default(EComm eComm, Skus skus, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            skus = eComm.skus;
        }
        if ((i & 2) != 0) {
            z = eComm.killSmartLock;
        }
        return eComm.copy(skus, z);
    }

    public final Skus component1() {
        return this.skus;
    }

    public final boolean component2() {
        return this.killSmartLock;
    }

    public final EComm copy(Skus skus, boolean z) {
        return new EComm(skus, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EComm)) {
            return false;
        }
        EComm eComm = (EComm) obj;
        return zq3.c(this.skus, eComm.skus) && this.killSmartLock == eComm.killSmartLock;
    }

    public final List<StoreOverride> getCurrentSkus(Integer num) {
        List<List<StoreOverride>> currentSkus;
        Skus skus = this.skus;
        if (skus != null && (currentSkus = skus.getCurrentSkus()) != null) {
            List<StoreOverride> list = currentSkus.get(num != null ? num.intValue() : 0);
            if (list != null) {
                return list;
            }
        }
        return i.l();
    }

    public final boolean getKillSmartLock() {
        return this.killSmartLock;
    }

    public final Set<String> getNytPremierSkus() {
        Set<String> nytPremierSkus;
        Skus skus = this.skus;
        return (skus == null || (nytPremierSkus = skus.getNytPremierSkus()) == null) ? b0.e() : nytPremierSkus;
    }

    public final Set<String> getNytSkus() {
        Set<String> nytSkus;
        Skus skus = this.skus;
        return (skus == null || (nytSkus = skus.getNytSkus()) == null) ? b0.e() : nytSkus;
    }

    public final Set<String> getPreviousSkus() {
        Set<String> previousSkus;
        Skus skus = this.skus;
        return (skus == null || (previousSkus = skus.getPreviousSkus()) == null) ? b0.e() : previousSkus;
    }

    public final Skus getSkus() {
        return this.skus;
    }

    public int hashCode() {
        Skus skus = this.skus;
        return ((skus == null ? 0 : skus.hashCode()) * 31) + Boolean.hashCode(this.killSmartLock);
    }

    public String toString() {
        return "EComm(skus=" + this.skus + ", killSmartLock=" + this.killSmartLock + ")";
    }

    public EComm(Skus skus, boolean z) {
        this.skus = skus;
        this.killSmartLock = z;
    }

    public /* synthetic */ EComm(Skus skus, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : skus, (i & 2) != 0 ? false : z);
    }
}
