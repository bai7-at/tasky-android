package androidx.work;

import androidx.work.d;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class c extends d {
    public static final b e = new b(null);

    public static final class a extends d.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls) {
            super(cls);
            zq3.h(cls, "workerClass");
        }

        @Override // androidx.work.d.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public c c() {
            if (d() && h().j.j()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new c(this);
        }

        @Override // androidx.work.d.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(Class cls) {
            zq3.h(cls, "workerClass");
            return (c) new a(cls).b();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar) {
        super(aVar.e(), aVar.h(), aVar.f());
        zq3.h(aVar, "builder");
    }

    public static final c e(Class cls) {
        return e.a(cls);
    }
}
