package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import defpackage.je0;
import defpackage.lh4;
import defpackage.so;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {
    static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);
    private final e a;

    private static class CustomActionResultReceiver extends ResultReceiver {
        private final String mAction;
        private final c mCallback;
        private final Bundle mExtras;

        @Override // android.support.v4.os.ResultReceiver
        protected void a(int i, Bundle bundle) {
        }
    }

    private static class ItemReceiver extends ResultReceiver {
        private final d mCallback;
        private final String mMediaId;

        @Override // android.support.v4.os.ResultReceiver
        protected void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.p(bundle);
            }
            if (i != 0) {
                throw null;
            }
            if (bundle == null) {
                throw null;
            }
            if (!bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            throw null;
        }
    }

    private static class SearchResultReceiver extends ResultReceiver {
        private final j mCallback;
        private final Bundle mExtras;
        private final String mQuery;

        @Override // android.support.v4.os.ResultReceiver
        protected void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.p(bundle);
            }
            if (i != 0) {
                throw null;
            }
            if (bundle == null) {
                throw null;
            }
            if (!bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    private static class a extends Handler {
        private final WeakReference a;
        private WeakReference b;

        a(i iVar) {
            this.a = new WeakReference(iVar);
        }

        void a(Messenger messenger) {
            this.b = new WeakReference(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference weakReference = this.b;
            if (weakReference == null || weakReference.get() == null || this.a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.a(data);
            i iVar = (i) this.a.get();
            Messenger messenger = (Messenger) this.b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    iVar.d(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else if (i == 2) {
                    iVar.f(messenger);
                } else if (i != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.a(bundle3);
                    iVar.a(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    iVar.f(messenger);
                }
            }
        }
    }

    public static class b {
        final MediaBrowser.ConnectionCallback a = new a();
        InterfaceC0002b b;

        private class a extends MediaBrowser.ConnectionCallback {
            a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                InterfaceC0002b interfaceC0002b = b.this.b;
                if (interfaceC0002b != null) {
                    interfaceC0002b.b();
                }
                b.this.a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                InterfaceC0002b interfaceC0002b = b.this.b;
                if (interfaceC0002b != null) {
                    interfaceC0002b.c();
                }
                b.this.b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                InterfaceC0002b interfaceC0002b = b.this.b;
                if (interfaceC0002b != null) {
                    interfaceC0002b.e();
                }
                b.this.c();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b, reason: collision with other inner class name */
        interface InterfaceC0002b {
            void b();

            void c();

            void e();
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();

        void d(InterfaceC0002b interfaceC0002b) {
            this.b = interfaceC0002b;
        }
    }

    public static abstract class c {
    }

    public static abstract class d {
    }

    interface e {
        void connect();

        void disconnect();

        MediaSessionCompat.Token getSessionToken();

        boolean isConnected();
    }

    static class f implements e, i, b.InterfaceC0002b {
        final Context a;
        protected final MediaBrowser b;
        protected final Bundle c;
        protected final a d = new a(this);
        private final so e = new so();
        protected int f;
        protected k g;
        protected Messenger h;
        private MediaSessionCompat.Token i;

        f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            this.a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            bVar.d(this);
            this.b = new MediaBrowser(context, componentName, bVar.a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.h != messenger) {
                return;
            }
            lh4.a(this.e.get(str));
            if (MediaBrowserCompat.b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.InterfaceC0002b
        public void b() {
            try {
                Bundle extras = this.b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f = extras.getInt("extra_service_version", 0);
                IBinder a = je0.a(extras, "extra_messenger");
                if (a != null) {
                    this.g = new k(a, this.c);
                    Messenger messenger = new Messenger(this.d);
                    this.h = messenger;
                    this.d.a(messenger);
                    try {
                        this.g.a(this.a, this.h);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                android.support.v4.media.session.b O = b.a.O(je0.a(extras, "extra_session_binder"));
                if (O != null) {
                    this.i = MediaSessionCompat.Token.b(this.b.getSessionToken(), O);
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.InterfaceC0002b
        public void c() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void connect() {
            this.b.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public void d(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void disconnect() {
            Messenger messenger;
            k kVar = this.g;
            if (kVar != null && (messenger = this.h) != null) {
                try {
                    kVar.c(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.b.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.InterfaceC0002b
        public void e() {
            this.g = null;
            this.h = null;
            this.i = null;
            this.d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public void f(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public MediaSessionCompat.Token getSessionToken() {
            if (this.i == null) {
                this.i = MediaSessionCompat.Token.a(this.b.getSessionToken());
            }
            return this.i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public boolean isConnected() {
            return this.b.isConnected();
        }
    }

    static class g extends f {
        g(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    static class h extends g {
        h(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    interface i {
        void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void d(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void f(Messenger messenger);
    }

    public static abstract class j {
    }

    private static class k {
        private Messenger a;
        private Bundle b;

        public k(IBinder iBinder, Bundle bundle) {
            this.a = new Messenger(iBinder);
            this.b = bundle;
        }

        private void b(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.a.send(obtain);
        }

        void a(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.b);
            b(6, bundle, messenger);
        }

        void c(Messenger messenger) {
            b(7, null, messenger);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        this.a = new h(context, componentName, bVar, bundle);
    }

    public void a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.a.connect();
    }

    public void b() {
        this.a.disconnect();
    }

    public MediaSessionCompat.Token c() {
        return this.a.getSessionToken();
    }

    public boolean d() {
        return this.a.isConnected();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final MediaDescriptionCompat mDescription;
        private final int mFlags;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.e())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.mFlags = i;
            this.mDescription = mediaDescriptionCompat;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.mFlags + ", mDescription=" + this.mDescription + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mFlags);
            this.mDescription.writeToParcel(parcel, i);
        }

        MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
