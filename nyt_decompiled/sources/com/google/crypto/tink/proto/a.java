package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.m;
import com.google.crypto.tink.shaded.protobuf.u;
import defpackage.ap5;
import defpackage.or4;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class a extends GeneratedMessageLite implements or4 {
    private static final a DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile ap5 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private u.d key_ = GeneratedMessageLite.t();
    private int primaryKeyId_;

    /* renamed from: com.google.crypto.tink.proto.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0211a {
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
        /* synthetic */ b(C0211a c0211a) {
            this();
        }

        public b u(c cVar) {
            o();
            ((a) this.b).N(cVar);
            return this;
        }

        public c v(int i) {
            return ((a) this.b).P(i);
        }

        public int w() {
            return ((a) this.b).Q();
        }

        public List x() {
            return Collections.unmodifiableList(((a) this.b).R());
        }

        public b y(int i) {
            o();
            ((a) this.b).V(i);
            return this;
        }

        private b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends GeneratedMessageLite implements or4 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile ap5 PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private KeyData keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* renamed from: com.google.crypto.tink.proto.a$c$a, reason: collision with other inner class name */
        public static final class C0212a extends GeneratedMessageLite.a implements or4 {
            /* synthetic */ C0212a(C0211a c0211a) {
                this();
            }

            public C0212a u(KeyData keyData) {
                o();
                ((c) this.b).V(keyData);
                return this;
            }

            public C0212a v(int i) {
                o();
                ((c) this.b).W(i);
                return this;
            }

            public C0212a w(OutputPrefixType outputPrefixType) {
                o();
                ((c) this.b).X(outputPrefixType);
                return this;
            }

            public C0212a x(KeyStatusType keyStatusType) {
                o();
                ((c) this.b).Y(keyStatusType);
                return this;
            }

            private C0212a() {
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

        public static C0212a U() {
            return (C0212a) DEFAULT_INSTANCE.p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void V(KeyData keyData) {
            keyData.getClass();
            this.keyData_ = keyData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void W(int i) {
            this.keyId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void X(OutputPrefixType outputPrefixType) {
            this.outputPrefixType_ = outputPrefixType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Y(KeyStatusType keyStatusType) {
            this.status_ = keyStatusType.getNumber();
        }

        public KeyData P() {
            KeyData keyData = this.keyData_;
            return keyData == null ? KeyData.O() : keyData;
        }

        public int Q() {
            return this.keyId_;
        }

        public OutputPrefixType R() {
            OutputPrefixType forNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
            return forNumber == null ? OutputPrefixType.UNRECOGNIZED : forNumber;
        }

        public KeyStatusType S() {
            KeyStatusType forNumber = KeyStatusType.forNumber(this.status_);
            return forNumber == null ? KeyStatusType.UNRECOGNIZED : forNumber;
        }

        public boolean T() {
            return this.keyData_ != null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        protected final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = C0211a.a[methodToInvoke.ordinal()];
            C0211a c0211a = null;
            switch (i) {
                case 1:
                    return new c();
                case 2:
                    return new C0212a(c0211a);
                case 3:
                    return GeneratedMessageLite.C(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.I(a.class, aVar);
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(c cVar) {
        cVar.getClass();
        O();
        this.key_.add(cVar);
    }

    private void O() {
        if (this.key_.l()) {
            return;
        }
        this.key_ = GeneratedMessageLite.A(this.key_);
    }

    public static b T() {
        return (b) DEFAULT_INSTANCE.p();
    }

    public static a U(byte[] bArr, m mVar) {
        return (a) GeneratedMessageLite.E(DEFAULT_INSTANCE, bArr, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i) {
        this.primaryKeyId_ = i;
    }

    public c P(int i) {
        return (c) this.key_.get(i);
    }

    public int Q() {
        return this.key_.size();
    }

    public List R() {
        return this.key_;
    }

    public int S() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = C0211a.a[methodToInvoke.ordinal()];
        C0211a c0211a = null;
        switch (i) {
            case 1:
                return new a();
            case 2:
                return new b(c0211a);
            case 3:
                return GeneratedMessageLite.C(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ap5 ap5Var = PARSER;
                if (ap5Var == null) {
                    synchronized (a.class) {
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
