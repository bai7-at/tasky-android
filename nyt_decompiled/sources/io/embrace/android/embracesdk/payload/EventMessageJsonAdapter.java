package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class EventMessageJsonAdapter extends JsonAdapter<EventMessage> {
    private volatile Constructor<EventMessage> constructorRef;
    private final JsonAdapter<Event> eventAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<AppInfo> nullableAppInfoAdapter;
    private final JsonAdapter<Crash> nullableCrashAdapter;
    private final JsonAdapter<DeviceInfo> nullableDeviceInfoAdapter;
    private final JsonAdapter<NativeCrash> nullableNativeCrashAdapter;
    private final JsonAdapter<PerformanceInfo> nullablePerformanceInfoAdapter;
    private final JsonAdapter<Stacktraces> nullableStacktracesAdapter;
    private final JsonAdapter<UserInfo> nullableUserInfoAdapter;
    private final JsonReader.b options;

    public EventMessageJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("et", "cr", QueryKeys.SUBDOMAIN, Tag.A, QueryKeys.USER_ID, "p", "sk", QueryKeys.INTERNAL_REFERRER, "crn");
        zq3.g(a, "JsonReader.Options.of(\"e…,\n      \"sk\", \"v\", \"crn\")");
        this.options = a;
        JsonAdapter<Event> f = iVar.f(Event.class, b0.e(), "event");
        zq3.g(f, "moshi.adapter(Event::cla…mptySet(),\n      \"event\")");
        this.eventAdapter = f;
        JsonAdapter<Crash> f2 = iVar.f(Crash.class, b0.e(), "crash");
        zq3.g(f2, "moshi.adapter(Crash::cla…     emptySet(), \"crash\")");
        this.nullableCrashAdapter = f2;
        JsonAdapter<DeviceInfo> f3 = iVar.f(DeviceInfo.class, b0.e(), "deviceInfo");
        zq3.g(f3, "moshi.adapter(DeviceInfo…emptySet(), \"deviceInfo\")");
        this.nullableDeviceInfoAdapter = f3;
        JsonAdapter<AppInfo> f4 = iVar.f(AppInfo.class, b0.e(), "appInfo");
        zq3.g(f4, "moshi.adapter(AppInfo::c…   emptySet(), \"appInfo\")");
        this.nullableAppInfoAdapter = f4;
        JsonAdapter<UserInfo> f5 = iVar.f(UserInfo.class, b0.e(), "userInfo");
        zq3.g(f5, "moshi.adapter(UserInfo::…  emptySet(), \"userInfo\")");
        this.nullableUserInfoAdapter = f5;
        JsonAdapter<PerformanceInfo> f6 = iVar.f(PerformanceInfo.class, b0.e(), "performanceInfo");
        zq3.g(f6, "moshi.adapter(Performanc…Set(), \"performanceInfo\")");
        this.nullablePerformanceInfoAdapter = f6;
        JsonAdapter<Stacktraces> f7 = iVar.f(Stacktraces.class, b0.e(), "stacktraces");
        zq3.g(f7, "moshi.adapter(Stacktrace…mptySet(), \"stacktraces\")");
        this.nullableStacktracesAdapter = f7;
        JsonAdapter<Integer> f8 = iVar.f(Integer.TYPE, b0.e(), "version");
        zq3.g(f8, "moshi.adapter(Int::class…a, emptySet(), \"version\")");
        this.intAdapter = f8;
        JsonAdapter<NativeCrash> f9 = iVar.f(NativeCrash.class, b0.e(), "nativeCrash");
        zq3.g(f9, "moshi.adapter(NativeCras…mptySet(), \"nativeCrash\")");
        this.nullableNativeCrashAdapter = f9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EventMessage");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public EventMessage fromJson(JsonReader jsonReader) {
        int i;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        int i2 = -1;
        Integer num = 0;
        Event event = null;
        Crash crash = null;
        DeviceInfo deviceInfo = null;
        AppInfo appInfo = null;
        UserInfo userInfo = null;
        PerformanceInfo performanceInfo = null;
        Stacktraces stacktraces = null;
        NativeCrash nativeCrash = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    Event event2 = (Event) this.eventAdapter.fromJson(jsonReader);
                    if (event2 == null) {
                        JsonDataException x = c29.x("event", "et", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"eve…\"et\",\n            reader)");
                        throw x;
                    }
                    event = event2;
                    continue;
                case 1:
                    i = ((int) 4294967293L) & i2;
                    crash = (Crash) this.nullableCrashAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    i = ((int) 4294967291L) & i2;
                    deviceInfo = (DeviceInfo) this.nullableDeviceInfoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    i = ((int) 4294967287L) & i2;
                    appInfo = (AppInfo) this.nullableAppInfoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    i = ((int) 4294967279L) & i2;
                    userInfo = (UserInfo) this.nullableUserInfoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    i = ((int) 4294967263L) & i2;
                    performanceInfo = (PerformanceInfo) this.nullablePerformanceInfoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    i = ((int) 4294967231L) & i2;
                    stacktraces = (Stacktraces) this.nullableStacktracesAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    Integer num2 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        JsonDataException x2 = c29.x("version", QueryKeys.INTERNAL_REFERRER, jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"version\", \"v\", reader)");
                        throw x2;
                    }
                    i = ((int) 4294967167L) & i2;
                    num = num2;
                    break;
                case 8:
                    i = ((int) 4294967039L) & i2;
                    nativeCrash = (NativeCrash) this.nullableNativeCrashAdapter.fromJson(jsonReader);
                    break;
            }
            i2 = i;
        }
        jsonReader.h();
        if (i2 == ((int) 4294966785L)) {
            if (event != null) {
                return new EventMessage(event, crash, deviceInfo, appInfo, userInfo, performanceInfo, stacktraces, num.intValue(), nativeCrash);
            }
            JsonDataException o = c29.o("event", "et", jsonReader);
            zq3.g(o, "Util.missingProperty(\"event\", \"et\", reader)");
            throw o;
        }
        Constructor<EventMessage> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = EventMessage.class.getDeclaredConstructor(Event.class, Crash.class, DeviceInfo.class, AppInfo.class, UserInfo.class, PerformanceInfo.class, Stacktraces.class, cls, NativeCrash.class, cls, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "EventMessage::class.java…his.constructorRef = it }");
        }
        if (event == null) {
            JsonDataException o2 = c29.o("event", "et", jsonReader);
            zq3.g(o2, "Util.missingProperty(\"event\", \"et\", reader)");
            throw o2;
        }
        EventMessage newInstance = constructor.newInstance(event, crash, deviceInfo, appInfo, userInfo, performanceInfo, stacktraces, num, nativeCrash, Integer.valueOf(i2), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, EventMessage eventMessage) {
        zq3.h(hVar, "writer");
        if (eventMessage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("et");
        this.eventAdapter.mo197toJson(hVar, eventMessage.getEvent());
        hVar.C("cr");
        this.nullableCrashAdapter.mo197toJson(hVar, eventMessage.getCrash());
        hVar.C(QueryKeys.SUBDOMAIN);
        this.nullableDeviceInfoAdapter.mo197toJson(hVar, eventMessage.getDeviceInfo());
        hVar.C(Tag.A);
        this.nullableAppInfoAdapter.mo197toJson(hVar, eventMessage.getAppInfo());
        hVar.C(QueryKeys.USER_ID);
        this.nullableUserInfoAdapter.mo197toJson(hVar, eventMessage.getUserInfo());
        hVar.C("p");
        this.nullablePerformanceInfoAdapter.mo197toJson(hVar, eventMessage.getPerformanceInfo());
        hVar.C("sk");
        this.nullableStacktracesAdapter.mo197toJson(hVar, eventMessage.getStacktraces());
        hVar.C(QueryKeys.INTERNAL_REFERRER);
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(eventMessage.getVersion()));
        hVar.C("crn");
        this.nullableNativeCrashAdapter.mo197toJson(hVar, eventMessage.getNativeCrash());
        hVar.l();
    }
}
