package com.nytimes.android.ribbon.destinations.opinions;

import defpackage.lk7;
import defpackage.mk7;
import defpackage.qo;
import defpackage.wv5;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class OpinionsViewState {
    public static final Companion Companion = new Companion(null);
    public static final int c = 8;
    private static final KSerializer[] d;
    private final List a;
    private final List b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return OpinionsViewState$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        OpinionItemLockupData$$serializer opinionItemLockupData$$serializer = OpinionItemLockupData$$serializer.INSTANCE;
        d = new KSerializer[]{new qo(opinionItemLockupData$$serializer), new qo(opinionItemLockupData$$serializer)};
    }

    public /* synthetic */ OpinionsViewState(int i, List list, List list2, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, OpinionsViewState$$serializer.INSTANCE.getDescriptor());
        }
        this.a = list;
        this.b = list2;
    }

    public static final /* synthetic */ void d(OpinionsViewState opinionsViewState, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = d;
        dVar.z(serialDescriptor, 0, kSerializerArr[0], opinionsViewState.a);
        dVar.z(serialDescriptor, 1, kSerializerArr[1], opinionsViewState.b);
    }

    public final List b() {
        return this.b;
    }

    public final List c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpinionsViewState)) {
            return false;
        }
        OpinionsViewState opinionsViewState = (OpinionsViewState) obj;
        return zq3.c(this.a, opinionsViewState.a) && zq3.c(this.b, opinionsViewState.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "OpinionsViewState(opinionTopFive=" + this.a + ", opinionLatestArticles=" + this.b + ")";
    }

    public OpinionsViewState(List list, List list2) {
        zq3.h(list, "opinionTopFive");
        zq3.h(list2, "opinionLatestArticles");
        this.a = list;
        this.b = list2;
    }
}
