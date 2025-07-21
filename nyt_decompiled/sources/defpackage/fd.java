package defpackage;

import android.preference.PreferenceManager;
import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public final class fd {
    public static final fd a = new fd();
    private static final String b;
    private static final ReentrantReadWriteLock c;
    private static String d;
    private static volatile boolean e;

    static {
        String simpleName = fd.class.getSimpleName();
        zq3.g(simpleName, "AnalyticsUserIDStore::class.java.simpleName");
        b = simpleName;
        c = new ReentrantReadWriteLock();
    }

    private fd() {
    }

    public static final String b() {
        if (!e) {
            Log.w(b, "initStore should have been called before calling setUserID");
            a.c();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = d;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th) {
            c.readLock().unlock();
            throw th;
        }
    }

    private final void c() {
        if (e) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (e) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            d = PreferenceManager.getDefaultSharedPreferences(w92.l()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            e = true;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            c.writeLock().unlock();
            throw th;
        }
    }

    public static final void d() {
        if (e) {
            return;
        }
        kq3.b.c().execute(new Runnable() { // from class: ed
            @Override // java.lang.Runnable
            public final void run() {
                fd.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        a.c();
    }
}
