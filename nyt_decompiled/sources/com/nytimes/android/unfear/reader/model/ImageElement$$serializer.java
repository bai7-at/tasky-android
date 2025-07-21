package com.nytimes.android.unfear.reader.model;

import defpackage.en3;
import defpackage.he0;
import defpackage.jx2;
import defpackage.l48;
import defpackage.mk7;
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
public final class ImageElement$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final ImageElement$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ImageElement$$serializer imageElement$$serializer = new ImageElement$$serializer();
        INSTANCE = imageElement$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.unfear.reader.model.ImageElement", imageElement$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("height", false);
        pluginGeneratedSerialDescriptor.l("width", false);
        pluginGeneratedSerialDescriptor.l("url", false);
        pluginGeneratedSerialDescriptor.l("credit", false);
        pluginGeneratedSerialDescriptor.l("contentDescription", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ImageElement$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        KSerializer u = he0.u(l48Var);
        KSerializer u2 = he0.u(l48Var);
        en3 en3Var = en3.a;
        return new KSerializer[]{en3Var, en3Var, l48Var, u, u2};
    }

    @Override // defpackage.ym1
    public ImageElement deserialize(Decoder decoder) {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            int j = b.j(descriptor2, 0);
            int j2 = b.j(descriptor2, 1);
            String n = b.n(descriptor2, 2);
            l48 l48Var = l48.a;
            i = j;
            str2 = (String) b.g(descriptor2, 3, l48Var, null);
            str3 = (String) b.g(descriptor2, 4, l48Var, null);
            str = n;
            i2 = j2;
            i3 = 31;
        } else {
            boolean z = true;
            int i4 = 0;
            int i5 = 0;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            int i6 = 0;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    i4 = b.j(descriptor2, 0);
                    i5 |= 1;
                } else if (o == 1) {
                    i6 = b.j(descriptor2, 1);
                    i5 |= 2;
                } else if (o == 2) {
                    str4 = b.n(descriptor2, 2);
                    i5 |= 4;
                } else if (o == 3) {
                    str5 = (String) b.g(descriptor2, 3, l48.a, str5);
                    i5 |= 8;
                } else {
                    if (o != 4) {
                        throw new UnknownFieldException(o);
                    }
                    str6 = (String) b.g(descriptor2, 4, l48.a, str6);
                    i5 |= 16;
                }
            }
            i = i4;
            i2 = i6;
            i3 = i5;
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        b.c(descriptor2);
        return new ImageElement(i3, i, i2, str, str2, str3, (mk7) null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, ImageElement imageElement) {
        zq3.h(encoder, "encoder");
        zq3.h(imageElement, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        ImageElement.h(imageElement, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
