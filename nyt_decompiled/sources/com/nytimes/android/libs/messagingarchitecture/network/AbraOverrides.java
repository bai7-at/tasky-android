package com.nytimes.android.libs.messagingarchitecture.network;

import defpackage.lk7;
import defpackage.mk7;
import defpackage.qo;
import defpackage.wv5;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@lk7
/* loaded from: classes4.dex */
final class AbraOverrides {
    public static final Companion Companion = new Companion(null);
    private static final KSerializer[] b = {new qo(TestOverride$$serializer.INSTANCE)};
    private final List a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return AbraOverrides$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AbraOverrides(int i, List list, mk7 mk7Var) {
        if (1 != (i & 1)) {
            wv5.a(i, 1, AbraOverrides$$serializer.INSTANCE.getDescriptor());
        }
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbraOverrides) && zq3.c(this.a, ((AbraOverrides) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "AbraOverrides(data=" + this.a + ")";
    }

    public AbraOverrides(List list) {
        zq3.h(list, "data");
        this.a = list;
    }
}
