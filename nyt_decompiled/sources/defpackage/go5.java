package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class go5 {
    static final c f = new a();
    private final List a;
    private final List b;
    private final SparseBooleanArray d = new SparseBooleanArray();
    private final Map c = new so();
    private final d e = a();

    static class a implements c {
        a() {
        }

        private boolean b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        private boolean c(float[] fArr) {
            float f = fArr[0];
            return f >= 10.0f && f <= 37.0f && fArr[1] <= 0.82f;
        }

        private boolean d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        @Override // go5.c
        public boolean a(int i, float[] fArr) {
            return (d(fArr) || b(fArr) || c(fArr)) ? false : true;
        }
    }

    public static final class b {
        private final List a;
        private final Bitmap b;
        private final List c;
        private int d;
        private int e;
        private int f;
        private final List g;
        private Rect h;

        public b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            this.d = 16;
            this.e = 12544;
            this.f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(go5.f);
            this.b = bitmap;
            this.a = null;
            arrayList.add(fg8.e);
            arrayList.add(fg8.f);
            arrayList.add(fg8.g);
            arrayList.add(fg8.h);
            arrayList.add(fg8.i);
            arrayList.add(fg8.j);
        }

        private int[] b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.h.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        private Bitmap d(Bitmap bitmap) {
            int max;
            int i;
            double d = -1.0d;
            if (this.e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.e;
                if (width > i2) {
                    d = Math.sqrt(i2 / width);
                }
            } else if (this.f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f)) {
                d = i / max;
            }
            return d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        }

        public go5 a() {
            List list;
            c[] cVarArr;
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                Bitmap d = d(bitmap);
                Rect rect = this.h;
                if (d != this.b && rect != null) {
                    double width = d.getWidth() / this.b.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), d.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), d.getHeight());
                }
                int[] b = b(d);
                int i = this.d;
                if (this.g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List list2 = this.g;
                    cVarArr = (c[]) list2.toArray(new c[list2.size()]);
                }
                on0 on0Var = new on0(b, i, cVarArr);
                if (d != this.b) {
                    d.recycle();
                }
                list = on0Var.d();
            } else {
                list = this.a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            go5 go5Var = new go5(list, this.c);
            go5Var.b();
            return go5Var;
        }

        public b c(int i) {
            this.d = i;
            return this;
        }
    }

    public interface c {
        boolean a(int i, float[] fArr);
    }

    public static final class d {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private boolean f;
        private int g;
        private int h;
        private float[] i;

        public d(int i, int i2) {
            this.a = Color.red(i);
            this.b = Color.green(i);
            this.c = Color.blue(i);
            this.d = i;
            this.e = i2;
        }

        private void a() {
            if (this.f) {
                return;
            }
            int g = qo0.g(-1, this.d, 4.5f);
            int g2 = qo0.g(-1, this.d, 3.0f);
            if (g != -1 && g2 != -1) {
                this.h = qo0.p(-1, g);
                this.g = qo0.p(-1, g2);
                this.f = true;
                return;
            }
            int g3 = qo0.g(-16777216, this.d, 4.5f);
            int g4 = qo0.g(-16777216, this.d, 3.0f);
            if (g3 == -1 || g4 == -1) {
                this.h = g != -1 ? qo0.p(-1, g) : qo0.p(-16777216, g3);
                this.g = g2 != -1 ? qo0.p(-1, g2) : qo0.p(-16777216, g4);
                this.f = true;
            } else {
                this.h = qo0.p(-16777216, g3);
                this.g = qo0.p(-16777216, g4);
                this.f = true;
            }
        }

        public int b() {
            a();
            return this.h;
        }

        public float[] c() {
            if (this.i == null) {
                this.i = new float[3];
            }
            qo0.a(this.a, this.b, this.c, this.i);
            return this.i;
        }

        public int d() {
            return this.e;
        }

        public int e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.e == dVar.e && this.d == dVar.d;
        }

        public int f() {
            a();
            return this.g;
        }

        public int hashCode() {
            return (this.d * 31) + this.e;
        }

        public String toString() {
            return d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + "] [HSL: " + Arrays.toString(c()) + "] [Population: " + this.e + "] [Title Text: #" + Integer.toHexString(f()) + "] [Body Text: #" + Integer.toHexString(b()) + ']';
        }
    }

    go5(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    private d a() {
        int size = this.a.size();
        int i = RecyclerView.UNDEFINED_DURATION;
        d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = (d) this.a.get(i2);
            if (dVar2.d() > i) {
                i = dVar2.d();
                dVar = dVar2;
            }
        }
        return dVar;
    }

    private float c(d dVar, fg8 fg8Var) {
        float[] c2 = dVar.c();
        d dVar2 = this.e;
        return (fg8Var.g() > 0.0f ? fg8Var.g() * (1.0f - Math.abs(c2[1] - fg8Var.i())) : 0.0f) + (fg8Var.a() > 0.0f ? fg8Var.a() * (1.0f - Math.abs(c2[2] - fg8Var.h())) : 0.0f) + (fg8Var.f() > 0.0f ? fg8Var.f() * (dVar.d() / (dVar2 != null ? dVar2.d() : 1)) : 0.0f);
    }

    private d d(fg8 fg8Var) {
        d e = e(fg8Var);
        if (e != null && fg8Var.j()) {
            this.d.append(e.e(), true);
        }
        return e;
    }

    private d e(fg8 fg8Var) {
        int size = this.a.size();
        float f2 = 0.0f;
        d dVar = null;
        for (int i = 0; i < size; i++) {
            d dVar2 = (d) this.a.get(i);
            if (g(dVar2, fg8Var)) {
                float c2 = c(dVar2, fg8Var);
                if (dVar == null || c2 > f2) {
                    dVar = dVar2;
                    f2 = c2;
                }
            }
        }
        return dVar;
    }

    private boolean g(d dVar, fg8 fg8Var) {
        float[] c2 = dVar.c();
        return c2[1] >= fg8Var.e() && c2[1] <= fg8Var.c() && c2[2] >= fg8Var.d() && c2[2] <= fg8Var.b() && !this.d.get(dVar.e());
    }

    void b() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            fg8 fg8Var = (fg8) this.b.get(i);
            fg8Var.k();
            this.c.put(fg8Var, d(fg8Var));
        }
        this.d.clear();
    }

    public List f() {
        return Collections.unmodifiableList(this.a);
    }
}
