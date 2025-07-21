package io.embrace.android.embracesdk.injection;

import defpackage.c04;
import defpackage.gp8;
import defpackage.hp6;
import defpackage.iv3;
import defpackage.n94;
import defpackage.qs2;
import defpackage.yl0;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.internal.SystemInfo;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.internal.logs.LogSink;
import io.embrace.android.embracesdk.internal.logs.LogSinkImpl;
import io.embrace.android.embracesdk.internal.spans.CurrentSessionSpan;
import io.embrace.android.embracesdk.internal.spans.CurrentSessionSpanImpl;
import io.embrace.android.embracesdk.internal.spans.EmbraceSpanFactory;
import io.embrace.android.embracesdk.internal.spans.EmbraceSpanFactoryImpl;
import io.embrace.android.embracesdk.internal.spans.EmbraceSpanService;
import io.embrace.android.embracesdk.internal.spans.EmbraceTracer;
import io.embrace.android.embracesdk.internal.spans.InternalTracer;
import io.embrace.android.embracesdk.internal.spans.SpanRepository;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.internal.spans.SpanSink;
import io.embrace.android.embracesdk.internal.spans.SpanSinkImpl;
import io.embrace.android.embracesdk.opentelemetry.OpenTelemetryConfiguration;
import io.embrace.android.embracesdk.opentelemetry.OpenTelemetrySdk;
import kotlin.c;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class OpenTelemetryModuleImpl implements OpenTelemetryModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(OpenTelemetryModuleImpl.class, "embraceSpanFactory", "getEmbraceSpanFactory()Lio/embrace/android/embracesdk/internal/spans/EmbraceSpanFactory;", 0)), zt6.i(new PropertyReference1Impl(OpenTelemetryModuleImpl.class, "spanService", "getSpanService()Lio/embrace/android/embracesdk/internal/spans/SpanService;", 0)), zt6.i(new PropertyReference1Impl(OpenTelemetryModuleImpl.class, "embraceTracer", "getEmbraceTracer()Lio/embrace/android/embracesdk/internal/spans/EmbraceTracer;", 0))};
    private final c04 currentSessionSpan$delegate;
    private final hp6 embraceSpanFactory$delegate;
    private final hp6 embraceTracer$delegate;
    private final InitModule initModule;
    private final c04 internalTracer$delegate;
    private final c04 logSink$delegate;
    private final c04 logger$delegate;
    private final c04 openTelemetryConfiguration$delegate;
    private final c04 openTelemetrySdk$delegate;
    private final c04 spanRepository$delegate;
    private final hp6 spanService$delegate;
    private final c04 spanSink$delegate;
    private final c04 tracer$delegate;

    public OpenTelemetryModuleImpl(InitModule initModule) {
        zq3.h(initModule, "initModule");
        this.initModule = initModule;
        this.spanRepository$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.OpenTelemetryModuleImpl$spanRepository$2
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final SpanRepository mo865invoke() {
                return new SpanRepository();
            }
        });
        this.spanSink$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.OpenTelemetryModuleImpl$spanSink$2
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final SpanSinkImpl mo865invoke() {
                return new SpanSinkImpl();
            }
        });
        this.openTelemetryConfiguration$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.OpenTelemetryModuleImpl$openTelemetryConfiguration$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final OpenTelemetryConfiguration mo865invoke() {
                InitModule initModule2;
                InitModule initModule3;
                SpanSink spanSink = OpenTelemetryModuleImpl.this.getSpanSink();
                LogSink logSink = OpenTelemetryModuleImpl.this.getLogSink();
                initModule2 = OpenTelemetryModuleImpl.this.initModule;
                SystemInfo systemInfo = initModule2.getSystemInfo();
                initModule3 = OpenTelemetryModuleImpl.this.initModule;
                return new OpenTelemetryConfiguration(spanSink, logSink, systemInfo, initModule3.getProcessIdentifier());
            }
        });
        this.openTelemetrySdk$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.OpenTelemetryModuleImpl$openTelemetrySdk$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final OpenTelemetrySdk mo865invoke() {
                InitModule initModule2;
                try {
                    Systrace.startSynchronous("otel-sdk-wrapper-init");
                    initModule2 = OpenTelemetryModuleImpl.this.initModule;
                    return new OpenTelemetrySdk(initModule2.getOpenTelemetryClock(), OpenTelemetryModuleImpl.this.getOpenTelemetryConfiguration());
                } finally {
                }
            }
        });
        this.tracer$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.OpenTelemetryModuleImpl$tracer$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final gp8 mo865invoke() {
                OpenTelemetrySdk openTelemetrySdk;
                openTelemetrySdk = OpenTelemetryModuleImpl.this.getOpenTelemetrySdk();
                return openTelemetrySdk.getOpenTelemetryTracer();
            }
        });
        qs2 qs2Var = new qs2() { // from class: io.embrace.android.embracesdk.injection.OpenTelemetryModuleImpl$embraceSpanFactory$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceSpanFactoryImpl mo865invoke() {
                InitModule initModule2;
                gp8 tracer = OpenTelemetryModuleImpl.this.getTracer();
                initModule2 = OpenTelemetryModuleImpl.this.initModule;
                return new EmbraceSpanFactoryImpl(tracer, initModule2.getOpenTelemetryClock(), OpenTelemetryModuleImpl.this.getSpanRepository());
            }
        };
        LoadType loadType = LoadType.LAZY;
        this.embraceSpanFactory$delegate = new SingletonDelegate(loadType, qs2Var);
        this.currentSessionSpan$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.OpenTelemetryModuleImpl$currentSessionSpan$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final CurrentSessionSpanImpl mo865invoke() {
                InitModule initModule2;
                InitModule initModule3;
                initModule2 = OpenTelemetryModuleImpl.this.initModule;
                yl0 openTelemetryClock = initModule2.getOpenTelemetryClock();
                initModule3 = OpenTelemetryModuleImpl.this.initModule;
                return new CurrentSessionSpanImpl(openTelemetryClock, initModule3.getTelemetryService(), OpenTelemetryModuleImpl.this.getSpanRepository(), OpenTelemetryModuleImpl.this.getSpanSink(), new qs2() { // from class: io.embrace.android.embracesdk.injection.OpenTelemetryModuleImpl$currentSessionSpan$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final EmbraceSpanFactory mo865invoke() {
                        EmbraceSpanFactory embraceSpanFactory;
                        embraceSpanFactory = OpenTelemetryModuleImpl.this.getEmbraceSpanFactory();
                        return embraceSpanFactory;
                    }
                });
            }
        });
        this.spanService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.OpenTelemetryModuleImpl$spanService$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceSpanService mo865invoke() {
                return new EmbraceSpanService(OpenTelemetryModuleImpl.this.getSpanRepository(), OpenTelemetryModuleImpl.this.getCurrentSessionSpan(), new qs2() { // from class: io.embrace.android.embracesdk.injection.OpenTelemetryModuleImpl$spanService$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final EmbraceSpanFactory mo865invoke() {
                        EmbraceSpanFactory embraceSpanFactory;
                        embraceSpanFactory = OpenTelemetryModuleImpl.this.getEmbraceSpanFactory();
                        return embraceSpanFactory;
                    }
                });
            }
        });
        this.embraceTracer$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.OpenTelemetryModuleImpl$embraceTracer$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceTracer mo865invoke() {
                InitModule initModule2;
                initModule2 = OpenTelemetryModuleImpl.this.initModule;
                return new EmbraceTracer(initModule2.getClock(), OpenTelemetryModuleImpl.this.getSpanService());
            }
        });
        this.internalTracer$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.OpenTelemetryModuleImpl$internalTracer$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final InternalTracer mo865invoke() {
                return new InternalTracer(OpenTelemetryModuleImpl.this.getSpanRepository(), OpenTelemetryModuleImpl.this.getEmbraceTracer());
            }
        });
        this.logger$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.OpenTelemetryModuleImpl$logger$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final n94 mo865invoke() {
                OpenTelemetrySdk openTelemetrySdk;
                openTelemetrySdk = OpenTelemetryModuleImpl.this.getOpenTelemetrySdk();
                return openTelemetrySdk.getOpenTelemetryLogger();
            }
        });
        this.logSink$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.OpenTelemetryModuleImpl$logSink$2
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final LogSinkImpl mo865invoke() {
                return new LogSinkImpl();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmbraceSpanFactory getEmbraceSpanFactory() {
        return (EmbraceSpanFactory) this.embraceSpanFactory$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OpenTelemetrySdk getOpenTelemetrySdk() {
        return (OpenTelemetrySdk) this.openTelemetrySdk$delegate.getValue();
    }

    @Override // io.embrace.android.embracesdk.injection.OpenTelemetryModule
    public CurrentSessionSpan getCurrentSessionSpan() {
        return (CurrentSessionSpan) this.currentSessionSpan$delegate.getValue();
    }

    @Override // io.embrace.android.embracesdk.injection.OpenTelemetryModule
    public EmbraceTracer getEmbraceTracer() {
        return (EmbraceTracer) this.embraceTracer$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.embrace.android.embracesdk.injection.OpenTelemetryModule
    public InternalTracer getInternalTracer() {
        return (InternalTracer) this.internalTracer$delegate.getValue();
    }

    @Override // io.embrace.android.embracesdk.injection.OpenTelemetryModule
    public LogSink getLogSink() {
        return (LogSink) this.logSink$delegate.getValue();
    }

    @Override // io.embrace.android.embracesdk.injection.OpenTelemetryModule
    public n94 getLogger() {
        return (n94) this.logger$delegate.getValue();
    }

    @Override // io.embrace.android.embracesdk.injection.OpenTelemetryModule
    public OpenTelemetryConfiguration getOpenTelemetryConfiguration() {
        return (OpenTelemetryConfiguration) this.openTelemetryConfiguration$delegate.getValue();
    }

    @Override // io.embrace.android.embracesdk.injection.OpenTelemetryModule
    public SpanRepository getSpanRepository() {
        return (SpanRepository) this.spanRepository$delegate.getValue();
    }

    @Override // io.embrace.android.embracesdk.injection.OpenTelemetryModule
    public SpanService getSpanService() {
        return (SpanService) this.spanService$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.embrace.android.embracesdk.injection.OpenTelemetryModule
    public SpanSink getSpanSink() {
        return (SpanSink) this.spanSink$delegate.getValue();
    }

    @Override // io.embrace.android.embracesdk.injection.OpenTelemetryModule
    public gp8 getTracer() {
        return (gp8) this.tracer$delegate.getValue();
    }
}
