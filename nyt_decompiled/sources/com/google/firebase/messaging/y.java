package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class y {
    private final SharedPreferences a;
    private final String b;
    private final String c;
    private final Executor e;
    final ArrayDeque d = new ArrayDeque();
    private boolean f = false;

    private y(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
        this.e = executor;
    }

    private boolean b(boolean z) {
        if (z && !this.f) {
            i();
        }
        return z;
    }

    static y c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        y yVar = new y(sharedPreferences, str, str2, executor);
        yVar.d();
        return yVar;
    }

    private void d() {
        synchronized (this.d) {
            try {
                this.d.clear();
                String string = this.a.getString(this.b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.c)) {
                    String[] split = string.split(this.c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.d) {
            this.a.edit().putString(this.b, g()).commit();
        }
    }

    private void i() {
        this.e.execute(new Runnable() { // from class: com.google.firebase.messaging.x
            @Override // java.lang.Runnable
            public final void run() {
                y.this.h();
            }
        });
    }

    public String e() {
        String str;
        synchronized (this.d) {
            str = (String) this.d.peek();
        }
        return str;
    }

    public boolean f(Object obj) {
        boolean b;
        synchronized (this.d) {
            b = b(this.d.remove(obj));
        }
        return b;
    }

    public String g() {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            sb.append(this.c);
        }
        return sb.toString();
    }
}
