package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.m;

/* loaded from: classes3.dex */
public final class h93 extends GeneratedMessageLite implements or4 {
    private static final h93 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile ap5 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.a;
    private k93 params_;
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
            ((h93) this.b).U(byteString);
            return this;
        }

        public b v(k93 k93Var) {
            o();
            ((h93) this.b).V(k93Var);
            return this;
        }

        public b w(int i) {
            o();
            ((h93) this.b).W(i);
            return this;
        }

        private b() {
            super(h93.DEFAULT_INSTANCE);
        }
    }

    static {
        h93 h93Var = new h93();
        DEFAULT_INSTANCE = h93Var;
        GeneratedMessageLite.I(h93.class, h93Var);
    }

    private h93() {
    }

    public static h93 O() {
        return DEFAULT_INSTANCE;
    }

    public static b S() {
        return (b) DEFAULT_INSTANCE.p();
    }

    public static h93 T(ByteString byteString, m mVar) {
        return (h93) GeneratedMessageLite.D(DEFAULT_INSTANCE, byteString, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(k93 k93Var) {
        k93Var.getClass();
        this.params_ = k93Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i) {
        this.version_ = i;
    }

    public ByteString P() {
        return this.keyValue_;
    }

    public k93 Q() {
        k93 k93Var = this.params_;
        return k93Var == null ? k93.L() : k93Var;
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
                return new h93();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.C(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ap5 ap5Var = PARSER;
                if (ap5Var == null) {
                    synchronized (h93.class) {
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
