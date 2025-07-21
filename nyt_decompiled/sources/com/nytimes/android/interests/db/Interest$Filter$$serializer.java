package com.nytimes.android.interests.db;

import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.interests.db.Interest;
import defpackage.en3;
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
public final class Interest$Filter$$serializer implements jx2 {
    public static final Interest$Filter$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Interest$Filter$$serializer interest$Filter$$serializer = new Interest$Filter$$serializer();
        INSTANCE = interest$Filter$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.Interest.Filter", interest$Filter$$serializer, 3);
        pluginGeneratedSerialDescriptor.l(AuthenticationTokenClaims.JSON_KEY_NAME, false);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("assets", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Interest$Filter$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Interest.Filter.d;
        return new KSerializer[]{l48.a, en3.a, kSerializerArr[2]};
    }

    @Override // defpackage.ym1
    public Interest.Filter deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        int i2;
        String str;
        List list;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = Interest.Filter.d;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            int j = b.j(descriptor2, 1);
            list = (List) b.y(descriptor2, 2, kSerializerArr[2], null);
            str = n;
            i = 7;
            i2 = j;
        } else {
            boolean z = true;
            int i3 = 0;
            String str2 = null;
            List list2 = null;
            int i4 = 0;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str2 = b.n(descriptor2, 0);
                    i3 |= 1;
                } else if (o == 1) {
                    i4 = b.j(descriptor2, 1);
                    i3 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    list2 = (List) b.y(descriptor2, 2, kSerializerArr[2], list2);
                    i3 |= 4;
                }
            }
            i = i3;
            i2 = i4;
            str = str2;
            list = list2;
        }
        b.c(descriptor2);
        return new Interest.Filter(i, str, i2, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Interest.Filter filter) {
        zq3.h(encoder, "encoder");
        zq3.h(filter, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Interest.Filter.e(filter, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
