package io.embrace.android.embracesdk.capture.crumbs;

import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.datasource.DataSourceImpl;
import io.embrace.android.embracesdk.arch.destination.SessionSpanWriter;
import io.embrace.android.embracesdk.arch.destination.SpanEventData;
import io.embrace.android.embracesdk.arch.destination.SpanEventMapper;
import io.embrace.android.embracesdk.arch.limits.UpToLimitStrategy;
import io.embrace.android.embracesdk.arch.schema.SchemaType;
import io.embrace.android.embracesdk.config.behavior.BreadcrumbBehavior;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.WebViewBreadcrumb;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class WebViewUrlDataSource extends DataSourceImpl<SessionSpanWriter> implements SpanEventMapper<WebViewBreadcrumb> {
    public static final Companion Companion = new Companion(null);
    private static final String QUERY_PARAMETER_DELIMITER = "?";
    private final BreadcrumbBehavior breadcrumbBehavior;
    private final InternalEmbraceLogger logger;

    /* renamed from: io.embrace.android.embracesdk.capture.crumbs.WebViewUrlDataSource$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements qs2 {
        AnonymousClass1(BreadcrumbBehavior breadcrumbBehavior) {
            super(0, breadcrumbBehavior, BreadcrumbBehavior.class, "getWebViewBreadcrumbLimit", "getWebViewBreadcrumbLimit()I", 0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            return Integer.valueOf(invoke());
        }

        public final int invoke() {
            return ((BreadcrumbBehavior) this.receiver).getWebViewBreadcrumbLimit();
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewUrlDataSource(BreadcrumbBehavior breadcrumbBehavior, SessionSpanWriter sessionSpanWriter, InternalEmbraceLogger internalEmbraceLogger) {
        super(sessionSpanWriter, internalEmbraceLogger, new UpToLimitStrategy(internalEmbraceLogger, new AnonymousClass1(breadcrumbBehavior)));
        zq3.h(breadcrumbBehavior, "breadcrumbBehavior");
        zq3.h(sessionSpanWriter, "writer");
        zq3.h(internalEmbraceLogger, "logger");
        this.breadcrumbBehavior = breadcrumbBehavior;
        this.logger = internalEmbraceLogger;
    }

    public final void logWebView(final String str, final long j) {
        try {
            alterSessionSpan(new qs2() { // from class: io.embrace.android.embracesdk.capture.crumbs.WebViewUrlDataSource$logWebView$1
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
                    return str != null;
                }
            }, new ss2() { // from class: io.embrace.android.embracesdk.capture.crumbs.WebViewUrlDataSource$logWebView$2

                /* renamed from: io.embrace.android.embracesdk.capture.crumbs.WebViewUrlDataSource$logWebView$2$1, reason: invalid class name */
                static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
                    AnonymousClass1(WebViewUrlDataSource webViewUrlDataSource) {
                        super(1, webViewUrlDataSource, WebViewUrlDataSource.class, "toSpanEventData", "toSpanEventData(Lio/embrace/android/embracesdk/payload/WebViewBreadcrumb;)Lio/embrace/android/embracesdk/arch/destination/SpanEventData;", 0);
                    }

                    @Override // defpackage.ss2
                    public final SpanEventData invoke(WebViewBreadcrumb webViewBreadcrumb) {
                        zq3.h(webViewBreadcrumb, "p1");
                        return ((WebViewUrlDataSource) this.receiver).toSpanEventData(webViewBreadcrumb);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SessionSpanWriter) obj);
                    return ww8.a;
                }

                public final void invoke(SessionSpanWriter sessionSpanWriter) {
                    BreadcrumbBehavior breadcrumbBehavior;
                    zq3.h(sessionSpanWriter, "$receiver");
                    String str2 = str;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    breadcrumbBehavior = WebViewUrlDataSource.this.breadcrumbBehavior;
                    if (!breadcrumbBehavior.isQueryParamCaptureEnabled()) {
                        String str4 = str;
                        int b0 = str4 != null ? h.b0(str4, "?", 0, false, 6, null) : 0;
                        if (b0 > 0) {
                            String str5 = str;
                            if (str5 != null) {
                                String substring = str5.substring(0, b0);
                                zq3.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                if (substring != null) {
                                    str3 = substring;
                                }
                            }
                            str2 = str3;
                        }
                    }
                    sessionSpanWriter.addEvent(new WebViewBreadcrumb(str2, j), new AnonymousClass1(WebViewUrlDataSource.this));
                }
            });
        } catch (Exception unused) {
            this.logger.log("Failed to log WebView breadcrumb for url " + str, InternalEmbraceLogger.Severity.ERROR, null, false);
        }
    }

    @Override // io.embrace.android.embracesdk.arch.destination.SpanEventMapper
    public SpanEventData toSpanEventData(WebViewBreadcrumb webViewBreadcrumb) {
        zq3.h(webViewBreadcrumb, "obj");
        return new SpanEventData(new SchemaType.WebViewUrl(webViewBreadcrumb.getUrl()), ClockKt.millisToNanos(webViewBreadcrumb.getStartTime$embrace_android_sdk_release()));
    }
}
