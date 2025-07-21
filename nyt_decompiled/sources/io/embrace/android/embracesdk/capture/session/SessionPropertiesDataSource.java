package io.embrace.android.embracesdk.capture.session;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.datasource.DataSourceImpl;
import io.embrace.android.embracesdk.arch.destination.SessionSpanWriter;
import io.embrace.android.embracesdk.arch.destination.SpanAttributeData;
import io.embrace.android.embracesdk.arch.limits.UpToLimitStrategy;
import io.embrace.android.embracesdk.config.behavior.SessionBehavior;
import io.embrace.android.embracesdk.internal.spans.EmbraceExtensionsKt;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.util.Map;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes5.dex */
public final class SessionPropertiesDataSource extends DataSourceImpl<SessionSpanWriter> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionPropertiesDataSource(final SessionBehavior sessionBehavior, SessionSpanWriter sessionSpanWriter, InternalEmbraceLogger internalEmbraceLogger) {
        super(sessionSpanWriter, internalEmbraceLogger, new UpToLimitStrategy(internalEmbraceLogger, new qs2() { // from class: io.embrace.android.embracesdk.capture.session.SessionPropertiesDataSource.1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Integer.valueOf(invoke());
            }

            public final int invoke() {
                return SessionBehavior.this.getMaxSessionProperties();
            }
        }));
        zq3.h(sessionBehavior, "sessionBehavior");
        zq3.h(sessionSpanWriter, "writer");
        zq3.h(internalEmbraceLogger, "logger");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addAttribute(SessionSpanWriter sessionSpanWriter, String str, String str2) {
        return sessionSpanWriter.addCustomAttribute(new SpanAttributeData(EmbraceExtensionsKt.toSessionPropertyAttributeName(str), str2));
    }

    public final boolean addProperties(final Map<String, String> map) {
        zq3.h(map, "properties");
        return alterSessionSpan(new qs2() { // from class: io.embrace.android.embracesdk.capture.session.SessionPropertiesDataSource$addProperties$1
            public final boolean invoke() {
                return true;
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Boolean.valueOf(invoke());
            }
        }, new ss2() { // from class: io.embrace.android.embracesdk.capture.session.SessionPropertiesDataSource$addProperties$2
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
                zq3.h(sessionSpanWriter, "$receiver");
                for (Map.Entry entry : map.entrySet()) {
                    SessionPropertiesDataSource.this.addAttribute(sessionSpanWriter, (String) entry.getKey(), (String) entry.getValue());
                }
            }
        });
    }

    public final boolean addProperty(final String str, final String str2) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "value");
        return alterSessionSpan(new qs2() { // from class: io.embrace.android.embracesdk.capture.session.SessionPropertiesDataSource$addProperty$1
            public final boolean invoke() {
                return true;
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Boolean.valueOf(invoke());
            }
        }, new ss2() { // from class: io.embrace.android.embracesdk.capture.session.SessionPropertiesDataSource$addProperty$2
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
                zq3.h(sessionSpanWriter, "$receiver");
                SessionPropertiesDataSource.this.addAttribute(sessionSpanWriter, str, str2);
            }
        });
    }

    public final boolean removeProperty(final String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = false;
        alterSessionSpan(new qs2() { // from class: io.embrace.android.embracesdk.capture.session.SessionPropertiesDataSource$removeProperty$1
            public final boolean invoke() {
                return true;
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Boolean.valueOf(invoke());
            }
        }, new ss2() { // from class: io.embrace.android.embracesdk.capture.session.SessionPropertiesDataSource$removeProperty$2
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
                zq3.h(sessionSpanWriter, "$receiver");
                Ref$BooleanRef.this.element = sessionSpanWriter.removeCustomAttribute(EmbraceExtensionsKt.toSessionPropertyAttributeName(str));
            }
        });
        return ref$BooleanRef.element;
    }
}
