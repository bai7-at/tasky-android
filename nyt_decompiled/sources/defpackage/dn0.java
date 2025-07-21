package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.internal.FetchedAppSettingsManager;
import defpackage.lo6;
import defpackage.ym0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class dn0 {
    public static final a f = new a(null);
    private static final String g = dn0.class.getCanonicalName();
    private static dn0 h;
    private final Handler a;
    private final Set b;
    private final Set c;
    private HashSet d;
    private final HashMap e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized dn0 a() {
            dn0 b;
            try {
                if (dn0.b() == null) {
                    dn0.d(new dn0(null));
                }
                b = dn0.b();
                if (b == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
                }
            } catch (Throwable th) {
                throw th;
            }
            return b;
        }

        public final Bundle b(EventBinding eventBinding, View view, View view2) {
            List<po5> c;
            List a;
            zq3.h(view, "rootView");
            zq3.h(view2, "hostView");
            Bundle bundle = new Bundle();
            if (eventBinding != null && (c = eventBinding.c()) != null) {
                for (po5 po5Var : c) {
                    if (po5Var.d() != null && po5Var.d().length() > 0) {
                        bundle.putString(po5Var.a(), po5Var.d());
                    } else if (po5Var.b().size() > 0) {
                        if (zq3.c(po5Var.c(), "relative")) {
                            c.a aVar = c.f;
                            List b = po5Var.b();
                            String simpleName = view2.getClass().getSimpleName();
                            zq3.g(simpleName, "hostView.javaClass.simpleName");
                            a = aVar.a(eventBinding, view2, b, 0, -1, simpleName);
                        } else {
                            c.a aVar2 = c.f;
                            List b2 = po5Var.b();
                            String simpleName2 = view.getClass().getSimpleName();
                            zq3.g(simpleName2, "rootView.javaClass.simpleName");
                            a = aVar2.a(eventBinding, view, b2, 0, -1, simpleName2);
                        }
                        Iterator it2 = a.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                b bVar = (b) it2.next();
                                if (bVar.a() != null) {
                                    ba9 ba9Var = ba9.a;
                                    String k = ba9.k(bVar.a());
                                    if (k.length() > 0) {
                                        bundle.putString(po5Var.a(), k);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }

        private a() {
        }
    }

    public static final class b {
        private final WeakReference a;
        private final String b;

        public b(View view, String str) {
            zq3.h(view, "view");
            zq3.h(str, "viewMapKey");
            this.a = new WeakReference(view);
            this.b = str;
        }

        public final View a() {
            WeakReference weakReference = this.a;
            if (weakReference == null) {
                return null;
            }
            return (View) weakReference.get();
        }

        public final String b() {
            return this.b;
        }
    }

    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
        public static final a f = new a(null);
        private final WeakReference a;
        private List b;
        private final Handler c;
        private final HashSet d;
        private final String e;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final List b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt.getVisibility() == 0) {
                            zq3.g(childAt, "child");
                            arrayList.add(childAt);
                        }
                        if (i2 >= childCount) {
                            break;
                        }
                        i = i2;
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
            
                if (defpackage.zq3.c(r9.getClass().getSimpleName(), (java.lang.String) r8.get(r8.size() - 1)) == false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final boolean c(android.view.View r9, com.facebook.appevents.codeless.internal.PathComponent r10, int r11) {
                /*
                    Method dump skipped, instructions count: 323
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: dn0.c.a.c(android.view.View, com.facebook.appevents.codeless.internal.PathComponent, int):boolean");
            }

            public final List a(EventBinding eventBinding, View view, List list, int i, int i2, String str) {
                List b;
                int size;
                List b2;
                int size2;
                zq3.h(list, "path");
                zq3.h(str, "mapKey");
                String str2 = str + '.' + i2;
                ArrayList arrayList = new ArrayList();
                if (view == null) {
                    return arrayList;
                }
                if (i >= list.size()) {
                    arrayList.add(new b(view, str2));
                } else {
                    PathComponent pathComponent = (PathComponent) list.get(i);
                    if (zq3.c(pathComponent.a(), "..")) {
                        ViewParent parent = view.getParent();
                        if ((parent instanceof ViewGroup) && (size = (b = b((ViewGroup) parent)).size()) > 0) {
                            int i3 = 0;
                            while (true) {
                                int i4 = i3 + 1;
                                arrayList.addAll(a(eventBinding, (View) b.get(i3), list, i + 1, i3, str2));
                                if (i4 >= size) {
                                    break;
                                }
                                i3 = i4;
                            }
                        }
                        return arrayList;
                    }
                    if (zq3.c(pathComponent.a(), InstructionFileId.DOT)) {
                        arrayList.add(new b(view, str2));
                        return arrayList;
                    }
                    if (!c(view, pathComponent, i2)) {
                        return arrayList;
                    }
                    if (i == list.size() - 1) {
                        arrayList.add(new b(view, str2));
                    }
                }
                if ((view instanceof ViewGroup) && (size2 = (b2 = b((ViewGroup) view)).size()) > 0) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        arrayList.addAll(a(eventBinding, (View) b2.get(i5), list, i + 1, i5, str2));
                        if (i6 >= size2) {
                            break;
                        }
                        i5 = i6;
                    }
                }
                return arrayList;
            }

            private a() {
            }
        }

        public c(View view, Handler handler, HashSet hashSet, String str) {
            zq3.h(handler, "handler");
            zq3.h(hashSet, "listenerSet");
            zq3.h(str, "activityName");
            this.a = new WeakReference(view);
            this.c = handler;
            this.d = hashSet;
            this.e = str;
            handler.postDelayed(this, 200L);
        }

        private final void a(b bVar, View view, EventBinding eventBinding) {
            if (eventBinding == null) {
                return;
            }
            try {
                View a2 = bVar.a();
                if (a2 == null) {
                    return;
                }
                View a3 = ba9.a(a2);
                if (a3 != null && ba9.a.p(a2, a3)) {
                    d(bVar, view, eventBinding);
                    return;
                }
                String name = a2.getClass().getName();
                zq3.g(name, "view.javaClass.name");
                if (h.K(name, "com.facebook.react", false, 2, null)) {
                    return;
                }
                if (!(a2 instanceof AdapterView)) {
                    b(bVar, view, eventBinding);
                } else if (a2 instanceof ListView) {
                    c(bVar, view, eventBinding);
                }
            } catch (Exception e) {
                g29 g29Var = g29.a;
                g29.e0(dn0.c(), e);
            }
        }

        private final void b(b bVar, View view, EventBinding eventBinding) {
            boolean z;
            View a2 = bVar.a();
            if (a2 == null) {
                return;
            }
            String b = bVar.b();
            View.OnClickListener g = ba9.g(a2);
            if (g instanceof ym0.a) {
                if (g == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
                if (((ym0.a) g).a()) {
                    z = true;
                    if (!this.d.contains(b) || z) {
                    }
                    a2.setOnClickListener(ym0.b(eventBinding, view, a2));
                    this.d.add(b);
                    return;
                }
            }
            z = false;
            if (this.d.contains(b)) {
            }
        }

        private final void c(b bVar, View view, EventBinding eventBinding) {
            boolean z;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView == null) {
                return;
            }
            String b = bVar.b();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (onItemClickListener instanceof ym0.b) {
                if (onItemClickListener == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                }
                if (((ym0.b) onItemClickListener).a()) {
                    z = true;
                    if (!this.d.contains(b) || z) {
                    }
                    adapterView.setOnItemClickListener(ym0.c(eventBinding, view, adapterView));
                    this.d.add(b);
                    return;
                }
            }
            z = false;
            if (this.d.contains(b)) {
            }
        }

        private final void d(b bVar, View view, EventBinding eventBinding) {
            boolean z;
            View a2 = bVar.a();
            if (a2 == null) {
                return;
            }
            String b = bVar.b();
            View.OnTouchListener h = ba9.h(a2);
            if (h instanceof lo6.a) {
                if (h == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
                if (((lo6.a) h).a()) {
                    z = true;
                    if (!this.d.contains(b) || z) {
                    }
                    a2.setOnTouchListener(lo6.a(eventBinding, view, a2));
                    this.d.add(b);
                    return;
                }
            }
            z = false;
            if (this.d.contains(b)) {
            }
        }

        private final void e(EventBinding eventBinding, View view) {
            if (eventBinding == null || view == null) {
                return;
            }
            String a2 = eventBinding.a();
            if (a2 == null || a2.length() == 0 || zq3.c(eventBinding.a(), this.e)) {
                List d = eventBinding.d();
                if (d.size() > 25) {
                    return;
                }
                Iterator it2 = f.a(eventBinding, view, d, 0, -1, this.e).iterator();
                while (it2.hasNext()) {
                    a((b) it2.next(), view, eventBinding);
                }
            }
        }

        private final void f() {
            int size;
            List list = this.b;
            if (list == null || this.a.get() == null || list.size() - 1 < 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                e((EventBinding) list.get(i), (View) this.a.get());
                if (i2 > size) {
                    return;
                } else {
                    i = i2;
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            f();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (c11.d(this)) {
                return;
            }
            try {
                rd2 f2 = FetchedAppSettingsManager.f(w92.m());
                if (f2 != null && f2.b()) {
                    List b = EventBinding.j.b(f2.e());
                    this.b = b;
                    if (b == null || (view = (View) this.a.get()) == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    f();
                }
            } catch (Throwable th) {
                c11.b(th, this);
            }
        }
    }

    public /* synthetic */ dn0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ dn0 b() {
        if (c11.d(dn0.class)) {
            return null;
        }
        try {
            return h;
        } catch (Throwable th) {
            c11.b(th, dn0.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (c11.d(dn0.class)) {
            return null;
        }
        try {
            return g;
        } catch (Throwable th) {
            c11.b(th, dn0.class);
            return null;
        }
    }

    public static final /* synthetic */ void d(dn0 dn0Var) {
        if (c11.d(dn0.class)) {
            return;
        }
        try {
            h = dn0Var;
        } catch (Throwable th) {
            c11.b(th, dn0.class);
        }
    }

    private final void g() {
        if (c11.d(this)) {
            return;
        }
        try {
            for (Activity activity : this.b) {
                if (activity != null) {
                    View e = sl.e(activity);
                    String simpleName = activity.getClass().getSimpleName();
                    zq3.g(simpleName, "activity.javaClass.simpleName");
                    this.c.add(new c(e, this.a, this.d, simpleName));
                }
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void i() {
        if (c11.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                g();
            } else {
                this.a.post(new Runnable() { // from class: cn0
                    @Override // java.lang.Runnable
                    public final void run() {
                        dn0.j(dn0.this);
                    }
                });
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(dn0 dn0Var) {
        if (c11.d(dn0.class)) {
            return;
        }
        try {
            zq3.h(dn0Var, "this$0");
            dn0Var.g();
        } catch (Throwable th) {
            c11.b(th, dn0.class);
        }
    }

    public final void e(Activity activity) {
        if (c11.d(this)) {
            return;
        }
        try {
            zq3.h(activity, "activity");
            if (sq3.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.b.add(activity);
            this.d.clear();
            HashSet hashSet = (HashSet) this.e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.d = hashSet;
            }
            i();
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void f(Activity activity) {
        if (c11.d(this)) {
            return;
        }
        try {
            zq3.h(activity, "activity");
            this.e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void h(Activity activity) {
        if (c11.d(this)) {
            return;
        }
        try {
            zq3.h(activity, "activity");
            if (sq3.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.b.remove(activity);
            this.c.clear();
            this.e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.d.clone());
            this.d.clear();
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private dn0() {
        this.a = new Handler(Looper.getMainLooper());
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        zq3.g(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.b = newSetFromMap;
        this.c = new LinkedHashSet();
        this.d = new HashSet();
        this.e = new HashMap();
    }
}
