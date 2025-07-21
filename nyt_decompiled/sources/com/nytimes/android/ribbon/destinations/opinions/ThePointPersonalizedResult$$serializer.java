package com.nytimes.android.ribbon.destinations.opinions;

import defpackage.he0;
import defpackage.jx2;
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
public final class ThePointPersonalizedResult$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final ThePointPersonalizedResult$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ThePointPersonalizedResult$$serializer thePointPersonalizedResult$$serializer = new ThePointPersonalizedResult$$serializer();
        INSTANCE = thePointPersonalizedResult$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.opinions.ThePointPersonalizedResult", thePointPersonalizedResult$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("articleData", false);
        pluginGeneratedSerialDescriptor.l("authorData", false);
        pluginGeneratedSerialDescriptor.l("trackingParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ThePointPersonalizedResult$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = ThePointPersonalizedResult.e;
        return new KSerializer[]{ThePointArticleData$$serializer.INSTANCE, he0.u(ThePointAuthorData$$serializer.INSTANCE), he0.u(kSerializerArr[2])};
    }

    @Override // defpackage.ym1
    public ThePointPersonalizedResult deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        ThePointArticleData thePointArticleData;
        ThePointAuthorData thePointAuthorData;
        Map map;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = ThePointPersonalizedResult.e;
        ThePointArticleData thePointArticleData2 = null;
        if (b.p()) {
            ThePointArticleData thePointArticleData3 = (ThePointArticleData) b.y(descriptor2, 0, ThePointArticleData$$serializer.INSTANCE, null);
            ThePointAuthorData thePointAuthorData2 = (ThePointAuthorData) b.g(descriptor2, 1, ThePointAuthorData$$serializer.INSTANCE, null);
            map = (Map) b.g(descriptor2, 2, kSerializerArr[2], null);
            thePointArticleData = thePointArticleData3;
            i = 7;
            thePointAuthorData = thePointAuthorData2;
        } else {
            boolean z = true;
            int i2 = 0;
            ThePointAuthorData thePointAuthorData3 = null;
            Map map2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    thePointArticleData2 = (ThePointArticleData) b.y(descriptor2, 0, ThePointArticleData$$serializer.INSTANCE, thePointArticleData2);
                    i2 |= 1;
                } else if (o == 1) {
                    thePointAuthorData3 = (ThePointAuthorData) b.g(descriptor2, 1, ThePointAuthorData$$serializer.INSTANCE, thePointAuthorData3);
                    i2 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    map2 = (Map) b.g(descriptor2, 2, kSerializerArr[2], map2);
                    i2 |= 4;
                }
            }
            i = i2;
            thePointArticleData = thePointArticleData2;
            thePointAuthorData = thePointAuthorData3;
            map = map2;
        }
        b.c(descriptor2);
        return new ThePointPersonalizedResult(i, thePointArticleData, thePointAuthorData, map, (mk7) null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, ThePointPersonalizedResult thePointPersonalizedResult) {
        zq3.h(encoder, "encoder");
        zq3.h(thePointPersonalizedResult, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        ThePointPersonalizedResult.b(thePointPersonalizedResult, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
