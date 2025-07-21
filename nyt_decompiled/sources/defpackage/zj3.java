package defpackage;

import com.facebook.AuthenticationTokenClaims;
import defpackage.jx2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public abstract class zj3 {

    public static final class a implements jx2 {
        final /* synthetic */ KSerializer a;

        a(KSerializer kSerializer) {
            this.a = kSerializer;
        }

        @Override // defpackage.jx2
        public KSerializer[] childSerializers() {
            return new KSerializer[]{this.a};
        }

        @Override // defpackage.ym1
        public Object deserialize(Decoder decoder) {
            zq3.h(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
        public SerialDescriptor getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // defpackage.nk7
        public void serialize(Encoder encoder, Object obj) {
            zq3.h(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // defpackage.jx2
        public KSerializer[] typeParametersSerializers() {
            return jx2.a.a(this);
        }
    }

    public static final SerialDescriptor a(String str, KSerializer kSerializer) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(kSerializer, "primitiveSerializer");
        return new yj3(str, new a(kSerializer));
    }
}
