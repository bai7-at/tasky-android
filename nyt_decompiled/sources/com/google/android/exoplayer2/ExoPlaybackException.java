package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.comscore.streaming.ContentMediaFormat;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.g;
import defpackage.bl4;
import defpackage.ur;
import defpackage.z19;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public final class ExoPlaybackException extends PlaybackException {
    public static final g.a g = new g.a() { // from class: c72
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            return ExoPlaybackException.e(bundle);
        }
    };
    private static final String h = z19.t0(1001);
    private static final String i = z19.t0(ContentMediaFormat.FULL_CONTENT_EPISODE);
    private static final String j = z19.t0(ContentMediaFormat.FULL_CONTENT_MOVIE);
    private static final String k = z19.t0(ContentMediaFormat.PARTIAL_CONTENT_GENERIC);
    private static final String l = z19.t0(1005);
    private static final String m = z19.t0(ContentMediaFormat.PARTIAL_CONTENT_MOVIE);
    final boolean isRecoverable;
    public final bl4 mediaPeriodId;
    public final t0 rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;

    /* renamed from: type, reason: collision with root package name */
    public final int f45type;

    private ExoPlaybackException(int i2, Throwable th, int i3) {
        this(i2, th, null, i3, null, -1, null, 4, false);
    }

    public static /* synthetic */ ExoPlaybackException e(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    public static ExoPlaybackException g(Throwable th, String str, int i2, t0 t0Var, int i3, boolean z, int i4) {
        return new ExoPlaybackException(1, th, null, i4, str, i2, t0Var, t0Var == null ? 4 : i3, z);
    }

    public static ExoPlaybackException h(IOException iOException, int i2) {
        return new ExoPlaybackException(0, iOException, i2);
    }

    public static ExoPlaybackException i(RuntimeException runtimeException) {
        return j(runtimeException, NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
    }

    public static ExoPlaybackException j(RuntimeException runtimeException, int i2) {
        return new ExoPlaybackException(2, runtimeException, i2);
    }

    private static String k(int i2, String str, String str2, int i3, t0 t0Var, int i4) {
        String str3;
        if (i2 == 0) {
            str3 = "Source error";
        } else if (i2 != 1) {
            str3 = i2 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i3 + ", format=" + t0Var + ", format_supported=" + z19.Y(i4);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle a = super.a();
        a.putInt(h, this.f45type);
        a.putString(i, this.rendererName);
        a.putInt(j, this.rendererIndex);
        t0 t0Var = this.rendererFormat;
        if (t0Var != null) {
            a.putBundle(k, t0Var.a());
        }
        a.putInt(l, this.rendererFormatSupport);
        a.putBoolean(m, this.isRecoverable);
        return a;
    }

    ExoPlaybackException f(bl4 bl4Var) {
        return new ExoPlaybackException((String) z19.j(getMessage()), getCause(), this.errorCode, this.f45type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, bl4Var, this.timestampMs, this.isRecoverable);
    }

    public Exception l() {
        ur.g(this.f45type == 1);
        return (Exception) ur.e(getCause());
    }

    public IOException m() {
        ur.g(this.f45type == 0);
        return (IOException) ur.e(getCause());
    }

    public RuntimeException n() {
        ur.g(this.f45type == 2);
        return (RuntimeException) ur.e(getCause());
    }

    private ExoPlaybackException(int i2, Throwable th, String str, int i3, String str2, int i4, t0 t0Var, int i5, boolean z) {
        this(k(i2, str, str2, i4, t0Var, i5), th, i3, i2, str2, i4, t0Var, i5, null, SystemClock.elapsedRealtime(), z);
    }

    private ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.f45type = bundle.getInt(h, 2);
        this.rendererName = bundle.getString(i);
        this.rendererIndex = bundle.getInt(j, -1);
        Bundle bundle2 = bundle.getBundle(k);
        this.rendererFormat = bundle2 == null ? null : (t0) t0.O0.a(bundle2);
        this.rendererFormatSupport = bundle.getInt(l, 4);
        this.isRecoverable = bundle.getBoolean(m, false);
        this.mediaPeriodId = null;
    }

    private ExoPlaybackException(String str, Throwable th, int i2, int i3, String str2, int i4, t0 t0Var, int i5, bl4 bl4Var, long j2, boolean z) {
        super(str, th, i2, j2);
        ur.a(!z || i3 == 1);
        ur.a(th != null || i3 == 3);
        this.f45type = i3;
        this.rendererName = str2;
        this.rendererIndex = i4;
        this.rendererFormat = t0Var;
        this.rendererFormatSupport = i5;
        this.mediaPeriodId = bl4Var;
        this.isRecoverable = z;
    }
}
