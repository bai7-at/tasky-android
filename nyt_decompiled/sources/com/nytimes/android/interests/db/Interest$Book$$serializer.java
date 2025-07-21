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
public final class Interest$Book$$serializer implements jx2 {
    public static final Interest$Book$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Interest$Book$$serializer interest$Book$$serializer = new Interest$Book$$serializer();
        INSTANCE = interest$Book$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.Interest.Book", interest$Book$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("link", false);
        pluginGeneratedSerialDescriptor.l("promoImageURL", false);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("listName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Interest$Book$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, l48Var, l48Var, l48Var};
    }

    @Override // defpackage.ym1
    public Interest.Book deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            String n3 = b.n(descriptor2, 2);
            str = n;
            str2 = b.n(descriptor2, 3);
            str3 = n3;
            str4 = n2;
            i = 15;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str5 = b.n(descriptor2, 0);
                    i2 |= 1;
                } else if (o == 1) {
                    str8 = b.n(descriptor2, 1);
                    i2 |= 2;
                } else if (o == 2) {
                    str7 = b.n(descriptor2, 2);
                    i2 |= 4;
                } else {
                    if (o != 3) {
                        throw new UnknownFieldException(o);
                    }
                    str6 = b.n(descriptor2, 3);
                    i2 |= 8;
                }
            }
            str = str5;
            str2 = str6;
            str3 = str7;
            str4 = str8;
            i = i2;
        }
        b.c(descriptor2);
        return new Interest.Book(i, str, str4, str3, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Interest.Book book) {
        zq3.h(encoder, "encoder");
        zq3.h(book, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Interest.Book.e(book, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
