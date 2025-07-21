package com.nytimes.android.libs.messagingarchitecture.model;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.en3;
import defpackage.he0;
import defpackage.jx2;
import defpackage.l48;
import defpackage.za0;
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
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public final class LegacyMessage$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final LegacyMessage$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LegacyMessage$$serializer legacyMessage$$serializer = new LegacyMessage$$serializer();
        INSTANCE = legacyMessage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.libs.messagingarchitecture.model.LegacyMessage", legacyMessage$$serializer, 19);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("messageId", false);
        pluginGeneratedSerialDescriptor.l("historyId", false);
        pluginGeneratedSerialDescriptor.l("orderId", false);
        pluginGeneratedSerialDescriptor.l("context", false);
        pluginGeneratedSerialDescriptor.l("presentationRule", false);
        pluginGeneratedSerialDescriptor.l("cadence", false);
        pluginGeneratedSerialDescriptor.l("placement", false);
        pluginGeneratedSerialDescriptor.l("action", false);
        pluginGeneratedSerialDescriptor.l("cancelable", false);
        pluginGeneratedSerialDescriptor.l("body", false);
        pluginGeneratedSerialDescriptor.l("kicker", false);
        pluginGeneratedSerialDescriptor.l("mediaResource", false);
        pluginGeneratedSerialDescriptor.l("subscriptionRequired", false);
        pluginGeneratedSerialDescriptor.l("abTestName", false);
        pluginGeneratedSerialDescriptor.l("abTestVariant", false);
        pluginGeneratedSerialDescriptor.l("analyticsModuleName", false);
        pluginGeneratedSerialDescriptor.l("analyticsLabel", false);
        pluginGeneratedSerialDescriptor.l("targets", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LegacyMessage$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = LegacyMessage.u;
        l48 l48Var = l48.a;
        MessageProperties$$serializer messageProperties$$serializer = MessageProperties$$serializer.INSTANCE;
        KSerializer u = he0.u(messageProperties$$serializer);
        KSerializer u2 = he0.u(messageProperties$$serializer);
        KSerializer u3 = he0.u(messageProperties$$serializer);
        KSerializer kSerializer = kSerializerArr[10];
        KSerializer u4 = he0.u(l48Var);
        KSerializer u5 = he0.u(messageProperties$$serializer);
        KSerializer u6 = he0.u(l48Var);
        KSerializer u7 = he0.u(l48Var);
        KSerializer u8 = he0.u(MessageTarget$$serializer.INSTANCE);
        en3 en3Var = en3.a;
        za0 za0Var = za0.a;
        return new KSerializer[]{l48Var, l48Var, l48Var, en3Var, l48Var, u, en3Var, u2, u3, za0Var, kSerializer, u4, u5, za0Var, u6, u7, l48Var, l48Var, u8};
    }

    @Override // defpackage.ym1
    public LegacyMessage deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        MessageProperties messageProperties;
        String str;
        MessageTarget messageTarget;
        MessageProperties messageProperties2;
        MessageProperties messageProperties3;
        int i;
        int i2;
        String str2;
        String str3;
        MessageProperties messageProperties4;
        List list;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z;
        int i3;
        boolean z2;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = LegacyMessage.u;
        int i4 = 10;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            String n3 = b.n(descriptor2, 2);
            int j = b.j(descriptor2, 3);
            String n4 = b.n(descriptor2, 4);
            MessageProperties$$serializer messageProperties$$serializer = MessageProperties$$serializer.INSTANCE;
            MessageProperties messageProperties5 = (MessageProperties) b.g(descriptor2, 5, messageProperties$$serializer, null);
            int j2 = b.j(descriptor2, 6);
            MessageProperties messageProperties6 = (MessageProperties) b.g(descriptor2, 7, messageProperties$$serializer, null);
            MessageProperties messageProperties7 = (MessageProperties) b.g(descriptor2, 8, messageProperties$$serializer, null);
            boolean D = b.D(descriptor2, 9);
            List list2 = (List) b.y(descriptor2, 10, kSerializerArr[10], null);
            l48 l48Var = l48.a;
            String str10 = (String) b.g(descriptor2, 11, l48Var, null);
            MessageProperties messageProperties8 = (MessageProperties) b.g(descriptor2, 12, messageProperties$$serializer, null);
            boolean D2 = b.D(descriptor2, 13);
            String str11 = (String) b.g(descriptor2, 14, l48Var, null);
            String str12 = (String) b.g(descriptor2, 15, l48Var, null);
            String n5 = b.n(descriptor2, 16);
            String n6 = b.n(descriptor2, 17);
            i2 = j;
            str2 = str12;
            messageTarget = (MessageTarget) b.g(descriptor2, 18, MessageTarget$$serializer.INSTANCE, null);
            i = 524287;
            str7 = n4;
            messageProperties2 = messageProperties7;
            str6 = n3;
            str8 = n5;
            str5 = n2;
            str9 = n6;
            z = D;
            messageProperties3 = messageProperties6;
            i3 = j2;
            messageProperties = messageProperties5;
            z2 = D2;
            str4 = n;
            str3 = str11;
            messageProperties4 = messageProperties8;
            str = str10;
            list = list2;
        } else {
            int i5 = 0;
            boolean z3 = false;
            int i6 = 0;
            boolean z4 = false;
            boolean z5 = true;
            String str13 = null;
            MessageTarget messageTarget2 = null;
            MessageProperties messageProperties9 = null;
            MessageProperties messageProperties10 = null;
            String str14 = null;
            String str15 = null;
            MessageProperties messageProperties11 = null;
            List list3 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            MessageProperties messageProperties12 = null;
            int i7 = 0;
            while (z5) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z5 = false;
                        i4 = 10;
                    case 0:
                        str16 = b.n(descriptor2, 0);
                        i7 |= 1;
                        i4 = 10;
                    case 1:
                        str17 = b.n(descriptor2, 1);
                        i7 |= 2;
                        i4 = 10;
                    case 2:
                        str18 = b.n(descriptor2, 2);
                        i7 |= 4;
                        i4 = 10;
                    case 3:
                        i7 |= 8;
                        i5 = b.j(descriptor2, 3);
                        i4 = 10;
                    case 4:
                        str19 = b.n(descriptor2, 4);
                        i7 |= 16;
                        i4 = 10;
                    case 5:
                        messageProperties12 = (MessageProperties) b.g(descriptor2, 5, MessageProperties$$serializer.INSTANCE, messageProperties12);
                        i7 |= 32;
                        i4 = 10;
                    case 6:
                        i6 = b.j(descriptor2, 6);
                        i7 |= 64;
                        i4 = 10;
                    case 7:
                        messageProperties10 = (MessageProperties) b.g(descriptor2, 7, MessageProperties$$serializer.INSTANCE, messageProperties10);
                        i7 |= 128;
                        i4 = 10;
                    case 8:
                        messageProperties9 = (MessageProperties) b.g(descriptor2, 8, MessageProperties$$serializer.INSTANCE, messageProperties9);
                        i7 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                        i4 = 10;
                    case 9:
                        z3 = b.D(descriptor2, 9);
                        i7 |= 512;
                    case 10:
                        list3 = (List) b.y(descriptor2, i4, kSerializerArr[i4], list3);
                        i7 |= 1024;
                    case 11:
                        str13 = (String) b.g(descriptor2, 11, l48.a, str13);
                        i7 |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
                        i4 = 10;
                    case 12:
                        messageProperties11 = (MessageProperties) b.g(descriptor2, 12, MessageProperties$$serializer.INSTANCE, messageProperties11);
                        i7 |= ProgressEvent.PART_FAILED_EVENT_CODE;
                        i4 = 10;
                    case 13:
                        z4 = b.D(descriptor2, 13);
                        i7 |= 8192;
                        i4 = 10;
                    case 14:
                        str15 = (String) b.g(descriptor2, 14, l48.a, str15);
                        i7 |= Http2.INITIAL_MAX_FRAME_SIZE;
                        i4 = 10;
                    case 15:
                        str14 = (String) b.g(descriptor2, 15, l48.a, str14);
                        i7 |= 32768;
                        i4 = 10;
                    case 16:
                        str20 = b.n(descriptor2, 16);
                        i7 |= 65536;
                        i4 = 10;
                    case 17:
                        str21 = b.n(descriptor2, 17);
                        i7 |= 131072;
                        i4 = 10;
                    case 18:
                        messageTarget2 = (MessageTarget) b.g(descriptor2, 18, MessageTarget$$serializer.INSTANCE, messageTarget2);
                        i7 |= 262144;
                        i4 = 10;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            messageProperties = messageProperties12;
            str = str13;
            messageTarget = messageTarget2;
            messageProperties2 = messageProperties9;
            messageProperties3 = messageProperties10;
            i = i7;
            i2 = i5;
            str2 = str14;
            str3 = str15;
            messageProperties4 = messageProperties11;
            list = list3;
            str4 = str16;
            str5 = str17;
            str6 = str18;
            str7 = str19;
            str8 = str20;
            str9 = str21;
            z = z3;
            i3 = i6;
            z2 = z4;
        }
        b.c(descriptor2);
        return new LegacyMessage(i, str4, str5, str6, i2, str7, messageProperties, i3, messageProperties3, messageProperties2, z, list, str, messageProperties4, z2, str3, str2, str8, str9, messageTarget, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, LegacyMessage legacyMessage) {
        zq3.h(encoder, "encoder");
        zq3.h(legacyMessage, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        LegacyMessage.w(legacyMessage, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
