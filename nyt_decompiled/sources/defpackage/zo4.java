package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class zo4 extends FrameLayout {
    private boolean a;
    private ImageView.ScaleType b;
    private boolean c;
    private jla d;
    private ebb e;

    public zo4(Context context) {
        super(context);
    }

    protected final synchronized void a(jla jlaVar) {
        this.d = jlaVar;
        if (this.a) {
            jlaVar.a.b(null);
        }
    }

    protected final synchronized void b(ebb ebbVar) {
        this.e = ebbVar;
        if (this.c) {
            ebbVar.a.c(this.b);
        }
    }

    public vh4 getMediaContent() {
        return null;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.c = true;
        this.b = scaleType;
        ebb ebbVar = this.e;
        if (ebbVar != null) {
            ebbVar.a.c(scaleType);
        }
    }

    public void setMediaContent(vh4 vh4Var) {
        boolean F;
        this.a = true;
        jla jlaVar = this.d;
        if (jlaVar != null) {
            jlaVar.a.b(vh4Var);
        }
        if (vh4Var == null) {
            return;
        }
        try {
            jua zza = vh4Var.zza();
            if (zza != null) {
                if (!vh4Var.a()) {
                    if (vh4Var.zzb()) {
                        F = zza.F(fc5.l3(this));
                    }
                    removeAllViews();
                }
                F = zza.c0(fc5.l3(this));
                if (F) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e) {
            removeAllViews();
            fgb.e("", e);
        }
    }
}
