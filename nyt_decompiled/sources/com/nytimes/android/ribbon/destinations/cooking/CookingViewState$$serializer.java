package com.nytimes.android.ribbon.destinations.cooking;

import defpackage.he0;
import defpackage.jx2;
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
public final class CookingViewState$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final CookingViewState$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CookingViewState$$serializer cookingViewState$$serializer = new CookingViewState$$serializer();
        INSTANCE = cookingViewState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.cooking.CookingViewState", cookingViewState$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("hero", false);
        pluginGeneratedSerialDescriptor.l("programmedArticleData", false);
        pluginGeneratedSerialDescriptor.l("carouselModules", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CookingViewState$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = CookingViewState.e;
        return new KSerializer[]{CookingHeroData$$serializer.INSTANCE, he0.u(ProgrammedArticleData$$serializer.INSTANCE), kSerializerArr[2]};
    }

    @Override // defpackage.ym1
    public CookingViewState deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        CookingHeroData cookingHeroData;
        ProgrammedArticleData programmedArticleData;
        List list;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = CookingViewState.e;
        CookingHeroData cookingHeroData2 = null;
        if (b.p()) {
            CookingHeroData cookingHeroData3 = (CookingHeroData) b.y(descriptor2, 0, CookingHeroData$$serializer.INSTANCE, null);
            ProgrammedArticleData programmedArticleData2 = (ProgrammedArticleData) b.g(descriptor2, 1, ProgrammedArticleData$$serializer.INSTANCE, null);
            list = (List) b.y(descriptor2, 2, kSerializerArr[2], null);
            cookingHeroData = cookingHeroData3;
            i = 7;
            programmedArticleData = programmedArticleData2;
        } else {
            boolean z = true;
            int i2 = 0;
            ProgrammedArticleData programmedArticleData3 = null;
            List list2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    cookingHeroData2 = (CookingHeroData) b.y(descriptor2, 0, CookingHeroData$$serializer.INSTANCE, cookingHeroData2);
                    i2 |= 1;
                } else if (o == 1) {
                    programmedArticleData3 = (ProgrammedArticleData) b.g(descriptor2, 1, ProgrammedArticleData$$serializer.INSTANCE, programmedArticleData3);
                    i2 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    list2 = (List) b.y(descriptor2, 2, kSerializerArr[2], list2);
                    i2 |= 4;
                }
            }
            i = i2;
            cookingHeroData = cookingHeroData2;
            programmedArticleData = programmedArticleData3;
            list = list2;
        }
        b.c(descriptor2);
        return new CookingViewState(i, cookingHeroData, programmedArticleData, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, CookingViewState cookingViewState) {
        zq3.h(encoder, "encoder");
        zq3.h(cookingViewState, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        CookingViewState.e(cookingViewState, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
