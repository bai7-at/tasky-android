package com.nytimes.android.unfear.nytdesignsystem.model;

import com.nytimes.android.designsystem.uicompose.ui.NytTextStyle;
import defpackage.jx2;
import defpackage.l48;
import defpackage.mk7;
import defpackage.za0;
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
public final class StyledText$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final StyledText$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StyledText$$serializer styledText$$serializer = new StyledText$$serializer();
        INSTANCE = styledText$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.unfear.nytdesignsystem.model.StyledText", styledText$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("text", false);
        pluginGeneratedSerialDescriptor.l("style", false);
        pluginGeneratedSerialDescriptor.l("useReadStyle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StyledText$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = StyledText.e;
        return new KSerializer[]{l48.a, kSerializerArr[1], za0.a};
    }

    @Override // defpackage.ym1
    public StyledText deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        boolean z;
        int i;
        String str;
        NytTextStyle nytTextStyle;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = StyledText.e;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            nytTextStyle = (NytTextStyle) b.y(descriptor2, 1, kSerializerArr[1], null);
            str = n;
            z = b.D(descriptor2, 2);
            i = 7;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            String str2 = null;
            NytTextStyle nytTextStyle2 = null;
            int i2 = 0;
            while (z2) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z2 = false;
                } else if (o == 0) {
                    str2 = b.n(descriptor2, 0);
                    i2 |= 1;
                } else if (o == 1) {
                    nytTextStyle2 = (NytTextStyle) b.y(descriptor2, 1, kSerializerArr[1], nytTextStyle2);
                    i2 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    z3 = b.D(descriptor2, 2);
                    i2 |= 4;
                }
            }
            z = z3;
            i = i2;
            str = str2;
            nytTextStyle = nytTextStyle2;
        }
        b.c(descriptor2);
        return new StyledText(i, str, nytTextStyle, z, (mk7) null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, StyledText styledText) {
        zq3.h(encoder, "encoder");
        zq3.h(styledText, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        StyledText.e(styledText, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
