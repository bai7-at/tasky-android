package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* loaded from: classes3.dex */
public final class jw3 extends GeneratedMessageLite implements or4 {
    private static final jw3 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile ap5 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.a;

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

        public b u(OutputPrefixType outputPrefixType) {
            o();
            ((jw3) this.b).T(outputPrefixType);
            return this;
        }

        public b v(String str) {
            o();
            ((jw3) this.b).U(str);
            return this;
        }

        public b w(ByteString byteString) {
            o();
            ((jw3) this.b).V(byteString);
            return this;
        }

        private b() {
            super(jw3.DEFAULT_INSTANCE);
        }
    }

    static {
        jw3 jw3Var = new jw3();
        DEFAULT_INSTANCE = jw3Var;
        GeneratedMessageLite.I(jw3.class, jw3Var);
    }

    private jw3() {
    }

    public static jw3 O() {
        return DEFAULT_INSTANCE;
    }

    public static b S() {
        return (b) DEFAULT_INSTANCE.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(OutputPrefixType outputPrefixType) {
        this.outputPrefixType_ = outputPrefixType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    public OutputPrefixType P() {
        OutputPrefixType forNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
        return forNumber == null ? OutputPrefixType.UNRECOGNIZED : forNumber;
    }

    public String Q() {
        return this.typeUrl_;
    }

    public ByteString R() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        a aVar = null;
        switch (i) {
            case 1:
                return new jw3();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.C(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ap5 ap5Var = PARSER;
                if (ap5Var == null) {
                    synchronized (jw3.class) {
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
