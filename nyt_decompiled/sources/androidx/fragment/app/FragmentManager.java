package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.a;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import defpackage.aa7;
import defpackage.af5;
import defpackage.ag5;
import defpackage.ce5;
import defpackage.d44;
import defpackage.d5;
import defpackage.df5;
import defpackage.e5;
import defpackage.fe5;
import defpackage.g5;
import defpackage.gh6;
import defpackage.gq2;
import defpackage.i5;
import defpackage.j5;
import defpackage.l5;
import defpackage.lh4;
import defpackage.lq4;
import defpackage.lv0;
import defpackage.ne5;
import defpackage.sa9;
import defpackage.sx4;
import defpackage.tt5;
import defpackage.xp4;
import defpackage.yp2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    private static boolean S;
    private j5 D;
    private j5 E;
    private j5 F;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private ArrayList M;
    private ArrayList N;
    private ArrayList O;
    private n P;
    private FragmentStrictMode.b Q;
    private boolean b;
    ArrayList d;
    private ArrayList e;
    private OnBackPressedDispatcher g;
    private ArrayList m;
    private androidx.fragment.app.j v;
    private yp2 w;
    private Fragment x;
    Fragment y;
    private final ArrayList a = new ArrayList();
    private final q c = new q();
    private final androidx.fragment.app.k f = new androidx.fragment.app.k(this);
    private final ce5 h = new b(false);
    private final AtomicInteger i = new AtomicInteger();
    private final Map j = Collections.synchronizedMap(new HashMap());
    private final Map k = Collections.synchronizedMap(new HashMap());
    private final Map l = Collections.synchronizedMap(new HashMap());
    private final androidx.fragment.app.l n = new androidx.fragment.app.l(this);
    private final CopyOnWriteArrayList o = new CopyOnWriteArrayList();
    private final lv0 p = new lv0() { // from class: bq2
        @Override // defpackage.lv0
        public final void accept(Object obj) {
            FragmentManager.this.U0((Configuration) obj);
        }
    };
    private final lv0 q = new lv0() { // from class: cq2
        @Override // defpackage.lv0
        public final void accept(Object obj) {
            FragmentManager.this.V0((Integer) obj);
        }
    };
    private final lv0 r = new lv0() { // from class: dq2
        @Override // defpackage.lv0
        public final void accept(Object obj) {
            FragmentManager.this.W0((sx4) obj);
        }
    };
    private final lv0 s = new lv0() { // from class: eq2
        @Override // defpackage.lv0
        public final void accept(Object obj) {
            FragmentManager.this.X0((tt5) obj);
        }
    };
    private final lq4 t = new c();
    int u = -1;
    private androidx.fragment.app.i z = null;
    private androidx.fragment.app.i A = new d();
    private z B = null;
    private z C = new e();
    ArrayDeque G = new ArrayDeque();
    private Runnable R = new f();

    /* renamed from: androidx.fragment.app.FragmentManager$6, reason: invalid class name */
    class AnonymousClass6 implements androidx.lifecycle.g {
        final /* synthetic */ String a;
        final /* synthetic */ Lifecycle b;
        final /* synthetic */ FragmentManager c;

        @Override // androidx.lifecycle.g
        public void h(d44 d44Var, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START && ((Bundle) this.c.k.get(this.a)) != null) {
                throw null;
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.b.d(this);
                this.c.l.remove(this.a);
            }
        }
    }

    class a implements d5 {
        a() {
        }

        @Override // defpackage.d5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.G.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfo.mWho;
            int i2 = launchedFragmentInfo.mRequestCode;
            Fragment i3 = FragmentManager.this.c.i(str);
            if (i3 != null) {
                i3.onRequestPermissionsResult(i2, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    class b extends ce5 {
        b(boolean z) {
            super(z);
        }

        @Override // defpackage.ce5
        public void handleOnBackPressed() {
            FragmentManager.this.H0();
        }
    }

    class c implements lq4 {
        c() {
        }

        @Override // defpackage.lq4
        public void a(Menu menu) {
            FragmentManager.this.L(menu);
        }

        @Override // defpackage.lq4
        public void b(Menu menu) {
            FragmentManager.this.P(menu);
        }

        @Override // defpackage.lq4
        public boolean c(MenuItem menuItem) {
            return FragmentManager.this.K(menuItem);
        }

        @Override // defpackage.lq4
        public void d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.D(menu, menuInflater);
        }
    }

    class d extends androidx.fragment.app.i {
        d() {
        }

        @Override // androidx.fragment.app.i
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.y0().b(FragmentManager.this.y0().f(), str, null);
        }
    }

    class e implements z {
        e() {
        }

        @Override // androidx.fragment.app.z
        public SpecialEffectsController a(ViewGroup viewGroup) {
            return new DefaultSpecialEffectsController(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.b0(true);
        }
    }

    class g implements gq2 {
        final /* synthetic */ Fragment a;

        g(Fragment fragment) {
            this.a = fragment;
        }

        @Override // defpackage.gq2
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.a.onAttachFragment(fragment);
        }
    }

    class h implements d5 {
        h() {
        }

        @Override // defpackage.d5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.G.pollLast();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfo.mWho;
            int i = launchedFragmentInfo.mRequestCode;
            Fragment i2 = FragmentManager.this.c.i(str);
            if (i2 != null) {
                i2.onActivityResult(i, activityResult.b(), activityResult.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class i implements d5 {
        i() {
        }

        @Override // defpackage.d5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.G.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfo.mWho;
            int i = launchedFragmentInfo.mRequestCode;
            Fragment i2 = FragmentManager.this.c.i(str);
            if (i2 != null) {
                i2.onActivityResult(i, activityResult.b(), activityResult.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    static class j extends e5 {
        j() {
        }

        @Override // defpackage.e5
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a = intentSenderRequest.a();
            if (a != null && (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.d()).b(null).c(intentSenderRequest.c(), intentSenderRequest.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.L0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // defpackage.e5
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    public static abstract class k {
        public void d(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void e(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void f(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void g(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void h(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void i(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void j(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void k(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void l(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void m(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void n(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void o(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void p(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void q(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    interface l {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    private class m implements l {
        final String a;
        final int b;
        final int c;

        m(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.l
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManager.this.y;
            if (fragment == null || this.b >= 0 || this.a != null || !fragment.getChildFragmentManager().h1()) {
                return FragmentManager.this.k1(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    private void A1(Fragment fragment) {
        ViewGroup v0 = v0(fragment);
        if (v0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (v0.getTag(gh6.visible_removing_fragment_view_tag) == null) {
            v0.setTag(gh6.visible_removing_fragment_view_tag, fragment);
        }
        ((Fragment) v0.getTag(gh6.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
    }

    private void C1() {
        Iterator it2 = this.c.k().iterator();
        while (it2.hasNext()) {
            e1((o) it2.next());
        }
    }

    private void D1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new w("FragmentManager"));
        androidx.fragment.app.j jVar = this.v;
        if (jVar != null) {
            try {
                jVar.h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            X("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    static Fragment F0(View view) {
        Object tag = view.getTag(gh6.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void F1() {
        synchronized (this.a) {
            try {
                if (this.a.isEmpty()) {
                    this.h.setEnabled(r0() > 0 && Q0(this.x));
                } else {
                    this.h.setEnabled(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean L0(int i2) {
        return S || Log.isLoggable("FragmentManager", i2);
    }

    private void M(Fragment fragment) {
        if (fragment == null || !fragment.equals(g0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    private boolean M0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.q();
    }

    private boolean N0() {
        Fragment fragment = this.x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.x.getParentFragmentManager().N0();
    }

    private void T(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            b1(i2, false);
            Iterator it2 = u().iterator();
            while (it2.hasNext()) {
                ((SpecialEffectsController) it2.next()).n();
            }
            this.b = false;
            b0(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0(Configuration configuration) {
        if (N0()) {
            A(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(Integer num) {
        if (N0() && num.intValue() == 80) {
            G(false);
        }
    }

    private void W() {
        if (this.L) {
            this.L = false;
            C1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W0(sx4 sx4Var) {
        if (N0()) {
            H(sx4Var.a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X0(tt5 tt5Var) {
        if (N0()) {
            O(tt5Var.a(), false);
        }
    }

    private void Y() {
        Iterator it2 = u().iterator();
        while (it2.hasNext()) {
            ((SpecialEffectsController) it2.next()).n();
        }
    }

    private void a0(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.v == null) {
            if (!this.K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            r();
        }
        if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    private static void d0(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i2);
            if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                aVar.w(-1);
                aVar.B();
            } else {
                aVar.w(1);
                aVar.A();
            }
            i2++;
        }
    }

    private void e0(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        ArrayList arrayList3;
        boolean z = ((androidx.fragment.app.a) arrayList.get(i2)).r;
        ArrayList arrayList4 = this.O;
        if (arrayList4 == null) {
            this.O = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.O.addAll(this.c.o());
        Fragment C0 = C0();
        boolean z2 = false;
        for (int i4 = i2; i4 < i3; i4++) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i4);
            C0 = !((Boolean) arrayList2.get(i4)).booleanValue() ? aVar.C(this.O, C0) : aVar.F(this.O, C0);
            z2 = z2 || aVar.i;
        }
        this.O.clear();
        if (!z && this.u >= 1) {
            for (int i5 = i2; i5 < i3; i5++) {
                Iterator it2 = ((androidx.fragment.app.a) arrayList.get(i5)).c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = ((r.a) it2.next()).b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.c.r(w(fragment));
                    }
                }
            }
        }
        d0(arrayList, arrayList2, i2, i3);
        boolean booleanValue = ((Boolean) arrayList2.get(i3 - 1)).booleanValue();
        if (z2 && (arrayList3 = this.m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                linkedHashSet.addAll(p0((androidx.fragment.app.a) it3.next()));
            }
            Iterator it4 = this.m.iterator();
            while (it4.hasNext()) {
                lh4.a(it4.next());
                Iterator it5 = linkedHashSet.iterator();
                if (it5.hasNext()) {
                    throw null;
                }
            }
            Iterator it6 = this.m.iterator();
            while (it6.hasNext()) {
                lh4.a(it6.next());
                Iterator it7 = linkedHashSet.iterator();
                if (it7.hasNext()) {
                    throw null;
                }
            }
        }
        for (int i6 = i2; i6 < i3; i6++) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) arrayList.get(i6);
            if (booleanValue) {
                for (int size = aVar2.c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = ((r.a) aVar2.c.get(size)).b;
                    if (fragment2 != null) {
                        w(fragment2).m();
                    }
                }
            } else {
                Iterator it8 = aVar2.c.iterator();
                while (it8.hasNext()) {
                    Fragment fragment3 = ((r.a) it8.next()).b;
                    if (fragment3 != null) {
                        w(fragment3).m();
                    }
                }
            }
        }
        b1(this.u, true);
        for (SpecialEffectsController specialEffectsController : v(arrayList, i2, i3)) {
            specialEffectsController.v(booleanValue);
            specialEffectsController.t();
            specialEffectsController.k();
        }
        while (i2 < i3) {
            androidx.fragment.app.a aVar3 = (androidx.fragment.app.a) arrayList.get(i2);
            if (((Boolean) arrayList2.get(i2)).booleanValue() && aVar3.v >= 0) {
                aVar3.v = -1;
            }
            aVar3.E();
            i2++;
        }
        if (z2) {
            q1();
        }
    }

    private int h0(String str, int i2, boolean z) {
        ArrayList arrayList = this.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.d.get(size);
            if ((str != null && str.equals(aVar.D())) || (i2 >= 0 && i2 == aVar.v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) this.d.get(size - 1);
            if ((str == null || !str.equals(aVar2.D())) && (i2 < 0 || i2 != aVar2.v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public static Fragment i0(View view) {
        Fragment n0 = n0(view);
        if (n0 != null) {
            return n0;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    private boolean j1(String str, int i2, int i3) {
        b0(false);
        a0(true);
        Fragment fragment = this.y;
        if (fragment != null && i2 < 0 && str == null && fragment.getChildFragmentManager().h1()) {
            return true;
        }
        boolean k1 = k1(this.M, this.N, str, i2, i3);
        if (k1) {
            this.b = true;
            try {
                o1(this.M, this.N);
            } finally {
                s();
            }
        }
        F1();
        W();
        this.c.b();
        return k1;
    }

    static FragmentManager m0(View view) {
        androidx.fragment.app.f fVar;
        Fragment n0 = n0(view);
        if (n0 != null) {
            if (n0.isAdded()) {
                return n0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + n0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                fVar = null;
                break;
            }
            if (context instanceof androidx.fragment.app.f) {
                fVar = (androidx.fragment.app.f) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (fVar != null) {
            return fVar.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    static Fragment n0(View view) {
        while (view != null) {
            Fragment F0 = F0(view);
            if (F0 != null) {
                return F0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void o0() {
        Iterator it2 = u().iterator();
        while (it2.hasNext()) {
            ((SpecialEffectsController) it2.next()).o();
        }
    }

    private void o1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!((androidx.fragment.app.a) arrayList.get(i2)).r) {
                if (i3 != i2) {
                    e0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                    while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((androidx.fragment.app.a) arrayList.get(i3)).r) {
                        i3++;
                    }
                }
                e0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            e0(arrayList, arrayList2, i3, size);
        }
    }

    private Set p0(androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < aVar.c.size(); i2++) {
            Fragment fragment = ((r.a) aVar.c.get(i2)).b;
            if (fragment != null && aVar.i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    private boolean q0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            try {
                int size = this.a.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    z |= ((l) this.a.get(i2)).a(arrayList, arrayList2);
                }
                return z;
            } finally {
                this.a.clear();
                this.v.g().removeCallbacks(this.R);
            }
        }
    }

    private void q1() {
        ArrayList arrayList = this.m;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        lh4.a(this.m.get(0));
        throw null;
    }

    private void r() {
        if (S0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void s() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    private n s0(Fragment fragment) {
        return this.P.k(fragment);
    }

    static int s1(int i2) {
        int i3 = 4097;
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 8194) {
            i3 = 8197;
            if (i2 == 8197) {
                return 4100;
            }
            if (i2 == 4099) {
                return 4099;
            }
            if (i2 != 4100) {
                return 0;
            }
        }
        return i3;
    }

    private void t() {
        androidx.fragment.app.j jVar = this.v;
        if (jVar instanceof sa9 ? this.c.p().o() : jVar.f() instanceof Activity ? !((Activity) this.v.f()).isChangingConfigurations() : true) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                Iterator<String> it3 = ((BackStackState) it2.next()).mFragments.iterator();
                while (it3.hasNext()) {
                    this.c.p().g(it3.next(), false);
                }
            }
        }
    }

    private Set u() {
        HashSet hashSet = new HashSet();
        Iterator it2 = this.c.k().iterator();
        while (it2.hasNext()) {
            ViewGroup viewGroup = ((o) it2.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.s(viewGroup, D0()));
            }
        }
        return hashSet;
    }

    private Set v(ArrayList arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator it2 = ((androidx.fragment.app.a) arrayList.get(i2)).c.iterator();
            while (it2.hasNext()) {
                Fragment fragment = ((r.a) it2.next()).b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(SpecialEffectsController.r(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    private ViewGroup v0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.w.d()) {
            View c2 = this.w.c(fragment.mContainerId);
            if (c2 instanceof ViewGroup) {
                return (ViewGroup) c2;
            }
        }
        return null;
    }

    void A(Configuration configuration, boolean z) {
        if (z && (this.v instanceof ne5)) {
            D1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.A(configuration, true);
                }
            }
        }
    }

    androidx.fragment.app.l A0() {
        return this.n;
    }

    boolean B(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    Fragment B0() {
        return this.x;
    }

    void B1(Fragment fragment) {
        if (L0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    void C() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        T(1);
    }

    public Fragment C0() {
        return this.y;
    }

    boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && P0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = (Fragment) this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    z D0() {
        z zVar = this.B;
        if (zVar != null) {
            return zVar;
        }
        Fragment fragment = this.x;
        return fragment != null ? fragment.mFragmentManager.D0() : this.C;
    }

    void E() {
        this.K = true;
        b0(true);
        Y();
        t();
        T(-1);
        Object obj = this.v;
        if (obj instanceof ag5) {
            ((ag5) obj).removeOnTrimMemoryListener(this.q);
        }
        Object obj2 = this.v;
        if (obj2 instanceof ne5) {
            ((ne5) obj2).removeOnConfigurationChangedListener(this.p);
        }
        Object obj3 = this.v;
        if (obj3 instanceof af5) {
            ((af5) obj3).removeOnMultiWindowModeChangedListener(this.r);
        }
        Object obj4 = this.v;
        if (obj4 instanceof df5) {
            ((df5) obj4).removeOnPictureInPictureModeChangedListener(this.s);
        }
        Object obj5 = this.v;
        if ((obj5 instanceof xp4) && this.x == null) {
            ((xp4) obj5).removeMenuProvider(this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g != null) {
            this.h.remove();
            this.g = null;
        }
        j5 j5Var = this.D;
        if (j5Var != null) {
            j5Var.c();
            this.E.c();
            this.F.c();
        }
    }

    public FragmentStrictMode.b E0() {
        return this.Q;
    }

    public void E1(k kVar) {
        this.n.p(kVar);
    }

    void F() {
        T(1);
    }

    void G(boolean z) {
        if (z && (this.v instanceof ag5)) {
            D1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.G(true);
                }
            }
        }
    }

    androidx.lifecycle.u G0(Fragment fragment) {
        return this.P.n(fragment);
    }

    void H(boolean z, boolean z2) {
        if (z2 && (this.v instanceof af5)) {
            D1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.H(z, true);
                }
            }
        }
    }

    void H0() {
        b0(true);
        if (this.h.isEnabled()) {
            h1();
        } else {
            this.g.l();
        }
    }

    void I(Fragment fragment) {
        Iterator it2 = this.o.iterator();
        while (it2.hasNext()) {
            ((gq2) it2.next()).a(this, fragment);
        }
    }

    void I0(Fragment fragment) {
        if (L0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        A1(fragment);
    }

    void J() {
        for (Fragment fragment : this.c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.J();
            }
        }
    }

    void J0(Fragment fragment) {
        if (fragment.mAdded && M0(fragment)) {
            this.H = true;
        }
    }

    boolean K(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean K0() {
        return this.K;
    }

    void L(Menu menu) {
        if (this.u < 1) {
            return;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    void N() {
        T(5);
    }

    void O(boolean z, boolean z2) {
        if (z2 && (this.v instanceof df5)) {
            D1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.O(z, true);
                }
            }
        }
    }

    boolean O0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    boolean P(Menu menu) {
        boolean z = false;
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && P0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    boolean P0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    void Q() {
        F1();
        M(this.y);
    }

    boolean Q0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.C0()) && Q0(fragmentManager.x);
    }

    void R() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        T(7);
    }

    boolean R0(int i2) {
        return this.u >= i2;
    }

    void S() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        T(5);
    }

    public boolean S0() {
        return this.I || this.J;
    }

    void U() {
        this.J = true;
        this.P.q(true);
        T(4);
    }

    void V() {
        T(2);
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment = (Fragment) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.y(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size3 = this.a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size3; i4++) {
                        l lVar = (l) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(lVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.w);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    void Y0(Fragment fragment, String[] strArr, int i2) {
        if (this.F == null) {
            this.v.k(fragment, strArr, i2);
            return;
        }
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        this.F.a(strArr);
    }

    void Z(l lVar, boolean z) {
        if (!z) {
            if (this.v == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            r();
        }
        synchronized (this.a) {
            try {
                if (this.v == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(lVar);
                    v1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void Z0(Fragment fragment, Intent intent, int i2, Bundle bundle) {
        if (this.D == null) {
            this.v.m(fragment, intent, i2, bundle);
            return;
        }
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.D.a(intent);
    }

    void a1(Fragment fragment, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        Intent intent2;
        if (this.E == null) {
            this.v.n(fragment, intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (L0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        IntentSenderRequest a2 = new IntentSenderRequest.a(intentSender).b(intent2).c(i4, i3).a();
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        if (L0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.E.a(a2);
    }

    boolean b0(boolean z) {
        a0(z);
        boolean z2 = false;
        while (q0(this.M, this.N)) {
            z2 = true;
            this.b = true;
            try {
                o1(this.M, this.N);
            } finally {
                s();
            }
        }
        F1();
        W();
        this.c.b();
        return z2;
    }

    void b1(int i2, boolean z) {
        androidx.fragment.app.j jVar;
        if (this.v == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.u) {
            this.u = i2;
            this.c.t();
            C1();
            if (this.H && (jVar = this.v) != null && this.u == 7) {
                jVar.o();
                this.H = false;
            }
        }
    }

    void c0(l lVar, boolean z) {
        if (z && (this.v == null || this.K)) {
            return;
        }
        a0(z);
        if (lVar.a(this.M, this.N)) {
            this.b = true;
            try {
                o1(this.M, this.N);
            } finally {
                s();
            }
        }
        F1();
        W();
        this.c.b();
    }

    void c1() {
        if (this.v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.q(false);
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    void d1(FragmentContainerView fragmentContainerView) {
        View view;
        for (o oVar : this.c.k()) {
            Fragment k2 = oVar.k();
            if (k2.mContainerId == fragmentContainerView.getId() && (view = k2.mView) != null && view.getParent() == null) {
                k2.mContainer = fragmentContainerView;
                oVar.b();
            }
        }
    }

    void e1(o oVar) {
        Fragment k2 = oVar.k();
        if (k2.mDeferStart) {
            if (this.b) {
                this.L = true;
            } else {
                k2.mDeferStart = false;
                oVar.m();
            }
        }
    }

    public boolean f0() {
        boolean b0 = b0(true);
        o0();
        return b0;
    }

    public void f1() {
        Z(new m(null, -1, 0), false);
    }

    Fragment g0(String str) {
        return this.c.f(str);
    }

    void g1(int i2, int i3, boolean z) {
        if (i2 >= 0) {
            Z(new m(null, i2, i3), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public boolean h1() {
        return j1(null, -1, 0);
    }

    void i(androidx.fragment.app.a aVar) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(aVar);
    }

    public boolean i1(int i2, int i3) {
        if (i2 >= 0) {
            return j1(null, i2, i3);
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    o j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.f(fragment, str);
        }
        if (L0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        o w = w(fragment);
        fragment.mFragmentManager = this;
        this.c.r(w);
        if (!fragment.mDetached) {
            this.c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (M0(fragment)) {
                this.H = true;
            }
        }
        return w;
    }

    public Fragment j0(int i2) {
        return this.c.g(i2);
    }

    public void k(gq2 gq2Var) {
        this.o.add(gq2Var);
    }

    public Fragment k0(String str) {
        return this.c.h(str);
    }

    boolean k1(ArrayList arrayList, ArrayList arrayList2, String str, int i2, int i3) {
        int h0 = h0(str, i2, (i3 & 1) != 0);
        if (h0 < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= h0; size--) {
            arrayList.add((androidx.fragment.app.a) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    void l(Fragment fragment) {
        this.P.e(fragment);
    }

    Fragment l0(String str) {
        return this.c.i(str);
    }

    public void l1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            D1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    int m() {
        return this.i.getAndIncrement();
    }

    public void m1(k kVar, boolean z) {
        this.n.o(kVar, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void n(androidx.fragment.app.j jVar, yp2 yp2Var, Fragment fragment) {
        String str;
        if (this.v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.v = jVar;
        this.w = yp2Var;
        this.x = fragment;
        if (fragment != null) {
            k(new g(fragment));
        } else if (jVar instanceof gq2) {
            k((gq2) jVar);
        }
        if (this.x != null) {
            F1();
        }
        if (jVar instanceof fe5) {
            fe5 fe5Var = (fe5) jVar;
            OnBackPressedDispatcher onBackPressedDispatcher = fe5Var.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            d44 d44Var = fe5Var;
            if (fragment != null) {
                d44Var = fragment;
            }
            onBackPressedDispatcher.h(d44Var, this.h);
        }
        if (fragment != null) {
            this.P = fragment.mFragmentManager.s0(fragment);
        } else if (jVar instanceof sa9) {
            this.P = n.l(((sa9) jVar).getViewModelStore());
        } else {
            this.P = new n(false);
        }
        this.P.q(S0());
        this.c.A(this.P);
        Object obj = this.v;
        if ((obj instanceof aa7) && fragment == null) {
            androidx.savedstate.a savedStateRegistry = ((aa7) obj).getSavedStateRegistry();
            savedStateRegistry.h("android:support:fragments", new a.c() { // from class: fq2
                @Override // androidx.savedstate.a.c
                public final Bundle a() {
                    Bundle T0;
                    T0 = FragmentManager.this.T0();
                    return T0;
                }
            });
            Bundle b2 = savedStateRegistry.b("android:support:fragments");
            if (b2 != null) {
                r1(b2);
            }
        }
        Object obj2 = this.v;
        if (obj2 instanceof l5) {
            ActivityResultRegistry activityResultRegistry = ((l5) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.D = activityResultRegistry.i(str2 + "StartActivityForResult", new i5(), new h());
            this.E = activityResultRegistry.i(str2 + "StartIntentSenderForResult", new j(), new i());
            this.F = activityResultRegistry.i(str2 + "RequestPermissions", new g5(), new a());
        }
        Object obj3 = this.v;
        if (obj3 instanceof ne5) {
            ((ne5) obj3).addOnConfigurationChangedListener(this.p);
        }
        Object obj4 = this.v;
        if (obj4 instanceof ag5) {
            ((ag5) obj4).addOnTrimMemoryListener(this.q);
        }
        Object obj5 = this.v;
        if (obj5 instanceof af5) {
            ((af5) obj5).addOnMultiWindowModeChangedListener(this.r);
        }
        Object obj6 = this.v;
        if (obj6 instanceof df5) {
            ((df5) obj6).addOnPictureInPictureModeChangedListener(this.s);
        }
        Object obj7 = this.v;
        if ((obj7 instanceof xp4) && fragment == null) {
            ((xp4) obj7).addMenuProvider(this.t);
        }
    }

    void n1(Fragment fragment) {
        if (L0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && isInBackStack) {
            return;
        }
        this.c.u(fragment);
        if (M0(fragment)) {
            this.H = true;
        }
        fragment.mRemoving = true;
        A1(fragment);
    }

    void o(Fragment fragment) {
        if (L0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (L0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (M0(fragment)) {
                this.H = true;
            }
        }
    }

    public r p() {
        return new androidx.fragment.app.a(this);
    }

    void p1(Fragment fragment) {
        this.P.p(fragment);
    }

    boolean q() {
        boolean z = false;
        for (Fragment fragment : this.c.l()) {
            if (fragment != null) {
                z = M0(fragment);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public int r0() {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void r1(Parcelable parcelable) {
        o oVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.v.f().getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.v.f().getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        this.c.x(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable(TransferTable.COLUMN_STATE);
        if (fragmentManagerState == null) {
            return;
        }
        this.c.v();
        Iterator<String> it2 = fragmentManagerState.mActive.iterator();
        while (it2.hasNext()) {
            Bundle B = this.c.B(it2.next(), null);
            if (B != null) {
                Fragment j2 = this.P.j(((FragmentState) B.getParcelable(TransferTable.COLUMN_STATE)).mWho);
                if (j2 != null) {
                    if (L0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + j2);
                    }
                    oVar = new o(this.n, this.c, j2, B);
                } else {
                    oVar = new o(this.n, this.c, this.v.f().getClassLoader(), w0(), B);
                }
                Fragment k2 = oVar.k();
                k2.mSavedFragmentState = B;
                k2.mFragmentManager = this;
                if (L0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k2.mWho + "): " + k2);
                }
                oVar.o(this.v.f().getClassLoader());
                this.c.r(oVar);
                oVar.t(this.u);
            }
        }
        for (Fragment fragment : this.P.m()) {
            if (!this.c.c(fragment.mWho)) {
                if (L0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.mActive);
                }
                this.P.p(fragment);
                fragment.mFragmentManager = this;
                o oVar2 = new o(this.n, this.c, fragment);
                oVar2.t(1);
                oVar2.m();
                fragment.mRemoving = true;
                oVar2.m();
            }
        }
        this.c.w(fragmentManagerState.mAdded);
        if (fragmentManagerState.mBackStack != null) {
            this.d = new ArrayList(fragmentManagerState.mBackStack.length);
            int i2 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.mBackStack;
                if (i2 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a b2 = backStackRecordStateArr[i2].b(this);
                if (L0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + b2.v + "): " + b2);
                    PrintWriter printWriter = new PrintWriter(new w("FragmentManager"));
                    b2.z("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(b2);
                i2++;
            }
        } else {
            this.d = null;
        }
        this.i.set(fragmentManagerState.mBackStackIndex);
        String str3 = fragmentManagerState.mPrimaryNavActiveWho;
        if (str3 != null) {
            Fragment g0 = g0(str3);
            this.y = g0;
            M(g0);
        }
        ArrayList<String> arrayList = fragmentManagerState.mBackStackStateKeys;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.j.put(arrayList.get(i3), fragmentManagerState.mBackStackStates.get(i3));
            }
        }
        this.G = new ArrayDeque(fragmentManagerState.mLaunchedFragments);
    }

    yp2 t0() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public Bundle T0() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        o0();
        Y();
        b0(true);
        this.I = true;
        this.P.q(true);
        ArrayList<String> y = this.c.y();
        HashMap m2 = this.c.m();
        if (!m2.isEmpty()) {
            ArrayList<String> z = this.c.z();
            ArrayList arrayList = this.d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i2 = 0; i2 < size; i2++) {
                    backStackRecordStateArr[i2] = new BackStackRecordState((androidx.fragment.app.a) this.d.get(i2));
                    if (L0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.d.get(i2));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.mActive = y;
            fragmentManagerState.mAdded = z;
            fragmentManagerState.mBackStack = backStackRecordStateArr;
            fragmentManagerState.mBackStackIndex = this.i.get();
            Fragment fragment = this.y;
            if (fragment != null) {
                fragmentManagerState.mPrimaryNavActiveWho = fragment.mWho;
            }
            fragmentManagerState.mBackStackStateKeys.addAll(this.j.keySet());
            fragmentManagerState.mBackStackStates.addAll(this.j.values());
            fragmentManagerState.mLaunchedFragments = new ArrayList<>(this.G);
            bundle.putParcelable(TransferTable.COLUMN_STATE, fragmentManagerState);
            for (String str : this.k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.k.get(str));
            }
            for (String str2 : m2.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) m2.get(str2));
            }
        } else if (L0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        } else {
            androidx.fragment.app.j jVar = this.v;
            if (jVar != null) {
                sb.append(jVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.v)));
                sb.append("}");
            } else {
                sb.append(Constants.NULL_VERSION_ID);
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public Fragment u0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment g0 = g0(string);
        if (g0 == null) {
            D1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return g0;
    }

    public Fragment.SavedState u1(Fragment fragment) {
        o n = this.c.n(fragment.mWho);
        if (n == null || !n.k().equals(fragment)) {
            D1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return n.q();
    }

    void v1() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.v.g().removeCallbacks(this.R);
                    this.v.g().post(this.R);
                    F1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    o w(Fragment fragment) {
        o n = this.c.n(fragment.mWho);
        if (n != null) {
            return n;
        }
        o oVar = new o(this.n, this.c, fragment);
        oVar.o(this.v.f().getClassLoader());
        oVar.t(this.u);
        return oVar;
    }

    public androidx.fragment.app.i w0() {
        androidx.fragment.app.i iVar = this.z;
        if (iVar != null) {
            return iVar;
        }
        Fragment fragment = this.x;
        return fragment != null ? fragment.mFragmentManager.w0() : this.A;
    }

    void w1(Fragment fragment, boolean z) {
        ViewGroup v0 = v0(fragment);
        if (v0 == null || !(v0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) v0).setDrawDisappearingViewsLast(!z);
    }

    void x(Fragment fragment) {
        if (L0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (L0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.c.u(fragment);
            if (M0(fragment)) {
                this.H = true;
            }
            A1(fragment);
        }
    }

    public List x0() {
        return this.c.o();
    }

    public final void x1(String str, Bundle bundle) {
        lh4.a(this.l.get(str));
        this.k.put(str, bundle);
        if (L0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    void y() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        T(4);
    }

    public androidx.fragment.app.j y0() {
        return this.v;
    }

    void y1(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void z() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        T(0);
    }

    LayoutInflater.Factory2 z0() {
        return this.f;
    }

    void z1(Fragment fragment) {
        if (fragment == null || (fragment.equals(g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.y;
            this.y = fragment;
            M(fragment2);
            M(this.y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    @SuppressLint({"BanParcelableUsage"})
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
        int mRequestCode;
        String mWho;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        LaunchedFragmentInfo(String str, int i) {
            this.mWho = str;
            this.mRequestCode = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mWho);
            parcel.writeInt(this.mRequestCode);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.mWho = parcel.readString();
            this.mRequestCode = parcel.readInt();
        }
    }
}
