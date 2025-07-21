package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.z;
import defpackage.cp5;
import defpackage.pr4;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends GeneratedMessageLite implements pr4 {
    private static final b DEFAULT_INSTANCE;
    private static volatile cp5 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, PreferencesProto$Value> preferences_ = MapFieldLite.f();

    public static final class a extends GeneratedMessageLite.a implements pr4 {
        /* synthetic */ a(androidx.datastore.preferences.a aVar) {
            this();
        }

        public a t(String str, PreferencesProto$Value preferencesProto$Value) {
            str.getClass();
            preferencesProto$Value.getClass();
            o();
            ((b) this.b).J().put(str, preferencesProto$Value);
            return this;
        }

        private a() {
            super(b.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: androidx.datastore.preferences.b$b, reason: collision with other inner class name */
    private static final class C0076b {
        static final z a = z.d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, PreferencesProto$Value.Q());
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        GeneratedMessageLite.F(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map J() {
        return L();
    }

    private MapFieldLite L() {
        if (!this.preferences_.m()) {
            this.preferences_ = this.preferences_.q();
        }
        return this.preferences_;
    }

    private MapFieldLite M() {
        return this.preferences_;
    }

    public static a N() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public static b O(InputStream inputStream) {
        return (b) GeneratedMessageLite.D(DEFAULT_INSTANCE, inputStream);
    }

    public Map K() {
        return Collections.unmodifiableMap(M());
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = androidx.datastore.preferences.a.a[methodToInvoke.ordinal()];
        androidx.datastore.preferences.a aVar = null;
        switch (i) {
            case 1:
                return new b();
            case 2:
                return new a(aVar);
            case 3:
                return GeneratedMessageLite.B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C0076b.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cp5 cp5Var = PARSER;
                if (cp5Var == null) {
                    synchronized (b.class) {
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
