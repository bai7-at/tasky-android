package io.embrace.android.embracesdk.payload;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.payload.EnvelopeMetadata;
import io.embrace.android.embracesdk.internal.payload.EnvelopeResource;
import io.embrace.android.embracesdk.internal.payload.SessionPayload;
import io.embrace.android.embracesdk.internal.spans.EmbraceSpanData;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class SessionMessageJsonAdapter extends JsonAdapter<SessionMessage> {
    private volatile Constructor<SessionMessage> constructorRef;
    private final JsonAdapter<AppInfo> nullableAppInfoAdapter;
    private final JsonAdapter<Breadcrumbs> nullableBreadcrumbsAdapter;
    private final JsonAdapter<DeviceInfo> nullableDeviceInfoAdapter;
    private final JsonAdapter<EnvelopeMetadata> nullableEnvelopeMetadataAdapter;
    private final JsonAdapter<EnvelopeResource> nullableEnvelopeResourceAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<EmbraceSpanData>> nullableListOfEmbraceSpanDataAdapter;
    private final JsonAdapter<PerformanceInfo> nullablePerformanceInfoAdapter;
    private final JsonAdapter<SessionPayload> nullableSessionPayloadAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<UserInfo> nullableUserInfoAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<Session> sessionAdapter;

    public SessionMessageJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("s", QueryKeys.USER_ID, Tag.A, QueryKeys.SUBDOMAIN, "p", "br", "spans", "span_snapshots", QueryKeys.INTERNAL_REFERRER, "resource", "metadata", "version", TransferTable.COLUMN_TYPE, "data");
        zq3.g(a, "JsonReader.Options.of(\"s…version\", \"type\", \"data\")");
        this.options = a;
        JsonAdapter<Session> f = iVar.f(Session.class, b0.e(), "session");
        zq3.g(f, "moshi.adapter(Session::c…tySet(),\n      \"session\")");
        this.sessionAdapter = f;
        JsonAdapter<UserInfo> f2 = iVar.f(UserInfo.class, b0.e(), "userInfo");
        zq3.g(f2, "moshi.adapter(UserInfo::…  emptySet(), \"userInfo\")");
        this.nullableUserInfoAdapter = f2;
        JsonAdapter<AppInfo> f3 = iVar.f(AppInfo.class, b0.e(), "appInfo");
        zq3.g(f3, "moshi.adapter(AppInfo::c…   emptySet(), \"appInfo\")");
        this.nullableAppInfoAdapter = f3;
        JsonAdapter<DeviceInfo> f4 = iVar.f(DeviceInfo.class, b0.e(), "deviceInfo");
        zq3.g(f4, "moshi.adapter(DeviceInfo…emptySet(), \"deviceInfo\")");
        this.nullableDeviceInfoAdapter = f4;
        JsonAdapter<PerformanceInfo> f5 = iVar.f(PerformanceInfo.class, b0.e(), "performanceInfo");
        zq3.g(f5, "moshi.adapter(Performanc…Set(), \"performanceInfo\")");
        this.nullablePerformanceInfoAdapter = f5;
        JsonAdapter<Breadcrumbs> f6 = iVar.f(Breadcrumbs.class, b0.e(), "breadcrumbs");
        zq3.g(f6, "moshi.adapter(Breadcrumb…mptySet(), \"breadcrumbs\")");
        this.nullableBreadcrumbsAdapter = f6;
        JsonAdapter<List<EmbraceSpanData>> f7 = iVar.f(j.j(List.class, EmbraceSpanData.class), b0.e(), "spans");
        zq3.g(f7, "moshi.adapter(Types.newP…     emptySet(), \"spans\")");
        this.nullableListOfEmbraceSpanDataAdapter = f7;
        JsonAdapter<Integer> f8 = iVar.f(Integer.class, b0.e(), "version");
        zq3.g(f8, "moshi.adapter(Int::class…   emptySet(), \"version\")");
        this.nullableIntAdapter = f8;
        JsonAdapter<EnvelopeResource> f9 = iVar.f(EnvelopeResource.class, b0.e(), "resource");
        zq3.g(f9, "moshi.adapter(EnvelopeRe…, emptySet(), \"resource\")");
        this.nullableEnvelopeResourceAdapter = f9;
        JsonAdapter<EnvelopeMetadata> f10 = iVar.f(EnvelopeMetadata.class, b0.e(), "metadata");
        zq3.g(f10, "moshi.adapter(EnvelopeMe…, emptySet(), \"metadata\")");
        this.nullableEnvelopeMetadataAdapter = f10;
        JsonAdapter<String> f11 = iVar.f(String.class, b0.e(), "newVersion");
        zq3.g(f11, "moshi.adapter(String::cl…emptySet(), \"newVersion\")");
        this.nullableStringAdapter = f11;
        JsonAdapter<SessionPayload> f12 = iVar.f(SessionPayload.class, b0.e(), "data");
        zq3.g(f12, "moshi.adapter(SessionPay…java, emptySet(), \"data\")");
        this.nullableSessionPayloadAdapter = f12;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SessionMessage");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public SessionMessage fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Session session = null;
        int i = -1;
        UserInfo userInfo = null;
        AppInfo appInfo = null;
        DeviceInfo deviceInfo = null;
        PerformanceInfo performanceInfo = null;
        Breadcrumbs breadcrumbs = null;
        List list = null;
        List list2 = null;
        Integer num = null;
        EnvelopeResource envelopeResource = null;
        EnvelopeMetadata envelopeMetadata = null;
        String str = null;
        String str2 = null;
        SessionPayload sessionPayload = null;
        while (true) {
            EnvelopeMetadata envelopeMetadata2 = envelopeMetadata;
            if (!jsonReader.hasNext()) {
                jsonReader.h();
                if (i == ((int) 4294950913L)) {
                    if (session != null) {
                        return new SessionMessage(session, userInfo, appInfo, deviceInfo, performanceInfo, breadcrumbs, list, list2, num, envelopeResource, envelopeMetadata2, str, str2, sessionPayload);
                    }
                    JsonDataException o = c29.o("session", "s", jsonReader);
                    zq3.g(o, "Util.missingProperty(\"session\", \"s\", reader)");
                    throw o;
                }
                Constructor<SessionMessage> constructor = this.constructorRef;
                if (constructor == null) {
                    constructor = SessionMessage.class.getDeclaredConstructor(Session.class, UserInfo.class, AppInfo.class, DeviceInfo.class, PerformanceInfo.class, Breadcrumbs.class, List.class, List.class, Integer.class, EnvelopeResource.class, EnvelopeMetadata.class, String.class, String.class, SessionPayload.class, Integer.TYPE, c29.c);
                    this.constructorRef = constructor;
                    zq3.g(constructor, "SessionMessage::class.ja…his.constructorRef = it }");
                }
                if (session == null) {
                    JsonDataException o2 = c29.o("session", "s", jsonReader);
                    zq3.g(o2, "Util.missingProperty(\"session\", \"s\", reader)");
                    throw o2;
                }
                SessionMessage newInstance = constructor.newInstance(session, userInfo, appInfo, deviceInfo, performanceInfo, breadcrumbs, list, list2, num, envelopeResource, envelopeMetadata2, str, str2, sessionPayload, Integer.valueOf(i), null);
                zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    envelopeMetadata = envelopeMetadata2;
                case 0:
                    session = (Session) this.sessionAdapter.fromJson(jsonReader);
                    if (session == null) {
                        JsonDataException x = c29.x("session", "s", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"ses… \"s\",\n            reader)");
                        throw x;
                    }
                    envelopeMetadata = envelopeMetadata2;
                case 1:
                    i &= (int) 4294967293L;
                    userInfo = (UserInfo) this.nullableUserInfoAdapter.fromJson(jsonReader);
                    envelopeMetadata = envelopeMetadata2;
                case 2:
                    appInfo = (AppInfo) this.nullableAppInfoAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                    i &= (int) j;
                    envelopeMetadata = envelopeMetadata2;
                case 3:
                    deviceInfo = (DeviceInfo) this.nullableDeviceInfoAdapter.fromJson(jsonReader);
                    j = 4294967287L;
                    i &= (int) j;
                    envelopeMetadata = envelopeMetadata2;
                case 4:
                    performanceInfo = (PerformanceInfo) this.nullablePerformanceInfoAdapter.fromJson(jsonReader);
                    j = 4294967279L;
                    i &= (int) j;
                    envelopeMetadata = envelopeMetadata2;
                case 5:
                    breadcrumbs = (Breadcrumbs) this.nullableBreadcrumbsAdapter.fromJson(jsonReader);
                    j = 4294967263L;
                    i &= (int) j;
                    envelopeMetadata = envelopeMetadata2;
                case 6:
                    list = (List) this.nullableListOfEmbraceSpanDataAdapter.fromJson(jsonReader);
                    j = 4294967231L;
                    i &= (int) j;
                    envelopeMetadata = envelopeMetadata2;
                case 7:
                    list2 = (List) this.nullableListOfEmbraceSpanDataAdapter.fromJson(jsonReader);
                    j = 4294967167L;
                    i &= (int) j;
                    envelopeMetadata = envelopeMetadata2;
                case 8:
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967039L;
                    i &= (int) j;
                    envelopeMetadata = envelopeMetadata2;
                case 9:
                    i &= (int) 4294966783L;
                    envelopeResource = (EnvelopeResource) this.nullableEnvelopeResourceAdapter.fromJson(jsonReader);
                    envelopeMetadata = envelopeMetadata2;
                case 10:
                    envelopeMetadata = (EnvelopeMetadata) this.nullableEnvelopeMetadataAdapter.fromJson(jsonReader);
                    i &= (int) 4294966271L;
                case 11:
                    i &= (int) 4294965247L;
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    envelopeMetadata = envelopeMetadata2;
                case 12:
                    i &= (int) 4294963199L;
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    envelopeMetadata = envelopeMetadata2;
                case 13:
                    i &= (int) 4294959103L;
                    sessionPayload = (SessionPayload) this.nullableSessionPayloadAdapter.fromJson(jsonReader);
                    envelopeMetadata = envelopeMetadata2;
                default:
                    envelopeMetadata = envelopeMetadata2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, SessionMessage sessionMessage) {
        zq3.h(hVar, "writer");
        if (sessionMessage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("s");
        this.sessionAdapter.mo197toJson(hVar, sessionMessage.getSession());
        hVar.C(QueryKeys.USER_ID);
        this.nullableUserInfoAdapter.mo197toJson(hVar, sessionMessage.getUserInfo());
        hVar.C(Tag.A);
        this.nullableAppInfoAdapter.mo197toJson(hVar, sessionMessage.getAppInfo());
        hVar.C(QueryKeys.SUBDOMAIN);
        this.nullableDeviceInfoAdapter.mo197toJson(hVar, sessionMessage.getDeviceInfo());
        hVar.C("p");
        this.nullablePerformanceInfoAdapter.mo197toJson(hVar, sessionMessage.getPerformanceInfo());
        hVar.C("br");
        this.nullableBreadcrumbsAdapter.mo197toJson(hVar, sessionMessage.getBreadcrumbs());
        hVar.C("spans");
        this.nullableListOfEmbraceSpanDataAdapter.mo197toJson(hVar, sessionMessage.getSpans());
        hVar.C("span_snapshots");
        this.nullableListOfEmbraceSpanDataAdapter.mo197toJson(hVar, sessionMessage.getSpanSnapshots());
        hVar.C(QueryKeys.INTERNAL_REFERRER);
        this.nullableIntAdapter.mo197toJson(hVar, sessionMessage.getVersion());
        hVar.C("resource");
        this.nullableEnvelopeResourceAdapter.mo197toJson(hVar, sessionMessage.getResource());
        hVar.C("metadata");
        this.nullableEnvelopeMetadataAdapter.mo197toJson(hVar, sessionMessage.getMetadata());
        hVar.C("version");
        this.nullableStringAdapter.mo197toJson(hVar, sessionMessage.getNewVersion());
        hVar.C(TransferTable.COLUMN_TYPE);
        this.nullableStringAdapter.mo197toJson(hVar, sessionMessage.getType());
        hVar.C("data");
        this.nullableSessionPayloadAdapter.mo197toJson(hVar, sessionMessage.getData());
        hVar.l();
    }
}
