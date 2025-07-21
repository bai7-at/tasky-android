package com.nytimes.android.api.retrofit;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.facebook.AuthenticationTokenClaims;
import defpackage.en3;
import defpackage.he0;
import defpackage.ib4;
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

/* loaded from: classes3.dex */
public final class ServiceResponseCard$$serializer implements jx2 {
    public static final ServiceResponseCard$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ServiceResponseCard$$serializer serviceResponseCard$$serializer = new ServiceResponseCard$$serializer();
        INSTANCE = serviceResponseCard$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("cards", serviceResponseCard$$serializer, 10);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l(AuthenticationTokenClaims.JSON_KEY_NAME, false);
        pluginGeneratedSerialDescriptor.l("url", false);
        pluginGeneratedSerialDescriptor.l("byline", false);
        pluginGeneratedSerialDescriptor.l("crops", false);
        pluginGeneratedSerialDescriptor.l("uuid", true);
        pluginGeneratedSerialDescriptor.l("has_video", false);
        pluginGeneratedSerialDescriptor.l("avg_rating", true);
        pluginGeneratedSerialDescriptor.l("num_ratings", true);
        pluginGeneratedSerialDescriptor.l("cooking_time", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ServiceResponseCard$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = ServiceResponseCard.k;
        l48 l48Var = l48.a;
        KSerializer u = he0.u(l48Var);
        KSerializer u2 = he0.u(l48Var);
        KSerializer u3 = he0.u(kSerializerArr[4]);
        KSerializer u4 = he0.u(l48Var);
        KSerializer u5 = he0.u(za0.a);
        en3 en3Var = en3.a;
        return new KSerializer[]{ib4.a, l48Var, u, u2, u3, u4, u5, he0.u(en3Var), he0.u(en3Var), he0.u(l48Var)};
    }

    @Override // defpackage.ym1
    public ServiceResponseCard deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        String str;
        Integer num;
        Boolean bool;
        String str2;
        Integer num2;
        List list;
        String str3;
        String str4;
        String str5;
        long j;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = ServiceResponseCard.k;
        int i2 = 9;
        String str6 = null;
        if (b.p()) {
            long f = b.f(descriptor2, 0);
            String n = b.n(descriptor2, 1);
            l48 l48Var = l48.a;
            String str7 = (String) b.g(descriptor2, 2, l48Var, null);
            String str8 = (String) b.g(descriptor2, 3, l48Var, null);
            List list2 = (List) b.g(descriptor2, 4, kSerializerArr[4], null);
            String str9 = (String) b.g(descriptor2, 5, l48Var, null);
            Boolean bool2 = (Boolean) b.g(descriptor2, 6, za0.a, null);
            en3 en3Var = en3.a;
            Integer num3 = (Integer) b.g(descriptor2, 7, en3Var, null);
            Integer num4 = (Integer) b.g(descriptor2, 8, en3Var, null);
            list = list2;
            str4 = n;
            str = (String) b.g(descriptor2, 9, l48Var, null);
            num2 = num3;
            bool = bool2;
            str2 = str9;
            str3 = str8;
            num = num4;
            str5 = str7;
            i = 1023;
            j = f;
        } else {
            boolean z = true;
            int i3 = 0;
            String str10 = null;
            Integer num5 = null;
            Boolean bool3 = null;
            String str11 = null;
            Integer num6 = null;
            List list3 = null;
            String str12 = null;
            long j2 = 0;
            String str13 = null;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i2 = 9;
                    case 0:
                        j2 = b.f(descriptor2, 0);
                        i3 |= 1;
                        i2 = 9;
                    case 1:
                        str6 = b.n(descriptor2, 1);
                        i3 |= 2;
                        i2 = 9;
                    case 2:
                        str13 = (String) b.g(descriptor2, 2, l48.a, str13);
                        i3 |= 4;
                        i2 = 9;
                    case 3:
                        str12 = (String) b.g(descriptor2, 3, l48.a, str12);
                        i3 |= 8;
                        i2 = 9;
                    case 4:
                        list3 = (List) b.g(descriptor2, 4, kSerializerArr[4], list3);
                        i3 |= 16;
                        i2 = 9;
                    case 5:
                        str11 = (String) b.g(descriptor2, 5, l48.a, str11);
                        i3 |= 32;
                        i2 = 9;
                    case 6:
                        bool3 = (Boolean) b.g(descriptor2, 6, za0.a, bool3);
                        i3 |= 64;
                        i2 = 9;
                    case 7:
                        num6 = (Integer) b.g(descriptor2, 7, en3.a, num6);
                        i3 |= 128;
                        i2 = 9;
                    case 8:
                        num5 = (Integer) b.g(descriptor2, 8, en3.a, num5);
                        i3 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                    case 9:
                        str10 = (String) b.g(descriptor2, i2, l48.a, str10);
                        i3 |= 512;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i3;
            str = str10;
            num = num5;
            bool = bool3;
            str2 = str11;
            num2 = num6;
            list = list3;
            str3 = str12;
            str4 = str6;
            str5 = str13;
            j = j2;
        }
        b.c(descriptor2);
        return new ServiceResponseCard(i, j, str4, str5, str3, list, str2, bool, num2, num, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, ServiceResponseCard serviceResponseCard) {
        zq3.h(encoder, "encoder");
        zq3.h(serviceResponseCard, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        ServiceResponseCard.j(serviceResponseCard, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
