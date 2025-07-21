package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i3 {
    private final Object a;

    static class a extends AccessibilityNodeProvider {
        final i3 a;

        a(i3 i3Var) {
            this.a = i3Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            h3 b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.T0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i) {
            List c = this.a.c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((h3) c.get(i2)).T0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            h3 d = this.a.d(i);
            if (d == null) {
                return null;
            }
            return d.T0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.f(i, i2, bundle);
        }
    }

    static class b extends a {
        b(i3 i3Var) {
            super(i3Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, h3.U0(accessibilityNodeInfo), str, bundle);
        }
    }

    public i3() {
        this.a = new b(this);
    }

    public void a(int i, h3 h3Var, String str, Bundle bundle) {
    }

    public h3 b(int i) {
        return null;
    }

    public List c(String str, int i) {
        return null;
    }

    public h3 d(int i) {
        return null;
    }

    public Object e() {
        return this.a;
    }

    public boolean f(int i, int i2, Bundle bundle) {
        return false;
    }

    public i3(Object obj) {
        this.a = obj;
    }
}
