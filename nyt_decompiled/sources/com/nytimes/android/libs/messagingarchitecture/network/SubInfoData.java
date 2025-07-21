package com.nytimes.android.libs.messagingarchitecture.network;

import defpackage.l48;
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
final class SubInfoData {
    public static final Companion Companion = new Companion(null);
    private static final KSerializer[] c = {null, new qo(l48.a)};
    private final String a;
    private final List b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return SubInfoData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SubInfoData(int i, String str, List list, mk7 mk7Var) {
        if (2 != (i & 2)) {
            wv5.a(i, 2, SubInfoData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.a = "ACTIVE";
        } else {
            this.a = str;
        }
        this.b = list;
    }

    public static final /* synthetic */ void b(SubInfoData subInfoData, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = c;
        if (dVar.A(serialDescriptor, 0) || !zq3.c(subInfoData.a, "ACTIVE")) {
            dVar.y(serialDescriptor, 0, subInfoData.a);
        }
        dVar.z(serialDescriptor, 1, kSerializerArr[1], subInfoData.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubInfoData)) {
            return false;
        }
        SubInfoData subInfoData = (SubInfoData) obj;
        return zq3.c(this.a, subInfoData.a) && zq3.c(this.b, subInfoData.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "SubInfoData(status=" + this.a + ", entitlements=" + this.b + ")";
    }

    public SubInfoData(String str, List list) {
        zq3.h(str, "status");
        zq3.h(list, "entitlements");
        this.a = str;
        this.b = list;
    }

    public /* synthetic */ SubInfoData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "ACTIVE" : str, list);
    }
}
