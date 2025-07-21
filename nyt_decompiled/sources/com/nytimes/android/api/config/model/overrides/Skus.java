package com.nytimes.android.api.config.model.overrides;

import com.google.gson.annotations.SerializedName;
import defpackage.zq3;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class Skus {

    @SerializedName("current")
    private final List<List<StoreOverride>> currentSkus;

    @SerializedName("nytp")
    private final Set<String> nytPremierSkus;

    @SerializedName("nyt")
    private final Set<String> nytSkus;

    @SerializedName("previous")
    private final Set<String> previousSkus;

    public Skus() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Skus copy$default(Skus skus, Set set, List list, Set set2, Set set3, int i, Object obj) {
        if ((i & 1) != 0) {
            set = skus.previousSkus;
        }
        if ((i & 2) != 0) {
            list = skus.currentSkus;
        }
        if ((i & 4) != 0) {
            set2 = skus.nytSkus;
        }
        if ((i & 8) != 0) {
            set3 = skus.nytPremierSkus;
        }
        return skus.copy(set, list, set2, set3);
    }

    public final Set<String> component1() {
        return this.previousSkus;
    }

    public final List<List<StoreOverride>> component2() {
        return this.currentSkus;
    }

    public final Set<String> component3() {
        return this.nytSkus;
    }

    public final Set<String> component4() {
        return this.nytPremierSkus;
    }

    public final Skus copy(Set<String> set, List<? extends List<StoreOverride>> list, Set<String> set2, Set<String> set3) {
        return new Skus(set, list, set2, set3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Skus)) {
            return false;
        }
        Skus skus = (Skus) obj;
        return zq3.c(this.previousSkus, skus.previousSkus) && zq3.c(this.currentSkus, skus.currentSkus) && zq3.c(this.nytSkus, skus.nytSkus) && zq3.c(this.nytPremierSkus, skus.nytPremierSkus);
    }

    public final List<List<StoreOverride>> getCurrentSkus() {
        return this.currentSkus;
    }

    public final Set<String> getNytPremierSkus() {
        return this.nytPremierSkus;
    }

    public final Set<String> getNytSkus() {
        return this.nytSkus;
    }

    public final Set<String> getPreviousSkus() {
        return this.previousSkus;
    }

    public int hashCode() {
        Set<String> set = this.previousSkus;
        int hashCode = (set == null ? 0 : set.hashCode()) * 31;
        List<List<StoreOverride>> list = this.currentSkus;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Set<String> set2 = this.nytSkus;
        int hashCode3 = (hashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set<String> set3 = this.nytPremierSkus;
        return hashCode3 + (set3 != null ? set3.hashCode() : 0);
    }

    public String toString() {
        return "Skus(previousSkus=" + this.previousSkus + ", currentSkus=" + this.currentSkus + ", nytSkus=" + this.nytSkus + ", nytPremierSkus=" + this.nytPremierSkus + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Skus(Set<String> set, List<? extends List<StoreOverride>> list, Set<String> set2, Set<String> set3) {
        this.previousSkus = set;
        this.currentSkus = list;
        this.nytSkus = set2;
        this.nytPremierSkus = set3;
    }

    public /* synthetic */ Skus(Set set, List list, Set set2, Set set3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : set, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : set2, (i & 8) != 0 ? null : set3);
    }
}
