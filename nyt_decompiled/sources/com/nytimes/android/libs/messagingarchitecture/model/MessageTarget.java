package com.nytimes.android.libs.messagingarchitecture.model;

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
public final class MessageTarget {
    public static final Companion Companion = new Companion(null);
    public static final int c = 8;
    private static final KSerializer[] d = {Relationship.Companion.serializer(), new qo(MessageEntitlement$$serializer.INSTANCE)};
    private final Relationship a;
    private final List b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return MessageTarget$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MessageTarget(int i, Relationship relationship, List list, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, MessageTarget$$serializer.INSTANCE.getDescriptor());
        }
        this.a = relationship;
        this.b = list;
    }

    public static final /* synthetic */ void d(MessageTarget messageTarget, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = d;
        dVar.z(serialDescriptor, 0, kSerializerArr[0], messageTarget.a);
        dVar.z(serialDescriptor, 1, kSerializerArr[1], messageTarget.b);
    }

    public final List b() {
        return this.b;
    }

    public final Relationship c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTarget)) {
            return false;
        }
        MessageTarget messageTarget = (MessageTarget) obj;
        return this.a == messageTarget.a && zq3.c(this.b, messageTarget.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "MessageTarget(relationship=" + this.a + ", entitlements=" + this.b + ")";
    }

    public MessageTarget(Relationship relationship, List list) {
        zq3.h(relationship, "relationship");
        zq3.h(list, "entitlements");
        this.a = relationship;
        this.b = list;
    }
}
