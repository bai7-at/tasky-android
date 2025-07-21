package com.nytimes.android.ribbon.destinations.greatreads;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.en3;
import defpackage.he0;
import defpackage.jx2;
import defpackage.l48;
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
public final class GreatReadsLockupData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final GreatReadsLockupData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GreatReadsLockupData$$serializer greatReadsLockupData$$serializer = new GreatReadsLockupData$$serializer();
        INSTANCE = greatReadsLockupData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.greatreads.GreatReadsLockupData", greatReadsLockupData$$serializer, 9);
        pluginGeneratedSerialDescriptor.l("kicker", false);
        pluginGeneratedSerialDescriptor.l("articleTitle", false);
        pluginGeneratedSerialDescriptor.l("articleUrl", true);
        pluginGeneratedSerialDescriptor.l("articleUri", true);
        pluginGeneratedSerialDescriptor.l("imageUrl", false);
        pluginGeneratedSerialDescriptor.l("minRead", true);
        pluginGeneratedSerialDescriptor.l("summary", true);
        pluginGeneratedSerialDescriptor.l("photoCredit", true);
        pluginGeneratedSerialDescriptor.l("trackingParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GreatReadsLockupData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = GreatReadsLockupData.k;
        l48 l48Var = l48.a;
        return new KSerializer[]{he0.u(l48Var), l48Var, he0.u(l48Var), he0.u(l48Var), he0.u(l48Var), he0.u(en3.a), he0.u(l48Var), he0.u(l48Var), he0.u(kSerializerArr[8])};
    }

    @Override // defpackage.ym1
    public GreatReadsLockupData deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        Map map;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = GreatReadsLockupData.k;
        int i2 = 7;
        String str8 = null;
        if (b.p()) {
            l48 l48Var = l48.a;
            String str9 = (String) b.g(descriptor2, 0, l48Var, null);
            String n = b.n(descriptor2, 1);
            String str10 = (String) b.g(descriptor2, 2, l48Var, null);
            String str11 = (String) b.g(descriptor2, 3, l48Var, null);
            String str12 = (String) b.g(descriptor2, 4, l48Var, null);
            Integer num2 = (Integer) b.g(descriptor2, 5, en3.a, null);
            String str13 = (String) b.g(descriptor2, 6, l48Var, null);
            String str14 = (String) b.g(descriptor2, 7, l48Var, null);
            map = (Map) b.g(descriptor2, 8, kSerializerArr[8], null);
            str2 = str14;
            i = 511;
            str = str13;
            num = num2;
            str4 = str11;
            str3 = str12;
            str7 = str10;
            str6 = n;
            str5 = str9;
        } else {
            boolean z = true;
            int i3 = 0;
            Map map2 = null;
            String str15 = null;
            String str16 = null;
            Integer num3 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                    case 0:
                        str8 = (String) b.g(descriptor2, 0, l48.a, str8);
                        i3 |= 1;
                        i2 = 7;
                    case 1:
                        str19 = b.n(descriptor2, 1);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        str20 = (String) b.g(descriptor2, 2, l48.a, str20);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        str18 = (String) b.g(descriptor2, 3, l48.a, str18);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        str17 = (String) b.g(descriptor2, 4, l48.a, str17);
                        i3 |= 16;
                        i2 = 7;
                    case 5:
                        num3 = (Integer) b.g(descriptor2, 5, en3.a, num3);
                        i3 |= 32;
                        i2 = 7;
                    case 6:
                        str15 = (String) b.g(descriptor2, 6, l48.a, str15);
                        i3 |= 64;
                        i2 = 7;
                    case 7:
                        str16 = (String) b.g(descriptor2, i2, l48.a, str16);
                        i3 |= 128;
                    case 8:
                        map2 = (Map) b.g(descriptor2, 8, kSerializerArr[8], map2);
                        i3 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i3;
            map = map2;
            str = str15;
            str2 = str16;
            num = num3;
            str3 = str17;
            str4 = str18;
            str5 = str8;
            str6 = str19;
            str7 = str20;
        }
        b.c(descriptor2);
        return new GreatReadsLockupData(i, str5, str6, str7, str4, str3, num, str, str2, map, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, GreatReadsLockupData greatReadsLockupData) {
        zq3.h(encoder, "encoder");
        zq3.h(greatReadsLockupData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        GreatReadsLockupData.j(greatReadsLockupData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
