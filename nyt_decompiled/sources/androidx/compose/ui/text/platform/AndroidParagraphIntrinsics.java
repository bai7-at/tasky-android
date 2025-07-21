package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.font.w;
import androidx.compose.ui.text.j;
import defpackage.fm1;
import defpackage.jy7;
import defpackage.kt2;
import defpackage.lj8;
import defpackage.lo5;
import defpackage.lz3;
import defpackage.mg;
import defpackage.sz1;
import defpackage.vf;
import defpackage.wf;
import defpackage.x08;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics implements lo5 {
    private final String a;
    private final j b;
    private final List c;
    private final List d;
    private final e.b e;
    private final fm1 f;
    private final mg g;
    private final CharSequence h;
    private final lz3 i;
    private a j;
    private final boolean k;
    private final int l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    public AndroidParagraphIntrinsics(String str, j jVar, List list, List list2, e.b bVar, fm1 fm1Var) {
        boolean c;
        this.a = str;
        this.b = jVar;
        this.c = list;
        this.d = list2;
        this.e = bVar;
        this.f = fm1Var;
        mg mgVar = new mg(1, fm1Var.getDensity());
        this.g = mgVar;
        c = wf.c(jVar);
        this.k = !c ? false : ((Boolean) sz1.a.a().getValue()).booleanValue();
        this.l = wf.d(jVar.F(), jVar.y());
        kt2 kt2Var = new kt2() { // from class: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1
            {
                super(4);
            }

            public final Typeface b(e eVar, o oVar, int i, int i2) {
                a aVar;
                x08 a = AndroidParagraphIntrinsics.this.g().a(eVar, oVar, i, i2);
                if (a instanceof w.b) {
                    Object value = a.getValue();
                    zq3.f(value, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) value;
                }
                aVar = AndroidParagraphIntrinsics.this.j;
                a aVar2 = new a(a, aVar);
                AndroidParagraphIntrinsics.this.j = aVar2;
                return aVar2.a();
            }

            @Override // defpackage.kt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return b((e) obj, (o) obj2, ((l) obj3).i(), ((m) obj4).m());
            }
        };
        lj8.e(mgVar, jVar.I());
        jy7 a = lj8.a(mgVar, jVar.R(), kt2Var, fm1Var, !((Collection) list).isEmpty());
        if (a != null) {
            int size = list.size() + 1;
            list = new ArrayList(size);
            int i = 0;
            while (i < size) {
                list.add(i == 0 ? new a.b(a, 0, this.a.length()) : (a.b) this.c.get(i - 1));
                i++;
            }
        }
        CharSequence a2 = vf.a(this.a, this.g.getTextSize(), this.b, list, this.d, this.f, kt2Var, this.k);
        this.h = a2;
        this.i = new lz3(a2, this.g, this.l);
    }

    @Override // defpackage.lo5
    public float a() {
        return this.i.b();
    }

    @Override // defpackage.lo5
    public float b() {
        return this.i.c();
    }

    @Override // defpackage.lo5
    public boolean c() {
        boolean c;
        a aVar = this.j;
        if (!(aVar != null ? aVar.b() : false)) {
            if (this.k) {
                return false;
            }
            c = wf.c(this.b);
            if (!c || !((Boolean) sz1.a.a().getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final CharSequence f() {
        return this.h;
    }

    public final e.b g() {
        return this.e;
    }

    public final lz3 h() {
        return this.i;
    }

    public final j i() {
        return this.b;
    }

    public final int j() {
        return this.l;
    }

    public final mg k() {
        return this.g;
    }
}
