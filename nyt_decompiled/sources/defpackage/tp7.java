package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class tp7 {

    public static class a {
        private final Context a;
        private final Intent b;
        private CharSequence c;
        private ArrayList d;
        private ArrayList e;
        private ArrayList f;
        private ArrayList g;

        public a(Context context) {
            Activity activity;
            this.a = (Context) h16.g(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.b = action;
            action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                this.b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
            }
        }

        private void b(String str, ArrayList arrayList) {
            String[] stringArrayExtra = this.b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.b.putExtra(str, strArr);
        }

        public a a(String str) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(str);
            return this;
        }

        public Intent c() {
            return Intent.createChooser(d(), this.c);
        }

        public Intent d() {
            ArrayList arrayList = this.d;
            if (arrayList != null) {
                b("android.intent.extra.EMAIL", arrayList);
                this.d = null;
            }
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                b("android.intent.extra.CC", arrayList2);
                this.e = null;
            }
            ArrayList arrayList3 = this.f;
            if (arrayList3 != null) {
                b("android.intent.extra.BCC", arrayList3);
                this.f = null;
            }
            ArrayList arrayList4 = this.g;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                this.b.setAction("android.intent.action.SEND");
                ArrayList arrayList5 = this.g;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.b.removeExtra("android.intent.extra.STREAM");
                    this.b.setClipData(null);
                    Intent intent = this.b;
                    intent.setFlags(intent.getFlags() & (-2));
                } else {
                    this.b.putExtra("android.intent.extra.STREAM", (Parcelable) this.g.get(0));
                    tp7.a(this.b, this.g);
                }
            } else {
                this.b.setAction("android.intent.action.SEND_MULTIPLE");
                this.b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.g);
                tp7.a(this.b, this.g);
            }
            return this.b;
        }

        public a e(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public a f(String str) {
            this.b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        public a g(CharSequence charSequence) {
            this.b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        public a h(String str) {
            this.b.setType(str);
            return this;
        }

        public void i() {
            this.a.startActivity(c());
        }
    }

    static void a(Intent intent, ArrayList arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, (Uri) arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new ClipData.Item((Uri) arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}
