package com.datadog.android.core.internal;

import android.app.Application;
import android.content.Context;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.core.internal.persistence.AbstractStorage;
import com.datadog.android.core.internal.persistence.ConsentAwareStorage;
import com.datadog.android.core.internal.persistence.file.FileMover;
import defpackage.af8;
import defpackage.b75;
import defpackage.bb2;
import defpackage.by8;
import defpackage.cy8;
import defpackage.f28;
import defpackage.f32;
import defpackage.fa1;
import defpackage.g28;
import defpackage.g75;
import defpackage.ga1;
import defpackage.gt2;
import defpackage.ha1;
import defpackage.ib2;
import defpackage.ir5;
import defpackage.j12;
import defpackage.ka1;
import defpackage.ky6;
import defpackage.lb2;
import defpackage.lh4;
import defpackage.ma1;
import defpackage.mq8;
import defpackage.na1;
import defpackage.oe2;
import defpackage.ol2;
import defpackage.p75;
import defpackage.pb1;
import defpackage.pe2;
import defpackage.qb1;
import defpackage.qs2;
import defpackage.r36;
import defpackage.r65;
import defpackage.re2;
import defpackage.ss2;
import defpackage.t75;
import defpackage.tt4;
import defpackage.tx0;
import defpackage.u60;
import defpackage.ua1;
import defpackage.v65;
import defpackage.wk1;
import defpackage.ww8;
import defpackage.ya2;
import defpackage.za2;
import defpackage.zq3;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class SdkFeature implements ib2 {
    public static final a n = new a(null);
    private final CoreFeature a;
    private final ya2 b;
    private final InternalLogger c;
    private ha1 d;
    private final AtomicBoolean e;
    private final Set f;
    private final AtomicReference g;
    private f28 h;
    private na1 i;
    private by8 j;
    private oe2 k;
    private tt4 l;
    private r36 m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SdkFeature(CoreFeature coreFeature, ya2 ya2Var, InternalLogger internalLogger) {
        zq3.h(coreFeature, "coreFeature");
        zq3.h(ya2Var, "wrappedFeature");
        zq3.h(internalLogger, "internalLogger");
        this.a = coreFeature;
        this.b = ya2Var;
        this.c = internalLogger;
        this.d = new v65();
        this.e = new AtomicBoolean(false);
        this.f = Collections.newSetFromMap(new ConcurrentHashMap());
        this.g = new AtomicReference(null);
        this.h = new p75();
        this.i = new com.datadog.android.core.internal.data.upload.a();
        this.j = new t75();
        this.k = new b75();
        this.l = new g75();
    }

    private final f28 d(String str, String str2, lb2 lb2Var, ir5.b bVar) {
        return new AbstractStorage(str, str2, bVar, this.a.G(), this.c, lb2Var, this.a.Q());
    }

    private final f28 e(String str, pe2 pe2Var) {
        bb2 bb2Var = new bb2(this.a.Q(), this.a.N(), str, this.a.G(), pe2Var, this.c, this.l);
        this.k = bb2Var;
        ol2 G = this.a.G();
        oe2 g = bb2Var.g();
        oe2 h = bb2Var.h();
        u60.a aVar = u60.a;
        InternalLogger internalLogger = this.c;
        this.a.A();
        u60 a2 = aVar.a(internalLogger, null);
        re2.a aVar2 = re2.b;
        InternalLogger internalLogger2 = this.c;
        this.a.A();
        return new ConsentAwareStorage(G, g, h, a2, aVar2.a(internalLogger2, null), new FileMover(this.c), this.c, pe2Var, this.l, this.a.Q(), str);
    }

    private final na1 f(ky6 ky6Var) {
        return new DataOkHttpUploader(ky6Var, this.c, this.a.D(), this.a.J(), this.a.l());
    }

    private final void m(j12 j12Var) {
        re2 a2 = re2.b.a(this.c, j12Var);
        ga1 ga1Var = new ga1(this.c);
        String name = this.b.getName();
        File N = this.a.N();
        o(new fa1(this.a.G(), this.c, new pb1(ga1Var, name, N, this.c, new af8(this.c, a2)), new qb1(ga1Var, name, N, this.c, a2)));
    }

    private final f28 n(ka1 ka1Var, g28 g28Var, Context context, String str, ir5.b bVar) {
        pe2 a2;
        lb2 b = g28Var.b();
        if (bVar != null) {
            return d(str, g28Var.getName(), b, bVar);
        }
        a2 = r3.a((r28 & 1) != 0 ? r3.a : this.a.p().getWindowDurationMs$dd_sdk_android_core_release(), (r28 & 2) != 0 ? r3.b : b.b(), (r28 & 4) != 0 ? r3.c : b.c(), (r28 & 8) != 0 ? r3.d : b.d(), (r28 & 16) != 0 ? r3.e : b.e(), (r28 & 32) != 0 ? r3.f : 0L, (r28 & 64) != 0 ? this.a.h().g : 0L);
        p(ka1Var, a2, context);
        return e(g28Var.getName(), a2);
    }

    private final void p(ka1 ka1Var, pe2 pe2Var, Context context) {
        BatchMetricsDispatcher batchMetricsDispatcher = new BatchMetricsDispatcher(this.b.getName(), ka1Var, pe2Var, this.c, this.a.P());
        if (context instanceof Application) {
            r36 r36Var = new r36(batchMetricsDispatcher);
            this.m = r36Var;
            ((Application) context).registerActivityLifecycleCallbacks(r36Var);
        }
        this.l = batchMetricsDispatcher;
    }

    private final void q(g28 g28Var, cy8 cy8Var, int i) {
        by8 t75Var;
        if (this.a.Y()) {
            this.i = f(g28Var.e());
            t75Var = new ma1(g28Var.getName(), this.h, this.i, this.a.r(), this.a.C(), this.a.O(), cy8Var, i, this.a.R(), this.c);
        } else {
            t75Var = new t75();
        }
        this.j = t75Var;
    }

    @Override // defpackage.ib2
    public void a(Object obj) {
        zq3.h(obj, "event");
        za2 za2Var = (za2) this.g.get();
        if (za2Var == null) {
            InternalLogger.b.a(this.c, InternalLogger.Level.INFO, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.SdkFeature$sendEvent$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Feature \"%s\" has no event receiver registered, ignoring event.", Arrays.copyOf(new Object[]{SdkFeature.this.j().getName()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
        } else {
            za2Var.c(obj);
        }
    }

    @Override // defpackage.ib2
    public ya2 b() {
        ya2 ya2Var = this.b;
        zq3.f(ya2Var, "null cannot be cast to non-null type T of com.datadog.android.core.internal.SdkFeature.unwrap");
        return ya2Var;
    }

    @Override // defpackage.ib2
    public void c(boolean z, final gt2 gt2Var) {
        zq3.h(gt2Var, "callback");
        tx0 r = this.a.r();
        if (r instanceof r65) {
            return;
        }
        final ua1 context = r.getContext();
        this.h.d(context, z, new ss2() { // from class: com.datadog.android.core.internal.SdkFeature$withWriteContext$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(f32 f32Var) {
                zq3.h(f32Var, "it");
                gt2.this.invoke(context, f32Var);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((f32) obj);
                return ww8.a;
            }
        });
    }

    public final AtomicReference g() {
        return this.g;
    }

    public final f28 h() {
        return this.h;
    }

    public final na1 i() {
        return this.i;
    }

    public final ya2 j() {
        return this.b;
    }

    public final void k(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "instanceId");
        if (this.e.get()) {
            return;
        }
        ya2 ya2Var = this.b;
        if (ya2Var instanceof g28) {
            ka1 ka1Var = new ka1(this.a.S(), this.a.o().getMaxBatchesPerUploadJob());
            cy8 t = this.a.t();
            if (t == null) {
                t = new wk1(ka1Var);
            }
            g28 g28Var = (g28) this.b;
            this.a.H();
            this.h = n(ka1Var, g28Var, context, str, null);
            this.b.d(context);
            q((g28) this.b, t, ka1Var.b());
        } else {
            ya2Var.d(context);
        }
        if (this.b instanceof mq8) {
            this.a.Q().e((mq8) this.b);
        }
        this.a.A();
        m(null);
        this.e.set(true);
        this.j.b();
    }

    public final void l(String str, Map map) {
        zq3.h(str, "featureName");
        zq3.h(map, "context");
        Set set = this.f;
        zq3.g(set, "contextUpdateListeners");
        Iterator it2 = set.iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            throw null;
        }
    }

    public void o(ha1 ha1Var) {
        zq3.h(ha1Var, "<set-?>");
        this.d = ha1Var;
    }

    public final void r() {
        if (this.e.get()) {
            this.b.a();
            if (this.b instanceof mq8) {
                this.a.Q().b((mq8) this.b);
            }
            this.j.a();
            this.j = new t75();
            this.h = new p75();
            o(new v65());
            this.i = new com.datadog.android.core.internal.data.upload.a();
            this.k = new b75();
            this.l = new g75();
            Object obj = this.a.s().get();
            Application application = obj instanceof Application ? (Application) obj : null;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.m);
            }
            this.m = null;
            this.e.set(false);
        }
    }
}
