package com.nytimes.android.meter;

import android.content.res.Resources;
import com.nytimes.android.meter.MeterServiceApi;
import com.nytimes.android.meter.MeterServiceDAOImpl;
import com.nytimes.android.meter.MeterServiceResponse;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.ck6;
import defpackage.d27;
import defpackage.gt4;
import defpackage.qv6;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.z38;
import defpackage.z58;
import defpackage.zj6;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* loaded from: classes4.dex */
public final class MeterServiceDAOImpl implements gt4 {
    public static final a Companion = new a(null);
    public static final int l = 8;
    private final String a;
    private final MeterServiceApi b;
    private final AppPreferences c;
    private final Resources d;
    private final NetworkStatus e;
    private final d27 f;
    private final z58 g;
    private final qv6 h;
    private final CoroutineScope i;
    private final PublishSubject j;
    private final String k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public MeterServiceDAOImpl(String str, MeterServiceApi meterServiceApi, AppPreferences appPreferences, Resources resources, NetworkStatus networkStatus, d27 d27Var, z58 z58Var, qv6 qv6Var, CoroutineScope coroutineScope) {
        zq3.h(str, "appVersion");
        zq3.h(meterServiceApi, "api");
        zq3.h(appPreferences, "prefs");
        zq3.h(resources, "resources");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(d27Var, "ridManager");
        zq3.h(z58Var, "subauthClient");
        zq3.h(qv6Var, "remoteConfig");
        zq3.h(coroutineScope, "applicationScope");
        this.a = str;
        this.b = meterServiceApi;
        this.c = appPreferences;
        this.d = resources;
        this.e = networkStatus;
        this.f = d27Var;
        this.g = z58Var;
        this.h = qv6Var;
        this.i = coroutineScope;
        PublishSubject create = PublishSubject.create();
        zq3.g(create, "create(...)");
        this.j = create;
        this.k = "Android_NYT-Phoenix_" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource o(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (SingleSource) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeterServiceResponse p(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (MeterServiceResponse) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String q() {
        z38 z38Var = z38.a;
        String format = String.format("%smeter.js", Arrays.copyOf(new Object[]{r() ? this.d.getString(ck6.meter_service_stg) : this.d.getString(ck6.meter_service_prod)}, 1));
        zq3.g(format, "format(...)");
        return format;
    }

    private final boolean r() {
        AppPreferences appPreferences = this.c;
        String string = this.d.getString(zj6.com_nytimes_android_phoenix_beta_METER_ENV);
        zq3.g(string, "getString(...)");
        return zq3.c(appPreferences.l(string, this.d.getString(ck6.meter_service_prod)), this.d.getString(ck6.meter_service_stg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource s(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (SingleSource) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeterServiceResponse t(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (MeterServiceResponse) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeterServiceResponse v(Response response) {
        Object body = response.body();
        zq3.e(body);
        MeterServiceResponse meterServiceResponse = (MeterServiceResponse) body;
        meterServiceResponse.setMeterLatencyDelta(response.raw().receivedResponseAtMillis() - response.raw().sentRequestAtMillis());
        return meterServiceResponse;
    }

    @Override // defpackage.gt4
    public Single a(final String str, final String str2) {
        zq3.h(str, "contentUrl");
        zq3.h(str2, "pageViewId");
        if (!this.e.i()) {
            Single just = Single.just(new MeterServiceResponse(false, false, null, 0, 0, null, false, true, false, null, false, null, false, false, null, null, null, null, 262015, null));
            zq3.e(just);
            return just;
        }
        Single u = this.g.u();
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.meter.MeterServiceDAOImpl$canView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SingleSource invoke(String str3) {
                MeterServiceApi meterServiceApi;
                String q;
                d27 d27Var;
                String str4;
                zq3.h(str3, "meterServiceCookie");
                meterServiceApi = MeterServiceDAOImpl.this.b;
                q = MeterServiceDAOImpl.this.q();
                String str5 = str;
                d27Var = MeterServiceDAOImpl.this.f;
                String b = d27Var.b();
                String str6 = str2;
                str4 = MeterServiceDAOImpl.this.k;
                return MeterServiceApi.b.a(meterServiceApi, q, str3, str5, b, str6, false, str4, null, 160, null);
            }
        };
        Single flatMap = u.flatMap(new Function() { // from class: kt4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource o;
                o = MeterServiceDAOImpl.o(ss2.this, obj);
                return o;
            }
        });
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.meter.MeterServiceDAOImpl$canView$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MeterServiceResponse invoke(Response response) {
                MeterServiceResponse v;
                zq3.h(response, "response");
                v = MeterServiceDAOImpl.this.v(response);
                return v;
            }
        };
        Single map = flatMap.map(new Function() { // from class: lt4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                MeterServiceResponse p;
                p = MeterServiceDAOImpl.p(ss2.this, obj);
                return p;
            }
        });
        zq3.e(map);
        return map;
    }

    @Override // defpackage.gt4
    public Observable b() {
        Observable<T> hide = this.j.hide();
        zq3.g(hide, "hide(...)");
        return hide;
    }

    @Override // defpackage.gt4
    public Single c(final String str, final String str2) {
        zq3.h(str, "contentUrl");
        zq3.h(str2, "pageViewId");
        if (!this.e.i()) {
            Single just = Single.just(new MeterServiceResponse(false, false, null, 0, 0, null, false, true, false, null, false, null, false, false, null, null, null, null, 262015, null));
            zq3.e(just);
            return just;
        }
        Single u = this.g.u();
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.meter.MeterServiceDAOImpl$willView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SingleSource invoke(String str3) {
                MeterServiceApi meterServiceApi;
                String q;
                d27 d27Var;
                String str4;
                zq3.h(str3, "meterServiceCookie");
                meterServiceApi = MeterServiceDAOImpl.this.b;
                q = MeterServiceDAOImpl.this.q();
                String str5 = str;
                d27Var = MeterServiceDAOImpl.this.f;
                String b = d27Var.b();
                String str6 = str2;
                str4 = MeterServiceDAOImpl.this.k;
                return MeterServiceApi.b.b(meterServiceApi, q, str3, str5, b, str6, str4, null, 64, null);
            }
        };
        Single flatMap = u.flatMap(new Function() { // from class: ht4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource s;
                s = MeterServiceDAOImpl.s(ss2.this, obj);
                return s;
            }
        });
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.meter.MeterServiceDAOImpl$willView$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MeterServiceResponse invoke(Response response) {
                MeterServiceResponse v;
                zq3.h(response, "response");
                v = MeterServiceDAOImpl.this.v(response);
                return v;
            }
        };
        Single map = flatMap.map(new Function() { // from class: it4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                MeterServiceResponse t;
                t = MeterServiceDAOImpl.t(ss2.this, obj);
                return t;
            }
        });
        final ss2 ss2Var3 = new ss2() { // from class: com.nytimes.android.meter.MeterServiceDAOImpl$willView$3
            {
                super(1);
            }

            public final void b(MeterServiceResponse meterServiceResponse) {
                PublishSubject publishSubject;
                publishSubject = MeterServiceDAOImpl.this.j;
                publishSubject.onNext(meterServiceResponse);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((MeterServiceResponse) obj);
                return ww8.a;
            }
        };
        Single doOnSuccess = map.doOnSuccess(new Consumer() { // from class: jt4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MeterServiceDAOImpl.u(ss2.this, obj);
            }
        });
        zq3.e(doOnSuccess);
        return doOnSuccess;
    }
}
