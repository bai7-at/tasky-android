package com.nytimes.android.interests.db;

import com.nytimes.android.interests.db.Interest;
import defpackage.jx2;
import defpackage.zq3;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final class Interest$FilterInterest$$serializer implements jx2 {
    public static final Interest$FilterInterest$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Interest$FilterInterest$$serializer interest$FilterInterest$$serializer = new Interest$FilterInterest$$serializer();
        INSTANCE = interest$FilterInterest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.Interest.FilterInterest", interest$FilterInterest$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("filterOrder", false);
        pluginGeneratedSerialDescriptor.l("filters", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Interest$FilterInterest$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Interest.FilterInterest.d;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // defpackage.ym1
    public Interest.FilterInterest deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        Set set;
        List list;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = Interest.FilterInterest.d;
        if (b.p()) {
            list = (List) b.y(descriptor2, 0, kSerializerArr[0], null);
            set = (Set) b.y(descriptor2, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Set set2 = null;
            List list2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    list2 = (List) b.y(descriptor2, 0, kSerializerArr[0], list2);
                    i2 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    set2 = (Set) b.y(descriptor2, 1, kSerializerArr[1], set2);
                    i2 |= 2;
                }
            }
            set = set2;
            list = list2;
            i = i2;
        }
        b.c(descriptor2);
        return new Interest.FilterInterest(i, list, set, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Interest.FilterInterest filterInterest) {
        zq3.h(encoder, "encoder");
        zq3.h(filterInterest, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Interest.FilterInterest.f(filterInterest, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
