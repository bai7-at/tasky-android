package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import defpackage.p50;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h37 implements bp7, p50.b {
    private final LottieDrawable a;
    private final String b;
    private final p50 c;
    private so7 d;

    public h37(LottieDrawable lottieDrawable, a aVar, g37 g37Var) {
        this.a = lottieDrawable;
        this.b = g37Var.c();
        p50 a = g37Var.b().a();
        this.c = a;
        aVar.i(a);
        a.a(this);
    }

    private static int e(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    private static int f(int i, int i2) {
        return i - (e(i, i2) * i2);
    }

    private so7 i(so7 so7Var) {
        List a = so7Var.a();
        boolean d = so7Var.d();
        int size = a.size() - 1;
        int i = 0;
        while (size >= 0) {
            w31 w31Var = (w31) a.get(size);
            w31 w31Var2 = (w31) a.get(f(size - 1, a.size()));
            PointF c = (size != 0 || d) ? w31Var2.c() : so7Var.b();
            i = (((size != 0 || d) ? w31Var2.b() : c).equals(c) && w31Var.a().equals(c) && !(!so7Var.d() && (size == 0 || size == a.size() - 1))) ? i + 2 : i + 1;
            size--;
        }
        so7 so7Var2 = this.d;
        if (so7Var2 == null || so7Var2.a().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new w31());
            }
            this.d = new so7(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.d.e(d);
        return this.d;
    }

    @Override // p50.b
    public void a() {
        this.a.invalidateSelf();
    }

    @Override // defpackage.tv0
    public void b(List list, List list2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (r6 != (r0.size() - 1)) goto L27;
     */
    @Override // defpackage.bp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.so7 c(defpackage.so7 r18) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h37.c(so7):so7");
    }

    public p50 g() {
        return this.c;
    }
}
