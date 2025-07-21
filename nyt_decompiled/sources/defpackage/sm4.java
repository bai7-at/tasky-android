package defpackage;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class sm4 {
    final Bundle a;
    List b;
    List c;

    sm4(Bundle bundle) {
        this.a = bundle;
    }

    public static sm4 d(Bundle bundle) {
        if (bundle != null) {
            return new sm4(bundle);
        }
        return null;
    }

    public boolean a() {
        return this.a.getBoolean("canDisconnect", false);
    }

    void b() {
        if (this.c == null) {
            ArrayList parcelableArrayList = this.a.getParcelableArrayList("controlFilters");
            this.c = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.c = Collections.emptyList();
            }
        }
    }

    void c() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("groupMemberIds");
            this.b = stringArrayList;
            if (stringArrayList == null) {
                this.b = Collections.emptyList();
            }
        }
    }

    public int e() {
        return this.a.getInt("connectionState", 0);
    }

    public List f() {
        b();
        return this.c;
    }

    public String g() {
        return this.a.getString("status");
    }

    public int h() {
        return this.a.getInt("deviceType");
    }

    public Bundle i() {
        return this.a.getBundle("extras");
    }

    public List j() {
        c();
        return this.b;
    }

    public Uri k() {
        String string = this.a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public String l() {
        return this.a.getString("id");
    }

    public int m() {
        return this.a.getInt("maxClientVersion", Integer.MAX_VALUE);
    }

    public int n() {
        return this.a.getInt("minClientVersion", 1);
    }

    public String o() {
        return this.a.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
    }

    public int p() {
        return this.a.getInt("playbackStream", -1);
    }

    public int q() {
        return this.a.getInt("playbackType", 1);
    }

    public int r() {
        return this.a.getInt("presentationDisplayId", -1);
    }

    public IntentSender s() {
        return (IntentSender) this.a.getParcelable("settingsIntent");
    }

    public int t() {
        return this.a.getInt("volume");
    }

    public String toString() {
        return "MediaRouteDescriptor{ id=" + l() + ", groupMemberIds=" + j() + ", name=" + o() + ", description=" + g() + ", iconUri=" + k() + ", isEnabled=" + w() + ", connectionState=" + e() + ", controlFilters=" + Arrays.toString(f().toArray()) + ", playbackType=" + q() + ", playbackStream=" + p() + ", deviceType=" + h() + ", volume=" + t() + ", volumeMax=" + v() + ", volumeHandling=" + u() + ", presentationDisplayId=" + r() + ", extras=" + i() + ", isValid=" + x() + ", minClientVersion=" + n() + ", maxClientVersion=" + m() + " }";
    }

    public int u() {
        return this.a.getInt("volumeHandling", 0);
    }

    public int v() {
        return this.a.getInt("volumeMax");
    }

    public boolean w() {
        return this.a.getBoolean("enabled", true);
    }

    public boolean x() {
        b();
        return (TextUtils.isEmpty(l()) || TextUtils.isEmpty(o()) || this.c.contains(null)) ? false : true;
    }

    public static final class a {
        private final Bundle a;
        private ArrayList b;
        private ArrayList c;

        public a(String str, String str2) {
            this.a = new Bundle();
            m(str);
            n(str2);
        }

        public a a(IntentFilter intentFilter) {
            if (intentFilter == null) {
                throw new IllegalArgumentException("filter must not be null");
            }
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (!this.c.contains(intentFilter)) {
                this.c.add(intentFilter);
            }
            return this;
        }

        public a b(Collection collection) {
            if (collection == null) {
                throw new IllegalArgumentException("filters must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    a((IntentFilter) it2.next());
                }
            }
            return this;
        }

        public a c(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("groupMemberId must not be empty");
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (!this.b.contains(str)) {
                this.b.add(str);
            }
            return this;
        }

        public a d(Collection collection) {
            if (collection == null) {
                throw new IllegalArgumentException("groupMemberIds must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    c((String) it2.next());
                }
            }
            return this;
        }

        public sm4 e() {
            ArrayList<? extends Parcelable> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayList("controlFilters", arrayList);
            }
            ArrayList<String> arrayList2 = this.b;
            if (arrayList2 != null) {
                this.a.putStringArrayList("groupMemberIds", arrayList2);
            }
            return new sm4(this.a);
        }

        public a f(boolean z) {
            this.a.putBoolean("canDisconnect", z);
            return this;
        }

        public a g(int i) {
            this.a.putInt("connectionState", i);
            return this;
        }

        public a h(String str) {
            this.a.putString("status", str);
            return this;
        }

        public a i(int i) {
            this.a.putInt("deviceType", i);
            return this;
        }

        public a j(boolean z) {
            this.a.putBoolean("enabled", z);
            return this;
        }

        public a k(Bundle bundle) {
            this.a.putBundle("extras", bundle);
            return this;
        }

        public a l(Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("iconUri must not be null");
            }
            this.a.putString("iconUri", uri.toString());
            return this;
        }

        public a m(String str) {
            this.a.putString("id", str);
            return this;
        }

        public a n(String str) {
            this.a.putString(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            return this;
        }

        public a o(int i) {
            this.a.putInt("playbackStream", i);
            return this;
        }

        public a p(int i) {
            this.a.putInt("playbackType", i);
            return this;
        }

        public a q(int i) {
            this.a.putInt("presentationDisplayId", i);
            return this;
        }

        public a r(int i) {
            this.a.putInt("volume", i);
            return this;
        }

        public a s(int i) {
            this.a.putInt("volumeHandling", i);
            return this;
        }

        public a t(int i) {
            this.a.putInt("volumeMax", i);
            return this;
        }

        public a(sm4 sm4Var) {
            if (sm4Var != null) {
                this.a = new Bundle(sm4Var.a);
                if (!sm4Var.j().isEmpty()) {
                    this.b = new ArrayList(sm4Var.j());
                }
                if (sm4Var.f().isEmpty()) {
                    return;
                }
                this.c = new ArrayList(sm4Var.c);
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }
    }
}
