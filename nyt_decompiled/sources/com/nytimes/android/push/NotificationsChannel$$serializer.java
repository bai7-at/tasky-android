package com.nytimes.android.push;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.api.config.model.Channel;
import com.nytimes.android.api.config.model.Channel$$serializer;
import defpackage.he0;
import defpackage.jx2;
import defpackage.l48;
import defpackage.mk7;
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
public final class NotificationsChannel$$serializer implements jx2 {
    public static final NotificationsChannel$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NotificationsChannel$$serializer notificationsChannel$$serializer = new NotificationsChannel$$serializer();
        INSTANCE = notificationsChannel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.push.NotificationsChannel", notificationsChannel$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("tag", false);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("description", false);
        pluginGeneratedSerialDescriptor.l("isSubscribed", true);
        pluginGeneratedSerialDescriptor.l(AppsFlyerProperties.CHANNEL, true);
        pluginGeneratedSerialDescriptor.l("iconUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NotificationsChannel$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, l48Var, l48Var, za0.a, Channel$$serializer.INSTANCE, he0.u(l48Var)};
    }

    @Override // defpackage.ym1
    public NotificationsChannel deserialize(Decoder decoder) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        Channel channel;
        String str4;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            String n3 = b.n(descriptor2, 2);
            boolean D = b.D(descriptor2, 3);
            Channel channel2 = (Channel) b.y(descriptor2, 4, Channel$$serializer.INSTANCE, null);
            str = n;
            str4 = (String) b.g(descriptor2, 5, l48.a, null);
            z = D;
            channel = channel2;
            str3 = n3;
            str2 = n2;
            i = 63;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Channel channel3 = null;
            String str8 = null;
            int i2 = 0;
            while (z2) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        str5 = b.n(descriptor2, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        str6 = b.n(descriptor2, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        str7 = b.n(descriptor2, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        z3 = b.D(descriptor2, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        channel3 = (Channel) b.y(descriptor2, 4, Channel$$serializer.INSTANCE, channel3);
                        i2 |= 16;
                        break;
                    case 5:
                        str8 = (String) b.g(descriptor2, 5, l48.a, str8);
                        i2 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            z = z3;
            i = i2;
            str = str5;
            str2 = str6;
            str3 = str7;
            channel = channel3;
            str4 = str8;
        }
        b.c(descriptor2);
        return new NotificationsChannel(i, str, str2, str3, z, channel, str4, (mk7) null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, NotificationsChannel notificationsChannel) {
        zq3.h(encoder, "encoder");
        zq3.h(notificationsChannel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        NotificationsChannel.i(notificationsChannel, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
