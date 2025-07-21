package com.nytimes.android.interests.db;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.interests.db.Interest;
import defpackage.en3;
import defpackage.he0;
import defpackage.ib4;
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
public final class Interest$FlashbackQuizInterest$$serializer implements jx2 {
    public static final Interest$FlashbackQuizInterest$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Interest$FlashbackQuizInterest$$serializer interest$FlashbackQuizInterest$$serializer = new Interest$FlashbackQuizInterest$$serializer();
        INSTANCE = interest$FlashbackQuizInterest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.Interest.FlashbackQuizInterest", interest$FlashbackQuizInterest$$serializer, 7);
        pluginGeneratedSerialDescriptor.l("event", false);
        pluginGeneratedSerialDescriptor.l(AssetConstants.IMAGE_TYPE, false);
        pluginGeneratedSerialDescriptor.l("score", false);
        pluginGeneratedSerialDescriptor.l("answer", false);
        pluginGeneratedSerialDescriptor.l("firstPublished", false);
        pluginGeneratedSerialDescriptor.l("url", false);
        pluginGeneratedSerialDescriptor.l("asset", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Interest$FlashbackQuizInterest$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Interest.FlashbackQuizInterest.i;
        KSerializer u = he0.u(en3.a);
        KSerializer kSerializer = kSerializerArr[3];
        KSerializer kSerializer2 = kSerializerArr[6];
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, l48Var, u, kSerializer, ib4.a, l48Var, kSerializer2};
    }

    @Override // defpackage.ym1
    public Interest.FlashbackQuizInterest deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        InterestAsset interestAsset;
        String str;
        String str2;
        Integer num;
        List list;
        String str3;
        long j;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = Interest.FlashbackQuizInterest.i;
        String str4 = null;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            Integer num2 = (Integer) b.g(descriptor2, 2, en3.a, null);
            List list2 = (List) b.y(descriptor2, 3, kSerializerArr[3], null);
            long f = b.f(descriptor2, 4);
            String n3 = b.n(descriptor2, 5);
            interestAsset = (InterestAsset) b.y(descriptor2, 6, kSerializerArr[6], null);
            str = n;
            str3 = n3;
            i = 127;
            num = num2;
            list = list2;
            str2 = n2;
            j = f;
        } else {
            boolean z = true;
            int i2 = 0;
            InterestAsset interestAsset2 = null;
            List list3 = null;
            String str5 = null;
            long j2 = 0;
            String str6 = null;
            Integer num3 = null;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i2 |= 1;
                        str4 = b.n(descriptor2, 0);
                        continue;
                    case 1:
                        str6 = b.n(descriptor2, 1);
                        i2 |= 2;
                        continue;
                    case 2:
                        num3 = (Integer) b.g(descriptor2, 2, en3.a, num3);
                        i2 |= 4;
                        break;
                    case 3:
                        list3 = (List) b.y(descriptor2, 3, kSerializerArr[3], list3);
                        i2 |= 8;
                        break;
                    case 4:
                        j2 = b.f(descriptor2, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        str5 = b.n(descriptor2, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        interestAsset2 = (InterestAsset) b.y(descriptor2, 6, kSerializerArr[6], interestAsset2);
                        i2 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i2;
            interestAsset = interestAsset2;
            str = str4;
            str2 = str6;
            num = num3;
            list = list3;
            str3 = str5;
            j = j2;
        }
        b.c(descriptor2);
        return new Interest.FlashbackQuizInterest(i, str, str2, num, list, j, str3, interestAsset, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Interest.FlashbackQuizInterest flashbackQuizInterest) {
        zq3.h(encoder, "encoder");
        zq3.h(flashbackQuizInterest, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Interest.FlashbackQuizInterest.j(flashbackQuizInterest, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
