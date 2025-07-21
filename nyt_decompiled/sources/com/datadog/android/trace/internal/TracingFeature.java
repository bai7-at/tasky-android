package com.datadog.android.trace.internal;

import android.content.Context;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.trace.internal.data.TraceWriter;
import com.datadog.android.trace.internal.domain.event.SpanEventMapperWrapper;
import com.datadog.android.trace.internal.domain.event.SpanEventSerializer;
import defpackage.al5;
import defpackage.c04;
import defpackage.d01;
import defpackage.dy7;
import defpackage.g28;
import defpackage.jb2;
import defpackage.ky6;
import defpackage.lb2;
import defpackage.mp8;
import defpackage.ol9;
import defpackage.ql9;
import defpackage.qs2;
import defpackage.s65;
import defpackage.u75;
import defpackage.xb1;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class TracingFeature implements g28 {
    public static final a j = new a(null);
    private final jb2 a;
    private final dy7 b;
    private final boolean c;
    private ql9 d;
    private ol9 e;
    private final AtomicBoolean f;
    private final String g;
    private final c04 h;
    private final lb2 i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public TracingFeature(jb2 jb2Var, final String str, dy7 dy7Var, boolean z) {
        zq3.h(jb2Var, "sdkCore");
        zq3.h(dy7Var, "spanEventMapper");
        this.a = jb2Var;
        this.b = dy7Var;
        this.c = z;
        this.d = new u75();
        this.e = new s65();
        this.f = new AtomicBoolean(false);
        this.g = "tracing";
        this.h = c.a(new qs2() { // from class: com.datadog.android.trace.internal.TracingFeature$requestFactory$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final mp8 mo865invoke() {
                jb2 jb2Var2;
                String str2 = str;
                jb2Var2 = this.a;
                return new mp8(str2, jb2Var2.f());
            }
        });
        this.i = lb2.e.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ql9 f(jb2 jb2Var) {
        InternalLogger f = jb2Var.f();
        int i = 2;
        return new TraceWriter(jb2Var, new xb1(this.c, null, i, 0 == true ? 1 : 0), new SpanEventMapperWrapper(this.b, f), new SpanEventSerializer(f, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0), f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ol9 g(jb2 jb2Var) {
        InternalLogger f = jb2Var.f();
        return new al5(jb2Var, new d01(this.c), new SpanEventMapperWrapper(this.b, f), new SpanEventSerializer(f, null, 2, 0 == true ? 1 : 0), f);
    }

    @Override // defpackage.ya2
    public void a() {
        this.d = new u75();
        this.f.set(false);
    }

    @Override // defpackage.g28
    public lb2 b() {
        return this.i;
    }

    @Override // defpackage.ya2
    public void d(Context context) {
        zq3.h(context, "appContext");
        this.d = f(this.a);
        this.e = g(this.a);
        this.f.set(true);
    }

    @Override // defpackage.g28
    public ky6 e() {
        return (ky6) this.h.getValue();
    }

    @Override // defpackage.ya2
    public String getName() {
        return this.g;
    }

    public final ql9 h() {
        return this.d;
    }
}
