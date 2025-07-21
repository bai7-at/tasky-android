package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.v73;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class b {
    private final SharedPreferences a;

    public b(Context context, String str) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        try {
            long j = this.a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized String d(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it2 = ((Set) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    if (str.equals((String) it2.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void h(String str) {
        try {
            String e = e(str);
            if (e == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.a.getStringSet(e, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.a.edit().remove(e).commit();
            } else {
                this.a.edit().putStringSet(e, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.a.edit();
            for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    edit.remove(entry.getKey());
                }
            }
            edit.remove("fire-count");
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized List c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    arrayList.add(v73.a(entry.getKey(), new ArrayList((Set) entry.getValue())));
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    synchronized boolean f(long j, long j2) {
        return d(j).equals(d(j2));
    }

    synchronized void g() {
        String d = d(System.currentTimeMillis());
        this.a.edit().putString("last-used-date", d).commit();
        h(d);
    }

    synchronized boolean i(long j) {
        return j("fire-global", j);
    }

    synchronized boolean j(String str, long j) {
        if (!this.a.contains(str)) {
            this.a.edit().putLong(str, j).commit();
            return true;
        }
        if (f(this.a.getLong(str, -1L), j)) {
            return false;
        }
        this.a.edit().putLong(str, j).commit();
        return true;
    }

    synchronized void k(long j, String str) {
        try {
            String d = d(j);
            if (this.a.getString("last-used-date", "").equals(d)) {
                return;
            }
            long j2 = this.a.getLong("fire-count", 0L);
            if (j2 + 1 == 30) {
                a();
                j2 = this.a.getLong("fire-count", 0L);
            }
            HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
            hashSet.add(d);
            this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", d).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void l(long j) {
        this.a.edit().putLong("fire-global", j).commit();
    }
}
