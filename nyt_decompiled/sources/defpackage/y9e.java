package defpackage;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class y9e {
    private final HashMap a = new HashMap();
    private final HashMap b = new HashMap();
    private final HashMap c = new HashMap();
    private final HashSet d = new HashSet();
    private final HashSet e = new HashSet();
    private final HashSet f = new HashSet();
    private final HashMap g = new HashMap();
    private final Map h = new WeakHashMap();
    private boolean i;

    public final View a(String str) {
        return (View) this.c.get(str);
    }

    public final x9e b(View view) {
        x9e x9eVar = (x9e) this.b.get(view);
        if (x9eVar != null) {
            this.b.remove(view);
        }
        return x9eVar;
    }

    public final String c(String str) {
        return (String) this.g.get(str);
    }

    public final String d(View view) {
        if (this.a.size() == 0) {
            return null;
        }
        String str = (String) this.a.get(view);
        if (str != null) {
            this.a.remove(view);
        }
        return str;
    }

    public final HashSet e() {
        return this.f;
    }

    public final HashSet f() {
        return this.e;
    }

    public final void g() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.i = false;
    }

    public final void h() {
        this.i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        Boolean bool;
        String str;
        v8e a = v8e.a();
        if (a != null) {
            for (n8e n8eVar : a.b()) {
                View f = n8eVar.f();
                if (n8eVar.j()) {
                    String h = n8eVar.h();
                    if (f != null) {
                        if (f.isAttachedToWindow()) {
                            if (f.hasWindowFocus()) {
                                this.h.remove(f);
                                bool = Boolean.FALSE;
                            } else if (this.h.containsKey(f)) {
                                bool = (Boolean) this.h.get(f);
                            } else {
                                Map map = this.h;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(f, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue()) {
                                HashSet hashSet = new HashSet();
                                View view = f;
                                while (true) {
                                    if (view == null) {
                                        this.d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String a2 = w9e.a(view);
                                    if (a2 != null) {
                                        str = a2;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.e.add(h);
                            this.a.put(f, h);
                            for (y8e y8eVar : n8eVar.i()) {
                                View view2 = (View) y8eVar.b().get();
                                if (view2 != null) {
                                    x9e x9eVar = (x9e) this.b.get(view2);
                                    if (x9eVar != null) {
                                        x9eVar.c(n8eVar.h());
                                    } else {
                                        this.b.put(view2, new x9e(y8eVar, n8eVar.h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f.add(h);
                            this.c.put(h, f);
                            this.g.put(h, str);
                        }
                    } else {
                        this.f.add(h);
                        this.g.put(h, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean j(View view) {
        if (!this.h.containsKey(view)) {
            return true;
        }
        this.h.put(view, Boolean.TRUE);
        return false;
    }

    public final int k(View view) {
        if (this.d.contains(view)) {
            return 1;
        }
        return this.i ? 2 : 3;
    }
}
