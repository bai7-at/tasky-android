package io.embrace.android.embracesdk.payload;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.payload.EnvelopeMetadata;
import io.embrace.android.embracesdk.internal.payload.EnvelopeResource;
import io.embrace.android.embracesdk.internal.payload.SessionPayload;
import io.embrace.android.embracesdk.internal.spans.EmbraceSpanData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class SessionMessage {
    private final AppInfo appInfo;
    private final Breadcrumbs breadcrumbs;
    private final SessionPayload data;
    private final DeviceInfo deviceInfo;
    private final EnvelopeMetadata metadata;
    private final String newVersion;
    private final PerformanceInfo performanceInfo;
    private final EnvelopeResource resource;
    private final Session session;
    private final List<EmbraceSpanData> spanSnapshots;
    private final List<EmbraceSpanData> spans;

    /* renamed from: type, reason: collision with root package name */
    private final String f87type;
    private final UserInfo userInfo;
    private final Integer version;

    public SessionMessage(@bt3(name = "s") Session session) {
        this(session, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
    }

    public final Session component1() {
        return this.session;
    }

    public final EnvelopeResource component10() {
        return this.resource;
    }

    public final EnvelopeMetadata component11() {
        return this.metadata;
    }

    public final String component12() {
        return this.newVersion;
    }

    public final String component13() {
        return this.f87type;
    }

    public final SessionPayload component14() {
        return this.data;
    }

    public final UserInfo component2() {
        return this.userInfo;
    }

    public final AppInfo component3() {
        return this.appInfo;
    }

    public final DeviceInfo component4() {
        return this.deviceInfo;
    }

    public final PerformanceInfo component5() {
        return this.performanceInfo;
    }

    public final Breadcrumbs component6() {
        return this.breadcrumbs;
    }

    public final List<EmbraceSpanData> component7() {
        return this.spans;
    }

    public final List<EmbraceSpanData> component8() {
        return this.spanSnapshots;
    }

    public final Integer component9() {
        return this.version;
    }

    public final SessionMessage copy(@bt3(name = "s") Session session, @bt3(name = "u") UserInfo userInfo, @bt3(name = "a") AppInfo appInfo, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "p") PerformanceInfo performanceInfo, @bt3(name = "br") Breadcrumbs breadcrumbs, @bt3(name = "spans") List<EmbraceSpanData> list, @bt3(name = "span_snapshots") List<EmbraceSpanData> list2, @bt3(name = "v") Integer num, @bt3(name = "resource") EnvelopeResource envelopeResource, @bt3(name = "metadata") EnvelopeMetadata envelopeMetadata, @bt3(name = "version") String str, @bt3(name = "type") String str2, @bt3(name = "data") SessionPayload sessionPayload) {
        zq3.h(session, "session");
        return new SessionMessage(session, userInfo, appInfo, deviceInfo, performanceInfo, breadcrumbs, list, list2, num, envelopeResource, envelopeMetadata, str, str2, sessionPayload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionMessage)) {
            return false;
        }
        SessionMessage sessionMessage = (SessionMessage) obj;
        return zq3.c(this.session, sessionMessage.session) && zq3.c(this.userInfo, sessionMessage.userInfo) && zq3.c(this.appInfo, sessionMessage.appInfo) && zq3.c(this.deviceInfo, sessionMessage.deviceInfo) && zq3.c(this.performanceInfo, sessionMessage.performanceInfo) && zq3.c(this.breadcrumbs, sessionMessage.breadcrumbs) && zq3.c(this.spans, sessionMessage.spans) && zq3.c(this.spanSnapshots, sessionMessage.spanSnapshots) && zq3.c(this.version, sessionMessage.version) && zq3.c(this.resource, sessionMessage.resource) && zq3.c(this.metadata, sessionMessage.metadata) && zq3.c(this.newVersion, sessionMessage.newVersion) && zq3.c(this.f87type, sessionMessage.f87type) && zq3.c(this.data, sessionMessage.data);
    }

    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final Breadcrumbs getBreadcrumbs() {
        return this.breadcrumbs;
    }

    public final SessionPayload getData() {
        return this.data;
    }

    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final EnvelopeMetadata getMetadata() {
        return this.metadata;
    }

    public final String getNewVersion() {
        return this.newVersion;
    }

    public final PerformanceInfo getPerformanceInfo() {
        return this.performanceInfo;
    }

    public final EnvelopeResource getResource() {
        return this.resource;
    }

    public final Session getSession() {
        return this.session;
    }

    public final List<EmbraceSpanData> getSpanSnapshots() {
        return this.spanSnapshots;
    }

    public final List<EmbraceSpanData> getSpans() {
        return this.spans;
    }

    public final String getType() {
        return this.f87type;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Session session = this.session;
        int hashCode = (session != null ? session.hashCode() : 0) * 31;
        UserInfo userInfo = this.userInfo;
        int hashCode2 = (hashCode + (userInfo != null ? userInfo.hashCode() : 0)) * 31;
        AppInfo appInfo = this.appInfo;
        int hashCode3 = (hashCode2 + (appInfo != null ? appInfo.hashCode() : 0)) * 31;
        DeviceInfo deviceInfo = this.deviceInfo;
        int hashCode4 = (hashCode3 + (deviceInfo != null ? deviceInfo.hashCode() : 0)) * 31;
        PerformanceInfo performanceInfo = this.performanceInfo;
        int hashCode5 = (hashCode4 + (performanceInfo != null ? performanceInfo.hashCode() : 0)) * 31;
        Breadcrumbs breadcrumbs = this.breadcrumbs;
        int hashCode6 = (hashCode5 + (breadcrumbs != null ? breadcrumbs.hashCode() : 0)) * 31;
        List<EmbraceSpanData> list = this.spans;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        List<EmbraceSpanData> list2 = this.spanSnapshots;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Integer num = this.version;
        int hashCode9 = (hashCode8 + (num != null ? num.hashCode() : 0)) * 31;
        EnvelopeResource envelopeResource = this.resource;
        int hashCode10 = (hashCode9 + (envelopeResource != null ? envelopeResource.hashCode() : 0)) * 31;
        EnvelopeMetadata envelopeMetadata = this.metadata;
        int hashCode11 = (hashCode10 + (envelopeMetadata != null ? envelopeMetadata.hashCode() : 0)) * 31;
        String str = this.newVersion;
        int hashCode12 = (hashCode11 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f87type;
        int hashCode13 = (hashCode12 + (str2 != null ? str2.hashCode() : 0)) * 31;
        SessionPayload sessionPayload = this.data;
        return hashCode13 + (sessionPayload != null ? sessionPayload.hashCode() : 0);
    }

    public String toString() {
        return "SessionMessage(session=" + this.session + ", userInfo=" + this.userInfo + ", appInfo=" + this.appInfo + ", deviceInfo=" + this.deviceInfo + ", performanceInfo=" + this.performanceInfo + ", breadcrumbs=" + this.breadcrumbs + ", spans=" + this.spans + ", spanSnapshots=" + this.spanSnapshots + ", version=" + this.version + ", resource=" + this.resource + ", metadata=" + this.metadata + ", newVersion=" + this.newVersion + ", type=" + this.f87type + ", data=" + this.data + ")";
    }

    public SessionMessage(@bt3(name = "s") Session session, @bt3(name = "u") UserInfo userInfo) {
        this(session, userInfo, null, null, null, null, null, null, null, null, null, null, null, null, 16380, null);
    }

    public SessionMessage(@bt3(name = "s") Session session, @bt3(name = "u") UserInfo userInfo, @bt3(name = "a") AppInfo appInfo) {
        this(session, userInfo, appInfo, null, null, null, null, null, null, null, null, null, null, null, 16376, null);
    }

    public SessionMessage(@bt3(name = "s") Session session, @bt3(name = "u") UserInfo userInfo, @bt3(name = "a") AppInfo appInfo, @bt3(name = "d") DeviceInfo deviceInfo) {
        this(session, userInfo, appInfo, deviceInfo, null, null, null, null, null, null, null, null, null, null, 16368, null);
    }

    public SessionMessage(@bt3(name = "s") Session session, @bt3(name = "u") UserInfo userInfo, @bt3(name = "a") AppInfo appInfo, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "p") PerformanceInfo performanceInfo) {
        this(session, userInfo, appInfo, deviceInfo, performanceInfo, null, null, null, null, null, null, null, null, null, 16352, null);
    }

    public SessionMessage(@bt3(name = "s") Session session, @bt3(name = "u") UserInfo userInfo, @bt3(name = "a") AppInfo appInfo, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "p") PerformanceInfo performanceInfo, @bt3(name = "br") Breadcrumbs breadcrumbs) {
        this(session, userInfo, appInfo, deviceInfo, performanceInfo, breadcrumbs, null, null, null, null, null, null, null, null, 16320, null);
    }

    public SessionMessage(@bt3(name = "s") Session session, @bt3(name = "u") UserInfo userInfo, @bt3(name = "a") AppInfo appInfo, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "p") PerformanceInfo performanceInfo, @bt3(name = "br") Breadcrumbs breadcrumbs, @bt3(name = "spans") List<EmbraceSpanData> list) {
        this(session, userInfo, appInfo, deviceInfo, performanceInfo, breadcrumbs, list, null, null, null, null, null, null, null, 16256, null);
    }

    public SessionMessage(@bt3(name = "s") Session session, @bt3(name = "u") UserInfo userInfo, @bt3(name = "a") AppInfo appInfo, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "p") PerformanceInfo performanceInfo, @bt3(name = "br") Breadcrumbs breadcrumbs, @bt3(name = "spans") List<EmbraceSpanData> list, @bt3(name = "span_snapshots") List<EmbraceSpanData> list2) {
        this(session, userInfo, appInfo, deviceInfo, performanceInfo, breadcrumbs, list, list2, null, null, null, null, null, null, 16128, null);
    }

    public SessionMessage(@bt3(name = "s") Session session, @bt3(name = "u") UserInfo userInfo, @bt3(name = "a") AppInfo appInfo, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "p") PerformanceInfo performanceInfo, @bt3(name = "br") Breadcrumbs breadcrumbs, @bt3(name = "spans") List<EmbraceSpanData> list, @bt3(name = "span_snapshots") List<EmbraceSpanData> list2, @bt3(name = "v") Integer num) {
        this(session, userInfo, appInfo, deviceInfo, performanceInfo, breadcrumbs, list, list2, num, null, null, null, null, null, 15872, null);
    }

    public SessionMessage(@bt3(name = "s") Session session, @bt3(name = "u") UserInfo userInfo, @bt3(name = "a") AppInfo appInfo, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "p") PerformanceInfo performanceInfo, @bt3(name = "br") Breadcrumbs breadcrumbs, @bt3(name = "spans") List<EmbraceSpanData> list, @bt3(name = "span_snapshots") List<EmbraceSpanData> list2, @bt3(name = "v") Integer num, @bt3(name = "resource") EnvelopeResource envelopeResource) {
        this(session, userInfo, appInfo, deviceInfo, performanceInfo, breadcrumbs, list, list2, num, envelopeResource, null, null, null, null, 15360, null);
    }

    public SessionMessage(@bt3(name = "s") Session session, @bt3(name = "u") UserInfo userInfo, @bt3(name = "a") AppInfo appInfo, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "p") PerformanceInfo performanceInfo, @bt3(name = "br") Breadcrumbs breadcrumbs, @bt3(name = "spans") List<EmbraceSpanData> list, @bt3(name = "span_snapshots") List<EmbraceSpanData> list2, @bt3(name = "v") Integer num, @bt3(name = "resource") EnvelopeResource envelopeResource, @bt3(name = "metadata") EnvelopeMetadata envelopeMetadata) {
        this(session, userInfo, appInfo, deviceInfo, performanceInfo, breadcrumbs, list, list2, num, envelopeResource, envelopeMetadata, null, null, null, 14336, null);
    }

    public SessionMessage(@bt3(name = "s") Session session, @bt3(name = "u") UserInfo userInfo, @bt3(name = "a") AppInfo appInfo, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "p") PerformanceInfo performanceInfo, @bt3(name = "br") Breadcrumbs breadcrumbs, @bt3(name = "spans") List<EmbraceSpanData> list, @bt3(name = "span_snapshots") List<EmbraceSpanData> list2, @bt3(name = "v") Integer num, @bt3(name = "resource") EnvelopeResource envelopeResource, @bt3(name = "metadata") EnvelopeMetadata envelopeMetadata, @bt3(name = "version") String str) {
        this(session, userInfo, appInfo, deviceInfo, performanceInfo, breadcrumbs, list, list2, num, envelopeResource, envelopeMetadata, str, null, null, 12288, null);
    }

    public SessionMessage(@bt3(name = "s") Session session, @bt3(name = "u") UserInfo userInfo, @bt3(name = "a") AppInfo appInfo, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "p") PerformanceInfo performanceInfo, @bt3(name = "br") Breadcrumbs breadcrumbs, @bt3(name = "spans") List<EmbraceSpanData> list, @bt3(name = "span_snapshots") List<EmbraceSpanData> list2, @bt3(name = "v") Integer num, @bt3(name = "resource") EnvelopeResource envelopeResource, @bt3(name = "metadata") EnvelopeMetadata envelopeMetadata, @bt3(name = "version") String str, @bt3(name = "type") String str2) {
        this(session, userInfo, appInfo, deviceInfo, performanceInfo, breadcrumbs, list, list2, num, envelopeResource, envelopeMetadata, str, str2, null, 8192, null);
    }

    public SessionMessage(@bt3(name = "s") Session session, @bt3(name = "u") UserInfo userInfo, @bt3(name = "a") AppInfo appInfo, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "p") PerformanceInfo performanceInfo, @bt3(name = "br") Breadcrumbs breadcrumbs, @bt3(name = "spans") List<EmbraceSpanData> list, @bt3(name = "span_snapshots") List<EmbraceSpanData> list2, @bt3(name = "v") Integer num, @bt3(name = "resource") EnvelopeResource envelopeResource, @bt3(name = "metadata") EnvelopeMetadata envelopeMetadata, @bt3(name = "version") String str, @bt3(name = "type") String str2, @bt3(name = "data") SessionPayload sessionPayload) {
        zq3.h(session, "session");
        this.session = session;
        this.userInfo = userInfo;
        this.appInfo = appInfo;
        this.deviceInfo = deviceInfo;
        this.performanceInfo = performanceInfo;
        this.breadcrumbs = breadcrumbs;
        this.spans = list;
        this.spanSnapshots = list2;
        this.version = num;
        this.resource = envelopeResource;
        this.metadata = envelopeMetadata;
        this.newVersion = str;
        this.f87type = str2;
        this.data = sessionPayload;
    }

    public /* synthetic */ SessionMessage(Session session, UserInfo userInfo, AppInfo appInfo, DeviceInfo deviceInfo, PerformanceInfo performanceInfo, Breadcrumbs breadcrumbs, List list, List list2, Integer num, EnvelopeResource envelopeResource, EnvelopeMetadata envelopeMetadata, String str, String str2, SessionPayload sessionPayload, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(session, (i & 2) != 0 ? null : userInfo, (i & 4) != 0 ? null : appInfo, (i & 8) != 0 ? null : deviceInfo, (i & 16) != 0 ? null : performanceInfo, (i & 32) != 0 ? null : breadcrumbs, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : list2, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? 13 : num, (i & 512) != 0 ? null : envelopeResource, (i & 1024) != 0 ? null : envelopeMetadata, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : str, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : str2, (i & 8192) == 0 ? sessionPayload : null);
    }
}
