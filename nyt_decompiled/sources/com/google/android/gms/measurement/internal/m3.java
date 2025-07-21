package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.amazonaws.services.s3.internal.Constants;
import com.nytimes.android.abra.models.AbraPackageKt;
import defpackage.bmf;
import defpackage.cjf;
import defpackage.cnf;
import defpackage.cpf;
import defpackage.dkf;
import defpackage.dof;
import defpackage.dqf;
import defpackage.erf;
import defpackage.f5f;
import defpackage.kif;
import defpackage.kmf;
import defpackage.ljf;
import defpackage.lnf;
import defpackage.lpf;
import defpackage.mkf;
import defpackage.mqf;
import defpackage.nrf;
import defpackage.o2f;
import defpackage.psf;
import defpackage.slf;
import defpackage.tif;
import defpackage.tmf;
import defpackage.ujf;
import defpackage.unf;
import defpackage.upf;
import defpackage.urf;
import defpackage.vkf;
import defpackage.vqf;
import defpackage.xsf;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class m3 {
    public static final l3 A;
    public static final l3 A0;
    public static final l3 B;
    public static final l3 B0;
    public static final l3 C;
    public static final l3 C0;
    public static final l3 D;
    public static final l3 D0;
    public static final l3 E;
    public static final l3 E0;
    public static final l3 F;
    public static final l3 F0;
    public static final l3 G;
    public static final l3 G0;
    public static final l3 H;
    public static final l3 H0;
    public static final l3 I;
    public static final l3 I0;
    public static final l3 J;
    public static final l3 J0;
    public static final l3 K;
    public static final l3 K0;
    public static final l3 L;
    public static final l3 L0;
    public static final l3 M;
    public static final l3 M0;
    public static final l3 N;
    public static final l3 N0;
    public static final l3 O;
    public static final l3 O0;
    public static final l3 P;
    public static final l3 P0;
    public static final l3 Q;
    public static final l3 Q0;
    public static final l3 R;
    public static final l3 S;
    public static final l3 T;
    public static final l3 U;
    public static final l3 V;
    public static final l3 W;
    public static final l3 X;
    public static final l3 Y;
    public static final l3 Z;
    public static final l3 a0;
    public static final l3 b0;
    public static final l3 c0;
    public static final l3 d0;
    public static final l3 e;
    public static final l3 e0;
    public static final l3 f;
    public static final l3 f0;
    public static final l3 g;
    public static final l3 g0;
    public static final l3 h;
    public static final l3 h0;
    public static final l3 i;
    public static final l3 i0;
    public static final l3 j;
    public static final l3 j0;
    public static final l3 k;
    public static final l3 k0;
    public static final l3 l;
    public static final l3 l0;
    public static final l3 m;
    public static final l3 m0;
    public static final l3 n;
    public static final l3 n0;
    public static final l3 o;
    public static final l3 o0;
    public static final l3 p;
    public static final l3 p0;
    public static final l3 q;
    public static final l3 q0;
    public static final l3 r;
    public static final l3 r0;
    public static final l3 s;
    public static final l3 s0;
    public static final l3 t;
    public static final l3 t0;
    public static final l3 u;
    public static final l3 u0;
    public static final l3 v;
    public static final l3 v0;
    public static final l3 w;
    public static final l3 w0;
    public static final l3 x;
    public static final l3 x0;
    public static final l3 y;
    public static final l3 y0;
    public static final l3 z;
    public static final l3 z0;
    private static final List a = Collections.synchronizedList(new ArrayList());
    private static final Set b = Collections.synchronizedSet(new HashSet());
    public static final l3 c = a("measurement.ad_id_cache_time", 10000L, 10000L, new j3() { // from class: com.google.android.gms.measurement.internal.u
        @Override // com.google.android.gms.measurement.internal.j3
        public final Object zza() {
            l3 l3Var = m3.c;
            return Long.valueOf(ujf.m());
        }
    });
    public static final l3 d = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new j3() { // from class: com.google.android.gms.measurement.internal.x
        @Override // com.google.android.gms.measurement.internal.j3
        public final Object zza() {
            l3 l3Var = m3.c;
            return Long.valueOf(ujf.w());
        }
    });

    static {
        Long valueOf = Long.valueOf(AbraPackageKt.MS_IN_HOUR);
        e = a("measurement.config.cache_time", 86400000L, valueOf, new j3() { // from class: com.google.android.gms.measurement.internal.j0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.o());
            }
        });
        f = a("measurement.config.url_scheme", "https", "https", new j3() { // from class: com.google.android.gms.measurement.internal.v0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return ujf.k();
            }
        });
        g = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new j3() { // from class: com.google.android.gms.measurement.internal.i1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return ujf.j();
            }
        });
        h = a("measurement.upload.max_bundles", 100, 100, new j3() { // from class: com.google.android.gms.measurement.internal.u1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.H());
            }
        });
        i = a("measurement.upload.max_batch_size", 65536, 65536, new j3() { // from class: com.google.android.gms.measurement.internal.h2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.e());
            }
        });
        j = a("measurement.upload.max_bundle_size", 65536, 65536, new j3() { // from class: com.google.android.gms.measurement.internal.t2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.G());
            }
        });
        Integer valueOf2 = Integer.valueOf(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
        k = a("measurement.upload.max_events_per_bundle", valueOf2, valueOf2, new j3() { // from class: com.google.android.gms.measurement.internal.f3
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.K());
            }
        });
        l = a("measurement.upload.max_events_per_day", 100000, 100000, new j3() { // from class: com.google.android.gms.measurement.internal.g3
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.a());
            }
        });
        m = a("measurement.upload.max_error_events_per_day", valueOf2, valueOf2, new j3() { // from class: com.google.android.gms.measurement.internal.g0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.J());
            }
        });
        n = a("measurement.upload.max_public_events_per_day", 50000, 50000, new j3() { // from class: com.google.android.gms.measurement.internal.r0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.b());
            }
        });
        Integer valueOf3 = Integer.valueOf(Constants.MAXIMUM_UPLOAD_PARTS);
        o = a("measurement.upload.max_conversions_per_day", valueOf3, valueOf3, new j3() { // from class: com.google.android.gms.measurement.internal.d1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.I());
            }
        });
        p = a("measurement.upload.max_realtime_events_per_day", 10, 10, new j3() { // from class: com.google.android.gms.measurement.internal.o1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.d());
            }
        });
        q = a("measurement.store.max_stored_events_per_app", 100000, 100000, new j3() { // from class: com.google.android.gms.measurement.internal.a2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.r());
            }
        });
        r = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new j3() { // from class: com.google.android.gms.measurement.internal.l2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return ujf.l();
            }
        });
        s = a("measurement.upload.backoff_period", 43200000L, 43200000L, new j3() { // from class: com.google.android.gms.measurement.internal.w2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.D());
            }
        });
        t = a("measurement.upload.window_interval", valueOf, valueOf, new j3() { // from class: com.google.android.gms.measurement.internal.h3
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.h());
            }
        });
        u = a("measurement.upload.interval", valueOf, valueOf, new j3() { // from class: com.google.android.gms.measurement.internal.i3
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.F());
            }
        });
        v = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, new j3() { // from class: com.google.android.gms.measurement.internal.v
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.x());
            }
        });
        w = a("measurement.upload.debug_upload_interval", 1000L, 1000L, new j3() { // from class: com.google.android.gms.measurement.internal.y
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.p());
            }
        });
        x = a("measurement.upload.minimum_delay", 500L, 500L, new j3() { // from class: com.google.android.gms.measurement.internal.z
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.v());
            }
        });
        y = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new j3() { // from class: com.google.android.gms.measurement.internal.a0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.u());
            }
        });
        z = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new j3() { // from class: com.google.android.gms.measurement.internal.b0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.A());
            }
        });
        A = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new j3() { // from class: com.google.android.gms.measurement.internal.c0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.y());
            }
        });
        B = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new j3() { // from class: com.google.android.gms.measurement.internal.d0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.E());
            }
        });
        C = a("measurement.upload.retry_time", 1800000L, 1800000L, new j3() { // from class: com.google.android.gms.measurement.internal.e0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.g());
            }
        });
        D = a("measurement.upload.retry_count", 6, 6, new j3() { // from class: com.google.android.gms.measurement.internal.f0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.f());
            }
        });
        E = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new j3() { // from class: com.google.android.gms.measurement.internal.h0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.c());
            }
        });
        F = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, new j3() { // from class: com.google.android.gms.measurement.internal.i0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.q());
            }
        });
        G = a("measurement.audience.filter_result_max_count", 200, 200, new j3() { // from class: com.google.android.gms.measurement.internal.k0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.t());
            }
        });
        H = a("measurement.upload.max_public_user_properties", 25, 25, null);
        I = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        J = a("measurement.upload.max_public_event_params", 25, 25, null);
        Long valueOf4 = Long.valueOf(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT);
        K = a("measurement.service_client.idle_disconnect_millis", valueOf4, valueOf4, new j3() { // from class: com.google.android.gms.measurement.internal.l0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.z());
            }
        });
        Boolean bool = Boolean.FALSE;
        L = a("measurement.test.boolean_flag", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.m0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(cpf.f());
            }
        });
        M = a("measurement.test.string_flag", "---", "---", new j3() { // from class: com.google.android.gms.measurement.internal.n0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return cpf.e();
            }
        });
        N = a("measurement.test.long_flag", -1L, -1L, new j3() { // from class: com.google.android.gms.measurement.internal.o0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(cpf.c());
            }
        });
        O = a("measurement.test.int_flag", -2, -2, new j3() { // from class: com.google.android.gms.measurement.internal.p0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) cpf.b());
            }
        });
        Double valueOf5 = Double.valueOf(-3.0d);
        P = a("measurement.test.double_flag", valueOf5, valueOf5, new j3() { // from class: com.google.android.gms.measurement.internal.q0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Double.valueOf(cpf.a());
            }
        });
        Q = a("measurement.experiment.max_ids", 50, 50, new j3() { // from class: com.google.android.gms.measurement.internal.s0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.s());
            }
        });
        R = a("measurement.max_bundles_per_iteration", 100, 100, new j3() { // from class: com.google.android.gms.measurement.internal.t0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) ujf.n());
            }
        });
        S = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new j3() { // from class: com.google.android.gms.measurement.internal.u0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.B());
            }
        });
        T = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new j3() { // from class: com.google.android.gms.measurement.internal.w0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Long.valueOf(ujf.C());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        U = a("measurement.validation.internal_limits_internal_event_params", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.y0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(dof.b());
            }
        });
        V = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.z0
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(upf.b());
            }
        });
        W = a("measurement.quality.checksum", bool, bool, null);
        X = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.a1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(kmf.d());
            }
        });
        Y = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.b1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(kmf.c());
            }
        });
        Z = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.c1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(kmf.e());
            }
        });
        a0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.e1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(psf.b());
            }
        });
        b0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.f1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(lnf.b());
            }
        });
        c0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.g1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(unf.b());
            }
        });
        d0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.h1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(urf.c());
            }
        });
        e0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.j1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(xsf.b());
            }
        });
        f0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.k1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(slf.c());
            }
        });
        g0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.l1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(cnf.c());
            }
        });
        h0 = a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.m1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(mqf.b());
            }
        });
        i0 = a("measurement.collection.synthetic_data_mitigation", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.n1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(nrf.b());
            }
        });
        j0 = a("measurement.androidId.delete_feature", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.p1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(tif.b());
            }
        });
        k0 = a("measurement.service.storage_consent_support_version", 203600, 203600, new j3() { // from class: com.google.android.gms.measurement.internal.q1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Integer.valueOf((int) dkf.a());
            }
        });
        l0 = a("measurement.client.click_identifier_control.dev", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.r1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(cjf.b());
            }
        });
        m0 = a("measurement.service.click_identifier_control", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.s1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(ljf.b());
            }
        });
        n0 = a("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.t1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(bmf.c());
            }
        });
        o0 = a("measurement.module.pixie.fix_array", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.v1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(lpf.c());
            }
        });
        p0 = a("measurement.adid_zero.service", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.w1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(kif.d());
            }
        });
        q0 = a("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.x1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(kif.f());
            }
        });
        r0 = a("measurement.adid_zero.remove_lair_if_userid_cleared", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.z1
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(kif.g());
            }
        });
        s0 = a("measurement.adid_zero.remove_lair_on_id_value_change_only", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.b2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(kif.h());
            }
        });
        t0 = a("measurement.adid_zero.adid_uid", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.c2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(kif.e());
            }
        });
        u0 = a("measurement.adid_zero.app_instance_id_fix", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.d2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(kif.c());
            }
        });
        v0 = a("measurement.service.refactor.package_side_screen", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.e2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(vqf.c());
            }
        });
        w0 = a("measurement.enhanced_campaign.service", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.f2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(mkf.d());
            }
        });
        x0 = a("measurement.enhanced_campaign.client", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.g2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(mkf.c());
            }
        });
        y0 = a("measurement.enhanced_campaign.srsltid.client", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.i2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(mkf.e());
            }
        });
        z0 = a("measurement.enhanced_campaign.srsltid.service", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.j2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(mkf.f());
            }
        });
        A0 = a("measurement.service.store_null_safelist", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.k2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(vkf.c());
            }
        });
        B0 = a("measurement.service.store_safelist", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.m2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(vkf.d());
            }
        });
        C0 = a("measurement.redaction.no_aiid_in_config_request", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.n2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(dqf.k());
            }
        });
        D0 = a("measurement.redaction.config_redacted_fields", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.o2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(dqf.e());
            }
        });
        E0 = a("measurement.redaction.upload_redacted_fields", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.p2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(dqf.l());
            }
        });
        F0 = a("measurement.redaction.upload_subdomain_override", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.q2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(dqf.m());
            }
        });
        G0 = a("measurement.redaction.device_info", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.r2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(dqf.f());
            }
        });
        H0 = a("measurement.redaction.user_id", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.s2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(dqf.n());
            }
        });
        I0 = a("measurement.redaction.google_signals", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.u2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(dqf.j());
            }
        });
        J0 = a("measurement.collection.enable_session_stitching_token.service", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.v2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(erf.d());
            }
        });
        K0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.x2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(erf.c());
            }
        });
        L0 = a("measurement.redaction.app_instance_id", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.y2
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(dqf.c());
            }
        });
        M0 = a("measurement.redaction.populate_ephemeral_app_instance_id", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.a3
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(dqf.i());
            }
        });
        N0 = a("measurement.redaction.enhanced_uid", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.b3
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(dqf.h());
            }
        });
        O0 = a("measurement.redaction.e_tag", bool, bool, new j3() { // from class: com.google.android.gms.measurement.internal.c3
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(dqf.g());
            }
        });
        P0 = a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.d3
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(dqf.d());
            }
        });
        Q0 = a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, new j3() { // from class: com.google.android.gms.measurement.internal.e3
            @Override // com.google.android.gms.measurement.internal.j3
            public final Object zza() {
                l3 l3Var = m3.c;
                return Boolean.valueOf(tmf.c());
            }
        });
    }

    static l3 a(String str, Object obj, Object obj2, j3 j3Var) {
        l3 l3Var = new l3(str, obj, obj2, j3Var, null);
        a.add(l3Var);
        return l3Var;
    }

    public static Map c(Context context) {
        o2f a2 = o2f.a(context.getContentResolver(), f5f.a("com.google.android.gms.measurement"));
        return a2 == null ? Collections.emptyMap() : a2.b();
    }
}
