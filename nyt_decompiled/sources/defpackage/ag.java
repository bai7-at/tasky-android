package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class ag implements sp5 {
    private final PathMeasure a;

    public ag(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    @Override // defpackage.sp5
    public void a(ip5 ip5Var, boolean z) {
        Path path;
        PathMeasure pathMeasure = this.a;
        if (ip5Var == null) {
            path = null;
        } else {
            if (!(ip5Var instanceof zf)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            path = ((zf) ip5Var).c();
        }
        pathMeasure.setPath(path, z);
    }

    @Override // defpackage.sp5
    public boolean b(float f, float f2, ip5 ip5Var, boolean z) {
        PathMeasure pathMeasure = this.a;
        if (ip5Var instanceof zf) {
            return pathMeasure.getSegment(f, f2, ((zf) ip5Var).c(), z);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.sp5
    public float getLength() {
        return this.a.getLength();
    }
}
