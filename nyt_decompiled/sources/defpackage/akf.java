package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.abra.models.AbraPackageKt;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;

/* loaded from: classes3.dex */
public final class akf implements xjf {
    public static final d6f A;
    public static final d6f B;
    public static final d6f C;
    public static final d6f D;
    public static final d6f E;
    public static final d6f F;
    public static final d6f G;
    public static final d6f H;
    public static final d6f I;
    public static final d6f J;
    public static final d6f K;
    public static final d6f L;
    public static final d6f M;
    public static final d6f a;
    public static final d6f b;
    public static final d6f c;
    public static final d6f d;
    public static final d6f e;
    public static final d6f f;
    public static final d6f g;
    public static final d6f h;
    public static final d6f i;
    public static final d6f j;
    public static final d6f k;
    public static final d6f l;
    public static final d6f m;
    public static final d6f n;
    public static final d6f o;
    public static final d6f p;
    public static final d6f q;
    public static final d6f r;
    public static final d6f s;
    public static final d6f t;
    public static final d6f u;
    public static final d6f v;
    public static final d6f w;
    public static final d6f x;
    public static final d6f y;
    public static final d6f z;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).a();
        a = a2.d("measurement.ad_id_cache_time", 10000L);
        b = a2.d("measurement.max_bundles_per_iteration", 100L);
        c = a2.d("measurement.config.cache_time", 86400000L);
        d = a2.e("measurement.log_tag", "FA");
        e = a2.e("measurement.config.url_authority", "app-measurement.com");
        f = a2.e("measurement.config.url_scheme", "https");
        g = a2.d("measurement.upload.debug_upload_interval", 1000L);
        h = a2.d("measurement.lifetimevalue.max_currency_tracked", 4L);
        i = a2.d("measurement.store.max_stored_events_per_app", 100000L);
        j = a2.d("measurement.experiment.max_ids", 50L);
        k = a2.d("measurement.audience.filter_result_max_count", 200L);
        l = a2.d("measurement.alarm_manager.minimum_interval", 60000L);
        m = a2.d("measurement.upload.minimum_delay", 500L);
        n = a2.d("measurement.monitoring.sample_period_millis", 86400000L);
        o = a2.d("measurement.upload.realtime_upload_interval", 10000L);
        p = a2.d("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        q = a2.d("measurement.config.cache_time.service", AbraPackageKt.MS_IN_HOUR);
        r = a2.d("measurement.service_client.idle_disconnect_millis", BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT);
        s = a2.e("measurement.log_tag.service", "FA-SVC");
        t = a2.d("measurement.upload.stale_data_deletion_interval", 86400000L);
        u = a2.d("measurement.sdk.attribution.cache.ttl", 604800000L);
        v = a2.d("measurement.redaction.app_instance_id.ttl", 7200000L);
        w = a2.d("measurement.upload.backoff_period", 43200000L);
        x = a2.d("measurement.upload.initial_upload_delay_time", 15000L);
        y = a2.d("measurement.upload.interval", AbraPackageKt.MS_IN_HOUR);
        z = a2.d("measurement.upload.max_bundle_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        A = a2.d("measurement.upload.max_bundles", 100L);
        B = a2.d("measurement.upload.max_conversions_per_day", 500L);
        C = a2.d("measurement.upload.max_error_events_per_day", 1000L);
        D = a2.d("measurement.upload.max_events_per_bundle", 1000L);
        E = a2.d("measurement.upload.max_events_per_day", 100000L);
        F = a2.d("measurement.upload.max_public_events_per_day", 50000L);
        G = a2.d("measurement.upload.max_queue_time", 2419200000L);
        H = a2.d("measurement.upload.max_realtime_events_per_day", 10L);
        I = a2.d("measurement.upload.max_batch_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        J = a2.d("measurement.upload.retry_count", 6L);
        K = a2.d("measurement.upload.retry_time", 1800000L);
        L = a2.e("measurement.upload.url", "https://app-measurement.com/a");
        M = a2.d("measurement.upload.window_interval", AbraPackageKt.MS_IN_HOUR);
    }

    @Override // defpackage.xjf
    public final long A() {
        return ((Long) M.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long D() {
        return ((Long) J.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long a() {
        return ((Long) A.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long b() {
        return ((Long) I.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long c() {
        return ((Long) z.b()).longValue();
    }

    @Override // defpackage.xjf
    public final String d() {
        return (String) L.b();
    }

    @Override // defpackage.xjf
    public final long e() {
        return ((Long) C.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long g() {
        return ((Long) y.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long h() {
        return ((Long) K.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long k() {
        return ((Long) D.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long l() {
        return ((Long) B.b()).longValue();
    }

    @Override // defpackage.xjf
    public final String m() {
        return (String) e.b();
    }

    @Override // defpackage.xjf
    public final long m0() {
        return ((Long) H.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long o() {
        return ((Long) F.b()).longValue();
    }

    @Override // defpackage.xjf
    public final String r() {
        return (String) f.b();
    }

    @Override // defpackage.xjf
    public final long v() {
        return ((Long) G.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long z() {
        return ((Long) E.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zza() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzb() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzc() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzd() {
        return ((Long) g.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zze() {
        return ((Long) h.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzf() {
        return ((Long) i.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzg() {
        return ((Long) j.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzh() {
        return ((Long) k.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzi() {
        return ((Long) l.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzj() {
        return ((Long) m.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzk() {
        return ((Long) n.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzl() {
        return ((Long) o.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzm() {
        return ((Long) p.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzn() {
        return ((Long) r.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzo() {
        return ((Long) t.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzp() {
        return ((Long) u.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzq() {
        return ((Long) v.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzr() {
        return ((Long) w.b()).longValue();
    }

    @Override // defpackage.xjf
    public final long zzs() {
        return ((Long) x.b()).longValue();
    }
}
