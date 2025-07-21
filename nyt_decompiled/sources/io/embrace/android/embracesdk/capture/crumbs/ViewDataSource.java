package io.embrace.android.embracesdk.capture.crumbs;

import defpackage.ku8;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.datasource.DataSourceImplKt;
import io.embrace.android.embracesdk.arch.datasource.SpanDataSourceImpl;
import io.embrace.android.embracesdk.arch.datasource.SpanDataSourceKt;
import io.embrace.android.embracesdk.arch.destination.StartSpanData;
import io.embrace.android.embracesdk.arch.destination.StartSpanMapper;
import io.embrace.android.embracesdk.arch.limits.UpToLimitStrategy;
import io.embrace.android.embracesdk.arch.schema.SchemaType;
import io.embrace.android.embracesdk.config.behavior.BreadcrumbBehavior;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.FragmentBreadcrumb;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class ViewDataSource extends SpanDataSourceImpl implements StartSpanMapper<FragmentBreadcrumb> {
    private final Clock clock;
    private final LinkedHashMap<String, EmbraceSpan> viewSpans;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewDataSource(final BreadcrumbBehavior breadcrumbBehavior, Clock clock, SpanService spanService, InternalEmbraceLogger internalEmbraceLogger) {
        super(spanService, internalEmbraceLogger, new UpToLimitStrategy(internalEmbraceLogger, new qs2() { // from class: io.embrace.android.embracesdk.capture.crumbs.ViewDataSource.1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Integer.valueOf(invoke());
            }

            public final int invoke() {
                return BreadcrumbBehavior.this.getFragmentBreadcrumbLimit();
            }
        }));
        zq3.h(breadcrumbBehavior, "breadcrumbBehavior");
        zq3.h(clock, "clock");
        zq3.h(spanService, "spanService");
        zq3.h(internalEmbraceLogger, "logger");
        this.clock = clock;
        this.viewSpans = new LinkedHashMap<>();
    }

    public final void changeView(String str, boolean z) {
        Set<String> keySet = this.viewSpans.keySet();
        zq3.g(keySet, "viewSpans.keys");
        String str2 = (String) i.x0(keySet);
        if (z || h.w(str, str2, true)) {
            endView(str2);
        }
        startView(str);
    }

    public final boolean endView(final String str) {
        return captureSpanData(false, new qs2() { // from class: io.embrace.android.embracesdk.capture.crumbs.ViewDataSource$endView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Boolean.valueOf(invoke());
            }

            public final boolean invoke() {
                String str2 = str;
                return !(str2 == null || str2.length() == 0);
            }
        }, new ss2() { // from class: io.embrace.android.embracesdk.capture.crumbs.ViewDataSource$endView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SpanService) obj);
                return ww8.a;
            }

            public final void invoke(SpanService spanService) {
                LinkedHashMap linkedHashMap;
                zq3.h(spanService, "$receiver");
                linkedHashMap = ViewDataSource.this.viewSpans;
                String str2 = str;
                if (linkedHashMap == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                }
                EmbraceSpan embraceSpan = (EmbraceSpan) ku8.d(linkedHashMap).remove(str2);
                if (embraceSpan != null) {
                    embraceSpan.stop();
                }
            }
        });
    }

    public final void onViewClose() {
        Iterator<Map.Entry<String, EmbraceSpan>> it2 = this.viewSpans.entrySet().iterator();
        while (it2.hasNext()) {
            final EmbraceSpan value = it2.next().getValue();
            captureSpanData(false, DataSourceImplKt.getNoInputValidation(), new ss2() { // from class: io.embrace.android.embracesdk.capture.crumbs.ViewDataSource$onViewClose$1$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SpanService) obj);
                    return ww8.a;
                }

                public final void invoke(SpanService spanService) {
                    zq3.h(spanService, "$receiver");
                    EmbraceSpan.this.stop();
                }
            });
        }
    }

    public final boolean startView(final String str) {
        return captureSpanData(true, new qs2() { // from class: io.embrace.android.embracesdk.capture.crumbs.ViewDataSource$startView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Boolean.valueOf(invoke());
            }

            public final boolean invoke() {
                String str2 = str;
                return !(str2 == null || str2.length() == 0);
            }
        }, new ss2() { // from class: io.embrace.android.embracesdk.capture.crumbs.ViewDataSource$startView$2

            /* renamed from: io.embrace.android.embracesdk.capture.crumbs.ViewDataSource$startView$2$1, reason: invalid class name */
            static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
                AnonymousClass1(ViewDataSource viewDataSource) {
                    super(1, viewDataSource, ViewDataSource.class, "toStartSpanData", "toStartSpanData(Lio/embrace/android/embracesdk/payload/FragmentBreadcrumb;)Lio/embrace/android/embracesdk/arch/destination/StartSpanData;", 0);
                }

                @Override // defpackage.ss2
                public final StartSpanData invoke(FragmentBreadcrumb fragmentBreadcrumb) {
                    zq3.h(fragmentBreadcrumb, "p1");
                    return ((ViewDataSource) this.receiver).toStartSpanData(fragmentBreadcrumb);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SpanService) obj);
                return ww8.a;
            }

            public final void invoke(SpanService spanService) {
                Clock clock;
                LinkedHashMap linkedHashMap;
                zq3.h(spanService, "$receiver");
                String str2 = str;
                if (str2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                clock = ViewDataSource.this.clock;
                EmbraceSpan startSpanCapture = SpanDataSourceKt.startSpanCapture(spanService, new FragmentBreadcrumb(str2, clock.now(), null, 4, null), new AnonymousClass1(ViewDataSource.this));
                if (startSpanCapture != null) {
                    linkedHashMap = ViewDataSource.this.viewSpans;
                    linkedHashMap.put(str, startSpanCapture);
                }
            }
        });
    }

    @Override // io.embrace.android.embracesdk.arch.destination.StartSpanMapper
    public StartSpanData toStartSpanData(FragmentBreadcrumb fragmentBreadcrumb) {
        zq3.h(fragmentBreadcrumb, "obj");
        return new StartSpanData(new SchemaType.View(fragmentBreadcrumb.getName()), fragmentBreadcrumb.getStart());
    }
}
