package defpackage;

import io.reactivex.subjects.PublishSubject;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes4.dex */
public final class xv7 {
    public static final xv7 a = new xv7();

    private xv7() {
    }

    public final Queue a() {
        return new ConcurrentLinkedQueue();
    }

    public final PublishSubject b() {
        PublishSubject create = PublishSubject.create();
        zq3.g(create, "create(...)");
        return create;
    }
}
