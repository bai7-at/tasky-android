package kotlin;

import defpackage.c04;
import defpackage.qs2;
import defpackage.tv8;
import defpackage.v1;
import defpackage.zq3;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
final class SafePublicationLazyImpl<T> implements c04, Serializable {
    public static final a a = new a(null);
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;

    /* renamed from: final, reason: not valid java name */
    private final Object f32final;
    private volatile qs2 initializer;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SafePublicationLazyImpl(qs2 qs2Var) {
        zq3.h(qs2Var, "initializer");
        this.initializer = qs2Var;
        tv8 tv8Var = tv8.a;
        this._value = tv8Var;
        this.f32final = tv8Var;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // defpackage.c04
    public boolean a() {
        return this._value != tv8.a;
    }

    @Override // defpackage.c04
    public Object getValue() {
        Object obj = this._value;
        tv8 tv8Var = tv8.a;
        if (obj != tv8Var) {
            return obj;
        }
        qs2 qs2Var = this.initializer;
        if (qs2Var != null) {
            Object mo865invoke = qs2Var.mo865invoke();
            if (v1.a(b, this, tv8Var, mo865invoke)) {
                this.initializer = null;
                return mo865invoke;
            }
        }
        return this._value;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
