package com.nytimes.android.libs.messagingarchitecture.model;

import com.facebook.AuthenticationTokenClaims;
import defpackage.jx2;
import defpackage.l48;
import defpackage.mk7;
import defpackage.zq3;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final class MessageProperties$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final MessageProperties$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MessageProperties$$serializer messageProperties$$serializer = new MessageProperties$$serializer();
        INSTANCE = messageProperties$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.libs.messagingarchitecture.model.MessageProperties", messageProperties$$serializer, 2);
        pluginGeneratedSerialDescriptor.l(AuthenticationTokenClaims.JSON_KEY_NAME, false);
        pluginGeneratedSerialDescriptor.l("properties", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessageProperties$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = MessageProperties.d;
        return new KSerializer[]{l48.a, kSerializerArr[1]};
    }

    @Override // defpackage.ym1
    public MessageProperties deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        Map map;
        String str;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = MessageProperties.d;
        mk7 mk7Var = null;
        if (b.p()) {
            str = b.n(descriptor2, 0);
            map = (Map) b.y(descriptor2, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Map map2 = null;
            String str2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str2 = b.n(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    map2 = (Map) b.y(descriptor2, 1, kSerializerArr[1], map2);
                    i2 |= 2;
                }
            }
            map = map2;
            str = str2;
            i = i2;
        }
        b.c(descriptor2);
        return new MessageProperties(i, str, map, mk7Var);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, MessageProperties messageProperties) {
        zq3.h(encoder, "encoder");
        zq3.h(messageProperties, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        MessageProperties.f(messageProperties, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
