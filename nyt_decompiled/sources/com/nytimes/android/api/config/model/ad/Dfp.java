package com.nytimes.android.api.config.model.ad;

import defpackage.zq3;

/* loaded from: classes3.dex */
public final class Dfp {
    private final DfpConfiguration config;
    private final Taxonomy taxonomy;

    public Dfp(Taxonomy taxonomy, DfpConfiguration dfpConfiguration) {
        this.taxonomy = taxonomy;
        this.config = dfpConfiguration;
    }

    public static /* synthetic */ Dfp copy$default(Dfp dfp, Taxonomy taxonomy, DfpConfiguration dfpConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            taxonomy = dfp.taxonomy;
        }
        if ((i & 2) != 0) {
            dfpConfiguration = dfp.config;
        }
        return dfp.copy(taxonomy, dfpConfiguration);
    }

    public final Taxonomy component1() {
        return this.taxonomy;
    }

    public final DfpConfiguration component2() {
        return this.config;
    }

    public final Dfp copy(Taxonomy taxonomy, DfpConfiguration dfpConfiguration) {
        return new Dfp(taxonomy, dfpConfiguration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dfp)) {
            return false;
        }
        Dfp dfp = (Dfp) obj;
        return zq3.c(this.taxonomy, dfp.taxonomy) && zq3.c(this.config, dfp.config);
    }

    public final DfpConfiguration getConfig() {
        return this.config;
    }

    public final Taxonomy getTaxonomy() {
        return this.taxonomy;
    }

    public int hashCode() {
        Taxonomy taxonomy = this.taxonomy;
        int hashCode = (taxonomy == null ? 0 : taxonomy.hashCode()) * 31;
        DfpConfiguration dfpConfiguration = this.config;
        return hashCode + (dfpConfiguration != null ? dfpConfiguration.hashCode() : 0);
    }

    public String toString() {
        return "Dfp(taxonomy=" + this.taxonomy + ", config=" + this.config + ")";
    }
}
