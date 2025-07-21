package com.datadog.android.core.internal.persistence;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.core.internal.persistence.AbstractStorage;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.bp6;
import defpackage.c04;
import defpackage.f28;
import defpackage.f32;
import defpackage.ir5;
import defpackage.jw6;
import defpackage.l75;
import defpackage.lb2;
import defpackage.mq8;
import defpackage.qs2;
import defpackage.s60;
import defpackage.ss2;
import defpackage.su0;
import defpackage.ua1;
import defpackage.zq3;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c;

/* loaded from: classes2.dex */
public final class AbstractStorage implements f28, mq8 {
    private final String a;
    private final String b;
    private final ExecutorService c;
    private final InternalLogger d;
    private final lb2 e;
    private final su0 f;
    private final c04 g;
    private final c04 h;
    private final ir5 i;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TrackingConsent.values().length];
            try {
                iArr[TrackingConsent.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackingConsent.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackingConsent.NOT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class b implements f32 {
        final /* synthetic */ ir5 a;

        b(ir5 ir5Var) {
            this.a = ir5Var;
        }

        @Override // defpackage.f32
        public boolean a(bp6 bp6Var, byte[] bArr, EventType eventType) {
            zq3.h(bp6Var, "event");
            zq3.h(eventType, "eventType");
            return this.a.a(bp6Var, bArr, eventType);
        }
    }

    public AbstractStorage(String str, String str2, ir5.b bVar, ExecutorService executorService, InternalLogger internalLogger, lb2 lb2Var, su0 su0Var) {
        zq3.h(str2, "featureName");
        zq3.h(bVar, "persistenceStrategyFactory");
        zq3.h(executorService, "executorService");
        zq3.h(internalLogger, "internalLogger");
        zq3.h(lb2Var, "storageConfiguration");
        zq3.h(su0Var, "consentProvider");
        this.a = str;
        this.b = str2;
        this.c = executorService;
        this.d = internalLogger;
        this.e = lb2Var;
        this.f = su0Var;
        this.g = c.a(new qs2() { // from class: com.datadog.android.core.internal.persistence.AbstractStorage$grantedPersistenceStrategy$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ir5 mo865invoke() {
                String str3;
                AbstractStorage.this.j();
                String k = AbstractStorage.this.k();
                str3 = AbstractStorage.this.b;
                TrackingConsent trackingConsent = TrackingConsent.GRANTED;
                StringBuilder sb = new StringBuilder();
                sb.append(k);
                sb.append("/");
                sb.append(str3);
                sb.append("/");
                sb.append(trackingConsent);
                AbstractStorage.this.l().d();
                AbstractStorage.this.l().b();
                throw null;
            }
        });
        this.h = c.a(new qs2() { // from class: com.datadog.android.core.internal.persistence.AbstractStorage$pendingPersistenceStrategy$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ir5 mo865invoke() {
                String str3;
                AbstractStorage.this.j();
                String k = AbstractStorage.this.k();
                str3 = AbstractStorage.this.b;
                TrackingConsent trackingConsent = TrackingConsent.PENDING;
                StringBuilder sb = new StringBuilder();
                sb.append(k);
                sb.append("/");
                sb.append(str3);
                sb.append("/");
                sb.append(trackingConsent);
                AbstractStorage.this.l().d();
                AbstractStorage.this.l().b();
                throw null;
            }
        });
        this.i = new l75();
        su0Var.e(this);
    }

    private final ir5 h() {
        return (ir5) this.g.getValue();
    }

    private final ir5 i() {
        return (ir5) this.h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(TrackingConsent trackingConsent, TrackingConsent trackingConsent2, AbstractStorage abstractStorage) {
        zq3.h(trackingConsent, "$previousConsent");
        zq3.h(trackingConsent2, "$newConsent");
        zq3.h(abstractStorage, "this$0");
        if (trackingConsent == TrackingConsent.PENDING) {
            int i = a.a[trackingConsent2.ordinal()];
            if (i == 1) {
                abstractStorage.i().c(abstractStorage.h());
            } else {
                if (i != 3) {
                    return;
                }
                abstractStorage.i().f();
            }
        }
    }

    private final ir5 n() {
        int i = a.a[this.f.c().ordinal()];
        if (i == 1) {
            return h();
        }
        if (i == 2) {
            return i();
        }
        if (i == 3) {
            return this.i;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(AbstractStorage abstractStorage, ss2 ss2Var) {
        zq3.h(abstractStorage, "this$0");
        zq3.h(ss2Var, "$callback");
        ss2Var.invoke(new b(abstractStorage.n()));
    }

    @Override // defpackage.f28
    public void a(com.datadog.android.core.internal.persistence.a aVar, jw6 jw6Var, boolean z) {
        zq3.h(aVar, "batchId");
        zq3.h(jw6Var, "removalReason");
        if (z) {
            h().d(aVar.a());
        } else {
            h().b(aVar.a());
        }
    }

    @Override // defpackage.mq8
    public void b(final TrackingConsent trackingConsent, final TrackingConsent trackingConsent2) {
        zq3.h(trackingConsent, "previousConsent");
        zq3.h(trackingConsent2, "newConsent");
        ConcurrencyExtKt.c(this.c, "Data migration", this.d, new Runnable() { // from class: a2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractStorage.m(TrackingConsent.this, trackingConsent2, this);
            }
        });
    }

    @Override // defpackage.f28
    public s60 c() {
        h().e();
        return null;
    }

    @Override // defpackage.f28
    public void d(ua1 ua1Var, boolean z, final ss2 ss2Var) {
        zq3.h(ua1Var, "datadogContext");
        zq3.h(ss2Var, "callback");
        ConcurrencyExtKt.c(this.c, "Data write", this.d, new Runnable() { // from class: z1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractStorage.o(AbstractStorage.this, ss2Var);
            }
        });
    }

    public final ir5.b j() {
        return null;
    }

    public final String k() {
        return this.a;
    }

    public final lb2 l() {
        return this.e;
    }
}
