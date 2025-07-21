package com.nytimes.android.libs.messagingarchitecture.model;

import com.facebook.AuthenticationTokenClaims;
import defpackage.jx2;
import defpackage.l48;
import defpackage.za0;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final class MessageEntitlement$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final MessageEntitlement$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MessageEntitlement$$serializer messageEntitlement$$serializer = new MessageEntitlement$$serializer();
        INSTANCE = messageEntitlement$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.libs.messagingarchitecture.model.MessageEntitlement", messageEntitlement$$serializer, 2);
        pluginGeneratedSerialDescriptor.l(AuthenticationTokenClaims.JSON_KEY_NAME, false);
        pluginGeneratedSerialDescriptor.l("subscribed", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessageEntitlement$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        return new KSerializer[]{l48.a, za0.a};
    }

    @Override // defpackage.ym1
    public MessageEntitlement deserialize(Decoder decoder) {
        String str;
        boolean z;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            str = b.n(descriptor2, 0);
            z = b.D(descriptor2, 1);
            i = 3;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            int i2 = 0;
            str = null;
            while (z2) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z2 = false;
                } else if (o == 0) {
                    str = b.n(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    z3 = b.D(descriptor2, 1);
                    i2 |= 2;
                }
            }
            z = z3;
            i = i2;
        }
        b.c(descriptor2);
        return new MessageEntitlement(i, str, z, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, MessageEntitlement messageEntitlement) {
        zq3.h(encoder, "encoder");
        zq3.h(messageEntitlement, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        MessageEntitlement.c(messageEntitlement, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
