package com.nytimes.android.logging.remote;

import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.logging.remote.LogRecorderImpl;
import com.nytimes.android.logging.remote.models.Priority;
import defpackage.b84;
import defpackage.gm0;
import defpackage.ie2;
import defpackage.jb7;
import defpackage.m84;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.v84;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.io.BufferedWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$IntRef;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;

/* loaded from: classes4.dex */
public final class LogRecorderImpl implements v84 {
    private final m84 a;
    private final ie2 b;
    private final File c;
    private final File d;
    private final PublishSubject e;
    private final BehaviorSubject f;
    private final Observable g;

    public static final class a implements jb7 {
        a() {
        }

        @Override // defpackage.jb7
        public Scheduler a() {
            return jb7.a.b(this);
        }

        @Override // defpackage.jb7
        public Scheduler b() {
            return jb7.a.a(this);
        }
    }

    public LogRecorderImpl(m84 m84Var, jb7 jb7Var, ie2 ie2Var) {
        zq3.h(m84Var, "params");
        zq3.h(jb7Var, "schedulerProvider");
        zq3.h(ie2Var, "fileIoWrapper");
        this.a = m84Var;
        this.b = ie2Var;
        this.c = ie2Var.a("AppLogs-1.txt");
        this.d = ie2Var.a("AppLogs-2.txt");
        PublishSubject create = PublishSubject.create();
        zq3.g(create, "create(...)");
        this.e = create;
        BehaviorSubject create2 = BehaviorSubject.create();
        zq3.g(create2, "create(...)");
        this.f = create2;
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        Observable<T> observeOn = create.observeOn(jb7Var.b());
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.logging.remote.LogRecorderImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(b84 b84Var) {
                LogRecorderImpl logRecorderImpl = LogRecorderImpl.this;
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                synchronized (logRecorderImpl) {
                    try {
                        int i = ref$IntRef2.element + 1;
                        ref$IntRef2.element = i;
                        if (i >= logRecorderImpl.a.a()) {
                            ref$IntRef2.element = 0;
                            logRecorderImpl.f.onNext(1L);
                        }
                        ww8 ww8Var = ww8.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((b84) obj);
                return ww8.a;
            }
        };
        Observable subscribeOn = observeOn.doOnNext(new Consumer() { // from class: w84
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LogRecorderImpl.f(ss2.this, obj);
            }
        }).buffer(create2.mergeWith(Observable.interval(m84Var.b(), TimeUnit.MINUTES, jb7Var.b()))).subscribeOn(jb7Var.a());
        zq3.g(subscribeOn, "subscribeOn(...)");
        this.g = subscribeOn;
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.logging.remote.LogRecorderImpl.3
            {
                super(1);
            }

            public final void b(List list) {
                LogRecorderImpl logRecorderImpl = LogRecorderImpl.this;
                zq3.e(list);
                logRecorderImpl.m(list);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((List) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: x84
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LogRecorderImpl.g(ss2.this, obj);
            }
        };
        final AnonymousClass4 anonymousClass4 = new ss2() { // from class: com.nytimes.android.logging.remote.LogRecorderImpl.4
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                ul8.a.d(LogRecorderImpl.class.getSimpleName(), "Log manager failure: " + (th != null ? th.getMessage() : null));
            }
        };
        subscribeOn.subscribe(consumer, new Consumer() { // from class: y84
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LogRecorderImpl.h(ss2.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    @Override // defpackage.v84
    public List a() {
        List o = i.o(this.c, this.d);
        ArrayList arrayList = new ArrayList();
        for (Object obj : o) {
            if (((File) obj).exists()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.v84
    public void b(Priority priority, String str, Throwable th) {
        zq3.h(priority, "priority");
        zq3.h(str, "message");
        this.e.onNext(new b84(priority, str, th));
    }

    public final void k() {
        if (this.d.exists()) {
            this.d.delete();
        }
        this.c.renameTo(this.d);
        this.c.delete();
    }

    public final boolean l() {
        return !zq3.c(Instant.ofEpochMilli(this.c.lastModified()).atZone(this.a.c().getZone()).toLocalDate(), LocalDate.now(this.a.c())) || this.c.length() > ((long) this.a.d()) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    public final void m(List list) {
        zq3.h(list, "logList");
        if (l()) {
            k();
        }
        BufferedWriter c = this.b.c("AppLogs-1.txt");
        try {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                c.write(((b84) it2.next()).toString());
            }
            c.flush();
            ww8 ww8Var = ww8.a;
            gm0.a(c, null);
        } finally {
        }
    }

    public /* synthetic */ LogRecorderImpl(m84 m84Var, jb7 jb7Var, ie2 ie2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new m84(0, 0, 0, null, 15, null) : m84Var, (i & 2) != 0 ? new a() : jb7Var, ie2Var);
    }
}
