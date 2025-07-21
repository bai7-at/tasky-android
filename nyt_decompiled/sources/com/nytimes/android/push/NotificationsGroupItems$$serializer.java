package com.nytimes.android.push;

import defpackage.jx2;
import defpackage.l48;
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
public final class NotificationsGroupItems$$serializer implements jx2 {
    public static final NotificationsGroupItems$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NotificationsGroupItems$$serializer notificationsGroupItems$$serializer = new NotificationsGroupItems$$serializer();
        INSTANCE = notificationsGroupItems$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.push.NotificationsGroupItems", notificationsGroupItems$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("groupTitle", false);
        pluginGeneratedSerialDescriptor.l("channels", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NotificationsGroupItems$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = NotificationsGroupItems.c;
        return new KSerializer[]{l48.a, kSerializerArr[1]};
    }

    @Override // defpackage.ym1
    public NotificationsGroupItems deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        String str;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = NotificationsGroupItems.c;
        if (b.p()) {
            str = b.n(descriptor2, 0);
            list = (List) b.y(descriptor2, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
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
                    list2 = (List) b.y(descriptor2, 1, kSerializerArr[1], list2);
                    i2 |= 2;
                }
            }
            list = list2;
            str = str2;
            i = i2;
        }
        b.c(descriptor2);
        return new NotificationsGroupItems(i, str, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, NotificationsGroupItems notificationsGroupItems) {
        zq3.h(encoder, "encoder");
        zq3.h(notificationsGroupItems, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        NotificationsGroupItems.f(notificationsGroupItems, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
