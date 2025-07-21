package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class zw6 implements sp1 {
    private final AndroidComposeView a;
    private final RenderNode b = new RenderNode("Compose");
    private int c = a.a.a();

    public zw6(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    @Override // defpackage.sp1
    public void A(boolean z) {
        this.b.setClipToBounds(z);
    }

    @Override // defpackage.sp1
    public boolean B(int i, int i2, int i3, int i4) {
        return this.b.setPosition(i, i2, i3, i4);
    }

    @Override // defpackage.sp1
    public void C() {
        this.b.discardDisplayList();
    }

    @Override // defpackage.sp1
    public void D(float f) {
        this.b.setElevation(f);
    }

    @Override // defpackage.sp1
    public void E(int i) {
        this.b.offsetTopAndBottom(i);
    }

    @Override // defpackage.sp1
    public boolean F() {
        return this.b.hasDisplayList();
    }

    @Override // defpackage.sp1
    public boolean G() {
        return this.b.getClipToBounds();
    }

    @Override // defpackage.sp1
    public int H() {
        return this.b.getTop();
    }

    @Override // defpackage.sp1
    public void I(th0 th0Var, ip5 ip5Var, ss2 ss2Var) {
        RecordingCanvas beginRecording = this.b.beginRecording();
        Canvas a = th0Var.a().a();
        th0Var.a().z(beginRecording);
        vd a2 = th0Var.a();
        if (ip5Var != null) {
            a2.t();
            ph0.m(a2, ip5Var, 0, 2, null);
        }
        ss2Var.invoke(a2);
        if (ip5Var != null) {
            a2.k();
        }
        th0Var.a().z(a);
        this.b.endRecording();
    }

    @Override // defpackage.sp1
    public boolean J() {
        return this.b.getClipToOutline();
    }

    @Override // defpackage.sp1
    public boolean K(boolean z) {
        return this.b.setHasOverlappingRendering(z);
    }

    @Override // defpackage.sp1
    public void L(Matrix matrix) {
        this.b.getMatrix(matrix);
    }

    @Override // defpackage.sp1
    public void M(int i) {
        this.b.offsetLeftAndRight(i);
    }

    @Override // defpackage.sp1
    public int N() {
        return this.b.getBottom();
    }

    @Override // defpackage.sp1
    public void O(float f) {
        this.b.setPivotX(f);
    }

    @Override // defpackage.sp1
    public void P(float f) {
        this.b.setPivotY(f);
    }

    @Override // defpackage.sp1
    public void Q(Outline outline) {
        this.b.setOutline(outline);
    }

    @Override // defpackage.sp1
    public void R(int i) {
        this.b.setAmbientShadowColor(i);
    }

    @Override // defpackage.sp1
    public void S(boolean z) {
        this.b.setClipToOutline(z);
    }

    @Override // defpackage.sp1
    public void T(int i) {
        this.b.setSpotShadowColor(i);
    }

    @Override // defpackage.sp1
    public float U() {
        return this.b.getElevation();
    }

    @Override // defpackage.sp1
    public float a() {
        return this.b.getAlpha();
    }

    @Override // defpackage.sp1
    public void c(float f) {
        this.b.setAlpha(f);
    }

    @Override // defpackage.sp1
    public int d() {
        return this.b.getLeft();
    }

    @Override // defpackage.sp1
    public void g(float f) {
        this.b.setTranslationY(f);
    }

    @Override // defpackage.sp1
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // defpackage.sp1
    public int getWidth() {
        return this.b.getWidth();
    }

    @Override // defpackage.sp1
    public void h(yw6 yw6Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            bx6.a.a(this.b, yw6Var);
        }
    }

    @Override // defpackage.sp1
    public void j(int i) {
        RenderNode renderNode = this.b;
        a.C0056a c0056a = a.a;
        if (a.e(i, c0056a.c())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (a.e(i, c0056a.b())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.c = i;
    }

    @Override // defpackage.sp1
    public void n(float f) {
        this.b.setScaleX(f);
    }

    @Override // defpackage.sp1
    public void p(float f) {
        this.b.setCameraDistance(f);
    }

    @Override // defpackage.sp1
    public void q(float f) {
        this.b.setRotationX(f);
    }

    @Override // defpackage.sp1
    public void r(float f) {
        this.b.setRotationY(f);
    }

    @Override // defpackage.sp1
    public void s(float f) {
        this.b.setRotationZ(f);
    }

    @Override // defpackage.sp1
    public void t(float f) {
        this.b.setScaleY(f);
    }

    @Override // defpackage.sp1
    public void x(float f) {
        this.b.setTranslationX(f);
    }

    @Override // defpackage.sp1
    public int y() {
        return this.b.getRight();
    }

    @Override // defpackage.sp1
    public void z(Canvas canvas) {
        canvas.drawRenderNode(this.b);
    }
}
