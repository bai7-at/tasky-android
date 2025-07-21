package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class nh4 extends Service {
    static final boolean h = Log.isLoggable("MBServiceCompat", 3);
    private g a;
    f e;
    MediaSessionCompat.Token g;
    final f b = new f("android.media.session.MediaController", -1, -1, null, null);
    final ArrayList c = new ArrayList();
    final so d = new so();
    final q f = new q();

    class a extends l {
        final /* synthetic */ f f;
        final /* synthetic */ String g;
        final /* synthetic */ Bundle h;
        final /* synthetic */ Bundle i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f = fVar;
            this.g = str;
            this.h = bundle;
            this.i = bundle2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // nh4.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(List list) {
            if (nh4.this.d.get(this.f.f.asBinder()) != this.f) {
                if (nh4.h) {
                    Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f.a + " id=" + this.g);
                    return;
                }
                return;
            }
            if ((b() & 1) != 0) {
                list = nh4.this.h(list, this.h);
            }
            try {
                this.f.f.a(this.g, list, this.h, this.i);
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.g + " package=" + this.f.a);
            }
        }
    }

    class b extends l {
        final /* synthetic */ ResultReceiver f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f = resultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // nh4.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(MediaBrowserCompat.MediaItem mediaItem) {
            if ((b() & 2) != 0) {
                this.f.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f.b(0, bundle);
        }
    }

    class c extends l {
        final /* synthetic */ ResultReceiver f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f = resultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // nh4.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(List list) {
            if ((b() & 4) != 0 || list == null) {
                this.f.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f.b(0, bundle);
        }
    }

    class d extends l {
        final /* synthetic */ ResultReceiver f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f = resultReceiver;
        }

        @Override // nh4.l
        void d(Bundle bundle) {
            this.f.b(-1, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // nh4.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(Bundle bundle) {
            this.f.b(0, bundle);
        }
    }

    public static final class e {
        private final String a;
        private final Bundle b;

        public e(String str, Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.a = str;
            this.b = bundle;
        }

        public Bundle c() {
            return this.b;
        }

        public String d() {
            return this.a;
        }
    }

    private class f implements IBinder.DeathRecipient {
        public final String a;
        public final int b;
        public final int c;
        public final do4 d;
        public final Bundle e;
        public final o f;
        public final HashMap g = new HashMap();
        public e h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                nh4.this.d.remove(fVar.f.asBinder());
            }
        }

        f(String str, int i, int i2, Bundle bundle, o oVar) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = new do4(str, i, i2);
            this.e = bundle;
            this.f = oVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            nh4.this.f.post(new a());
        }
    }

    interface g {
        void a(MediaSessionCompat.Token token);

        IBinder b(Intent intent);

        void onCreate();
    }

    class h implements g {
        final List a = new ArrayList();
        MediaBrowserService b;
        Messenger c;

        class a implements Runnable {
            final /* synthetic */ MediaSessionCompat.Token a;

            a(MediaSessionCompat.Token token) {
                this.a = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.e(this.a);
            }
        }

        class b extends l {
            final /* synthetic */ m f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Object obj, m mVar) {
                super(obj);
                this.f = mVar;
            }

            @Override // nh4.l
            public void a() {
                this.f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // nh4.l
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public void e(List list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it2.next();
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f.c(arrayList);
            }
        }

        class c extends MediaBrowserService {
            c(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                e c = h.this.c(str, i, bundle == null ? null : new Bundle(bundle));
                if (c == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(c.a, c.b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result result) {
                h.this.d(str, new m(result));
            }
        }

        h() {
        }

        @Override // nh4.g
        public void a(MediaSessionCompat.Token token) {
            nh4.this.f.a(new a(token));
        }

        @Override // nh4.g
        public IBinder b(Intent intent) {
            return this.b.onBind(intent);
        }

        public e c(String str, int i, Bundle bundle) {
            Bundle bundle2;
            int i2 = -1;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove("extra_client_version");
                this.c = new Messenger(nh4.this.f);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                je0.b(bundle2, "extra_messenger", this.c.getBinder());
                MediaSessionCompat.Token token = nh4.this.g;
                if (token != null) {
                    android.support.v4.media.session.b c2 = token.c();
                    je0.b(bundle2, "extra_session_binder", c2 == null ? null : c2.asBinder());
                } else {
                    this.a.add(bundle2);
                }
                i2 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
            }
            f fVar = nh4.this.new f(str, i2, i, bundle, null);
            nh4 nh4Var = nh4.this;
            nh4Var.e = fVar;
            e l = nh4Var.l(str, i, bundle);
            nh4 nh4Var2 = nh4.this;
            nh4Var2.e = null;
            if (l == null) {
                return null;
            }
            if (this.c != null) {
                nh4Var2.c.add(fVar);
            }
            if (bundle2 == null) {
                bundle2 = l.c();
            } else if (l.c() != null) {
                bundle2.putAll(l.c());
            }
            return new e(l.d(), bundle2);
        }

        public void d(String str, m mVar) {
            b bVar = new b(str, mVar);
            nh4 nh4Var = nh4.this;
            nh4Var.e = nh4Var.b;
            nh4Var.m(str, bVar);
            nh4.this.e = null;
        }

        void e(MediaSessionCompat.Token token) {
            if (!this.a.isEmpty()) {
                android.support.v4.media.session.b c2 = token.c();
                if (c2 != null) {
                    Iterator it2 = this.a.iterator();
                    while (it2.hasNext()) {
                        je0.b((Bundle) it2.next(), "extra_session_binder", c2.asBinder());
                    }
                }
                this.a.clear();
            }
            this.b.setSessionToken((MediaSession.Token) token.e());
        }
    }

    class i extends h {

        class a extends l {
            final /* synthetic */ m f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, m mVar) {
                super(obj);
                this.f = mVar;
            }

            @Override // nh4.l
            public void a() {
                this.f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // nh4.l
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public void e(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f.c(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f.c(obtain);
            }
        }

        class b extends h.c {
            b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result result) {
                i.this.f(str, new m(result));
            }
        }

        i() {
            super();
        }

        public void f(String str, m mVar) {
            a aVar = new a(str, mVar);
            nh4 nh4Var = nh4.this;
            nh4Var.e = nh4Var.b;
            nh4Var.o(str, aVar);
            nh4.this.e = null;
        }
    }

    class j extends i {

        class a extends l {
            final /* synthetic */ m f;
            final /* synthetic */ Bundle g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, m mVar, Bundle bundle) {
                super(obj);
                this.f = mVar;
                this.g = bundle;
            }

            @Override // nh4.l
            public void a() {
                this.f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // nh4.l
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public void e(List list) {
                if (list == null) {
                    this.f.c(null);
                    return;
                }
                if ((b() & 1) != 0) {
                    list = nh4.this.h(list, this.g);
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (MediaBrowserCompat.MediaItem mediaItem : list) {
                    Parcel obtain = Parcel.obtain();
                    mediaItem.writeToParcel(obtain, 0);
                    arrayList.add(obtain);
                }
                this.f.c(arrayList);
            }
        }

        class b extends i.b {
            b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                j jVar = j.this;
                nh4 nh4Var = nh4.this;
                nh4Var.e = nh4Var.b;
                jVar.g(str, new m(result), bundle);
                nh4.this.e = null;
            }
        }

        j() {
            super();
        }

        public void g(String str, m mVar, Bundle bundle) {
            a aVar = new a(str, mVar, bundle);
            nh4 nh4Var = nh4.this;
            nh4Var.e = nh4Var.b;
            nh4Var.n(str, aVar, bundle);
            nh4.this.e = null;
        }

        @Override // nh4.g
        public void onCreate() {
            b bVar = new b(nh4.this);
            this.b = bVar;
            bVar.onCreate();
        }
    }

    class k extends j {
        k() {
            super();
        }
    }

    public static class l {
        private final Object a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;

        l(Object obj) {
            this.a = obj;
        }

        public void a() {
            if (this.b) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.a);
            }
            if (this.c) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.a);
            }
            if (!this.d) {
                this.b = true;
                return;
            }
            throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.a);
        }

        int b() {
            return this.e;
        }

        boolean c() {
            return this.b || this.c || this.d;
        }

        void d(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.a);
        }

        abstract void e(Object obj);

        public void f(Bundle bundle) {
            if (!this.c && !this.d) {
                this.d = true;
                d(bundle);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.a);
            }
        }

        public void g(Object obj) {
            if (!this.c && !this.d) {
                this.c = true;
                e(obj);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.a);
            }
        }

        void h(int i) {
            this.e = i;
        }
    }

    static class m {
        MediaBrowserService.Result a;

        m(MediaBrowserService.Result result) {
            this.a = result;
        }

        public void a() {
            this.a.detach();
        }

        List b(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Parcel parcel = (Parcel) it2.next();
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        public void c(Object obj) {
            if (obj instanceof List) {
                this.a.sendResult(b((List) obj));
                return;
            }
            if (!(obj instanceof Parcel)) {
                this.a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            this.a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    private class n {

        class a implements Runnable {
            final /* synthetic */ o a;
            final /* synthetic */ String b;
            final /* synthetic */ int c;
            final /* synthetic */ int d;
            final /* synthetic */ Bundle e;

            a(o oVar, String str, int i, int i2, Bundle bundle) {
                this.a = oVar;
                this.b = str;
                this.c = i;
                this.d = i2;
                this.e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.a.asBinder();
                nh4.this.d.remove(asBinder);
                f fVar = nh4.this.new f(this.b, this.c, this.d, this.e, this.a);
                nh4 nh4Var = nh4.this;
                nh4Var.e = fVar;
                e l = nh4Var.l(this.b, this.d, this.e);
                fVar.h = l;
                nh4 nh4Var2 = nh4.this;
                nh4Var2.e = null;
                if (l != null) {
                    try {
                        nh4Var2.d.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (nh4.this.g != null) {
                            this.a.c(fVar.h.d(), nh4.this.g, fVar.h.c());
                            return;
                        }
                        return;
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.b);
                        nh4.this.d.remove(asBinder);
                        return;
                    }
                }
                Log.i("MBServiceCompat", "No root for client " + this.b + " from service " + getClass().getName());
                try {
                    this.a.b();
                } catch (RemoteException unused2) {
                    Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.b);
                }
            }
        }

        class b implements Runnable {
            final /* synthetic */ o a;

            b(o oVar) {
                this.a = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) nh4.this.d.remove(this.a.asBinder());
                if (fVar != null) {
                    fVar.f.asBinder().unlinkToDeath(fVar, 0);
                }
            }
        }

        class c implements Runnable {
            final /* synthetic */ o a;
            final /* synthetic */ String b;
            final /* synthetic */ IBinder c;
            final /* synthetic */ Bundle d;

            c(o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.a = oVar;
                this.b = str;
                this.c = iBinder;
                this.d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) nh4.this.d.get(this.a.asBinder());
                if (fVar != null) {
                    nh4.this.g(this.b, fVar, this.c, this.d);
                    return;
                }
                Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.b);
            }
        }

        class d implements Runnable {
            final /* synthetic */ o a;
            final /* synthetic */ String b;
            final /* synthetic */ IBinder c;

            d(o oVar, String str, IBinder iBinder) {
                this.a = oVar;
                this.b = str;
                this.c = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) nh4.this.d.get(this.a.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.b);
                    return;
                }
                if (nh4.this.w(this.b, fVar, this.c)) {
                    return;
                }
                Log.w("MBServiceCompat", "removeSubscription called for " + this.b + " which is not subscribed");
            }
        }

        class e implements Runnable {
            final /* synthetic */ o a;
            final /* synthetic */ String b;
            final /* synthetic */ ResultReceiver c;

            e(o oVar, String str, ResultReceiver resultReceiver) {
                this.a = oVar;
                this.b = str;
                this.c = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) nh4.this.d.get(this.a.asBinder());
                if (fVar != null) {
                    nh4.this.u(this.b, fVar, this.c);
                    return;
                }
                Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.b);
            }
        }

        class f implements Runnable {
            final /* synthetic */ o a;
            final /* synthetic */ int b;
            final /* synthetic */ String c;
            final /* synthetic */ int d;
            final /* synthetic */ Bundle e;

            f(o oVar, int i, String str, int i2, Bundle bundle) {
                this.a = oVar;
                this.b = i;
                this.c = str;
                this.d = i2;
                this.e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar;
                IBinder asBinder = this.a.asBinder();
                nh4.this.d.remove(asBinder);
                Iterator it2 = nh4.this.c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    f fVar2 = (f) it2.next();
                    if (fVar2.c == this.b) {
                        fVar = (TextUtils.isEmpty(this.c) || this.d <= 0) ? nh4.this.new f(fVar2.a, fVar2.b, fVar2.c, this.e, this.a) : null;
                        it2.remove();
                    }
                }
                if (fVar == null) {
                    fVar = nh4.this.new f(this.c, this.d, this.b, this.e, this.a);
                }
                nh4.this.d.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        class g implements Runnable {
            final /* synthetic */ o a;

            g(o oVar) {
                this.a = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.a.asBinder();
                f fVar = (f) nh4.this.d.remove(asBinder);
                if (fVar != null) {
                    asBinder.unlinkToDeath(fVar, 0);
                }
            }
        }

        class h implements Runnable {
            final /* synthetic */ o a;
            final /* synthetic */ String b;
            final /* synthetic */ Bundle c;
            final /* synthetic */ ResultReceiver d;

            h(o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.a = oVar;
                this.b = str;
                this.c = bundle;
                this.d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) nh4.this.d.get(this.a.asBinder());
                if (fVar != null) {
                    nh4.this.v(this.b, this.c, fVar, this.d);
                    return;
                }
                Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.b);
            }
        }

        class i implements Runnable {
            final /* synthetic */ o a;
            final /* synthetic */ String b;
            final /* synthetic */ Bundle c;
            final /* synthetic */ ResultReceiver d;

            i(o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.a = oVar;
                this.b = str;
                this.c = bundle;
                this.d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) nh4.this.d.get(this.a.asBinder());
                if (fVar != null) {
                    nh4.this.s(this.b, this.c, fVar, this.d);
                    return;
                }
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.b + ", extras=" + this.c);
            }
        }

        n() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, o oVar) {
            nh4.this.f.a(new c(oVar, str, iBinder, bundle));
        }

        public void b(String str, int i2, int i3, Bundle bundle, o oVar) {
            if (nh4.this.j(str, i3)) {
                nh4.this.f.a(new a(oVar, str, i2, i3, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + str);
        }

        public void c(o oVar) {
            nh4.this.f.a(new b(oVar));
        }

        public void d(String str, ResultReceiver resultReceiver, o oVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            nh4.this.f.a(new e(oVar, str, resultReceiver));
        }

        public void e(o oVar, String str, int i2, int i3, Bundle bundle) {
            nh4.this.f.a(new f(oVar, i3, str, i2, bundle));
        }

        public void f(String str, IBinder iBinder, o oVar) {
            nh4.this.f.a(new d(oVar, str, iBinder));
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver, o oVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            nh4.this.f.a(new h(oVar, str, bundle, resultReceiver));
        }

        public void h(String str, Bundle bundle, ResultReceiver resultReceiver, o oVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            nh4.this.f.a(new i(oVar, str, bundle, resultReceiver));
        }

        public void i(o oVar) {
            nh4.this.f.a(new g(oVar));
        }
    }

    private interface o {
        void a(String str, List list, Bundle bundle, Bundle bundle2);

        IBinder asBinder();

        void b();

        void c(String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    private static class p implements o {
        final Messenger a;

        p(Messenger messenger) {
            this.a = messenger;
        }

        private void d(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.a.send(obtain);
        }

        @Override // nh4.o
        public void a(String str, List list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            d(3, bundle3);
        }

        @Override // nh4.o
        public IBinder asBinder() {
            return this.a.getBinder();
        }

        @Override // nh4.o
        public void b() {
            d(2, null);
        }

        @Override // nh4.o
        public void c(String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            d(1, bundle2);
        }
    }

    private final class q extends Handler {
        private final n a;

        q() {
            this.a = nh4.this.new n();
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    this.a.b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new p(message.replyTo));
                    break;
                case 2:
                    this.a.c(new p(message.replyTo));
                    break;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    this.a.a(data.getString("data_media_item_id"), je0.a(data, "data_callback_token"), bundle2, new p(message.replyTo));
                    break;
                case 4:
                    this.a.f(data.getString("data_media_item_id"), je0.a(data, "data_callback_token"), new p(message.replyTo));
                    break;
                case 5:
                    this.a.d(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                    break;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle3);
                    this.a.e(new p(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    break;
                case 7:
                    this.a.i(new p(message.replyTo));
                    break;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.a(bundle4);
                    this.a.g(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                    break;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.a(bundle5);
                    this.a.h(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                    break;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    break;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    void g(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<fo5> list = (List) fVar.g.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        for (fo5 fo5Var : list) {
            if (iBinder == fo5Var.a && mh4.a(bundle, (Bundle) fo5Var.b)) {
                return;
            }
        }
        list.add(new fo5(iBinder, bundle));
        fVar.g.put(str, list);
        t(str, fVar, bundle, null);
        this.e = fVar;
        q(str, bundle);
        this.e = null;
    }

    List h(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i4 = i3 * i2;
        int i5 = i4 + i3;
        if (i2 < 0 || i3 < 1 || i4 >= list.size()) {
            return Collections.emptyList();
        }
        if (i5 > list.size()) {
            i5 = list.size();
        }
        return list.subList(i4, i5);
    }

    public MediaSessionCompat.Token i() {
        return this.g;
    }

    boolean j(String str, int i2) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i2)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void k(String str, Bundle bundle, l lVar) {
        lVar.f(null);
    }

    public abstract e l(String str, int i2, Bundle bundle);

    public abstract void m(String str, l lVar);

    public void n(String str, l lVar, Bundle bundle) {
        lVar.h(1);
        m(str, lVar);
    }

    public void o(String str, l lVar) {
        lVar.h(2);
        lVar.g(null);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a.b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        k kVar = new k();
        this.a = kVar;
        kVar.onCreate();
    }

    public void p(String str, Bundle bundle, l lVar) {
        lVar.h(4);
        lVar.g(null);
    }

    public void q(String str, Bundle bundle) {
    }

    public void r(String str) {
    }

    void s(String str, Bundle bundle, f fVar, ResultReceiver resultReceiver) {
        d dVar = new d(str, resultReceiver);
        this.e = fVar;
        k(str, bundle, dVar);
        this.e = null;
        if (dVar.c()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    void t(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.e = fVar;
        if (bundle == null) {
            m(str, aVar);
        } else {
            n(str, aVar, bundle);
        }
        this.e = null;
        if (aVar.c()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.a + " id=" + str);
    }

    void u(String str, f fVar, ResultReceiver resultReceiver) {
        b bVar = new b(str, resultReceiver);
        this.e = fVar;
        o(str, bVar);
        this.e = null;
        if (bVar.c()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    void v(String str, Bundle bundle, f fVar, ResultReceiver resultReceiver) {
        c cVar = new c(str, resultReceiver);
        this.e = fVar;
        p(str, bundle, cVar);
        this.e = null;
        if (cVar.c()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    boolean w(String str, f fVar, IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder != null) {
                List list = (List) fVar.g.get(str);
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (iBinder == ((fo5) it2.next()).a) {
                            it2.remove();
                            z = true;
                        }
                    }
                    if (list.size() == 0) {
                        fVar.g.remove(str);
                    }
                }
            } else if (fVar.g.remove(str) != null) {
                z = true;
            }
            return z;
        } finally {
            this.e = fVar;
            r(str);
            this.e = null;
        }
    }

    public void x(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.g != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.g = token;
        this.a.a(token);
    }
}
