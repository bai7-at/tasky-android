package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.g;
import defpackage.z19;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

@Deprecated
/* loaded from: classes2.dex */
public class PlaybackException extends Exception implements g {
    private static final String a = z19.t0(0);
    private static final String b = z19.t0(1);
    private static final String c = z19.t0(2);
    private static final String d = z19.t0(3);
    private static final String e = z19.t0(4);
    public static final g.a f = new g.a() { // from class: com.google.android.exoplayer2.s1
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            return new PlaybackException(bundle);
        }
    };
    public final int errorCode;
    public final long timestampMs;

    protected PlaybackException(Bundle bundle) {
        this(bundle.getString(c), d(bundle), bundle.getInt(a, NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT), bundle.getLong(b, SystemClock.elapsedRealtime()));
    }

    private static RemoteException b(String str) {
        return new RemoteException(str);
    }

    private static Throwable c(Class cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static Throwable d(Bundle bundle) {
        String string = bundle.getString(d);
        String string2 = bundle.getString(e);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, PlaybackException.class.getClassLoader());
            Throwable c2 = Throwable.class.isAssignableFrom(cls) ? c(cls, string2) : null;
            if (c2 != null) {
                return c2;
            }
        } catch (Throwable unused) {
        }
        return b(string2);
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(a, this.errorCode);
        bundle.putLong(b, this.timestampMs);
        bundle.putString(c, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(d, cause.getClass().getName());
            bundle.putString(e, cause.getMessage());
        }
        return bundle;
    }

    protected PlaybackException(String str, Throwable th, int i, long j) {
        super(str, th);
        this.errorCode = i;
        this.timestampMs = j;
    }
}
