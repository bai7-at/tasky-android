package kotlinx.serialization.internal;

import defpackage.c04;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class EnumSerializer implements KSerializer {
    private final Enum[] a;
    private SerialDescriptor b;
    private final c04 c;

    public EnumSerializer(final String str, Enum[] enumArr) {
        zq3.h(str, "serialName");
        zq3.h(enumArr, "values");
        this.a = enumArr;
        this.c = kotlin.c.a(new qs2() { // from class: kotlinx.serialization.internal.EnumSerializer$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SerialDescriptor mo865invoke() {
                SerialDescriptor serialDescriptor;
                SerialDescriptor c;
                serialDescriptor = EnumSerializer.this.b;
                if (serialDescriptor != null) {
                    return serialDescriptor;
                }
                c = EnumSerializer.this.c(str);
                return c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SerialDescriptor c(String str) {
        EnumDescriptor enumDescriptor = new EnumDescriptor(str, this.a.length);
        for (Enum r0 : this.a) {
            PluginGeneratedSerialDescriptor.m(enumDescriptor, r0.name(), false, 2, null);
        }
        return enumDescriptor;
    }

    @Override // defpackage.ym1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        int e = decoder.e(getDescriptor());
        if (e >= 0) {
            Enum[] enumArr = this.a;
            if (e < enumArr.length) {
                return enumArr[e];
            }
        }
        throw new SerializationException(e + " is not among valid " + getDescriptor().i() + " enum values, values size is " + this.a.length);
    }

    @Override // defpackage.nk7
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, Enum r4) {
        zq3.h(encoder, "encoder");
        zq3.h(r4, "value");
        int k0 = kotlin.collections.d.k0(this.a, r4);
        if (k0 != -1) {
            encoder.i(getDescriptor(), k0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r4);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().i());
        sb.append(", must be one of ");
        String arrays = Arrays.toString(this.a);
        zq3.g(arrays, "toString(this)");
        sb.append(arrays);
        throw new SerializationException(sb.toString());
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().i() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumSerializer(String str, Enum[] enumArr, SerialDescriptor serialDescriptor) {
        this(str, enumArr);
        zq3.h(str, "serialName");
        zq3.h(enumArr, "values");
        zq3.h(serialDescriptor, "descriptor");
        this.b = serialDescriptor;
    }
}
