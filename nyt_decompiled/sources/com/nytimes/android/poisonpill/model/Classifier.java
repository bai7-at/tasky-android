package com.nytimes.android.poisonpill.model;

import com.facebook.AuthenticationTokenClaims;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class Classifier {
    private final ClassifierType a;
    private final String b;

    public Classifier(ClassifierType classifierType, String str) {
        zq3.h(classifierType, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str, "version");
        this.a = classifierType;
        this.b = str;
    }

    public final ClassifierType a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Classifier)) {
            return false;
        }
        Classifier classifier = (Classifier) obj;
        return this.a == classifier.a && zq3.c(this.b, classifier.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Classifier(name=" + this.a + ", version=" + this.b + ")";
    }
}
