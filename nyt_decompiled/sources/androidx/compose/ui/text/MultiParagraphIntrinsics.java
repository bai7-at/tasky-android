package androidx.compose.ui.text;

import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.e;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.c04;
import defpackage.fm1;
import defpackage.ko5;
import defpackage.lo5;
import defpackage.no5;
import defpackage.qs2;
import defpackage.uh8;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes.dex */
public final class MultiParagraphIntrinsics implements lo5 {
    private final a a;
    private final List b;
    private final c04 c;
    private final c04 d;
    private final List e;

    public MultiParagraphIntrinsics(a aVar, j jVar, List list, fm1 fm1Var, e.b bVar) {
        a n;
        List b;
        this.a = aVar;
        this.b = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$minIntrinsicWidth$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float mo865invoke() {
                Object obj;
                lo5 b2;
                List f = MultiParagraphIntrinsics.this.f();
                if (f.isEmpty()) {
                    obj = null;
                } else {
                    Object obj2 = f.get(0);
                    float b3 = ((ko5) obj2).b().b();
                    int n2 = kotlin.collections.i.n(f);
                    int i = 1;
                    if (1 <= n2) {
                        while (true) {
                            Object obj3 = f.get(i);
                            float b4 = ((ko5) obj3).b().b();
                            if (Float.compare(b3, b4) < 0) {
                                obj2 = obj3;
                                b3 = b4;
                            }
                            if (i == n2) {
                                break;
                            }
                            i++;
                        }
                    }
                    obj = obj2;
                }
                ko5 ko5Var = (ko5) obj;
                return Float.valueOf((ko5Var == null || (b2 = ko5Var.b()) == null) ? 0.0f : b2.b());
            }
        });
        this.d = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$maxIntrinsicWidth$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float mo865invoke() {
                Object obj;
                lo5 b2;
                List f = MultiParagraphIntrinsics.this.f();
                if (f.isEmpty()) {
                    obj = null;
                } else {
                    Object obj2 = f.get(0);
                    float a = ((ko5) obj2).b().a();
                    int n2 = kotlin.collections.i.n(f);
                    int i = 1;
                    if (1 <= n2) {
                        while (true) {
                            Object obj3 = f.get(i);
                            float a2 = ((ko5) obj3).b().a();
                            if (Float.compare(a, a2) < 0) {
                                obj2 = obj3;
                                a = a2;
                            }
                            if (i == n2) {
                                break;
                            }
                            i++;
                        }
                    }
                    obj = obj2;
                }
                ko5 ko5Var = (ko5) obj;
                return Float.valueOf((ko5Var == null || (b2 = ko5Var.b()) == null) ? 0.0f : b2.a());
            }
        });
        no5 Q = jVar.Q();
        List m = b.m(aVar, Q);
        ArrayList arrayList = new ArrayList(m.size());
        int size = m.size();
        for (int i = 0; i < size; i++) {
            a.b bVar2 = (a.b) m.get(i);
            n = b.n(aVar, bVar2.f(), bVar2.d());
            no5 h = h((no5) bVar2.e(), Q);
            String j = n.j();
            j M = jVar.M(h);
            List f = n.f();
            b = c.b(g(), bVar2.f(), bVar2.d());
            arrayList.add(new ko5(d.a(j, M, f, b, fm1Var, bVar), bVar2.f(), bVar2.d()));
        }
        this.e = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final no5 h(no5 no5Var, no5 no5Var2) {
        no5 a;
        if (!uh8.j(no5Var.i(), uh8.b.f())) {
            return no5Var;
        }
        a = no5Var.a((r22 & 1) != 0 ? no5Var.a : 0, (r22 & 2) != 0 ? no5Var.b : no5Var2.i(), (r22 & 4) != 0 ? no5Var.c : 0L, (r22 & 8) != 0 ? no5Var.d : null, (r22 & 16) != 0 ? no5Var.e : null, (r22 & 32) != 0 ? no5Var.f : null, (r22 & 64) != 0 ? no5Var.g : 0, (r22 & 128) != 0 ? no5Var.h : 0, (r22 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? no5Var.i : null);
        return a;
    }

    @Override // defpackage.lo5
    public float a() {
        return ((Number) this.d.getValue()).floatValue();
    }

    @Override // defpackage.lo5
    public float b() {
        return ((Number) this.c.getValue()).floatValue();
    }

    @Override // defpackage.lo5
    public boolean c() {
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((ko5) list.get(i)).b().c()) {
                return true;
            }
        }
        return false;
    }

    public final a e() {
        return this.a;
    }

    public final List f() {
        return this.e;
    }

    public final List g() {
        return this.b;
    }
}
