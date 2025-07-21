package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.m;

/* loaded from: classes3.dex */
public final class ca extends GeneratedMessageLite implements or4 {
    private static final ca DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile ap5 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.a;
    private fa params_;
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

        public b u(ByteString byteString) {
            o();
            ((ca) this.b).U(byteString);
            return this;
        }

        public b v(fa faVar) {
            o();
            ((ca) this.b).V(faVar);
            return this;
        }

        public b w(int i) {
            o();
            ((ca) this.b).W(i);
            return this;
        }

        private b() {
            super(ca.DEFAULT_INSTANCE);
        }
    }

    static {
        ca caVar = new ca();
        DEFAULT_INSTANCE = caVar;
        GeneratedMessageLite.I(ca.class, caVar);
    }

    private ca() {
    }

    public static ca O() {
        return DEFAULT_INSTANCE;
    }

    public static b S() {
        return (b) DEFAULT_INSTANCE.p();
    }

    public static ca T(ByteString byteString, m mVar) {
        return (ca) GeneratedMessageLite.D(DEFAULT_INSTANCE, byteString, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(fa faVar) {
        faVar.getClass();
        this.params_ = faVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i) {
        this.version_ = i;
    }

    public ByteString P() {
        return this.keyValue_;
    }

    public fa Q() {
        fa faVar = this.params_;
        return faVar == null ? fa.L() : faVar;
    }

    public int R() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        a aVar = null;
        switch (i) {
            case 1:
                return new ca();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.C(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ap5 ap5Var = PARSER;
                if (ap5Var == null) {
                    synchronized (ca.class) {
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
