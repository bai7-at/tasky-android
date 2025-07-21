package com.nytimes.android.poisonpill.model;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class Pill {
    private final Classifier a;
    private final int b;
    private final String c;

    public Pill(Classifier classifier, int i, String str) {
        zq3.h(classifier, "classifier");
        this.a = classifier;
        this.b = i;
        this.c = str;
    }

    public final int a() {
        return this.b;
    }

    public final Classifier b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pill)) {
            return false;
        }
        Pill pill = (Pill) obj;
        return zq3.c(this.a, pill.a) && this.b == pill.b && zq3.c(this.c, pill.c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Pill(classifier=" + this.a + ", allowedDismisses=" + this.b + ", copy=" + this.c + ")";
    }
}
