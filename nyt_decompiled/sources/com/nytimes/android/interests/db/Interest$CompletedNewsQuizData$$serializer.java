package com.nytimes.android.interests.db;

import com.nytimes.android.interests.db.Interest;
import defpackage.bl2;
import defpackage.en3;
import defpackage.he0;
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
public final class Interest$CompletedNewsQuizData$$serializer implements jx2 {
    public static final Interest$CompletedNewsQuizData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Interest$CompletedNewsQuizData$$serializer interest$CompletedNewsQuizData$$serializer = new Interest$CompletedNewsQuizData$$serializer();
        INSTANCE = interest$CompletedNewsQuizData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.Interest.CompletedNewsQuizData", interest$CompletedNewsQuizData$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("score", false);
        pluginGeneratedSerialDescriptor.l("average", false);
        pluginGeneratedSerialDescriptor.l("statsCopy", false);
        pluginGeneratedSerialDescriptor.l("answers", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Interest$CompletedNewsQuizData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Interest.CompletedNewsQuizData.e;
        return new KSerializer[]{he0.u(bl2.a), he0.u(en3.a), he0.u(l48.a), he0.u(kSerializerArr[3])};
    }

    @Override // defpackage.ym1
    public Interest.CompletedNewsQuizData deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        Float f;
        Integer num;
        String str;
        List list;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = Interest.CompletedNewsQuizData.e;
        Float f2 = null;
        if (b.p()) {
            Float f3 = (Float) b.g(descriptor2, 0, bl2.a, null);
            Integer num2 = (Integer) b.g(descriptor2, 1, en3.a, null);
            String str2 = (String) b.g(descriptor2, 2, l48.a, null);
            list = (List) b.g(descriptor2, 3, kSerializerArr[3], null);
            f = f3;
            str = str2;
            i = 15;
            num = num2;
        } else {
            boolean z = true;
            int i2 = 0;
            Integer num3 = null;
            String str3 = null;
            List list2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    f2 = (Float) b.g(descriptor2, 0, bl2.a, f2);
                    i2 |= 1;
                } else if (o == 1) {
                    num3 = (Integer) b.g(descriptor2, 1, en3.a, num3);
                    i2 |= 2;
                } else if (o == 2) {
                    str3 = (String) b.g(descriptor2, 2, l48.a, str3);
                    i2 |= 4;
                } else {
                    if (o != 3) {
                        throw new UnknownFieldException(o);
                    }
                    list2 = (List) b.g(descriptor2, 3, kSerializerArr[3], list2);
                    i2 |= 8;
                }
            }
            i = i2;
            f = f2;
            num = num3;
            str = str3;
            list = list2;
        }
        b.c(descriptor2);
        return new Interest.CompletedNewsQuizData(i, f, num, str, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Interest.CompletedNewsQuizData completedNewsQuizData) {
        zq3.h(encoder, "encoder");
        zq3.h(completedNewsQuizData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Interest.CompletedNewsQuizData.e(completedNewsQuizData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
