package com.nytimes.android.interests;

import defpackage.en3;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.qo;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class InterestsOrder {
    public static final Companion Companion = new Companion(null);
    private static final KSerializer[] b = {new qo(en3.a)};
    private final List a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return InterestsOrder$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ InterestsOrder(int i, List list, mk7 mk7Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    public static final /* synthetic */ void c(InterestsOrder interestsOrder, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = b;
        if (!dVar.A(serialDescriptor, 0) && interestsOrder.a == null) {
            return;
        }
        dVar.l(serialDescriptor, 0, kSerializerArr[0], interestsOrder.a);
    }

    public final List b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterestsOrder) && zq3.c(this.a, ((InterestsOrder) obj).a);
    }

    public int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "InterestsOrder(order=" + this.a + ")";
    }

    public InterestsOrder(List list) {
        this.a = list;
    }
}
