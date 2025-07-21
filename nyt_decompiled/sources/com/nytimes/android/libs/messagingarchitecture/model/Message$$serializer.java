package com.nytimes.android.libs.messagingarchitecture.model;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.facebook.AuthenticationTokenClaims;
import defpackage.en3;
import defpackage.he0;
import defpackage.jx2;
import defpackage.l48;
import defpackage.mk7;
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
public final class Message$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final Message$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Message$$serializer message$$serializer = new Message$$serializer();
        INSTANCE = message$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.libs.messagingarchitecture.model.Message", message$$serializer, 15);
        pluginGeneratedSerialDescriptor.l("id", true);
        pluginGeneratedSerialDescriptor.l("audience", false);
        pluginGeneratedSerialDescriptor.l(AuthenticationTokenClaims.JSON_KEY_NAME, false);
        pluginGeneratedSerialDescriptor.l("weight", false);
        pluginGeneratedSerialDescriptor.l("unit", false);
        pluginGeneratedSerialDescriptor.l("placement", false);
        pluginGeneratedSerialDescriptor.l("presentationRule", false);
        pluginGeneratedSerialDescriptor.l("cadence", false);
        pluginGeneratedSerialDescriptor.l("action", false);
        pluginGeneratedSerialDescriptor.l("cancelable", false);
        pluginGeneratedSerialDescriptor.l("body", false);
        pluginGeneratedSerialDescriptor.l("kicker", false);
        pluginGeneratedSerialDescriptor.l("mediaResource", false);
        pluginGeneratedSerialDescriptor.l("analyticsModuleName", false);
        pluginGeneratedSerialDescriptor.l("analyticsLabel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Message$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Message.q;
        l48 l48Var = l48.a;
        MessageProperties$$serializer messageProperties$$serializer = MessageProperties$$serializer.INSTANCE;
        KSerializer u = he0.u(messageProperties$$serializer);
        KSerializer u2 = he0.u(messageProperties$$serializer);
        KSerializer u3 = he0.u(messageProperties$$serializer);
        KSerializer kSerializer = kSerializerArr[10];
        KSerializer u4 = he0.u(l48Var);
        KSerializer u5 = he0.u(messageProperties$$serializer);
        en3 en3Var = en3.a;
        return new KSerializer[]{l48Var, l48Var, l48Var, en3Var, l48Var, u, u2, en3Var, u3, za0.a, kSerializer, u4, u5, l48Var, l48Var};
    }

    @Override // defpackage.ym1
    public Message deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        MessageProperties messageProperties;
        MessageProperties messageProperties2;
        String str;
        int i;
        MessageProperties messageProperties3;
        List list;
        String str2;
        MessageProperties messageProperties4;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        int i2;
        int i3;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = Message.q;
        int i4 = 10;
        String str8 = null;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            String n3 = b.n(descriptor2, 2);
            int j = b.j(descriptor2, 3);
            String n4 = b.n(descriptor2, 4);
            MessageProperties$$serializer messageProperties$$serializer = MessageProperties$$serializer.INSTANCE;
            MessageProperties messageProperties5 = (MessageProperties) b.g(descriptor2, 5, messageProperties$$serializer, null);
            MessageProperties messageProperties6 = (MessageProperties) b.g(descriptor2, 6, messageProperties$$serializer, null);
            int j2 = b.j(descriptor2, 7);
            MessageProperties messageProperties7 = (MessageProperties) b.g(descriptor2, 8, messageProperties$$serializer, null);
            boolean D = b.D(descriptor2, 9);
            List list2 = (List) b.y(descriptor2, 10, kSerializerArr[10], null);
            String str9 = (String) b.g(descriptor2, 11, l48.a, null);
            str2 = str9;
            str = n;
            messageProperties3 = (MessageProperties) b.g(descriptor2, 12, messageProperties$$serializer, null);
            str3 = n2;
            str4 = n3;
            str6 = b.n(descriptor2, 13);
            z = D;
            i2 = j2;
            messageProperties = messageProperties6;
            messageProperties2 = messageProperties5;
            i3 = j;
            messageProperties4 = messageProperties7;
            str5 = n4;
            str7 = b.n(descriptor2, 14);
            i = 32767;
            list = list2;
        } else {
            int i5 = 14;
            boolean z2 = true;
            int i6 = 0;
            boolean z3 = false;
            int i7 = 0;
            int i8 = 0;
            MessageProperties messageProperties8 = null;
            MessageProperties messageProperties9 = null;
            MessageProperties messageProperties10 = null;
            List list3 = null;
            String str10 = null;
            MessageProperties messageProperties11 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            while (z2) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                        i5 = 14;
                    case 0:
                        i6 |= 1;
                        str8 = b.n(descriptor2, 0);
                        i5 = 14;
                        i4 = 10;
                    case 1:
                        str11 = b.n(descriptor2, 1);
                        i6 |= 2;
                        i5 = 14;
                        i4 = 10;
                    case 2:
                        str12 = b.n(descriptor2, 2);
                        i6 |= 4;
                        i5 = 14;
                        i4 = 10;
                    case 3:
                        i8 = b.j(descriptor2, 3);
                        i6 |= 8;
                        i5 = 14;
                        i4 = 10;
                    case 4:
                        str13 = b.n(descriptor2, 4);
                        i6 |= 16;
                        i5 = 14;
                        i4 = 10;
                    case 5:
                        messageProperties9 = (MessageProperties) b.g(descriptor2, 5, MessageProperties$$serializer.INSTANCE, messageProperties9);
                        i6 |= 32;
                        i5 = 14;
                        i4 = 10;
                    case 6:
                        messageProperties8 = (MessageProperties) b.g(descriptor2, 6, MessageProperties$$serializer.INSTANCE, messageProperties8);
                        i6 |= 64;
                        i5 = 14;
                        i4 = 10;
                    case 7:
                        i7 = b.j(descriptor2, 7);
                        i6 |= 128;
                        i5 = 14;
                    case 8:
                        messageProperties11 = (MessageProperties) b.g(descriptor2, 8, MessageProperties$$serializer.INSTANCE, messageProperties11);
                        i6 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                        i5 = 14;
                    case 9:
                        z3 = b.D(descriptor2, 9);
                        i6 |= 512;
                        i5 = 14;
                    case 10:
                        list3 = (List) b.y(descriptor2, i4, kSerializerArr[i4], list3);
                        i6 |= 1024;
                        i5 = 14;
                    case 11:
                        str10 = (String) b.g(descriptor2, 11, l48.a, str10);
                        i6 |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
                        i5 = 14;
                    case 12:
                        messageProperties10 = (MessageProperties) b.g(descriptor2, 12, MessageProperties$$serializer.INSTANCE, messageProperties10);
                        i6 |= ProgressEvent.PART_FAILED_EVENT_CODE;
                        i5 = 14;
                    case 13:
                        str14 = b.n(descriptor2, 13);
                        i6 |= 8192;
                    case 14:
                        str15 = b.n(descriptor2, i5);
                        i6 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            messageProperties = messageProperties8;
            messageProperties2 = messageProperties9;
            str = str8;
            i = i6;
            messageProperties3 = messageProperties10;
            list = list3;
            str2 = str10;
            messageProperties4 = messageProperties11;
            str3 = str11;
            str4 = str12;
            str5 = str13;
            str6 = str14;
            str7 = str15;
            z = z3;
            i2 = i7;
            i3 = i8;
        }
        b.c(descriptor2);
        return new Message(i, str, str3, str4, i3, str5, messageProperties2, messageProperties, i2, messageProperties4, z, list, str2, messageProperties3, str6, str7, (mk7) null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Message message) {
        zq3.h(encoder, "encoder");
        zq3.h(message, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Message.y(message, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
