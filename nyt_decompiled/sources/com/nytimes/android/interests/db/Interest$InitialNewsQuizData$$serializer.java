package com.nytimes.android.interests.db;

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
public final class Interest$InitialNewsQuizData$$serializer implements jx2 {
    public static final Interest$InitialNewsQuizData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Interest$InitialNewsQuizData$$serializer interest$InitialNewsQuizData$$serializer = new Interest$InitialNewsQuizData$$serializer();
        INSTANCE = interest$InitialNewsQuizData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.Interest.InitialNewsQuizData", interest$InitialNewsQuizData$$serializer, 7);
        pluginGeneratedSerialDescriptor.l("quizAsset", false);
        pluginGeneratedSerialDescriptor.l("question", false);
        pluginGeneratedSerialDescriptor.l("choices", false);
        pluginGeneratedSerialDescriptor.l("answer", false);
        pluginGeneratedSerialDescriptor.l("explanation", false);
        pluginGeneratedSerialDescriptor.l("totalQuestions", false);
        pluginGeneratedSerialDescriptor.l("firstPublished", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Interest$InitialNewsQuizData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Interest.InitialNewsQuizData.h;
        KSerializer kSerializer = kSerializerArr[0];
        l48 l48Var = l48.a;
        return new KSerializer[]{kSerializer, l48Var, kSerializerArr[2], l48Var, he0.u(l48Var), he0.u(en3.a), ib4.a};
    }

    @Override // defpackage.ym1
    public Interest.InitialNewsQuizData deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        Integer num;
        String str;
        InterestAsset interestAsset;
        long j;
        String str2;
        List list;
        String str3;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = Interest.InitialNewsQuizData.h;
        int i2 = 6;
        int i3 = 5;
        InterestAsset interestAsset2 = null;
        if (b.p()) {
            InterestAsset interestAsset3 = (InterestAsset) b.y(descriptor2, 0, kSerializerArr[0], null);
            String n = b.n(descriptor2, 1);
            List list2 = (List) b.y(descriptor2, 2, kSerializerArr[2], null);
            String n2 = b.n(descriptor2, 3);
            String str4 = (String) b.g(descriptor2, 4, l48.a, null);
            list = list2;
            interestAsset = interestAsset3;
            i = 127;
            num = (Integer) b.g(descriptor2, 5, en3.a, null);
            str3 = n2;
            str = str4;
            str2 = n;
            j = b.f(descriptor2, 6);
        } else {
            long j2 = 0;
            boolean z = true;
            int i4 = 0;
            Integer num2 = null;
            String str5 = null;
            String str6 = null;
            List list3 = null;
            String str7 = null;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i2 = 6;
                    case 0:
                        interestAsset2 = (InterestAsset) b.y(descriptor2, 0, kSerializerArr[0], interestAsset2);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 5;
                    case 1:
                        str6 = b.n(descriptor2, 1);
                        i4 |= 2;
                        i2 = 6;
                    case 2:
                        list3 = (List) b.y(descriptor2, 2, kSerializerArr[2], list3);
                        i4 |= 4;
                        i2 = 6;
                    case 3:
                        str7 = b.n(descriptor2, 3);
                        i4 |= 8;
                    case 4:
                        str5 = (String) b.g(descriptor2, 4, l48.a, str5);
                        i4 |= 16;
                    case 5:
                        num2 = (Integer) b.g(descriptor2, i3, en3.a, num2);
                        i4 |= 32;
                    case 6:
                        j2 = b.f(descriptor2, i2);
                        i4 |= 64;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i4;
            num = num2;
            str = str5;
            interestAsset = interestAsset2;
            j = j2;
            str2 = str6;
            list = list3;
            str3 = str7;
        }
        b.c(descriptor2);
        return new Interest.InitialNewsQuizData(i, interestAsset, str2, list, str3, str, num, j, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Interest.InitialNewsQuizData initialNewsQuizData) {
        zq3.h(encoder, "encoder");
        zq3.h(initialNewsQuizData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Interest.InitialNewsQuizData.i(initialNewsQuizData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
