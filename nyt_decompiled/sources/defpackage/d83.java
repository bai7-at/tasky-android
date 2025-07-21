package defpackage;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

/* loaded from: classes4.dex */
public final class d83 {
    public static final d83 a = new d83();
    private static final PublishSubject b;
    public static final int c;

    static {
        PublishSubject create = PublishSubject.create();
        zq3.g(create, "create(...)");
        b = create;
        c = 8;
    }

    private d83() {
    }

    public final Observable a(Class cls) {
        zq3.h(cls, "eventType");
        Observable<U> ofType = b.ofType(cls);
        zq3.g(ofType, "ofType(...)");
        return ofType;
    }

    public final void b(Object obj) {
        zq3.h(obj, "event");
        b.onNext(obj);
    }
}
