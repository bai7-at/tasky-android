package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import defpackage.vm4;
import defpackage.zm4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class uu6 extends vm4 implements ServiceConnection {
    static final boolean t = Log.isLoggable("MediaRouteProviderProxy", 3);
    private final ComponentName i;
    final d j;
    private final ArrayList k;
    private boolean l;
    private boolean m;
    private a n;
    private boolean r;
    private b s;

    private final class a implements IBinder.DeathRecipient {
        private final Messenger a;
        private final e b;
        private final Messenger c;
        private int f;
        private int g;
        private int d = 1;
        private int e = 1;
        private final SparseArray h = new SparseArray();

        /* renamed from: uu6$a$a, reason: collision with other inner class name */
        class RunnableC0549a implements Runnable {
            RunnableC0549a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.e();
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                uu6.this.J(aVar);
            }
        }

        public a(Messenger messenger) {
            this.a = messenger;
            e eVar = new e(this);
            this.b = eVar;
            this.c = new Messenger(eVar);
        }

        private boolean s(int i, int i2, int i3, Object obj, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = i2;
            obtain.arg2 = i3;
            obtain.obj = obj;
            obtain.setData(bundle);
            obtain.replyTo = this.c;
            try {
                this.a.send(obtain);
                return true;
            } catch (DeadObjectException unused) {
                return false;
            } catch (RemoteException e) {
                if (i == 2) {
                    return false;
                }
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
                return false;
            }
        }

        public void a(int i, String str) {
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = this.d;
            this.d = i2 + 1;
            s(12, i2, i, null, bundle);
        }

        public int b(String str, zm4.d dVar) {
            int i = this.e;
            this.e = i + 1;
            int i2 = this.d;
            this.d = i2 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            s(11, i2, i, null, bundle);
            this.h.put(i2, dVar);
            return i;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            uu6.this.j.post(new b());
        }

        public int c(String str, String str2) {
            int i = this.e;
            this.e = i + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            bundle.putString("routeGroupId", str2);
            int i2 = this.d;
            this.d = i2 + 1;
            s(3, i2, i, null, bundle);
            return i;
        }

        public void d() {
            s(2, 0, 0, null, null);
            this.b.a();
            this.a.getBinder().unlinkToDeath(this, 0);
            uu6.this.j.post(new RunnableC0549a());
        }

        void e() {
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                ((zm4.d) this.h.valueAt(i)).a(null, null);
            }
            this.h.clear();
        }

        public boolean f(int i, String str, Bundle bundle) {
            zm4.d dVar = (zm4.d) this.h.get(i);
            if (dVar == null) {
                return false;
            }
            this.h.remove(i);
            dVar.a(str, bundle);
            return true;
        }

        public boolean g(int i, Bundle bundle) {
            zm4.d dVar = (zm4.d) this.h.get(i);
            if (dVar == null) {
                return false;
            }
            this.h.remove(i);
            dVar.b(bundle);
            return true;
        }

        public void h(int i) {
            uu6.this.H(this, i);
        }

        public boolean i(Bundle bundle) {
            if (this.f == 0) {
                return false;
            }
            uu6.this.I(this, wm4.a(bundle));
            return true;
        }

        public void j(int i, Bundle bundle) {
            zm4.d dVar = (zm4.d) this.h.get(i);
            if (bundle == null || !bundle.containsKey("routeId")) {
                dVar.a("DynamicGroupRouteController is created without valid route id.", bundle);
            } else {
                this.h.remove(i);
                dVar.b(bundle);
            }
        }

        public boolean k(int i, Bundle bundle) {
            if (this.f == 0) {
                return false;
            }
            Bundle bundle2 = (Bundle) bundle.getParcelable("groupRoute");
            sm4 d = bundle2 != null ? sm4.d(bundle2) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("dynamicRoutes");
            ArrayList arrayList = new ArrayList();
            Iterator it2 = parcelableArrayList.iterator();
            while (it2.hasNext()) {
                arrayList.add(vm4.b.c.a((Bundle) it2.next()));
            }
            uu6.this.N(this, i, d, arrayList);
            return true;
        }

        public boolean l(int i) {
            if (i == this.g) {
                this.g = 0;
                uu6.this.K(this, "Registration failed");
            }
            zm4.d dVar = (zm4.d) this.h.get(i);
            if (dVar == null) {
                return true;
            }
            this.h.remove(i);
            dVar.a(null, null);
            return true;
        }

        public boolean m(int i) {
            return true;
        }

        public boolean n(int i, int i2, Bundle bundle) {
            if (this.f != 0 || i != this.g || i2 < 1) {
                return false;
            }
            this.g = 0;
            this.f = i2;
            uu6.this.I(this, wm4.a(bundle));
            uu6.this.L(this);
            return true;
        }

        public boolean o() {
            int i = this.d;
            this.d = i + 1;
            this.g = i;
            if (!s(1, i, 4, null, null)) {
                return false;
            }
            try {
                this.a.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException unused) {
                binderDied();
                return false;
            }
        }

        public void p(int i) {
            int i2 = this.d;
            this.d = i2 + 1;
            s(4, i2, i, null, null);
        }

        public void q(int i, String str) {
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = this.d;
            this.d = i2 + 1;
            s(13, i2, i, null, bundle);
        }

        public void r(int i) {
            int i2 = this.d;
            this.d = i2 + 1;
            s(5, i2, i, null, null);
        }

        public void t(um4 um4Var) {
            int i = this.d;
            this.d = i + 1;
            s(10, i, 0, um4Var != null ? um4Var.a() : null, null);
        }

        public void u(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.d;
            this.d = i3 + 1;
            s(7, i3, i, null, bundle);
        }

        public void v(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i2);
            int i3 = this.d;
            this.d = i3 + 1;
            s(6, i3, i, null, bundle);
        }

        public void w(int i, List list) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i2 = this.d;
            this.d = i2 + 1;
            s(14, i2, i, null, bundle);
        }

        public void x(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.d;
            this.d = i3 + 1;
            s(8, i3, i, null, bundle);
        }
    }

    interface b {
        void a(vm4.e eVar);
    }

    interface c {
        void a(a aVar);

        int b();

        void c();
    }

    private static final class d extends Handler {
        d() {
        }
    }

    private static final class e extends Handler {
        private final WeakReference a;

        public e(a aVar) {
            this.a = new WeakReference(aVar);
        }

        private boolean b(a aVar, int i, int i2, int i3, Object obj, Bundle bundle) {
            switch (i) {
                case 0:
                    aVar.l(i2);
                    return true;
                case 1:
                    aVar.m(i2);
                    return true;
                case 2:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.n(i2, i3, (Bundle) obj);
                    }
                    return false;
                case 3:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.g(i2, (Bundle) obj);
                    }
                    return false;
                case 4:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.f(i2, bundle == null ? null : bundle.getString("error"), (Bundle) obj);
                    }
                    return false;
                case 5:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.i((Bundle) obj);
                    }
                    return false;
                case 6:
                    if (obj instanceof Bundle) {
                        aVar.j(i2, (Bundle) obj);
                        return false;
                    }
                    Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                    return false;
                case 7:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.k(i3, (Bundle) obj);
                    }
                    return false;
                case 8:
                    aVar.h(i3);
                    return false;
                default:
                    return false;
            }
        }

        public void a() {
            this.a.clear();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = (a) this.a.get();
            if (aVar == null || b(aVar, message.what, message.arg1, message.arg2, message.obj, message.peekData()) || !uu6.t) {
                return;
            }
            Log.d("MediaRouteProviderProxy", "Unhandled message from server: " + message);
        }
    }

    private final class f extends vm4.b implements c {
        private final String f;
        String g;
        String h;
        private boolean i;
        private int k;
        private a l;
        private int j = -1;
        private int m = -1;

        class a extends zm4.d {
            a() {
            }

            @Override // zm4.d
            public void a(String str, Bundle bundle) {
                Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
            }

            @Override // zm4.d
            public void b(Bundle bundle) {
                f.this.g = bundle.getString("groupableTitle");
                f.this.h = bundle.getString("transferableTitle");
            }
        }

        f(String str) {
            this.f = str;
        }

        @Override // uu6.c
        public void a(a aVar) {
            a aVar2 = new a();
            this.l = aVar;
            int b = aVar.b(this.f, aVar2);
            this.m = b;
            if (this.i) {
                aVar.r(b);
                int i = this.j;
                if (i >= 0) {
                    aVar.u(this.m, i);
                    this.j = -1;
                }
                int i2 = this.k;
                if (i2 != 0) {
                    aVar.x(this.m, i2);
                    this.k = 0;
                }
            }
        }

        @Override // uu6.c
        public int b() {
            return this.m;
        }

        @Override // uu6.c
        public void c() {
            a aVar = this.l;
            if (aVar != null) {
                aVar.p(this.m);
                this.l = null;
                this.m = 0;
            }
        }

        @Override // vm4.e
        public void d() {
            uu6.this.M(this);
        }

        @Override // vm4.e
        public void e() {
            this.i = true;
            a aVar = this.l;
            if (aVar != null) {
                aVar.r(this.m);
            }
        }

        @Override // vm4.e
        public void f(int i) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.u(this.m, i);
            } else {
                this.j = i;
                this.k = 0;
            }
        }

        @Override // vm4.e
        public void g() {
            h(0);
        }

        @Override // vm4.e
        public void h(int i) {
            this.i = false;
            a aVar = this.l;
            if (aVar != null) {
                aVar.v(this.m, i);
            }
        }

        @Override // vm4.e
        public void i(int i) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.x(this.m, i);
            } else {
                this.k += i;
            }
        }

        @Override // vm4.b
        public String j() {
            return this.g;
        }

        @Override // vm4.b
        public String k() {
            return this.h;
        }

        @Override // vm4.b
        public void m(String str) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.a(this.m, str);
            }
        }

        @Override // vm4.b
        public void n(String str) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.q(this.m, str);
            }
        }

        @Override // vm4.b
        public void o(List list) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.w(this.m, list);
            }
        }

        void q(sm4 sm4Var, List list) {
            l(sm4Var, list);
        }
    }

    private final class g extends vm4.e implements c {
        private final String a;
        private final String b;
        private boolean c;
        private int d = -1;
        private int e;
        private a f;
        private int g;

        g(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // uu6.c
        public void a(a aVar) {
            this.f = aVar;
            int c = aVar.c(this.a, this.b);
            this.g = c;
            if (this.c) {
                aVar.r(c);
                int i = this.d;
                if (i >= 0) {
                    aVar.u(this.g, i);
                    this.d = -1;
                }
                int i2 = this.e;
                if (i2 != 0) {
                    aVar.x(this.g, i2);
                    this.e = 0;
                }
            }
        }

        @Override // uu6.c
        public int b() {
            return this.g;
        }

        @Override // uu6.c
        public void c() {
            a aVar = this.f;
            if (aVar != null) {
                aVar.p(this.g);
                this.f = null;
                this.g = 0;
            }
        }

        @Override // vm4.e
        public void d() {
            uu6.this.M(this);
        }

        @Override // vm4.e
        public void e() {
            this.c = true;
            a aVar = this.f;
            if (aVar != null) {
                aVar.r(this.g);
            }
        }

        @Override // vm4.e
        public void f(int i) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.u(this.g, i);
            } else {
                this.d = i;
                this.e = 0;
            }
        }

        @Override // vm4.e
        public void g() {
            h(0);
        }

        @Override // vm4.e
        public void h(int i) {
            this.c = false;
            a aVar = this.f;
            if (aVar != null) {
                aVar.v(this.g, i);
            }
        }

        @Override // vm4.e
        public void i(int i) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.x(this.g, i);
            } else {
                this.e += i;
            }
        }
    }

    public uu6(Context context, ComponentName componentName) {
        super(context, new vm4.d(componentName));
        this.k = new ArrayList();
        this.i = componentName;
        this.j = new d();
    }

    private void A() {
        if (this.m) {
            return;
        }
        boolean z = t;
        if (z) {
            Log.d("MediaRouteProviderProxy", this + ": Binding");
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.i);
        try {
            boolean bindService = n().bindService(intent, this, 4097);
            this.m = bindService;
            if (bindService || !z) {
                return;
            }
            Log.d("MediaRouteProviderProxy", this + ": Bind failed");
        } catch (SecurityException e2) {
            if (t) {
                Log.d("MediaRouteProviderProxy", this + ": Bind failed", e2);
            }
        }
    }

    private vm4.b B(String str) {
        wm4 o = o();
        if (o == null) {
            return null;
        }
        List b2 = o.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            if (((sm4) b2.get(i)).l().equals(str)) {
                f fVar = new f(str);
                this.k.add(fVar);
                if (this.r) {
                    fVar.a(this.n);
                }
                U();
                return fVar;
            }
        }
        return null;
    }

    private vm4.e C(String str, String str2) {
        wm4 o = o();
        if (o == null) {
            return null;
        }
        List b2 = o.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            if (((sm4) b2.get(i)).l().equals(str)) {
                g gVar = new g(str, str2);
                this.k.add(gVar);
                if (this.r) {
                    gVar.a(this.n);
                }
                U();
                return gVar;
            }
        }
        return null;
    }

    private void D() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            ((c) this.k.get(i)).c();
        }
    }

    private void E() {
        if (this.n != null) {
            w(null);
            this.r = false;
            D();
            this.n.d();
            this.n = null;
        }
    }

    private c F(int i) {
        Iterator it2 = this.k.iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            if (cVar.b() == i) {
                return cVar;
            }
        }
        return null;
    }

    private boolean Q() {
        if (this.l) {
            return (p() == null && this.k.isEmpty()) ? false : true;
        }
        return false;
    }

    private void T() {
        if (this.m) {
            if (t) {
                Log.d("MediaRouteProviderProxy", this + ": Unbinding");
            }
            this.m = false;
            E();
            try {
                n().unbindService(this);
            } catch (IllegalArgumentException e2) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e2);
            }
        }
    }

    private void U() {
        if (Q()) {
            A();
        } else {
            T();
        }
    }

    private void z() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            ((c) this.k.get(i)).a(this.n);
        }
    }

    public boolean G(String str, String str2) {
        return this.i.getPackageName().equals(str) && this.i.getClassName().equals(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void H(a aVar, int i) {
        if (this.n == aVar) {
            c F = F(i);
            b bVar = this.s;
            if (bVar != null && (F instanceof vm4.e)) {
                bVar.a((vm4.e) F);
            }
            M(F);
        }
    }

    void I(a aVar, wm4 wm4Var) {
        if (this.n == aVar) {
            if (t) {
                Log.d("MediaRouteProviderProxy", this + ": Descriptor changed, descriptor=" + wm4Var);
            }
            w(wm4Var);
        }
    }

    void J(a aVar) {
        if (this.n == aVar) {
            if (t) {
                Log.d("MediaRouteProviderProxy", this + ": Service connection died");
            }
            E();
        }
    }

    void K(a aVar, String str) {
        if (this.n == aVar) {
            if (t) {
                Log.d("MediaRouteProviderProxy", this + ": Service connection error - " + str);
            }
            T();
        }
    }

    void L(a aVar) {
        if (this.n == aVar) {
            this.r = true;
            z();
            um4 p = p();
            if (p != null) {
                this.n.t(p);
            }
        }
    }

    void M(c cVar) {
        this.k.remove(cVar);
        cVar.c();
        U();
    }

    void N(a aVar, int i, sm4 sm4Var, List list) {
        if (this.n == aVar) {
            if (t) {
                Log.d("MediaRouteProviderProxy", this + ": DynamicRouteDescriptors changed, descriptors=" + list);
            }
            c F = F(i);
            if (F instanceof f) {
                ((f) F).q(sm4Var, list);
            }
        }
    }

    public void O() {
        if (this.n == null && Q()) {
            T();
            A();
        }
    }

    public void P(b bVar) {
        this.s = bVar;
    }

    public void R() {
        if (this.l) {
            return;
        }
        if (t) {
            Log.d("MediaRouteProviderProxy", this + ": Starting");
        }
        this.l = true;
        U();
    }

    public void S() {
        if (this.l) {
            if (t) {
                Log.d("MediaRouteProviderProxy", this + ": Stopping");
            }
            this.l = false;
            U();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z = t;
        if (z) {
            Log.d("MediaRouteProviderProxy", this + ": Connected");
        }
        if (this.m) {
            E();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (!xm4.a(messenger)) {
                Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
                return;
            }
            a aVar = new a(messenger);
            if (aVar.o()) {
                this.n = aVar;
            } else if (z) {
                Log.d("MediaRouteProviderProxy", this + ": Registration failed");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (t) {
            Log.d("MediaRouteProviderProxy", this + ": Service disconnected");
        }
        E();
    }

    @Override // defpackage.vm4
    public vm4.b r(String str) {
        if (str != null) {
            return B(str);
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Override // defpackage.vm4
    public vm4.e s(String str) {
        if (str != null) {
            return C(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // defpackage.vm4
    public vm4.e t(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return C(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public String toString() {
        return "Service connection " + this.i.flattenToShortString();
    }

    @Override // defpackage.vm4
    public void u(um4 um4Var) {
        if (this.r) {
            this.n.t(um4Var);
        }
        U();
    }
}
