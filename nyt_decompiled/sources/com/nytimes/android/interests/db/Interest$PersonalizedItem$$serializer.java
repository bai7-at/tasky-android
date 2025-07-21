package com.nytimes.android.interests.db;

import com.nytimes.android.interests.db.Interest;
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
public final class Interest$PersonalizedItem$$serializer implements jx2 {
    public static final Interest$PersonalizedItem$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Interest$PersonalizedItem$$serializer interest$PersonalizedItem$$serializer = new Interest$PersonalizedItem$$serializer();
        INSTANCE = interest$PersonalizedItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.Interest.PersonalizedItem", interest$PersonalizedItem$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("asset", false);
        pluginGeneratedSerialDescriptor.l("trackingParams", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Interest$PersonalizedItem$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Interest.PersonalizedItem.c;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // defpackage.ym1
    public Interest.PersonalizedItem deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        InterestAsset interestAsset;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = Interest.PersonalizedItem.c;
        if (b.p()) {
            interestAsset = (InterestAsset) b.y(descriptor2, 0, kSerializerArr[0], null);
            list = (List) b.y(descriptor2, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            InterestAsset interestAsset2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    interestAsset2 = (InterestAsset) b.y(descriptor2, 0, kSerializerArr[0], interestAsset2);
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
            interestAsset = interestAsset2;
            i = i2;
        }
        b.c(descriptor2);
        return new Interest.PersonalizedItem(i, interestAsset, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Interest.PersonalizedItem personalizedItem) {
        zq3.h(encoder, "encoder");
        zq3.h(personalizedItem, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Interest.PersonalizedItem.d(personalizedItem, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
