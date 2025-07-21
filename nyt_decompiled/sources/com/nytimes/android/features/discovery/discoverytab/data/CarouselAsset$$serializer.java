package com.nytimes.android.features.discovery.discoverytab.data;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.unfear.reader.model.ImageElement;
import com.nytimes.android.unfear.reader.model.ImageElement$$serializer;
import defpackage.he0;
import defpackage.ib4;
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
public final class CarouselAsset$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final CarouselAsset$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CarouselAsset$$serializer carouselAsset$$serializer = new CarouselAsset$$serializer();
        INSTANCE = carouselAsset$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.discovery.discoverytab.data.CarouselAsset", carouselAsset$$serializer, 9);
        pluginGeneratedSerialDescriptor.l("uri", false);
        pluginGeneratedSerialDescriptor.l("uriForLink", false);
        pluginGeneratedSerialDescriptor.l("url", false);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("sectionDisplayName", false);
        pluginGeneratedSerialDescriptor.l("byline", false);
        pluginGeneratedSerialDescriptor.l("squareImage", false);
        pluginGeneratedSerialDescriptor.l("largeImage", false);
        pluginGeneratedSerialDescriptor.l("lastModified", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CarouselAsset$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        KSerializer u = he0.u(l48Var);
        KSerializer u2 = he0.u(l48Var);
        ImageElement$$serializer imageElement$$serializer = ImageElement$$serializer.INSTANCE;
        return new KSerializer[]{l48Var, l48Var, u, l48Var, l48Var, u2, he0.u(imageElement$$serializer), he0.u(imageElement$$serializer), ib4.a};
    }

    @Override // defpackage.ym1
    public CarouselAsset deserialize(Decoder decoder) {
        int i;
        ImageElement imageElement;
        ImageElement imageElement2;
        String str;
        String str2;
        String str3;
        long j;
        String str4;
        String str5;
        String str6;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        int i2 = 7;
        int i3 = 6;
        String str7 = null;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            l48 l48Var = l48.a;
            String str8 = (String) b.g(descriptor2, 2, l48Var, null);
            String n3 = b.n(descriptor2, 3);
            String n4 = b.n(descriptor2, 4);
            String str9 = (String) b.g(descriptor2, 5, l48Var, null);
            ImageElement$$serializer imageElement$$serializer = ImageElement$$serializer.INSTANCE;
            ImageElement imageElement3 = (ImageElement) b.g(descriptor2, 6, imageElement$$serializer, null);
            str3 = n;
            imageElement = (ImageElement) b.g(descriptor2, 7, imageElement$$serializer, null);
            imageElement2 = imageElement3;
            str = str9;
            str5 = n3;
            i = 511;
            str6 = n4;
            str2 = str8;
            str4 = n2;
            j = b.f(descriptor2, 8);
        } else {
            long j2 = 0;
            boolean z = true;
            int i4 = 0;
            ImageElement imageElement4 = null;
            ImageElement imageElement5 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i3 = 6;
                    case 0:
                        i4 |= 1;
                        str7 = b.n(descriptor2, 0);
                        i2 = 7;
                        i3 = 6;
                    case 1:
                        str12 = b.n(descriptor2, 1);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 6;
                    case 2:
                        str11 = (String) b.g(descriptor2, 2, l48.a, str11);
                        i4 |= 4;
                        i2 = 7;
                        i3 = 6;
                    case 3:
                        str13 = b.n(descriptor2, 3);
                        i4 |= 8;
                        i2 = 7;
                    case 4:
                        str14 = b.n(descriptor2, 4);
                        i4 |= 16;
                    case 5:
                        str10 = (String) b.g(descriptor2, 5, l48.a, str10);
                        i4 |= 32;
                    case 6:
                        imageElement5 = (ImageElement) b.g(descriptor2, i3, ImageElement$$serializer.INSTANCE, imageElement5);
                        i4 |= 64;
                    case 7:
                        imageElement4 = (ImageElement) b.g(descriptor2, i2, ImageElement$$serializer.INSTANCE, imageElement4);
                        i4 |= 128;
                    case 8:
                        j2 = b.f(descriptor2, 8);
                        i4 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i4;
            imageElement = imageElement4;
            imageElement2 = imageElement5;
            str = str10;
            str2 = str11;
            str3 = str7;
            j = j2;
            str4 = str12;
            str5 = str13;
            str6 = str14;
        }
        b.c(descriptor2);
        return new CarouselAsset(i, str3, str4, str2, str5, str6, str, imageElement2, imageElement, j, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, CarouselAsset carouselAsset) {
        zq3.h(encoder, "encoder");
        zq3.h(carouselAsset, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        CarouselAsset.j(carouselAsset, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
