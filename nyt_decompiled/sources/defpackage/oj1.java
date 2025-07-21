package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.eventtracker.model.Session;
import com.nytimes.android.eventtracker.model.Timestamp;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class oj1 implements jl7 {
    public static final a Companion = new a(null);
    private static final ReentrantLock c = new ReentrantLock();
    private final SharedPreferences a;
    private final long b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public oj1(SharedPreferences sharedPreferences, long j) {
        zq3.h(sharedPreferences, "preferences");
        this.a = sharedPreferences;
        this.b = j;
    }

    private final Timestamp b() {
        return new Timestamp(this.a.getLong("com.nytimes.android.eventtracker.KEY_LAST_EVENT_TIME_VALUE", 0L), this.a.getBoolean("com.nytimes.android.eventtracker.KEY_LAST_EVENT_TIME_TYPE", true));
    }

    private final long c() {
        return this.a.getLong("com.nytimes.android.eventtracker.KEY_SESSION_INDEX", 0L);
    }

    private final Timestamp d() {
        if (this.a.contains("com.nytimes.android.eventtracker.KEY_SESSION_TIME_VALUE")) {
            return new Timestamp(this.a.getLong("com.nytimes.android.eventtracker.KEY_SESSION_TIME_VALUE", 0L), this.a.getBoolean("com.nytimes.android.eventtracker.KEY_SESSION_TIME_TYPE", true));
        }
        return null;
    }

    private final boolean e(long j, Timestamp timestamp, Timestamp timestamp2) {
        return j == 0 || timestamp2.a() - timestamp.a() > this.b;
    }

    private final void f(Timestamp timestamp) {
        this.a.edit().putLong("com.nytimes.android.eventtracker.KEY_LAST_EVENT_TIME_VALUE", timestamp.a()).putBoolean("com.nytimes.android.eventtracker.KEY_LAST_EVENT_TIME_TYPE", timestamp.b()).commit();
    }

    private final void g(long j) {
        this.a.edit().putLong("com.nytimes.android.eventtracker.KEY_SESSION_INDEX", j).commit();
    }

    private final void h(Timestamp timestamp) {
        this.a.edit().putLong("com.nytimes.android.eventtracker.KEY_SESSION_TIME_VALUE", timestamp.a()).putBoolean("com.nytimes.android.eventtracker.KEY_SESSION_TIME_TYPE", timestamp.b()).commit();
    }

    @Override // defpackage.jl7
    public Session a(Timestamp timestamp) {
        zq3.h(timestamp, "currentTimeStamp");
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            long c2 = c();
            Timestamp b = b();
            Timestamp d = d();
            if (e(c2, b, timestamp)) {
                c2++;
                g(c2);
                h(timestamp);
                k42.a.h(timestamp, new Session((int) c2, timestamp));
                d = timestamp;
            }
            f(timestamp);
            zq3.e(d);
            Session session = new Session((int) c2, d);
            ul8.a.z("ET2").a("Session [" + session.a() + ", " + session.b() + "]", new Object[0]);
            reentrantLock.unlock();
            return session;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
