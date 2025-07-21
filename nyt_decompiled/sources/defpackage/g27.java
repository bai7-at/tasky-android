package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.material.ripple.AndroidRippleIndicationInstance;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class g27 extends ViewGroup {
    private final int a;
    private final List b;
    private final List c;
    private final i27 d;
    private int e;

    public g27(Context context) {
        super(context);
        this.a = 5;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.d = new i27();
        setClipChildren(false);
        k27 k27Var = new k27(context);
        addView(k27Var);
        arrayList.add(k27Var);
        arrayList2.add(k27Var);
        this.e = 1;
        setTag(kg6.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        androidRippleIndicationInstance.o();
        k27 a = this.d.a(androidRippleIndicationInstance);
        if (a != null) {
            a.d();
            this.d.c(androidRippleIndicationInstance);
            this.c.add(a);
        }
    }

    public final k27 b(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        k27 a = this.d.a(androidRippleIndicationInstance);
        if (a != null) {
            return a;
        }
        k27 k27Var = (k27) i.K(this.c);
        if (k27Var == null) {
            if (this.e > i.n(this.b)) {
                k27Var = new k27(getContext());
                addView(k27Var);
                this.b.add(k27Var);
            } else {
                k27Var = (k27) this.b.get(this.e);
                AndroidRippleIndicationInstance b = this.d.b(k27Var);
                if (b != null) {
                    b.o();
                    this.d.c(b);
                    k27Var.d();
                }
            }
            int i = this.e;
            if (i < this.a - 1) {
                this.e = i + 1;
            } else {
                this.e = 0;
            }
        }
        this.d.d(androidRippleIndicationInstance, k27Var);
        return k27Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
