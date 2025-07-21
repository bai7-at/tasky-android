package com.nytimes.android.libs.messagingarchitecture.model;

import defpackage.jx2;
import defpackage.mk7;
import defpackage.zq3;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final class MessageTarget$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final MessageTarget$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MessageTarget$$serializer messageTarget$$serializer = new MessageTarget$$serializer();
        INSTANCE = messageTarget$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.libs.messagingarchitecture.model.MessageTarget", messageTarget$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("relationship", false);
        pluginGeneratedSerialDescriptor.l("entitlements", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessageTarget$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = MessageTarget.d;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // defpackage.ym1
    public MessageTarget deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        Relationship relationship;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = MessageTarget.d;
        mk7 mk7Var = null;
        if (b.p()) {
            relationship = (Relationship) b.y(descriptor2, 0, kSerializerArr[0], null);
            list = (List) b.y(descriptor2, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            Relationship relationship2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    relationship2 = (Relationship) b.y(descriptor2, 0, kSerializerArr[0], relationship2);
                    i2 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    list2 = (List) b.y(descriptor2, 1, kSerializerArr[1], list2);
                    i2 |= 2;
                }
            }
            list = list2;
            relationship = relationship2;
            i = i2;
        }
        b.c(descriptor2);
        return new MessageTarget(i, relationship, list, mk7Var);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, MessageTarget messageTarget) {
        zq3.h(encoder, "encoder");
        zq3.h(messageTarget, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        MessageTarget.d(messageTarget, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
