package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import defpackage.do4;
import defpackage.f59;
import defpackage.je0;
import defpackage.oh4;
import defpackage.to5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MediaSessionCompat {
    static int d;
    private final c a;
    private final MediaControllerCompat b;
    private final ArrayList c;

    @SuppressLint({"BanParcelableUsage"})
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
        ResultReceiver mResultReceiver;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.mResultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.mResultReceiver.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();
        private android.support.v4.media.session.b mExtraBinder;
        private final Object mInner;
        private final Object mLock;
        private f59 mSession2Token;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        public static Token a(Object obj) {
            return b(obj, null);
        }

        public static Token b(Object obj, android.support.v4.media.session.b bVar) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        public android.support.v4.media.session.b c() {
            android.support.v4.media.session.b bVar;
            synchronized (this.mLock) {
                bVar = this.mExtraBinder;
            }
            return bVar;
        }

        public f59 d() {
            f59 f59Var;
            synchronized (this.mLock) {
                f59Var = this.mSession2Token;
            }
            return f59Var;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Object e() {
            return this.mInner;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.mInner;
            if (obj2 == null) {
                return token.mInner == null;
            }
            Object obj3 = token.mInner;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public void f(android.support.v4.media.session.b bVar) {
            synchronized (this.mLock) {
                this.mExtraBinder = bVar;
            }
        }

        public void g(f59 f59Var) {
            synchronized (this.mLock) {
                this.mSession2Token = f59Var;
            }
        }

        public int hashCode() {
            Object obj = this.mInner;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.mInner, i);
        }

        Token(Object obj, android.support.v4.media.session.b bVar) {
            this(obj, bVar, null);
        }

        Token(Object obj, android.support.v4.media.session.b bVar, f59 f59Var) {
            this.mLock = new Object();
            this.mInner = obj;
            this.mExtraBinder = bVar;
            this.mSession2Token = f59Var;
        }
    }

    class a extends b {
        a() {
        }
    }

    public static abstract class b {
        private boolean c;
        a e;
        final Object a = new Object();
        final MediaSession.Callback b = new C0004b();
        WeakReference d = new WeakReference(null);

        private class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                c cVar;
                b bVar;
                a aVar;
                if (message.what == 1) {
                    synchronized (b.this.a) {
                        cVar = (c) b.this.d.get();
                        bVar = b.this;
                        aVar = bVar.e;
                    }
                    if (cVar == null || bVar != cVar.f() || aVar == null) {
                        return;
                    }
                    cVar.h((do4) message.obj);
                    b.this.a(cVar, aVar);
                    cVar.h(null);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$b, reason: collision with other inner class name */
        private class C0004b extends MediaSession.Callback {
            C0004b() {
            }

            private void a(c cVar) {
                cVar.h(null);
            }

            private d b() {
                d dVar;
                synchronized (b.this.a) {
                    dVar = (d) b.this.d.get();
                }
                if (dVar == null || b.this != dVar.f()) {
                    return null;
                }
                return dVar;
            }

            private void c(c cVar) {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                try {
                    QueueItem queueItem = null;
                    IBinder asBinder = null;
                    queueItem = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token sessionToken = b.getSessionToken();
                        android.support.v4.media.session.b c = sessionToken.c();
                        if (c != null) {
                            asBinder = c.asBinder();
                        }
                        je0.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", asBinder);
                        to5.c(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", sessionToken.d());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        b.this.b((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        b.this.c((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        b.this.q((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        b.this.d(str, bundle, resultReceiver);
                    } else if (b.h != null) {
                        int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                        if (i >= 0 && i < b.h.size()) {
                            queueItem = (QueueItem) b.h.get(i);
                        }
                        if (queueItem != null) {
                            b.this.q(queueItem.c());
                        }
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle2);
                        b.this.l(uri, bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        b.this.m();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle3);
                        b.this.n(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle4);
                        b.this.o(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle5);
                        b.this.p(uri2, bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        b.this.t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        b.this.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        b.this.y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle6);
                        b.this.w(ratingCompat, bundle6);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        b.this.u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    } else {
                        b.this.e(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.f();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                d b = b();
                if (b == null) {
                    return false;
                }
                c(b);
                boolean g = b.this.g(intent);
                a(b);
                return g || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.h();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.i();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                b.this.j(str, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                b.this.k(str, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                b.this.l(uri, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.m();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                b.this.n(str, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                b.this.o(str, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                b.this.p(uri, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.r();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j) {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.s(j);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f) {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.u(f);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.v(RatingCompat.a(rating));
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.z();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.A();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j) {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.B(j);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.C();
                a(b);
            }
        }

        public void A() {
        }

        public void B(long j) {
        }

        public void C() {
        }

        void D(c cVar, Handler handler) {
            synchronized (this.a) {
                try {
                    this.d = new WeakReference(cVar);
                    a aVar = this.e;
                    a aVar2 = null;
                    if (aVar != null) {
                        aVar.removeCallbacksAndMessages(null);
                    }
                    if (cVar != null && handler != null) {
                        aVar2 = new a(handler.getLooper());
                    }
                    this.e = aVar2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void a(c cVar, Handler handler) {
            if (this.c) {
                this.c = false;
                handler.removeMessages(1);
                PlaybackStateCompat w = cVar.w();
                long b = w == null ? 0L : w.b();
                boolean z = w != null && w.h() == 3;
                boolean z2 = (516 & b) != 0;
                boolean z3 = (b & 514) != 0;
                if (z && z3) {
                    h();
                } else {
                    if (z || !z2) {
                        return;
                    }
                    i();
                }
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void f() {
        }

        public boolean g(Intent intent) {
            return false;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void r() {
        }

        public void s(long j) {
        }

        public void t(boolean z) {
        }

        public void u(float f) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void x(int i) {
        }

        public void y(int i) {
        }

        public void z() {
        }
    }

    interface c {
        void a(int i);

        void b(b bVar, Handler handler);

        void c(MediaMetadataCompat mediaMetadataCompat);

        void d(PlaybackStateCompat playbackStateCompat);

        void e(PendingIntent pendingIntent);

        b f();

        void g(PendingIntent pendingIntent);

        void g0(boolean z);

        Token getSessionToken();

        void h(do4 do4Var);

        Object i();

        boolean isActive();

        void j(boolean z);

        void release();

        PlaybackStateCompat w();
    }

    static class d implements c {
        final MediaSession a;
        final Token b;
        Bundle d;
        PlaybackStateCompat g;
        List h;
        MediaMetadataCompat i;
        int j;
        boolean k;
        int l;
        int m;
        b n;
        final Object c = new Object();
        boolean e = false;
        final RemoteCallbackList f = new RemoteCallbackList();

        class a extends b.a {
            a() {
            }

            @Override // android.support.v4.media.session.b
            public void A1(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public CharSequence C4() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean E0() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void E2(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void F4(android.support.v4.media.session.a aVar) {
                d.this.f.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (d.this.c) {
                    d.this.getClass();
                }
            }

            @Override // android.support.v4.media.session.b
            public List F5() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void G1(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void H0(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void H5(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void L() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean P() {
                return d.this.k;
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent P0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void P3(android.support.v4.media.session.a aVar) {
                if (d.this.e) {
                    return;
                }
                d.this.f.register(aVar, new do4("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (d.this.c) {
                    d.this.getClass();
                }
            }

            @Override // android.support.v4.media.session.b
            public int Q0() {
                return d.this.j;
            }

            @Override // android.support.v4.media.session.b
            public void Q2(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void V3(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo V5() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void X3(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Z() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean a2(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void c5(float f) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void d0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void d4(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void e0(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean f4() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void g0(boolean z) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void g3(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String getPackageName() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void h4(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void i3(boolean z) {
            }

            @Override // android.support.v4.media.session.b
            public void j2(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void k5(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void l4(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void n2(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String p() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public long p0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void pause() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void q() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int q0() {
                return d.this.l;
            }

            @Override // android.support.v4.media.session.b
            public void q3(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void s1(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle t1() {
                if (d.this.d == null) {
                    return null;
                }
                return new Bundle(d.this.d);
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat w() {
                d dVar = d.this;
                return MediaSessionCompat.e(dVar.g, dVar.i);
            }

            @Override // android.support.v4.media.session.b
            public void x1(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void y0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int z2() {
                return d.this.m;
            }
        }

        d(Context context, String str, f59 f59Var, Bundle bundle) {
            MediaSession k = k(context, str, bundle);
            this.a = k;
            this.b = new Token(k.getSessionToken(), new a(), f59Var);
            this.d = bundle;
            a(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void a(int i) {
            this.a.setFlags(i | 3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void b(b bVar, Handler handler) {
            synchronized (this.c) {
                try {
                    this.n = bVar;
                    this.a.setCallback(bVar == null ? null : bVar.b, handler);
                    if (bVar != null) {
                        bVar.D(this, handler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void c(MediaMetadataCompat mediaMetadataCompat) {
            this.i = mediaMetadataCompat;
            this.a.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.f());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void d(PlaybackStateCompat playbackStateCompat) {
            this.g = playbackStateCompat;
            synchronized (this.c) {
                for (int beginBroadcast = this.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f.getBroadcastItem(beginBroadcast)).p6(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f.finishBroadcast();
            }
            this.a.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.f());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void e(PendingIntent pendingIntent) {
            this.a.setSessionActivity(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public b f() {
            b bVar;
            synchronized (this.c) {
                bVar = this.n;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void g(PendingIntent pendingIntent) {
            this.a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void g0(boolean z) {
            if (this.k != z) {
                this.k = z;
                synchronized (this.c) {
                    for (int beginBroadcast = this.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            ((android.support.v4.media.session.a) this.f.getBroadcastItem(beginBroadcast)).V4(z);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Token getSessionToken() {
            return this.b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Object i() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public boolean isActive() {
            return this.a.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void j(boolean z) {
            this.a.setActive(z);
        }

        public abstract MediaSession k(Context context, String str, Bundle bundle);

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void release() {
            this.e = true;
            this.f.kill();
            this.a.setCallback(null);
            this.a.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public PlaybackStateCompat w() {
            return this.g;
        }
    }

    static class e extends d {
        e(Context context, String str, f59 f59Var, Bundle bundle) {
            super(context, str, f59Var, bundle);
        }
    }

    static class f extends e {
        f(Context context, String str, f59 f59Var, Bundle bundle) {
            super(context, str, f59Var, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void h(do4 do4Var) {
        }
    }

    static class g extends f {
        g(Context context, String str, f59 f59Var, Bundle bundle) {
            super(context, str, f59Var, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public MediaSession k(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str, bundle);
        }
    }

    public interface h {
        void a();
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    static PlaybackStateCompat e(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.g() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.h() != 3 && playbackStateCompat.h() != 4 && playbackStateCompat.h() != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.d() <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long e2 = ((long) (playbackStateCompat.e() * (elapsedRealtime - r0))) + playbackStateCompat.g();
        if (mediaMetadataCompat != null && mediaMetadataCompat.a(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            j = mediaMetadataCompat.e(MediaMetadataCompat.METADATA_KEY_DURATION);
        }
        return new PlaybackStateCompat.d(playbackStateCompat).f(playbackStateCompat.h(), (j < 0 || e2 <= j) ? e2 < 0 ? 0L : e2 : j, playbackStateCompat.e(), elapsedRealtime).a();
    }

    public static Bundle p(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public MediaControllerCompat b() {
        return this.b;
    }

    public Object c() {
        return this.a.i();
    }

    public Token d() {
        return this.a.getSessionToken();
    }

    public boolean f() {
        return this.a.isActive();
    }

    public void g() {
        this.a.release();
    }

    public void h(boolean z) {
        this.a.j(z);
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            ((h) it2.next()).a();
        }
    }

    public void i(b bVar) {
        j(bVar, null);
    }

    public void j(b bVar, Handler handler) {
        if (bVar == null) {
            this.a.b(null, null);
            return;
        }
        c cVar = this.a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.b(bVar, handler);
    }

    public void k(boolean z) {
        this.a.g0(z);
    }

    public void l(int i) {
        this.a.a(i);
    }

    public void m(MediaMetadataCompat mediaMetadataCompat) {
        this.a.c(mediaMetadataCompat);
    }

    public void n(PlaybackStateCompat playbackStateCompat) {
        this.a.d(playbackStateCompat);
    }

    public void o(PendingIntent pendingIntent) {
        this.a.e(pendingIntent);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, f59 f59Var) {
        this.c = new ArrayList();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null && (componentName = oh4.a(context)) == null) {
                    Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
                }
                g gVar = new g(context, str, f59Var, bundle);
                this.a = gVar;
                j(new a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                gVar.g(pendingIntent);
                this.b = new MediaControllerCompat(context, this);
                if (d == 0) {
                    d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        public static final int UNKNOWN_ID = -1;
        private final MediaDescriptionCompat mDescription;
        private final long mId;
        private MediaSession.QueueItem mItemFwk;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        private static class b {
            static MediaSession.QueueItem a(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.mDescription = mediaDescriptionCompat;
            this.mId = j;
            this.mItemFwk = queueItem;
        }

        public static QueueItem a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.a(b.b(queueItem)), b.c(queueItem));
        }

        public static List b(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(a(it2.next()));
            }
            return arrayList;
        }

        public MediaDescriptionCompat c() {
            return this.mDescription;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.mDescription + ", Id=" + this.mId + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.mDescription.writeToParcel(parcel, i);
            parcel.writeLong(this.mId);
        }

        QueueItem(Parcel parcel) {
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.mId = parcel.readLong();
        }
    }
}
