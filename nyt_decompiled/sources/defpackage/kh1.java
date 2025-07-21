package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.flv.b;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class kh1 implements d82 {
    private static final int[] o = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    private static final a p = new a(new a.InterfaceC0495a() { // from class: ih1
        @Override // kh1.a.InterfaceC0495a
        public final Constructor a() {
            Constructor h;
            h = kh1.h();
            return h;
        }
    });
    private static final a q = new a(new a.InterfaceC0495a() { // from class: jh1
        @Override // kh1.a.InterfaceC0495a
        public final Constructor a() {
            Constructor i;
            i = kh1.i();
            return i;
        }
    });
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int l;
    private ImmutableList m;
    private int k = 1;
    private int n = 112800;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private final InterfaceC0495a a;
        private final AtomicBoolean b = new AtomicBoolean(false);
        private Constructor c;

        /* renamed from: kh1$a$a, reason: collision with other inner class name */
        public interface InterfaceC0495a {
            Constructor a();
        }

        public a(InterfaceC0495a interfaceC0495a) {
            this.a = interfaceC0495a;
        }

        private Constructor b() {
            synchronized (this.b) {
                if (this.b.get()) {
                    return this.c;
                }
                try {
                    return this.a.a();
                } catch (ClassNotFoundException unused) {
                    this.b.set(true);
                    return this.c;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }

        public y72 a(Object... objArr) {
            Constructor b = b();
            if (b == null) {
                return null;
            }
            try {
                return (y72) b.newInstance(objArr);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating extractor", e);
            }
        }
    }

    private void g(int i, List list) {
        switch (i) {
            case 0:
                list.add(new g2());
                break;
            case 1:
                list.add(new k2());
                break;
            case 2:
                list.add(new l9(this.d | (this.b ? 1 : 0) | (this.c ? 2 : 0)));
                break;
            case 3:
                list.add(new ec(this.e | (this.b ? 1 : 0) | (this.c ? 2 : 0)));
                break;
            case 4:
                y72 a2 = p.a(Integer.valueOf(this.f));
                if (a2 == null) {
                    list.add(new ck2(this.f));
                    break;
                } else {
                    list.add(a2);
                    break;
                }
            case 5:
                list.add(new b());
                break;
            case 6:
                list.add(new og4(this.g));
                break;
            case 7:
                list.add(new ow4(this.j | (this.b ? 1 : 0) | (this.c ? 2 : 0)));
                break;
            case 8:
                list.add(new oq2(this.i));
                list.add(new rw4(this.h));
                break;
            case 9:
                list.add(new ld5());
                break;
            case 10:
                list.add(new v76());
                break;
            case 11:
                if (this.m == null) {
                    this.m = ImmutableList.x();
                }
                list.add(new rt8(this.k, new qm8(0L), new vk1(this.l, this.m), this.n));
                break;
            case 12:
                list.add(new wc9());
                break;
            case 14:
                list.add(new zs3());
                break;
            case 15:
                y72 a3 = q.a(new Object[0]);
                if (a3 != null) {
                    list.add(a3);
                    break;
                }
                break;
            case 16:
                list.add(new x20());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor h() {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(y72.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor i() {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(y72.class).getConstructor(null);
    }

    @Override // defpackage.d82
    public synchronized y72[] b(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = o;
            arrayList = new ArrayList(iArr.length);
            int b = gf2.b(map);
            if (b != -1) {
                g(b, arrayList);
            }
            int c = gf2.c(uri);
            if (c != -1 && c != b) {
                g(c, arrayList);
            }
            for (int i : iArr) {
                if (i != b && i != c) {
                    g(i, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (y72[]) arrayList.toArray(new y72[arrayList.size()]);
    }

    @Override // defpackage.d82
    public synchronized y72[] c() {
        return b(Uri.EMPTY, new HashMap());
    }
}
