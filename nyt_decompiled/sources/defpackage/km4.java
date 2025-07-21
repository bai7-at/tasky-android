package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.MediaRouter2$TransferCallback;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.SparseArray;
import defpackage.km4;
import defpackage.sm4;
import defpackage.vm4;
import defpackage.wm4;
import defpackage.ym4;
import defpackage.zm4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
class km4 extends vm4 {
    static final boolean w = Log.isLoggable("MR2Provider", 3);
    final MediaRouter2 i;
    final a j;
    final Map k;
    private final MediaRouter2$RouteCallback l;
    private final MediaRouter2$TransferCallback m;
    private final MediaRouter2$ControllerCallback n;
    private final Handler r;
    private final Executor s;
    private List t;
    private Map u;

    static abstract class a {
        a() {
        }

        public abstract void a(vm4.e eVar);

        public abstract void b(int i);

        public abstract void c(String str, int i);
    }

    private class b extends MediaRouter2$ControllerCallback {
        b() {
        }

        public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
            km4.this.F(routingController);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c extends vm4.b {
        final String f;
        final MediaRouter2.RoutingController g;
        final Messenger h;
        final Messenger i;
        final Handler k;
        sm4 o;
        final SparseArray j = new SparseArray();
        AtomicInteger l = new AtomicInteger(1);
        private final Runnable m = new Runnable() { // from class: qm4
            @Override // java.lang.Runnable
            public final void run() {
                km4.c.this.s();
            }
        };
        int n = -1;

        class a extends Handler {
            a() {
                super(Looper.getMainLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                int i2 = message.arg1;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                zm4.d dVar = (zm4.d) c.this.j.get(i2);
                if (dVar == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                c.this.j.remove(i2);
                if (i == 3) {
                    dVar.b((Bundle) obj);
                } else {
                    if (i != 4) {
                        return;
                    }
                    dVar.a(peekData == null ? null : peekData.getString("error"), (Bundle) obj);
                }
            }
        }

        c(MediaRouter2.RoutingController routingController, String str) {
            this.g = routingController;
            this.f = str;
            Messenger A = km4.A(routingController);
            this.h = A;
            this.i = A == null ? null : new Messenger(new a());
            this.k = new Handler(Looper.getMainLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s() {
            this.n = -1;
        }

        private void t() {
            this.k.removeCallbacks(this.m);
            this.k.postDelayed(this.m, 1000L);
        }

        @Override // vm4.e
        public void d() {
            this.g.release();
        }

        @Override // vm4.e
        public void f(int i) {
            MediaRouter2.RoutingController routingController = this.g;
            if (routingController == null) {
                return;
            }
            routingController.setVolume(i);
            this.n = i;
            t();
        }

        @Override // vm4.e
        public void i(int i) {
            int volumeMax;
            MediaRouter2.RoutingController routingController = this.g;
            if (routingController == null) {
                return;
            }
            int i2 = this.n;
            if (i2 < 0) {
                i2 = routingController.getVolume();
            }
            int i3 = i2 + i;
            volumeMax = this.g.getVolumeMax();
            int max = Math.max(0, Math.min(i3, volumeMax));
            this.n = max;
            this.g.setVolume(max);
            t();
        }

        @Override // vm4.b
        public void m(String str) {
            if (str == null || str.isEmpty()) {
                Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
                return;
            }
            MediaRoute2Info B = km4.this.B(str);
            if (B != null) {
                this.g.selectRoute(B);
                return;
            }
            Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=" + str);
        }

        @Override // vm4.b
        public void n(String str) {
            if (str == null || str.isEmpty()) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
                return;
            }
            MediaRoute2Info B = km4.this.B(str);
            if (B != null) {
                this.g.deselectRoute(B);
                return;
            }
            Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=" + str);
        }

        @Override // vm4.b
        public void o(List list) {
            if (list == null || list.isEmpty()) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
                return;
            }
            String str = (String) list.get(0);
            MediaRoute2Info B = km4.this.B(str);
            if (B != null) {
                km4.this.i.transferTo(B);
                return;
            }
            Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
        }

        public String r() {
            String id;
            sm4 sm4Var = this.o;
            if (sm4Var != null) {
                return sm4Var.l();
            }
            id = this.g.getId();
            return id;
        }

        void u(sm4 sm4Var) {
            this.o = sm4Var;
        }

        void v(String str, int i) {
            boolean isReleased;
            MediaRouter2.RoutingController routingController = this.g;
            if (routingController != null) {
                isReleased = routingController.isReleased();
                if (isReleased || this.h == null) {
                    return;
                }
                int andIncrement = this.l.getAndIncrement();
                Message obtain = Message.obtain();
                obtain.what = 7;
                obtain.arg1 = andIncrement;
                Bundle bundle = new Bundle();
                bundle.putInt("volume", i);
                bundle.putString("routeId", str);
                obtain.setData(bundle);
                obtain.replyTo = this.i;
                try {
                    this.h.send(obtain);
                } catch (DeadObjectException unused) {
                } catch (RemoteException e) {
                    Log.e("MR2Provider", "Could not send control request to service.", e);
                }
            }
        }

        void w(String str, int i) {
            boolean isReleased;
            MediaRouter2.RoutingController routingController = this.g;
            if (routingController != null) {
                isReleased = routingController.isReleased();
                if (isReleased || this.h == null) {
                    return;
                }
                int andIncrement = this.l.getAndIncrement();
                Message obtain = Message.obtain();
                obtain.what = 8;
                obtain.arg1 = andIncrement;
                Bundle bundle = new Bundle();
                bundle.putInt("volume", i);
                bundle.putString("routeId", str);
                obtain.setData(bundle);
                obtain.replyTo = this.i;
                try {
                    this.h.send(obtain);
                } catch (DeadObjectException unused) {
                } catch (RemoteException e) {
                    Log.e("MR2Provider", "Could not send control request to service.", e);
                }
            }
        }
    }

    private class d extends vm4.e {
        final String a;
        final c b;

        d(String str, c cVar) {
            this.a = str;
            this.b = cVar;
        }

        @Override // vm4.e
        public void f(int i) {
            c cVar;
            String str = this.a;
            if (str == null || (cVar = this.b) == null) {
                return;
            }
            cVar.v(str, i);
        }

        @Override // vm4.e
        public void i(int i) {
            c cVar;
            String str = this.a;
            if (str == null || (cVar = this.b) == null) {
                return;
            }
            cVar.w(str, i);
        }
    }

    private class e extends MediaRouter2$RouteCallback {
        e() {
        }

        public void onRoutesAdded(List list) {
            km4.this.E();
        }

        public void onRoutesChanged(List list) {
            km4.this.E();
        }

        public void onRoutesRemoved(List list) {
            km4.this.E();
        }
    }

    private class f extends MediaRouter2$TransferCallback {
        f() {
        }

        public void onStop(MediaRouter2.RoutingController routingController) {
            vm4.e eVar = (vm4.e) km4.this.k.remove(routingController);
            if (eVar != null) {
                km4.this.j.a(eVar);
                return;
            }
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
        }

        public void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
            MediaRouter2.RoutingController systemController;
            List selectedRoutes;
            String id;
            km4.this.k.remove(routingController);
            systemController = km4.this.i.getSystemController();
            if (routingController2 == systemController) {
                km4.this.j.b(3);
                return;
            }
            selectedRoutes = routingController2.getSelectedRoutes();
            if (selectedRoutes.isEmpty()) {
                Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
                return;
            }
            id = ml4.a(selectedRoutes.get(0)).getId();
            km4.this.k.put(routingController2, km4.this.new c(routingController2, id));
            km4.this.j.c(id, 3);
            km4.this.F(routingController2);
        }

        public void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
            Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
        }
    }

    km4(Context context, a aVar) {
        super(context);
        MediaRouter2 mediaRouter2;
        this.k = new ArrayMap();
        this.l = new e();
        this.m = new f();
        this.n = new b();
        this.t = new ArrayList();
        this.u = new ArrayMap();
        mediaRouter2 = MediaRouter2.getInstance(context);
        this.i = mediaRouter2;
        this.j = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.r = handler;
        Objects.requireNonNull(handler);
        this.s = new gm4(handler);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
    
        r1 = r1.getControlHints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.os.Messenger A(android.media.MediaRouter2.RoutingController r1) {
        /*
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            android.os.Bundle r1 = defpackage.ql4.a(r1)
            if (r1 != 0) goto Lb
            goto L14
        Lb:
            java.lang.String r0 = "androidx.mediarouter.media.KEY_MESSENGER"
            android.os.Parcelable r1 = r1.getParcelable(r0)
            r0 = r1
            android.os.Messenger r0 = (android.os.Messenger) r0
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km4.A(android.media.MediaRouter2$RoutingController):android.os.Messenger");
    }

    static String C(vm4.e eVar) {
        MediaRouter2.RoutingController routingController;
        String id;
        if (!(eVar instanceof c) || (routingController = ((c) eVar).g) == null) {
            return null;
        }
        id = routingController.getId();
        return id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean D(MediaRoute2Info mediaRoute2Info) {
        boolean isSystemRoute;
        isSystemRoute = mediaRoute2Info.isSystemRoute();
        return !isSystemRoute;
    }

    private um4 H(um4 um4Var, boolean z) {
        if (um4Var == null) {
            um4Var = new um4(ym4.c, false);
        }
        List e2 = um4Var.c().e();
        if (!z) {
            e2.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!e2.contains("android.media.intent.category.LIVE_AUDIO")) {
            e2.add("android.media.intent.category.LIVE_AUDIO");
        }
        return new um4(new ym4.a().a(e2).d(), um4Var.d());
    }

    MediaRoute2Info B(String str) {
        String id;
        if (str == null) {
            return null;
        }
        Iterator it2 = this.t.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info a2 = ml4.a(it2.next());
            id = a2.getId();
            if (TextUtils.equals(id, str)) {
                return a2;
            }
        }
        return null;
    }

    protected void E() {
        List routes;
        Bundle extras;
        String id;
        routes = this.i.getRoutes();
        List list = (List) routes.stream().distinct().filter(new Predicate() { // from class: hm4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean D;
                D = km4.D((MediaRoute2Info) obj);
                return D;
            }
        }).collect(Collectors.toList());
        if (list.equals(this.t)) {
            return;
        }
        this.t = list;
        this.u.clear();
        Iterator it2 = this.t.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info a2 = ml4.a(it2.next());
            extras = a2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + a2);
            } else {
                Map map = this.u;
                id = a2.getId();
                map.put(id, extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        w(new wm4.a().d(true).b((List) this.t.stream().map(new Function() { // from class: im4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return on4.c((MediaRoute2Info) obj);
            }
        }).filter(new Predicate() { // from class: jm4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((sm4) obj);
            }
        }).collect(Collectors.toList())).c());
    }

    void F(MediaRouter2.RoutingController routingController) {
        List selectedRoutes;
        Bundle controlHints;
        List selectableRoutes;
        List deselectableRoutes;
        String id;
        int volume;
        int volumeMax;
        int volumeHandling;
        c cVar = (c) this.k.get(routingController);
        if (cVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        List a2 = on4.a(selectedRoutes);
        sm4 c2 = on4.c(ml4.a(selectedRoutes.get(0)));
        controlHints = routingController.getControlHints();
        String string = n().getString(zk6.mr_dialog_default_group_name);
        sm4 sm4Var = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    sm4Var = sm4.d(bundle);
                }
            } catch (Exception e2) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e2);
            }
        }
        if (sm4Var == null) {
            id = routingController.getId();
            sm4.a p = new sm4.a(id, string).g(2).p(1);
            volume = routingController.getVolume();
            sm4.a r = p.r(volume);
            volumeMax = routingController.getVolumeMax();
            sm4.a t = r.t(volumeMax);
            volumeHandling = routingController.getVolumeHandling();
            sm4Var = t.s(volumeHandling).b(c2.f()).d(a2).e();
        }
        selectableRoutes = routingController.getSelectableRoutes();
        List a3 = on4.a(selectableRoutes);
        deselectableRoutes = routingController.getDeselectableRoutes();
        List a4 = on4.a(deselectableRoutes);
        wm4 o = o();
        if (o == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<sm4> b2 = o.b();
        if (!b2.isEmpty()) {
            for (sm4 sm4Var2 : b2) {
                String l = sm4Var2.l();
                arrayList.add(new vm4.b.c.a(sm4Var2).e(a2.contains(l) ? 3 : 1).b(a3.contains(l)).d(a4.contains(l)).c(true).a());
            }
        }
        cVar.u(sm4Var);
        cVar.l(sm4Var, arrayList);
    }

    public void G(String str) {
        MediaRoute2Info B = B(str);
        if (B != null) {
            this.i.transferTo(B);
            return;
        }
        Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
    }

    @Override // defpackage.vm4
    public vm4.b r(String str) {
        Iterator it2 = this.k.entrySet().iterator();
        while (it2.hasNext()) {
            c cVar = (c) ((Map.Entry) it2.next()).getValue();
            if (TextUtils.equals(str, cVar.f)) {
                return cVar;
            }
        }
        return null;
    }

    @Override // defpackage.vm4
    public vm4.e s(String str) {
        return new d((String) this.u.get(str), null);
    }

    @Override // defpackage.vm4
    public vm4.e t(String str, String str2) {
        String str3 = (String) this.u.get(str);
        for (c cVar : this.k.values()) {
            if (TextUtils.equals(str2, cVar.r())) {
                return new d(str3, cVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new d(str3, null);
    }

    @Override // defpackage.vm4
    public void u(um4 um4Var) {
        if (zm4.f() <= 0) {
            this.i.unregisterRouteCallback(this.l);
            this.i.unregisterTransferCallback(this.m);
            this.i.unregisterControllerCallback(this.n);
        } else {
            this.i.registerRouteCallback(this.s, this.l, on4.b(H(um4Var, zm4.n())));
            this.i.registerTransferCallback(this.s, this.m);
            this.i.registerControllerCallback(this.s, this.n);
        }
    }
}
