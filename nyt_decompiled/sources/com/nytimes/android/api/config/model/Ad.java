package com.nytimes.android.api.config.model;

import com.nytimes.android.api.config.model.ad.Dfp;
import com.nytimes.android.api.config.model.ad.DfpConfiguration;
import com.nytimes.android.api.config.model.ad.Taxonomy;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class Ad {
    public static final String CDN = "fd8fbe1a04798ea3";
    public static final Companion Companion = new Companion(null);
    private final Dfp dfp;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Ad(Dfp dfp) {
        this.dfp = dfp;
    }

    public static /* synthetic */ Ad copy$default(Ad ad, Dfp dfp, int i, Object obj) {
        if ((i & 1) != 0) {
            dfp = ad.dfp;
        }
        return ad.copy(dfp);
    }

    public final Dfp component1() {
        return this.dfp;
    }

    public final Ad copy(Dfp dfp) {
        return new Ad(dfp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ad) && zq3.c(this.dfp, ((Ad) obj).dfp);
    }

    public final Dfp getDfp() {
        return this.dfp;
    }

    public final DfpConfiguration getDfpConfiguration() {
        Dfp dfp = this.dfp;
        return (dfp == null || dfp.getConfig() == null) ? new DfpConfiguration(null) : this.dfp.getConfig();
    }

    public final Map<String, String> getDfpTaxonomyExceptions() {
        Taxonomy taxonomy;
        Map<String, String> exceptions;
        Dfp dfp = this.dfp;
        Map<String, String> v = (dfp == null || (taxonomy = dfp.getTaxonomy()) == null || (exceptions = taxonomy.getExceptions()) == null) ? null : t.v(exceptions);
        return v == null ? t.i() : v;
    }

    public int hashCode() {
        Dfp dfp = this.dfp;
        if (dfp == null) {
            return 0;
        }
        return dfp.hashCode();
    }

    public String toString() {
        return "Ad(dfp=" + this.dfp + ")";
    }
}
