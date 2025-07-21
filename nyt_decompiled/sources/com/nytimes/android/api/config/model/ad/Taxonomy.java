package com.nytimes.android.api.config.model.ad;

import defpackage.zq3;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Taxonomy {
    private final Map<String, String> exceptions;

    public Taxonomy(Map<String, String> map) {
        this.exceptions = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Taxonomy copy$default(Taxonomy taxonomy, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = taxonomy.exceptions;
        }
        return taxonomy.copy(map);
    }

    public final Map<String, String> component1() {
        return this.exceptions;
    }

    public final Taxonomy copy(Map<String, String> map) {
        return new Taxonomy(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Taxonomy) && zq3.c(this.exceptions, ((Taxonomy) obj).exceptions);
    }

    public final Map<String, String> getExceptions() {
        return this.exceptions;
    }

    public int hashCode() {
        Map<String, String> map = this.exceptions;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return "Taxonomy(exceptions=" + this.exceptions + ")";
    }
}
