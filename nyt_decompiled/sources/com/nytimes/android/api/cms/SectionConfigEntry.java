package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class SectionConfigEntry {
    public static final Companion Companion = new Companion(null);
    private static final String ENT_PREMIER = "TPR";

    @SerializedName("entitlement")
    private final List<String> entitlement;
    private final boolean isAlwaysDefault;

    @SerializedName("defaultSection")
    private final boolean isDefaultSection;

    @SerializedName("rank")
    private Integer rank;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SectionConfigEntry(Integer num, boolean z, boolean z2, List<String> list) {
        this.rank = num;
        this.isDefaultSection = z;
        this.isAlwaysDefault = z2;
        this.entitlement = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionConfigEntry copy$default(SectionConfigEntry sectionConfigEntry, Integer num, boolean z, boolean z2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = sectionConfigEntry.rank;
        }
        if ((i & 2) != 0) {
            z = sectionConfigEntry.isDefaultSection;
        }
        if ((i & 4) != 0) {
            z2 = sectionConfigEntry.isAlwaysDefault;
        }
        if ((i & 8) != 0) {
            list = sectionConfigEntry.entitlement;
        }
        return sectionConfigEntry.copy(num, z, z2, list);
    }

    public final Integer component1() {
        return this.rank;
    }

    public final boolean component2() {
        return this.isDefaultSection;
    }

    public final boolean component3() {
        return this.isAlwaysDefault;
    }

    public final List<String> component4() {
        return this.entitlement;
    }

    public final SectionConfigEntry copy(Integer num, boolean z, boolean z2, List<String> list) {
        return new SectionConfigEntry(num, z, z2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionConfigEntry)) {
            return false;
        }
        SectionConfigEntry sectionConfigEntry = (SectionConfigEntry) obj;
        return zq3.c(this.rank, sectionConfigEntry.rank) && this.isDefaultSection == sectionConfigEntry.isDefaultSection && this.isAlwaysDefault == sectionConfigEntry.isAlwaysDefault && zq3.c(this.entitlement, sectionConfigEntry.entitlement);
    }

    public final List<String> getEntitlement() {
        return this.entitlement;
    }

    public final Integer getRank() {
        return this.rank;
    }

    public int hashCode() {
        Integer num = this.rank;
        int hashCode = (((((num == null ? 0 : num.hashCode()) * 31) + Boolean.hashCode(this.isDefaultSection)) * 31) + Boolean.hashCode(this.isAlwaysDefault)) * 31;
        List<String> list = this.entitlement;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final boolean isAlwaysDefault() {
        return this.isAlwaysDefault;
    }

    public final boolean isDefaultSection() {
        return this.isDefaultSection;
    }

    public final boolean isPremier() {
        List<String> list = this.entitlement;
        return list != null && list.contains(ENT_PREMIER);
    }

    public final void setRank(Integer num) {
        this.rank = num;
    }

    public String toString() {
        return "SectionConfigEntry(rank=" + this.rank + ", isDefaultSection=" + this.isDefaultSection + ", isAlwaysDefault=" + this.isAlwaysDefault + ", entitlement=" + this.entitlement + ")";
    }
}
