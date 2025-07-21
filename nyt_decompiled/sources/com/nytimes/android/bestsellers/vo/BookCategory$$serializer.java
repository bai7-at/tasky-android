package com.nytimes.android.bestsellers.vo;

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

/* loaded from: classes.dex */
public final class BookCategory$$serializer implements jx2 {
    public static final BookCategory$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BookCategory$$serializer bookCategory$$serializer = new BookCategory$$serializer();
        INSTANCE = bookCategory$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.bestsellers.vo.BookCategory", bookCategory$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("categoryKey", false);
        pluginGeneratedSerialDescriptor.l("headlineDate", false);
        pluginGeneratedSerialDescriptor.l("categoryName", false);
        pluginGeneratedSerialDescriptor.l("summaryDate", false);
        pluginGeneratedSerialDescriptor.l("books", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BookCategory$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = BookCategory.$childSerializers;
        KSerializer kSerializer = kSerializerArr[4];
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, l48Var, l48Var, l48Var, kSerializer};
    }

    @Override // defpackage.ym1
    public BookCategory deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        List list;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = BookCategory.$childSerializers;
        String str5 = null;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            String n3 = b.n(descriptor2, 2);
            String n4 = b.n(descriptor2, 3);
            list = (List) b.y(descriptor2, 4, kSerializerArr[4], null);
            str = n;
            str4 = n4;
            str3 = n3;
            i = 31;
            str2 = n2;
        } else {
            boolean z = true;
            int i2 = 0;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            List list2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str5 = b.n(descriptor2, 0);
                    i2 |= 1;
                } else if (o == 1) {
                    str6 = b.n(descriptor2, 1);
                    i2 |= 2;
                } else if (o == 2) {
                    str7 = b.n(descriptor2, 2);
                    i2 |= 4;
                } else if (o == 3) {
                    str8 = b.n(descriptor2, 3);
                    i2 |= 8;
                } else {
                    if (o != 4) {
                        throw new UnknownFieldException(o);
                    }
                    list2 = (List) b.y(descriptor2, 4, kSerializerArr[4], list2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str5;
            str2 = str6;
            str3 = str7;
            str4 = str8;
            list = list2;
        }
        b.c(descriptor2);
        return new BookCategory(i, str, str2, str3, str4, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, BookCategory bookCategory) {
        zq3.h(encoder, "encoder");
        zq3.h(bookCategory, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        BookCategory.write$Self$bestsellers_release(bookCategory, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
