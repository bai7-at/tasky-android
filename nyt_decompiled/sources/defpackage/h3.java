package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.k3;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public class h3 {
    private final AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;
        public static final a e = new a(1, null);
        public static final a f = new a(2, null);
        public static final a g = new a(4, null);
        public static final a h = new a(8, null);
        public static final a i = new a(16, null);
        public static final a j = new a(32, null);
        public static final a k = new a(64, null);
        public static final a l = new a(128, null);
        public static final a m = new a(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, (CharSequence) null, k3.b.class);
        public static final a n = new a(512, (CharSequence) null, k3.b.class);
        public static final a o = new a(1024, (CharSequence) null, k3.c.class);
        public static final a p = new a(ProgressEvent.PART_COMPLETED_EVENT_CODE, (CharSequence) null, k3.c.class);
        public static final a q = new a(ProgressEvent.PART_FAILED_EVENT_CODE, null);
        public static final a r = new a(8192, null);
        public static final a s = new a(Http2.INITIAL_MAX_FRAME_SIZE, null);
        public static final a t = new a(32768, null);
        public static final a u = new a(65536, null);
        public static final a v = new a(131072, (CharSequence) null, k3.g.class);
        public static final a w = new a(262144, null);
        public static final a x = new a(524288, null);
        public static final a y = new a(Constants.MB, null);
        public static final a z = new a(2097152, (CharSequence) null, k3.h.class);
        final Object a;
        private final int b;
        private final Class c;
        protected final k3 d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            int i2 = Build.VERSION.SDK_INT;
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, k3.e.class);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            G = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
            H = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
            J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, k3.f.class);
            M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, k3.d.class);
            N = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i2 >= 30) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction = accessibilityAction12;
            } else {
                accessibilityAction = null;
            }
            P = new a(accessibilityAction, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i2 >= 30) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction2 = accessibilityAction11;
            } else {
                accessibilityAction2 = null;
            }
            Q = new a(accessibilityAction2, R.id.accessibilityActionImeEnter, null, null, null);
            if (i2 >= 32) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction3 = accessibilityAction10;
            } else {
                accessibilityAction3 = null;
            }
            R = new a(accessibilityAction3, R.id.accessibilityActionDragStart, null, null, null);
            if (i2 >= 32) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction4 = accessibilityAction9;
            } else {
                accessibilityAction4 = null;
            }
            S = new a(accessibilityAction4, R.id.accessibilityActionDragDrop, null, null, null);
            if (i2 >= 32) {
                accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction5 = accessibilityAction8;
            } else {
                accessibilityAction5 = null;
            }
            T = new a(accessibilityAction5, R.id.accessibilityActionDragCancel, null, null, null);
            if (i2 >= 33) {
                accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction6 = accessibilityAction7;
            } else {
                accessibilityAction6 = null;
            }
            U = new a(accessibilityAction6, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            V = new a(i2 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public a a(CharSequence charSequence, k3 k3Var) {
            return new a(null, this.b, charSequence, k3Var, this.c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.d == null) {
                return false;
            }
            Class cls = this.c;
            if (cls != null) {
                try {
                    lh4.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e2) {
                    Class cls2 = this.c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? Constants.NULL_VERSION_ID : cls2.getName()), e2);
                }
            }
            return this.d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.a;
            return obj2 == null ? aVar.a == null : obj2.equals(aVar.a);
        }

        public int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String h2 = h3.h(this.b);
            if (h2.equals("ACTION_UNKNOWN") && c() != null) {
                h2 = c().toString();
            }
            sb.append(h2);
            return sb.toString();
        }

        public a(int i2, CharSequence charSequence, k3 k3Var) {
            this(null, i2, charSequence, k3Var, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i2, CharSequence charSequence, Class cls) {
            this(null, i2, charSequence, null, cls);
        }

        a(Object obj, int i2, CharSequence charSequence, k3 k3Var, Class cls) {
            this.b = i2;
            this.d = k3Var;
            if (obj == null) {
                this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.a = obj;
            }
            this.c = cls;
        }
    }

    private static class b {
        public static Object a(int i, float f, float f2, float f3) {
            return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static f a(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static h3 b(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
            return h3.V0(accessibilityNodeInfo.getChild(i, i2));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static h3 f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            return h3.V0(accessibilityNodeInfo.getParent(i));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
        }
    }

    public static class e {
        final Object a;

        e(Object obj) {
            this.a = obj;
        }

        public static e a(int i, int i2, boolean z, int i3) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    public static class f {
        final Object a;

        f(Object obj) {
            this.a = obj;
        }

        public static f a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public static class g {
        final Object a;

        g(Object obj) {
            this.a = obj;
        }

        public static g a(int i, float f, float f2, float f3) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }
    }

    public h3(Object obj) {
        this.a = (AccessibilityNodeInfo) obj;
    }

    private boolean C() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public static h3 U() {
        return U0(AccessibilityNodeInfo.obtain());
    }

    public static h3 U0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new h3(accessibilityNodeInfo);
    }

    public static h3 V(h3 h3Var) {
        return U0(AccessibilityNodeInfo.obtain(h3Var.a));
    }

    static h3 V0(Object obj) {
        if (obj != null) {
            return new h3(obj);
        }
        return null;
    }

    public static h3 W(View view) {
        return U0(AccessibilityNodeInfo.obtain(view));
    }

    private List f(String str) {
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String h(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case JceEncryptionConstants.SYMMETRIC_KEY_LENGTH /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case ProgressEvent.PART_COMPLETED_EVENT_CODE /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case ProgressEvent.PART_FAILED_EVENT_CODE /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean j(int i) {
        Bundle t = t();
        return t != null && (t.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public String A() {
        return Build.VERSION.SDK_INT >= 33 ? c.g(this.a) : this.a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void A0(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public String B() {
        return this.a.getViewIdResourceName();
    }

    public void B0(View view, int i) {
        this.b = i;
        this.a.setParent(view, i);
    }

    public void C0(boolean z) {
        this.a.setPassword(z);
    }

    public boolean D() {
        return Build.VERSION.SDK_INT >= 34 ? d.f(this.a) : j(64);
    }

    public void D0(g gVar) {
        this.a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.a);
    }

    public boolean E() {
        return this.a.isCheckable();
    }

    public void E0(CharSequence charSequence) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean F() {
        return this.a.isChecked();
    }

    public void F0(boolean z) {
        this.a.setScreenReaderFocusable(z);
    }

    public boolean G() {
        return this.a.isClickable();
    }

    public void G0(boolean z) {
        this.a.setScrollable(z);
    }

    public boolean H() {
        return this.a.isContextClickable();
    }

    public void H0(boolean z) {
        this.a.setSelected(z);
    }

    public boolean I() {
        return this.a.isEnabled();
    }

    public void I0(boolean z) {
        this.a.setShowingHintText(z);
    }

    public boolean J() {
        return this.a.isFocusable();
    }

    public void J0(View view, int i) {
        this.c = i;
        this.a.setSource(view, i);
    }

    public boolean K() {
        return this.a.isFocused();
    }

    public void K0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.a, charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean L() {
        return j(67108864);
    }

    public void L0(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean M() {
        return this.a.isImportantForAccessibility();
    }

    public void M0(int i, int i2) {
        this.a.setTextSelection(i, i2);
    }

    public boolean N() {
        return this.a.isLongClickable();
    }

    public void N0(View view) {
        this.a.setTraversalAfter(view);
    }

    public boolean O() {
        return this.a.isPassword();
    }

    public void O0(View view, int i) {
        this.a.setTraversalAfter(view, i);
    }

    public boolean P() {
        return this.a.isScrollable();
    }

    public void P0(View view) {
        this.a.setTraversalBefore(view);
    }

    public boolean Q() {
        return this.a.isSelected();
    }

    public void Q0(View view, int i) {
        this.a.setTraversalBefore(view, i);
    }

    public boolean R() {
        return this.a.isShowingHintText();
    }

    public void R0(String str) {
        this.a.setViewIdResourceName(str);
    }

    public boolean S() {
        return Build.VERSION.SDK_INT >= 33 ? c.h(this.a) : j(8388608);
    }

    public void S0(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public boolean T() {
        return this.a.isVisibleToUser();
    }

    public AccessibilityNodeInfo T0() {
        return this.a;
    }

    public boolean X(int i, Bundle bundle) {
        return this.a.performAction(i, bundle);
    }

    public void Y() {
    }

    public void Z(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public void a(int i) {
        this.a.addAction(i);
    }

    public void a0(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public void b(a aVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
    }

    public void b0(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public void c(View view) {
        this.a.addChild(view);
    }

    public void c0(boolean z) {
        this.a.setCheckable(z);
    }

    public void d(View view, int i) {
        this.a.addChild(view, i);
    }

    public void d0(boolean z) {
        this.a.setChecked(z);
    }

    public void e(CharSequence charSequence, View view) {
    }

    public void e0(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (h3Var.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(h3Var.a)) {
            return false;
        }
        return this.c == h3Var.c && this.b == h3Var.b;
    }

    public void f0(boolean z) {
        this.a.setClickable(z);
    }

    public List g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new a(actionList.get(i)));
        }
        return arrayList;
    }

    public void g0(Object obj) {
        this.a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).a);
    }

    public void h0(Object obj) {
        this.a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).a);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public int i() {
        return this.a.getActions();
    }

    public void i0(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public void j0(boolean z) {
        this.a.setContentInvalid(z);
    }

    public void k(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public void k0(boolean z) {
        this.a.setDismissable(z);
    }

    public void l(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public void l0(boolean z) {
        this.a.setEditable(z);
    }

    public void m(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.a, rect);
            return;
        }
        Rect rect2 = (Rect) this.a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void m0(boolean z) {
        this.a.setEnabled(z);
    }

    public int n() {
        return this.a.getChildCount();
    }

    public void n0(CharSequence charSequence) {
        this.a.setError(charSequence);
    }

    public CharSequence o() {
        return this.a.getClassName();
    }

    public void o0(boolean z) {
        this.a.setFocusable(z);
    }

    public void p0(boolean z) {
        this.a.setFocused(z);
    }

    public CharSequence q() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void q0(boolean z) {
        this.a.setHeading(z);
    }

    public CharSequence r() {
        return this.a.getContentDescription();
    }

    public void r0(CharSequence charSequence) {
        this.a.setHintText(charSequence);
    }

    public CharSequence s() {
        return this.a.getError();
    }

    public void s0(boolean z) {
        this.a.setImportantForAccessibility(z);
    }

    public Bundle t() {
        return this.a.getExtras();
    }

    public void t0(View view) {
        this.a.setLabelFor(view);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        sb.append("; boundsInParent: " + rect);
        l(rect);
        sb.append("; boundsInScreen: " + rect);
        m(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(w());
        sb.append("; className: ");
        sb.append(o());
        sb.append("; text: ");
        sb.append(y());
        sb.append("; error: ");
        sb.append(s());
        sb.append("; maxTextLength: ");
        sb.append(u());
        sb.append("; stateDescription: ");
        sb.append(x());
        sb.append("; contentDescription: ");
        sb.append(r());
        sb.append("; tooltipText: ");
        sb.append(z());
        sb.append("; viewIdResName: ");
        sb.append(B());
        sb.append("; uniqueId: ");
        sb.append(A());
        sb.append("; checkable: ");
        sb.append(E());
        sb.append("; checked: ");
        sb.append(F());
        sb.append("; focusable: ");
        sb.append(J());
        sb.append("; focused: ");
        sb.append(K());
        sb.append("; selected: ");
        sb.append(Q());
        sb.append("; clickable: ");
        sb.append(G());
        sb.append("; longClickable: ");
        sb.append(N());
        sb.append("; contextClickable: ");
        sb.append(H());
        sb.append("; enabled: ");
        sb.append(I());
        sb.append("; password: ");
        sb.append(O());
        sb.append("; scrollable: " + P());
        sb.append("; containerTitle: ");
        sb.append(q());
        sb.append("; granularScrollingSupported: ");
        sb.append(L());
        sb.append("; importantForAccessibility: ");
        sb.append(M());
        sb.append("; visible: ");
        sb.append(T());
        sb.append("; isTextSelectable: ");
        sb.append(S());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(D());
        sb.append("; [");
        List g2 = g();
        for (int i = 0; i < g2.size(); i++) {
            a aVar = (a) g2.get(i);
            String h = h(aVar.b());
            if (h.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                h = aVar.c().toString();
            }
            sb.append(h);
            if (i != g2.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int u() {
        return this.a.getMaxTextLength();
    }

    public void u0(int i) {
        this.a.setLiveRegion(i);
    }

    public int v() {
        return this.a.getMovementGranularities();
    }

    public void v0(boolean z) {
        this.a.setLongClickable(z);
    }

    public CharSequence w() {
        return this.a.getPackageName();
    }

    public void w0(int i) {
        this.a.setMaxTextLength(i);
    }

    public CharSequence x() {
        return Build.VERSION.SDK_INT >= 30 ? b.b(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void x0(int i) {
        this.a.setMovementGranularities(i);
    }

    public CharSequence y() {
        if (!C()) {
            return this.a.getText();
        }
        List f2 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List f3 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List f4 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List f5 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        for (int i = 0; i < f2.size(); i++) {
            spannableString.setSpan(new v2(((Integer) f5.get(i)).intValue(), this, t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) f2.get(i)).intValue(), ((Integer) f3.get(i)).intValue(), ((Integer) f4.get(i)).intValue());
        }
        return spannableString;
    }

    public void y0(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public CharSequence z() {
        return this.a.getTooltipText();
    }

    public void z0(CharSequence charSequence) {
        this.a.setPaneTitle(charSequence);
    }

    private h3(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }
}
