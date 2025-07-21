package com.nytimes.android.poisonpill.model;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.Arrays;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class PoisonPillFirebaseRemoteConfig {
    private final Pill[] a;

    public PoisonPillFirebaseRemoteConfig(@bt3(name = "pills") Pill[] pillArr) {
        zq3.h(pillArr, "pills");
        this.a = pillArr;
    }

    public final Pill[] a() {
        return this.a;
    }

    public final PoisonPillFirebaseRemoteConfig copy(@bt3(name = "pills") Pill[] pillArr) {
        zq3.h(pillArr, "pills");
        return new PoisonPillFirebaseRemoteConfig(pillArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zq3.c(PoisonPillFirebaseRemoteConfig.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        zq3.f(obj, "null cannot be cast to non-null type com.nytimes.android.poisonpill.model.PoisonPillFirebaseRemoteConfig");
        return Arrays.equals(this.a, ((PoisonPillFirebaseRemoteConfig) obj).a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        return "PoisonPillFirebaseRemoteConfig(pills=" + Arrays.toString(this.a) + ")";
    }
}
