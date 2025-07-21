package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public abstract class ot3 {

    public static final class a implements SerialDescriptor {
        private final c04 a;

        a(qs2 qs2Var) {
            this.a = c.a(qs2Var);
        }

        private final SerialDescriptor a() {
            return (SerialDescriptor) this.a.getValue();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean b() {
            return SerialDescriptor.a.c(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int c(String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return a().c(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public hk7 d() {
            return a().d();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int e() {
            return a().e();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String f(int i) {
            return a().f(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List g(int i) {
            return a().g(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List getAnnotations() {
            return SerialDescriptor.a.a(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialDescriptor h(int i) {
            return a().h(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String i() {
            return a().i();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isInline() {
            return SerialDescriptor.a.b(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean j(int i) {
            return a().j(i);
        }
    }

    public static final lt3 d(Decoder decoder) {
        zq3.h(decoder, "<this>");
        lt3 lt3Var = decoder instanceof lt3 ? (lt3) decoder : null;
        if (lt3Var != null) {
            return lt3Var;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + zt6.b(decoder.getClass()));
    }

    public static final pt3 e(Encoder encoder) {
        zq3.h(encoder, "<this>");
        pt3 pt3Var = encoder instanceof pt3 ? (pt3) encoder : null;
        if (pt3Var != null) {
            return pt3Var;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + zt6.b(encoder.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor f(qs2 qs2Var) {
        return new a(qs2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Decoder decoder) {
        d(decoder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Encoder encoder) {
        e(encoder);
    }
}
