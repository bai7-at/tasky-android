package io.embrace.android.embracesdk.internal.spans;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.EmbType;
import io.embrace.android.embracesdk.arch.schema.TelemetryType;
import io.embrace.android.embracesdk.internal.Initializable;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.EmbraceSpanEvent;
import io.embrace.android.embracesdk.spans.ErrorCode;
import io.embrace.android.embracesdk.spans.PersistableEmbraceSpan;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes5.dex */
public interface SpanService extends Initializable {

    public static final class DefaultImpls {
        public static /* synthetic */ PersistableEmbraceSpan createSpan$default(SpanService spanService, String str, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSpan");
            }
            if ((i & 2) != 0) {
                embraceSpan = null;
            }
            EmbraceSpan embraceSpan2 = embraceSpan;
            if ((i & 4) != 0) {
                telemetryType = EmbType.Performance.Default.INSTANCE;
            }
            TelemetryType telemetryType2 = telemetryType;
            if ((i & 8) != 0) {
                z = true;
            }
            boolean z3 = z;
            return spanService.createSpan(str, embraceSpan2, telemetryType2, z3, (i & 16) != 0 ? z3 : z2);
        }

        public static /* synthetic */ boolean recordCompletedSpan$default(SpanService spanService, String str, long j, long j2, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2, Map map, List list, ErrorCode errorCode, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recordCompletedSpan");
            }
            EmbraceSpan embraceSpan2 = (i & 8) != 0 ? null : embraceSpan;
            TelemetryType telemetryType2 = (i & 16) != 0 ? EmbType.Performance.Default.INSTANCE : telemetryType;
            boolean z3 = (i & 32) != 0 ? true : z;
            return spanService.recordCompletedSpan(str, j, j2, embraceSpan2, telemetryType2, z3, (i & 64) != 0 ? z3 : z2, (i & 128) != 0 ? t.i() : map, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? i.l() : list, (i & 512) != 0 ? null : errorCode);
        }

        public static /* synthetic */ Object recordSpan$default(SpanService spanService, String str, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2, Map map, List list, qs2 qs2Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recordSpan");
            }
            EmbraceSpan embraceSpan2 = (i & 2) != 0 ? null : embraceSpan;
            TelemetryType telemetryType2 = (i & 4) != 0 ? EmbType.Performance.Default.INSTANCE : telemetryType;
            boolean z3 = (i & 8) != 0 ? true : z;
            return spanService.recordSpan(str, embraceSpan2, telemetryType2, z3, (i & 16) != 0 ? z3 : z2, (i & 32) != 0 ? t.i() : map, (i & 64) != 0 ? i.l() : list, qs2Var);
        }

        public static PersistableEmbraceSpan startSpan(SpanService spanService, String str, EmbraceSpan embraceSpan, Long l, TelemetryType telemetryType, boolean z, boolean z2) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
            PersistableEmbraceSpan createSpan = spanService.createSpan(str, embraceSpan, telemetryType, z, z2);
            if (createSpan == null || !createSpan.start(l)) {
                return null;
            }
            return createSpan;
        }

        public static /* synthetic */ PersistableEmbraceSpan startSpan$default(SpanService spanService, String str, EmbraceSpan embraceSpan, Long l, TelemetryType telemetryType, boolean z, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSpan");
            }
            EmbraceSpan embraceSpan2 = (i & 2) != 0 ? null : embraceSpan;
            Long l2 = (i & 4) == 0 ? l : null;
            TelemetryType telemetryType2 = (i & 8) != 0 ? EmbType.Performance.Default.INSTANCE : telemetryType;
            boolean z3 = (i & 16) != 0 ? true : z;
            return spanService.startSpan(str, embraceSpan2, l2, telemetryType2, z3, (i & 32) != 0 ? z3 : z2);
        }
    }

    PersistableEmbraceSpan createSpan(String str, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2);

    EmbraceSpan getSpan(String str);

    boolean recordCompletedSpan(String str, long j, long j2, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2, Map<String, String> map, List<EmbraceSpanEvent> list, ErrorCode errorCode);

    <T> T recordSpan(String str, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2, Map<String, String> map, List<EmbraceSpanEvent> list, qs2 qs2Var);

    PersistableEmbraceSpan startSpan(String str, EmbraceSpan embraceSpan, Long l, TelemetryType telemetryType, boolean z, boolean z2);
}
