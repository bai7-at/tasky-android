package com.nytimes.android.interests.db;

import com.nytimes.android.interests.db.Interest;
import defpackage.jx2;
import defpackage.l48;
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
public final class Interest$NewsQuizInterest$$serializer implements jx2 {
    public static final Interest$NewsQuizInterest$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Interest$NewsQuizInterest$$serializer interest$NewsQuizInterest$$serializer = new Interest$NewsQuizInterest$$serializer();
        INSTANCE = interest$NewsQuizInterest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.Interest.NewsQuizInterest", interest$NewsQuizInterest$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("completedQuiz", false);
        pluginGeneratedSerialDescriptor.l("initialQuizData", false);
        pluginGeneratedSerialDescriptor.l("collectionUrl", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Interest$NewsQuizInterest$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        return new KSerializer[]{Interest$CompletedNewsQuizData$$serializer.INSTANCE, Interest$InitialNewsQuizData$$serializer.INSTANCE, l48.a};
    }

    @Override // defpackage.ym1
    public Interest.NewsQuizInterest deserialize(Decoder decoder) {
        int i;
        Interest.CompletedNewsQuizData completedNewsQuizData;
        Interest.InitialNewsQuizData initialNewsQuizData;
        String str;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        Interest.CompletedNewsQuizData completedNewsQuizData2 = null;
        if (b.p()) {
            Interest.CompletedNewsQuizData completedNewsQuizData3 = (Interest.CompletedNewsQuizData) b.y(descriptor2, 0, Interest$CompletedNewsQuizData$$serializer.INSTANCE, null);
            Interest.InitialNewsQuizData initialNewsQuizData2 = (Interest.InitialNewsQuizData) b.y(descriptor2, 1, Interest$InitialNewsQuizData$$serializer.INSTANCE, null);
            completedNewsQuizData = completedNewsQuizData3;
            str = b.n(descriptor2, 2);
            initialNewsQuizData = initialNewsQuizData2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            Interest.InitialNewsQuizData initialNewsQuizData3 = null;
            String str2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    completedNewsQuizData2 = (Interest.CompletedNewsQuizData) b.y(descriptor2, 0, Interest$CompletedNewsQuizData$$serializer.INSTANCE, completedNewsQuizData2);
                    i2 |= 1;
                } else if (o == 1) {
                    initialNewsQuizData3 = (Interest.InitialNewsQuizData) b.y(descriptor2, 1, Interest$InitialNewsQuizData$$serializer.INSTANCE, initialNewsQuizData3);
                    i2 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    str2 = b.n(descriptor2, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            completedNewsQuizData = completedNewsQuizData2;
            initialNewsQuizData = initialNewsQuizData3;
            str = str2;
        }
        b.c(descriptor2);
        return new Interest.NewsQuizInterest(i, completedNewsQuizData, initialNewsQuizData, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Interest.NewsQuizInterest newsQuizInterest) {
        zq3.h(encoder, "encoder");
        zq3.h(newsQuizInterest, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Interest.NewsQuizInterest.g(newsQuizInterest, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
