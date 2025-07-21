package defpackage;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ur6 implements dd9 {
    public static final a c = new a(null);
    private final LinkedHashMap a = new LinkedHashMap();
    private int b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {
        private final int a;
        private final WeakReference b;
        private final Map c;
        private final int d;

        public b(int i, WeakReference weakReference, Map map, int i2) {
            this.a = i;
            this.b = weakReference;
            this.c = map;
            this.d = i2;
        }

        public final WeakReference a() {
            return this.b;
        }

        public final Map b() {
            return this.c;
        }

        public final int c() {
            return this.a;
        }

        public final int d() {
            return this.d;
        }
    }

    private final void e() {
        int i = this.b;
        this.b = i + 1;
        if (i >= 10) {
            d();
        }
    }

    @Override // defpackage.dd9
    public synchronized void a(int i) {
        if (i >= 10 && i != 20) {
            d();
        }
    }

    @Override // defpackage.dd9
    public synchronized MemoryCache.b b(MemoryCache.Key key) {
        try {
            ArrayList arrayList = (ArrayList) this.a.get(key);
            MemoryCache.b bVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                b bVar2 = (b) arrayList.get(i);
                Bitmap bitmap = (Bitmap) bVar2.a().get();
                MemoryCache.b bVar3 = bitmap != null ? new MemoryCache.b(bitmap, bVar2.b()) : null;
                if (bVar3 != null) {
                    bVar = bVar3;
                    break;
                }
                i++;
            }
            e();
            return bVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.dd9
    public synchronized void c(MemoryCache.Key key, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = this.a;
            Object obj = linkedHashMap.get(key);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(key, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            b bVar = new b(identityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList.add(bVar);
                    break;
                }
                b bVar2 = (b) arrayList.get(i2);
                if (i < bVar2.d()) {
                    i2++;
                } else if (bVar2.c() == identityHashCode && bVar2.a().get() == bitmap) {
                    arrayList.set(i2, bVar);
                } else {
                    arrayList.add(i2, bVar);
                }
            }
            e();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        WeakReference a2;
        this.b = 0;
        Iterator it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            ArrayList arrayList = (ArrayList) it2.next();
            if (arrayList.size() <= 1) {
                b bVar = (b) i.m0(arrayList);
                if (((bVar == null || (a2 = bVar.a()) == null) ? null : (Bitmap) a2.get()) == null) {
                    it2.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((b) arrayList.get(i3)).a().get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it2.remove();
                }
            }
        }
    }
}
