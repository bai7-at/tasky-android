package com.nytimes.android.libs.messagingarchitecture.network;

import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@lk7
/* loaded from: classes4.dex */
final class SubInfoOverrides {
    public static final Companion Companion = new Companion(null);
    private final SubInfoData a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return SubInfoOverrides$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SubInfoOverrides(int i, SubInfoData subInfoData, mk7 mk7Var) {
        if (1 != (i & 1)) {
            wv5.a(i, 1, SubInfoOverrides$$serializer.INSTANCE.getDescriptor());
        }
        this.a = subInfoData;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubInfoOverrides) && zq3.c(this.a, ((SubInfoOverrides) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SubInfoOverrides(data=" + this.a + ")";
    }

    public SubInfoOverrides(SubInfoData subInfoData) {
        zq3.h(subInfoData, "data");
        this.a = subInfoData;
    }
}
