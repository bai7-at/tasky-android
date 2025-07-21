package defpackage;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class l23 extends AbstractList {
    public static final b g = new b(null);
    private static final AtomicInteger h = new AtomicInteger();
    private Handler a;
    private int b;
    private final String c;
    private List d;
    private List e;
    private String f;

    public interface a {
        void a(l23 l23Var);
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public l23(Collection collection) {
        zq3.h(collection, "requests");
        this.c = String.valueOf(h.incrementAndGet());
        this.e = new ArrayList();
        this.d = new ArrayList(collection);
    }

    private final List j() {
        return GraphRequest.n.i(this);
    }

    private final k23 n() {
        return GraphRequest.n.l(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ GraphRequest remove(int i) {
        return C(i);
    }

    public /* bridge */ boolean B(GraphRequest graphRequest) {
        return super.remove(graphRequest);
    }

    public GraphRequest C(int i) {
        return (GraphRequest) this.d.remove(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public GraphRequest set(int i, GraphRequest graphRequest) {
        zq3.h(graphRequest, "element");
        return (GraphRequest) this.d.set(i, graphRequest);
    }

    public final void E(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i, GraphRequest graphRequest) {
        zq3.h(graphRequest, "element");
        this.d.add(i, graphRequest);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(GraphRequest graphRequest) {
        zq3.h(graphRequest, "element");
        return this.d.add(graphRequest);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return f((GraphRequest) obj);
        }
        return false;
    }

    public final void e(a aVar) {
        zq3.h(aVar, "callback");
        if (this.e.contains(aVar)) {
            return;
        }
        this.e.add(aVar);
    }

    public /* bridge */ boolean f(GraphRequest graphRequest) {
        return super.contains(graphRequest);
    }

    public final List g() {
        return j();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return y((GraphRequest) obj);
        }
        return -1;
    }

    public final k23 k() {
        return n();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return z((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public GraphRequest get(int i) {
        return (GraphRequest) this.d.get(i);
    }

    public final String p() {
        return this.f;
    }

    public final Handler q() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return w();
    }

    public final List t() {
        return this.e;
    }

    public final String u() {
        return this.c;
    }

    public final List v() {
        return this.d;
    }

    public int w() {
        return this.d.size();
    }

    public final int x() {
        return this.b;
    }

    public /* bridge */ int y(GraphRequest graphRequest) {
        return super.indexOf(graphRequest);
    }

    public /* bridge */ int z(GraphRequest graphRequest) {
        return super.lastIndexOf(graphRequest);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return B((GraphRequest) obj);
        }
        return false;
    }

    public l23(GraphRequest... graphRequestArr) {
        zq3.h(graphRequestArr, "requests");
        this.c = String.valueOf(h.incrementAndGet());
        this.e = new ArrayList();
        this.d = new ArrayList(d.e(graphRequestArr));
    }
}
