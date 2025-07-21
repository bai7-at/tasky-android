package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes5.dex */
public final class au3 implements KSerializer {
    public static final au3 a = new au3();
    private static final SerialDescriptor b = a.b;

    private static final class a implements SerialDescriptor {
        public static final a b = new a();
        private static final String c = "kotlinx.serialization.json.JsonObject";
        private final /* synthetic */ SerialDescriptor a = he0.k(he0.D(z38.a), JsonElementSerializer.a).getDescriptor();

        private a() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean b() {
            return this.a.b();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int c(String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return this.a.c(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public hk7 d() {
            return this.a.d();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int e() {
            return this.a.e();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String f(int i) {
            return this.a.f(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List g(int i) {
            return this.a.g(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List getAnnotations() {
            return this.a.getAnnotations();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialDescriptor h(int i) {
            return this.a.h(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String i() {
            return c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isInline() {
            return this.a.isInline();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean j(int i) {
            return this.a.j(i);
        }
    }

    private au3() {
    }

    @Override // defpackage.ym1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonObject deserialize(Decoder decoder) {
        zq3.h(decoder, "decoder");
        ot3.g(decoder);
        return new JsonObject((Map) he0.k(he0.D(z38.a), JsonElementSerializer.a).deserialize(decoder));
    }

    @Override // defpackage.nk7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, JsonObject jsonObject) {
        zq3.h(encoder, "encoder");
        zq3.h(jsonObject, "value");
        ot3.h(encoder);
        he0.k(he0.D(z38.a), JsonElementSerializer.a).serialize(encoder, jsonObject);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return b;
    }
}
