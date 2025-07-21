package defpackage;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.u;

/* loaded from: classes3.dex */
public final class zw3 extends GeneratedMessageLite implements or4 {
    private static final zw3 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile ap5 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private u.d keyInfo_ = GeneratedMessageLite.t();
    private int primaryKeyId_;

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

        public b u(c cVar) {
            o();
            ((zw3) this.b).N(cVar);
            return this;
        }

        public b v(int i) {
            o();
            ((zw3) this.b).R(i);
            return this;
        }

        private b() {
            super(zw3.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends GeneratedMessageLite implements or4 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile ap5 PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        public static final class a extends GeneratedMessageLite.a implements or4 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a u(int i) {
                o();
                ((c) this.b).R(i);
                return this;
            }

            public a v(OutputPrefixType outputPrefixType) {
                o();
                ((c) this.b).S(outputPrefixType);
                return this;
            }

            public a w(KeyStatusType keyStatusType) {
                o();
                ((c) this.b).T(keyStatusType);
                return this;
            }

            public a x(String str) {
                o();
                ((c) this.b).U(str);
                return this;
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.I(c.class, cVar);
        }

        private c() {
        }

        public static a Q() {
            return (a) DEFAULT_INSTANCE.p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void R(int i) {
            this.keyId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void S(OutputPrefixType outputPrefixType) {
            this.outputPrefixType_ = outputPrefixType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void T(KeyStatusType keyStatusType) {
            this.status_ = keyStatusType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void U(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        public int P() {
            return this.keyId_;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        protected final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = a.a[methodToInvoke.ordinal()];
            a aVar = null;
            switch (i) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return GeneratedMessageLite.C(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    ap5 ap5Var = PARSER;
                    if (ap5Var == null) {
                        synchronized (c.class) {
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

    static {
        zw3 zw3Var = new zw3();
        DEFAULT_INSTANCE = zw3Var;
        GeneratedMessageLite.I(zw3.class, zw3Var);
    }

    private zw3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(c cVar) {
        cVar.getClass();
        O();
        this.keyInfo_.add(cVar);
    }

    private void O() {
        if (this.keyInfo_.l()) {
            return;
        }
        this.keyInfo_ = GeneratedMessageLite.A(this.keyInfo_);
    }

    public static b Q() {
        return (b) DEFAULT_INSTANCE.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(int i) {
        this.primaryKeyId_ = i;
    }

    public c P(int i) {
        return (c) this.keyInfo_.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        a aVar = null;
        switch (i) {
            case 1:
                return new zw3();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.C(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ap5 ap5Var = PARSER;
                if (ap5Var == null) {
                    synchronized (zw3.class) {
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
