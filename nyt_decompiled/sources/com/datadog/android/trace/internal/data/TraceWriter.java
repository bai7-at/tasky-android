package com.datadog.android.trace.internal.data;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.EventType;
import com.datadog.opentracing.a;
import defpackage.bp6;
import defpackage.cy7;
import defpackage.f32;
import defpackage.gt2;
import defpackage.h42;
import defpackage.ib2;
import defpackage.jb2;
import defpackage.kx0;
import defpackage.lx0;
import defpackage.ql9;
import defpackage.qs2;
import defpackage.ua1;
import defpackage.ww8;
import defpackage.yj0;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class TraceWriter implements ql9 {
    public static final a f = new a(null);
    private final jb2 a;
    private final kx0 b;
    private final h42 c;
    private final lx0 d;
    private final InternalLogger e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public TraceWriter(jb2 jb2Var, kx0 kx0Var, h42 h42Var, lx0 lx0Var, InternalLogger internalLogger) {
        zq3.h(jb2Var, "sdkCore");
        zq3.h(kx0Var, "ddSpanToSpanEventMapper");
        zq3.h(h42Var, "eventMapper");
        zq3.h(lx0Var, "serializer");
        zq3.h(internalLogger, "internalLogger");
        this.a = jb2Var;
        this.b = kx0Var;
        this.c = h42Var;
        this.d = lx0Var;
        this.e = internalLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(ua1 ua1Var, f32 f32Var, com.datadog.opentracing.a aVar) {
        final cy7 cy7Var = (cy7) this.c.b((cy7) this.b.a(ua1Var, aVar));
        if (cy7Var == null) {
            return;
        }
        try {
            String a2 = this.d.a(ua1Var, cy7Var);
            if (a2 != null) {
                byte[] bytes = a2.getBytes(yj0.b);
                zq3.g(bytes, "getBytes(...)");
                if (bytes != null) {
                    synchronized (this) {
                        f32Var.a(new bp6(bytes, null, 2, null), null, EventType.DEFAULT);
                    }
                }
            }
        } catch (Throwable th) {
            InternalLogger.b.b(this.e, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.trace.internal.data.TraceWriter$writeSpan$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Error serializing %s model", Arrays.copyOf(new Object[]{cy7.this.getClass().getSimpleName()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, th, false, null, 48, null);
        }
    }

    @Override // defpackage.ql9
    public void N0() {
    }

    @Override // defpackage.ql9
    public void Y(final List list) {
        ib2 d;
        if (list == null || (d = this.a.d("tracing")) == null) {
            return;
        }
        ib2.a.a(d, false, new gt2() { // from class: com.datadog.android.trace.internal.data.TraceWriter$write$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(ua1 ua1Var, f32 f32Var) {
                zq3.h(ua1Var, "datadogContext");
                zq3.h(f32Var, "eventBatchWriter");
                List<a> list2 = list;
                TraceWriter traceWriter = this;
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    traceWriter.b(ua1Var, f32Var, (a) it2.next());
                }
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((ua1) obj, (f32) obj2);
                return ww8.a;
            }
        }, 1, null);
    }

    @Override // defpackage.ql9, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // defpackage.ql9
    public void start() {
    }
}
