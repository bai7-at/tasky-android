package com.nytimes.android.ribbon.destinations.opinions;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.he0;
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
public final class OpinionItemLockupData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final OpinionItemLockupData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        OpinionItemLockupData$$serializer opinionItemLockupData$$serializer = new OpinionItemLockupData$$serializer();
        INSTANCE = opinionItemLockupData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.opinions.OpinionItemLockupData", opinionItemLockupData$$serializer, 9);
        pluginGeneratedSerialDescriptor.l("kicker", false);
        pluginGeneratedSerialDescriptor.l("articleTitle", false);
        pluginGeneratedSerialDescriptor.l("articleUrl", false);
        pluginGeneratedSerialDescriptor.l("articleUri", false);
        pluginGeneratedSerialDescriptor.l("imageUrl", false);
        pluginGeneratedSerialDescriptor.l("timestamp", true);
        pluginGeneratedSerialDescriptor.l("summary", true);
        pluginGeneratedSerialDescriptor.l("photoCredit", true);
        pluginGeneratedSerialDescriptor.l("trackingParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OpinionItemLockupData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = OpinionItemLockupData.k;
        l48 l48Var = l48.a;
        return new KSerializer[]{he0.u(l48Var), l48Var, l48Var, l48Var, he0.u(l48Var), he0.u(l48Var), he0.u(l48Var), he0.u(l48Var), he0.u(kSerializerArr[8])};
    }

    @Override // defpackage.ym1
    public OpinionItemLockupData deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        String str;
        Map map;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = OpinionItemLockupData.k;
        int i2 = 7;
        int i3 = 6;
        String str9 = null;
        if (b.p()) {
            l48 l48Var = l48.a;
            String str10 = (String) b.g(descriptor2, 0, l48Var, null);
            String n = b.n(descriptor2, 1);
            String n2 = b.n(descriptor2, 2);
            String n3 = b.n(descriptor2, 3);
            String str11 = (String) b.g(descriptor2, 4, l48Var, null);
            String str12 = (String) b.g(descriptor2, 5, l48Var, null);
            String str13 = (String) b.g(descriptor2, 6, l48Var, null);
            String str14 = (String) b.g(descriptor2, 7, l48Var, null);
            map = (Map) b.g(descriptor2, 8, kSerializerArr[8], null);
            str = str14;
            i = 511;
            str2 = str13;
            str3 = str12;
            str8 = n3;
            str4 = str11;
            str7 = n2;
            str6 = n;
            str5 = str10;
        } else {
            boolean z = true;
            int i4 = 0;
            String str15 = null;
            Map map2 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i3 = 6;
                    case 0:
                        str9 = (String) b.g(descriptor2, 0, l48.a, str9);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                    case 1:
                        i4 |= 2;
                        str19 = b.n(descriptor2, 1);
                        i2 = 7;
                    case 2:
                        i4 |= 4;
                        str20 = b.n(descriptor2, 2);
                        i2 = 7;
                    case 3:
                        str21 = b.n(descriptor2, 3);
                        i4 |= 8;
                        i2 = 7;
                    case 4:
                        str18 = (String) b.g(descriptor2, 4, l48.a, str18);
                        i4 |= 16;
                        i2 = 7;
                    case 5:
                        str17 = (String) b.g(descriptor2, 5, l48.a, str17);
                        i4 |= 32;
                        i2 = 7;
                    case 6:
                        str16 = (String) b.g(descriptor2, i3, l48.a, str16);
                        i4 |= 64;
                    case 7:
                        str15 = (String) b.g(descriptor2, i2, l48.a, str15);
                        i4 |= 128;
                    case 8:
                        map2 = (Map) b.g(descriptor2, 8, kSerializerArr[8], map2);
                        i4 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i4;
            str = str15;
            map = map2;
            str2 = str16;
            str3 = str17;
            str4 = str18;
            str5 = str9;
            str6 = str19;
            str7 = str20;
            str8 = str21;
        }
        b.c(descriptor2);
        return new OpinionItemLockupData(i, str5, str6, str7, str8, str4, str3, str2, str, map, (mk7) null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, OpinionItemLockupData opinionItemLockupData) {
        zq3.h(encoder, "encoder");
        zq3.h(opinionItemLockupData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        OpinionItemLockupData.k(opinionItemLockupData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
