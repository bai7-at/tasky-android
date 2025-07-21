package io.embrace.android.embracesdk.capture.connectivity;

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
import io.embrace.android.embracesdk.comms.delivery.NetworkStatus;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final class NetworkStatusDataSource extends SpanDataSourceImpl implements StartSpanMapper<NetworkStatusData> {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final int MAX_CAPTURED_NETWORK_STATUS = 100;
    private EmbraceSpan span;

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStatusDataSource(SpanService spanService, InternalEmbraceLogger internalEmbraceLogger) {
        super(spanService, internalEmbraceLogger, new UpToLimitStrategy(internalEmbraceLogger, new qs2() { // from class: io.embrace.android.embracesdk.capture.connectivity.NetworkStatusDataSource.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Integer.valueOf(invoke());
            }

            public final int invoke() {
                Companion unused = NetworkStatusDataSource.Companion;
                return 100;
            }
        }));
        zq3.h(spanService, "spanService");
        zq3.h(internalEmbraceLogger, "logger");
    }

    public final void networkStatusChange(final NetworkStatus networkStatus, final long j) {
        zq3.h(networkStatus, "networkStatus");
        if (this.span != null) {
            captureSpanData(false, DataSourceImplKt.getNoInputValidation(), new ss2() { // from class: io.embrace.android.embracesdk.capture.connectivity.NetworkStatusDataSource$networkStatusChange$1
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
                    EmbraceSpan embraceSpan;
                    zq3.h(spanService, "$receiver");
                    embraceSpan = NetworkStatusDataSource.this.span;
                    if (embraceSpan != null) {
                        embraceSpan.stop(Long.valueOf(j));
                    }
                }
            });
        }
        captureSpanData(true, DataSourceImplKt.getNoInputValidation(), new ss2() { // from class: io.embrace.android.embracesdk.capture.connectivity.NetworkStatusDataSource$networkStatusChange$2

            /* renamed from: io.embrace.android.embracesdk.capture.connectivity.NetworkStatusDataSource$networkStatusChange$2$1, reason: invalid class name */
            static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
                AnonymousClass1(NetworkStatusDataSource networkStatusDataSource) {
                    super(1, networkStatusDataSource, NetworkStatusDataSource.class, "toStartSpanData", "toStartSpanData(Lio/embrace/android/embracesdk/capture/connectivity/NetworkStatusData;)Lio/embrace/android/embracesdk/arch/destination/StartSpanData;", 0);
                }

                @Override // defpackage.ss2
                public final StartSpanData invoke(NetworkStatusData networkStatusData) {
                    zq3.h(networkStatusData, "p1");
                    return ((NetworkStatusDataSource) this.receiver).toStartSpanData(networkStatusData);
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
                zq3.h(spanService, "$receiver");
                NetworkStatusDataSource.this.span = SpanDataSourceKt.startSpanCapture(spanService, new NetworkStatusData(networkStatus, j), new AnonymousClass1(NetworkStatusDataSource.this));
            }
        });
    }

    @Override // io.embrace.android.embracesdk.arch.datasource.DataSourceImpl, io.embrace.android.embracesdk.arch.datasource.DataSource
    public void resetDataCaptureLimits() {
        super.resetDataCaptureLimits();
    }

    @Override // io.embrace.android.embracesdk.arch.destination.StartSpanMapper
    public StartSpanData toStartSpanData(NetworkStatusData networkStatusData) {
        zq3.h(networkStatusData, "obj");
        return new StartSpanData(new SchemaType.NetworkStatus(networkStatusData.getNetworkStatus()), networkStatusData.getTimestamp());
    }
}
