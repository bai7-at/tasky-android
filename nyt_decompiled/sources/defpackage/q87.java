package defpackage;

import io.reactivex.subjects.BehaviorSubject;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class q87 {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private final BehaviorSubject a;
    private float b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public q87() {
        BehaviorSubject create = BehaviorSubject.create();
        zq3.g(create, "create(...)");
        this.a = create;
        this.b = 1.0f;
    }

    public final BehaviorSubject a() {
        return this.a;
    }

    public final void b(float f) {
        this.b = f;
        this.a.onNext(Float.valueOf(f));
    }

    public final void c() {
        b(1.0f);
    }

    public final void d() {
        b(0.0f);
    }
}
