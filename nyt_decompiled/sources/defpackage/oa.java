package defpackage;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.c;
import com.google.crypto.tink.g;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.m;

/* loaded from: classes3.dex */
public final class oa extends c {

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public o9 a(ma maVar) {
            return new la(maVar.N().y());
        }
    }

    class b extends c.a {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ma a(na naVar) {
            return (ma) ma.P().u(ByteString.g(po6.c(naVar.M()))).v(oa.this.l()).l();
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public na c(ByteString byteString) {
            return na.O(byteString, m.b());
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(na naVar) {
            q39.a(naVar.M());
        }
    }

    oa() {
        super(ma.class, new a(o9.class));
    }

    public static final KeyTemplate j() {
        return k(32, KeyTemplate.OutputPrefixType.TINK);
    }

    private static KeyTemplate k(int i, KeyTemplate.OutputPrefixType outputPrefixType) {
        return KeyTemplate.a(new oa().c(), ((na) na.N().u(i).l()).f(), outputPrefixType);
    }

    public static void n(boolean z) {
        g.q(new oa(), z);
    }

    @Override // com.google.crypto.tink.c
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.crypto.tink.c
    public c.a e() {
        return new b(na.class);
    }

    @Override // com.google.crypto.tink.c
    public KeyData.KeyMaterialType f() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public ma g(ByteString byteString) {
        return ma.Q(byteString, m.b());
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void i(ma maVar) {
        q39.c(maVar.O(), l());
        q39.a(maVar.N().size());
    }
}
