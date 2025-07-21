package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentDeliveryMode;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import defpackage.bc8;
import defpackage.cy0;
import defpackage.hi2;
import defpackage.oc;
import defpackage.og8;
import defpackage.q76;
import defpackage.vg8;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class c {
    public static final long j = TimeUnit.HOURS.toSeconds(12);
    static final int[] k = {2, 4, 8, 16, 32, 64, 128, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH};
    private final hi2 a;
    private final q76 b;
    private final Executor c;
    private final Clock d;
    private final Random e;
    private final com.google.firebase.remoteconfig.internal.a f;
    private final ConfigFetchHttpClient g;
    private final d h;
    private final Map i;

    public static class a {
        private final Date a;
        private final int b;
        private final b c;
        private final String d;

        private a(Date date, int i, b bVar, String str) {
            this.a = date;
            this.b = i;
            this.c = bVar;
            this.d = str;
        }

        public static a a(Date date) {
            return new a(date, 1, null, null);
        }

        public static a b(b bVar, String str) {
            return new a(bVar.e(), 0, bVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public b d() {
            return this.c;
        }

        String e() {
            return this.d;
        }

        int f() {
            return this.b;
        }
    }

    public c(hi2 hi2Var, q76 q76Var, Executor executor, Clock clock, Random random, com.google.firebase.remoteconfig.internal.a aVar, ConfigFetchHttpClient configFetchHttpClient, d dVar, Map map) {
        this.a = hi2Var;
        this.b = q76Var;
        this.c = executor;
        this.d = clock;
        this.e = random;
        this.f = aVar;
        this.g = configFetchHttpClient;
        this.h = dVar;
        this.i = map;
    }

    private boolean e(long j2, Date date) {
        Date e = this.h.e();
        if (e.equals(d.d)) {
            return false;
        }
        return date.before(new Date(e.getTime() + TimeUnit.SECONDS.toMillis(j2)));
    }

    private FirebaseRemoteConfigServerException f(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        String str;
        int a2 = firebaseRemoteConfigServerException.a();
        if (a2 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a2 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (a2 == 429) {
                throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (a2 != 500) {
                switch (a2) {
                    case ContentDeliveryMode.ON_DEMAND /* 502 */:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.a(), "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private String g(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2)));
    }

    private a i(String str, String str2, Date date) {
        try {
            a fetch = this.g.fetch(this.g.d(), str, str2, o(), this.h.d(), this.i, m(), date);
            if (fetch.e() != null) {
                this.h.i(fetch.e());
            }
            this.h.f();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e) {
            d.a v = v(e.a(), date);
            if (u(v, e.a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(v.a().getTime());
            }
            throw f(e);
        }
    }

    private og8 j(String str, String str2, Date date) {
        try {
            final a i = i(str, str2, date);
            return i.f() != 0 ? vg8.e(i) : this.f.k(i.d()).s(this.c, new bc8() { // from class: yt0
                @Override // defpackage.bc8
                public final og8 then(Object obj) {
                    og8 r;
                    r = c.r(c.a.this, (b) obj);
                    return r;
                }
            });
        } catch (FirebaseRemoteConfigException e) {
            return vg8.d(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public og8 q(og8 og8Var, long j2) {
        og8 k2;
        final Date date = new Date(this.d.currentTimeMillis());
        if (og8Var.q() && e(j2, date)) {
            return vg8.e(a.c(date));
        }
        Date l = l(date);
        if (l != null) {
            k2 = vg8.d(new FirebaseRemoteConfigFetchThrottledException(g(l.getTime() - date.getTime()), l.getTime()));
        } else {
            final og8 id = this.a.getId();
            final og8 a2 = this.a.a(false);
            k2 = vg8.i(id, a2).k(this.c, new cy0() { // from class: wt0
                @Override // defpackage.cy0
                public final Object then(og8 og8Var2) {
                    og8 s;
                    s = c.this.s(id, a2, date, og8Var2);
                    return s;
                }
            });
        }
        return k2.k(this.c, new cy0() { // from class: xt0
            @Override // defpackage.cy0
            public final Object then(og8 og8Var2) {
                og8 t;
                t = c.this.t(date, og8Var2);
                return t;
            }
        });
    }

    private Date l(Date date) {
        Date a2 = this.h.a().a();
        if (date.before(a2)) {
            return a2;
        }
        return null;
    }

    private Long m() {
        oc ocVar = (oc) this.b.get();
        if (ocVar == null) {
            return null;
        }
        return (Long) ocVar.d(true).get("_fot");
    }

    private long n(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = k;
        return (timeUnit.toMillis(iArr[Math.min(i, iArr.length) - 1]) / 2) + this.e.nextInt((int) r0);
    }

    private Map o() {
        HashMap hashMap = new HashMap();
        oc ocVar = (oc) this.b.get();
        if (ocVar == null) {
            return hashMap;
        }
        for (Map.Entry entry : ocVar.d(false).entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    private boolean p(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ og8 r(a aVar, b bVar) {
        return vg8.e(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ og8 s(og8 og8Var, og8 og8Var2, Date date, og8 og8Var3) {
        return !og8Var.q() ? vg8.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", og8Var.l())) : !og8Var2.q() ? vg8.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", og8Var2.l())) : j((String) og8Var.m(), ((com.google.firebase.installations.f) og8Var2.m()).b(), date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ og8 t(Date date, og8 og8Var) {
        x(og8Var, date);
        return og8Var;
    }

    private boolean u(d.a aVar, int i) {
        return aVar.b() > 1 || i == 429;
    }

    private d.a v(int i, Date date) {
        if (p(i)) {
            w(date);
        }
        return this.h.a();
    }

    private void w(Date date) {
        int b = this.h.a().b() + 1;
        this.h.g(b, new Date(date.getTime() + n(b)));
    }

    private void x(og8 og8Var, Date date) {
        if (og8Var.q()) {
            this.h.k(date);
            return;
        }
        Exception l = og8Var.l();
        if (l == null) {
            return;
        }
        if (l instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.h.l();
        } else {
            this.h.j();
        }
    }

    public og8 h(final long j2) {
        return this.f.e().k(this.c, new cy0() { // from class: vt0
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                og8 q;
                q = c.this.q(j2, og8Var);
                return q;
            }
        });
    }
}
