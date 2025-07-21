package androidx.datastore.preferences;

import androidx.datastore.preferences.c;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import defpackage.cp5;
import defpackage.pr4;

/* loaded from: classes.dex */
public final class PreferencesProto$Value extends GeneratedMessageLite implements pr4 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final PreferencesProto$Value DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile cp5 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public enum ValueCase {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);

        private final int value;

        ValueCase(int i) {
            this.value = i;
        }

        public static ValueCase forNumber(int i) {
            switch (i) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ValueCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class a extends GeneratedMessageLite.a implements pr4 {
        /* synthetic */ a(androidx.datastore.preferences.a aVar) {
            this();
        }

        public a t(boolean z) {
            o();
            ((PreferencesProto$Value) this.b).Z(z);
            return this;
        }

        public a u(double d) {
            o();
            ((PreferencesProto$Value) this.b).a0(d);
            return this;
        }

        public a v(float f) {
            o();
            ((PreferencesProto$Value) this.b).b0(f);
            return this;
        }

        public a w(int i) {
            o();
            ((PreferencesProto$Value) this.b).c0(i);
            return this;
        }

        public a x(long j) {
            o();
            ((PreferencesProto$Value) this.b).d0(j);
            return this;
        }

        public a y(String str) {
            o();
            ((PreferencesProto$Value) this.b).e0(str);
            return this;
        }

        public a z(c.a aVar) {
            o();
            ((PreferencesProto$Value) this.b).f0(aVar);
            return this;
        }

        private a() {
            super(PreferencesProto$Value.DEFAULT_INSTANCE);
        }
    }

    static {
        PreferencesProto$Value preferencesProto$Value = new PreferencesProto$Value();
        DEFAULT_INSTANCE = preferencesProto$Value;
        GeneratedMessageLite.F(PreferencesProto$Value.class, preferencesProto$Value);
    }

    private PreferencesProto$Value() {
    }

    public static PreferencesProto$Value Q() {
        return DEFAULT_INSTANCE;
    }

    public static a Y() {
        return (a) DEFAULT_INSTANCE.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(c.a aVar) {
        this.value_ = aVar.l();
        this.valueCase_ = 6;
    }

    public boolean P() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double R() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float S() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int T() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long U() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String V() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public c W() {
        return this.valueCase_ == 6 ? (c) this.value_ : c.L();
    }

    public ValueCase X() {
        return ValueCase.forNumber(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = androidx.datastore.preferences.a.a[methodToInvoke.ordinal()];
        androidx.datastore.preferences.a aVar = null;
        switch (i) {
            case 1:
                return new PreferencesProto$Value();
            case 2:
                return new a(aVar);
            case 3:
                return GeneratedMessageLite.B(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cp5 cp5Var = PARSER;
                if (cp5Var == null) {
                    synchronized (PreferencesProto$Value.class) {
                        try {
                            cp5Var = PARSER;
                            if (cp5Var == null) {
                                cp5Var = new GeneratedMessageLite.b(DEFAULT_INSTANCE);
                                PARSER = cp5Var;
                            }
                        } finally {
                        }
                    }
                }
                return cp5Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
