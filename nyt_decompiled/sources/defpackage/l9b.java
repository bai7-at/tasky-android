package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.chartbeat.androidsdk.QueryKeys;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class l9b {
    public static Point a(MotionEvent motionEvent, View view) {
        int[] j = j(view);
        return new Point(((int) motionEvent.getRawX()) - j[0], ((int) motionEvent.getRawY()) - j[1]);
    }

    public static WindowManager.LayoutParams b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) pla.c().a(mpa.T7)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject c(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put(QueryKeys.SCROLL_POSITION_TOP, kia.b().e(context, point2.x));
                jSONObject3.put(QueryKeys.CONTENT_HEIGHT, kia.b().e(context, point2.y));
                jSONObject3.put("start_x", kia.b().e(context, point.x));
                jSONObject3.put("start_y", kia.b().e(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e2) {
                fgb.e("Error occurred while putting signals into JSON object.", e2);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            jSONObject2 = jSONObject;
            fgb.e("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static JSONObject d(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject3 = new JSONObject();
        if (map != null && view != null) {
            int[] j = j(view);
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] j2 = j(view2);
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    Iterator it3 = it2;
                    try {
                        JSONObject jSONObject6 = jSONObject3;
                        try {
                            jSONObject5.put("width", kia.b().e(context, view2.getMeasuredWidth()));
                            jSONObject5.put("height", kia.b().e(context, view2.getMeasuredHeight()));
                            jSONObject5.put(QueryKeys.SCROLL_POSITION_TOP, kia.b().e(context, j2[0] - j[0]));
                            jSONObject5.put(QueryKeys.CONTENT_HEIGHT, kia.b().e(context, j2[1] - j[1]));
                            jSONObject5.put(str4, str3);
                            jSONObject4.put("frame", jSONObject5);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject2 = k(context, rect);
                            } else {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("width", 0);
                                jSONObject2.put("height", 0);
                                jSONObject2.put(QueryKeys.SCROLL_POSITION_TOP, kia.b().e(context, j2[0] - j[0]));
                                jSONObject2.put(QueryKeys.CONTENT_HEIGHT, kia.b().e(context, j2[1] - j[1]));
                                jSONObject2.put(str4, str3);
                            }
                            jSONObject4.put("visible_bounds", jSONObject2);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) pla.c().a(mpa.N7)).booleanValue()) {
                                    jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) pla.c().a(mpa.O7)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject4.put("view_width_layout_type", l(layoutParams.width) - 1);
                                    jSONObject4.put("view_height_layout_type", l(layoutParams.height) - 1);
                                }
                                if (((Boolean) pla.c().a(mpa.P7)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject4.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (((Boolean) pla.c().a(mpa.Q7)).booleanValue() && scaleType != null) {
                                    jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject4.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject4.put("font_size", textView.getTextSize());
                                    jSONObject4.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    jSONObject = jSONObject6;
                                    fgb.g("Unable to get asset views information");
                                    it2 = it3;
                                    jSONObject3 = jSONObject;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            jSONObject = jSONObject6;
                            try {
                                jSONObject.put((String) entry.getKey(), jSONObject4);
                            } catch (JSONException unused2) {
                                fgb.g("Unable to get asset views information");
                                it2 = it3;
                                jSONObject3 = jSONObject;
                                str3 = str;
                                str4 = str2;
                            }
                        } catch (JSONException unused3) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (JSONException unused4) {
                        str = str3;
                        str2 = str4;
                        jSONObject = jSONObject3;
                    }
                    it2 = it3;
                    jSONObject3 = jSONObject;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject3;
    }

    public static JSONObject e(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                dyf.r();
                jSONObject.put("can_show_on_lock_screen", wxf.P(view));
                dyf.r();
                jSONObject.put("is_keyguard_locked", wxf.c(context));
            } catch (JSONException unused) {
                fgb.g("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject f(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) pla.c().a(mpa.M7)).booleanValue()) {
                    dyf.r();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                } else {
                    dyf.r();
                    ViewParent parent2 = view.getParent();
                    while (parent2 != null && !(parent2 instanceof AdapterView)) {
                        parent2 = parent2.getParent();
                    }
                    if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                        r2 = false;
                    }
                    jSONObject.put("contained_in_scroll_view", r2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:16|(9:44|45|19|20|21|(3:23|(1:27)|37)(3:38|(1:40)|37)|28|(2:30|(1:32)(1:35))(1:36)|33)|18|19|20|21|(0)(0)|28|(0)(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0165, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0171, code lost:
    
        defpackage.fgb.e("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016c A[Catch: JSONException -> 0x0165, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0165, blocks: (B:20:0x0136, B:32:0x0161, B:35:0x0167, B:36:0x016c), top: B:19:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0171 -> B:32:0x0176). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject g(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9b.g(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean h(Context context, v0e v0eVar) {
        if (!v0eVar.O) {
            return false;
        }
        if (((Boolean) pla.c().a(mpa.R7)).booleanValue()) {
            return ((Boolean) pla.c().a(mpa.U7)).booleanValue();
        }
        String str = (String) pla.c().a(mpa.S7);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it2 = dhe.c(dge.b(';')).d(str).iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(int i) {
        if (((Boolean) pla.c().a(mpa.n3)).booleanValue()) {
            return ((Boolean) pla.c().a(mpa.o3)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    public static int[] j(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static JSONObject k(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", kia.b().e(context, rect.right - rect.left));
        jSONObject.put("height", kia.b().e(context, rect.bottom - rect.top));
        jSONObject.put(QueryKeys.SCROLL_POSITION_TOP, kia.b().e(context, rect.left));
        jSONObject.put(QueryKeys.CONTENT_HEIGHT, kia.b().e(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int l(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }
}
