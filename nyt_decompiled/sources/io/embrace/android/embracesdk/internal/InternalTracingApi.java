package io.embrace.android.embracesdk.internal;

import defpackage.qs2;
import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;

@InternalApi
/* loaded from: classes5.dex */
public interface InternalTracingApi {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean addSpanEvent$default(InternalTracingApi internalTracingApi, String str, String str2, Long l, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSpanEvent");
            }
            if ((i & 4) != 0) {
                l = null;
            }
            if ((i & 8) != 0) {
                map = null;
            }
            return internalTracingApi.addSpanEvent(str, str2, l, map);
        }

        public static /* synthetic */ boolean recordCompletedSpan$default(InternalTracingApi internalTracingApi, String str, long j, long j2, ErrorCode errorCode, String str2, Map map, List list, int i, Object obj) {
            if (obj == null) {
                return internalTracingApi.recordCompletedSpan(str, j, j2, (i & 8) != 0 ? null : errorCode, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recordCompletedSpan");
        }

        public static /* synthetic */ Object recordSpan$default(InternalTracingApi internalTracingApi, String str, String str2, Map map, List list, qs2 qs2Var, int i, Object obj) {
            if (obj == null) {
                return internalTracingApi.recordSpan(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : list, qs2Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recordSpan");
        }

        public static /* synthetic */ String startSpan$default(InternalTracingApi internalTracingApi, String str, String str2, Long l, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSpan");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                l = null;
            }
            return internalTracingApi.startSpan(str, str2, l);
        }

        public static /* synthetic */ boolean stopSpan$default(InternalTracingApi internalTracingApi, String str, ErrorCode errorCode, Long l, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopSpan");
            }
            if ((i & 2) != 0) {
                errorCode = null;
            }
            if ((i & 4) != 0) {
                l = null;
            }
            return internalTracingApi.stopSpan(str, errorCode, l);
        }
    }

    boolean addSpanAttribute(String str, String str2, String str3);

    boolean addSpanEvent(String str, String str2, Long l, Map<String, String> map);

    boolean recordCompletedSpan(String str, long j, long j2, ErrorCode errorCode, String str2, Map<String, String> map, List<? extends Map<String, ? extends Object>> list);

    <T> T recordSpan(String str, String str2, Map<String, String> map, List<? extends Map<String, ? extends Object>> list, qs2 qs2Var);

    String startSpan(String str, String str2, Long l);

    boolean stopSpan(String str, ErrorCode errorCode, Long l);
}
