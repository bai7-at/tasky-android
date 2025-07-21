package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.m;

/* loaded from: classes3.dex */
public final class y9 extends GeneratedMessageLite implements or4 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final y9 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile ap5 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ca aesCtrKey_;
    private h93 hmacKey_;
    private int version_;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.a implements or4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b u(ca caVar) {
            o();
            ((y9) this.b).T(caVar);
            return this;
        }

        public b v(h93 h93Var) {
            o();
            ((y9) this.b).U(h93Var);
            return this;
        }

        public b w(int i) {
            o();
            ((y9) this.b).V(i);
            return this;
        }

        private b() {
            super(y9.DEFAULT_INSTANCE);
        }
    }

    static {
        y9 y9Var = new y9();
        DEFAULT_INSTANCE = y9Var;
        GeneratedMessageLite.I(y9.class, y9Var);
    }

    private y9() {
    }

    public static b R() {
        return (b) DEFAULT_INSTANCE.p();
    }

    public static y9 S(ByteString byteString, m mVar) {
        return (y9) GeneratedMessageLite.D(DEFAULT_INSTANCE, byteString, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(ca caVar) {
        caVar.getClass();
        this.aesCtrKey_ = caVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(h93 h93Var) {
        h93Var.getClass();
        this.hmacKey_ = h93Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i) {
        this.version_ = i;
    }

    public ca O() {
        ca caVar = this.aesCtrKey_;
        return caVar == null ? ca.O() : caVar;
    }

    public h93 P() {
        h93 h93Var = this.hmacKey_;
        return h93Var == null ? h93.O() : h93Var;
    }

    public int Q() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        a aVar = null;
        switch (i) {
            case 1:
                return new y9();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.C(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ap5 ap5Var = PARSER;
                if (ap5Var == null) {
                    synchronized (y9.class) {
                        try {
                            ap5Var = PARSER;
                            if (ap5Var == null) {
                                ap5Var = new GeneratedMessageLite.b(DEFAULT_INSTANCE);
                                PARSER = ap5Var;
                            }
                        } finally {
                        }
                    }
                }
                return ap5Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
