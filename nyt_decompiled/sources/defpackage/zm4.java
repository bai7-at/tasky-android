package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import com.amazonaws.services.s3.model.InstructionFileId;
import defpackage.bw6;
import defpackage.km4;
import defpackage.ue8;
import defpackage.vm4;
import defpackage.xu6;
import defpackage.ym4;
import defpackage.zm4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class zm4 {
    static final boolean c = Log.isLoggable("MediaRouter", 3);
    static e d;
    final Context a;
    final ArrayList b = new ArrayList();

    public static abstract class b {
        public void a(zm4 zm4Var, g gVar) {
        }

        public void b(zm4 zm4Var, g gVar) {
        }

        public void c(zm4 zm4Var, g gVar) {
        }

        public void d(zm4 zm4Var, h hVar) {
        }

        public abstract void e(zm4 zm4Var, h hVar);

        public void f(zm4 zm4Var, h hVar) {
        }

        public void g(zm4 zm4Var, h hVar) {
        }

        public void h(zm4 zm4Var, h hVar) {
        }

        public void i(zm4 zm4Var, h hVar, int i) {
            h(zm4Var, hVar);
        }

        public void j(zm4 zm4Var, h hVar, int i, h hVar2) {
            i(zm4Var, hVar, i);
        }

        public void k(zm4 zm4Var, h hVar) {
        }

        public void l(zm4 zm4Var, h hVar, int i) {
            k(zm4Var, hVar);
        }

        public void m(zm4 zm4Var, h hVar) {
        }
    }

    private static final class c {
        public final zm4 a;
        public final b b;
        public ym4 c = ym4.c;
        public int d;

        public c(zm4 zm4Var, b bVar) {
            this.a = zm4Var;
            this.b = bVar;
        }

        public boolean a(h hVar, int i, h hVar2, int i2) {
            if ((this.d & 2) != 0 || hVar.D(this.c)) {
                return true;
            }
            if (zm4.n() && hVar.v() && i == 262 && i2 == 3 && hVar2 != null) {
                return !hVar2.v();
            }
            return false;
        }
    }

    public static abstract class d {
        public abstract void a(String str, Bundle bundle);

        public abstract void b(Bundle bundle);
    }

    private static final class e implements ue8.e, xu6.c {
        MediaSessionCompat A;
        private MediaSessionCompat B;
        final Context a;
        final boolean b;
        final km4 c;
        private final is1 l;
        final ue8 m;
        private final boolean n;
        private xu6 o;
        private h p;
        private h q;
        h r;
        vm4.e s;
        h t;
        vm4.e u;
        private um4 w;
        private um4 x;
        private int y;
        f z;
        final ArrayList d = new ArrayList();
        private final ArrayList e = new ArrayList();
        private final Map f = new HashMap();
        private final ArrayList g = new ArrayList();
        private final ArrayList h = new ArrayList();
        final bw6.b i = new bw6.b();
        private final C0564e j = new C0564e();
        final c k = new c();
        final Map v = new HashMap();
        private MediaSessionCompat.h C = new a();
        vm4.b.d D = new b();

        class a implements MediaSessionCompat.h {
            a() {
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.h
            public void a() {
                MediaSessionCompat mediaSessionCompat = e.this.A;
                if (mediaSessionCompat != null) {
                    if (mediaSessionCompat.f()) {
                        e eVar = e.this;
                        eVar.g(eVar.A.c());
                    } else {
                        e eVar2 = e.this;
                        eVar2.E(eVar2.A.c());
                    }
                }
            }
        }

        class b implements vm4.b.d {
            b() {
            }

            @Override // vm4.b.d
            public void a(vm4.b bVar, sm4 sm4Var, Collection collection) {
                e eVar = e.this;
                if (bVar != eVar.u || sm4Var == null) {
                    if (bVar == eVar.s) {
                        if (sm4Var != null) {
                            eVar.Q(eVar.r, sm4Var);
                        }
                        e.this.r.K(collection);
                        return;
                    }
                    return;
                }
                g p = eVar.t.p();
                String l = sm4Var.l();
                h hVar = new h(p, l, e.this.h(p, l));
                hVar.E(sm4Var);
                e eVar2 = e.this;
                if (eVar2.r == hVar) {
                    return;
                }
                eVar2.C(eVar2, hVar, eVar2.u, 3, eVar2.t, collection);
                e eVar3 = e.this;
                eVar3.t = null;
                eVar3.u = null;
            }
        }

        private final class c extends Handler {
            private final ArrayList a = new ArrayList();
            private final List b = new ArrayList();

            c() {
            }

            private void a(c cVar, int i, Object obj, int i2) {
                zm4 zm4Var = cVar.a;
                b bVar = cVar.b;
                int i3 = 65280 & i;
                if (i3 != 256) {
                    if (i3 != 512) {
                        return;
                    }
                    g gVar = (g) obj;
                    switch (i) {
                        case 513:
                            bVar.a(zm4Var, gVar);
                            break;
                        case 514:
                            bVar.c(zm4Var, gVar);
                            break;
                        case 515:
                            bVar.b(zm4Var, gVar);
                            break;
                    }
                }
                h hVar = (i == 264 || i == 262) ? (h) ((fo5) obj).b : (h) obj;
                h hVar2 = (i == 264 || i == 262) ? (h) ((fo5) obj).a : null;
                if (hVar == null || !cVar.a(hVar, i, hVar2, i2)) {
                    return;
                }
                switch (i) {
                    case 257:
                        bVar.d(zm4Var, hVar);
                        break;
                    case 258:
                        bVar.g(zm4Var, hVar);
                        break;
                    case 259:
                        bVar.e(zm4Var, hVar);
                        break;
                    case 260:
                        bVar.m(zm4Var, hVar);
                        break;
                    case 261:
                        bVar.f(zm4Var, hVar);
                        break;
                    case 262:
                        bVar.j(zm4Var, hVar, i2, hVar);
                        break;
                    case 263:
                        bVar.l(zm4Var, hVar, i2);
                        break;
                    case 264:
                        bVar.j(zm4Var, hVar, i2, hVar2);
                        break;
                }
            }

            private void d(int i, Object obj) {
                if (i == 262) {
                    h hVar = (h) ((fo5) obj).b;
                    e.this.m.D(hVar);
                    if (e.this.p == null || !hVar.v()) {
                        return;
                    }
                    Iterator it2 = this.b.iterator();
                    while (it2.hasNext()) {
                        e.this.m.C((h) it2.next());
                    }
                    this.b.clear();
                }
                if (i == 264) {
                    h hVar2 = (h) ((fo5) obj).b;
                    this.b.add(hVar2);
                    e.this.m.A(hVar2);
                    e.this.m.D(hVar2);
                    return;
                }
                switch (i) {
                    case 257:
                        e.this.m.A((h) obj);
                        break;
                    case 258:
                        e.this.m.C((h) obj);
                        break;
                    case 259:
                        e.this.m.B((h) obj);
                        break;
                }
            }

            public void b(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            public void c(int i, Object obj, int i2) {
                Message obtainMessage = obtainMessage(i, obj);
                obtainMessage.arg1 = i2;
                obtainMessage.sendToTarget();
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                Object obj = message.obj;
                int i2 = message.arg1;
                if (i == 259 && e.this.u().j().equals(((h) obj).j())) {
                    e.this.R(true);
                }
                d(i, obj);
                try {
                    int size = e.this.d.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        zm4 zm4Var = (zm4) ((WeakReference) e.this.d.get(size)).get();
                        if (zm4Var == null) {
                            e.this.d.remove(size);
                        } else {
                            this.a.addAll(zm4Var.b);
                        }
                    }
                    int size2 = this.a.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        a((c) this.a.get(i3), i, obj, i2);
                    }
                    this.a.clear();
                } catch (Throwable th) {
                    this.a.clear();
                    throw th;
                }
            }
        }

        private final class d extends km4.a {
            private d() {
            }

            @Override // km4.a
            public void a(vm4.e eVar) {
                if (eVar == e.this.s) {
                    d(2);
                } else if (zm4.c) {
                    Log.d("MediaRouter", "A RouteController unrelated to the selected route is released. controller=" + eVar);
                }
            }

            @Override // km4.a
            public void b(int i) {
                d(i);
            }

            @Override // km4.a
            public void c(String str, int i) {
                h hVar;
                Iterator it2 = e.this.t().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        hVar = null;
                        break;
                    }
                    hVar = (h) it2.next();
                    if (hVar.q() == e.this.c && TextUtils.equals(str, hVar.e())) {
                        break;
                    }
                }
                if (hVar != null) {
                    e.this.I(hVar, i);
                    return;
                }
                Log.w("MediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + str);
            }

            void d(int i) {
                h i2 = e.this.i();
                if (e.this.u() != i2) {
                    e.this.I(i2, i);
                }
            }
        }

        /* renamed from: zm4$e$e, reason: collision with other inner class name */
        private final class C0564e extends vm4.a {
            C0564e() {
            }

            @Override // vm4.a
            public void a(vm4 vm4Var, wm4 wm4Var) {
                e.this.P(vm4Var, wm4Var);
            }
        }

        private final class f implements bw6.c {
            private final bw6 a;
            private boolean b;

            public f(Object obj) {
                bw6 b = bw6.b(e.this.a, obj);
                this.a = b;
                b.d(this);
                e();
            }

            @Override // bw6.c
            public void a(int i) {
                h hVar;
                if (this.b || (hVar = e.this.r) == null) {
                    return;
                }
                hVar.F(i);
            }

            @Override // bw6.c
            public void b(int i) {
                h hVar;
                if (this.b || (hVar = e.this.r) == null) {
                    return;
                }
                hVar.G(i);
            }

            public void c() {
                this.b = true;
                this.a.d(null);
            }

            public Object d() {
                return this.a.a();
            }

            public void e() {
                this.a.c(e.this.i);
            }
        }

        e(Context context) {
            this.a = context;
            this.l = is1.a(context);
            this.n = x4.a((ActivityManager) context.getSystemService("activity"));
            if (Build.VERSION.SDK_INT >= 30) {
                this.b = wo4.a(context);
            } else {
                this.b = false;
            }
            if (this.b) {
                this.c = new km4(context, new d());
            } else {
                this.c = null;
            }
            this.m = ue8.z(context, this);
        }

        private void M(ym4 ym4Var, boolean z) {
            if (w()) {
                um4 um4Var = this.x;
                if (um4Var != null && um4Var.c().equals(ym4Var) && this.x.d() == z) {
                    return;
                }
                if (!ym4Var.f() || z) {
                    this.x = new um4(ym4Var, z);
                } else if (this.x == null) {
                    return;
                } else {
                    this.x = null;
                }
                if (zm4.c) {
                    Log.d("MediaRouter", "Updated MediaRoute2Provider's discovery request: " + this.x);
                }
                this.c.x(this.x);
            }
        }

        private void O(g gVar, wm4 wm4Var) {
            boolean z;
            if (gVar.h(wm4Var)) {
                int i = 0;
                if (wm4Var == null || !(wm4Var.c() || wm4Var == this.m.o())) {
                    Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + wm4Var);
                    z = false;
                } else {
                    List<sm4> b2 = wm4Var.b();
                    ArrayList<fo5> arrayList = new ArrayList();
                    ArrayList<fo5> arrayList2 = new ArrayList();
                    z = false;
                    for (sm4 sm4Var : b2) {
                        if (sm4Var == null || !sm4Var.x()) {
                            Log.w("MediaRouter", "Ignoring invalid system route descriptor: " + sm4Var);
                        } else {
                            String l = sm4Var.l();
                            int b3 = gVar.b(l);
                            if (b3 < 0) {
                                h hVar = new h(gVar, l, h(gVar, l));
                                int i2 = i + 1;
                                gVar.b.add(i, hVar);
                                this.e.add(hVar);
                                if (sm4Var.j().size() > 0) {
                                    arrayList.add(new fo5(hVar, sm4Var));
                                } else {
                                    hVar.E(sm4Var);
                                    if (zm4.c) {
                                        Log.d("MediaRouter", "Route added: " + hVar);
                                    }
                                    this.k.b(257, hVar);
                                }
                                i = i2;
                            } else if (b3 < i) {
                                Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: " + sm4Var);
                            } else {
                                h hVar2 = (h) gVar.b.get(b3);
                                int i3 = i + 1;
                                Collections.swap(gVar.b, b3, i);
                                if (sm4Var.j().size() > 0) {
                                    arrayList2.add(new fo5(hVar2, sm4Var));
                                } else if (Q(hVar2, sm4Var) != 0 && hVar2 == this.r) {
                                    z = true;
                                }
                                i = i3;
                            }
                        }
                    }
                    for (fo5 fo5Var : arrayList) {
                        h hVar3 = (h) fo5Var.a;
                        hVar3.E((sm4) fo5Var.b);
                        if (zm4.c) {
                            Log.d("MediaRouter", "Route added: " + hVar3);
                        }
                        this.k.b(257, hVar3);
                    }
                    for (fo5 fo5Var2 : arrayList2) {
                        h hVar4 = (h) fo5Var2.a;
                        if (Q(hVar4, (sm4) fo5Var2.b) != 0 && hVar4 == this.r) {
                            z = true;
                        }
                    }
                }
                for (int size = gVar.b.size() - 1; size >= i; size--) {
                    h hVar5 = (h) gVar.b.get(size);
                    hVar5.E(null);
                    this.e.remove(hVar5);
                }
                R(z);
                for (int size2 = gVar.b.size() - 1; size2 >= i; size2--) {
                    h hVar6 = (h) gVar.b.remove(size2);
                    if (zm4.c) {
                        Log.d("MediaRouter", "Route removed: " + hVar6);
                    }
                    this.k.b(258, hVar6);
                }
                if (zm4.c) {
                    Log.d("MediaRouter", "Provider changed: " + gVar);
                }
                this.k.b(515, gVar);
            }
        }

        private g j(vm4 vm4Var) {
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                if (((g) this.g.get(i)).a == vm4Var) {
                    return (g) this.g.get(i);
                }
            }
            return null;
        }

        private int k(Object obj) {
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                if (((f) this.h.get(i)).d() == obj) {
                    return i;
                }
            }
            return -1;
        }

        private int l(String str) {
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                if (((h) this.e.get(i)).c.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        private boolean y(h hVar) {
            return hVar.q() == this.m && hVar.b.equals("DEFAULT_ROUTE");
        }

        private boolean z(h hVar) {
            return hVar.q() == this.m && hVar.I("android.media.intent.category.LIVE_AUDIO") && !hVar.I("android.media.intent.category.LIVE_VIDEO");
        }

        boolean A() {
            return false;
        }

        void B() {
            if (this.r.x()) {
                List<h> k = this.r.k();
                HashSet hashSet = new HashSet();
                Iterator it2 = k.iterator();
                while (it2.hasNext()) {
                    hashSet.add(((h) it2.next()).c);
                }
                Iterator it3 = this.v.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    if (!hashSet.contains(entry.getKey())) {
                        vm4.e eVar = (vm4.e) entry.getValue();
                        eVar.h(0);
                        eVar.d();
                        it3.remove();
                    }
                }
                for (h hVar : k) {
                    if (!this.v.containsKey(hVar.c)) {
                        vm4.e t = hVar.q().t(hVar.b, this.r.b);
                        t.e();
                        this.v.put(hVar.c, t);
                    }
                }
            }
        }

        void C(e eVar, h hVar, vm4.e eVar2, int i, h hVar2, Collection collection) {
            f fVar = this.z;
            if (fVar != null) {
                fVar.b();
                this.z = null;
            }
            f fVar2 = new f(eVar, hVar, eVar2, i, hVar2, collection);
            this.z = fVar2;
            fVar2.d();
        }

        void D(h hVar) {
            if (!(this.s instanceof vm4.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.a o = o(hVar);
            if (this.r.k().contains(hVar) && o != null && o.d()) {
                if (this.r.k().size() <= 1) {
                    Log.w("MediaRouter", "Ignoring attempt to remove the last member route.");
                    return;
                } else {
                    ((vm4.b) this.s).n(hVar.e());
                    return;
                }
            }
            Log.w("MediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + hVar);
        }

        public void E(Object obj) {
            int k = k(obj);
            if (k >= 0) {
                ((f) this.h.remove(k)).c();
            }
        }

        public void F(h hVar, int i) {
            vm4.e eVar;
            vm4.e eVar2;
            if (hVar == this.r && (eVar2 = this.s) != null) {
                eVar2.f(i);
            } else {
                if (this.v.isEmpty() || (eVar = (vm4.e) this.v.get(hVar.c)) == null) {
                    return;
                }
                eVar.f(i);
            }
        }

        public void G(h hVar, int i) {
            vm4.e eVar;
            vm4.e eVar2;
            if (hVar == this.r && (eVar2 = this.s) != null) {
                eVar2.i(i);
            } else {
                if (this.v.isEmpty() || (eVar = (vm4.e) this.v.get(hVar.c)) == null) {
                    return;
                }
                eVar.i(i);
            }
        }

        void H(h hVar, int i) {
            if (!this.e.contains(hVar)) {
                Log.w("MediaRouter", "Ignoring attempt to select removed route: " + hVar);
                return;
            }
            if (!hVar.g) {
                Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + hVar);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                vm4 q = hVar.q();
                km4 km4Var = this.c;
                if (q == km4Var && this.r != hVar) {
                    km4Var.G(hVar.e());
                    return;
                }
            }
            I(hVar, i);
        }

        void I(h hVar, int i) {
            if (zm4.d == null || (this.q != null && hVar.u())) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 3; i2 < stackTrace.length; i2++) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    sb.append(stackTraceElement.getClassName());
                    sb.append(InstructionFileId.DOT);
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(":");
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append("  ");
                }
                if (zm4.d == null) {
                    Log.w("MediaRouter", "setSelectedRouteInternal is called while sGlobal is null: pkgName=" + this.a.getPackageName() + ", callers=" + sb.toString());
                } else {
                    Log.w("MediaRouter", "Default route is selected while a BT route is available: pkgName=" + this.a.getPackageName() + ", callers=" + sb.toString());
                }
            }
            if (this.r == hVar) {
                return;
            }
            if (this.t != null) {
                this.t = null;
                vm4.e eVar = this.u;
                if (eVar != null) {
                    eVar.h(3);
                    this.u.d();
                    this.u = null;
                }
            }
            if (w() && hVar.p().g()) {
                vm4.b r = hVar.q().r(hVar.b);
                if (r != null) {
                    r.p(mx0.h(this.a), this.D);
                    this.t = hVar;
                    this.u = r;
                    r.e();
                    return;
                }
                Log.w("MediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + hVar);
            }
            vm4.e s = hVar.q().s(hVar.b);
            if (s != null) {
                s.e();
            }
            if (zm4.c) {
                Log.d("MediaRouter", "Route selected: " + hVar);
            }
            if (this.r != null) {
                C(this, hVar, s, i, null, null);
                return;
            }
            this.r = hVar;
            this.s = s;
            this.k.c(262, new fo5(null, hVar), i);
        }

        public void J() {
            a(this.m);
            km4 km4Var = this.c;
            if (km4Var != null) {
                a(km4Var);
            }
            xu6 xu6Var = new xu6(this.a, this);
            this.o = xu6Var;
            xu6Var.i();
        }

        void K(h hVar) {
            if (!(this.s instanceof vm4.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.a o = o(hVar);
            if (o == null || !o.c()) {
                Log.w("MediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
            } else {
                ((vm4.b) this.s).o(Collections.singletonList(hVar.e()));
            }
        }

        public void L() {
            ym4.a aVar = new ym4.a();
            int size = this.d.size();
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                zm4 zm4Var = (zm4) ((WeakReference) this.d.get(size)).get();
                if (zm4Var == null) {
                    this.d.remove(size);
                } else {
                    int size2 = zm4Var.b.size();
                    i += size2;
                    for (int i2 = 0; i2 < size2; i2++) {
                        c cVar = (c) zm4Var.b.get(i2);
                        aVar.c(cVar.c);
                        int i3 = cVar.d;
                        if ((i3 & 1) != 0) {
                            z = true;
                            z2 = true;
                        }
                        if ((i3 & 4) != 0 && !this.n) {
                            z = true;
                        }
                        if ((i3 & 8) != 0) {
                            z = true;
                        }
                    }
                }
            }
            this.y = i;
            ym4 d2 = z ? aVar.d() : ym4.c;
            M(aVar.d(), z2);
            um4 um4Var = this.w;
            if (um4Var != null && um4Var.c().equals(d2) && this.w.d() == z2) {
                return;
            }
            if (!d2.f() || z2) {
                this.w = new um4(d2, z2);
            } else if (this.w == null) {
                return;
            } else {
                this.w = null;
            }
            if (zm4.c) {
                Log.d("MediaRouter", "Updated discovery request: " + this.w);
            }
            if (z && !z2 && this.n) {
                Log.i("MediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
            }
            int size3 = this.g.size();
            for (int i4 = 0; i4 < size3; i4++) {
                vm4 vm4Var = ((g) this.g.get(i4)).a;
                if (vm4Var != this.c) {
                    vm4Var.x(this.w);
                }
            }
        }

        void N() {
            h hVar = this.r;
            if (hVar != null) {
                this.i.a = hVar.r();
                this.i.b = this.r.t();
                this.i.c = this.r.s();
                this.i.d = this.r.m();
                this.i.e = this.r.n();
                if (this.b && this.r.q() == this.c) {
                    this.i.f = km4.C(this.s);
                } else {
                    this.i.f = null;
                }
                int size = this.h.size();
                for (int i = 0; i < size; i++) {
                    ((f) this.h.get(i)).e();
                }
            }
        }

        void P(vm4 vm4Var, wm4 wm4Var) {
            g j = j(vm4Var);
            if (j != null) {
                O(j, wm4Var);
            }
        }

        int Q(h hVar, sm4 sm4Var) {
            int E = hVar.E(sm4Var);
            if (E != 0) {
                if ((E & 1) != 0) {
                    if (zm4.c) {
                        Log.d("MediaRouter", "Route changed: " + hVar);
                    }
                    this.k.b(259, hVar);
                }
                if ((E & 2) != 0) {
                    if (zm4.c) {
                        Log.d("MediaRouter", "Route volume changed: " + hVar);
                    }
                    this.k.b(260, hVar);
                }
                if ((E & 4) != 0) {
                    if (zm4.c) {
                        Log.d("MediaRouter", "Route presentation display changed: " + hVar);
                    }
                    this.k.b(261, hVar);
                }
            }
            return E;
        }

        void R(boolean z) {
            h hVar = this.p;
            if (hVar != null && !hVar.A()) {
                Log.i("MediaRouter", "Clearing the default route because it is no longer selectable: " + this.p);
                this.p = null;
            }
            if (this.p == null && !this.e.isEmpty()) {
                Iterator it2 = this.e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    h hVar2 = (h) it2.next();
                    if (y(hVar2) && hVar2.A()) {
                        this.p = hVar2;
                        Log.i("MediaRouter", "Found default route: " + this.p);
                        break;
                    }
                }
            }
            h hVar3 = this.q;
            if (hVar3 != null && !hVar3.A()) {
                Log.i("MediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.q);
                this.q = null;
            }
            if (this.q == null && !this.e.isEmpty()) {
                Iterator it3 = this.e.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    h hVar4 = (h) it3.next();
                    if (z(hVar4) && hVar4.A()) {
                        this.q = hVar4;
                        Log.i("MediaRouter", "Found bluetooth route: " + this.q);
                        break;
                    }
                }
            }
            h hVar5 = this.r;
            if (hVar5 != null && hVar5.w()) {
                if (z) {
                    B();
                    N();
                    return;
                }
                return;
            }
            Log.i("MediaRouter", "Unselecting the current route because it is no longer selectable: " + this.r);
            I(i(), 0);
        }

        @Override // xu6.c
        public void a(vm4 vm4Var) {
            if (j(vm4Var) == null) {
                g gVar = new g(vm4Var);
                this.g.add(gVar);
                if (zm4.c) {
                    Log.d("MediaRouter", "Provider added: " + gVar);
                }
                this.k.b(513, gVar);
                O(gVar, vm4Var.o());
                vm4Var.v(this.j);
                vm4Var.x(this.w);
            }
        }

        @Override // xu6.c
        public void b(vm4 vm4Var) {
            g j = j(vm4Var);
            if (j != null) {
                vm4Var.v(null);
                vm4Var.x(null);
                O(j, null);
                if (zm4.c) {
                    Log.d("MediaRouter", "Provider removed: " + j);
                }
                this.k.b(514, j);
                this.g.remove(j);
            }
        }

        @Override // ue8.e
        public void c(String str) {
            h a2;
            this.k.removeMessages(262);
            g j = j(this.m);
            if (j == null || (a2 = j.a(str)) == null) {
                return;
            }
            a2.H();
        }

        @Override // xu6.c
        public void d(uu6 uu6Var, vm4.e eVar) {
            if (this.s == eVar) {
                H(i(), 2);
            }
        }

        void f(h hVar) {
            if (!(this.s instanceof vm4.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.a o = o(hVar);
            if (!this.r.k().contains(hVar) && o != null && o.b()) {
                ((vm4.b) this.s).m(hVar.e());
                return;
            }
            Log.w("MediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + hVar);
        }

        public void g(Object obj) {
            if (k(obj) < 0) {
                this.h.add(new f(obj));
            }
        }

        String h(g gVar, String str) {
            String flattenToShortString = gVar.c().flattenToShortString();
            String str2 = flattenToShortString + ":" + str;
            if (l(str2) < 0) {
                this.f.put(new fo5(flattenToShortString, str), str2);
                return str2;
            }
            Log.w("MediaRouter", "Either " + str + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route");
            int i = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i));
                if (l(format) < 0) {
                    this.f.put(new fo5(flattenToShortString, str), format);
                    return format;
                }
                i++;
            }
        }

        h i() {
            Iterator it2 = this.e.iterator();
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                if (hVar != this.p && z(hVar) && hVar.A()) {
                    return hVar;
                }
            }
            return this.p;
        }

        int m() {
            return this.y;
        }

        h n() {
            h hVar = this.p;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        h.a o(h hVar) {
            return this.r.h(hVar);
        }

        public MediaSessionCompat.Token p() {
            MediaSessionCompat mediaSessionCompat = this.B;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.d();
            }
            return null;
        }

        public h q(String str) {
            Iterator it2 = this.e.iterator();
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                if (hVar.c.equals(str)) {
                    return hVar;
                }
            }
            return null;
        }

        public zm4 r(Context context) {
            int size = this.d.size();
            while (true) {
                size--;
                if (size < 0) {
                    zm4 zm4Var = new zm4(context);
                    this.d.add(new WeakReference(zm4Var));
                    return zm4Var;
                }
                zm4 zm4Var2 = (zm4) ((WeakReference) this.d.get(size)).get();
                if (zm4Var2 == null) {
                    this.d.remove(size);
                } else if (zm4Var2.a == context) {
                    return zm4Var2;
                }
            }
        }

        tn4 s() {
            return null;
        }

        public List t() {
            return this.e;
        }

        h u() {
            h hVar = this.r;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        String v(g gVar, String str) {
            return (String) this.f.get(new fo5(gVar.c().flattenToShortString(), str));
        }

        boolean w() {
            return this.b;
        }

        public boolean x(ym4 ym4Var, int i) {
            if (ym4Var.f()) {
                return false;
            }
            if ((i & 2) == 0 && this.n) {
                return true;
            }
            int size = this.e.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = (h) this.e.get(i2);
                if (((i & 1) == 0 || !hVar.v()) && hVar.D(ym4Var)) {
                    return true;
                }
            }
            return false;
        }
    }

    static final class f {
        final vm4.e a;
        final int b;
        private final h c;
        final h d;
        private final h e;
        final List f;
        private final WeakReference g;
        private j64 h = null;
        private boolean i = false;
        private boolean j = false;

        f(e eVar, h hVar, vm4.e eVar2, int i, h hVar2, Collection collection) {
            this.g = new WeakReference(eVar);
            this.d = hVar;
            this.a = eVar2;
            this.b = i;
            this.c = eVar.r;
            this.e = hVar2;
            this.f = collection != null ? new ArrayList(collection) : null;
            eVar.k.postDelayed(new Runnable() { // from class: an4
                @Override // java.lang.Runnable
                public final void run() {
                    zm4.f.this.d();
                }
            }, 15000L);
        }

        private void e() {
            e eVar = (e) this.g.get();
            if (eVar == null) {
                return;
            }
            h hVar = this.d;
            eVar.r = hVar;
            eVar.s = this.a;
            h hVar2 = this.e;
            if (hVar2 == null) {
                eVar.k.c(262, new fo5(this.c, hVar), this.b);
            } else {
                eVar.k.c(264, new fo5(hVar2, hVar), this.b);
            }
            eVar.v.clear();
            eVar.B();
            eVar.N();
            List list = this.f;
            if (list != null) {
                eVar.r.K(list);
            }
        }

        private void f() {
            e eVar = (e) this.g.get();
            if (eVar != null) {
                h hVar = eVar.r;
                h hVar2 = this.c;
                if (hVar != hVar2) {
                    return;
                }
                eVar.k.c(263, hVar2, this.b);
                vm4.e eVar2 = eVar.s;
                if (eVar2 != null) {
                    eVar2.h(this.b);
                    eVar.s.d();
                }
                if (!eVar.v.isEmpty()) {
                    for (vm4.e eVar3 : eVar.v.values()) {
                        eVar3.h(this.b);
                        eVar3.d();
                    }
                    eVar.v.clear();
                }
                eVar.s = null;
            }
        }

        void b() {
            if (this.i || this.j) {
                return;
            }
            this.j = true;
            vm4.e eVar = this.a;
            if (eVar != null) {
                eVar.h(0);
                this.a.d();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d() {
            j64 j64Var;
            zm4.d();
            if (this.i || this.j) {
                return;
            }
            e eVar = (e) this.g.get();
            if (eVar == null || eVar.z != this || ((j64Var = this.h) != null && j64Var.isCancelled())) {
                b();
                return;
            }
            this.i = true;
            eVar.z = null;
            f();
            e();
        }
    }

    public static final class g {
        final vm4 a;
        final List b = new ArrayList();
        private final vm4.d c;
        private wm4 d;

        g(vm4 vm4Var) {
            this.a = vm4Var;
            this.c = vm4Var.q();
        }

        h a(String str) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (((h) this.b.get(i)).b.equals(str)) {
                    return (h) this.b.get(i);
                }
            }
            return null;
        }

        int b(String str) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (((h) this.b.get(i)).b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public ComponentName c() {
            return this.c.a();
        }

        public String d() {
            return this.c.b();
        }

        public vm4 e() {
            zm4.d();
            return this.a;
        }

        public List f() {
            zm4.d();
            return Collections.unmodifiableList(this.b);
        }

        boolean g() {
            wm4 wm4Var = this.d;
            return wm4Var != null && wm4Var.d();
        }

        boolean h(wm4 wm4Var) {
            if (this.d == wm4Var) {
                return false;
            }
            this.d = wm4Var;
            return true;
        }

        public String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + d() + " }";
        }
    }

    public static class h {
        private final g a;
        final String b;
        final String c;
        private String d;
        private String e;
        private Uri f;
        boolean g;
        private int h;
        private boolean i;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private Display q;
        private Bundle s;
        private IntentSender t;
        sm4 u;
        private Map w;
        private final ArrayList j = new ArrayList();
        private int r = -1;
        private List v = new ArrayList();

        public static final class a {
            final vm4.b.c a;

            a(vm4.b.c cVar) {
                this.a = cVar;
            }

            public int a() {
                vm4.b.c cVar = this.a;
                if (cVar != null) {
                    return cVar.c();
                }
                return 1;
            }

            public boolean b() {
                vm4.b.c cVar = this.a;
                return cVar != null && cVar.d();
            }

            public boolean c() {
                vm4.b.c cVar = this.a;
                return cVar != null && cVar.e();
            }

            public boolean d() {
                vm4.b.c cVar = this.a;
                return cVar == null || cVar.f();
            }
        }

        h(g gVar, String str, String str2) {
            this.a = gVar;
            this.b = str;
            this.c = str2;
        }

        private static boolean C(h hVar) {
            return TextUtils.equals(hVar.q().q().b(), "android");
        }

        private boolean y(IntentFilter intentFilter, IntentFilter intentFilter2) {
            int countActions;
            if (intentFilter == intentFilter2) {
                return true;
            }
            if (intentFilter == null || intentFilter2 == null || (countActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                return false;
            }
            for (int i = 0; i < countActions; i++) {
                if (!intentFilter.getAction(i).equals(intentFilter2.getAction(i))) {
                    return false;
                }
            }
            int countCategories = intentFilter.countCategories();
            if (countCategories != intentFilter2.countCategories()) {
                return false;
            }
            for (int i2 = 0; i2 < countCategories; i2++) {
                if (!intentFilter.getCategory(i2).equals(intentFilter2.getCategory(i2))) {
                    return false;
                }
            }
            return true;
        }

        private boolean z(List list, List list2) {
            if (list == list2) {
                return true;
            }
            if (list == null || list2 == null) {
                return false;
            }
            ListIterator listIterator = list.listIterator();
            ListIterator listIterator2 = list2.listIterator();
            while (listIterator.hasNext() && listIterator2.hasNext()) {
                if (!y((IntentFilter) listIterator.next(), (IntentFilter) listIterator2.next())) {
                    return false;
                }
            }
            return (listIterator.hasNext() || listIterator2.hasNext()) ? false : true;
        }

        boolean A() {
            return this.u != null && this.g;
        }

        public boolean B() {
            zm4.d();
            return zm4.d.u() == this;
        }

        public boolean D(ym4 ym4Var) {
            if (ym4Var == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            zm4.d();
            return ym4Var.h(this.j);
        }

        int E(sm4 sm4Var) {
            if (this.u != sm4Var) {
                return J(sm4Var);
            }
            return 0;
        }

        public void F(int i) {
            zm4.d();
            zm4.d.F(this, Math.min(this.p, Math.max(0, i)));
        }

        public void G(int i) {
            zm4.d();
            if (i != 0) {
                zm4.d.G(this, i);
            }
        }

        public void H() {
            zm4.d();
            zm4.d.H(this, 3);
        }

        public boolean I(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            zm4.d();
            int size = this.j.size();
            for (int i = 0; i < size; i++) {
                if (((IntentFilter) this.j.get(i)).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        int J(sm4 sm4Var) {
            int i;
            this.u = sm4Var;
            if (sm4Var == null) {
                return 0;
            }
            if (ic5.a(this.d, sm4Var.o())) {
                i = 0;
            } else {
                this.d = sm4Var.o();
                i = 1;
            }
            if (!ic5.a(this.e, sm4Var.g())) {
                this.e = sm4Var.g();
                i = 1;
            }
            if (!ic5.a(this.f, sm4Var.k())) {
                this.f = sm4Var.k();
                i = 1;
            }
            if (this.g != sm4Var.w()) {
                this.g = sm4Var.w();
                i = 1;
            }
            if (this.h != sm4Var.e()) {
                this.h = sm4Var.e();
                i = 1;
            }
            if (!z(this.j, sm4Var.f())) {
                this.j.clear();
                this.j.addAll(sm4Var.f());
                i = 1;
            }
            if (this.k != sm4Var.q()) {
                this.k = sm4Var.q();
                i = 1;
            }
            if (this.l != sm4Var.p()) {
                this.l = sm4Var.p();
                i = 1;
            }
            if (this.m != sm4Var.h()) {
                this.m = sm4Var.h();
                i = 1;
            }
            int i2 = 3;
            if (this.n != sm4Var.u()) {
                this.n = sm4Var.u();
                i = 3;
            }
            if (this.o != sm4Var.t()) {
                this.o = sm4Var.t();
                i = 3;
            }
            if (this.p != sm4Var.v()) {
                this.p = sm4Var.v();
            } else {
                i2 = i;
            }
            if (this.r != sm4Var.r()) {
                this.r = sm4Var.r();
                this.q = null;
                i2 |= 5;
            }
            if (!ic5.a(this.s, sm4Var.i())) {
                this.s = sm4Var.i();
                i2 |= 1;
            }
            if (!ic5.a(this.t, sm4Var.s())) {
                this.t = sm4Var.s();
                i2 |= 1;
            }
            if (this.i != sm4Var.a()) {
                this.i = sm4Var.a();
                i2 |= 5;
            }
            List j = sm4Var.j();
            ArrayList arrayList = new ArrayList();
            boolean z = j.size() != this.v.size();
            Iterator it2 = j.iterator();
            while (it2.hasNext()) {
                h q = zm4.d.q(zm4.d.v(p(), (String) it2.next()));
                if (q != null) {
                    arrayList.add(q);
                    if (!z && !this.v.contains(q)) {
                        z = true;
                    }
                }
            }
            if (!z) {
                return i2;
            }
            this.v = arrayList;
            return i2 | 1;
        }

        void K(Collection collection) {
            this.v.clear();
            if (this.w == null) {
                this.w = new so();
            }
            this.w.clear();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                vm4.b.c cVar = (vm4.b.c) it2.next();
                h b = b(cVar);
                if (b != null) {
                    this.w.put(b.c, cVar);
                    if (cVar.c() == 2 || cVar.c() == 3) {
                        this.v.add(b);
                    }
                }
            }
            zm4.d.k.b(259, this);
        }

        public boolean a() {
            return this.i;
        }

        h b(vm4.b.c cVar) {
            return p().a(cVar.b().l());
        }

        public int c() {
            return this.h;
        }

        public String d() {
            return this.e;
        }

        String e() {
            return this.b;
        }

        public int f() {
            return this.m;
        }

        public vm4.b g() {
            vm4.e eVar = zm4.d.s;
            if (eVar instanceof vm4.b) {
                return (vm4.b) eVar;
            }
            return null;
        }

        public a h(h hVar) {
            Map map = this.w;
            if (map == null || !map.containsKey(hVar.c)) {
                return null;
            }
            return new a((vm4.b.c) this.w.get(hVar.c));
        }

        public Uri i() {
            return this.f;
        }

        public String j() {
            return this.c;
        }

        public List k() {
            return Collections.unmodifiableList(this.v);
        }

        public String l() {
            return this.d;
        }

        public int m() {
            return this.l;
        }

        public int n() {
            return this.k;
        }

        public int o() {
            return this.r;
        }

        public g p() {
            return this.a;
        }

        public vm4 q() {
            return this.a.e();
        }

        public int r() {
            return this.o;
        }

        public int s() {
            return this.n;
        }

        public int t() {
            return this.p;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaRouter.RouteInfo{ uniqueId=" + this.c + ", name=" + this.d + ", description=" + this.e + ", iconUri=" + this.f + ", enabled=" + this.g + ", connectionState=" + this.h + ", canDisconnect=" + this.i + ", playbackType=" + this.k + ", playbackStream=" + this.l + ", deviceType=" + this.m + ", volumeHandling=" + this.n + ", volume=" + this.o + ", volumeMax=" + this.p + ", presentationDisplayId=" + this.r + ", extras=" + this.s + ", settingsIntent=" + this.t + ", providerPackageName=" + this.a.d());
            if (x()) {
                sb.append(", members=[");
                int size = this.v.size();
                for (int i = 0; i < size; i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    if (this.v.get(i) != this) {
                        sb.append(((h) this.v.get(i)).j());
                    }
                }
                sb.append(']');
            }
            sb.append(" }");
            return sb.toString();
        }

        public boolean u() {
            zm4.d();
            return zm4.d.n() == this;
        }

        public boolean v() {
            if (u() || this.m == 3) {
                return true;
            }
            return C(this) && I("android.media.intent.category.LIVE_AUDIO") && !I("android.media.intent.category.LIVE_VIDEO");
        }

        public boolean w() {
            return this.g;
        }

        public boolean x() {
            return k().size() >= 1;
        }
    }

    zm4(Context context) {
        this.a = context;
    }

    static void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    private int e(b bVar) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (((c) this.b.get(i)).b == bVar) {
                return i;
            }
        }
        return -1;
    }

    static int f() {
        e eVar = d;
        if (eVar == null) {
            return 0;
        }
        return eVar.m();
    }

    public static zm4 g(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        d();
        if (d == null) {
            e eVar = new e(context.getApplicationContext());
            d = eVar;
            eVar.J();
        }
        return d.r(context);
    }

    public static boolean l() {
        e eVar = d;
        if (eVar == null) {
            return false;
        }
        return eVar.w();
    }

    static boolean n() {
        e eVar = d;
        if (eVar == null) {
            return false;
        }
        return eVar.A();
    }

    public void a(ym4 ym4Var, b bVar) {
        b(ym4Var, bVar, 0);
    }

    public void b(ym4 ym4Var, b bVar, int i) {
        c cVar;
        boolean z;
        if (ym4Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        d();
        if (c) {
            Log.d("MediaRouter", "addCallback: selector=" + ym4Var + ", callback=" + bVar + ", flags=" + Integer.toHexString(i));
        }
        int e2 = e(bVar);
        if (e2 < 0) {
            cVar = new c(this, bVar);
            this.b.add(cVar);
        } else {
            cVar = (c) this.b.get(e2);
        }
        boolean z2 = true;
        if (i != cVar.d) {
            cVar.d = i;
            z = true;
        } else {
            z = false;
        }
        if (cVar.c.b(ym4Var)) {
            z2 = z;
        } else {
            cVar.c = new ym4.a(cVar.c).c(ym4Var).d();
        }
        if (z2) {
            d.L();
        }
    }

    public void c(h hVar) {
        d();
        d.f(hVar);
    }

    public MediaSessionCompat.Token h() {
        return d.p();
    }

    public tn4 i() {
        d();
        d.s();
        return null;
    }

    public List j() {
        d();
        return d.t();
    }

    public h k() {
        d();
        return d.u();
    }

    public boolean m(ym4 ym4Var, int i) {
        if (ym4Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        d();
        return d.x(ym4Var, i);
    }

    public void o(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        d();
        if (c) {
            Log.d("MediaRouter", "removeCallback: callback=" + bVar);
        }
        int e2 = e(bVar);
        if (e2 >= 0) {
            this.b.remove(e2);
            d.L();
        }
    }

    public void p(h hVar) {
        d();
        d.D(hVar);
    }

    public void q(h hVar) {
        d();
        d.K(hVar);
    }

    public void r(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        d();
        h i2 = d.i();
        if (d.u() != i2) {
            d.H(i2, i);
        }
    }
}
