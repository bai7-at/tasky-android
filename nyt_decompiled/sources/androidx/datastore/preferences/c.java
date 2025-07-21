package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.t;
import defpackage.cp5;
import defpackage.pr4;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends GeneratedMessageLite implements pr4 {
    private static final c DEFAULT_INSTANCE;
    private static volatile cp5 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private t.b strings_ = GeneratedMessageLite.s();

    public static final class a extends GeneratedMessageLite.a implements pr4 {
        /* synthetic */ a(androidx.datastore.preferences.a aVar) {
            this();
        }

        public a t(Iterable iterable) {
            o();
            ((c) this.b).J(iterable);
            return this;
        }

        private a() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.F(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(Iterable iterable) {
        K();
        androidx.datastore.preferences.protobuf.a.f(iterable, this.strings_);
    }

    private void K() {
        if (this.strings_.l()) {
            return;
        }
        this.strings_ = GeneratedMessageLite.z(this.strings_);
    }

    public static c L() {
        return DEFAULT_INSTANCE;
    }

    public static a N() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public List M() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = androidx.datastore.preferences.a.a[methodToInvoke.ordinal()];
        androidx.datastore.preferences.a aVar = null;
        switch (i) {
            case 1:
                return new c();
            case 2:
                return new a(aVar);
            case 3:
                return GeneratedMessageLite.B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                cp5 cp5Var = PARSER;
                if (cp5Var == null) {
                    synchronized (c.class) {
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
