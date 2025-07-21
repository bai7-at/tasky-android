package io.embrace.android.embracesdk.payload;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class Session {
    public static final String APPLICATION_STATE_BACKGROUND = "background";
    public static final String APPLICATION_STATE_FOREGROUND = "foreground";
    public static final Companion Companion = new Companion(null);
    public static final String MESSAGE_TYPE_END = "en";
    private final String appState;
    private final BetaFeatures betaFeatures;
    private final String crashReportId;
    private final Long endTime;
    private final LifeEventType endType;
    private final List<String> errorLogIds;
    private final Integer errorLogsAttemptedToSend;
    private final List<String> eventIds;
    private final LegacyExceptionError exceptionError;
    private final List<String> infoLogIds;
    private final Integer infoLogsAttemptedToSend;
    private final boolean isColdStart;
    private final Boolean isEndedCleanly;
    private final Boolean isReceivedTermination;
    private final Long lastHeartbeatTime;
    private final String messageType;
    private final List<String> networkLogIds;
    private final int number;
    private final List<Orientation> orientations;
    private final Map<String, String> properties;
    private final Long sdkStartupDuration;
    private final String sessionId;
    private final long startTime;
    private final LifeEventType startType;
    private final Long startupDuration;
    private final Long startupThreshold;
    private final Map<String, String> symbols;
    private final Long terminationTime;
    private final Integer unhandledExceptions;
    private final Integer warnLogsAttemptedToSend;
    private final List<String> warningLogIds;
    private final List<WebViewInfo> webViewInfo;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum LifeEventType {
        STATE,
        MANUAL,
        BKGND_STATE,
        BKGND_MANUAL
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z) {
        this(str, j, i, str2, str3, z, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -64, null);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final Boolean component10() {
        return this.isEndedCleanly;
    }

    public final Boolean component11() {
        return this.isReceivedTermination;
    }

    public final List<String> component12() {
        return this.eventIds;
    }

    public final List<String> component13() {
        return this.infoLogIds;
    }

    public final List<String> component14() {
        return this.warningLogIds;
    }

    public final List<String> component15() {
        return this.errorLogIds;
    }

    public final List<String> component16() {
        return this.networkLogIds;
    }

    public final Integer component17() {
        return this.infoLogsAttemptedToSend;
    }

    public final Integer component18() {
        return this.warnLogsAttemptedToSend;
    }

    public final Integer component19() {
        return this.errorLogsAttemptedToSend;
    }

    public final long component2() {
        return this.startTime;
    }

    public final LegacyExceptionError component20() {
        return this.exceptionError;
    }

    public final String component21() {
        return this.crashReportId;
    }

    public final LifeEventType component22() {
        return this.endType;
    }

    public final LifeEventType component23() {
        return this.startType;
    }

    public final List<Orientation> component24() {
        return this.orientations;
    }

    public final Map<String, String> component25() {
        return this.properties;
    }

    public final Long component26() {
        return this.startupDuration;
    }

    public final Long component27() {
        return this.startupThreshold;
    }

    public final Long component28() {
        return this.sdkStartupDuration;
    }

    public final Integer component29() {
        return this.unhandledExceptions;
    }

    public final int component3() {
        return this.number;
    }

    public final BetaFeatures component30() {
        return this.betaFeatures;
    }

    public final Map<String, String> component31() {
        return this.symbols;
    }

    public final List<WebViewInfo> component32() {
        return this.webViewInfo;
    }

    public final String component4() {
        return this.messageType;
    }

    public final String component5() {
        return this.appState;
    }

    public final boolean component6() {
        return this.isColdStart;
    }

    public final Long component7() {
        return this.endTime;
    }

    public final Long component8() {
        return this.lastHeartbeatTime;
    }

    public final Long component9() {
        return this.terminationTime;
    }

    public final Session copy(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3, @bt3(name = "e") LegacyExceptionError legacyExceptionError, @bt3(name = "ri") String str4, @bt3(name = "em") LifeEventType lifeEventType, @bt3(name = "sm") LifeEventType lifeEventType2, @bt3(name = "oc") List<Orientation> list6, @bt3(name = "sp") Map<String, String> map, @bt3(name = "sd") Long l4, @bt3(name = "sdt") Long l5, @bt3(name = "si") Long l6, @bt3(name = "ue") Integer num4, @bt3(name = "bf") BetaFeatures betaFeatures, @bt3(name = "sb") Map<String, String> map2, @bt3(name = "wvi_beta") List<WebViewInfo> list7) {
        zq3.h(str, "sessionId");
        zq3.h(str2, "messageType");
        zq3.h(str3, "appState");
        return new Session(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, num3, legacyExceptionError, str4, lifeEventType, lifeEventType2, list6, map, l4, l5, l6, num4, betaFeatures, map2, list7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return zq3.c(this.sessionId, session.sessionId) && this.startTime == session.startTime && this.number == session.number && zq3.c(this.messageType, session.messageType) && zq3.c(this.appState, session.appState) && this.isColdStart == session.isColdStart && zq3.c(this.endTime, session.endTime) && zq3.c(this.lastHeartbeatTime, session.lastHeartbeatTime) && zq3.c(this.terminationTime, session.terminationTime) && zq3.c(this.isEndedCleanly, session.isEndedCleanly) && zq3.c(this.isReceivedTermination, session.isReceivedTermination) && zq3.c(this.eventIds, session.eventIds) && zq3.c(this.infoLogIds, session.infoLogIds) && zq3.c(this.warningLogIds, session.warningLogIds) && zq3.c(this.errorLogIds, session.errorLogIds) && zq3.c(this.networkLogIds, session.networkLogIds) && zq3.c(this.infoLogsAttemptedToSend, session.infoLogsAttemptedToSend) && zq3.c(this.warnLogsAttemptedToSend, session.warnLogsAttemptedToSend) && zq3.c(this.errorLogsAttemptedToSend, session.errorLogsAttemptedToSend) && zq3.c(this.exceptionError, session.exceptionError) && zq3.c(this.crashReportId, session.crashReportId) && zq3.c(this.endType, session.endType) && zq3.c(this.startType, session.startType) && zq3.c(this.orientations, session.orientations) && zq3.c(this.properties, session.properties) && zq3.c(this.startupDuration, session.startupDuration) && zq3.c(this.startupThreshold, session.startupThreshold) && zq3.c(this.sdkStartupDuration, session.sdkStartupDuration) && zq3.c(this.unhandledExceptions, session.unhandledExceptions) && zq3.c(this.betaFeatures, session.betaFeatures) && zq3.c(this.symbols, session.symbols) && zq3.c(this.webViewInfo, session.webViewInfo);
    }

    public final String getAppState() {
        return this.appState;
    }

    public final BetaFeatures getBetaFeatures() {
        return this.betaFeatures;
    }

    public final String getCrashReportId() {
        return this.crashReportId;
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final LifeEventType getEndType() {
        return this.endType;
    }

    public final List<String> getErrorLogIds() {
        return this.errorLogIds;
    }

    public final Integer getErrorLogsAttemptedToSend() {
        return this.errorLogsAttemptedToSend;
    }

    public final List<String> getEventIds() {
        return this.eventIds;
    }

    public final LegacyExceptionError getExceptionError() {
        return this.exceptionError;
    }

    public final List<String> getInfoLogIds() {
        return this.infoLogIds;
    }

    public final Integer getInfoLogsAttemptedToSend() {
        return this.infoLogsAttemptedToSend;
    }

    public final Long getLastHeartbeatTime() {
        return this.lastHeartbeatTime;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final List<String> getNetworkLogIds() {
        return this.networkLogIds;
    }

    public final int getNumber() {
        return this.number;
    }

    public final List<Orientation> getOrientations() {
        return this.orientations;
    }

    public final Map<String, String> getProperties() {
        return this.properties;
    }

    public final Long getSdkStartupDuration() {
        return this.sdkStartupDuration;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final LifeEventType getStartType() {
        return this.startType;
    }

    public final Long getStartupDuration() {
        return this.startupDuration;
    }

    public final Long getStartupThreshold() {
        return this.startupThreshold;
    }

    public final Map<String, String> getSymbols() {
        return this.symbols;
    }

    public final Long getTerminationTime() {
        return this.terminationTime;
    }

    public final Integer getUnhandledExceptions() {
        return this.unhandledExceptions;
    }

    public final Integer getWarnLogsAttemptedToSend() {
        return this.warnLogsAttemptedToSend;
    }

    public final List<String> getWarningLogIds() {
        return this.warningLogIds;
    }

    public final List<WebViewInfo> getWebViewInfo() {
        return this.webViewInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.sessionId;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.startTime)) * 31) + Integer.hashCode(this.number)) * 31;
        String str2 = this.messageType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.appState;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isColdStart;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        Long l = this.endTime;
        int hashCode4 = (i2 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.lastHeartbeatTime;
        int hashCode5 = (hashCode4 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.terminationTime;
        int hashCode6 = (hashCode5 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Boolean bool = this.isEndedCleanly;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.isReceivedTermination;
        int hashCode8 = (hashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        List<String> list = this.eventIds;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.infoLogIds;
        int hashCode10 = (hashCode9 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.warningLogIds;
        int hashCode11 = (hashCode10 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.errorLogIds;
        int hashCode12 = (hashCode11 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<String> list5 = this.networkLogIds;
        int hashCode13 = (hashCode12 + (list5 != null ? list5.hashCode() : 0)) * 31;
        Integer num = this.infoLogsAttemptedToSend;
        int hashCode14 = (hashCode13 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.warnLogsAttemptedToSend;
        int hashCode15 = (hashCode14 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.errorLogsAttemptedToSend;
        int hashCode16 = (hashCode15 + (num3 != null ? num3.hashCode() : 0)) * 31;
        LegacyExceptionError legacyExceptionError = this.exceptionError;
        int hashCode17 = (hashCode16 + (legacyExceptionError != null ? legacyExceptionError.hashCode() : 0)) * 31;
        String str4 = this.crashReportId;
        int hashCode18 = (hashCode17 + (str4 != null ? str4.hashCode() : 0)) * 31;
        LifeEventType lifeEventType = this.endType;
        int hashCode19 = (hashCode18 + (lifeEventType != null ? lifeEventType.hashCode() : 0)) * 31;
        LifeEventType lifeEventType2 = this.startType;
        int hashCode20 = (hashCode19 + (lifeEventType2 != null ? lifeEventType2.hashCode() : 0)) * 31;
        List<Orientation> list6 = this.orientations;
        int hashCode21 = (hashCode20 + (list6 != null ? list6.hashCode() : 0)) * 31;
        Map<String, String> map = this.properties;
        int hashCode22 = (hashCode21 + (map != null ? map.hashCode() : 0)) * 31;
        Long l4 = this.startupDuration;
        int hashCode23 = (hashCode22 + (l4 != null ? l4.hashCode() : 0)) * 31;
        Long l5 = this.startupThreshold;
        int hashCode24 = (hashCode23 + (l5 != null ? l5.hashCode() : 0)) * 31;
        Long l6 = this.sdkStartupDuration;
        int hashCode25 = (hashCode24 + (l6 != null ? l6.hashCode() : 0)) * 31;
        Integer num4 = this.unhandledExceptions;
        int hashCode26 = (hashCode25 + (num4 != null ? num4.hashCode() : 0)) * 31;
        BetaFeatures betaFeatures = this.betaFeatures;
        int hashCode27 = (hashCode26 + (betaFeatures != null ? betaFeatures.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.symbols;
        int hashCode28 = (hashCode27 + (map2 != null ? map2.hashCode() : 0)) * 31;
        List<WebViewInfo> list7 = this.webViewInfo;
        return hashCode28 + (list7 != null ? list7.hashCode() : 0);
    }

    public final boolean isColdStart() {
        return this.isColdStart;
    }

    public final Boolean isEndedCleanly() {
        return this.isEndedCleanly;
    }

    public final Boolean isReceivedTermination() {
        return this.isReceivedTermination;
    }

    public String toString() {
        return "Session(sessionId=" + this.sessionId + ", startTime=" + this.startTime + ", number=" + this.number + ", messageType=" + this.messageType + ", appState=" + this.appState + ", isColdStart=" + this.isColdStart + ", endTime=" + this.endTime + ", lastHeartbeatTime=" + this.lastHeartbeatTime + ", terminationTime=" + this.terminationTime + ", isEndedCleanly=" + this.isEndedCleanly + ", isReceivedTermination=" + this.isReceivedTermination + ", eventIds=" + this.eventIds + ", infoLogIds=" + this.infoLogIds + ", warningLogIds=" + this.warningLogIds + ", errorLogIds=" + this.errorLogIds + ", networkLogIds=" + this.networkLogIds + ", infoLogsAttemptedToSend=" + this.infoLogsAttemptedToSend + ", warnLogsAttemptedToSend=" + this.warnLogsAttemptedToSend + ", errorLogsAttemptedToSend=" + this.errorLogsAttemptedToSend + ", exceptionError=" + this.exceptionError + ", crashReportId=" + this.crashReportId + ", endType=" + this.endType + ", startType=" + this.startType + ", orientations=" + this.orientations + ", properties=" + this.properties + ", startupDuration=" + this.startupDuration + ", startupThreshold=" + this.startupThreshold + ", sdkStartupDuration=" + this.sdkStartupDuration + ", unhandledExceptions=" + this.unhandledExceptions + ", betaFeatures=" + this.betaFeatures + ", symbols=" + this.symbols + ", webViewInfo=" + this.webViewInfo + ")";
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l) {
        this(str, j, i, str2, str3, z, l, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -128, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2) {
        this(str, j, i, str2, str3, z, l, l2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -256, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3) {
        this(str, j, i, str2, str3, z, l, l2, l3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -512, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1024, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2048, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4096, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8192, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16384, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32768, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65536, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131072, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262144, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, num3, null, null, null, null, null, null, null, null, null, null, null, null, null, -524288, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3, @bt3(name = "e") LegacyExceptionError legacyExceptionError) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, num3, legacyExceptionError, null, null, null, null, null, null, null, null, null, null, null, null, -1048576, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3, @bt3(name = "e") LegacyExceptionError legacyExceptionError, @bt3(name = "ri") String str4) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, num3, legacyExceptionError, str4, null, null, null, null, null, null, null, null, null, null, null, -2097152, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3, @bt3(name = "e") LegacyExceptionError legacyExceptionError, @bt3(name = "ri") String str4, @bt3(name = "em") LifeEventType lifeEventType) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, num3, legacyExceptionError, str4, lifeEventType, null, null, null, null, null, null, null, null, null, null, -4194304, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3, @bt3(name = "e") LegacyExceptionError legacyExceptionError, @bt3(name = "ri") String str4, @bt3(name = "em") LifeEventType lifeEventType, @bt3(name = "sm") LifeEventType lifeEventType2) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, num3, legacyExceptionError, str4, lifeEventType, lifeEventType2, null, null, null, null, null, null, null, null, null, -8388608, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3, @bt3(name = "e") LegacyExceptionError legacyExceptionError, @bt3(name = "ri") String str4, @bt3(name = "em") LifeEventType lifeEventType, @bt3(name = "sm") LifeEventType lifeEventType2, @bt3(name = "oc") List<Orientation> list6) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, num3, legacyExceptionError, str4, lifeEventType, lifeEventType2, list6, null, null, null, null, null, null, null, null, -16777216, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3, @bt3(name = "e") LegacyExceptionError legacyExceptionError, @bt3(name = "ri") String str4, @bt3(name = "em") LifeEventType lifeEventType, @bt3(name = "sm") LifeEventType lifeEventType2, @bt3(name = "oc") List<Orientation> list6, @bt3(name = "sp") Map<String, String> map) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, num3, legacyExceptionError, str4, lifeEventType, lifeEventType2, list6, map, null, null, null, null, null, null, null, -33554432, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3, @bt3(name = "e") LegacyExceptionError legacyExceptionError, @bt3(name = "ri") String str4, @bt3(name = "em") LifeEventType lifeEventType, @bt3(name = "sm") LifeEventType lifeEventType2, @bt3(name = "oc") List<Orientation> list6, @bt3(name = "sp") Map<String, String> map, @bt3(name = "sd") Long l4) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, num3, legacyExceptionError, str4, lifeEventType, lifeEventType2, list6, map, l4, null, null, null, null, null, null, -67108864, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3, @bt3(name = "e") LegacyExceptionError legacyExceptionError, @bt3(name = "ri") String str4, @bt3(name = "em") LifeEventType lifeEventType, @bt3(name = "sm") LifeEventType lifeEventType2, @bt3(name = "oc") List<Orientation> list6, @bt3(name = "sp") Map<String, String> map, @bt3(name = "sd") Long l4, @bt3(name = "sdt") Long l5) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, num3, legacyExceptionError, str4, lifeEventType, lifeEventType2, list6, map, l4, l5, null, null, null, null, null, -134217728, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3, @bt3(name = "e") LegacyExceptionError legacyExceptionError, @bt3(name = "ri") String str4, @bt3(name = "em") LifeEventType lifeEventType, @bt3(name = "sm") LifeEventType lifeEventType2, @bt3(name = "oc") List<Orientation> list6, @bt3(name = "sp") Map<String, String> map, @bt3(name = "sd") Long l4, @bt3(name = "sdt") Long l5, @bt3(name = "si") Long l6) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, num3, legacyExceptionError, str4, lifeEventType, lifeEventType2, list6, map, l4, l5, l6, null, null, null, null, -268435456, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3, @bt3(name = "e") LegacyExceptionError legacyExceptionError, @bt3(name = "ri") String str4, @bt3(name = "em") LifeEventType lifeEventType, @bt3(name = "sm") LifeEventType lifeEventType2, @bt3(name = "oc") List<Orientation> list6, @bt3(name = "sp") Map<String, String> map, @bt3(name = "sd") Long l4, @bt3(name = "sdt") Long l5, @bt3(name = "si") Long l6, @bt3(name = "ue") Integer num4) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, num3, legacyExceptionError, str4, lifeEventType, lifeEventType2, list6, map, l4, l5, l6, num4, null, null, null, -536870912, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3, @bt3(name = "e") LegacyExceptionError legacyExceptionError, @bt3(name = "ri") String str4, @bt3(name = "em") LifeEventType lifeEventType, @bt3(name = "sm") LifeEventType lifeEventType2, @bt3(name = "oc") List<Orientation> list6, @bt3(name = "sp") Map<String, String> map, @bt3(name = "sd") Long l4, @bt3(name = "sdt") Long l5, @bt3(name = "si") Long l6, @bt3(name = "ue") Integer num4, @bt3(name = "bf") BetaFeatures betaFeatures) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, num3, legacyExceptionError, str4, lifeEventType, lifeEventType2, list6, map, l4, l5, l6, num4, betaFeatures, null, null, -1073741824, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3, @bt3(name = "e") LegacyExceptionError legacyExceptionError, @bt3(name = "ri") String str4, @bt3(name = "em") LifeEventType lifeEventType, @bt3(name = "sm") LifeEventType lifeEventType2, @bt3(name = "oc") List<Orientation> list6, @bt3(name = "sp") Map<String, String> map, @bt3(name = "sd") Long l4, @bt3(name = "sdt") Long l5, @bt3(name = "si") Long l6, @bt3(name = "ue") Integer num4, @bt3(name = "bf") BetaFeatures betaFeatures, @bt3(name = "sb") Map<String, String> map2) {
        this(str, j, i, str2, str3, z, l, l2, l3, bool, bool2, list, list2, list3, list4, list5, num, num2, num3, legacyExceptionError, str4, lifeEventType, lifeEventType2, list6, map, l4, l5, l6, num4, betaFeatures, map2, null, RecyclerView.UNDEFINED_DURATION, null);
    }

    public Session(@bt3(name = "id") String str, @bt3(name = "st") long j, @bt3(name = "sn") int i, @bt3(name = "ty") String str2, @bt3(name = "as") String str3, @bt3(name = "cs") boolean z, @bt3(name = "et") Long l, @bt3(name = "ht") Long l2, @bt3(name = "tt") Long l3, @bt3(name = "ce") Boolean bool, @bt3(name = "tr") Boolean bool2, @bt3(name = "ss") List<String> list, @bt3(name = "il") List<String> list2, @bt3(name = "wl") List<String> list3, @bt3(name = "el") List<String> list4, @bt3(name = "nc") List<String> list5, @bt3(name = "lic") Integer num, @bt3(name = "lwc") Integer num2, @bt3(name = "lec") Integer num3, @bt3(name = "e") LegacyExceptionError legacyExceptionError, @bt3(name = "ri") String str4, @bt3(name = "em") LifeEventType lifeEventType, @bt3(name = "sm") LifeEventType lifeEventType2, @bt3(name = "oc") List<Orientation> list6, @bt3(name = "sp") Map<String, String> map, @bt3(name = "sd") Long l4, @bt3(name = "sdt") Long l5, @bt3(name = "si") Long l6, @bt3(name = "ue") Integer num4, @bt3(name = "bf") BetaFeatures betaFeatures, @bt3(name = "sb") Map<String, String> map2, @bt3(name = "wvi_beta") List<WebViewInfo> list7) {
        zq3.h(str, "sessionId");
        zq3.h(str2, "messageType");
        zq3.h(str3, "appState");
        this.sessionId = str;
        this.startTime = j;
        this.number = i;
        this.messageType = str2;
        this.appState = str3;
        this.isColdStart = z;
        this.endTime = l;
        this.lastHeartbeatTime = l2;
        this.terminationTime = l3;
        this.isEndedCleanly = bool;
        this.isReceivedTermination = bool2;
        this.eventIds = list;
        this.infoLogIds = list2;
        this.warningLogIds = list3;
        this.errorLogIds = list4;
        this.networkLogIds = list5;
        this.infoLogsAttemptedToSend = num;
        this.warnLogsAttemptedToSend = num2;
        this.errorLogsAttemptedToSend = num3;
        this.exceptionError = legacyExceptionError;
        this.crashReportId = str4;
        this.endType = lifeEventType;
        this.startType = lifeEventType2;
        this.orientations = list6;
        this.properties = map;
        this.startupDuration = l4;
        this.startupThreshold = l5;
        this.sdkStartupDuration = l6;
        this.unhandledExceptions = num4;
        this.betaFeatures = betaFeatures;
        this.symbols = map2;
        this.webViewInfo = list7;
    }

    public /* synthetic */ Session(String str, long j, int i, String str2, String str3, boolean z, Long l, Long l2, Long l3, Boolean bool, Boolean bool2, List list, List list2, List list3, List list4, List list5, Integer num, Integer num2, Integer num3, LegacyExceptionError legacyExceptionError, String str4, LifeEventType lifeEventType, LifeEventType lifeEventType2, List list6, Map map, Long l4, Long l5, Long l6, Integer num4, BetaFeatures betaFeatures, Map map2, List list7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i, str2, str3, z, (i2 & 64) != 0 ? null : l, (i2 & 128) != 0 ? null : l2, (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : l3, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : bool2, (i2 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : list, (i2 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : list2, (i2 & 8192) != 0 ? null : list3, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list4, (32768 & i2) != 0 ? null : list5, (65536 & i2) != 0 ? null : num, (131072 & i2) != 0 ? null : num2, (262144 & i2) != 0 ? null : num3, (524288 & i2) != 0 ? null : legacyExceptionError, (1048576 & i2) != 0 ? null : str4, (2097152 & i2) != 0 ? null : lifeEventType, (4194304 & i2) != 0 ? null : lifeEventType2, (8388608 & i2) != 0 ? null : list6, (16777216 & i2) != 0 ? null : map, (33554432 & i2) != 0 ? null : l4, (67108864 & i2) != 0 ? null : l5, (134217728 & i2) != 0 ? null : l6, (268435456 & i2) != 0 ? null : num4, (536870912 & i2) != 0 ? null : betaFeatures, (1073741824 & i2) != 0 ? null : map2, (i2 & RecyclerView.UNDEFINED_DURATION) != 0 ? null : list7);
    }
}
