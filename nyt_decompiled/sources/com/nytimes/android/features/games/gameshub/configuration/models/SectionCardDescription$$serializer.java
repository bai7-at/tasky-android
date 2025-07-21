package com.nytimes.android.features.games.gameshub.configuration.models;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
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
public final class SectionCardDescription$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final SectionCardDescription$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SectionCardDescription$$serializer sectionCardDescription$$serializer = new SectionCardDescription$$serializer();
        INSTANCE = sectionCardDescription$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.configuration.models.SectionCardDescription", sectionCardDescription$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l(TransferTable.COLUMN_TYPE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SectionCardDescription$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = SectionCardDescription.c;
        return new KSerializer[]{l48.a, kSerializerArr[1]};
    }

    @Override // defpackage.ym1
    public SectionCardDescription deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        CardType cardType;
        String str;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = SectionCardDescription.c;
        if (b.p()) {
            str = b.n(descriptor2, 0);
            cardType = (CardType) b.y(descriptor2, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            CardType cardType2 = null;
            String str2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str2 = b.n(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    cardType2 = (CardType) b.y(descriptor2, 1, kSerializerArr[1], cardType2);
                    i2 |= 2;
                }
            }
            cardType = cardType2;
            str = str2;
            i = i2;
        }
        b.c(descriptor2);
        return new SectionCardDescription(i, str, cardType, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, SectionCardDescription sectionCardDescription) {
        zq3.h(encoder, "encoder");
        zq3.h(sectionCardDescription, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        SectionCardDescription.d(sectionCardDescription, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
