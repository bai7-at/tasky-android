package com.nytimes.android.interests.db;

import com.nytimes.android.interests.db.Interest;
import defpackage.en3;
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
public final class Interest$BooksInterest$$serializer implements jx2 {
    public static final Interest$BooksInterest$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Interest$BooksInterest$$serializer interest$BooksInterest$$serializer = new Interest$BooksInterest$$serializer();
        INSTANCE = interest$BooksInterest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.Interest.BooksInterest", interest$BooksInterest$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("totalSaved", false);
        pluginGeneratedSerialDescriptor.l("savedBooks", false);
        pluginGeneratedSerialDescriptor.l("sourceInteractives", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Interest$BooksInterest$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Interest.BooksInterest.e;
        return new KSerializer[]{en3.a, kSerializerArr[1], kSerializerArr[2]};
    }

    @Override // defpackage.ym1
    public Interest.BooksInterest deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        int i2;
        List list;
        List list2;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = Interest.BooksInterest.e;
        if (b.p()) {
            int j = b.j(descriptor2, 0);
            List list3 = (List) b.y(descriptor2, 1, kSerializerArr[1], null);
            list2 = (List) b.y(descriptor2, 2, kSerializerArr[2], null);
            i = j;
            i2 = 7;
            list = list3;
        } else {
            boolean z = true;
            int i3 = 0;
            List list4 = null;
            List list5 = null;
            int i4 = 0;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    i3 = b.j(descriptor2, 0);
                    i4 |= 1;
                } else if (o == 1) {
                    list4 = (List) b.y(descriptor2, 1, kSerializerArr[1], list4);
                    i4 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    list5 = (List) b.y(descriptor2, 2, kSerializerArr[2], list5);
                    i4 |= 4;
                }
            }
            i = i3;
            i2 = i4;
            list = list4;
            list2 = list5;
        }
        b.c(descriptor2);
        return new Interest.BooksInterest(i2, i, list, list2, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Interest.BooksInterest booksInterest) {
        zq3.h(encoder, "encoder");
        zq3.h(booksInterest, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Interest.BooksInterest.h(booksInterest, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
