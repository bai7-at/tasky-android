package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class pq4 implements lp5, j33 {
    private final String d;
    private final MergePaths f;
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List e = new ArrayList();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public pq4(MergePaths mergePaths) {
        this.d = mergePaths.c();
        this.f = mergePaths;
    }

    private void a() {
        for (int i = 0; i < this.e.size(); i++) {
            this.c.addPath(((lp5) this.e.get(i)).getPath());
        }
    }

    private void f(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.e.size() - 1; size >= 1; size--) {
            lp5 lp5Var = (lp5) this.e.get(size);
            if (lp5Var instanceof zv0) {
                zv0 zv0Var = (zv0) lp5Var;
                List k = zv0Var.k();
                for (int size2 = k.size() - 1; size2 >= 0; size2--) {
                    Path path = ((lp5) k.get(size2)).getPath();
                    path.transform(zv0Var.l());
                    this.b.addPath(path);
                }
            } else {
                this.b.addPath(lp5Var.getPath());
            }
        }
        lp5 lp5Var2 = (lp5) this.e.get(0);
        if (lp5Var2 instanceof zv0) {
            zv0 zv0Var2 = (zv0) lp5Var2;
            List k2 = zv0Var2.k();
            for (int i = 0; i < k2.size(); i++) {
                Path path2 = ((lp5) k2.get(i)).getPath();
                path2.transform(zv0Var2.l());
                this.a.addPath(path2);
            }
        } else {
            this.a.set(lp5Var2.getPath());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override // defpackage.tv0
    public void b(List list, List list2) {
        for (int i = 0; i < this.e.size(); i++) {
            ((lp5) this.e.get(i)).b(list, list2);
        }
    }

    @Override // defpackage.j33
    public void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            tv0 tv0Var = (tv0) listIterator.previous();
            if (tv0Var instanceof lp5) {
                this.e.add((lp5) tv0Var);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.lp5
    public Path getPath() {
        this.c.reset();
        if (this.f.d()) {
            return this.c;
        }
        int i = a.a[this.f.b().ordinal()];
        if (i == 1) {
            a();
        } else if (i == 2) {
            f(Path.Op.UNION);
        } else if (i == 3) {
            f(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            f(Path.Op.INTERSECT);
        } else if (i == 5) {
            f(Path.Op.XOR);
        }
        return this.c;
    }
}
