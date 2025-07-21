package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.y;
import defpackage.al;
import defpackage.fe6;
import defpackage.kf6;
import defpackage.nc6;
import defpackage.qo0;
import defpackage.rd6;

/* loaded from: classes.dex */
public final class j {
    private static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private static j c;
    private y a;

    class a implements y.c {
        private final int[] a = {kf6.abc_textfield_search_default_mtrl_alpha, kf6.abc_textfield_default_mtrl_alpha, kf6.abc_ab_share_pack_mtrl_alpha};
        private final int[] b = {kf6.abc_ic_commit_search_api_mtrl_alpha, kf6.abc_seekbar_tick_mark_material, kf6.abc_ic_menu_share_mtrl_alpha, kf6.abc_ic_menu_copy_mtrl_am_alpha, kf6.abc_ic_menu_cut_mtrl_alpha, kf6.abc_ic_menu_selectall_mtrl_alpha, kf6.abc_ic_menu_paste_mtrl_am_alpha};
        private final int[] c = {kf6.abc_textfield_activated_mtrl_alpha, kf6.abc_textfield_search_activated_mtrl_alpha, kf6.abc_cab_background_top_mtrl_alpha, kf6.abc_text_cursor_material, kf6.abc_text_select_handle_left_mtrl, kf6.abc_text_select_handle_middle_mtrl, kf6.abc_text_select_handle_right_mtrl};
        private final int[] d = {kf6.abc_popup_background_mtrl_mult, kf6.abc_cab_background_internal_bg, kf6.abc_menu_hardkey_panel_mtrl_mult};
        private final int[] e = {kf6.abc_tab_indicator_material, kf6.abc_textfield_search_material};
        private final int[] f = {kf6.abc_btn_check_material, kf6.abc_btn_radio_material, kf6.abc_btn_check_material_anim, kf6.abc_btn_radio_material_anim};

        a() {
        }

        private boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i) {
            int c = d0.c(context, nc6.colorControlHighlight);
            return new ColorStateList(new int[][]{d0.b, d0.e, d0.c, d0.i}, new int[]{d0.b(context, nc6.colorButtonNormal), qo0.k(c, i), qo0.k(c, i), i});
        }

        private ColorStateList i(Context context) {
            return h(context, d0.c(context, nc6.colorAccent));
        }

        private ColorStateList j(Context context) {
            return h(context, d0.c(context, nc6.colorButtonNormal));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList e = d0.e(context, nc6.colorSwitchThumbNormal);
            if (e == null || !e.isStateful()) {
                iArr[0] = d0.b;
                iArr2[0] = d0.b(context, nc6.colorSwitchThumbNormal);
                iArr[1] = d0.f;
                iArr2[1] = d0.c(context, nc6.colorControlActivated);
                iArr[2] = d0.i;
                iArr2[2] = d0.c(context, nc6.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = d0.b;
                iArr[0] = iArr3;
                iArr2[0] = e.getColorForState(iArr3, 0);
                iArr[1] = d0.f;
                iArr2[1] = d0.c(context, nc6.colorControlActivated);
                iArr[2] = d0.i;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(y yVar, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable i2 = yVar.i(context, kf6.abc_star_black_48dp);
            Drawable i3 = yVar.i(context, kf6.abc_star_half_black_48dp);
            if ((i2 instanceof BitmapDrawable) && i2.getIntrinsicWidth() == dimensionPixelSize && i2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) i2;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                i2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i2.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((i3 instanceof BitmapDrawable) && i3.getIntrinsicWidth() == dimensionPixelSize && i3.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) i3;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                i3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i3.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (w.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.b;
            }
            drawable.setColorFilter(j.e(i, mode));
        }

        @Override // androidx.appcompat.widget.y.c
        public Drawable a(y yVar, Context context, int i) {
            if (i == kf6.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{yVar.i(context, kf6.abc_cab_background_internal_bg), yVar.i(context, kf6.abc_cab_background_top_mtrl_alpha)});
            }
            if (i == kf6.abc_ratingbar_material) {
                return l(yVar, context, fe6.abc_star_big);
            }
            if (i == kf6.abc_ratingbar_indicator_material) {
                return l(yVar, context, fe6.abc_star_medium);
            }
            if (i == kf6.abc_ratingbar_small_material) {
                return l(yVar, context, fe6.abc_star_small);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.y.c
        public ColorStateList b(Context context, int i) {
            if (i == kf6.abc_edit_text_material) {
                return al.a(context, rd6.abc_tint_edittext);
            }
            if (i == kf6.abc_switch_track_mtrl_alpha) {
                return al.a(context, rd6.abc_tint_switch_track);
            }
            if (i == kf6.abc_switch_thumb_material) {
                return k(context);
            }
            if (i == kf6.abc_btn_default_mtrl_shape) {
                return j(context);
            }
            if (i == kf6.abc_btn_borderless_material) {
                return g(context);
            }
            if (i == kf6.abc_btn_colored_material) {
                return i(context);
            }
            if (i == kf6.abc_spinner_mtrl_am_alpha || i == kf6.abc_spinner_textfield_background_material) {
                return al.a(context, rd6.abc_tint_spinner);
            }
            if (f(this.b, i)) {
                return d0.e(context, nc6.colorControlNormal);
            }
            if (f(this.e, i)) {
                return al.a(context, rd6.abc_tint_default);
            }
            if (f(this.f, i)) {
                return al.a(context, rd6.abc_tint_btn_checkable);
            }
            if (i == kf6.abc_seekbar_thumb_material) {
                return al.a(context, rd6.abc_tint_seek_thumb);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
        @Override // androidx.appcompat.widget.y.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean c(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.a()
                int[] r1 = r6.a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L14
                int r6 = defpackage.nc6.colorControlNormal
            L11:
                r1 = r2
            L12:
                r8 = r4
                goto L49
            L14:
                int[] r1 = r6.c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L1f
                int r6 = defpackage.nc6.colorControlActivated
                goto L11
            L1f:
                int[] r1 = r6.d
                boolean r6 = r6.f(r1, r8)
                r1 = 16842801(0x1010031, float:2.3693695E-38)
                if (r6 == 0) goto L2e
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2c:
                r6 = r1
                goto L11
            L2e:
                int r6 = defpackage.kf6.abc_list_divider_mtrl_alpha
                if (r8 != r6) goto L41
                r6 = 1109603123(0x42233333, float:40.8)
                int r6 = java.lang.Math.round(r6)
                r8 = 16842800(0x1010030, float:2.3693693E-38)
                r1 = r2
                r5 = r8
                r8 = r6
                r6 = r5
                goto L49
            L41:
                int r6 = defpackage.kf6.abc_dialog_material_background
                if (r8 != r6) goto L46
                goto L2c
            L46:
                r6 = r3
                r1 = r6
                goto L12
            L49:
                if (r1 == 0) goto L66
                boolean r1 = androidx.appcompat.widget.w.a(r9)
                if (r1 == 0) goto L55
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L55:
                int r6 = androidx.appcompat.widget.d0.c(r7, r6)
                android.graphics.PorterDuffColorFilter r6 = androidx.appcompat.widget.j.e(r6, r0)
                r9.setColorFilter(r6)
                if (r8 == r4) goto L65
                r9.setAlpha(r8)
            L65:
                return r2
            L66:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.y.c
        public PorterDuff.Mode d(int i) {
            if (i == kf6.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.y.c
        public boolean e(Context context, int i, Drawable drawable) {
            if (i == kf6.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), d0.c(context, nc6.colorControlNormal), j.b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), d0.c(context, nc6.colorControlNormal), j.b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), d0.c(context, nc6.colorControlActivated), j.b);
                return true;
            }
            if (i != kf6.abc_ratingbar_material && i != kf6.abc_ratingbar_indicator_material && i != kf6.abc_ratingbar_small_material) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), d0.b(context, nc6.colorControlNormal), j.b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), d0.c(context, nc6.colorControlActivated), j.b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), d0.c(context, nc6.colorControlActivated), j.b);
            return true;
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            try {
                if (c == null) {
                    h();
                }
                jVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter k;
        synchronized (j.class) {
            k = y.k(i, mode);
        }
        return k;
    }

    public static synchronized void h() {
        synchronized (j.class) {
            if (c == null) {
                j jVar = new j();
                c = jVar;
                jVar.a = y.g();
                c.a.t(new a());
            }
        }
    }

    static void i(Drawable drawable, f0 f0Var, int[] iArr) {
        y.v(drawable, f0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i) {
        return this.a.i(context, i);
    }

    synchronized Drawable d(Context context, int i, boolean z) {
        return this.a.j(context, i, z);
    }

    synchronized ColorStateList f(Context context, int i) {
        return this.a.l(context, i);
    }

    public synchronized void g(Context context) {
        this.a.r(context);
    }
}
